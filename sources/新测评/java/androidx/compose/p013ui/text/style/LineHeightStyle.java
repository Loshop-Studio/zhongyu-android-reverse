package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mode", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment-PIaL0Z0", "()F", "F", "getMode-lzQqcRY", "()I", "I", "getTrim-EVpEnUU", "copy", "copy-38bxuX8", "(FII)Landroidx/compose/ui/text/style/LineHeightStyle;", "equals", "", "other", "hashCode", "", "toString", "", "Alignment", "Companion", "Mode", "Trim", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    @Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0014"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "topRatio", "", "constructor-impl", "(F)F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nLineHeightStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,329:1\n77#2,8:330\n*S KotlinDebug\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n*L\n211#1:330,8\n*E\n"})
    public static final class Alignment {
        private final float topRatio;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final float Top = m23406constructorimpl(0.0f);
        private static final float Center = m23406constructorimpl(0.5f);
        private static final float Proportional = m23406constructorimpl(-1.0f);
        private static final float Bottom = m23406constructorimpl(1.0f);

        @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m23412getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m23413getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m23414getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m23415getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Alignment(float f10) {
            this.topRatio = f10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m23405boximpl(float f10) {
            return new Alignment(f10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m23406constructorimpl(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m23407equalsimpl(float f10, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f10, ((Alignment) obj).getTopRatio()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m23408equalsimpl0(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m23409hashCodeimpl(float f10) {
            return Float.hashCode(f10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m23410toStringimpl(float f10) {
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
            return m23407equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m23409hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m23410toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ float getTopRatio() {
            return this.topRatio;
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @JvmInline
    public static final class Mode {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Fixed = m23417constructorimpl(0);
        private static final int Minimum = m23417constructorimpl(1);
        private final int value;

        @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "", "()V", "Fixed", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "getFixed-lzQqcRY", "()I", "I", "Minimum", "getMinimum-lzQqcRY", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m23423getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m23424getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Mode(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m23416boximpl(int i10) {
            return new Mode(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m23417constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m23418equalsimpl(int i10, Object obj) {
            return (obj instanceof Mode) && i10 == ((Mode) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m23419equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m23420hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m23421toStringimpl(int i10) {
            return "Mode(value=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m23418equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m23420hashCodeimpl(this.value);
        }

        public String toString() {
            return m23421toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    @Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isTrimFirstLineTop", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimLastLineBottom", "isTrimLastLineBottom-impl$ui_text_release", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @JvmInline
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int FirstLineTop = m23426constructorimpl(1);
        private static final int LastLineBottom = m23426constructorimpl(16);
        private static final int Both = m23426constructorimpl(17);
        private static final int None = m23426constructorimpl(0);

        @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m13558d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m23434getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m23435getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m23436getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m23437getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Trim(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m23425boximpl(int i10) {
            return new Trim(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m23426constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m23427equalsimpl(int i10, Object obj) {
            return (obj instanceof Trim) && i10 == ((Trim) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m23428equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m23429hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m23430isTrimFirstLineTopimpl$ui_text_release(int i10) {
            return (i10 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m23431isTrimLastLineBottomimpl$ui_text_release(int i10) {
            return (i10 & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m23432toStringimpl(int i10) {
            return i10 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i10 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i10 == Both ? "LineHeightStyle.Trim.Both" : i10 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m23427equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m23429hashCodeimpl(this.value);
        }

        public String toString() {
            return m23432toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Default = new LineHeightStyle(Alignment.INSTANCE.m23414getProportionalPIaL0Z0(), Trim.INSTANCE.m23434getBothEVpEnUU(), Mode.INSTANCE.m23423getFixedlzQqcRY(), defaultConstructorMarker);
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10, i11);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m23400copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f10 = lineHeightStyle.alignment;
        }
        if ((i12 & 2) != 0) {
            i10 = lineHeightStyle.trim;
        }
        if ((i12 & 4) != 0) {
            i11 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m23401copy38bxuX8(f10, i10, i11);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m23401copy38bxuX8(float alignment, int trim, int mode) {
        return new LineHeightStyle(alignment, trim, mode, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return Alignment.m23408equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m23428equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m23419equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name and from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name and from getter */
    public final int getMode() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name and from getter */
    public final int getTrim() {
        return this.trim;
    }

    public int hashCode() {
        return (((Alignment.m23409hashCodeimpl(this.alignment) * 31) + Trim.m23429hashCodeimpl(this.trim)) * 31) + Mode.m23420hashCodeimpl(this.mode);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m23410toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m23432toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m23421toStringimpl(this.mode)) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10);
    }

    private LineHeightStyle(float f10, int i10, int i11) {
        this.alignment = f10;
        this.trim = i10;
        this.mode = i11;
    }

    private LineHeightStyle(float f10, int i10) {
        this(f10, i10, Mode.INSTANCE.m23423getFixedlzQqcRY(), null);
    }
}
