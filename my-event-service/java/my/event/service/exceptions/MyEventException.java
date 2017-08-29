package my.event.service.exceptions;

import my.event.service.base.Message;

import java.util.List;
import java.util.function.Function;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public class MyEventException extends Exception {

    private static final long serialVersionUID = -3226928913675782755L;
    private List<Message> errorMessages;
    private Exception exceptionThrowed;

    public MyEventException() {

    }

    public MyEventException(final List<Message> errors) {

    }

    public MyEventException(final Exception e, final List<Message> errors) {
        this.exceptionThrowed = e;
        this.errorMessages = errors;
    }

    public List<Message> getErrorMessages() {
        return errorMessages;
    }

    public Exception getExceptionThrowed() {
        return exceptionThrowed;
    }

    public <T> T handleConvert(Function<MyEventException,T> function) {
        return function.apply(this);
    }
}
