package androidx.compose.p014ui.input.pointer;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m32051constructorimpl(0);
    private static final int Press = m32051constructorimpl(1);
    private static final int Release = m32051constructorimpl(2);
    private static final int Move = m32051constructorimpl(3);
    private static final int Enter = m32051constructorimpl(4);
    private static final int Exit = m32051constructorimpl(5);
    private static final int Scroll = m32051constructorimpl(6);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m32057getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m32058getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m32059getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m32060getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m32061getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m32062getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m32063getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerEventType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m32050boximpl(int i10) {
        return new PointerEventType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m32051constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32052equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerEventType) && i10 == ((PointerEventType) obj).m32056unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32053equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32054hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32055toStringimpl(int i10) {
        return m32053equalsimpl0(i10, Press) ? "Press" : m32053equalsimpl0(i10, Release) ? "Release" : m32053equalsimpl0(i10, Move) ? "Move" : m32053equalsimpl0(i10, Enter) ? "Enter" : m32053equalsimpl0(i10, Exit) ? "Exit" : m32053equalsimpl0(i10, Scroll) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32052equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32054hashCodeimpl(this.value);
    }

    public String toString() {
        return m32055toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32056unboximpl() {
        return this.value;
    }
}
