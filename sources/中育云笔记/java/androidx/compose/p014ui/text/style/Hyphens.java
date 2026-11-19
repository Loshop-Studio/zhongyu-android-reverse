package androidx.compose.p014ui.text.style;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m33277constructorimpl(1);
    private static final int Auto = m33277constructorimpl(2);
    private static final int Unspecified = m33277constructorimpl(Integer.MIN_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m33283getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m33284getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m33285getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Hyphens(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m33276boximpl(int i10) {
        return new Hyphens(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m33277constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33278equalsimpl(int i10, Object obj) {
        return (obj instanceof Hyphens) && i10 == ((Hyphens) obj).m33282unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33279equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33280hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33281toStringimpl(int i10) {
        return m33279equalsimpl0(i10, None) ? "Hyphens.None" : m33279equalsimpl0(i10, Auto) ? "Hyphens.Auto" : m33279equalsimpl0(i10, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33278equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33280hashCodeimpl(this.value);
    }

    public String toString() {
        return m33281toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33282unboximpl() {
        return this.value;
    }
}
