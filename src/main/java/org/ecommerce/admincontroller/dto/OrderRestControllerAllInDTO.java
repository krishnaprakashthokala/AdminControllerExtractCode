package org.ecommerce.admincontroller.dto;

import org.ecommerce.web.models.datatables.DataTableOrderInput;

public class OrderRestControllerAllInDTO {
    private DataTableOrderInput input;
    
    
    public DataTableOrderInput getInput() {
        return input;
    }

    public void setInput(DataTableOrderInput input) {
        this.input = input;
    }
    
}