package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class TokenReq {
    public static final int $stable = 0;
    private final int clientType;
    private final String deviceNumber;

    /* renamed from: im */
    private final boolean f10995im;
    private final String password;
    private final int role;
    private final String smsVerificationCode;
    private final String username;

    public TokenReq(String username, String password, String deviceNumber, int i10, int i11, boolean z10, String smsVerificationCode) {
        AbstractC9133u.m16133g(username, "username");
        AbstractC9133u.m16133g(password, "password");
        AbstractC9133u.m16133g(deviceNumber, "deviceNumber");
        AbstractC9133u.m16133g(smsVerificationCode, "smsVerificationCode");
        this.username = username;
        this.password = password;
        this.deviceNumber = deviceNumber;
        this.role = i10;
        this.clientType = i11;
        this.f10995im = z10;
        this.smsVerificationCode = smsVerificationCode;
    }

    public static /* synthetic */ TokenReq copy$default(TokenReq tokenReq, String str, String str2, String str3, int i10, int i11, boolean z10, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tokenReq.username;
        }
        if ((i12 & 2) != 0) {
            str2 = tokenReq.password;
        }
        if ((i12 & 4) != 0) {
            str3 = tokenReq.deviceNumber;
        }
        if ((i12 & 8) != 0) {
            i10 = tokenReq.role;
        }
        if ((i12 & 16) != 0) {
            i11 = tokenReq.clientType;
        }
        if ((i12 & 32) != 0) {
            z10 = tokenReq.f10995im;
        }
        if ((i12 & 64) != 0) {
            str4 = tokenReq.smsVerificationCode;
        }
        boolean z11 = z10;
        String str5 = str4;
        int i13 = i11;
        String str6 = str3;
        return tokenReq.copy(str, str2, str6, i10, i13, z11, str5);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.deviceNumber;
    }

    public final int component4() {
        return this.role;
    }

    public final int component5() {
        return this.clientType;
    }

    public final boolean component6() {
        return this.f10995im;
    }

    public final String component7() {
        return this.smsVerificationCode;
    }

    public final TokenReq copy(String username, String password, String deviceNumber, int i10, int i11, boolean z10, String smsVerificationCode) {
        AbstractC9133u.m16133g(username, "username");
        AbstractC9133u.m16133g(password, "password");
        AbstractC9133u.m16133g(deviceNumber, "deviceNumber");
        AbstractC9133u.m16133g(smsVerificationCode, "smsVerificationCode");
        return new TokenReq(username, password, deviceNumber, i10, i11, z10, smsVerificationCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenReq)) {
            return false;
        }
        TokenReq tokenReq = (TokenReq) obj;
        return AbstractC9133u.m16128b(this.username, tokenReq.username) && AbstractC9133u.m16128b(this.password, tokenReq.password) && AbstractC9133u.m16128b(this.deviceNumber, tokenReq.deviceNumber) && this.role == tokenReq.role && this.clientType == tokenReq.clientType && this.f10995im == tokenReq.f10995im && AbstractC9133u.m16128b(this.smsVerificationCode, tokenReq.smsVerificationCode);
    }

    public final int getClientType() {
        return this.clientType;
    }

    public final String getDeviceNumber() {
        return this.deviceNumber;
    }

    public final boolean getIm() {
        return this.f10995im;
    }

    public final String getPassword() {
        return this.password;
    }

    public final int getRole() {
        return this.role;
    }

    public final String getSmsVerificationCode() {
        return this.smsVerificationCode;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((((((((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.deviceNumber.hashCode()) * 31) + Integer.hashCode(this.role)) * 31) + Integer.hashCode(this.clientType)) * 31) + Boolean.hashCode(this.f10995im)) * 31) + this.smsVerificationCode.hashCode();
    }

    public String toString() {
        return "TokenReq(username=" + this.username + ", password=" + this.password + ", deviceNumber=" + this.deviceNumber + ", role=" + this.role + ", clientType=" + this.clientType + ", im=" + this.f10995im + ", smsVerificationCode=" + this.smsVerificationCode + ")";
    }

    public /* synthetic */ TokenReq(String str, String str2, String str3, int i10, int i11, boolean z10, String str4, int i12, AbstractC9126n abstractC9126n) {
        this(str, str2, str3, (i12 & 8) != 0 ? 2 : i10, (i12 & 16) != 0 ? 2 : i11, (i12 & 32) != 0 ? false : z10, (i12 & 64) != 0 ? "" : str4);
    }
}
