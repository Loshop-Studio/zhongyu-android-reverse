package com.zykj.evaluation.upload;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m13558d2 = {"Lcom/zykj/evaluation/upload/OssData;", "", "token", "Lcom/zykj/evaluation/upload/OssToken;", "objectKey", "", "<init>", "(Lcom/zykj/evaluation/upload/OssToken;Ljava/lang/String;)V", "getToken", "()Lcom/zykj/evaluation/upload/OssToken;", "getObjectKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OssData {
    public static final int $stable = 8;
    private final String objectKey;
    private final OssToken token;

    public OssData(OssToken token, String objectKey) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        this.token = token;
        this.objectKey = objectKey;
    }

    public static /* synthetic */ OssData copy$default(OssData ossData, OssToken ossToken, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ossToken = ossData.token;
        }
        if ((i10 & 2) != 0) {
            str = ossData.objectKey;
        }
        return ossData.copy(ossToken, str);
    }

    /* renamed from: component1, reason: from getter */
    public final OssToken getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getObjectKey() {
        return this.objectKey;
    }

    public final OssData copy(OssToken token, String objectKey) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        return new OssData(token, objectKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OssData)) {
            return false;
        }
        OssData ossData = (OssData) other;
        return Intrinsics.areEqual(this.token, ossData.token) && Intrinsics.areEqual(this.objectKey, ossData.objectKey);
    }

    public final String getObjectKey() {
        return this.objectKey;
    }

    public final OssToken getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.objectKey.hashCode();
    }

    public String toString() {
        return "OssData(token=" + this.token + ", objectKey=" + this.objectKey + ")";
    }
}
