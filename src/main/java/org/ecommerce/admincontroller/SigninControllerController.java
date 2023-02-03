package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.SigninController;

@RestController
@RequestMapping("/signinController")
public class SigninControllerController {
    @Autowired
    private SigninController signinController;

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SigninControllerLoginOutDTO> login(@RequestBody SigninControllerLoginInDTO in) {
        SigninControllerLoginOutDTO ret = new SigninControllerLoginOutDTO();
        ret.setRetVal(signinController.login(in.getRequest()));
        return ResponseEntity.ok(ret);
    }

}