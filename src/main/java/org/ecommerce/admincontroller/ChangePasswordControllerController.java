package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.ChangePasswordController;

@RestController
@RequestMapping("/changePasswordController")
public class ChangePasswordControllerController {
    @Autowired
    private ChangePasswordController changePasswordController;

    @PostMapping(value = "/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChangePasswordControllerShowOutDTO> show(@RequestBody ChangePasswordControllerShowInDTO in) {
        ChangePasswordControllerShowOutDTO ret = new ChangePasswordControllerShowOutDTO();
        ret.setRetVal(changePasswordController.show(in.getUser(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/setAllowedFields", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChangePasswordControllerSetAllowedFieldsOutDTO> setAllowedFields(@RequestBody ChangePasswordControllerSetAllowedFieldsInDTO in) {
        ChangePasswordControllerSetAllowedFieldsOutDTO ret = new ChangePasswordControllerSetAllowedFieldsOutDTO();
        changePasswordController.setAllowedFields(in.getDataBinder());
        return ResponseEntity.ok(ret);
    }

}