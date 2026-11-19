package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.download.OssToken;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class OssData {
    public static final int $stable = 8;
    private final String objectKey;
    private final OssToken ossToken;

    public OssData(OssToken ossToken, String objectKey) {
        AbstractC9133u.m16133g(ossToken, "ossToken");
        AbstractC9133u.m16133g(objectKey, "objectKey");
        this.ossToken = ossToken;
        this.objectKey = objectKey;
    }

    public static /* synthetic */ OssData copy$default(OssData ossData, OssToken ossToken, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ossToken = ossData.ossToken;
        }
        if ((i10 & 2) != 0) {
            str = ossData.objectKey;
        }
        return ossData.copy(ossToken, str);
    }

    public final OssToken component1() {
        return this.ossToken;
    }

    public final String component2() {
        return this.objectKey;
    }

    public final OssData copy(OssToken ossToken, String objectKey) {
        AbstractC9133u.m16133g(ossToken, "ossToken");
        AbstractC9133u.m16133g(objectKey, "objectKey");
        return new OssData(ossToken, objectKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssData)) {
            return false;
        }
        OssData ossData = (OssData) obj;
        return AbstractC9133u.m16128b(this.ossToken, ossData.ossToken) && AbstractC9133u.m16128b(this.objectKey, ossData.objectKey);
    }

    public final String getObjectKey() {
        return this.objectKey;
    }

    public final OssToken getOssToken() {
        return this.ossToken;
    }

    public int hashCode() {
        return (this.ossToken.hashCode() * 31) + this.objectKey.hashCode();
    }

    public String toString() {
        return "OssData(ossToken=" + this.ossToken + ", objectKey=" + this.objectKey + ")";
    }
}
