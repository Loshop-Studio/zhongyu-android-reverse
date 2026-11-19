package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class SendSmsBean {
    public static final int $stable = 0;
    private final String mobile;
    private final String schoolCode;

    /* renamed from: sn */
    private final String f6034sn;
    private final long userId;

    public SendSmsBean(String schoolCode, long j10, String str, String sn) {
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(sn, "sn");
        this.schoolCode = schoolCode;
        this.userId = j10;
        this.mobile = str;
        this.f6034sn = sn;
    }

    public static /* synthetic */ SendSmsBean copy$default(SendSmsBean sendSmsBean, String str, long j10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sendSmsBean.schoolCode;
        }
        if ((i10 & 2) != 0) {
            j10 = sendSmsBean.userId;
        }
        if ((i10 & 4) != 0) {
            str2 = sendSmsBean.mobile;
        }
        if ((i10 & 8) != 0) {
            str3 = sendSmsBean.f6034sn;
        }
        return sendSmsBean.copy(str, j10, str2, str3);
    }

    public final String component1() {
        return this.schoolCode;
    }

    public final long component2() {
        return this.userId;
    }

    public final String component3() {
        return this.mobile;
    }

    public final String component4() {
        return this.f6034sn;
    }

    public final SendSmsBean copy(String schoolCode, long j10, String str, String sn) {
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(sn, "sn");
        return new SendSmsBean(schoolCode, j10, str, sn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSmsBean)) {
            return false;
        }
        SendSmsBean sendSmsBean = (SendSmsBean) obj;
        return AbstractC9979u.m20289b(this.schoolCode, sendSmsBean.schoolCode) && this.userId == sendSmsBean.userId && AbstractC9979u.m20289b(this.mobile, sendSmsBean.mobile) && AbstractC9979u.m20289b(this.f6034sn, sendSmsBean.f6034sn);
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getSchoolCode() {
        return this.schoolCode;
    }

    public final String getSn() {
        return this.f6034sn;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((this.schoolCode.hashCode() * 31) + Long.hashCode(this.userId)) * 31;
        String str = this.mobile;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6034sn.hashCode();
    }

    public String toString() {
        return "SendSmsBean(schoolCode=" + this.schoolCode + ", userId=" + this.userId + ", mobile=" + this.mobile + ", sn=" + this.f6034sn + ")";
    }
}
