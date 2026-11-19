package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;

/* loaded from: classes3.dex */
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

    public Arrangement(int i9, float f10, float f11, float f12, int i10, float f13, int i11, float f14, int i12, float f15) {
        this.priority = i9;
        this.smallSize = MathUtils.clamp(f10, f11, f12);
        this.smallCount = i10;
        this.mediumSize = f13;
        this.mediumCount = i11;
        this.largeSize = f14;
        this.largeCount = i12;
        fit(f15, f11, f12, f14);
        this.cost = cost(f14);
    }

    private float calculateLargeSize(float f10, int i9, float f11, int i10, int i11) {
        if (i9 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i10 / 2.0f;
        return (f10 - ((i9 + f12) * f11)) / (i11 + f12);
    }

    private float cost(float f10) {
        if (isValid()) {
            return Math.abs(f10 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        Arrangement arrangement = null;
        int i9 = 1;
        for (int i10 : iArr3) {
            int length = iArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr2[i11];
                int length2 = iArr.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = length;
                    int i15 = i11;
                    int i16 = i9;
                    int i17 = length2;
                    int i18 = i13;
                    Arrangement arrangement2 = new Arrangement(i16, f11, f12, f13, iArr[i13], f14, i12, f15, i10, f10);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i19 = i16 + 1;
                    i13 = i18 + 1;
                    i11 = i15;
                    i9 = i19;
                    length = i14;
                    length2 = i17;
                }
                i11++;
                i9 = i9;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f10, float f11, float f12, float f13) {
        float space = f10 - getSpace();
        int i9 = this.smallCount;
        if (i9 > 0 && space > 0.0f) {
            float f14 = this.smallSize;
            this.smallSize = f14 + Math.min(space / i9, f12 - f14);
        } else if (i9 > 0 && space < 0.0f) {
            float f15 = this.smallSize;
            this.smallSize = f15 + Math.max(space / i9, f11 - f15);
        }
        int i10 = this.smallCount;
        float f16 = i10 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f16;
        float fCalculateLargeSize = calculateLargeSize(f10, i10, f16, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f17 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f17;
        int i11 = this.mediumCount;
        if (i11 <= 0 || fCalculateLargeSize == f13) {
            return;
        }
        float f18 = (f13 - fCalculateLargeSize) * this.largeCount;
        float fMin = Math.min(Math.abs(f18), f17 * 0.1f * i11);
        if (f18 > 0.0f) {
            this.mediumSize -= fMin / this.mediumCount;
            this.largeSize += fMin / this.largeCount;
        } else {
            this.mediumSize += fMin / this.mediumCount;
            this.largeSize -= fMin / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
    }

    private boolean isValid() {
        int i9 = this.largeCount;
        if (i9 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i9 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f10 = this.largeSize;
        float f11 = this.mediumSize;
        return f10 > f11 && f11 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }
}
