package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m27065constructorimpl(0);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m27075getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntSize(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m27062boximpl(long j10) {
        return new IntSize(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m27063component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m27064component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27065constructorimpl(long j10) {
        return j10;
    }

    @Stable
    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m27066divYEO4UFw(long j10, int i10) {
        return m27065constructorimpl(((((int) (j10 >> 32)) / i10) << 32) | ((((int) (j10 & 4294967295L)) / i10) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27067equalsimpl(long j10, Object obj) {
        return (obj instanceof IntSize) && j10 == ((IntSize) obj).m27074unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27068equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m27069getHeightimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m27070getWidthimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27071hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m27072timesYEO4UFw(long j10, int i10) {
        return m27065constructorimpl(((((int) (j10 >> 32)) * i10) << 32) | ((((int) (j10 & 4294967295L)) * i10) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27073toStringimpl(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m27067equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m27071hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m27073toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27074unboximpl() {
        return this.packedValue;
    }
}
