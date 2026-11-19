package com.zykj.exception;

import com.zykj.message.client.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class SysException extends GenericException {
    private static final long serialVersionUID = 1;
    private String trace;

    public SysException() {
        this.trace = BuildConfig.FLAVOR;
    }

    public SysException(String str, String str2, Exception exc) {
        super(exc);
        this.trace = BuildConfig.FLAVOR;
        this.errId = str;
        this.errMsg = str2;
        this.errOri = exc;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.errOri.printStackTrace(new PrintStream(byteArrayOutputStream));
        this.errMsgOri = byteArrayOutputStream.toString().trim();
        writeSysException();
    }

    public SysException(String str, Exception exc) {
        super(exc);
        this.trace = BuildConfig.FLAVOR;
        this.errId = str;
        this.errOri = exc;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.errOri.printStackTrace(new PrintStream(byteArrayOutputStream));
        this.errMsgOri = byteArrayOutputStream.toString().trim();
        writeSysException();
    }

    public void appendMsg(String str) {
        this.trace += str;
    }

    public String getTrace() {
        return this.trace;
    }

    @Override // com.zykj.exception.GenericException, java.lang.Throwable
    public String getMessage() {
        return this.errMsg + "[" + this.errMsgOri + "]";
    }

    public void printDebug() {
        this.errOri.printStackTrace();
    }

    private void writeSysException() {
        this.errOri.printStackTrace(new PrintStream(new ByteArrayOutputStream()));
    }
}
