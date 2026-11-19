package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001a"}, m13413d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "priority", "", "smallSize", "", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "(IFIFIFI)V", "getLargeCount", "()I", "getLargeSize", "()F", "getMediumCount", "getMediumSize", "getSmallCount", "getSmallSize", "cost", "targetLargeSize", "isValid", "", "itemCount", "Companion", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Arrangement {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    @Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002JX\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013J`\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m13413d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "()V", "MediumItemFlexPercentage", "", "calculateLargeSize", "availableSpace", "smallCount", "", "smallSize", "mediumCount", "largeCount", "findLowestCostArrangement", "Landroidx/compose/material3/carousel/Arrangement;", "itemSpacing", "targetSmallSize", "minSmallSize", "maxSmallSize", "smallCounts", "", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "fit", "priority", "mediumSize", "largeSize", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float calculateLargeSize(float availableSpace, int smallCount, float smallSize, int mediumCount, int largeCount) {
            float f10 = mediumCount / 2.0f;
            return (availableSpace - ((smallCount + f10) * smallSize)) / (largeCount + f10);
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
                float r6 = kotlin.ranges.RangesKt.coerceIn(r9, r10, r11)
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

        public final Arrangement findLowestCostArrangement(float availableSpace, float itemSpacing, float targetSmallSize, float minSmallSize, float maxSmallSize, int[] smallCounts, float targetMediumSize, int[] mediumCounts, float targetLargeSize, int[] largeCounts) {
            int[] iArr = smallCounts;
            int length = largeCounts.length;
            Arrangement arrangement = null;
            int i9 = 1;
            int i10 = 0;
            while (i10 < length) {
                int i11 = largeCounts[i10];
                int length2 = mediumCounts.length;
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = mediumCounts[i12];
                    int length3 = iArr.length;
                    int i14 = 0;
                    while (i14 < length3) {
                        int i15 = i12;
                        int i16 = iArr[i14];
                        Arrangement arrangement2 = arrangement;
                        int i17 = i10;
                        int i18 = length2;
                        int i19 = length3;
                        int i20 = i14;
                        Arrangement arrangementFit = fit(i9, availableSpace, itemSpacing, i16, targetSmallSize, minSmallSize, maxSmallSize, i13, targetMediumSize, i11, targetLargeSize);
                        if (arrangement2 != null && arrangementFit.cost(targetLargeSize) >= arrangement2.cost(targetLargeSize)) {
                            arrangement = arrangement2;
                        } else {
                            if (arrangementFit.cost(targetLargeSize) == 0.0f) {
                                return arrangementFit;
                            }
                            arrangement = arrangementFit;
                        }
                        i9++;
                        i14 = i20 + 1;
                        iArr = smallCounts;
                        i10 = i17;
                        length2 = i18;
                        i12 = i15;
                        length3 = i19;
                    }
                    i12++;
                    iArr = smallCounts;
                }
                i10++;
                iArr = smallCounts;
            }
            return arrangement;
        }

        private Companion() {
        }
    }

    public Arrangement(int i9, float f10, int i10, float f11, int i11, float f12, int i12) {
        this.priority = i9;
        this.smallSize = f10;
        this.smallCount = i10;
        this.mediumSize = f11;
        this.mediumCount = i11;
        this.largeSize = f12;
        this.largeCount = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float targetLargeSize) {
        if (isValid()) {
            return Math.abs(targetLargeSize - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    private final boolean isValid() {
        int i9 = this.largeCount;
        if (i9 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i9 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
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
