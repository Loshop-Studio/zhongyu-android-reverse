package androidx.compose.p013ui.input;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m25033constructorimpl(1);
    private static final int Keyboard = m25033constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m25039getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m25040getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InputMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m25032boximpl(int i10) {
        return new InputMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25033constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25034equalsimpl(int i10, Object obj) {
        return (obj instanceof InputMode) && i10 == ((InputMode) obj).m25038unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25035equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25036hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25037toStringimpl(int i10) {
        return m25035equalsimpl0(i10, Touch) ? "Touch" : m25035equalsimpl0(i10, Keyboard) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m25034equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m25036hashCodeimpl(this.value);
    }

    public String toString() {
        return m25037toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25038unboximpl() {
        return this.value;
    }
}
