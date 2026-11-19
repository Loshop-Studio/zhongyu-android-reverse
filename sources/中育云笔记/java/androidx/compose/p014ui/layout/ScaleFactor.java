package androidx.compose.p014ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class ScaleFactor {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m32312constructorimpl((Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L));
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m32324getUnspecified_hLwfpc$annotations() {
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m32325getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ScaleFactor(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m32309boximpl(long j10) {
        return new ScaleFactor(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m32310component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m32311component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m32312constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m32313copy8GGzs04(long j10, float f10, float f11) {
        return m32312constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m32314copy8GGzs04$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m32313copy8GGzs04(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m32315div44nBxM0(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m32312constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32316equalsimpl(long j10, Object obj) {
        return (obj instanceof ScaleFactor) && j10 == ((ScaleFactor) obj).m32323unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32317equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m32318getScaleXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m32319getScaleYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32320hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m32321times44nBxM0(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m32312constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32322toStringimpl(long j10) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m32316equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m32320hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32322toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32323unboximpl() {
        return this.packedValue;
    }
}
