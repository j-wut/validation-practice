package proto.jcwu.restValidation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class SomeController {

    @RequestMapping("/string")
    public SomeClass stringRequest(@RequestParam(value = "string") String s,
                                   @RequestParam(value = "long", required = false) Long l,
                                   @RequestParam(value = "bool", required = false) Boolean b){
        return new SomeClass(s,l,b);
    }

    @RequestMapping("/long")
    public SomeClass longRequest(@RequestParam(value = "string",required = false) String s,
                                   @RequestParam(value = "long") Long l,
                                   @RequestParam(value = "bool", required = false) Boolean b){
        return new SomeClass(s,l,b);
    }

    @RequestMapping("/bool")
    public SomeClass boolRequest(@RequestParam(value = "string", required = false) String s,
                                   @RequestParam(value = "long",required = false) Long l,
                                   @RequestParam(value = "bool") Boolean b){
        return new SomeClass(s,l,b);
    }

    @RequestMapping("/all")
    public SomeClass allRequest(@RequestParam(value = "string") String s,
                                               @RequestParam(value = "long") Long l,
                                               @RequestParam(value = "bool") Boolean b){
        return new SomeClass(s,l,b);
    }

    @RequestMapping("/body")
    public SomeClass jsonRequest(@Valid @RequestBody SomeClass sc){
        return sc;
    }
}
