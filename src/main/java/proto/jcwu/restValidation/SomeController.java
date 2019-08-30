package proto.jcwu.restValidation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<SomeClass> allRequest(@RequestParam(value = "string") String s,
                                               @RequestParam(value = "long") Long l,
                                               @RequestParam(value = "bool") Boolean b){
        return new ResponseEntity<SomeClass>(new SomeClass(s,l,b), HttpStatus.OK);
    }
}
