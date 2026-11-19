package androidx.compose.p014ui.node;

/* loaded from: classes2.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m32509boximpl(int i10) {
        return new NodeKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m32510constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32511equalsimpl(int i10, Object obj) {
        return (obj instanceof NodeKind) && i10 == ((NodeKind) obj).m32517unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32512equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32513hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m32514orH91voCI(int i10, int i11) {
        return i10 | i11;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m32515orimpl(int i10, int i11) {
        return i10 | i11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32516toStringimpl(int i10) {
        return "NodeKind(mask=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m32511equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m32513hashCodeimpl(this.mask);
    }

    public String toString() {
        return m32516toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32517unboximpl() {
        return this.mask;
    }
}
