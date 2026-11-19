package com.zykj.lib.error.code;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes6.dex */
public final class ErrorCodeHandler {
    public static final ErrorCodeHandler INSTANCE = new ErrorCodeHandler();

    private ErrorCodeHandler() {
    }

    public final ErrorCode getErrorCode(int i10) {
        ErrorCode[] errorCodeArrValues = ErrorCode.values();
        for (int i11 = 0; i11 < 54; i11++) {
            ErrorCode errorCode = errorCodeArrValues[i11];
            if (errorCode.getErrorCodeInfo().getCode() == i10) {
                return errorCode;
            }
        }
        return ErrorCode.DEFAULT_ERROR;
    }
}
