package org.ecommerce.admincontroller.dto;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.ecommerce.persistence.models.Product;

public class ProductRestControllerAllOutDTO {
    private DataTablesOutput<Product> retVal;
    
    
    public DataTablesOutput<Product> getRetVal() {
        return retVal;
    }

    public void setRetVal(DataTablesOutput<Product> retVal) {
        this.retVal = retVal;
    }
    
}