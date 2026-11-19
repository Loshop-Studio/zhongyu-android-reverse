package androidx.compose.p014ui.text.android;

/* loaded from: classes2.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m33013boximpl(long j10) {
        return new VerticalPaddings(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33014constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33015equalsimpl(long j10, Object obj) {
        return (obj instanceof VerticalPaddings) && j10 == ((VerticalPaddings) obj).m33021unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33016equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m33017getBottomPaddingimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m33018getTopPaddingimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33019hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33020toStringimpl(long j10) {
        return "VerticalPaddings(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m33015equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m33019hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m33020toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33021unboximpl() {
        return this.packedValue;
    }
}
