package androidx.compose.p014ui.layout;

import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface BeyondBoundsLayout {

    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m32209constructorimpl(1);
        private static final int After = m32209constructorimpl(2);
        private static final int Left = m32209constructorimpl(3);
        private static final int Right = m32209constructorimpl(4);
        private static final int Above = m32209constructorimpl(5);
        private static final int Below = m32209constructorimpl(6);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m32215getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m32216getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m32217getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m32218getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m32219getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m32220getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            private Companion() {
            }
        }

        private /* synthetic */ LayoutDirection(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m32208boximpl(int i10) {
            return new LayoutDirection(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m32209constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m32210equalsimpl(int i10, Object obj) {
            return (obj instanceof LayoutDirection) && i10 == ((LayoutDirection) obj).m32214unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m32211equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m32212hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m32213toStringimpl(int i10) {
            return m32211equalsimpl0(i10, Before) ? "Before" : m32211equalsimpl0(i10, After) ? "After" : m32211equalsimpl0(i10, Left) ? "Left" : m32211equalsimpl0(i10, Right) ? "Right" : m32211equalsimpl0(i10, Above) ? "Above" : m32211equalsimpl0(i10, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m32210equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m32212hashCodeimpl(this.value);
        }

        public String toString() {
            return m32213toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m32214unboximpl() {
            return this.value;
        }
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo27614layouto7g1Pn8(int i10, InterfaceC9540l interfaceC9540l);
}
