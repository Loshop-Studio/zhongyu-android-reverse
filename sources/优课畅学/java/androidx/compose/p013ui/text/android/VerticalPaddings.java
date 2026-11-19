package androidx.compose.p013ui.text.android;

/* loaded from: classes2.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m26411boximpl(long j10) {
        return new VerticalPaddings(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26412constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26413equalsimpl(long j10, Object obj) {
        return (obj instanceof VerticalPaddings) && j10 == ((VerticalPaddings) obj).m26419unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26414equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m26415getBottomPaddingimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m26416getTopPaddingimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26417hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26418toStringimpl(long j10) {
        return "VerticalPaddings(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m26413equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m26417hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m26418toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m26419unboximpl() {
        return this.packedValue;
    }
}
