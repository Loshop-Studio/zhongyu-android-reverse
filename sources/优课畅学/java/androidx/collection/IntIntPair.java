package androidx.collection;

/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m20120boximpl(long j10) {
        return new IntIntPair(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m20121component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m20122component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20124constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20125equalsimpl(long j10, Object obj) {
        return (obj instanceof IntIntPair) && j10 == ((IntIntPair) obj).m20131unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20126equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m20127getFirstimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m20128getSecondimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20129hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20130toStringimpl(long j10) {
        return '(' + m20127getFirstimpl(j10) + ", " + m20128getSecondimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m20125equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m20129hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m20130toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20131unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20123constructorimpl(int i10, int i11) {
        return m20124constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }
}
