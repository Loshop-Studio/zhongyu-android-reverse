package androidx.compose.p013ui.focus;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m23910constructorimpl(1);
    private static final int Previous = m23910constructorimpl(2);
    private static final int Left = m23910constructorimpl(3);
    private static final int Right = m23910constructorimpl(4);

    /* renamed from: Up */
    private static final int f1213Up = m23910constructorimpl(5);
    private static final int Down = m23910constructorimpl(6);
    private static final int Enter = m23910constructorimpl(7);
    private static final int Exit = m23910constructorimpl(8);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m23916getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m23917getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m23918getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m23919getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m23920getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m23921getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m23922getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m23923getUpdhqQ8s() {
            return FocusDirection.f1213Up;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FocusDirection(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m23909boximpl(int i10) {
        return new FocusDirection(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m23910constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23911equalsimpl(int i10, Object obj) {
        return (obj instanceof FocusDirection) && i10 == ((FocusDirection) obj).m23915unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23912equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23913hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23914toStringimpl(int i10) {
        return m23912equalsimpl0(i10, Next) ? "Next" : m23912equalsimpl0(i10, Previous) ? "Previous" : m23912equalsimpl0(i10, Left) ? "Left" : m23912equalsimpl0(i10, Right) ? "Right" : m23912equalsimpl0(i10, f1213Up) ? "Up" : m23912equalsimpl0(i10, Down) ? "Down" : m23912equalsimpl0(i10, Enter) ? "Enter" : m23912equalsimpl0(i10, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m23911equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m23913hashCodeimpl(this.value);
    }

    public String toString() {
        return m23914toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m23915unboximpl() {
        return this.value;
    }
}
