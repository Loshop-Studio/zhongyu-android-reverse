package androidx.compose.foundation.layout;

import androidx.compose.animation.AbstractC0321a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m5175d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n25#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n684#1:709,3\n*E\n"})
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    @Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m5175d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n34#2:709\n41#2:710\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n701#1:709\n706#1:710\n*E\n"})
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j4) {
            this.packedValue = j4;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m7254boximpl(long j4) {
            return new FlingResult(j4);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m7255constructorimpl(long j4) {
            return j4;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7256equalsimpl(long j4, Object obj) {
            return (obj instanceof FlingResult) && j4 == ((FlingResult) obj).getPackedValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7257equalsimpl0(long j4, long j5) {
            return j4 == j5;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m7258getDistanceCoefficientimpl(long j4) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j4 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m7259getVelocityCoefficientimpl(long j4) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j4 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7260hashCodeimpl(long j4) {
            return AbstractC0321a.m137a(j4);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7261toStringimpl(long j4) {
            return "FlingResult(packedValue=" + j4 + ')';
        }

        public boolean equals(Object obj) {
            return m7256equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m7260hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m7261toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }

    static {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i4 = 0; i4 < 100; i4++) {
            float f14 = i4 / 100;
            float f15 = 1.0f;
            while (true) {
                f4 = ((f15 - f12) / 2.0f) + f12;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f16 = (((f5 * 0.175f) + (f4 * 0.35000002f)) * f6) + f7;
                if (Math.abs(f16 - f14) < 1.0E-5d) {
                    break;
                } else if (f16 > f14) {
                    f15 = f4;
                } else {
                    f12 = f4;
                }
            }
            float f17 = 0.5f;
            SplinePositions[i4] = (f6 * ((f5 * 0.5f) + f4)) + f7;
            float f18 = 1.0f;
            while (true) {
                f8 = ((f18 - f13) / 2.0f) + f13;
                f9 = 1.0f - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f19 = (((f9 * f17) + f8) * f10) + f11;
                if (Math.abs(f19 - f14) >= 1.0E-5d) {
                    if (f19 > f14) {
                        f18 = f8;
                    } else {
                        f13 = f8;
                    }
                    f17 = 0.5f;
                }
            }
            SplineTimes[i4] = (f10 * ((f9 * 0.175f) + (f8 * 0.35000002f))) + f11;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m7253flingPositionLfoxSSI(float time) {
        float f4;
        float f5;
        float f6 = 100;
        int i4 = (int) (f6 * time);
        if (i4 < 100) {
            float f7 = i4 / f6;
            int i5 = i4 + 1;
            float f8 = i5 / f6;
            float[] fArr = SplinePositions;
            float f9 = fArr[i4];
            f5 = (fArr[i5] - f9) / (f8 - f7);
            f4 = f9 + ((time - f7) * f5);
        } else {
            f4 = 1.0f;
            f5 = 0.0f;
        }
        return FlingResult.m7255constructorimpl((Float.floatToIntBits(f5) & 4294967295L) | (Float.floatToIntBits(f4) << 32));
    }
}
