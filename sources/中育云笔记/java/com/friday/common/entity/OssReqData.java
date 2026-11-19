package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class OssReqData {
    public static final int $stable = 0;
    private final String objectKey;
    private final OssTokenReq tokenReq;

    public OssReqData(OssTokenReq tokenReq, String objectKey) {
        AbstractC9979u.m20294g(tokenReq, "tokenReq");
        AbstractC9979u.m20294g(objectKey, "objectKey");
        this.tokenReq = tokenReq;
        this.objectKey = objectKey;
    }

    public static /* synthetic */ OssReqData copy$default(OssReqData ossReqData, OssTokenReq ossTokenReq, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ossTokenReq = ossReqData.tokenReq;
        }
        if ((i10 & 2) != 0) {
            str = ossReqData.objectKey;
        }
        return ossReqData.copy(ossTokenReq, str);
    }

    public final OssTokenReq component1() {
        return this.tokenReq;
    }

    public final String component2() {
        return this.objectKey;
    }

    public final OssReqData copy(OssTokenReq tokenReq, String objectKey) {
        AbstractC9979u.m20294g(tokenReq, "tokenReq");
        AbstractC9979u.m20294g(objectKey, "objectKey");
        return new OssReqData(tokenReq, objectKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssReqData)) {
            return false;
        }
        OssReqData ossReqData = (OssReqData) obj;
        return AbstractC9979u.m20289b(this.tokenReq, ossReqData.tokenReq) && AbstractC9979u.m20289b(this.objectKey, ossReqData.objectKey);
    }

    public final String getObjectKey() {
        return this.objectKey;
    }

    public final OssTokenReq getTokenReq() {
        return this.tokenReq;
    }

    public int hashCode() {
        return (this.tokenReq.hashCode() * 31) + this.objectKey.hashCode();
    }

    public String toString() {
        return "OssReqData(tokenReq=" + this.tokenReq + ", objectKey=" + this.objectKey + ")";
    }
}
