package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m7880d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n53#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n686#1:709,3\n*E\n"})
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    @Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0019"}, m7880d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n60#2:709\n70#2:711\n22#3:710\n22#3:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n698#1:709\n705#1:711\n698#1:710\n705#1:712\n*E\n"})
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j6) {
            this.packedValue = j6;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m10476boximpl(long j6) {
            return new FlingResult(j6);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m10477constructorimpl(long j6) {
            return j6;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10478equalsimpl(long j6, Object obj) {
            return (obj instanceof FlingResult) && j6 == ((FlingResult) obj).getPackedValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10479equalsimpl0(long j6, long j7) {
            return j6 == j7;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m10480getDistanceCoefficientimpl(long j6) {
            return Float.intBitsToFloat((int) (j6 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m10481getVelocityCoefficientimpl(long j6) {
            return Float.intBitsToFloat((int) (j6 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10482hashCodeimpl(long j6) {
            return Long.hashCode(j6);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10483toStringimpl(long j6) {
            return "FlingResult(packedValue=" + j6 + ')';
        }

        public boolean equals(Object obj) {
            return m10478equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m10482hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m10483toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }

    static {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        int i6 = 0;
        float f17 = 0.0f;
        while (true) {
            float f18 = 1.0f;
            if (i6 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f19 = i6 / 100;
            float f20 = 1.0f;
            while (true) {
                f6 = ((f20 - f16) / 2.0f) + f16;
                f7 = f18 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f21 = (((f7 * 0.175f) + (f6 * 0.35000002f)) * f8) + f9;
                f10 = f18;
                f11 = f19;
                if (Math.abs(f21 - f19) < 1.0E-5d) {
                    break;
                }
                if (f21 > f11) {
                    f20 = f6;
                } else {
                    f16 = f6;
                }
                f18 = f10;
                f19 = f11;
            }
            SplinePositions[i6] = (f8 * ((f7 * 0.5f) + f6)) + f9;
            float f22 = f10;
            while (true) {
                f12 = ((f22 - f17) / 2.0f) + f17;
                f13 = f10 - f12;
                f14 = f12 * 3.0f * f13;
                f15 = f12 * f12 * f12;
                float f23 = (((f13 * 0.5f) + f12) * f14) + f15;
                if (Math.abs(f23 - f11) >= 1.0E-5d) {
                    if (f23 > f11) {
                        f22 = f12;
                    } else {
                        f17 = f12;
                    }
                }
            }
            SplineTimes[i6] = (f14 * ((f13 * 0.175f) + (f12 * 0.35000002f))) + f15;
            i6++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m10475flingPositionLfoxSSI(float time) {
        float f6;
        float f7;
        float f8 = 100;
        int i6 = (int) (f8 * time);
        if (i6 < 100) {
            float f9 = i6 / f8;
            int i7 = i6 + 1;
            float f10 = i7 / f8;
            float[] fArr = SplinePositions;
            float f11 = fArr[i6];
            f7 = (fArr[i7] - f11) / (f10 - f9);
            f6 = f11 + ((time - f9) * f7);
        } else {
            f6 = 1.0f;
            f7 = 0.0f;
        }
        return FlingResult.m10477constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
    }
}
