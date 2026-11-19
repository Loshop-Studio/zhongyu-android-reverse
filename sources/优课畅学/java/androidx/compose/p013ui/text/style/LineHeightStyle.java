package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

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
        private static final float Top = m26744constructorimpl(0.0f);
        private static final float Center = m26744constructorimpl(0.5f);
        private static final float Proportional = m26744constructorimpl(-1.0f);
        private static final float Bottom = m26744constructorimpl(1.0f);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m26750getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m26751getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m26752getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m26753getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Alignment(float f10) {
            this.topRatio = f10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m26743boximpl(float f10) {
            return new Alignment(f10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m26744constructorimpl(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26745equalsimpl(float f10, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f10, ((Alignment) obj).m26749unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26746equalsimpl0(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26747hashCodeimpl(float f10) {
            return Float.hashCode(f10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26748toStringimpl(float f10) {
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
            return m26745equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m26747hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m26748toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m26749unboximpl() {
            return this.topRatio;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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
        private static final int Fixed = m26755constructorimpl(0);
        private static final int Minimum = m26755constructorimpl(1);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m26761getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m26762getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Mode(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m26754boximpl(int i10) {
            return new Mode(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m26755constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26756equalsimpl(int i10, Object obj) {
            return (obj instanceof Mode) && i10 == ((Mode) obj).m26760unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26757equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26758hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26759toStringimpl(int i10) {
            return "Mode(value=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m26756equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26758hashCodeimpl(this.value);
        }

        public String toString() {
            return m26759toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26760unboximpl() {
            return this.value;
        }
    }

    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m26764constructorimpl(1);
        private static final int LastLineBottom = m26764constructorimpl(16);
        private static final int Both = m26764constructorimpl(17);
        private static final int None = m26764constructorimpl(0);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m26772getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m26773getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m26774getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m26775getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Trim(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m26763boximpl(int i10) {
            return new Trim(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m26764constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26765equalsimpl(int i10, Object obj) {
            return (obj instanceof Trim) && i10 == ((Trim) obj).m26771unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26766equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26767hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m26768isTrimFirstLineTopimpl$ui_text_release(int i10) {
            return (i10 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m26769isTrimLastLineBottomimpl$ui_text_release(int i10) {
            return (i10 & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26770toStringimpl(int i10) {
            return i10 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i10 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i10 == Both ? "LineHeightStyle.Trim.Both" : i10 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m26765equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26767hashCodeimpl(this.value);
        }

        public String toString() {
            return m26770toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26771unboximpl() {
            return this.value;
        }
    }

    static {
        AbstractC9126n abstractC9126n = null;
        Companion = new Companion(abstractC9126n);
        Default = new LineHeightStyle(Alignment.Companion.m26752getProportionalPIaL0Z0(), Trim.Companion.m26772getBothEVpEnUU(), Mode.Companion.m26761getFixedlzQqcRY(), abstractC9126n);
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(f10, i10, i11);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m26738copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f10 = lineHeightStyle.alignment;
        }
        if ((i12 & 2) != 0) {
            i10 = lineHeightStyle.trim;
        }
        if ((i12 & 4) != 0) {
            i11 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m26739copy38bxuX8(f10, i10, i11);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m26739copy38bxuX8(float f10, int i10, int i11) {
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
        return Alignment.m26746equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m26766equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m26757equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m26740getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m26741getModelzQqcRY() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m26742getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (((Alignment.m26747hashCodeimpl(this.alignment) * 31) + Trim.m26767hashCodeimpl(this.trim)) * 31) + Mode.m26758hashCodeimpl(this.mode);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m26748toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m26770toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m26759toStringimpl(this.mode)) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, AbstractC9126n abstractC9126n) {
        this(f10, i10);
    }

    private LineHeightStyle(float f10, int i10, int i11) {
        this.alignment = f10;
        this.trim = i10;
        this.mode = i11;
    }

    private LineHeightStyle(float f10, int i10) {
        this(f10, i10, Mode.Companion.m26761getFixedlzQqcRY(), null);
    }
}
