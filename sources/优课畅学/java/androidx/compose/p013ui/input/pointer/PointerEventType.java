package androidx.compose.p013ui.input.pointer;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m25449constructorimpl(0);
    private static final int Press = m25449constructorimpl(1);
    private static final int Release = m25449constructorimpl(2);
    private static final int Move = m25449constructorimpl(3);
    private static final int Enter = m25449constructorimpl(4);
    private static final int Exit = m25449constructorimpl(5);
    private static final int Scroll = m25449constructorimpl(6);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m25455getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m25456getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m25457getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m25458getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m25459getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m25460getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m25461getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerEventType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m25448boximpl(int i10) {
        return new PointerEventType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m25449constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25450equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerEventType) && i10 == ((PointerEventType) obj).m25454unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25451equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25452hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25453toStringimpl(int i10) {
        return m25451equalsimpl0(i10, Press) ? "Press" : m25451equalsimpl0(i10, Release) ? "Release" : m25451equalsimpl0(i10, Move) ? "Move" : m25451equalsimpl0(i10, Enter) ? "Enter" : m25451equalsimpl0(i10, Exit) ? "Exit" : m25451equalsimpl0(i10, Scroll) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m25450equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m25452hashCodeimpl(this.value);
    }

    public String toString() {
        return m25453toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25454unboximpl() {
        return this.value;
    }
}
