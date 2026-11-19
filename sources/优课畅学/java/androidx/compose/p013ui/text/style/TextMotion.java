package androidx.compose.p013ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        private Companion() {
        }
    }

    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m26813constructorimpl(1);
        private static final int FontHinting = m26813constructorimpl(2);
        private static final int None = m26813constructorimpl(3);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m26819getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m26820getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m26821getNone4e0Vf04() {
                return Linearity.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Linearity(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m26812boximpl(int i10) {
            return new Linearity(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m26813constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26814equalsimpl(int i10, Object obj) {
            return (obj instanceof Linearity) && i10 == ((Linearity) obj).m26818unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26815equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26816hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26817toStringimpl(int i10) {
            return m26815equalsimpl0(i10, Linear) ? "Linearity.Linear" : m26815equalsimpl0(i10, FontHinting) ? "Linearity.FontHinting" : m26815equalsimpl0(i10, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m26814equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26816hashCodeimpl(this.value);
        }

        public String toString() {
            return m26817toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26818unboximpl() {
            return this.value;
        }
    }

    static {
        AbstractC9126n abstractC9126n = null;
        Companion = new Companion(abstractC9126n);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m26819getFontHinting4e0Vf04(), false, abstractC9126n);
        Animated = new TextMotion(companion.m26820getLinear4e0Vf04(), true, abstractC9126n);
    }

    public /* synthetic */ TextMotion(int i10, boolean z10, AbstractC9126n abstractC9126n) {
        this(i10, z10);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m26809copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = textMotion.linearity;
        }
        if ((i11 & 2) != 0) {
            z10 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m26810copyJdDtMQo$ui_text_release(i10, z10);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m26810copyJdDtMQo$ui_text_release(int i10, boolean z10) {
        return new TextMotion(i10, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m26815equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m26811getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m26816hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        return AbstractC9133u.m16128b(this, Static) ? "TextMotion.Static" : AbstractC9133u.m16128b(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    private TextMotion(int i10, boolean z10) {
        this.linearity = i10;
        this.subpixelTextPositioning = z10;
    }
}
