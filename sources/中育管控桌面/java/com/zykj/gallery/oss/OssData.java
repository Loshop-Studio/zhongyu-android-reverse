package com.zykj.gallery.oss;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7880d2 = {"Lcom/zykj/gallery/oss/OssData;", "", "token", "Lcom/zykj/gallery/oss/OssToken;", "objectKey", "", "<init>", "(Lcom/zykj/gallery/oss/OssToken;Ljava/lang/String;)V", "getToken", "()Lcom/zykj/gallery/oss/OssToken;", "getObjectKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OssData {
    public static final int $stable = 8;
    private final String objectKey;
    private final OssToken token;

    public OssData(OssToken ossToken, String objectKey) {
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        this.token = ossToken;
        this.objectKey = objectKey;
    }

    public static /* synthetic */ OssData copy$default(OssData ossData, OssToken ossToken, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            ossToken = ossData.token;
        }
        if ((i6 & 2) != 0) {
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
        OssToken ossToken = this.token;
        return ((ossToken == null ? 0 : ossToken.hashCode()) * 31) + this.objectKey.hashCode();
    }

    public String toString() {
        return "OssData(token=" + this.token + ", objectKey=" + this.objectKey + ")";
    }
}
