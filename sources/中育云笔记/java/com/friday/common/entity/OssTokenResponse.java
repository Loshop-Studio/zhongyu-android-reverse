package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class OssTokenResponse {
    public static final int $stable = 0;
    private final String accessKeyId;
    private final String accessKeySecret;
    private final String bucket;
    private final String endpoint;
    private final String expiration;
    private final String requestId;
    private final String securityToken;
    private final String strategy;

    public OssTokenResponse(String strategy, String bucket, String endpoint, String accessKeyId, String accessKeySecret, String securityToken, String requestId, String expiration) {
        AbstractC9979u.m20294g(strategy, "strategy");
        AbstractC9979u.m20294g(bucket, "bucket");
        AbstractC9979u.m20294g(endpoint, "endpoint");
        AbstractC9979u.m20294g(accessKeyId, "accessKeyId");
        AbstractC9979u.m20294g(accessKeySecret, "accessKeySecret");
        AbstractC9979u.m20294g(securityToken, "securityToken");
        AbstractC9979u.m20294g(requestId, "requestId");
        AbstractC9979u.m20294g(expiration, "expiration");
        this.strategy = strategy;
        this.bucket = bucket;
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
        this.requestId = requestId;
        this.expiration = expiration;
    }

    public static /* synthetic */ OssTokenResponse copy$default(OssTokenResponse ossTokenResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ossTokenResponse.strategy;
        }
        if ((i10 & 2) != 0) {
            str2 = ossTokenResponse.bucket;
        }
        if ((i10 & 4) != 0) {
            str3 = ossTokenResponse.endpoint;
        }
        if ((i10 & 8) != 0) {
            str4 = ossTokenResponse.accessKeyId;
        }
        if ((i10 & 16) != 0) {
            str5 = ossTokenResponse.accessKeySecret;
        }
        if ((i10 & 32) != 0) {
            str6 = ossTokenResponse.securityToken;
        }
        if ((i10 & 64) != 0) {
            str7 = ossTokenResponse.requestId;
        }
        if ((i10 & 128) != 0) {
            str8 = ossTokenResponse.expiration;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return ossTokenResponse.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public final String component1() {
        return this.strategy;
    }

    public final String component2() {
        return this.bucket;
    }

    public final String component3() {
        return this.endpoint;
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

    public final String component7() {
        return this.requestId;
    }

    public final String component8() {
        return this.expiration;
    }

    public final OssTokenResponse copy(String strategy, String bucket, String endpoint, String accessKeyId, String accessKeySecret, String securityToken, String requestId, String expiration) {
        AbstractC9979u.m20294g(strategy, "strategy");
        AbstractC9979u.m20294g(bucket, "bucket");
        AbstractC9979u.m20294g(endpoint, "endpoint");
        AbstractC9979u.m20294g(accessKeyId, "accessKeyId");
        AbstractC9979u.m20294g(accessKeySecret, "accessKeySecret");
        AbstractC9979u.m20294g(securityToken, "securityToken");
        AbstractC9979u.m20294g(requestId, "requestId");
        AbstractC9979u.m20294g(expiration, "expiration");
        return new OssTokenResponse(strategy, bucket, endpoint, accessKeyId, accessKeySecret, securityToken, requestId, expiration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssTokenResponse)) {
            return false;
        }
        OssTokenResponse ossTokenResponse = (OssTokenResponse) obj;
        return AbstractC9979u.m20289b(this.strategy, ossTokenResponse.strategy) && AbstractC9979u.m20289b(this.bucket, ossTokenResponse.bucket) && AbstractC9979u.m20289b(this.endpoint, ossTokenResponse.endpoint) && AbstractC9979u.m20289b(this.accessKeyId, ossTokenResponse.accessKeyId) && AbstractC9979u.m20289b(this.accessKeySecret, ossTokenResponse.accessKeySecret) && AbstractC9979u.m20289b(this.securityToken, ossTokenResponse.securityToken) && AbstractC9979u.m20289b(this.requestId, ossTokenResponse.requestId) && AbstractC9979u.m20289b(this.expiration, ossTokenResponse.expiration);
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

    public final String getExpiration() {
        return this.expiration;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return (((((((((((((this.strategy.hashCode() * 31) + this.bucket.hashCode()) * 31) + this.endpoint.hashCode()) * 31) + this.accessKeyId.hashCode()) * 31) + this.accessKeySecret.hashCode()) * 31) + this.securityToken.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.expiration.hashCode();
    }

    public String toString() {
        return "OssTokenResponse(strategy=" + this.strategy + ", bucket=" + this.bucket + ", endpoint=" + this.endpoint + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ", requestId=" + this.requestId + ", expiration=" + this.expiration + ")";
    }
}
