package com.zykj.http.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/http/bean/HeaderBean;", "", "appName", "", "versionCode", "serverUrl", "accessToken", "refreshToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getVersionCode", "getServerUrl", "getAccessToken", "getRefreshToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeaderBean {
    private final String accessToken;
    private final String appName;
    private final String refreshToken;
    private final String serverUrl;
    private final String versionCode;

    public HeaderBean() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = headerBean.appName;
        }
        if ((i6 & 2) != 0) {
            str2 = headerBean.versionCode;
        }
        if ((i6 & 4) != 0) {
            str3 = headerBean.serverUrl;
        }
        if ((i6 & 8) != 0) {
            str4 = headerBean.accessToken;
        }
        if ((i6 & 16) != 0) {
            str5 = headerBean.refreshToken;
        }
        String str6 = str5;
        String str7 = str3;
        return headerBean.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final HeaderBean copy(String appName, String versionCode, String serverUrl, String accessToken, String refreshToken) {
        return new HeaderBean(appName, versionCode, serverUrl, accessToken, refreshToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderBean)) {
            return false;
        }
        HeaderBean headerBean = (HeaderBean) other;
        return Intrinsics.areEqual(this.appName, headerBean.appName) && Intrinsics.areEqual(this.versionCode, headerBean.versionCode) && Intrinsics.areEqual(this.serverUrl, headerBean.serverUrl) && Intrinsics.areEqual(this.accessToken, headerBean.accessToken) && Intrinsics.areEqual(this.refreshToken, headerBean.refreshToken);
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

    public /* synthetic */ HeaderBean(String str, String str2, String str3, String str4, String str5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5);
    }
}
