package org.ecommerce.admincontroller.dto;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.ecommerce.persistence.models.Order;

public class OrderRestControllerAllOutDTO {
    private DataTablesOutput<Order> retVal;
    
    
    public DataTablesOutput<Order> getRetVal() {
        return retVal;
    }

    public void setRetVal(DataTablesOutput<Order> retVal) {
        this.retVal = retVal;
    }
    
}