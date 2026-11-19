package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m27547getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m27548getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m27549getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m27550getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m27551getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m27552getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m27553getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m27554getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m27555getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m27556getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m27557getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m27558getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        private Companion() {
        }
    }

    static {
        int iM27538constructorimpl = m27538constructorimpl(8);
        AllowLeftInLtr = iM27538constructorimpl;
        int iM27538constructorimpl2 = m27538constructorimpl(4);
        AllowRightInLtr = iM27538constructorimpl2;
        int iM27538constructorimpl3 = m27538constructorimpl(2);
        AllowLeftInRtl = iM27538constructorimpl3;
        int iM27538constructorimpl4 = m27538constructorimpl(1);
        AllowRightInRtl = iM27538constructorimpl4;
        Start = m27543plusgK_yJZ4(iM27538constructorimpl, iM27538constructorimpl4);
        End = m27543plusgK_yJZ4(iM27538constructorimpl2, iM27538constructorimpl3);
        int iM27538constructorimpl5 = m27538constructorimpl(16);
        Top = iM27538constructorimpl5;
        int iM27538constructorimpl6 = m27538constructorimpl(32);
        Bottom = iM27538constructorimpl6;
        int iM27543plusgK_yJZ4 = m27543plusgK_yJZ4(iM27538constructorimpl, iM27538constructorimpl3);
        Left = iM27543plusgK_yJZ4;
        int iM27543plusgK_yJZ42 = m27543plusgK_yJZ4(iM27538constructorimpl2, iM27538constructorimpl4);
        Right = iM27543plusgK_yJZ42;
        Horizontal = m27543plusgK_yJZ4(iM27543plusgK_yJZ4, iM27543plusgK_yJZ42);
        Vertical = m27543plusgK_yJZ4(iM27538constructorimpl5, iM27538constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m27537boximpl(int i10) {
        return new WindowInsetsSides(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m27538constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27539equalsimpl(int i10, Object obj) {
        return (obj instanceof WindowInsetsSides) && i10 == ((WindowInsetsSides) obj).m27546unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27540equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m27541hasAnybkgdKaI$foundation_layout_release(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27542hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m27543plusgK_yJZ4(int i10, int i11) {
        return m27538constructorimpl(i10 | i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27544toStringimpl(int i10) {
        return "WindowInsetsSides(" + m27545valueToStringimpl(i10) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m27545valueToStringimpl(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = Start;
        if ((i10 & i11) == i11) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Start");
        }
        int i12 = Left;
        if ((i10 & i12) == i12) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Left");
        }
        int i13 = Top;
        if ((i10 & i13) == i13) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Top");
        }
        int i14 = End;
        if ((i10 & i14) == i14) {
            valueToString_impl$lambda$0$appendPlus(sb2, "End");
        }
        int i15 = Right;
        if ((i10 & i15) == i15) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Right");
        }
        int i16 = Bottom;
        if ((i10 & i16) == i16) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Bottom");
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public boolean equals(Object obj) {
        return m27539equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m27542hashCodeimpl(this.value);
    }

    public String toString() {
        return m27544toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m27546unboximpl() {
        return this.value;
    }
}
