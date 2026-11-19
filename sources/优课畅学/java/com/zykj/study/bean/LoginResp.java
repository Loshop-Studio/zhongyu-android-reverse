package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LoginResp implements Parcelable {
    private String accessToken;
    private final String clientCode;
    private int expireInSeconds;
    private final String mobile;
    private final boolean needChangePwd;
    private final boolean needSmsVerification;
    private final int passwordStrength;
    private int refreshExpireInSeconds;
    private String refreshToken;
    private int roleType;
    private final String rongCloudToken;
    private long userId;
    public static final Parcelable.Creator<LoginResp> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<LoginResp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginResp createFromParcel(Parcel parcel) {
            boolean z10;
            AbstractC9133u.m16133g(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            String string3 = parcel.readString();
            long j10 = parcel.readLong();
            int i12 = parcel.readInt();
            String string4 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new LoginResp(string, i10, string2, i11, string3, j10, i12, string4, z11, parcel.readInt() == 0 ? z10 : true, parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginResp[] newArray(int i10) {
            return new LoginResp[i10];
        }
    }

    public LoginResp(String str, int i10, String str2, int i11, String str3, long j10, int i12, String str4, boolean z10, boolean z11, String str5, int i13) {
        this.accessToken = str;
        this.expireInSeconds = i10;
        this.refreshToken = str2;
        this.refreshExpireInSeconds = i11;
        this.rongCloudToken = str3;
        this.userId = j10;
        this.roleType = i12;
        this.mobile = str4;
        this.needChangePwd = z10;
        this.needSmsVerification = z11;
        this.clientCode = str5;
        this.passwordStrength = i13;
    }

    public static /* synthetic */ LoginResp copy$default(LoginResp loginResp, String str, int i10, String str2, int i11, String str3, long j10, int i12, String str4, boolean z10, boolean z11, String str5, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = loginResp.accessToken;
        }
        return loginResp.copy(str, (i14 & 2) != 0 ? loginResp.expireInSeconds : i10, (i14 & 4) != 0 ? loginResp.refreshToken : str2, (i14 & 8) != 0 ? loginResp.refreshExpireInSeconds : i11, (i14 & 16) != 0 ? loginResp.rongCloudToken : str3, (i14 & 32) != 0 ? loginResp.userId : j10, (i14 & 64) != 0 ? loginResp.roleType : i12, (i14 & 128) != 0 ? loginResp.mobile : str4, (i14 & 256) != 0 ? loginResp.needChangePwd : z10, (i14 & 512) != 0 ? loginResp.needSmsVerification : z11, (i14 & 1024) != 0 ? loginResp.clientCode : str5, (i14 & 2048) != 0 ? loginResp.passwordStrength : i13);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final boolean component10() {
        return this.needSmsVerification;
    }

    public final String component11() {
        return this.clientCode;
    }

    public final int component12() {
        return this.passwordStrength;
    }

    public final int component2() {
        return this.expireInSeconds;
    }

    public final String component3() {
        return this.refreshToken;
    }

    public final int component4() {
        return this.refreshExpireInSeconds;
    }

    public final String component5() {
        return this.rongCloudToken;
    }

    public final long component6() {
        return this.userId;
    }

    public final int component7() {
        return this.roleType;
    }

    public final String component8() {
        return this.mobile;
    }

    public final boolean component9() {
        return this.needChangePwd;
    }

    public final LoginResp copy(String str, int i10, String str2, int i11, String str3, long j10, int i12, String str4, boolean z10, boolean z11, String str5, int i13) {
        return new LoginResp(str, i10, str2, i11, str3, j10, i12, str4, z10, z11, str5, i13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResp)) {
            return false;
        }
        LoginResp loginResp = (LoginResp) obj;
        return AbstractC9133u.m16128b(this.accessToken, loginResp.accessToken) && this.expireInSeconds == loginResp.expireInSeconds && AbstractC9133u.m16128b(this.refreshToken, loginResp.refreshToken) && this.refreshExpireInSeconds == loginResp.refreshExpireInSeconds && AbstractC9133u.m16128b(this.rongCloudToken, loginResp.rongCloudToken) && this.userId == loginResp.userId && this.roleType == loginResp.roleType && AbstractC9133u.m16128b(this.mobile, loginResp.mobile) && this.needChangePwd == loginResp.needChangePwd && this.needSmsVerification == loginResp.needSmsVerification && AbstractC9133u.m16128b(this.clientCode, loginResp.clientCode) && this.passwordStrength == loginResp.passwordStrength;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final int getExpireInSeconds() {
        return this.expireInSeconds;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final boolean getNeedChangePwd() {
        return this.needChangePwd;
    }

    public final boolean getNeedSmsVerification() {
        return this.needSmsVerification;
    }

    public final int getPasswordStrength() {
        return this.passwordStrength;
    }

    public final int getRefreshExpireInSeconds() {
        return this.refreshExpireInSeconds;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getRoleType() {
        return this.roleType;
    }

    public final String getRongCloudToken() {
        return this.rongCloudToken;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.expireInSeconds)) * 31;
        String str2 = this.refreshToken;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.refreshExpireInSeconds)) * 31;
        String str3 = this.rongCloudToken;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.userId)) * 31) + Integer.hashCode(this.roleType)) * 31;
        String str4 = this.mobile;
        int iHashCode4 = (((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.needChangePwd)) * 31) + Boolean.hashCode(this.needSmsVerification)) * 31;
        String str5 = this.clientCode;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.passwordStrength);
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setExpireInSeconds(int i10) {
        this.expireInSeconds = i10;
    }

    public final void setRefreshExpireInSeconds(int i10) {
        this.refreshExpireInSeconds = i10;
    }

    public final void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public final void setRoleType(int i10) {
        this.roleType = i10;
    }

    public final void setUserId(long j10) {
        this.userId = j10;
    }

    public String toString() {
        return "LoginResp(accessToken=" + this.accessToken + ", expireInSeconds=" + this.expireInSeconds + ", refreshToken=" + this.refreshToken + ", refreshExpireInSeconds=" + this.refreshExpireInSeconds + ", rongCloudToken=" + this.rongCloudToken + ", userId=" + this.userId + ", roleType=" + this.roleType + ", mobile=" + this.mobile + ", needChangePwd=" + this.needChangePwd + ", needSmsVerification=" + this.needSmsVerification + ", clientCode=" + this.clientCode + ", passwordStrength=" + this.passwordStrength + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeString(this.accessToken);
        dest.writeInt(this.expireInSeconds);
        dest.writeString(this.refreshToken);
        dest.writeInt(this.refreshExpireInSeconds);
        dest.writeString(this.rongCloudToken);
        dest.writeLong(this.userId);
        dest.writeInt(this.roleType);
        dest.writeString(this.mobile);
        dest.writeInt(this.needChangePwd ? 1 : 0);
        dest.writeInt(this.needSmsVerification ? 1 : 0);
        dest.writeString(this.clientCode);
        dest.writeInt(this.passwordStrength);
    }

    public /* synthetic */ LoginResp(String str, int i10, String str2, int i11, String str3, long j10, int i12, String str4, boolean z10, boolean z11, String str5, int i13, int i14, AbstractC9126n abstractC9126n) {
        this(str, i10, str2, i11, str3, (i14 & 32) != 0 ? 0L : j10, (i14 & 64) != 0 ? 0 : i12, str4, (i14 & 256) != 0 ? false : z10, (i14 & 512) != 0 ? false : z11, str5, (i14 & 2048) != 0 ? 1 : i13);
    }
}
