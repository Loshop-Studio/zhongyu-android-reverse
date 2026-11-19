package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class HeaderBean {
    private final String accessToken;
    private final String appName;
    private final String refreshToken;
    private final String serverUrl;
    private final String versionCode;

    public HeaderBean() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerBean.appName;
        }
        if ((i10 & 2) != 0) {
            str2 = headerBean.versionCode;
        }
        if ((i10 & 4) != 0) {
            str3 = headerBean.serverUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = headerBean.accessToken;
        }
        if ((i10 & 16) != 0) {
            str5 = headerBean.refreshToken;
        }
        String str6 = str5;
        String str7 = str3;
        return headerBean.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.versionCode;
    }

    public final String component3() {
        return this.serverUrl;
    }

    public final String component4() {
        return this.accessToken;
    }

    public final String component5() {
        return this.refreshToken;
    }

    public final HeaderBean copy(String str, String str2, String str3, String str4, String str5) {
        return new HeaderBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBean)) {
            return false;
        }
        HeaderBean headerBean = (HeaderBean) obj;
        return AbstractC9133u.m16128b(this.appName, headerBean.appName) && AbstractC9133u.m16128b(this.versionCode, headerBean.versionCode) && AbstractC9133u.m16128b(this.serverUrl, headerBean.serverUrl) && AbstractC9133u.m16128b(this.accessToken, headerBean.accessToken) && AbstractC9133u.m16128b(this.refreshToken, headerBean.refreshToken);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

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

    public String toString() {
        return "HeaderBean(appName=" + this.appName + ", versionCode=" + this.versionCode + ", serverUrl=" + this.serverUrl + ", accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ")";
    }

    public HeaderBean(String str, String str2, String str3, String str4, String str5) {
        this.appName = str;
        this.versionCode = str2;
        this.serverUrl = str3;
        this.accessToken = str4;
        this.refreshToken = str5;
    }

    public /* synthetic */ HeaderBean(String str, String str2, String str3, String str4, String str5, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
