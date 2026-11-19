package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m33733constructorimpl(0);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m33749getZero9UxMQ8M$annotations() {
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m33750getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Velocity(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m33730boximpl(long j10) {
        return new Velocity(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m33731component1impl(long j10) {
        return m33739getXimpl(j10);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m33732component2impl(long j10) {
        return m33740getYimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33733constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m33734copyOhffZ5M(long j10, float f10, float f11) {
        return m33733constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m33735copyOhffZ5M$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m33734copyOhffZ5M(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m33736divadjELrA(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m33733constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33737equalsimpl(long j10, Object obj) {
        return (obj instanceof Velocity) && j10 == ((Velocity) obj).m33748unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33738equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m33739getXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m33740getYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33741hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m33742minusAH228Gc(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m33733constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m33743plusAH228Gc(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m33733constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m33744remadjELrA(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) % f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) % f10;
        return m33733constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m33745timesadjELrA(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m33733constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33746toStringimpl(long j10) {
        return '(' + m33739getXimpl(j10) + ", " + m33740getYimpl(j10) + ") px/sec";
    }

    @Stable
    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m33747unaryMinus9UxMQ8M(long j10) {
        return m33733constructorimpl(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m33737equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m33741hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m33746toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33748unboximpl() {
        return this.packedValue;
    }
}
