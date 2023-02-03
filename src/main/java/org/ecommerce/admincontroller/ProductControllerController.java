package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.ProductController;

@RestController
@RequestMapping("/productController")
public class ProductControllerController {
    @Autowired
    private ProductController productController;

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductControllerAllOutDTO> all(@RequestBody ProductControllerAllInDTO in) {
        ProductControllerAllOutDTO ret = new ProductControllerAllOutDTO();
        ret.setRetVal(productController.all(in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/process", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductControllerProcessOutDTO> process(@RequestBody ProductControllerProcessInDTO in) {
        ProductControllerProcessOutDTO ret = new ProductControllerProcessOutDTO();
        ret.setRetVal(productController.process(in.getProduct(), in.getBindingResult(), in.getContinueEditing(), in.getModel(), in.getSessionStatus(), in.getRequest()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/report", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductControllerReportOutDTO> report(@RequestBody ProductControllerReportInDTO in) {
        ProductControllerReportOutDTO ret = new ProductControllerReportOutDTO();
        ret.setRetVal(productController.report(in.getFormat(), in.getModelMap(), in.getModelAndView()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductControllerCreateOutDTO> create(@RequestBody ProductControllerCreateInDTO in) {
        ProductControllerCreateOutDTO ret = new ProductControllerCreateOutDTO();
        ret.setRetVal(productController.create(in.getModel()));
        return ResponseEntity.ok(ret);
    }

}