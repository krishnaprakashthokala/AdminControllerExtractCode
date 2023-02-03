package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.rest.OrderRestController;

@RestController
@RequestMapping("/orderRestController")
public class OrderRestControllerController {
    @Autowired
    private OrderRestController orderRestController;

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderRestControllerAllOutDTO> all(@RequestBody OrderRestControllerAllInDTO in) {
        OrderRestControllerAllOutDTO ret = new OrderRestControllerAllOutDTO();
        ret.setRetVal(orderRestController.all(in.getInput()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/ordersByCountry", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderRestControllerOrdersByCountryOutDTO> ordersByCountry(@RequestBody OrderRestControllerOrdersByCountryInDTO in) {
        OrderRestControllerOrdersByCountryOutDTO ret = new OrderRestControllerOrdersByCountryOutDTO();
        ret.setRetVal(orderRestController.ordersByCountry());
        return ResponseEntity.ok(ret);
    }

}