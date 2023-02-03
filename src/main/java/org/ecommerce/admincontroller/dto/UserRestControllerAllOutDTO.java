package org.ecommerce.admincontroller.dto;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.ecommerce.persistence.models.User;

public class UserRestControllerAllOutDTO {
    private DataTablesOutput<User> retVal;
    
    
    public DataTablesOutput<User> getRetVal() {
        return retVal;
    }

    public void setRetVal(DataTablesOutput<User> retVal) {
        this.retVal = retVal;
    }
    
}