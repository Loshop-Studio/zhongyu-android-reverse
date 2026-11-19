package androidx.compose.p014ui.focus;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m30512constructorimpl(1);
    private static final int Previous = m30512constructorimpl(2);
    private static final int Left = m30512constructorimpl(3);
    private static final int Right = m30512constructorimpl(4);

    /* renamed from: Up */
    private static final int f1143Up = m30512constructorimpl(5);
    private static final int Down = m30512constructorimpl(6);
    private static final int Enter = m30512constructorimpl(7);
    private static final int Exit = m30512constructorimpl(8);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m30518getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m30519getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m30520getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m30521getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m30522getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m30523getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m30524getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m30525getUpdhqQ8s() {
            return FocusDirection.f1143Up;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FocusDirection(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m30511boximpl(int i10) {
        return new FocusDirection(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30512constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30513equalsimpl(int i10, Object obj) {
        return (obj instanceof FocusDirection) && i10 == ((FocusDirection) obj).m30517unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30514equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30515hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30516toStringimpl(int i10) {
        return m30514equalsimpl0(i10, Next) ? "Next" : m30514equalsimpl0(i10, Previous) ? "Previous" : m30514equalsimpl0(i10, Left) ? "Left" : m30514equalsimpl0(i10, Right) ? "Right" : m30514equalsimpl0(i10, f1143Up) ? "Up" : m30514equalsimpl0(i10, Down) ? "Down" : m30514equalsimpl0(i10, Enter) ? "Enter" : m30514equalsimpl0(i10, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m30513equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m30515hashCodeimpl(this.value);
    }

    public String toString() {
        return m30516toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30517unboximpl() {
        return this.value;
    }
}
