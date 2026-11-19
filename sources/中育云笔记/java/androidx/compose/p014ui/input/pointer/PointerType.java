package androidx.compose.p014ui.input.pointer;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m32173constructorimpl(0);
    private static final int Touch = m32173constructorimpl(1);
    private static final int Mouse = m32173constructorimpl(2);
    private static final int Stylus = m32173constructorimpl(3);
    private static final int Eraser = m32173constructorimpl(4);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m32179getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m32180getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m32181getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m32182getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m32183getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m32172boximpl(int i10) {
        return new PointerType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m32173constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32174equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerType) && i10 == ((PointerType) obj).m32178unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32175equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32176hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32177toStringimpl(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m32174equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32176hashCodeimpl(this.value);
    }

    public String toString() {
        return m32177toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32178unboximpl() {
        return this.value;
    }
}
