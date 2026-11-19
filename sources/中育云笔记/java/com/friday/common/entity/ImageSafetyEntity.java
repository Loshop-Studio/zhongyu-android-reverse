package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Entity
/* loaded from: classes3.dex */
public final class ImageSafetyEntity {
    public static final int $stable = 0;

    @PrimaryKey(autoGenerate = false)
    private final String imageId;
    private final int riskScore;

    public ImageSafetyEntity(String imageId, int i10) {
        AbstractC9979u.m20294g(imageId, "imageId");
        this.imageId = imageId;
        this.riskScore = i10;
    }

    public static /* synthetic */ ImageSafetyEntity copy$default(ImageSafetyEntity imageSafetyEntity, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageSafetyEntity.imageId;
        }
        if ((i11 & 2) != 0) {
            i10 = imageSafetyEntity.riskScore;
        }
        return imageSafetyEntity.copy(str, i10);
    }

    public final String component1() {
        return this.imageId;
    }

    public final int component2() {
        return this.riskScore;
    }

    public final ImageSafetyEntity copy(String imageId, int i10) {
        AbstractC9979u.m20294g(imageId, "imageId");
        return new ImageSafetyEntity(imageId, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSafetyEntity)) {
            return false;
        }
        ImageSafetyEntity imageSafetyEntity = (ImageSafetyEntity) obj;
        return AbstractC9979u.m20289b(this.imageId, imageSafetyEntity.imageId) && this.riskScore == imageSafetyEntity.riskScore;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final int getRiskScore() {
        return this.riskScore;
    }

    public int hashCode() {
        return (this.imageId.hashCode() * 31) + Integer.hashCode(this.riskScore);
    }

    public String toString() {
        return "ImageSafetyEntity(imageId=" + this.imageId + ", riskScore=" + this.riskScore + ")";
    }
}
