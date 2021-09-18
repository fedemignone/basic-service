package rest.service.mignone.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping(path = "v1/person")
    public Personv1 personV1(){
        return new Personv1("Bob Charlie");
    }

    @GetMapping(path = "v2/person")
    public Personv2 personV2(){
        return new Personv2(new Name("Bob", "Marley"));
    }
}
