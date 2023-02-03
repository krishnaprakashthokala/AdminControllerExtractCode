package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.converters.StringAuthorityConverter;

@RestController
@RequestMapping("/stringAuthorityConverter")
public class StringAuthorityConverterController {
    @Autowired
    private StringAuthorityConverter stringAuthorityConverter;

    @PostMapping(value = "/convert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StringAuthorityConverterConvertOutDTO> convert(@RequestBody StringAuthorityConverterConvertInDTO in) {
        StringAuthorityConverterConvertOutDTO ret = new StringAuthorityConverterConvertOutDTO();
        ret.setRetVal(stringAuthorityConverter.convert(in.getPar1()));
        return ResponseEntity.ok(ret);
    }

}