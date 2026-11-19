package com.zykj.student.dialogue.upload;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.download.OssUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006."}, m13413d2 = {"Lcom/zykj/student/dialogue/upload/OssToken;", "", "strategy", "", "appId", OssUtils.OSS_BUCKET, OssUtils.OSS_ENDPOINT, "accessKeyId", "accessKeySecret", "securityToken", "expiration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStrategy", "()Ljava/lang/String;", "setStrategy", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getBucket", "setBucket", "getEndpoint", "setEndpoint", "getAccessKeyId", "setAccessKeyId", "getAccessKeySecret", "setAccessKeySecret", "getSecurityToken", "setSecurityToken", "getExpiration", "setExpiration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class OssToken {
    public static final int $stable = 8;
    private String accessKeyId;
    private String accessKeySecret;
    private String appId;
    private String bucket;
    private String endpoint;
    private String expiration;
    private String securityToken;
    private String strategy;

    public OssToken() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ OssToken copy$default(OssToken ossToken, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = ossToken.strategy;
        }
        if ((i9 & 2) != 0) {
            str2 = ossToken.appId;
        }
        if ((i9 & 4) != 0) {
            str3 = ossToken.bucket;
        }
        if ((i9 & 8) != 0) {
            str4 = ossToken.endpoint;
        }
        if ((i9 & 16) != 0) {
            str5 = ossToken.accessKeyId;
        }
        if ((i9 & 32) != 0) {
            str6 = ossToken.accessKeySecret;
        }
        if ((i9 & 64) != 0) {
            str7 = ossToken.securityToken;
        }
        if ((i9 & 128) != 0) {
            str8 = ossToken.expiration;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return ossToken.copy(str, str2, str3, str4, str11, str12, str9, str10);
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

    public final OssToken copy(String strategy, String appId, String bucket, String endpoint, String accessKeyId, String accessKeySecret, String securityToken, String expiration) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(accessKeyId, "accessKeyId");
        Intrinsics.checkNotNullParameter(accessKeySecret, "accessKeySecret");
        Intrinsics.checkNotNullParameter(securityToken, "securityToken");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        return new OssToken(strategy, appId, bucket, endpoint, accessKeyId, accessKeySecret, securityToken, expiration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OssToken)) {
            return false;
        }
        OssToken ossToken = (OssToken) other;
        return Intrinsics.areEqual(this.strategy, ossToken.strategy) && Intrinsics.areEqual(this.appId, ossToken.appId) && Intrinsics.areEqual(this.bucket, ossToken.bucket) && Intrinsics.areEqual(this.endpoint, ossToken.endpoint) && Intrinsics.areEqual(this.accessKeyId, ossToken.accessKeyId) && Intrinsics.areEqual(this.accessKeySecret, ossToken.accessKeySecret) && Intrinsics.areEqual(this.securityToken, ossToken.securityToken) && Intrinsics.areEqual(this.expiration, ossToken.expiration);
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
        return "OssToken(strategy=" + this.strategy + ", appId=" + this.appId + ", bucket=" + this.bucket + ", endpoint=" + this.endpoint + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ", expiration=" + this.expiration + ")";
    }

    public OssToken(String strategy, String appId, String bucket, String endpoint, String accessKeyId, String accessKeySecret, String securityToken, String expiration) {
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

    public /* synthetic */ OssToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? "" : str4, (i9 & 16) != 0 ? "" : str5, (i9 & 32) != 0 ? "" : str6, (i9 & 64) != 0 ? "" : str7, (i9 & 128) != 0 ? "" : str8);
    }
}
