package org.ecommerce.web.services.impl;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.ecommerce.persistence.models.Address;
import org.ecommerce.persistence.models.User;
import org.ecommerce.persistence.repositories.OrderRepository;
import org.ecommerce.persistence.repositories.UserRepository;
import org.ecommerce.web.events.user.ChangePasswordEvent;
import org.ecommerce.web.models.upload.RequestUploadAvatarFile;
import org.ecommerce.web.services.UserService;
import org.ecommerce.web.uploads.UploadStrategy;

/**
 * @author sergio
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UploadStrategy<Long, RequestUploadAvatarFile> uploadAvatarStrategy;
	@Autowired
	private ApplicationEventPublisher publisher;

	@Override
	public void updatePassword(User user) {
		user.setPassword(passwordEncoder.encode(user.getPasswordClear()));
		userRepository.save(user);
		// publish event for another components
		publisher.publishEvent(new ChangePasswordEvent(user.getUsername()));
	}

	@Override
	public void create(User user) {
		user.setPassword(passwordEncoder.encode(user.getPasswordClear()));
		userRepository.save(user);
	}

	@Override
	public void create(User user, MultipartFile avatarFile) {
		// create user
		this.create(user);
		try {
			RequestUploadAvatarFile uploadAvatar = new RequestUploadAvatarFile(user, avatarFile.getSize(),
					avatarFile.getBytes(), avatarFile.getContentType(), avatarFile.getOriginalFilename());
			logger.info(uploadAvatar.toString());
			uploadAvatarStrategy.save(uploadAvatar);
		} catch (IOException ex) {
			logger.error(ex.toString());
		}
	}

	@Override
	public boolean hasAddresses(String username) {
		return userRepository.countAddresses(username) > 0;
	}

	@Override
	public Set<Address> getAddresses(String username) {
		User user = userRepository.findByUsername(username);
		logger.info("Address count: " + user.getAddresses().size());
		return user.getAddresses();
	}

	@Override
	public Long getTotalPurchases(Long id) {
		return orderRepository.countByCustomerId(id);
	}

	@Override
	public Double getTotalSpent(Long id) {
		return orderRepository.getTotalSpentByUser(id);
	}

	@Override
	public Double getTotalSpentThisMonth(Long id) {
		Calendar c = GregorianCalendar.getInstance();
		return orderRepository.getTotalSpentByUserAndMonth(id, c.get(Calendar.MONTH) + 1);
	}

	@Override
	public boolean isAuthenticated() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return false;
		}
		if (authentication instanceof AnonymousAuthenticationToken) {
			return false;
		}
		return authentication.isAuthenticated();
	}

	@Override
	public Long getCurrentUserId() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return user != null ? user.getId() : null;
	}

}
