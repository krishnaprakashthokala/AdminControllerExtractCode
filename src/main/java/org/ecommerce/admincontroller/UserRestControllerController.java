package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.rest.UserRestController;

@RestController
@RequestMapping("/userRestController")
public class UserRestControllerController {
    @Autowired
    private UserRestController userRestController;

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserRestControllerAllOutDTO> all(@RequestBody UserRestControllerAllInDTO in) {
        UserRestControllerAllOutDTO ret = new UserRestControllerAllOutDTO();
        ret.setRetVal(userRestController.all(in.getCurrentUser(), in.getInput()));
        return ResponseEntity.ok(ret);
    }

}