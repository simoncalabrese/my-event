package dto.base;

import java.io.Serializable;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public class Message implements Serializable{
    private static final long serialVersionUID = -7473828756523295394L;
    private String errorCode;
    private String errorDesc;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }
}
