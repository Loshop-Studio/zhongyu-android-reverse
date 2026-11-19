package androidx.compose.p014ui.text.font;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m33086constructorimpl(0);
    private static final int Weight = m33086constructorimpl(1);
    private static final int Style = m33086constructorimpl(2);
    private static final int All = m33086constructorimpl(65535);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m33094getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m33095getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m33096getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m33097getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontSynthesis(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m33085boximpl(int i10) {
        return new FontSynthesis(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33086constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33087equalsimpl(int i10, Object obj) {
        return (obj instanceof FontSynthesis) && i10 == ((FontSynthesis) obj).m33093unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33088equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33089hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m33090isStyleOnimpl$ui_text_release(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m33091isWeightOnimpl$ui_text_release(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33092toStringimpl(int i10) {
        return m33088equalsimpl0(i10, None) ? "None" : m33088equalsimpl0(i10, Weight) ? "Weight" : m33088equalsimpl0(i10, Style) ? "Style" : m33088equalsimpl0(i10, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33087equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33089hashCodeimpl(this.value);
    }

    public String toString() {
        return m33092toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33093unboximpl() {
        return this.value;
    }
}
