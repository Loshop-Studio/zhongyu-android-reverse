package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class NavigationBarArrangement {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int EqualWeight = m28849constructorimpl(0);
    private static final int Centered = m28849constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCentered-Ebr7WPU, reason: not valid java name */
        public final int m28855getCenteredEbr7WPU() {
            return NavigationBarArrangement.Centered;
        }

        /* renamed from: getEqualWeight-Ebr7WPU, reason: not valid java name */
        public final int m28856getEqualWeightEbr7WPU() {
            return NavigationBarArrangement.EqualWeight;
        }

        private Companion() {
        }
    }

    private /* synthetic */ NavigationBarArrangement(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NavigationBarArrangement m28848boximpl(int i10) {
        return new NavigationBarArrangement(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m28849constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28850equalsimpl(int i10, Object obj) {
        return (obj instanceof NavigationBarArrangement) && i10 == ((NavigationBarArrangement) obj).m28854unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28851equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28852hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28853toStringimpl(int i10) {
        return m28851equalsimpl0(i10, EqualWeight) ? "EqualWeight" : m28851equalsimpl0(i10, Centered) ? "Centered" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m28850equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28852hashCodeimpl(this.value);
    }

    public String toString() {
        return m28853toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28854unboximpl() {
        return this.value;
    }
}
