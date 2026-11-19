package androidx.compose.p014ui.text.font;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m33062constructorimpl(0);
    private static final int OptionalLocal = m33062constructorimpl(1);
    private static final int Async = m33062constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m33068getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m33069getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m33070getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m33061boximpl(int i10) {
        return new FontLoadingStrategy(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m33062constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33063equalsimpl(int i10, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i10 == ((FontLoadingStrategy) obj).m33067unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33064equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33065hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33066toStringimpl(int i10) {
        if (m33064equalsimpl0(i10, Blocking)) {
            return "Blocking";
        }
        if (m33064equalsimpl0(i10, OptionalLocal)) {
            return "Optional";
        }
        if (m33064equalsimpl0(i10, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m33063equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m33065hashCodeimpl(this.value);
    }

    public String toString() {
        return m33066toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33067unboximpl() {
        return this.value;
    }
}
