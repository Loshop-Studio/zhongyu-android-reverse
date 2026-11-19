package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7880d2 = {"Lcom/zykj/lib/error/code/ErrorCodeHandler;", "", "()V", "getErrorCode", "Lcom/zykj/lib/error/code/ErrorCode;", "code", "", "code_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ErrorCodeHandler {
    public static final ErrorCodeHandler INSTANCE = new ErrorCodeHandler();

    private ErrorCodeHandler() {
    }

    public final ErrorCode getErrorCode(int code) {
        ErrorCode[] errorCodeArrValues = ErrorCode.values();
        for (int i6 = 0; i6 < 54; i6++) {
            ErrorCode errorCode = errorCodeArrValues[i6];
            if (errorCode.getErrorCodeInfo().getCode() == code) {
                return errorCode;
            }
        }
        return ErrorCode.DEFAULT_ERROR;
    }
}
