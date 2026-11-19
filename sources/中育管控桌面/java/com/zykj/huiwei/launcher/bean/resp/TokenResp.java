package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006 "}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;", "", "accessToken", "", "expireInSeconds", "", "refreshToken", "refreshExpireInSeconds", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getExpireInSeconds", "()I", "setExpireInSeconds", "(I)V", "getRefreshToken", "setRefreshToken", "getRefreshExpireInSeconds", "setRefreshExpireInSeconds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TokenResp {
    public static final int $stable = 8;
    private String accessToken;
    private int expireInSeconds;
    private int refreshExpireInSeconds;
    private String refreshToken;

    public TokenResp(String accessToken, int i6, String refreshToken, int i7) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.expireInSeconds = i6;
        this.refreshToken = refreshToken;
        this.refreshExpireInSeconds = i7;
    }

    public static /* synthetic */ TokenResp copy$default(TokenResp tokenResp, String str, int i6, String str2, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = tokenResp.accessToken;
        }
        if ((i8 & 2) != 0) {
            i6 = tokenResp.expireInSeconds;
        }
        if ((i8 & 4) != 0) {
            str2 = tokenResp.refreshToken;
        }
        if ((i8 & 8) != 0) {
            i7 = tokenResp.refreshExpireInSeconds;
        }
        return tokenResp.copy(str, i6, str2, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpireInSeconds() {
        return this.expireInSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRefreshExpireInSeconds() {
        return this.refreshExpireInSeconds;
    }

    public final TokenResp copy(String accessToken, int expireInSeconds, String refreshToken, int refreshExpireInSeconds) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        return new TokenResp(accessToken, expireInSeconds, refreshToken, refreshExpireInSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenResp)) {
            return false;
        }
        TokenResp tokenResp = (TokenResp) other;
        return Intrinsics.areEqual(this.accessToken, tokenResp.accessToken) && this.expireInSeconds == tokenResp.expireInSeconds && Intrinsics.areEqual(this.refreshToken, tokenResp.refreshToken) && this.refreshExpireInSeconds == tokenResp.refreshExpireInSeconds;
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

    public final void setAccessToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setExpireInSeconds(int i6) {
        this.expireInSeconds = i6;
    }

    public final void setRefreshExpireInSeconds(int i6) {
        this.refreshExpireInSeconds = i6;
    }

    public final void setRefreshToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refreshToken = str;
    }

    public String toString() {
        return "TokenResp(accessToken=" + this.accessToken + ", expireInSeconds=" + this.expireInSeconds + ", refreshToken=" + this.refreshToken + ", refreshExpireInSeconds=" + this.refreshExpireInSeconds + ")";
    }
}
