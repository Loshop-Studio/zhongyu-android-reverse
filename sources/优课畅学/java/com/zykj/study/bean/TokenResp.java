package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TokenResp implements Parcelable {
    private final String accessToken;
    private final int expireInSeconds;
    private final int refreshExpireInSeconds;
    private final String refreshToken;
    public static final Parcelable.Creator<TokenResp> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<TokenResp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenResp createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new TokenResp(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenResp[] newArray(int i10) {
            return new TokenResp[i10];
        }
    }

    public TokenResp(String accessToken, int i10, String refreshToken, int i11) {
        AbstractC9133u.m16133g(accessToken, "accessToken");
        AbstractC9133u.m16133g(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.expireInSeconds = i10;
        this.refreshToken = refreshToken;
        this.refreshExpireInSeconds = i11;
    }

    public static /* synthetic */ TokenResp copy$default(TokenResp tokenResp, String str, int i10, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tokenResp.accessToken;
        }
        if ((i12 & 2) != 0) {
            i10 = tokenResp.expireInSeconds;
        }
        if ((i12 & 4) != 0) {
            str2 = tokenResp.refreshToken;
        }
        if ((i12 & 8) != 0) {
            i11 = tokenResp.refreshExpireInSeconds;
        }
        return tokenResp.copy(str, i10, str2, i11);
    }

    public final String component1() {
        return this.accessToken;
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

    public final TokenResp copy(String accessToken, int i10, String refreshToken, int i11) {
        AbstractC9133u.m16133g(accessToken, "accessToken");
        AbstractC9133u.m16133g(refreshToken, "refreshToken");
        return new TokenResp(accessToken, i10, refreshToken, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenResp)) {
            return false;
        }
        TokenResp tokenResp = (TokenResp) obj;
        return AbstractC9133u.m16128b(this.accessToken, tokenResp.accessToken) && this.expireInSeconds == tokenResp.expireInSeconds && AbstractC9133u.m16128b(this.refreshToken, tokenResp.refreshToken) && this.refreshExpireInSeconds == tokenResp.refreshExpireInSeconds;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpireInSeconds() {
        return this.expireInSeconds;
    }

    public final int getRefreshExpireInSeconds() {
        return this.refreshExpireInSeconds;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        return (((((this.accessToken.hashCode() * 31) + Integer.hashCode(this.expireInSeconds)) * 31) + this.refreshToken.hashCode()) * 31) + Integer.hashCode(this.refreshExpireInSeconds);
    }

    public String toString() {
        return "TokenResp(accessToken=" + this.accessToken + ", expireInSeconds=" + this.expireInSeconds + ", refreshToken=" + this.refreshToken + ", refreshExpireInSeconds=" + this.refreshExpireInSeconds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeString(this.accessToken);
        dest.writeInt(this.expireInSeconds);
        dest.writeString(this.refreshToken);
        dest.writeInt(this.refreshExpireInSeconds);
    }

    public /* synthetic */ TokenResp(String str, int i10, String str2, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(str, (i12 & 2) != 0 ? -1 : i10, str2, (i12 & 8) != 0 ? -1 : i11);
    }
}
