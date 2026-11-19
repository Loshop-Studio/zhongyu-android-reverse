package androidx.compose.p014ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i10) {
        this.packedValue = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m32165boximpl(int i10) {
        return new PointerKeyboardModifiers(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m32166constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32167equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i10 == ((PointerKeyboardModifiers) obj).m32171unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32168equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32169hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32170toStringimpl(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m32167equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m32169hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32170toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32171unboximpl() {
        return this.packedValue;
    }
}
