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

    @GetMapping(path = "person/param", params="version=1")
    public Personv1 paramV1(){
        return new Personv1("Bob Charlie");
    }

    @GetMapping(path = "person/param", params="version=2")
    public Personv2 paramV2(){
        return new Personv2(new Name("Bob", "Marley"));
    }

    @GetMapping(path = "person/header", headers="X-API-VERSION=1")
    public Personv1 headerV1(){
        return new Personv1("Bob Charlie");
    }

    @GetMapping(path = "person/header", headers="X-API-VERSION=2")
    public Personv2 hedaerV2(){
        return new Personv2(new Name("Bob", "Marley"));
    }

    @GetMapping(path = "person/produces", produces="application/vnd.company.app-v1+json")
    public Personv1 producersV1(){
        return new Personv1("Bob Charlie");
    }

    @GetMapping(path = "person/produces", produces="application/vnd.company.app-v2+json")
    public Personv1 producersV2(){
        return new Personv1("Bob Charlie");
    }
}
