package org.ecommerce.admincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.admincontroller.dto.*;
import org.ecommerce.web.admin.converters.StringProductCategoryConverter;

@RestController
@RequestMapping("/stringProductCategoryConverter")
public class StringProductCategoryConverterController {
    @Autowired
    private StringProductCategoryConverter stringProductCategoryConverter;

    @PostMapping(value = "/convert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StringProductCategoryConverterConvertOutDTO> convert(@RequestBody StringProductCategoryConverterConvertInDTO in) {
        StringProductCategoryConverterConvertOutDTO ret = new StringProductCategoryConverterConvertOutDTO();
        ret.setRetVal(stringProductCategoryConverter.convert(in.getPar1()));
        return ResponseEntity.ok(ret);
    }

}