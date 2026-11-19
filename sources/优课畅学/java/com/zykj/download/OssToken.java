package com.zykj.download;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class OssToken {
    private final String accessKeyId;
    private final String accessKeySecret;
    private final String bucket;
    private final String endpoint;
    private final String securityToken;
    private final StrategyEnum strategy;

    public OssToken(StrategyEnum strategy, String endpoint, String bucket, String accessKeyId, String accessKeySecret, String securityToken) {
        AbstractC9133u.m16133g(strategy, "strategy");
        AbstractC9133u.m16133g(endpoint, "endpoint");
        AbstractC9133u.m16133g(bucket, "bucket");
        AbstractC9133u.m16133g(accessKeyId, "accessKeyId");
        AbstractC9133u.m16133g(accessKeySecret, "accessKeySecret");
        AbstractC9133u.m16133g(securityToken, "securityToken");
        this.strategy = strategy;
        this.endpoint = endpoint;
        this.bucket = bucket;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
    }

    public static /* synthetic */ OssToken copy$default(OssToken ossToken, StrategyEnum strategyEnum, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            strategyEnum = ossToken.strategy;
        }
        if ((i10 & 2) != 0) {
            str = ossToken.endpoint;
        }
        if ((i10 & 4) != 0) {
            str2 = ossToken.bucket;
        }
        if ((i10 & 8) != 0) {
            str3 = ossToken.accessKeyId;
        }
        if ((i10 & 16) != 0) {
            str4 = ossToken.accessKeySecret;
        }
        if ((i10 & 32) != 0) {
            str5 = ossToken.securityToken;
        }
        String str6 = str4;
        String str7 = str5;
        return ossToken.copy(strategyEnum, str, str2, str3, str6, str7);
    }

    public final StrategyEnum component1() {
        return this.strategy;
    }

    public final String component2() {
        return this.endpoint;
    }

    public final String component3() {
        return this.bucket;
    }

    public final String component4() {
        return this.accessKeyId;
    }

    public final String component5() {
        return this.accessKeySecret;
    }

    public final String component6() {
        return this.securityToken;
    }

    public final OssToken copy(StrategyEnum strategy, String endpoint, String bucket, String accessKeyId, String accessKeySecret, String securityToken) {
        AbstractC9133u.m16133g(strategy, "strategy");
        AbstractC9133u.m16133g(endpoint, "endpoint");
        AbstractC9133u.m16133g(bucket, "bucket");
        AbstractC9133u.m16133g(accessKeyId, "accessKeyId");
        AbstractC9133u.m16133g(accessKeySecret, "accessKeySecret");
        AbstractC9133u.m16133g(securityToken, "securityToken");
        return new OssToken(strategy, endpoint, bucket, accessKeyId, accessKeySecret, securityToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssToken)) {
            return false;
        }
        OssToken ossToken = (OssToken) obj;
        return this.strategy == ossToken.strategy && AbstractC9133u.m16128b(this.endpoint, ossToken.endpoint) && AbstractC9133u.m16128b(this.bucket, ossToken.bucket) && AbstractC9133u.m16128b(this.accessKeyId, ossToken.accessKeyId) && AbstractC9133u.m16128b(this.accessKeySecret, ossToken.accessKeySecret) && AbstractC9133u.m16128b(this.securityToken, ossToken.securityToken);
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
