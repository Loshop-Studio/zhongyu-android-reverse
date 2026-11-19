package com.friday.common.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class LoginResp implements Parcelable {
    private String accessToken;
    private final String clientCode;
    private int expireInSeconds;
    private final String mobile;
    private final boolean needChangePwd;
    private final boolean needSmsVerification;
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
            AbstractC9979u.m20294g(parcel, "parcel");
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
            return new LoginResp(string, i10, string2, i11, string3, j10, i12, string4, z11, parcel.readInt() == 0 ? z10 : true, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginResp[] newArray(int i10) {
            return new LoginResp[i10];
        }
    }

    public LoginResp(String accessToken, int i10, String refreshToken, int i11, String str, long j10, int i12, String str2, boolean z10, boolean z11, String str3) {
        AbstractC9979u.m20294g(accessToken, "accessToken");
        AbstractC9979u.m20294g(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.expireInSeconds = i10;
        this.refreshToken = refreshToken;
        this.refreshExpireInSeconds = i11;
        this.rongCloudToken = str;
        this.userId = j10;
        this.roleType = i12;
        this.mobile = str2;
        this.needChangePwd = z10;
        this.needSmsVerification = z11;
        this.clientCode = str3;
    }

    public static /* synthetic */ LoginResp copy$default(LoginResp loginResp, String str, int i10, String str2, int i11, String str3, long j10, int i12, String str4, boolean z10, boolean z11, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = loginResp.accessToken;
        }
        if ((i13 & 2) != 0) {
            i10 = loginResp.expireInSeconds;
        }
        if ((i13 & 4) != 0) {
            str2 = loginResp.refreshToken;
        }
        if ((i13 & 8) != 0) {
            i11 = loginResp.refreshExpireInSeconds;
        }
        if ((i13 & 16) != 0) {
            str3 = loginResp.rongCloudToken;
        }
        if ((i13 & 32) != 0) {
            j10 = loginResp.userId;
        }
        if ((i13 & 64) != 0) {
            i12 = loginResp.roleType;
        }
        if ((i13 & 128) != 0) {
            str4 = loginResp.mobile;
        }
        if ((i13 & 256) != 0) {
            z10 = loginResp.needChangePwd;
        }
        if ((i13 & 512) != 0) {
            z11 = loginResp.needSmsVerification;
        }
        if ((i13 & 1024) != 0) {
            str5 = loginResp.clientCode;
        }
        String str6 = str5;
        boolean z12 = z10;
        int i14 = i12;
        long j11 = j10;
        int i15 = i11;
        String str7 = str3;
        String str8 = str2;
        return loginResp.copy(str, i10, str8, i15, str7, j11, i14, str4, z12, z11, str6);
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

    public final LoginResp copy(String accessToken, int i10, String refreshToken, int i11, String str, long j10, int i12, String str2, boolean z10, boolean z11, String str3) {
        AbstractC9979u.m20294g(accessToken, "accessToken");
        AbstractC9979u.m20294g(refreshToken, "refreshToken");
        return new LoginResp(accessToken, i10, refreshToken, i11, str, j10, i12, str2, z10, z11, str3);
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
        return AbstractC9979u.m20289b(this.accessToken, loginResp.accessToken) && this.expireInSeconds == loginResp.expireInSeconds && AbstractC9979u.m20289b(this.refreshToken, loginResp.refreshToken) && this.refreshExpireInSeconds == loginResp.refreshExpireInSeconds && AbstractC9979u.m20289b(this.rongCloudToken, loginResp.rongCloudToken) && this.userId == loginResp.userId && this.roleType == loginResp.roleType && AbstractC9979u.m20289b(this.mobile, loginResp.mobile) && this.needChangePwd == loginResp.needChangePwd && this.needSmsVerification == loginResp.needSmsVerification && AbstractC9979u.m20289b(this.clientCode, loginResp.clientCode);
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
        int iHashCode = ((((((this.accessToken.hashCode() * 31) + Integer.hashCode(this.expireInSeconds)) * 31) + this.refreshToken.hashCode()) * 31) + Integer.hashCode(this.refreshExpireInSeconds)) * 31;
        String str = this.rongCloudToken;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.userId)) * 31) + Integer.hashCode(this.roleType)) * 31;
        String str2 = this.mobile;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.needChangePwd)) * 31) + Boolean.hashCode(this.needSmsVerification)) * 31;
        String str3 = this.clientCode;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAccessToken(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setExpireInSeconds(int i10) {
        this.expireInSeconds = i10;
    }

    public final void setRefreshExpireInSeconds(int i10) {
        this.refreshExpireInSeconds = i10;
    }

    public final void setRefreshToken(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setRoleType(int i10) {
        this.roleType = i10;
    }

    public final void setUserId(long j10) {
        this.userId = j10;
    }

    public String toString() {
        return "LoginResp(accessToken=" + this.accessToken + ", expireInSeconds=" + this.expireInSeconds + ", refreshToken=" + this.refreshToken + ", refreshExpireInSeconds=" + this.refreshExpireInSeconds + ", rongCloudToken=" + this.rongCloudToken + ", userId=" + this.userId + ", roleType=" + this.roleType + ", mobile=" + this.mobile + ", needChangePwd=" + this.needChangePwd + ", needSmsVerification=" + this.needSmsVerification + ", clientCode=" + this.clientCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
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
    }

    public /* synthetic */ LoginResp(String str, int i10, String str2, int i11, String str3, long j10, int i12, String str4, boolean z10, boolean z11, String str5, int i13, AbstractC9972n abstractC9972n) {
        this(str, i10, str2, i11, str3, (i13 & 32) != 0 ? 0L : j10, (i13 & 64) != 0 ? 0 : i12, str4, (i13 & 256) != 0 ? false : z10, (i13 & 512) != 0 ? false : z11, str5);
    }
}
