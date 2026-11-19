package androidx.compose.p013ui.node;

/* loaded from: classes2.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m25907boximpl(int i10) {
        return new NodeKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m25908constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25909equalsimpl(int i10, Object obj) {
        return (obj instanceof NodeKind) && i10 == ((NodeKind) obj).m25915unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25910equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25911hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m25912orH91voCI(int i10, int i11) {
        return i10 | i11;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m25913orimpl(int i10, int i11) {
        return i10 | i11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25914toStringimpl(int i10) {
        return "NodeKind(mask=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m25909equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m25911hashCodeimpl(this.mask);
    }

    public String toString() {
        return m25914toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25915unboximpl() {
        return this.mask;
    }
}
