package androidx.compose.p014ui.text;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m32871constructorimpl(1);
    private static final int Top = m32871constructorimpl(2);
    private static final int Bottom = m32871constructorimpl(3);
    private static final int Center = m32871constructorimpl(4);
    private static final int TextTop = m32871constructorimpl(5);
    private static final int TextBottom = m32871constructorimpl(6);
    private static final int TextCenter = m32871constructorimpl(7);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m32877getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m32878getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m32879getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m32880getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m32881getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m32882getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m32883getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m32870boximpl(int i10) {
        return new PlaceholderVerticalAlign(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m32871constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32872equalsimpl(int i10, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i10 == ((PlaceholderVerticalAlign) obj).m32876unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32873equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32874hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32875toStringimpl(int i10) {
        return m32873equalsimpl0(i10, AboveBaseline) ? "AboveBaseline" : m32873equalsimpl0(i10, Top) ? "Top" : m32873equalsimpl0(i10, Bottom) ? "Bottom" : m32873equalsimpl0(i10, Center) ? "Center" : m32873equalsimpl0(i10, TextTop) ? "TextTop" : m32873equalsimpl0(i10, TextBottom) ? "TextBottom" : m32873equalsimpl0(i10, TextCenter) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m32872equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32874hashCodeimpl(this.value);
    }

    public String toString() {
        return m32875toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32876unboximpl() {
        return this.value;
    }
}
