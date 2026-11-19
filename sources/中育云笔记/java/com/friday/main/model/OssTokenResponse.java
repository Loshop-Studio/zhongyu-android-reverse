package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class OssTokenResponse {
    public static final int $stable = 0;
    private final String accessKeyId;
    private final String accessKeySecret;
    private final String requestId;
    private final String securityToken;

    public OssTokenResponse(String accessKeyId, String accessKeySecret, String securityToken, String requestId) {
        AbstractC9979u.m20294g(accessKeyId, "accessKeyId");
        AbstractC9979u.m20294g(accessKeySecret, "accessKeySecret");
        AbstractC9979u.m20294g(securityToken, "securityToken");
        AbstractC9979u.m20294g(requestId, "requestId");
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
        this.requestId = requestId;
    }

    public static /* synthetic */ OssTokenResponse copy$default(OssTokenResponse ossTokenResponse, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ossTokenResponse.accessKeyId;
        }
        if ((i10 & 2) != 0) {
            str2 = ossTokenResponse.accessKeySecret;
        }
        if ((i10 & 4) != 0) {
            str3 = ossTokenResponse.securityToken;
        }
        if ((i10 & 8) != 0) {
            str4 = ossTokenResponse.requestId;
        }
        return ossTokenResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.accessKeyId;
    }

    public final String component2() {
        return this.accessKeySecret;
    }

    public final String component3() {
        return this.securityToken;
    }

    public final String component4() {
        return this.requestId;
    }

    public final OssTokenResponse copy(String accessKeyId, String accessKeySecret, String securityToken, String requestId) {
        AbstractC9979u.m20294g(accessKeyId, "accessKeyId");
        AbstractC9979u.m20294g(accessKeySecret, "accessKeySecret");
        AbstractC9979u.m20294g(securityToken, "securityToken");
        AbstractC9979u.m20294g(requestId, "requestId");
        return new OssTokenResponse(accessKeyId, accessKeySecret, securityToken, requestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssTokenResponse)) {
            return false;
        }
        OssTokenResponse ossTokenResponse = (OssTokenResponse) obj;
        return AbstractC9979u.m20289b(this.accessKeyId, ossTokenResponse.accessKeyId) && AbstractC9979u.m20289b(this.accessKeySecret, ossTokenResponse.accessKeySecret) && AbstractC9979u.m20289b(this.securityToken, ossTokenResponse.securityToken) && AbstractC9979u.m20289b(this.requestId, ossTokenResponse.requestId);
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public int hashCode() {
        return (((((this.accessKeyId.hashCode() * 31) + this.accessKeySecret.hashCode()) * 31) + this.securityToken.hashCode()) * 31) + this.requestId.hashCode();
    }

    public String toString() {
        return "OssTokenResponse(accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ", requestId=" + this.requestId + ")";
    }
}
