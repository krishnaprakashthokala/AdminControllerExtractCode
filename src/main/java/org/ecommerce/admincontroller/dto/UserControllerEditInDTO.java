package org.ecommerce.admincontroller.dto;

import org.springframework.ui.Model;

public class UserControllerEditInDTO {
    private Long id;
    private Model model;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}