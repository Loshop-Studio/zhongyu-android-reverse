package com.zykj.download;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m13413d2 = {"Lcom/zykj/download/OssToken;", "", "strategy", "Lcom/zykj/download/StrategyEnum;", OssUtils.OSS_ENDPOINT, "", OssUtils.OSS_BUCKET, "accessKeyId", "accessKeySecret", "securityToken", "(Lcom/zykj/download/StrategyEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessKeyId", "()Ljava/lang/String;", "getAccessKeySecret", "getBucket", "getEndpoint", "getSecurityToken", "getStrategy", "()Lcom/zykj/download/StrategyEnum;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final /* data */ class OssToken {
    private final String accessKeyId;
    private final String accessKeySecret;
    private final String bucket;
    private final String endpoint;
    private final String securityToken;
    private final StrategyEnum strategy;

    public OssToken(StrategyEnum strategy, String endpoint, String bucket, String accessKeyId, String accessKeySecret, String securityToken) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(accessKeyId, "accessKeyId");
        Intrinsics.checkNotNullParameter(accessKeySecret, "accessKeySecret");
        Intrinsics.checkNotNullParameter(securityToken, "securityToken");
        this.strategy = strategy;
        this.endpoint = endpoint;
        this.bucket = bucket;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
    }

    public static /* synthetic */ OssToken copy$default(OssToken ossToken, StrategyEnum strategyEnum, String str, String str2, String str3, String str4, String str5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            strategyEnum = ossToken.strategy;
        }
        if ((i9 & 2) != 0) {
            str = ossToken.endpoint;
        }
        if ((i9 & 4) != 0) {
            str2 = ossToken.bucket;
        }
        if ((i9 & 8) != 0) {
            str3 = ossToken.accessKeyId;
        }
        if ((i9 & 16) != 0) {
            str4 = ossToken.accessKeySecret;
        }
        if ((i9 & 32) != 0) {
            str5 = ossToken.securityToken;
        }
        String str6 = str4;
        String str7 = str5;
        return ossToken.copy(strategyEnum, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final StrategyEnum getStrategy() {
        return this.strategy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final OssToken copy(StrategyEnum strategy, String endpoint, String bucket, String accessKeyId, String accessKeySecret, String securityToken) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(accessKeyId, "accessKeyId");
        Intrinsics.checkNotNullParameter(accessKeySecret, "accessKeySecret");
        Intrinsics.checkNotNullParameter(securityToken, "securityToken");
        return new OssToken(strategy, endpoint, bucket, accessKeyId, accessKeySecret, securityToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OssToken)) {
            return false;
        }
        OssToken ossToken = (OssToken) other;
        return this.strategy == ossToken.strategy && Intrinsics.areEqual(this.endpoint, ossToken.endpoint) && Intrinsics.areEqual(this.bucket, ossToken.bucket) && Intrinsics.areEqual(this.accessKeyId, ossToken.accessKeyId) && Intrinsics.areEqual(this.accessKeySecret, ossToken.accessKeySecret) && Intrinsics.areEqual(this.securityToken, ossToken.securityToken);
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final StrategyEnum getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return (((((((((this.strategy.hashCode() * 31) + this.endpoint.hashCode()) * 31) + this.bucket.hashCode()) * 31) + this.accessKeyId.hashCode()) * 31) + this.accessKeySecret.hashCode()) * 31) + this.securityToken.hashCode();
    }

    public String toString() {
        return "OssToken(strategy=" + this.strategy + ", endpoint=" + this.endpoint + ", bucket=" + this.bucket + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ')';
    }
}
