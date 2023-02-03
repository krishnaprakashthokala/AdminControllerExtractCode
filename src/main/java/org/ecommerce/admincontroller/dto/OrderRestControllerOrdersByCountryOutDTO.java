package org.ecommerce.admincontroller.dto;

import java.util.List;
import org.ecommerce.persistence.projection.OrdersByCountry;

public class OrderRestControllerOrdersByCountryOutDTO {
    private List<OrdersByCountry> retVal;
    
    
    public List<OrdersByCountry> getRetVal() {
        return retVal;
    }

    public void setRetVal(List<OrdersByCountry> retVal) {
        this.retVal = retVal;
    }
    
}