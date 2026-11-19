package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final float calculateLargeSize(float f10, int i10, float f11, int i11, int i12) {
            float f12 = i11 / 2.0f;
            return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final androidx.compose.material3.carousel.Arrangement fit(int r5, float r6, float r7, int r8, float r9, float r10, float r11, int r12, float r13, int r14, float r15) {
            /*
                r4 = this;
                int r0 = r14 + r12
                int r0 = r0 + r8
                int r0 = r0 + (-1)
                float r0 = (float) r0
                float r0 = r0 * r7
                float r7 = r6 - r0
                float r6 = p077d8.AbstractC8323h.m13517l(r9, r10, r11)
                float r0 = (float) r14
                float r9 = r15 * r0
                float r1 = (float) r12
                float r13 = r13 * r1
                float r9 = r9 + r13
                float r13 = (float) r8
                float r2 = r6 * r13
                float r9 = r9 + r2
                float r9 = r7 - r9
                r2 = 0
                if (r8 <= 0) goto L28
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r3 <= 0) goto L28
                float r9 = r9 / r13
                float r11 = r11 - r6
                float r9 = java.lang.Math.min(r9, r11)
            L26:
                float r6 = r6 + r9
                goto L35
            L28:
                if (r8 <= 0) goto L35
                int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r11 >= 0) goto L35
                float r9 = r9 / r13
                float r10 = r10 - r6
                float r9 = java.lang.Math.max(r9, r10)
                goto L26
            L35:
                if (r8 <= 0) goto L3c
                r9 = r6
                r10 = r12
                r11 = r14
                r6 = r4
                goto L40
            L3c:
                r9 = r2
                r6 = r4
                r10 = r12
                r11 = r14
            L40:
                float r7 = r6.calculateLargeSize(r7, r8, r9, r10, r11)
                r6 = r9
                float r9 = r7 + r6
                r12 = 1073741824(0x40000000, float:2.0)
                float r9 = r9 / r12
                if (r10 <= 0) goto L69
                int r12 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
                if (r12 != 0) goto L51
                goto L69
            L51:
                float r15 = r15 - r7
                float r15 = r15 * r0
                r12 = 1036831949(0x3dcccccd, float:0.1)
                float r12 = r12 * r9
                float r12 = r12 * r1
                float r13 = java.lang.Math.abs(r15)
                float r12 = java.lang.Math.min(r13, r12)
                int r13 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
                if (r13 <= 0) goto L6e
                float r13 = r12 / r1
                float r9 = r9 - r13
                float r12 = r12 / r0
                float r7 = r7 + r12
            L69:
                r14 = r7
                r12 = r9
                r15 = r11
                r11 = r8
                goto L74
            L6e:
                float r13 = r12 / r1
                float r9 = r9 + r13
                float r12 = r12 / r0
                float r7 = r7 - r12
                goto L69
            L74:
                androidx.compose.material3.carousel.Arrangement r8 = new androidx.compose.material3.carousel.Arrangement
                r9 = r5
                r13 = r10
                r10 = r6
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.Arrangement.Companion.fit(int, float, float, int, float, float, float, int, float, int, float):androidx.compose.material3.carousel.Arrangement");
        }

        public final Arrangement findLowestCostArrangement(float f10, float f11, float f12, float f13, float f14, int[] iArr, float f15, int[] iArr2, float f16, int[] iArr3) {
            int[] iArr4 = iArr;
            int length = iArr3.length;
            Arrangement arrangement = null;
            int i10 = 1;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr3[i11];
                int length2 = iArr2.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = iArr2[i13];
                    int length3 = iArr4.length;
                    int i15 = 0;
                    while (i15 < length3) {
                        int i16 = i13;
                        int i17 = iArr4[i15];
                        Arrangement arrangement2 = arrangement;
                        int i18 = i11;
                        int i19 = length2;
                        int i20 = length3;
                        int i21 = i15;
                        Arrangement arrangementFit = fit(i10, f10, f11, i17, f12, f13, f14, i14, f15, i12, f16);
                        if (arrangement2 != null && arrangementFit.cost(f16) >= arrangement2.cost(f16)) {
                            arrangement = arrangement2;
                        } else {
                            if (arrangementFit.cost(f16) == 0.0f) {
                                return arrangementFit;
                            }
                            arrangement = arrangementFit;
                        }
                        i10++;
                        i15 = i21 + 1;
                        iArr4 = iArr;
                        i11 = i18;
                        length2 = i19;
                        i13 = i16;
                        length3 = i20;
                    }
                    i13++;
                    iArr4 = iArr;
                }
                i11++;
                iArr4 = iArr;
            }
            return arrangement;
        }

        private Companion() {
        }
    }

    public Arrangement(int i10, float f10, int i11, float f11, int i12, float f12, int i13) {
        this.priority = i10;
        this.smallSize = f10;
        this.smallCount = i11;
        this.mediumSize = f11;
        this.mediumCount = i12;
        this.largeSize = f12;
        this.largeCount = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float f10) {
        if (isValid()) {
            return Math.abs(f10 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    private final boolean isValid() {
        int i10 = this.largeCount;
        if (i10 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i10 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f10 = this.largeSize;
        float f11 = this.mediumSize;
        return f10 > f11 && f11 > this.smallSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }
}
