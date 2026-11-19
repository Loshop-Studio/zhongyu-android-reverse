package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m20945getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m20946getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m20947getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m20948getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m20949getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m20950getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m20951getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m20952getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m20953getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m20954getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m20955getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m20956getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        private Companion() {
        }
    }

    static {
        int iM20936constructorimpl = m20936constructorimpl(8);
        AllowLeftInLtr = iM20936constructorimpl;
        int iM20936constructorimpl2 = m20936constructorimpl(4);
        AllowRightInLtr = iM20936constructorimpl2;
        int iM20936constructorimpl3 = m20936constructorimpl(2);
        AllowLeftInRtl = iM20936constructorimpl3;
        int iM20936constructorimpl4 = m20936constructorimpl(1);
        AllowRightInRtl = iM20936constructorimpl4;
        Start = m20941plusgK_yJZ4(iM20936constructorimpl, iM20936constructorimpl4);
        End = m20941plusgK_yJZ4(iM20936constructorimpl2, iM20936constructorimpl3);
        int iM20936constructorimpl5 = m20936constructorimpl(16);
        Top = iM20936constructorimpl5;
        int iM20936constructorimpl6 = m20936constructorimpl(32);
        Bottom = iM20936constructorimpl6;
        int iM20941plusgK_yJZ4 = m20941plusgK_yJZ4(iM20936constructorimpl, iM20936constructorimpl3);
        Left = iM20941plusgK_yJZ4;
        int iM20941plusgK_yJZ42 = m20941plusgK_yJZ4(iM20936constructorimpl2, iM20936constructorimpl4);
        Right = iM20941plusgK_yJZ42;
        Horizontal = m20941plusgK_yJZ4(iM20941plusgK_yJZ4, iM20941plusgK_yJZ42);
        Vertical = m20941plusgK_yJZ4(iM20936constructorimpl5, iM20936constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m20935boximpl(int i10) {
        return new WindowInsetsSides(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m20936constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20937equalsimpl(int i10, Object obj) {
        return (obj instanceof WindowInsetsSides) && i10 == ((WindowInsetsSides) obj).m20944unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20938equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m20939hasAnybkgdKaI$foundation_layout_release(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20940hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m20941plusgK_yJZ4(int i10, int i11) {
        return m20936constructorimpl(i10 | i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20942toStringimpl(int i10) {
        return "WindowInsetsSides(" + m20943valueToStringimpl(i10) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m20943valueToStringimpl(int i10) {
        StringBuilder sb = new StringBuilder();
        int i11 = Start;
        if ((i10 & i11) == i11) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i12 = Left;
        if ((i10 & i12) == i12) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i13 = Top;
        if ((i10 & i13) == i13) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i14 = End;
        if ((i10 & i14) == i14) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i15 = Right;
        if ((i10 & i15) == i15) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i16 = Bottom;
        if ((i10 & i16) == i16) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m20937equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20940hashCodeimpl(this.value);
    }

    public String toString() {
        return m20942toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m20944unboximpl() {
        return this.value;
    }
}
