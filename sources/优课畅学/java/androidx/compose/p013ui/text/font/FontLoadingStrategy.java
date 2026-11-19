package androidx.compose.p013ui.text.font;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m26460constructorimpl(0);
    private static final int OptionalLocal = m26460constructorimpl(1);
    private static final int Async = m26460constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m26466getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m26467getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m26468getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m26459boximpl(int i10) {
        return new FontLoadingStrategy(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26460constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26461equalsimpl(int i10, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i10 == ((FontLoadingStrategy) obj).m26465unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26462equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26463hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26464toStringimpl(int i10) {
        if (m26462equalsimpl0(i10, Blocking)) {
            return "Blocking";
        }
        if (m26462equalsimpl0(i10, OptionalLocal)) {
            return "Optional";
        }
        if (m26462equalsimpl0(i10, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m26461equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m26463hashCodeimpl(this.value);
    }

    public String toString() {
        return m26464toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26465unboximpl() {
        return this.value;
    }
}
