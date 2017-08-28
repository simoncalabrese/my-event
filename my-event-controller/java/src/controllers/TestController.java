package src.controllers;

import src.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController extends BaseController {

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public String test() {
        return "ciao";
    }

}
