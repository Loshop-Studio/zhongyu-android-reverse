package androidx.compose.p013ui.text.style;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m26675constructorimpl(1);
    private static final int Auto = m26675constructorimpl(2);
    private static final int Unspecified = m26675constructorimpl(Integer.MIN_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m26681getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m26682getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m26683getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Hyphens(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m26674boximpl(int i10) {
        return new Hyphens(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26675constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26676equalsimpl(int i10, Object obj) {
        return (obj instanceof Hyphens) && i10 == ((Hyphens) obj).m26680unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26677equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26678hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26679toStringimpl(int i10) {
        return m26677equalsimpl0(i10, None) ? "Hyphens.None" : m26677equalsimpl0(i10, Auto) ? "Hyphens.Auto" : m26677equalsimpl0(i10, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26676equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26678hashCodeimpl(this.value);
    }

    public String toString() {
        return m26679toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26680unboximpl() {
        return this.value;
    }
}
