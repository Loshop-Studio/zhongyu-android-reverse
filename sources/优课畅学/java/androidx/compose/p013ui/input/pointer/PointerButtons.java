package androidx.compose.p013ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i10) {
        this.packedValue = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m25434boximpl(int i10) {
        return new PointerButtons(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25435constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25436equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerButtons) && i10 == ((PointerButtons) obj).m25440unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25437equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25438hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25439toStringimpl(int i10) {
        return "PointerButtons(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m25436equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m25438hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m25439toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25440unboximpl() {
        return this.packedValue;
    }
}
