package androidx.compose.foundation.layout;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m5110d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n53#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n686#1:709,3\n*E\n"})
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;

    @NotNull
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    @NotNull
    private static final float[] SplinePositions = new float[TypedValues.TYPE_TARGET];

    @NotNull
    private static final float[] SplineTimes = new float[TypedValues.TYPE_TARGET];

    @Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n60#2:709\n70#2:711\n22#3:710\n22#3:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n698#1:709\n705#1:711\n698#1:710\n705#1:712\n*E\n"})
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j7) {
            this.packedValue = j7;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m7134boximpl(long j7) {
            return new FlingResult(j7);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m7135constructorimpl(long j7) {
            return j7;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7136equalsimpl(long j7, Object obj) {
            return (obj instanceof FlingResult) && j7 == ((FlingResult) obj).getPackedValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7137equalsimpl0(long j7, long j8) {
            return j7 == j8;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m7138getDistanceCoefficientimpl(long j7) {
            return Float.intBitsToFloat((int) (j7 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m7139getVelocityCoefficientimpl(long j7) {
            return Float.intBitsToFloat((int) (j7 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7140hashCodeimpl(long j7) {
            return Long.hashCode(j7);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7141toStringimpl(long j7) {
            return "FlingResult(packedValue=" + j7 + ')';
        }

        public boolean equals(Object obj) {
            return m7136equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m7140hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m7141toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }

    static {
        float fM900a;
        float f;
        float f7;
        float f8;
        float f9;
        float f10;
        float fM900a2;
        float f11;
        float f12;
        float f13;
        float f14 = 0.0f;
        int i = 0;
        float f15 = 0.0f;
        while (true) {
            float f16 = 1.0f;
            if (i >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f17 = i / 100;
            float f18 = 1.0f;
            while (true) {
                fM900a = AbstractC0584a.m900a(f18, f14, 2.0f, f14);
                f = f16 - fM900a;
                f7 = fM900a * 3.0f * f;
                f8 = fM900a * fM900a * fM900a;
                float fM925z = AbstractC0584a.m925z(fM900a, 0.35000002f, f * 0.175f, f7) + f8;
                f9 = f16;
                f10 = f17;
                if (Math.abs(fM925z - f17) < 1.0E-5d) {
                    break;
                }
                if (fM925z > f10) {
                    f18 = fM900a;
                } else {
                    f14 = fM900a;
                }
                f16 = f9;
                f17 = f10;
            }
            SplinePositions[i] = (((f * 0.5f) + fM900a) * f7) + f8;
            float f19 = f9;
            while (true) {
                fM900a2 = AbstractC0584a.m900a(f19, f15, 2.0f, f15);
                f11 = f9 - fM900a2;
                f12 = fM900a2 * 3.0f * f11;
                f13 = fM900a2 * fM900a2 * fM900a2;
                float fM925z2 = AbstractC0584a.m925z(f11, 0.5f, fM900a2, f12) + f13;
                if (Math.abs(fM925z2 - f10) >= 1.0E-5d) {
                    if (fM925z2 > f10) {
                        f19 = fM900a2;
                    } else {
                        f15 = fM900a2;
                    }
                }
            }
            SplineTimes[i] = (((fM900a2 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
            i++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m7133flingPositionLfoxSSI(float time) {
        float fM77b;
        float f;
        float f7 = 100;
        int i = (int) (f7 * time);
        if (i < 100) {
            float f8 = i / f7;
            int i8 = i + 1;
            float f9 = i8 / f7;
            float[] fArr = SplinePositions;
            float f10 = fArr[i];
            f = (fArr[i8] - f10) / (f9 - f8);
            fM77b = AbstractC0037f.m77b(time, f8, f, f10);
        } else {
            fM77b = 1.0f;
            f = 0.0f;
        }
        return FlingResult.m7135constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(fM77b) << 32));
    }
}
