package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.rest.ProductRestController;

@RestController
@RequestMapping("/productRestController")
public class ProductRestControllerController {
    @Autowired
    private ProductRestController productRestController;

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductRestControllerAllOutDTO> all(@RequestBody ProductRestControllerAllInDTO in) {
        ProductRestControllerAllOutDTO ret = new ProductRestControllerAllOutDTO();
        ret.setRetVal(productRestController.all(in.getInput()));
        return ResponseEntity.ok(ret);
    }

}