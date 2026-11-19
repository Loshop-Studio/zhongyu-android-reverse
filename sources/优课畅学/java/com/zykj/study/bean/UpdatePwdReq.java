package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class UpdatePwdReq {
    public static final int $stable = 8;
    private String oldPassword;
    private String password;

    public UpdatePwdReq(String oldPassword, String password) {
        AbstractC9133u.m16133g(oldPassword, "oldPassword");
        AbstractC9133u.m16133g(password, "password");
        this.oldPassword = oldPassword;
        this.password = password;
    }

    public static /* synthetic */ UpdatePwdReq copy$default(UpdatePwdReq updatePwdReq, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePwdReq.oldPassword;
        }
        if ((i10 & 2) != 0) {
            str2 = updatePwdReq.password;
        }
        return updatePwdReq.copy(str, str2);
    }

    public final String component1() {
        return this.oldPassword;
    }

    public final String component2() {
        return this.password;
    }

    public final UpdatePwdReq copy(String oldPassword, String password) {
        AbstractC9133u.m16133g(oldPassword, "oldPassword");
        AbstractC9133u.m16133g(password, "password");
        return new UpdatePwdReq(oldPassword, password);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePwdReq)) {
            return false;
        }
        UpdatePwdReq updatePwdReq = (UpdatePwdReq) obj;
        return AbstractC9133u.m16128b(this.oldPassword, updatePwdReq.oldPassword) && AbstractC9133u.m16128b(this.password, updatePwdReq.password);
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
        AbstractC9133u.m16133g(str, "<set-?>");
        this.oldPassword = str;
    }

    public final void setPassword(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.password = str;
    }

    public String toString() {
        return "UpdatePwdReq(oldPassword=" + this.oldPassword + ", password=" + this.password + ")";
    }
}
