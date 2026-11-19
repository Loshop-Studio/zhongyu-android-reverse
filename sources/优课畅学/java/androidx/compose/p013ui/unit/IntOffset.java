package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class IntOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m27021constructorimpl(0);
    private static final long Max = m27021constructorimpl(9223372034707292159L);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m27037getMaxnOccac() {
            return IntOffset.Max;
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m27038getZeronOccac() {
            return IntOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntOffset(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m27018boximpl(long j10) {
        return new IntOffset(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m27019component1impl(long j10) {
        return m27027getXimpl(j10);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m27020component2impl(long j10) {
        return m27028getYimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27021constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m27022copyiSbpLlY(long j10, int i10, int i11) {
        return m27021constructorimpl((i10 << 32) | (i11 & 4294967295L));
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m27023copyiSbpLlY$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (4294967295L & j10);
        }
        return m27022copyiSbpLlY(j10, i10, i11);
    }

    @Stable
    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m27024divBjo55l4(long j10, float f10) {
        return m27021constructorimpl((Math.round(((int) (j10 >> 32)) / f10) << 32) | (Math.round(((int) (j10 & 4294967295L)) / f10) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27025equalsimpl(long j10, Object obj) {
        return (obj instanceof IntOffset) && j10 == ((IntOffset) obj).m27036unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27026equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m27027getXimpl(long j10) {
        return (int) (j10 >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m27028getYimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27029hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m27030minusqkQi6aY(long j10, long j11) {
        return m27021constructorimpl(((((int) (j10 >> 32)) - ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L))) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m27031plusqkQi6aY(long j10, long j11) {
        return m27021constructorimpl(((((int) (j10 >> 32)) + ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))) & 4294967295L));
    }

    @Stable
    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m27032remBjo55l4(long j10, int i10) {
        return m27021constructorimpl(((((int) (j10 >> 32)) % i10) << 32) | ((((int) (j10 & 4294967295L)) % i10) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m27033timesBjo55l4(long j10, float f10) {
        return m27021constructorimpl((Math.round(((int) (j10 >> 32)) * f10) << 32) | (Math.round(((int) (j10 & 4294967295L)) * f10) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27034toStringimpl(long j10) {
        return '(' + m27027getXimpl(j10) + ", " + m27028getYimpl(j10) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m27035unaryMinusnOccac(long j10) {
        return m27021constructorimpl(((-((int) (j10 & 4294967295L))) & 4294967295L) | ((-((int) (j10 >> 32))) << 32));
    }

    public boolean equals(Object obj) {
        return m27025equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m27029hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m27034toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27036unboximpl() {
        return this.packedValue;
    }
}
