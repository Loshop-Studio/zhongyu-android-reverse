package com.google.android.material.carousel;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;

/* loaded from: classes2.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i, float f, float f7, float f8, int i8, float f9, int i9, float f10, int i10, float f11) {
        this.priority = i;
        this.smallSize = MathUtils.clamp(f, f7, f8);
        this.smallCount = i8;
        this.mediumSize = f9;
        this.mediumCount = i9;
        this.largeSize = f10;
        this.largeCount = i10;
        fit(f11, f7, f8, f10);
        this.cost = cost(f10);
    }

    private float calculateLargeSize(float f, int i, float f7, int i8, int i9) {
        if (i <= 0) {
            f7 = 0.0f;
        }
        float f8 = i8 / 2.0f;
        return (f - ((i + f8) * f7)) / (i9 + f8);
    }

    private float cost(float f) {
        if (isValid()) {
            return Math.abs(f - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f, float f7, float f8, float f9, int[] iArr, float f10, int[] iArr2, float f11, int[] iArr3) {
        Arrangement arrangement = null;
        int i = 1;
        for (int i8 : iArr3) {
            int length = iArr2.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = iArr2[i9];
                int length2 = iArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = length;
                    int i13 = i9;
                    int i14 = i;
                    int i15 = length2;
                    int i16 = i11;
                    Arrangement arrangement2 = new Arrangement(i14, f7, f8, f9, iArr[i11], f10, i10, f11, i8, f);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i17 = i14 + 1;
                    i11 = i16 + 1;
                    i9 = i13;
                    i = i17;
                    length = i12;
                    length2 = i15;
                }
                i9++;
                i = i;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f, float f7, float f8, float f9) {
        float space = f - getSpace();
        int i = this.smallCount;
        if (i > 0 && space > 0.0f) {
            float f10 = this.smallSize;
            this.smallSize = Math.min(space / i, f8 - f10) + f10;
        } else if (i > 0 && space < 0.0f) {
            float f11 = this.smallSize;
            this.smallSize = Math.max(space / i, f7 - f11) + f11;
        }
        int i8 = this.smallCount;
        float f12 = i8 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f12;
        float fCalculateLargeSize = calculateLargeSize(f, i8, f12, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f13 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f13;
        int i9 = this.mediumCount;
        if (i9 <= 0 || fCalculateLargeSize == f9) {
            return;
        }
        float f14 = (f9 - fCalculateLargeSize) * this.largeCount;
        float fMin = Math.min(Math.abs(f14), f13 * 0.1f * i9);
        if (f14 > 0.0f) {
            this.mediumSize -= fMin / this.mediumCount;
            this.largeSize = (fMin / this.largeCount) + this.largeSize;
        } else {
            this.mediumSize = (fMin / this.mediumCount) + this.mediumSize;
            this.largeSize -= fMin / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f7 = this.mediumSize;
        return f > f7 && f7 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Arrangement [priority=");
        sb.append(this.priority);
        sb.append(", smallCount=");
        sb.append(this.smallCount);
        sb.append(", smallSize=");
        sb.append(this.smallSize);
        sb.append(", mediumCount=");
        sb.append(this.mediumCount);
        sb.append(", mediumSize=");
        sb.append(this.mediumSize);
        sb.append(", largeCount=");
        sb.append(this.largeCount);
        sb.append(", largeSize=");
        sb.append(this.largeSize);
        sb.append(", cost=");
        return AbstractC0037f.m89n(sb, "]", this.cost);
    }
}
