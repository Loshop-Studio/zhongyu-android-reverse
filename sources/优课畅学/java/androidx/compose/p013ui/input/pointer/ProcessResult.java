package androidx.compose.p013ui.input.pointer;

/* loaded from: classes2.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m25584boximpl(int i10) {
        return new ProcessResult(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25585constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25586equalsimpl(int i10, Object obj) {
        return (obj instanceof ProcessResult) && i10 == ((ProcessResult) obj).m25592unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25587equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m25588getAnyMovementConsumedimpl(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m25589getDispatchedToAPointerInputModifierimpl(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25590hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25591toStringimpl(int i10) {
        return "ProcessResult(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m25586equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m25590hashCodeimpl(this.value);
    }

    public String toString() {
        return m25591toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25592unboximpl() {
        return this.value;
    }
}
