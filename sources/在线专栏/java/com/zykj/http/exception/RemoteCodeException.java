package com.zykj.http.exception;

import androidx.annotation.Keep;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.io.IOException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes.dex */
public final class RemoteCodeException extends IOException {

    @NotNull
    private ErrorCodeInfo errorCodeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(@NotNull ErrorCodeInfo errorCodeInfo) {
        super(errorCodeInfo.getMessage());
        C2769l.m9241e(errorCodeInfo, "errorCodeInfo");
        this.errorCodeInfo = errorCodeInfo;
    }

    @NotNull
    public final ErrorCodeInfo getErrorCodeInfo() {
        return this.errorCodeInfo;
    }

    public final void setErrorCodeInfo(@NotNull ErrorCodeInfo errorCodeInfo) {
        C2769l.m9241e(errorCodeInfo, "<set-?>");
        this.errorCodeInfo = errorCodeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(@NotNull ErrorCode errorCode) {
        super(errorCode.getErrorCodeInfo().getMessage());
        C2769l.m9241e(errorCode, "errorCode");
        this.errorCodeInfo = errorCode.getErrorCodeInfo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(@NotNull ErrorCode errorCode, @NotNull Throwable e4) {
        super(errorCode.getErrorCodeInfo().getMessage(), e4);
        C2769l.m9241e(errorCode, "errorCode");
        C2769l.m9241e(e4, "e");
        this.errorCodeInfo = errorCode.getErrorCodeInfo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(@NotNull ErrorCodeInfo code, @NotNull String message) {
        super(message);
        C2769l.m9241e(code, "code");
        C2769l.m9241e(message, "message");
        this.errorCodeInfo = code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(@NotNull ErrorCodeInfo code, @NotNull Throwable e4) {
        super(code.getMessage(), e4);
        C2769l.m9241e(code, "code");
        C2769l.m9241e(e4, "e");
        this.errorCodeInfo = code;
    }
}
