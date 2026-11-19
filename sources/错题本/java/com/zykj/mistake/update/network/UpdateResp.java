package com.zykj.mistake.update.network;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/mistake/update/network/UpdateResp;", "", "<init>", "()V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "error", "Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;", "getError", "()Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;", "setError", "(Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;)V", "result", "Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;", "getResult", "()Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;", "setResult", "(Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;)V", "ErrorInfo", "UpdateInfo", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class UpdateResp {
    public static final int $stable = 8;

    @Nullable
    private ErrorInfo error;

    @Nullable
    private UpdateInfo result;
    private boolean success;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;", "", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "code", "", "getCode", "()I", "setCode", "(I)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ErrorInfo {
        public static final int $stable = 8;
        private int code;

        @NotNull
        private String message = "";

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setMessage(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.message = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;", "", "<init>", "()V", "versionCode", "", "getVersionCode", "()I", "setVersionCode", "(I)V", "fileUrl", "", "getFileUrl", "()Ljava/lang/String;", "setFileUrl", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "forceUpdate", "", "getForceUpdate", "()Z", "setForceUpdate", "(Z)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class UpdateInfo {
        public static final int $stable = 8;
        private boolean forceUpdate;
        private int versionCode;

        @NotNull
        private String fileUrl = "";

        @NotNull
        private String description = "";

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getFileUrl() {
            return this.fileUrl;
        }

        public final boolean getForceUpdate() {
            return this.forceUpdate;
        }

        public final int getVersionCode() {
            return this.versionCode;
        }

        public final void setDescription(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.description = str;
        }

        public final void setFileUrl(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.fileUrl = str;
        }

        public final void setForceUpdate(boolean z8) {
            this.forceUpdate = z8;
        }

        public final void setVersionCode(int i) {
            this.versionCode = i;
        }
    }

    @Nullable
    public final ErrorInfo getError() {
        return this.error;
    }

    @Nullable
    public final UpdateInfo getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setError(@Nullable ErrorInfo errorInfo) {
        this.error = errorInfo;
    }

    public final void setResult(@Nullable UpdateInfo updateInfo) {
        this.result = updateInfo;
    }

    public final void setSuccess(boolean z8) {
        this.success = z8;
    }
}
