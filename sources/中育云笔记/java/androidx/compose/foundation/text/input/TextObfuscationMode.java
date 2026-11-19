package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Visible = m27963constructorimpl(0);
    private static final int RevealLastTyped = m27963constructorimpl(1);
    private static final int Hidden = m27963constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m27969getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m27970getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m27971getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextObfuscationMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m27962boximpl(int i10) {
        return new TextObfuscationMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m27963constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27964equalsimpl(int i10, Object obj) {
        return (obj instanceof TextObfuscationMode) && i10 == ((TextObfuscationMode) obj).m27968unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27965equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27966hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27967toStringimpl(int i10) {
        return "TextObfuscationMode(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m27964equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m27966hashCodeimpl(this.value);
    }

    public String toString() {
        return m27967toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m27968unboximpl() {
        return this.value;
    }
}
