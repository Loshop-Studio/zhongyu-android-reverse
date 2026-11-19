package androidx.compose.p013ui.input.key;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m25348constructorimpl(0);
    private static final int KeyUp = m25348constructorimpl(1);
    private static final int KeyDown = m25348constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m25354getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m25355getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m25356getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyEventType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m25347boximpl(int i10) {
        return new KeyEventType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25348constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25349equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyEventType) && i10 == ((KeyEventType) obj).m25353unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25350equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25351hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25352toStringimpl(int i10) {
        return m25350equalsimpl0(i10, KeyUp) ? "KeyUp" : m25350equalsimpl0(i10, KeyDown) ? "KeyDown" : m25350equalsimpl0(i10, Unknown) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m25349equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m25351hashCodeimpl(this.value);
    }

    public String toString() {
        return m25352toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25353unboximpl() {
        return this.value;
    }
}
