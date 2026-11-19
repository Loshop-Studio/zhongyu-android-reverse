package com.zykj.http.exception;

import androidx.annotation.Keep;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/http/exception/RemoteCodeException;", "Ljava/io/IOException;", "errorCodeInfo", "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "<init>", "(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V", "errorCode", "Lcom/zykj/lib/error/code/ErrorCode;", "(Lcom/zykj/lib/error/code/ErrorCode;)V", "e", "", "(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V", "code", "message", "", "(Lcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/String;)V", "(Lcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Throwable;)V", "getErrorCodeInfo", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "setErrorCodeInfo", "http_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class RemoteCodeException extends IOException {
    private ErrorCodeInfo errorCodeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCodeInfo errorCodeInfo) {
        super(errorCodeInfo.getMessage());
        Intrinsics.checkNotNullParameter(errorCodeInfo, "errorCodeInfo");
        this.errorCodeInfo = errorCodeInfo;
    }

    public final ErrorCodeInfo getErrorCodeInfo() {
        return this.errorCodeInfo;
    }

    public final void setErrorCodeInfo(ErrorCodeInfo errorCodeInfo) {
        Intrinsics.checkNotNullParameter(errorCodeInfo, "<set-?>");
        this.errorCodeInfo = errorCodeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCode errorCode) {
        super(errorCode.getErrorCodeInfo().getMessage());
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.errorCodeInfo = errorCode.getErrorCodeInfo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCode errorCode, Throwable e10) {
        super(errorCode.getErrorCodeInfo().getMessage(), e10);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(e10, "e");
        this.errorCodeInfo = errorCode.getErrorCodeInfo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCodeInfo code, String message) {
        super(message);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.errorCodeInfo = code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCodeException(ErrorCodeInfo code, Throwable e10) {
        super(code.getMessage(), e10);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(e10, "e");
        this.errorCodeInfo = code;
    }
}
