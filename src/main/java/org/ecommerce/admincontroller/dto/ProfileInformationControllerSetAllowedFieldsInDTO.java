package org.ecommerce.admincontroller.dto;

import org.springframework.web.bind.WebDataBinder;

public class ProfileInformationControllerSetAllowedFieldsInDTO {
    private WebDataBinder dataBinder;
    
    
    public WebDataBinder getDataBinder() {
        return dataBinder;
    }

    public void setDataBinder(WebDataBinder dataBinder) {
        this.dataBinder = dataBinder;
    }
    
}