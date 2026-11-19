package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.download.OssUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006."}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/Credential;", "", "strategy", "", "appId", OssUtils.OSS_BUCKET, OssUtils.OSS_ENDPOINT, "accessKeyId", "accessKeySecret", "securityToken", "expiration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStrategy", "()Ljava/lang/String;", "setStrategy", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getBucket", "setBucket", "getEndpoint", "setEndpoint", "getAccessKeyId", "setAccessKeyId", "getAccessKeySecret", "setAccessKeySecret", "getSecurityToken", "setSecurityToken", "getExpiration", "setExpiration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Credential {
    public static final int $stable = 8;
    private String accessKeyId;
    private String accessKeySecret;
    private String appId;
    private String bucket;
    private String endpoint;
    private String expiration;
    private String securityToken;
    private String strategy;

    public Credential() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Credential copy$default(Credential credential, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = credential.strategy;
        }
        if ((i6 & 2) != 0) {
            str2 = credential.appId;
        }
        if ((i6 & 4) != 0) {
            str3 = credential.bucket;
        }
        if ((i6 & 8) != 0) {
            str4 = credential.endpoint;
        }
        if ((i6 & 16) != 0) {
            str5 = credential.accessKeyId;
        }
        if ((i6 & 32) != 0) {
            str6 = credential.accessKeySecret;
        }
        if ((i6 & 64) != 0) {
            str7 = credential.securityToken;
        }
        if ((i6 & 128) != 0) {
            str8 = credential.expiration;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return credential.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStrategy() {
        return this.strategy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecurityToken() {
        return this.securityToken;
    }

    /* renamed from: component8, reason: from getter */
    public final String getExpiration() {
        return this.expiration;
    }

    public final Credential copy(String strategy, String appId, String bucket, String endpoint, String accessKeyId, String accessKeySecret, String securityToken, String expiration) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(accessKeyId, "accessKeyId");
        Intrinsics.checkNotNullParameter(accessKeySecret, "accessKeySecret");
        Intrinsics.checkNotNullParameter(securityToken, "securityToken");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        return new Credential(strategy, appId, bucket, endpoint, accessKeyId, accessKeySecret, securityToken, expiration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) other;
        return Intrinsics.areEqual(this.strategy, credential.strategy) && Intrinsics.areEqual(this.appId, credential.appId) && Intrinsics.areEqual(this.bucket, credential.bucket) && Intrinsics.areEqual(this.endpoint, credential.endpoint) && Intrinsics.areEqual(this.accessKeyId, credential.accessKeyId) && Intrinsics.areEqual(this.accessKeySecret, credential.accessKeySecret) && Intrinsics.areEqual(this.securityToken, credential.securityToken) && Intrinsics.areEqual(this.expiration, credential.expiration);
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getExpiration() {
        return this.expiration;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return (((((((((((((this.strategy.hashCode() * 31) + this.appId.hashCode()) * 31) + this.bucket.hashCode()) * 31) + this.endpoint.hashCode()) * 31) + this.accessKeyId.hashCode()) * 31) + this.accessKeySecret.hashCode()) * 31) + this.securityToken.hashCode()) * 31) + this.expiration.hashCode();
    }

    public final void setAccessKeyId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessKeyId = str;
    }

    public final void setAccessKeySecret(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessKeySecret = str;
    }

    public final void setAppId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appId = str;
    }

    public final void setBucket(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bucket = str;
    }

    public final void setEndpoint(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endpoint = str;
    }

    public final void setExpiration(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expiration = str;
    }

    public final void setSecurityToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.securityToken = str;
    }

    public final void setStrategy(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.strategy = str;
    }

    public String toString() {
        return "Credential(strategy=" + this.strategy + ", appId=" + this.appId + ", bucket=" + this.bucket + ", endpoint=" + this.endpoint + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ", expiration=" + this.expiration + ")";
    }

    public Credential(String strategy, String appId, String bucket, String endpoint, String accessKeyId, String accessKeySecret, String securityToken, String expiration) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(accessKeyId, "accessKeyId");
        Intrinsics.checkNotNullParameter(accessKeySecret, "accessKeySecret");
        Intrinsics.checkNotNullParameter(securityToken, "securityToken");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        this.strategy = strategy;
        this.appId = appId;
        this.bucket = bucket;
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
        this.expiration = expiration;
    }

    public /* synthetic */ Credential(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? "" : str5, (i6 & 32) != 0 ? "" : str6, (i6 & 64) != 0 ? "" : str7, (i6 & 128) != 0 ? "" : str8);
    }
}
