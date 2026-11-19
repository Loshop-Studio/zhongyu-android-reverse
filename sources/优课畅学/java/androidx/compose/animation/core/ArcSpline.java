package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import p134i7.AbstractC8797p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ArcSpline {
    public static final int $stable = 8;
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    @StabilityInferred(parameters = 0)
    public static final class Arc {
        public static final int $stable = 8;
        private float arcDistance;
        private final float arcVelocity;
        public final float ellipseA;
        public final float ellipseB;
        public final float ellipseCenterX;
        public final float ellipseCenterY;
        public final boolean isLinear;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;

        /* renamed from: x1 */
        private final float f1140x1;

        /* renamed from: x2 */
        private final float f1141x2;

        /* renamed from: y1 */
        private final float f1142y1;

        /* renamed from: y2 */
        private final float f1143y2;

        public Arc(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.time1 = f10;
            this.time2 = f11;
            this.f1140x1 = f12;
            this.f1142y1 = f13;
            this.f1141x2 = f14;
            this.f1143y2 = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            float f18 = z11 ? -1.0f : 1.0f;
            this.vertical = f18;
            float f19 = 1 / (f11 - f10);
            this.oneOverDeltaTime = f19;
            this.lut = new float[101];
            boolean z12 = i10 == 3;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f19;
                this.ellipseCenterX = f16 * f19;
                this.ellipseCenterY = f17 * f19;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f16 * f18;
                this.ellipseB = f17 * (-f18);
                this.ellipseCenterX = z11 ? f14 : f12;
                this.ellipseCenterY = z11 ? f13 : f15;
                buildTable$animation_core_release(f12, f13, f14, f15);
                this.arcVelocity = this.arcDistance * f19;
                z10 = z12;
            }
            this.isLinear = z10;
        }

        private final float calcAngle(float f10) {
            return lookup((this.vertical == -1.0f ? this.time2 - f10 : f10 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
        }

        private final float lookup(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float f11 = f10 * 100;
            int i10 = (int) f11;
            float f12 = f11 - i10;
            float[] fArr = this.lut;
            float f13 = fArr[i10];
            return f13 + (f12 * (fArr[i10 + 1] - f13));
        }

        public final void buildTable$animation_core_release(float f10, float f11, float f12, float f13) {
            float f14;
            float f15;
            float fHypot;
            float f16 = f12 - f10;
            float f17 = f11 - f13;
            float[] fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            float f18 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f19 = f17;
                int i10 = 1;
                fHypot = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    f15 = 0.0f;
                    double radians = (float) Math.toRadians((i10 * 90.0d) / length);
                    float fSin = ((float) Math.sin(radians)) * f16;
                    float fCos = ((float) Math.cos(radians)) * f17;
                    f14 = f18;
                    fHypot += (float) Math.hypot(fSin - f20, fCos - f19);
                    fArr[i10] = fHypot;
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    f19 = fCos;
                    f18 = f14;
                    f20 = fSin;
                }
            } else {
                f14 = f18;
                f15 = 0.0f;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i11 = 1;
                while (true) {
                    fArr[i11] = fArr[i11] / fHypot;
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                float f21 = i12 / 100.0f;
                int iM14642i = AbstractC8797p.m14642i(fArr, f21, 0, 0, 6, null);
                if (iM14642i >= 0) {
                    fArr2[i12] = iM14642i / f14;
                } else if (iM14642i == -1) {
                    fArr2[i12] = f15;
                } else {
                    int i13 = -iM14642i;
                    int i14 = i13 - 2;
                    float f22 = i14;
                    float f23 = fArr[i14];
                    fArr2[i12] = (f22 + ((f21 - f23) / (fArr[i13 - 1] - f23))) / f14;
                }
            }
        }

        public final float calcDX() {
            float f10 = this.ellipseA * this.tmpCosAngle;
            return f10 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f10, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float calcDY() {
            float f10 = this.ellipseA * this.tmpCosAngle;
            float f11 = (-this.ellipseB) * this.tmpSinAngle;
            return f11 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f10, f11)));
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        public final float getLinearDX$animation_core_release() {
            return this.ellipseCenterX;
        }

        public final float getLinearDY$animation_core_release() {
            return this.ellipseCenterY;
        }

        public final float getLinearX(float f10) {
            float f11 = (f10 - this.time1) * this.oneOverDeltaTime;
            float f12 = this.f1140x1;
            return f12 + (f11 * (this.f1141x2 - f12));
        }

        public final float getLinearY(float f10) {
            float f11 = (f10 - this.time1) * this.oneOverDeltaTime;
            float f12 = this.f1142y1;
            return f12 + (f11 * (this.f1143y2 - f12));
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final void setPoint(float f10) {
            double dLookup = lookup((this.vertical == -1.0f ? this.time2 - f10 : f10 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dLookup);
            this.tmpCosAngle = (float) Math.cos(dLookup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcSpline(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r0.<init>()
            r2 = 1
            r0.isExtrapolate = r2
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.compose.animation.core.ArcSpline$Arc[][] r4 = new androidx.compose.animation.core.ArcSpline.Arc[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L69
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r2 = r8.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            androidx.compose.animation.core.ArcSpline$Arc[] r11 = new androidx.compose.animation.core.ArcSpline.Arc[r2]
            r12 = r5
        L45:
            if (r12 >= r2) goto L63
            int r16 = r12 * 2
            r17 = r12
            androidx.compose.animation.core.ArcSpline$Arc r12 = new androidx.compose.animation.core.ArcSpline$Arc
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L45
        L63:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r2 = 1
            goto L12
        L69:
            r0.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }

    public final void getPos(float f10, float[] fArr) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i10 = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = fArr.length;
        if (!this.isExtrapolate) {
            f10 = Math.min(Math.max(f10, time1), time2);
        } else if (f10 < time1 || f10 > time2) {
            if (f10 > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f11 = f10 - time1;
            int i11 = 0;
            while (i10 < length2 - 1) {
                Arc arc = arcArr[length][i11];
                if (arc.isLinear) {
                    fArr[i10] = arc.getLinearX(time1) + (arc.ellipseCenterX * f11);
                    fArr[i10 + 1] = arc.getLinearY(time1) + (arc.ellipseCenterY * f11);
                } else {
                    arc.setPoint(time1);
                    fArr[i10] = arc.ellipseCenterX + (arc.ellipseA * arc.tmpSinAngle) + (arc.calcDX() * f11);
                    fArr[i10 + 1] = arc.ellipseCenterY + (arc.ellipseB * arc.tmpCosAngle) + (arc.calcDY() * f11);
                }
                i10 += 2;
                i11++;
            }
            return;
        }
        boolean z10 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < length2 - 1) {
                Arc arc2 = arcArr2[i13];
                if (f10 <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        fArr[i12] = arc2.getLinearX(f10);
                        fArr[i12 + 1] = arc2.getLinearY(f10);
                    } else {
                        arc2.setPoint(f10);
                        fArr[i12] = arc2.ellipseCenterX + (arc2.ellipseA * arc2.tmpSinAngle);
                        fArr[i12 + 1] = arc2.ellipseCenterY + (arc2.ellipseB * arc2.tmpCosAngle);
                    }
                    z10 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z10) {
                return;
            }
        }
    }

    public final void getSlope(float f10, float[] fArr) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (f10 < time1) {
            f10 = time1;
        }
        if (f10 <= time2) {
            time2 = f10;
        }
        int length = fArr.length;
        boolean z10 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < length - 1) {
                Arc arc = arcArr2[i11];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        fArr[i10] = arc.ellipseCenterX;
                        fArr[i10 + 1] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        fArr[i10] = arc.calcDX();
                        fArr[i10 + 1] = arc.calcDY();
                    }
                    z10 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z10) {
                return;
            }
        }
    }
}
