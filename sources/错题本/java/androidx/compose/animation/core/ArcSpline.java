package androidx.compose.animation.core;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "Ld6/s;", "getPos", "(F[F)V", "getSlope", "Landroidx/compose/animation/core/ArcSpline$Arc;", "arcs", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "", "isExtrapolate", "Z", "Arc", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n+ 2 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,393:1\n222#2:394\n225#2:395\n273#2:396\n277#2:397\n273#2:398\n277#2:399\n222#2:410\n225#2:411\n65#3,10:400\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n*L\n115#1:394\n116#1:395\n119#1:396\n120#1:397\n145#1:398\n146#1:399\n174#1:410\n175#1:411\n162#1:400,10\n*E\n"})
/* loaded from: classes.dex */
public final class ArcSpline {
    public static final int $stable = 8;

    @NotNull
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u000fJ/\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0014\u0010+\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0014\u0010,\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0014\u0010.\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001fR\u0014\u00101\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001fR\u0015\u00103\u001a\u00020\u00048À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R\u0015\u00105\u001a\u00020\u00048À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0016¨\u00066"}, m5110d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "time", "calcAngle", "(F)F", "v", "lookup", "Ld6/s;", "setPoint", "(F)V", "calcX", "()F", "calcY", "calcDX", "calcDY", "getLinearX", "getLinearY", "buildTable$animation_core_release", "(FFFF)V", "buildTable", "F", "getTime1", "getTime2", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "lut", "[F", "oneOverDeltaTime", "arcVelocity", "vertical", "ellipseA", "ellipseB", "", "isLinear", "Z", "ellipseCenterX", "ellipseCenterY", "getLinearDX$animation_core_release", "linearDX", "getLinearDY$animation_core_release", "linearDY", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

        @NotNull
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

        public Arc(int i, float f, float f7, float f8, float f9, float f10, float f11) {
            this.time1 = f;
            this.time2 = f7;
            this.x1 = f8;
            this.y1 = f9;
            this.x2 = f10;
            this.y2 = f11;
            float f12 = f10 - f8;
            float f13 = f11 - f9;
            boolean z8 = true;
            boolean z9 = i == 1 || (i == 4 ? f13 > 0.0f : !(i != 5 || f13 >= 0.0f));
            float f14 = z9 ? -1.0f : 1.0f;
            this.vertical = f14;
            float f15 = 1 / (f7 - f);
            this.oneOverDeltaTime = f15;
            this.lut = new float[TypedValues.TYPE_TARGET];
            boolean z10 = i == 3;
            if (z10 || Math.abs(f12) < 0.001f || Math.abs(f13) < 0.001f) {
                float fHypot = (float) Math.hypot(f13, f12);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f15;
                this.ellipseCenterX = f12 * f15;
                this.ellipseCenterY = f13 * f15;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f12 * f14;
                this.ellipseB = f13 * (-f14);
                this.ellipseCenterX = z9 ? f10 : f8;
                this.ellipseCenterY = z9 ? f9 : f11;
                buildTable$animation_core_release(f8, f9, f10, f11);
                this.arcVelocity = this.arcDistance * f15;
                z8 = z10;
            }
            this.isLinear = z8;
        }

        private final float calcAngle(float time) {
            return lookup((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
        }

        private final float lookup(float v2) {
            if (v2 <= 0.0f) {
                return 0.0f;
            }
            if (v2 >= 1.0f) {
                return 1.0f;
            }
            float f = v2 * 100;
            int i = (int) f;
            float f7 = f - i;
            float[] fArr = this.lut;
            float f8 = fArr[i];
            return AbstractC0037f.m77b(fArr[i + 1], f8, f7, f8);
        }

        public final void buildTable$animation_core_release(float x12, float y12, float x22, float y2) {
            float f;
            float fHypot;
            float f7 = x22 - x12;
            float f8 = y12 - y2;
            float[] fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            float f9 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f10 = f8;
                int i = 1;
                fHypot = 0.0f;
                float f11 = 0.0f;
                while (true) {
                    f = f9;
                    double radians = (float) Math.toRadians((i * 90.0d) / length);
                    float fSin = ((float) Math.sin(radians)) * f7;
                    float fCos = ((float) Math.cos(radians)) * f8;
                    fHypot += (float) Math.hypot(fSin - f11, fCos - f10);
                    fArr[i] = fHypot;
                    if (i == length) {
                        break;
                    }
                    i++;
                    f9 = f;
                    f10 = fCos;
                    f11 = fSin;
                }
            } else {
                f = f9;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i8 = 1;
                while (true) {
                    fArr[i8] = fArr[i8] / fHypot;
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i9 = 0; i9 < length2; i9++) {
                float f12 = i9 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr, 0, fArr.length, f12);
                if (iBinarySearch >= 0) {
                    fArr2[i9] = iBinarySearch / f;
                } else if (iBinarySearch == -1) {
                    fArr2[i9] = 0.0f;
                } else {
                    int i10 = -iBinarySearch;
                    int i11 = i10 - 2;
                    float f13 = i11;
                    float f14 = fArr[i11];
                    fArr2[i9] = (((f12 - f14) / (fArr[i10 - 1] - f14)) + f13) / f;
                }
            }
        }

        public final float calcDX() {
            float f = this.ellipseA * this.tmpCosAngle;
            return f * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float calcDY() {
            float f = this.ellipseA * this.tmpCosAngle;
            float f7 = (-this.ellipseB) * this.tmpSinAngle;
            return f7 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, f7)));
        }

