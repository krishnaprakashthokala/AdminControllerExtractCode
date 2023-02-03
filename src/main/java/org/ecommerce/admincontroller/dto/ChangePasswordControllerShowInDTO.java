package org.ecommerce.admincontroller.dto;

import org.ecommerce.persistence.models.User;
import org.springframework.ui.Model;

public class ChangePasswordControllerShowInDTO {
    private User user;
    private Model model;
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}