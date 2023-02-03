package org.ecommerce.admincontroller.dto;

import org.ecommerce.web.models.datatables.DataTableProductInput;

public class ProductRestControllerAllInDTO {
    private DataTableProductInput input;
    
    
    public DataTableProductInput getInput() {
        return input;
    }

    public void setInput(DataTableProductInput input) {
        this.input = input;
    }
    
}