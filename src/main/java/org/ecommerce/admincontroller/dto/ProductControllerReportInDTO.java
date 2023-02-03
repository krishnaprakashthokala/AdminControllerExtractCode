package org.ecommerce.admincontroller.dto;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class ProductControllerReportInDTO {
    private String format;
    private ModelMap modelMap;
    private ModelAndView modelAndView;
    
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
    public ModelMap getModelMap() {
        return modelMap;
    }

    public void setModelMap(ModelMap modelMap) {
        this.modelMap = modelMap;
    }
    
    public ModelAndView getModelAndView() {
        return modelAndView;
    }

    public void setModelAndView(ModelAndView modelAndView) {
        this.modelAndView = modelAndView;
    }
    
}