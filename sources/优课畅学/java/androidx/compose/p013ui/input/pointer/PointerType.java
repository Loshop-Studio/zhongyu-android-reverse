package androidx.compose.p013ui.input.pointer;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m25571constructorimpl(0);
    private static final int Touch = m25571constructorimpl(1);
    private static final int Mouse = m25571constructorimpl(2);
    private static final int Stylus = m25571constructorimpl(3);
    private static final int Eraser = m25571constructorimpl(4);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m25577getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m25578getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m25579getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m25580getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m25581getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m25570boximpl(int i10) {
        return new PointerType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m25571constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25572equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerType) && i10 == ((PointerType) obj).m25576unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25573equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25574hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25575toStringimpl(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m25572equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m25574hashCodeimpl(this.value);
    }

    public String toString() {
        return m25575toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25576unboximpl() {
        return this.value;
    }
}
