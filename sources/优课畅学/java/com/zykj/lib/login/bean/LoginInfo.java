package com.zykj.lib.login.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class LoginInfo {
    public static final int $stable = 0;
    private final boolean isTeacher;
    private final boolean needChangePwd;
    private final boolean needSendSms;
    private final int passwordStrength;

    public LoginInfo(boolean z10, boolean z11, boolean z12, int i10) {
        this.isTeacher = z10;
        this.needSendSms = z11;
        this.needChangePwd = z12;
        this.passwordStrength = i10;
    }

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, boolean z10, boolean z11, boolean z12, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = loginInfo.isTeacher;
        }
        if ((i11 & 2) != 0) {
            z11 = loginInfo.needSendSms;
        }
        if ((i11 & 4) != 0) {
            z12 = loginInfo.needChangePwd;
        }
        if ((i11 & 8) != 0) {
            i10 = loginInfo.passwordStrength;
        }
        return loginInfo.copy(z10, z11, z12, i10);
    }

    public final boolean component1() {
        return this.isTeacher;
    }

    public final boolean component2() {
        return this.needSendSms;
    }

    public final boolean component3() {
        return this.needChangePwd;
    }

    public final int component4() {
        return this.passwordStrength;
    }

    public final LoginInfo copy(boolean z10, boolean z11, boolean z12, int i10) {
        return new LoginInfo(z10, z11, z12, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        return this.isTeacher == loginInfo.isTeacher && this.needSendSms == loginInfo.needSendSms && this.needChangePwd == loginInfo.needChangePwd && this.passwordStrength == loginInfo.passwordStrength;
    }

    public final boolean getNeedChangePwd() {
        return this.needChangePwd;
    }

    public final boolean getNeedSendSms() {
        return this.needSendSms;
    }

    public final int getPasswordStrength() {
        return this.passwordStrength;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isTeacher) * 31) + Boolean.hashCode(this.needSendSms)) * 31) + Boolean.hashCode(this.needChangePwd)) * 31) + Integer.hashCode(this.passwordStrength);
    }

    public final boolean isTeacher() {
        return this.isTeacher;
    }

    public String toString() {
        return "LoginInfo(isTeacher=" + this.isTeacher + ", needSendSms=" + this.needSendSms + ", needChangePwd=" + this.needChangePwd + ", passwordStrength=" + this.passwordStrength + ")";
    }
}
