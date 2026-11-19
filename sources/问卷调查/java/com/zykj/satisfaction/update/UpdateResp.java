package com.zykj.satisfaction.update;

import androidx.annotation.Keep;
import io.github.inflationx.calligraphy3.BuildConfig;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1011d;

@Keep
/* loaded from: classes.dex */
public final class UpdateResp {
    private ErrorInfo error;
    private UpdateInfo result;
    private boolean success;

    @Keep
    public static final class ErrorInfo {
        private int code;
        private String message = BuildConfig.FLAVOR;

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setMessage(String str) {
            C1011d.m2809e(str, "<set-?>");
            this.message = str;
        }
    }

    @Keep
    public static final class UpdateInfo {
        private boolean forceUpdate;
        private int versionCode;
        private String fileUrl = BuildConfig.FLAVOR;
        private String description = BuildConfig.FLAVOR;

        public final String getDescription() {
            return this.description;
        }

        public final String getFileUrl() {
            return this.fileUrl;
        }

        public final boolean getForceUpdate() {
            return this.forceUpdate;
        }

        public final int getVersionCode() {
            return this.versionCode;
        }

        public final void setDescription(String str) {
            C1011d.m2809e(str, "<set-?>");
            this.description = str;
        }

        public final void setFileUrl(String str) {
            C1011d.m2809e(str, "<set-?>");
            this.fileUrl = str;
        }

        public final void setForceUpdate(boolean z) {
            this.forceUpdate = z;
        }

        public final void setVersionCode(int i) {
            this.versionCode = i;
        }
    }

    public final ErrorInfo getError() {
        return this.error;
    }

    public final UpdateInfo getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setError(ErrorInfo errorInfo) {
        this.error = errorInfo;
    }

    public final void setResult(UpdateInfo updateInfo) {
        this.result = updateInfo;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("UpdateResp(success=");
        sbM2079g.append(this.success);
        sbM2079g.append(", error=");
        sbM2079g.append(this.error);
        sbM2079g.append(", result=");
        sbM2079g.append(this.result);
        sbM2079g.append(')');
        return sbM2079g.toString();
    }
}
