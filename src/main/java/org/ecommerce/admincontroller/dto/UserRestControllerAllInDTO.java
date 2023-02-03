package org.ecommerce.admincontroller.dto;

import org.ecommerce.persistence.models.User;
import org.ecommerce.web.models.datatables.DataTableUserInput;

public class UserRestControllerAllInDTO {
    private User currentUser;
    private DataTableUserInput input;
    
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    public DataTableUserInput getInput() {
        return input;
    }

    public void setInput(DataTableUserInput input) {
        this.input = input;
    }
    
}