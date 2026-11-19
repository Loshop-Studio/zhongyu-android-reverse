package androidx.compose.p013ui.text;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m26269constructorimpl(1);
    private static final int Top = m26269constructorimpl(2);
    private static final int Bottom = m26269constructorimpl(3);
    private static final int Center = m26269constructorimpl(4);
    private static final int TextTop = m26269constructorimpl(5);
    private static final int TextBottom = m26269constructorimpl(6);
    private static final int TextCenter = m26269constructorimpl(7);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m26275getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m26276getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m26277getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m26278getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m26279getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m26280getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m26281getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m26268boximpl(int i10) {
        return new PlaceholderVerticalAlign(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26269constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26270equalsimpl(int i10, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i10 == ((PlaceholderVerticalAlign) obj).m26274unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26271equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26272hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26273toStringimpl(int i10) {
        return m26271equalsimpl0(i10, AboveBaseline) ? "AboveBaseline" : m26271equalsimpl0(i10, Top) ? "Top" : m26271equalsimpl0(i10, Bottom) ? "Bottom" : m26271equalsimpl0(i10, Center) ? "Center" : m26271equalsimpl0(i10, TextTop) ? "TextTop" : m26271equalsimpl0(i10, TextBottom) ? "TextBottom" : m26271equalsimpl0(i10, TextCenter) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26270equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26272hashCodeimpl(this.value);
    }

    public String toString() {
        return m26273toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26274unboximpl() {
        return this.value;
    }
}
