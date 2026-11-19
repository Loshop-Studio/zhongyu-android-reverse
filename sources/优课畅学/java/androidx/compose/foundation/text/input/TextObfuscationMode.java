package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Visible = m21361constructorimpl(0);
    private static final int RevealLastTyped = m21361constructorimpl(1);
    private static final int Hidden = m21361constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m21367getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m21368getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m21369getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextObfuscationMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m21360boximpl(int i10) {
        return new TextObfuscationMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m21361constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21362equalsimpl(int i10, Object obj) {
        return (obj instanceof TextObfuscationMode) && i10 == ((TextObfuscationMode) obj).m21366unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21363equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21364hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21365toStringimpl(int i10) {
        return "TextObfuscationMode(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m21362equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m21364hashCodeimpl(this.value);
    }

    public String toString() {
        return m21365toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m21366unboximpl() {
        return this.value;
    }
}
