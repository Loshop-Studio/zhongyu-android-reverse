package com.zykj.subscriber.entity.resp;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public class ApiResp {

    @Nullable
    private ErrorInfo error;
    private boolean success;

    public static class ErrorInfo {
        private int code;

        @Nullable
        private String message;

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public final void setCode(int i4) {
            this.code = i4;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }
    }

    @Nullable
    public final ErrorInfo getError() {
        return this.error;
    }

    @Nullable
    public final Integer getErrorCode() {
        ErrorInfo errorInfo = this.error;
        if (errorInfo == null) {
            return null;
        }
        return Integer.valueOf(errorInfo.getCode());
    }

    @Nullable
    public final String getErrorMessage() {
        ErrorInfo errorInfo = this.error;
        if (errorInfo == null) {
            return null;
        }
        return errorInfo.getMessage();
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setError(@Nullable ErrorInfo errorInfo) {
        this.error = errorInfo;
    }

    public final void setSuccess(boolean z3) {
        this.success = z3;
    }
}
