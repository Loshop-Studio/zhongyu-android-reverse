package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperPoint;", "", "xRate", "", "yRate", "<init>", "(FF)V", "getXRate", "()F", "getYRate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperPoint {
    public static final int $stable = 0;

    @SerializedName("XRate")
    private final float xRate;

    @SerializedName("YRate")
    private final float yRate;

    public PaperPoint(float f10, float f11) {
        this.xRate = f10;
        this.yRate = f11;
    }

    public static /* synthetic */ PaperPoint copy$default(PaperPoint paperPoint, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = paperPoint.xRate;
        }
        if ((i10 & 2) != 0) {
            f11 = paperPoint.yRate;
        }
        return paperPoint.copy(f10, f11);
    }

    /* renamed from: component1, reason: from getter */
    public final float getXRate() {
        return this.xRate;
    }

    /* renamed from: component2, reason: from getter */
    public final float getYRate() {
        return this.yRate;
    }

    public final PaperPoint copy(float xRate, float yRate) {
        return new PaperPoint(xRate, yRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaperPoint)) {
            return false;
        }
        PaperPoint paperPoint = (PaperPoint) other;
        return Float.compare(this.xRate, paperPoint.xRate) == 0 && Float.compare(this.yRate, paperPoint.yRate) == 0;
    }

    public final float getXRate() {
        return this.xRate;
    }

    public final float getYRate() {
        return this.yRate;
    }

    public int hashCode() {
        return (Float.hashCode(this.xRate) * 31) + Float.hashCode(this.yRate);
    }

    public String toString() {
        return "PaperPoint(xRate=" + this.xRate + ", yRate=" + this.yRate + ")";
    }
}
