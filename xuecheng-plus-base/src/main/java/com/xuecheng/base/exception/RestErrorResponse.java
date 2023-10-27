package com.xuecheng.base.exception;

import java.io.Serializable;

/**
 * @author maxinkai
 * @date 2023/10/26 16:30
 **/
public class RestErrorResponse implements Serializable {
    private String errMessage;

    public RestErrorResponse(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

}
