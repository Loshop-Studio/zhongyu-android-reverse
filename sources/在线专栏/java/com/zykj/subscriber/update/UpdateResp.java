package com.zykj.subscriber.update;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class UpdateResp {

    @Nullable
    private ErrorInfo error;

    @Nullable
    private UpdateInfo result;
    private boolean success;

    @Keep
    public static final class ErrorInfo {
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

        public final void setCode(int i4) {
            this.code = i4;
        }

        public final void setMessage(@NotNull String str) {
            C2769l.m9241e(str, "<set-?>");
            this.message = str;
        }
    }

    @Keep
    public static final class UpdateInfo {
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
            C2769l.m9241e(str, "<set-?>");
            this.description = str;
        }

        public final void setFileUrl(@NotNull String str) {
            C2769l.m9241e(str, "<set-?>");
            this.fileUrl = str;
        }

        public final void setForceUpdate(boolean z3) {
            this.forceUpdate = z3;
        }

        public final void setVersionCode(int i4) {
            this.versionCode = i4;
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

    public final void setSuccess(boolean z3) {
        this.success = z3;
    }

    @NotNull
    public String toString() {
        return "UpdateResp(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ')';
    }
}
