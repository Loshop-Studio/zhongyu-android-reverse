package androidx.compose.p014ui.input.pointer;

/* loaded from: classes2.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m32186boximpl(int i10) {
        return new ProcessResult(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m32187constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32188equalsimpl(int i10, Object obj) {
        return (obj instanceof ProcessResult) && i10 == ((ProcessResult) obj).m32194unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32189equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m32190getAnyMovementConsumedimpl(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m32191getDispatchedToAPointerInputModifierimpl(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32192hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32193toStringimpl(int i10) {
        return "ProcessResult(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m32188equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m32192hashCodeimpl(this.value);
    }

    public String toString() {
        return m32193toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32194unboximpl() {
        return this.value;
    }
}
