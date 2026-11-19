package androidx.compose.p014ui.text.style;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m33346constructorimpl(0.0f);
        private static final float Center = m33346constructorimpl(0.5f);
        private static final float Proportional = m33346constructorimpl(-1.0f);
        private static final float Bottom = m33346constructorimpl(1.0f);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m33352getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m33353getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m33354getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m33355getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Alignment(float f10) {
            this.topRatio = f10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m33345boximpl(float f10) {
            return new Alignment(f10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m33346constructorimpl(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33347equalsimpl(float f10, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f10, ((Alignment) obj).m33351unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33348equalsimpl0(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33349hashCodeimpl(float f10) {
            return Float.hashCode(f10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33350toStringimpl(float f10) {
            if (f10 == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return m33347equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m33349hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m33350toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m33351unboximpl() {
            return this.topRatio;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        private Companion() {
        }
    }

    public static final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final int Fixed = m33357constructorimpl(0);
        private static final int Minimum = m33357constructorimpl(1);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m33363getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m33364getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Mode(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m33356boximpl(int i10) {
            return new Mode(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m33357constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33358equalsimpl(int i10, Object obj) {
            return (obj instanceof Mode) && i10 == ((Mode) obj).m33362unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33359equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33360hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33361toStringimpl(int i10) {
            return "Mode(value=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m33358equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m33360hashCodeimpl(this.value);
        }

        public String toString() {
            return m33361toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33362unboximpl() {
            return this.value;
        }
    }

    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m33366constructorimpl(1);
        private static final int LastLineBottom = m33366constructorimpl(16);
        private static final int Both = m33366constructorimpl(17);
        private static final int None = m33366constructorimpl(0);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m33374getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m33375getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m33376getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m33377getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Trim(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m33365boximpl(int i10) {
            return new Trim(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m33366constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33367equalsimpl(int i10, Object obj) {
            return (obj instanceof Trim) && i10 == ((Trim) obj).m33373unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33368equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33369hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m33370isTrimFirstLineTopimpl$ui_text_release(int i10) {
            return (i10 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m33371isTrimLastLineBottomimpl$ui_text_release(int i10) {
            return (i10 & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33372toStringimpl(int i10) {
            return i10 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i10 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i10 == Both ? "LineHeightStyle.Trim.Both" : i10 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m33367equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m33369hashCodeimpl(this.value);
        }

        public String toString() {
            return m33372toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33373unboximpl() {
            return this.value;
        }
    }

    static {
        AbstractC9972n abstractC9972n = null;
        Companion = new Companion(abstractC9972n);
        Default = new LineHeightStyle(Alignment.Companion.m33354getProportionalPIaL0Z0(), Trim.Companion.m33374getBothEVpEnUU(), Mode.Companion.m33363getFixedlzQqcRY(), abstractC9972n);
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(f10, i10, i11);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m33340copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f10 = lineHeightStyle.alignment;
        }
        if ((i12 & 2) != 0) {
            i10 = lineHeightStyle.trim;
        }
        if ((i12 & 4) != 0) {
            i11 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m33341copy38bxuX8(f10, i10, i11);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m33341copy38bxuX8(float f10, int i10, int i11) {
        return new LineHeightStyle(f10, i10, i11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m33348equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m33368equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m33359equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m33342getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m33343getModelzQqcRY() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m33344getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (((Alignment.m33349hashCodeimpl(this.alignment) * 31) + Trim.m33369hashCodeimpl(this.trim)) * 31) + Mode.m33360hashCodeimpl(this.mode);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m33350toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m33372toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m33361toStringimpl(this.mode)) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, AbstractC9972n abstractC9972n) {
        this(f10, i10);
    }

    private LineHeightStyle(float f10, int i10, int i11) {
        this.alignment = f10;
        this.trim = i10;
        this.mode = i11;
    }

    private LineHeightStyle(float f10, int i10) {
        this(f10, i10, Mode.Companion.m33363getFixedlzQqcRY(), null);
    }
}
