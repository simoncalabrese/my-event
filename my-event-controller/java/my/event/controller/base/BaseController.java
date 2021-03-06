package my.event.controller.base;

import my.event.service.base.BaseDTOImpl;
import my.event.service.exceptions.MyEventException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public abstract class BaseController {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public BaseDTOImpl handleException(HttpServletResponse response, HttpServletResponse request, MyEventException error) {
        System.out.println("ciao");
        return new BaseDTOImpl(error.handleConvert(MyEventException::getErrorMessages));
    }

}
