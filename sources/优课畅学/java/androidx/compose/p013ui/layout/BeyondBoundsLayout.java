package androidx.compose.p013ui.layout;

import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface BeyondBoundsLayout {

    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m25607constructorimpl(1);
        private static final int After = m25607constructorimpl(2);
        private static final int Left = m25607constructorimpl(3);
        private static final int Right = m25607constructorimpl(4);
        private static final int Above = m25607constructorimpl(5);
        private static final int Below = m25607constructorimpl(6);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m25613getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m25614getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m25615getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m25616getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m25617getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m25618getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            private Companion() {
            }
        }

        private /* synthetic */ LayoutDirection(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m25606boximpl(int i10) {
            return new LayoutDirection(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m25607constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m25608equalsimpl(int i10, Object obj) {
            return (obj instanceof LayoutDirection) && i10 == ((LayoutDirection) obj).m25612unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m25609equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m25610hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m25611toStringimpl(int i10) {
            return m25609equalsimpl0(i10, Before) ? "Before" : m25609equalsimpl0(i10, After) ? "After" : m25609equalsimpl0(i10, Left) ? "Left" : m25609equalsimpl0(i10, Right) ? "Right" : m25609equalsimpl0(i10, Above) ? "Above" : m25609equalsimpl0(i10, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m25608equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m25610hashCodeimpl(this.value);
        }

        public String toString() {
            return m25611toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m25612unboximpl() {
            return this.value;
        }
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo21012layouto7g1Pn8(int i10, InterfaceC10570l interfaceC10570l);
}
