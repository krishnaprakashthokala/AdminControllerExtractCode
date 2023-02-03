package org.ecommerce.admincontroller.dto;

import org.ecommerce.persistence.models.Product;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.support.SessionStatus;
import javax.servlet.http.HttpServletRequest;

public class ProductControllerProcessInDTO {
    private Product product;
    private BindingResult bindingResult;
    private boolean continueEditing;
    private RedirectAttributes model;
    private SessionStatus sessionStatus;
    private HttpServletRequest request;
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public BindingResult getBindingResult() {
        return bindingResult;
    }

    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }
    
    public boolean getContinueEditing() {
        return continueEditing;
    }

    public void setContinueEditing(boolean continueEditing) {
        this.continueEditing = continueEditing;
    }
    
    public RedirectAttributes getModel() {
        return model;
    }

    public void setModel(RedirectAttributes model) {
        this.model = model;
    }
    
    public SessionStatus getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(SessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
    }
    
    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
    
}