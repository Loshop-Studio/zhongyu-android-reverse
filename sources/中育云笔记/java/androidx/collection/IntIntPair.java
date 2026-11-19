package androidx.collection;

/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m26722boximpl(long j10) {
        return new IntIntPair(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m26723component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m26724component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26726constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26727equalsimpl(long j10, Object obj) {
        return (obj instanceof IntIntPair) && j10 == ((IntIntPair) obj).m26733unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26728equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m26729getFirstimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m26730getSecondimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26731hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26732toStringimpl(long j10) {
        return '(' + m26729getFirstimpl(j10) + ", " + m26730getSecondimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m26727equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m26731hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m26732toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m26733unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26725constructorimpl(int i10, int i11) {
        return m26726constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }
}
