package org.ecommerce.admincontroller.dto;

import org.springframework.web.servlet.ModelAndView;

public class ProductControllerReportOutDTO {
    private ModelAndView retVal;
    
    
    public ModelAndView getRetVal() {
        return retVal;
    }

    public void setRetVal(ModelAndView retVal) {
        this.retVal = retVal;
    }
    
}