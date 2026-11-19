package androidx.compose.p013ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m25481boximpl(long j10) {
        return new PointerId(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m25482constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25483equalsimpl(long j10, Object obj) {
        return (obj instanceof PointerId) && j10 == ((PointerId) obj).m25487unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25484equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25485hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25486toStringimpl(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m25483equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m25485hashCodeimpl(this.value);
    }

    public String toString() {
        return m25486toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m25487unboximpl() {
        return this.value;
    }
}
