package androidx.compose.p013ui.text.font;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m26484constructorimpl(0);
    private static final int Weight = m26484constructorimpl(1);
    private static final int Style = m26484constructorimpl(2);
    private static final int All = m26484constructorimpl(65535);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m26492getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m26493getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m26494getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m26495getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontSynthesis(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m26483boximpl(int i10) {
        return new FontSynthesis(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26484constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26485equalsimpl(int i10, Object obj) {
        return (obj instanceof FontSynthesis) && i10 == ((FontSynthesis) obj).m26491unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26486equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26487hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m26488isStyleOnimpl$ui_text_release(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m26489isWeightOnimpl$ui_text_release(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26490toStringimpl(int i10) {
        return m26486equalsimpl0(i10, None) ? "None" : m26486equalsimpl0(i10, Weight) ? "Weight" : m26486equalsimpl0(i10, Style) ? "Style" : m26486equalsimpl0(i10, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26485equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26487hashCodeimpl(this.value);
    }

    public String toString() {
        return m26490toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26491unboximpl() {
        return this.value;
    }
}
