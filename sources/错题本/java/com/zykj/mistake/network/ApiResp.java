package com.zykj.mistake.network;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/mistake/network/ApiResp;", "", "<init>", "()V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "unAuthorizedRequest", "getUnAuthorizedRequest", "setUnAuthorizedRequest", "error", "Lcom/zykj/mistake/network/ApiResp$ErrorInfo;", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "errorCode", "", "getErrorCode", "()I", "ErrorInfo", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class ApiResp {
    public static final int $stable = 8;

    @Nullable
    private final ErrorInfo error;
    private boolean success;
    private boolean unAuthorizedRequest;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/mistake/network/ApiResp$ErrorInfo;", "", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "code", "", "getCode", "()I", "setCode", "(I)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ErrorInfo {
        public static final int $stable = 8;
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

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }
    }

    public final int getErrorCode() {
        ErrorInfo errorInfo = this.error;
        if (errorInfo == null || errorInfo.getCode() == 0) {
            return -1;
        }
        return this.error.getCode();
    }

    @NotNull
    public final String getErrorMessage() {
        ErrorInfo errorInfo = this.error;
        if (errorInfo == null || errorInfo.getMessage() == null) {
            return "";
        }
        String message = this.error.getMessage();
        AbstractC5830k.m5327d(message);
        return message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean getUnAuthorizedRequest() {
        return this.unAuthorizedRequest;
    }

    public final void setSuccess(boolean z8) {
        this.success = z8;
    }

    public final void setUnAuthorizedRequest(boolean z8) {
        this.unAuthorizedRequest = z8;
    }
}
