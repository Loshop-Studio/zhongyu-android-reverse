package com.zykj.http.exception;

import androidx.annotation.Keep;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class RemoteCodeException extends IOException {
    private ErrorCodeInfo errorCodeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCodeInfo errorCodeInfo) {
        super(errorCodeInfo.getMessage());
        AbstractC9133u.m16133g(errorCodeInfo, "errorCodeInfo");
        this.errorCodeInfo = errorCodeInfo;
    }

    public final ErrorCodeInfo getErrorCodeInfo() {
        return this.errorCodeInfo;
    }

    public final void setErrorCodeInfo(ErrorCodeInfo errorCodeInfo) {
        AbstractC9133u.m16133g(errorCodeInfo, "<set-?>");
        this.errorCodeInfo = errorCodeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCode errorCode) {
        super(errorCode.getErrorCodeInfo().getMessage());
        AbstractC9133u.m16133g(errorCode, "errorCode");
        this.errorCodeInfo = errorCode.getErrorCodeInfo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCode errorCode, Throwable e10) {
        super(errorCode.getErrorCodeInfo().getMessage(), e10);
        AbstractC9133u.m16133g(errorCode, "errorCode");
        AbstractC9133u.m16133g(e10, "e");
        this.errorCodeInfo = errorCode.getErrorCodeInfo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCodeInfo code, String message) {
        super(message);
        AbstractC9133u.m16133g(code, "code");
        AbstractC9133u.m16133g(message, "message");
        this.errorCodeInfo = code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCodeInfo code, Throwable e10) {
        super(code.getMessage(), e10);
        AbstractC9133u.m16133g(code, "code");
        AbstractC9133u.m16133g(e10, "e");
        this.errorCodeInfo = code;
    }
}
