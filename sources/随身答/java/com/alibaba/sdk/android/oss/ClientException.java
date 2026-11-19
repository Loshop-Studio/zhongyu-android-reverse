package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.efs.sdk.base.protocol.file.section.AbsSection;

/* loaded from: classes3.dex */
public class ClientException extends Exception {
    private Boolean canceled;

    public ClientException() {
        this.canceled = Boolean.FALSE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (getCause() == null) {
            return message;
        }
        return getCause().getMessage() + AbsSection.SEP_ORIGIN_LINE_BREAK + message;
    }

    public Boolean isCanceledException() {
        return this.canceled;
    }

    public ClientException(String str) {
        super("[ErrorMessage]: " + str);
        this.canceled = Boolean.FALSE;
    }

    public ClientException(Throwable th) {
        super(th);
        this.canceled = Boolean.FALSE;
    }

    public ClientException(String str, Throwable th) {
        this(str, th, Boolean.FALSE);
    }

    public ClientException(String str, Throwable th, Boolean bool) {
        super("[ErrorMessage]: " + str, th);
        this.canceled = bool;
        OSSLog.logThrowable2Local(this);
    }
}
