package src.base;

import dto.base.BaseDTO;
import dto.base.BaseDTOImpl;
import exceptions.MyEventException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public abstract class BaseController {

    @ResponseBody
    @ExceptionHandler(MyEventException.class)
    public BaseDTO handleException(HttpServletResponse response, HttpServletResponse request, MyEventException error) {
        return new BaseDTOImpl(error.handleConvert(MyEventException::getErrorMessages));
    }

}
