package de.hsaa.feign.springopenfeignexample.external;

import de.hsaa.feign.springopenfeignexample.external.model.CatFact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value= "CatFacts", url = "https://catfact.ninja")
public interface CatFacts {

    @RequestMapping(method = RequestMethod.GET, value = "/fact", consumes = "application/json")
    CatFact getFact();
}
