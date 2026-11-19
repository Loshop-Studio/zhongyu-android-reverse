package com.friday.common.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TokenResponse implements Parcelable {
    private final ErrorRemote error;

    @SerializedName(alternate = {"result"}, value = "data")
    private final LoginResp result;
    private final boolean success;
    private final String targetUrl;
    public static final Parcelable.Creator<TokenResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<TokenResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenResponse createFromParcel(Parcel parcel) {
            AbstractC9979u.m20294g(parcel, "parcel");
            return new TokenResponse(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ErrorRemote.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LoginResp.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenResponse[] newArray(int i10) {
            return new TokenResponse[i10];
        }
    }

    public TokenResponse(boolean z10, ErrorRemote errorRemote, LoginResp loginResp, String str) {
        this.success = z10;
        this.error = errorRemote;
        this.result = loginResp;
        this.targetUrl = str;
    }

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, boolean z10, ErrorRemote errorRemote, LoginResp loginResp, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = tokenResponse.success;
        }
        if ((i10 & 2) != 0) {
            errorRemote = tokenResponse.error;
        }
        if ((i10 & 4) != 0) {
            loginResp = tokenResponse.result;
        }
        if ((i10 & 8) != 0) {
            str = tokenResponse.targetUrl;
        }
        return tokenResponse.copy(z10, errorRemote, loginResp, str);
    }

    public final boolean component1() {
        return this.success;
    }

    public final ErrorRemote component2() {
        return this.error;
    }

    public final LoginResp component3() {
        return this.result;
    }

    public final String component4() {
        return this.targetUrl;
    }

    public final TokenResponse copy(boolean z10, ErrorRemote errorRemote, LoginResp loginResp, String str) {
        return new TokenResponse(z10, errorRemote, loginResp, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) obj;
        return this.success == tokenResponse.success && AbstractC9979u.m20289b(this.error, tokenResponse.error) && AbstractC9979u.m20289b(this.result, tokenResponse.result) && AbstractC9979u.m20289b(this.targetUrl, tokenResponse.targetUrl);
    }

    public final ErrorRemote getError() {
        return this.error;
    }

    public final LoginResp getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getTargetUrl() {
        return this.targetUrl;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        ErrorRemote errorRemote = this.error;
        int iHashCode2 = (iHashCode + (errorRemote == null ? 0 : errorRemote.hashCode())) * 31;
        LoginResp loginResp = this.result;
        int iHashCode3 = (iHashCode2 + (loginResp == null ? 0 : loginResp.hashCode())) * 31;
        String str = this.targetUrl;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TokenResponse(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ", targetUrl=" + this.targetUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
        dest.writeInt(this.success ? 1 : 0);
        ErrorRemote errorRemote = this.error;
        if (errorRemote == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            errorRemote.writeToParcel(dest, i10);
        }
        LoginResp loginResp = this.result;
        if (loginResp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loginResp.writeToParcel(dest, i10);
        }
        dest.writeString(this.targetUrl);
    }
}
