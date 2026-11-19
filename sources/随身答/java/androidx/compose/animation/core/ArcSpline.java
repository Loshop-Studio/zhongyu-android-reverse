package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m13413d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "arcModes", "", "timePoints", "", "y", "", "([I[F[[F)V", "arcs", "Landroidx/compose/animation/core/ArcSpline$Arc;", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "isExtrapolate", "", "getPos", "", "time", "", "v", "getSlope", "Arc", "animation-core_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n+ 2 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,393:1\n222#2:394\n225#2:395\n273#2:396\n277#2:397\n273#2:398\n277#2:399\n222#2:410\n225#2:411\n65#3,10:400\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n*L\n115#1:394\n116#1:395\n119#1:396\n120#1:397\n145#1:398\n146#1:399\n174#1:410\n175#1:411\n162#1:400,10\n*E\n"})
/* loaded from: classes.dex */
public final class ArcSpline {
    public static final int $stable = 8;
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    @StabilityInferred(parameters = 0)
    @Metadata(m13412d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ-\u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0002\b#J\u0011\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0082\bJ\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005J\t\u0010(\u001a\u00020\u0005H\u0086\bJ\t\u0010)\u001a\u00020\u0005H\u0086\bJ\u000e\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0002J\u000e\u0010.\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0014\u001a\u00020\u00058À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0017\u001a\u00020\u00058À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m13413d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "mode", "", "time1", "", "time2", "x1", "y1", "x2", "y2", "(IFFFFFF)V", "arcDistance", "arcVelocity", "ellipseA", "ellipseB", "ellipseCenterX", "ellipseCenterY", "isLinear", "", "linearDX", "getLinearDX$animation_core_release", "()F", "linearDY", "getLinearDY$animation_core_release", "lut", "", "oneOverDeltaTime", "getTime1", "getTime2", "tmpCosAngle", "tmpSinAngle", "vertical", "buildTable", "", "buildTable$animation_core_release", "calcAngle", "time", "calcDX", "calcDY", "calcX", "calcY", "getLinearX", "getLinearY", "lookup", "v", "setPoint", "animation-core_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.jvm.kt\nandroidx/compose/animation/core/ArcSpline_jvmKt\n*L\n1#1,393:1\n268#1,2:394\n21#2:396\n26#2:397\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n262#1:394,2\n334#1:396\n353#1:397\n*E\n"})
    public static final class Arc {
        public static final int $stable = 8;
        private float arcDistance;
        private final float arcVelocity;

        @JvmField
        public final float ellipseA;

        @JvmField
        public final float ellipseB;

        @JvmField
        public final float ellipseCenterX;

        @JvmField
        public final float ellipseCenterY;

        @JvmField
        public final boolean isLinear;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public Arc(int i9, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.time1 = f10;
            this.time2 = f11;
            this.x1 = f12;
            this.y1 = f13;
            this.x2 = f14;
            this.y2 = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z9 = true;
            boolean z10 = i9 == 1 || (i9 == 4 ? f17 > 0.0f : !(i9 != 5 || f17 >= 0.0f));
            float f18 = z10 ? -1.0f : 1.0f;
            this.vertical = f18;
            float f19 = 1 / (f11 - f10);
            this.oneOverDeltaTime = f19;
            this.lut = new float[101];
            boolean z11 = i9 == 3;
            if (z11 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
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
                this.ellipseCenterX = z10 ? f14 : f12;
                this.ellipseCenterY = z10 ? f13 : f15;
                buildTable$animation_core_release(f12, f13, f14, f15);
                this.arcVelocity = this.arcDistance * f19;
                z9 = z11;
            }
            this.isLinear = z9;
        }

        private final float calcAngle(float time) {
            return lookup((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
        }

        private final float lookup(float v9) {
            if (v9 <= 0.0f) {
                return 0.0f;
            }
            if (v9 >= 1.0f) {
                return 1.0f;
            }
            float f10 = v9 * 100;
            int i9 = (int) f10;
            float f11 = f10 - i9;
            float[] fArr = this.lut;
            float f12 = fArr[i9];
            return f12 + (f11 * (fArr[i9 + 1] - f12));
        }

        public final void buildTable$animation_core_release(float x12, float y12, float x22, float y22) {
            float f10;
            float f11;
            float fHypot;
            float f12 = x22 - x12;
            float f13 = y12 - y22;
            float[] fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            float f14 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f15 = f13;
                int i9 = 1;
                fHypot = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    f11 = 0.0f;
                    double radians = (float) Math.toRadians((i9 * 90.0d) / length);
                    float fSin = ((float) Math.sin(radians)) * f12;
                    float fCos = ((float) Math.cos(radians)) * f13;
                    f10 = f14;
                    fHypot += (float) Math.hypot(fSin - f16, fCos - f15);
                    fArr[i9] = fHypot;
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    f15 = fCos;
                    f14 = f10;
                    f16 = fSin;
                }
            } else {
                f10 = f14;
                f11 = 0.0f;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i10 = 1;
                while (true) {
                    fArr[i10] = fArr[i10] / fHypot;
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float f17 = i11 / 100.0f;
                int iBinarySearch$default = ArraysKt.binarySearch$default(fArr, f17, 0, 0, 6, (Object) null);
                if (iBinarySearch$default >= 0) {
                    fArr2[i11] = iBinarySearch$default / f10;
                } else if (iBinarySearch$default == -1) {
                    fArr2[i11] = f11;
                } else {
                    int i12 = -iBinarySearch$default;
                    int i13 = i12 - 2;
                    float f18 = i13;
                    float f19 = fArr[i13];
                    fArr2[i11] = (f18 + ((f17 - f19) / (fArr[i12 - 1] - f19))) / f10;
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

        /* renamed from: getLinearDX$animation_core_release, reason: from getter */
        public final float getEllipseCenterX() {
            return this.ellipseCenterX;
        }

        /* renamed from: getLinearDY$animation_core_release, reason: from getter */
        public final float getEllipseCenterY() {
            return this.ellipseCenterY;
        }

        public final float getLinearX(float time) {
            float f10 = (time - this.time1) * this.oneOverDeltaTime;
            float f11 = this.x1;
            return f11 + (f10 * (this.x2 - f11));
        }

        public final float getLinearY(float time) {
            float f10 = (time - this.time1) * this.oneOverDeltaTime;
            float f11 = this.y1;
            return f11 + (f10 * (this.y2 - f11));
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final void setPoint(float time) {
            double dLookup = lookup((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
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

    public final void getPos(float time, float[] v9) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i9 = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = v9.length;
        if (!this.isExtrapolate) {
            time = Math.min(Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f10 = time - time1;
            int i10 = 0;
            while (i9 < length2 - 1) {
                Arc arc = arcArr[length][i10];
                if (arc.isLinear) {
                    v9[i9] = arc.getLinearX(time1) + (arc.ellipseCenterX * f10);
                    v9[i9 + 1] = arc.getLinearY(time1) + (arc.ellipseCenterY * f10);
                } else {
                    arc.setPoint(time1);
                    v9[i9] = arc.ellipseCenterX + (arc.ellipseA * arc.tmpSinAngle) + (arc.calcDX() * f10);
                    v9[i9 + 1] = arc.ellipseCenterY + (arc.ellipseB * arc.tmpCosAngle) + (arc.calcDY() * f10);
                }
                i9 += 2;
                i10++;
            }
            return;
        }
        boolean z9 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < length2 - 1) {
                Arc arc2 = arcArr2[i12];
                if (time <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        v9[i11] = arc2.getLinearX(time);
                        v9[i11 + 1] = arc2.getLinearY(time);
                    } else {
                        arc2.setPoint(time);
                        v9[i11] = arc2.ellipseCenterX + (arc2.ellipseA * arc2.tmpSinAngle);
                        v9[i11 + 1] = arc2.ellipseCenterY + (arc2.ellipseB * arc2.tmpCosAngle);
                    }
                    z9 = true;
                }
                i11 += 2;
                i12++;
            }
            if (z9) {
                return;
            }
        }
    }

    public final void getSlope(float time, float[] v9) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v9.length;
        boolean z9 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < length - 1) {
                Arc arc = arcArr2[i10];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        v9[i9] = arc.ellipseCenterX;
                        v9[i9 + 1] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        v9[i9] = arc.calcDX();
                        v9[i9 + 1] = arc.calcDY();
                    }
                    z9 = true;
                }
                i9 += 2;
                i10++;
            }
            if (z9) {
                return;
            }
        }
    }
}
