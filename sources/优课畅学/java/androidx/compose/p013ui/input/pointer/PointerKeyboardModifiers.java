package androidx.compose.p013ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i10) {
        this.packedValue = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m25563boximpl(int i10) {
        return new PointerKeyboardModifiers(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25564constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25565equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i10 == ((PointerKeyboardModifiers) obj).m25569unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25566equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25567hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25568toStringimpl(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m25565equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m25567hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m25568toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25569unboximpl() {
        return this.packedValue;
    }
}
