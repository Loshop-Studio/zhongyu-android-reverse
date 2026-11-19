package androidx.compose.p014ui.input.nestedscroll;

import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @InterfaceC10770a
        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31988getDragWNlRxjI$annotations() {
        }

        @InterfaceC10770a
        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31989getFlingWNlRxjI$annotations() {
        }

        @InterfaceC10770a
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31990getRelocateWNlRxjI$annotations() {
        }

        @InterfaceC10770a
        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m31991getWheelWNlRxjI$annotations() {
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m31992getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m31993getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m31994getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m31995getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m31996getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m31997getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        private Companion() {
        }
    }

    static {
        int iM31982constructorimpl = m31982constructorimpl(1);
        UserInput = iM31982constructorimpl;
        int iM31982constructorimpl2 = m31982constructorimpl(2);
        SideEffect = iM31982constructorimpl2;
        Drag = iM31982constructorimpl;
        Fling = iM31982constructorimpl2;
        Relocate = m31982constructorimpl(3);
        Wheel = iM31982constructorimpl;
    }

    private /* synthetic */ NestedScrollSource(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m31981boximpl(int i10) {
        return new NestedScrollSource(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31982constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31983equalsimpl(int i10, Object obj) {
        return (obj instanceof NestedScrollSource) && i10 == ((NestedScrollSource) obj).m31987unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31984equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31985hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31986toStringimpl(int i10) {
        return m31984equalsimpl0(i10, UserInput) ? "UserInput" : m31984equalsimpl0(i10, SideEffect) ? "SideEffect" : m31984equalsimpl0(i10, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31983equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31985hashCodeimpl(this.value);
    }

    public String toString() {
        return m31986toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31987unboximpl() {
        return this.value;
    }
}
