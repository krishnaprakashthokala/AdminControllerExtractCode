package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.HomeController;

@RestController
@RequestMapping("/homeController")
public class HomeControllerController {
    @Autowired
    private HomeController homeController;

    @PostMapping(value = "/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HomeControllerShowOutDTO> show(@RequestBody HomeControllerShowInDTO in) {
        HomeControllerShowOutDTO ret = new HomeControllerShowOutDTO();
        ret.setRetVal(homeController.show(in.getModel()));
        return ResponseEntity.ok(ret);
    }

}