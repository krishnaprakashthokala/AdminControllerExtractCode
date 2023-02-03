package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.controllers.ProfileInformationController;

@RestController
@RequestMapping("/profileInformationController")
public class ProfileInformationControllerController {
    @Autowired
    private ProfileInformationController profileInformationController;

    @PostMapping(value = "/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProfileInformationControllerShowOutDTO> show(@RequestBody ProfileInformationControllerShowInDTO in) {
        ProfileInformationControllerShowOutDTO ret = new ProfileInformationControllerShowOutDTO();
        ret.setRetVal(profileInformationController.show(in.getCurrentUser(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/setAllowedFields", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProfileInformationControllerSetAllowedFieldsOutDTO> setAllowedFields(@RequestBody ProfileInformationControllerSetAllowedFieldsInDTO in) {
        ProfileInformationControllerSetAllowedFieldsOutDTO ret = new ProfileInformationControllerSetAllowedFieldsOutDTO();
        profileInformationController.setAllowedFields(in.getDataBinder());
        return ResponseEntity.ok(ret);
    }

}