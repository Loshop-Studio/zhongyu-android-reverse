package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SendSmsReq {
    public static final int $stable = 0;
    private final String loginType;
    private final String mobile;
    private final String schoolCode;

    /* renamed from: sn */
    private final String f10993sn;
    private final long userId;

    public SendSmsReq(String schoolCode, String str, long j10, String str2, String sn) {
        AbstractC9133u.m16133g(schoolCode, "schoolCode");
        AbstractC9133u.m16133g(sn, "sn");
        this.schoolCode = schoolCode;
        this.loginType = str;
        this.userId = j10;
        this.mobile = str2;
        this.f10993sn = sn;
    }

    public static /* synthetic */ SendSmsReq copy$default(SendSmsReq sendSmsReq, String str, String str2, long j10, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sendSmsReq.schoolCode;
        }
        if ((i10 & 2) != 0) {
            str2 = sendSmsReq.loginType;
        }
        if ((i10 & 4) != 0) {
            j10 = sendSmsReq.userId;
        }
        if ((i10 & 8) != 0) {
            str3 = sendSmsReq.mobile;
        }
        if ((i10 & 16) != 0) {
            str4 = sendSmsReq.f10993sn;
        }
        long j11 = j10;
        return sendSmsReq.copy(str, str2, j11, str3, str4);
    }

    public final String component1() {
        return this.schoolCode;
    }

    public final String component2() {
        return this.loginType;
    }

    public final long component3() {
        return this.userId;
    }

    public final String component4() {
        return this.mobile;
    }

    public final String component5() {
        return this.f10993sn;
    }

    public final SendSmsReq copy(String schoolCode, String str, long j10, String str2, String sn) {
        AbstractC9133u.m16133g(schoolCode, "schoolCode");
        AbstractC9133u.m16133g(sn, "sn");
        return new SendSmsReq(schoolCode, str, j10, str2, sn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSmsReq)) {
            return false;
        }
        SendSmsReq sendSmsReq = (SendSmsReq) obj;
        return AbstractC9133u.m16128b(this.schoolCode, sendSmsReq.schoolCode) && AbstractC9133u.m16128b(this.loginType, sendSmsReq.loginType) && this.userId == sendSmsReq.userId && AbstractC9133u.m16128b(this.mobile, sendSmsReq.mobile) && AbstractC9133u.m16128b(this.f10993sn, sendSmsReq.f10993sn);
    }

    public final String getLoginType() {
        return this.loginType;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getSchoolCode() {
        return this.schoolCode;
    }

    public final String getSn() {
        return this.f10993sn;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.schoolCode.hashCode() * 31;
        String str = this.loginType;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.userId)) * 31;
        String str2 = this.mobile;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f10993sn.hashCode();
    }

    public String toString() {
        return "SendSmsReq(schoolCode=" + this.schoolCode + ", loginType=" + this.loginType + ", userId=" + this.userId + ", mobile=" + this.mobile + ", sn=" + this.f10993sn + ")";
    }
}
