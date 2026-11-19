package androidx.compose.p014ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
        private static final int Linear = m33415constructorimpl(1);
        private static final int FontHinting = m33415constructorimpl(2);
        private static final int None = m33415constructorimpl(3);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m33421getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m33422getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m33423getNone4e0Vf04() {
                return Linearity.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Linearity(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m33414boximpl(int i10) {
            return new Linearity(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m33415constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33416equalsimpl(int i10, Object obj) {
            return (obj instanceof Linearity) && i10 == ((Linearity) obj).m33420unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33417equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33418hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33419toStringimpl(int i10) {
            return m33417equalsimpl0(i10, Linear) ? "Linearity.Linear" : m33417equalsimpl0(i10, FontHinting) ? "Linearity.FontHinting" : m33417equalsimpl0(i10, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m33416equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m33418hashCodeimpl(this.value);
        }

        public String toString() {
            return m33419toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33420unboximpl() {
            return this.value;
        }
    }

    static {
        AbstractC9972n abstractC9972n = null;
        Companion = new Companion(abstractC9972n);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m33421getFontHinting4e0Vf04(), false, abstractC9972n);
        Animated = new TextMotion(companion.m33422getLinear4e0Vf04(), true, abstractC9972n);
    }

    public /* synthetic */ TextMotion(int i10, boolean z10, AbstractC9972n abstractC9972n) {
        this(i10, z10);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m33411copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = textMotion.linearity;
        }
        if ((i11 & 2) != 0) {
            z10 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m33412copyJdDtMQo$ui_text_release(i10, z10);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m33412copyJdDtMQo$ui_text_release(int i10, boolean z10) {
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
        return Linearity.m33417equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m33413getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m33418hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        return AbstractC9979u.m20289b(this, Static) ? "TextMotion.Static" : AbstractC9979u.m20289b(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    private TextMotion(int i10, boolean z10) {
        this.linearity = i10;
        this.subpixelTextPositioning = z10;
    }
}
