package org.ecommerce.admincontroller.dto;

import org.ecommerce.persistence.models.User;
import org.springframework.ui.Model;

public class ProfileInformationControllerShowInDTO {
    private User currentUser;
    private Model model;
    
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}