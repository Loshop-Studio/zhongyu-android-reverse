package com.zykj.exception;

/* loaded from: classes.dex */
public class GenericException extends Exception {
    public static int EXCEPTION_LEVEL_APP = 2;
    public static int EXCEPTION_LEVEL_SYS = 1;
    private static final long serialVersionUID = 1;
    String errId;
    String errMsg;
    String errMsgOri;
    Exception errOri;

    public GenericException() {
    }

    public GenericException(Exception exc) {
        super(exc);
    }

    public void writeLog(int i) {
        int i2 = EXCEPTION_LEVEL_SYS;
    }

    public String getErrId() {
        return this.errId;
    }

    public void setErrId(String str) {
        this.errId = str;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.errMsg;
    }

    public String getErrMsgOri() {
        return this.errMsgOri;
    }

    public Exception getErrOri() {
        return this.errOri;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setErrMsgOri(String str) {
        this.errMsgOri = str;
    }

    public void setErrOri(Exception exc) {
        this.errOri = exc;
    }
}
