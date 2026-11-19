package com.taobao.accs;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class AccsException extends Exception {
    private int mErrorCode;

    public AccsException(int i4) {
        this.mErrorCode = i4;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printStream);
    }

    public AccsException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printWriter);
    }

    public AccsException(String str, int i4) {
        super(str);
        this.mErrorCode = i4;
    }

    public AccsException(String str, Throwable th, int i4) {
        super(str, th);
        this.mErrorCode = i4;
    }

    public AccsException(Throwable th, int i4) {
        super(th);
        this.mErrorCode = i4;
    }
}
