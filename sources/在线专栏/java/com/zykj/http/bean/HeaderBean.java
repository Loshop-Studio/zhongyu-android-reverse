package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class HeaderBean {

    @Nullable
    private final String accessToken;

    @Nullable
    private final String appName;

    @Nullable
    private final String refreshToken;

    @Nullable
    private final String serverUrl;

    @Nullable
    private final String versionCode;

    public HeaderBean() {
        this(null, null, null, null, null, 31, null);
    }

    public HeaderBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.appName = str;
        this.versionCode = str2;
        this.serverUrl = str3;
        this.accessToken = str4;
        this.refreshToken = str5;
    }

    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, String str2, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = headerBean.appName;
        }
        if ((i4 & 2) != 0) {
            str2 = headerBean.versionCode;
        }
        String str6 = str2;
        if ((i4 & 4) != 0) {
            str3 = headerBean.serverUrl;
        }
        String str7 = str3;
        if ((i4 & 8) != 0) {
            str4 = headerBean.accessToken;
        }
        String str8 = str4;
        if ((i4 & 16) != 0) {
            str5 = headerBean.refreshToken;
        }
        return headerBean.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.appName;
    }

    @Nullable
    public final String component2() {
        return this.versionCode;
    }

    @Nullable
    public final String component3() {
        return this.serverUrl;
    }

    @Nullable
    public final String component4() {
        return this.accessToken;
    }

    @Nullable
    public final String component5() {
        return this.refreshToken;
    }

    @NotNull
    public final HeaderBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new HeaderBean(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBean)) {
            return false;
        }
        HeaderBean headerBean = (HeaderBean) obj;
        return C2769l.m9237a(this.appName, headerBean.appName) && C2769l.m9237a(this.versionCode, headerBean.versionCode) && C2769l.m9237a(this.serverUrl, headerBean.serverUrl) && C2769l.m9237a(this.accessToken, headerBean.accessToken) && C2769l.m9237a(this.refreshToken, headerBean.refreshToken);
    }

    @Nullable
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final String getServerUrl() {
        return this.serverUrl;
    }

    @Nullable
    public final String getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        String str = this.appName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.versionCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serverUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.refreshToken;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HeaderBean(appName=" + ((Object) this.appName) + ", versionCode=" + ((Object) this.versionCode) + ", serverUrl=" + ((Object) this.serverUrl) + ", accessToken=" + ((Object) this.accessToken) + ", refreshToken=" + ((Object) this.refreshToken) + ')';
    }

    public /* synthetic */ HeaderBean(String str, String str2, String str3, String str4, String str5, int i4, C2764g c2764g) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5);
    }
}
