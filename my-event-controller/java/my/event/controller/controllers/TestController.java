package my.event.controller.controllers;

import my.event.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import my.event.service.services.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
@RestController
public class TestController extends BaseController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        System.out.println("ciao");
        service.getAll();
        return "ciao";
    }

}
