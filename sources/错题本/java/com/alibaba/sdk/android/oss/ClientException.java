package com.alibaba.sdk.android.oss;

import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* loaded from: classes2.dex */
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
        return getCause().getMessage() + SignParameters.NEW_LINE + message;
    }

    public Boolean isCanceledException() {
        return this.canceled;
    }

    public ClientException(String str) {
        super(AbstractC0037f.m85j("[ErrorMessage]: ", str));
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
        super(AbstractC0037f.m85j("[ErrorMessage]: ", str), th);
        this.canceled = bool;
        OSSLog.logThrowable2Local(this);
    }
}
