package org.ecommerce.admincontroller.dto;

import javax.servlet.http.HttpServletRequest;

public class SigninControllerLoginInDTO {
    private HttpServletRequest request;
    
    
    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
    
}