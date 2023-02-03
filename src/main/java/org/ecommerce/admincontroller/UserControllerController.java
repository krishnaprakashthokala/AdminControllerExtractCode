package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.UserController;

@RestController
@RequestMapping("/userController")
public class UserControllerController {
    @Autowired
    private UserController userController;

    @PostMapping(value = "/remove", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerRemoveOutDTO> remove(@RequestBody UserControllerRemoveInDTO in) {
        UserControllerRemoveOutDTO ret = new UserControllerRemoveOutDTO();
        ret.setRetVal(userController.remove(in.getId(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerCreateOutDTO> create(@RequestBody UserControllerCreateInDTO in) {
        UserControllerCreateOutDTO ret = new UserControllerCreateOutDTO();
        ret.setRetVal(userController.create(in.getAvatarFile(), in.getUser(), in.getBindingResult(), in.getContinueEditing(), in.getModel(), in.getSessionStatus(), in.getRequest()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerAllOutDTO> all(@RequestBody UserControllerAllInDTO in) {
        UserControllerAllOutDTO ret = new UserControllerAllOutDTO();
        ret.setRetVal(userController.all(in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/edit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerEditOutDTO> edit(@RequestBody UserControllerEditInDTO in) {
        UserControllerEditOutDTO ret = new UserControllerEditOutDTO();
        ret.setRetVal(userController.edit(in.getId(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/remove", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerRemoveOutDTO> remove(@RequestBody UserControllerRemoveInDTO in) {
        UserControllerRemoveOutDTO ret = new UserControllerRemoveOutDTO();
        ret.setRetVal(userController.remove(in.getUser()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/self", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerSelfOutDTO> self(@RequestBody UserControllerSelfInDTO in) {
        UserControllerSelfOutDTO ret = new UserControllerSelfOutDTO();
        ret.setRetVal(userController.self(in.getCurrentUser(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserControllerCreateOutDTO> create(@RequestBody UserControllerCreateInDTO in) {
        UserControllerCreateOutDTO ret = new UserControllerCreateOutDTO();
        ret.setRetVal(userController.create(in.getModel()));
        return ResponseEntity.ok(ret);
    }

}