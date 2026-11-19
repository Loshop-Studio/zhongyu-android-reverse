package androidx.compose.p014ui.input.key;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m31950constructorimpl(0);
    private static final int KeyUp = m31950constructorimpl(1);
    private static final int KeyDown = m31950constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m31956getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m31957getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m31958getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyEventType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m31949boximpl(int i10) {
        return new KeyEventType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31950constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31951equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyEventType) && i10 == ((KeyEventType) obj).m31955unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31952equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31953hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31954toStringimpl(int i10) {
        return m31952equalsimpl0(i10, KeyUp) ? "KeyUp" : m31952equalsimpl0(i10, KeyDown) ? "KeyDown" : m31952equalsimpl0(i10, Unknown) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31951equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31953hashCodeimpl(this.value);
    }

    public String toString() {
        return m31954toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31955unboximpl() {
        return this.value;
    }
}
