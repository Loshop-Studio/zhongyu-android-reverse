package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes.dex */
public final class ErrorCodeHandler {

    @NotNull
    public static final ErrorCodeHandler INSTANCE = new ErrorCodeHandler();

    private ErrorCodeHandler() {
    }

    @NotNull
    public final ErrorCode getErrorCode(int i4) {
        ErrorCode[] errorCodeArrValues = ErrorCode.values();
        for (int i5 = 0; i5 < 54; i5++) {
            ErrorCode errorCode = errorCodeArrValues[i5];
            if (errorCode.getErrorCodeInfo().getCode() == i4) {
                return errorCode;
            }
        }
        return ErrorCode.DEFAULT_ERROR;
    }
}
