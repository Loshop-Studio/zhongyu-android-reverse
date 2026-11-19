package androidx.compose.p013ui.input.nestedscroll;

import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;

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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @InterfaceC8721a
        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m25386getDragWNlRxjI$annotations() {
        }

        @InterfaceC8721a
        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m25387getFlingWNlRxjI$annotations() {
        }

        @InterfaceC8721a
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m25388getRelocateWNlRxjI$annotations() {
        }

        @InterfaceC8721a
        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m25389getWheelWNlRxjI$annotations() {
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m25390getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m25391getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m25392getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m25393getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m25394getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m25395getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        private Companion() {
        }
    }

    static {
        int iM25380constructorimpl = m25380constructorimpl(1);
        UserInput = iM25380constructorimpl;
        int iM25380constructorimpl2 = m25380constructorimpl(2);
        SideEffect = iM25380constructorimpl2;
        Drag = iM25380constructorimpl;
        Fling = iM25380constructorimpl2;
        Relocate = m25380constructorimpl(3);
        Wheel = iM25380constructorimpl;
    }

    private /* synthetic */ NestedScrollSource(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m25379boximpl(int i10) {
        return new NestedScrollSource(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25380constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25381equalsimpl(int i10, Object obj) {
        return (obj instanceof NestedScrollSource) && i10 == ((NestedScrollSource) obj).m25385unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25382equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25383hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25384toStringimpl(int i10) {
        return m25382equalsimpl0(i10, UserInput) ? "UserInput" : m25382equalsimpl0(i10, SideEffect) ? "SideEffect" : m25382equalsimpl0(i10, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m25381equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m25383hashCodeimpl(this.value);
    }

    public String toString() {
        return m25384toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25385unboximpl() {
        return this.value;
    }
}
