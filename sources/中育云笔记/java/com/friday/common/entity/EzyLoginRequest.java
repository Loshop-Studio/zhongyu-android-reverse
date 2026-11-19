package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class EzyLoginRequest {
    public static final int $stable = 0;
    private final int clientType;
    private final String deviceNumber;
    private final String password;
    private final String schoolName;
    private final String smsVerificationCode;
    private final String username;

    public EzyLoginRequest(String schoolName, String username, String password, String deviceNumber, String smsVerificationCode, int i10) {
        AbstractC9979u.m20294g(schoolName, "schoolName");
        AbstractC9979u.m20294g(username, "username");
        AbstractC9979u.m20294g(password, "password");
        AbstractC9979u.m20294g(deviceNumber, "deviceNumber");
        AbstractC9979u.m20294g(smsVerificationCode, "smsVerificationCode");
        this.schoolName = schoolName;
        this.username = username;
        this.password = password;
        this.deviceNumber = deviceNumber;
        this.smsVerificationCode = smsVerificationCode;
        this.clientType = i10;
    }

    public static /* synthetic */ EzyLoginRequest copy$default(EzyLoginRequest ezyLoginRequest, String str, String str2, String str3, String str4, String str5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ezyLoginRequest.schoolName;
        }
        if ((i11 & 2) != 0) {
            str2 = ezyLoginRequest.username;
        }
        if ((i11 & 4) != 0) {
            str3 = ezyLoginRequest.password;
        }
        if ((i11 & 8) != 0) {
            str4 = ezyLoginRequest.deviceNumber;
        }
        if ((i11 & 16) != 0) {
            str5 = ezyLoginRequest.smsVerificationCode;
        }
        if ((i11 & 32) != 0) {
            i10 = ezyLoginRequest.clientType;
        }
        String str6 = str5;
        int i12 = i10;
        return ezyLoginRequest.copy(str, str2, str3, str4, str6, i12);
    }

    public final String component1() {
        return this.schoolName;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.deviceNumber;
    }

    public final String component5() {
        return this.smsVerificationCode;
    }

    public final int component6() {
        return this.clientType;
    }

    public final EzyLoginRequest copy(String schoolName, String username, String password, String deviceNumber, String smsVerificationCode, int i10) {
        AbstractC9979u.m20294g(schoolName, "schoolName");
        AbstractC9979u.m20294g(username, "username");
        AbstractC9979u.m20294g(password, "password");
        AbstractC9979u.m20294g(deviceNumber, "deviceNumber");
        AbstractC9979u.m20294g(smsVerificationCode, "smsVerificationCode");
        return new EzyLoginRequest(schoolName, username, password, deviceNumber, smsVerificationCode, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EzyLoginRequest)) {
            return false;
        }
        EzyLoginRequest ezyLoginRequest = (EzyLoginRequest) obj;
        return AbstractC9979u.m20289b(this.schoolName, ezyLoginRequest.schoolName) && AbstractC9979u.m20289b(this.username, ezyLoginRequest.username) && AbstractC9979u.m20289b(this.password, ezyLoginRequest.password) && AbstractC9979u.m20289b(this.deviceNumber, ezyLoginRequest.deviceNumber) && AbstractC9979u.m20289b(this.smsVerificationCode, ezyLoginRequest.smsVerificationCode) && this.clientType == ezyLoginRequest.clientType;
    }

    public final int getClientType() {
        return this.clientType;
    }

    public final String getDeviceNumber() {
        return this.deviceNumber;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getSchoolName() {
        return this.schoolName;
    }

    public final String getSmsVerificationCode() {
        return this.smsVerificationCode;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((((((this.schoolName.hashCode() * 31) + this.username.hashCode()) * 31) + this.password.hashCode()) * 31) + this.deviceNumber.hashCode()) * 31) + this.smsVerificationCode.hashCode()) * 31) + Integer.hashCode(this.clientType);
    }

    public String toString() {
        return "EzyLoginRequest(schoolName=" + this.schoolName + ", username=" + this.username + ", password=" + this.password + ", deviceNumber=" + this.deviceNumber + ", smsVerificationCode=" + this.smsVerificationCode + ", clientType=" + this.clientType + ")";
    }

    public /* synthetic */ EzyLoginRequest(String str, String str2, String str3, String str4, String str5, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? 2 : i10);
    }
}
