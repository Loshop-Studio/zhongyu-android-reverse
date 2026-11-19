package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class OssToken {

    @NotNull
    private final String accessKeyId;

    @NotNull
    private final String accessKeySecret;

    @NotNull
    private final String bucket;

    @NotNull
    private final String endpoint;

    @NotNull
    private final String securityToken;

    @NotNull
    private final StrategyEnum strategy;

    public OssToken(@NotNull StrategyEnum strategy, @NotNull String endpoint, @NotNull String bucket, @NotNull String accessKeyId, @NotNull String accessKeySecret, @NotNull String securityToken) {
        C2769l.m9241e(strategy, "strategy");
        C2769l.m9241e(endpoint, "endpoint");
        C2769l.m9241e(bucket, "bucket");
        C2769l.m9241e(accessKeyId, "accessKeyId");
        C2769l.m9241e(accessKeySecret, "accessKeySecret");
        C2769l.m9241e(securityToken, "securityToken");
        this.strategy = strategy;
        this.endpoint = endpoint;
        this.bucket = bucket;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
    }

    public static /* synthetic */ OssToken copy$default(OssToken ossToken, StrategyEnum strategyEnum, String str, String str2, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            strategyEnum = ossToken.strategy;
        }
        if ((i4 & 2) != 0) {
            str = ossToken.endpoint;
        }
        String str6 = str;
        if ((i4 & 4) != 0) {
            str2 = ossToken.bucket;
        }
        String str7 = str2;
        if ((i4 & 8) != 0) {
            str3 = ossToken.accessKeyId;
        }
        String str8 = str3;
        if ((i4 & 16) != 0) {
            str4 = ossToken.accessKeySecret;
        }
        String str9 = str4;
        if ((i4 & 32) != 0) {
            str5 = ossToken.securityToken;
        }
        return ossToken.copy(strategyEnum, str6, str7, str8, str9, str5);
    }

    @NotNull
    public final StrategyEnum component1() {
        return this.strategy;
    }

    @NotNull
    public final String component2() {
        return this.endpoint;
    }

    @NotNull
    public final String component3() {
        return this.bucket;
    }

    @NotNull
    public final String component4() {
        return this.accessKeyId;
    }

    @NotNull
    public final String component5() {
        return this.accessKeySecret;
    }

    @NotNull
    public final String component6() {
        return this.securityToken;
    }

    @NotNull
    public final OssToken copy(@NotNull StrategyEnum strategy, @NotNull String endpoint, @NotNull String bucket, @NotNull String accessKeyId, @NotNull String accessKeySecret, @NotNull String securityToken) {
        C2769l.m9241e(strategy, "strategy");
        C2769l.m9241e(endpoint, "endpoint");
        C2769l.m9241e(bucket, "bucket");
        C2769l.m9241e(accessKeyId, "accessKeyId");
        C2769l.m9241e(accessKeySecret, "accessKeySecret");
        C2769l.m9241e(securityToken, "securityToken");
        return new OssToken(strategy, endpoint, bucket, accessKeyId, accessKeySecret, securityToken);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssToken)) {
            return false;
        }
        OssToken ossToken = (OssToken) obj;
        return this.strategy == ossToken.strategy && C2769l.m9237a(this.endpoint, ossToken.endpoint) && C2769l.m9237a(this.bucket, ossToken.bucket) && C2769l.m9237a(this.accessKeyId, ossToken.accessKeyId) && C2769l.m9237a(this.accessKeySecret, ossToken.accessKeySecret) && C2769l.m9237a(this.securityToken, ossToken.securityToken);
    }

    @NotNull
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    @NotNull
    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    @NotNull
    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    public final String getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    public final String getSecurityToken() {
        return this.securityToken;
    }

    @NotNull
    public final StrategyEnum getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return (((((((((this.strategy.hashCode() * 31) + this.endpoint.hashCode()) * 31) + this.bucket.hashCode()) * 31) + this.accessKeyId.hashCode()) * 31) + this.accessKeySecret.hashCode()) * 31) + this.securityToken.hashCode();
    }

    @NotNull
    public String toString() {
        return "OssToken(strategy=" + this.strategy + ", endpoint=" + this.endpoint + ", bucket=" + this.bucket + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ')';
    }
}
