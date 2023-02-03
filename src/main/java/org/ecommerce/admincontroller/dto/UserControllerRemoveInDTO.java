package org.ecommerce.admincontroller.dto;

import org.ecommerce.persistence.models.User;

public class UserControllerRemoveInDTO {
    private User user;
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}