        public final float calcX() {
            return (this.tmpSinAngle * this.ellipseA) + this.ellipseCenterX;
        }

        public final float calcY() {
            return (this.tmpCosAngle * this.ellipseB) + this.ellipseCenterY;
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
            float f = (time - this.time1) * this.oneOverDeltaTime;
            float f7 = this.x1;
            return AbstractC0037f.m77b(this.x2, f7, f, f7);
        }

        public final float getLinearY(float time) {
            float f = (time - this.time1) * this.oneOverDeltaTime;
            float f7 = this.y1;
            return AbstractC0037f.m77b(this.y2, f7, f, f7);
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
    public ArcSpline(@org.jetbrains.annotations.NotNull int[] r22, @org.jetbrains.annotations.NotNull float[] r23, @org.jetbrains.annotations.NotNull float[][] r24) {
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

    public final void getPos(float time, @NotNull float[] v2) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = v2.length;
        if (!this.isExtrapolate) {
            time = Math.min(Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f = time - time1;
            int i8 = 0;
            while (i < length2 - 1) {
                Arc arc = arcArr[length][i8];
                if (arc.isLinear) {
                    v2[i] = (arc.ellipseCenterX * f) + arc.getLinearX(time1);
                    v2[i + 1] = (arc.ellipseCenterY * f) + arc.getLinearY(time1);
                } else {
                    arc.setPoint(time1);
                    v2[i] = (arc.calcDX() * f) + (arc.tmpSinAngle * arc.ellipseA) + arc.ellipseCenterX;
                    v2[i + 1] = (arc.calcDY() * f) + (arc.tmpCosAngle * arc.ellipseB) + arc.ellipseCenterY;
                }
                i += 2;
                i8++;
            }
            return;
        }
        boolean z8 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < length2 - 1) {
                Arc arc2 = arcArr2[i10];
                if (time <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        v2[i9] = arc2.getLinearX(time);
                        v2[i9 + 1] = arc2.getLinearY(time);
                    } else {
                        arc2.setPoint(time);
                        v2[i9] = (arc2.tmpSinAngle * arc2.ellipseA) + arc2.ellipseCenterX;
                        v2[i9 + 1] = (arc2.tmpCosAngle * arc2.ellipseB) + arc2.ellipseCenterY;
                    }
                    z8 = true;
                }
                i9 += 2;
                i10++;
            }
            if (z8) {
                return;
            }
        }
    }

    public final void getSlope(float time, @NotNull float[] v2) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v2.length;
        boolean z8 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i = 0;
            int i8 = 0;
            while (i < length - 1) {
                Arc arc = arcArr2[i8];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        v2[i] = arc.ellipseCenterX;
                        v2[i + 1] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        v2[i] = arc.calcDX();
                        v2[i + 1] = arc.calcDY();
                    }
                    z8 = true;
                }
                i += 2;
                i8++;
            }
            if (z8) {
                return;
            }
        }
    }
}
