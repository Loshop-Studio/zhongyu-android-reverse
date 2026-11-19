package com.zykj.huiwei.launcher.bean.req;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;", "", "oldPassword", "", HintConstants.AUTOFILL_HINT_PASSWORD, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldPassword", "()Ljava/lang/String;", "setOldPassword", "(Ljava/lang/String;)V", "getPassword", "setPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePwdReq {
    public static final int $stable = 8;
    private String oldPassword;
    private String password;

    public UpdatePwdReq(String oldPassword, String password) {
        Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        Intrinsics.checkNotNullParameter(password, "password");
        this.oldPassword = oldPassword;
        this.password = password;
    }

    public static /* synthetic */ UpdatePwdReq copy$default(UpdatePwdReq updatePwdReq, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = updatePwdReq.oldPassword;
        }
        if ((i6 & 2) != 0) {
            str2 = updatePwdReq.password;
        }
        return updatePwdReq.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOldPassword() {
        return this.oldPassword;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final UpdatePwdReq copy(String oldPassword, String password) {
        Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        Intrinsics.checkNotNullParameter(password, "password");
        return new UpdatePwdReq(oldPassword, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePwdReq)) {
            return false;
        }
        UpdatePwdReq updatePwdReq = (UpdatePwdReq) other;
        return Intrinsics.areEqual(this.oldPassword, updatePwdReq.oldPassword) && Intrinsics.areEqual(this.password, updatePwdReq.password);
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return (this.oldPassword.hashCode() * 31) + this.password.hashCode();
    }

    public final void setOldPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oldPassword = str;
    }

    public final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public String toString() {
        return "UpdatePwdReq(oldPassword=" + this.oldPassword + ", password=" + this.password + ")";
    }
}
