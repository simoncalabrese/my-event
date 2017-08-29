package my.event.controller.controllers;

import my.event.controller.base.BaseController;
import my.event.service.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@RestController
@RequestMapping("/client")
public class ClientController extends BaseController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public void register() {
        clientService.register();
    }
}
