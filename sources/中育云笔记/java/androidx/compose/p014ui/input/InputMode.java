package androidx.compose.p014ui.input;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m31635constructorimpl(1);
    private static final int Keyboard = m31635constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m31641getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m31642getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InputMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m31634boximpl(int i10) {
        return new InputMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31635constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31636equalsimpl(int i10, Object obj) {
        return (obj instanceof InputMode) && i10 == ((InputMode) obj).m31640unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31637equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31638hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31639toStringimpl(int i10) {
        return m31637equalsimpl0(i10, Touch) ? "Touch" : m31637equalsimpl0(i10, Keyboard) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m31636equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31638hashCodeimpl(this.value);
    }

    public String toString() {
        return m31639toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31640unboximpl() {
        return this.value;
    }
}
