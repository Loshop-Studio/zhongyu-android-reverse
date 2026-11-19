package androidx.compose.p013ui.text.style;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m26791constructorimpl(1);
    private static final int Rtl = m26791constructorimpl(2);
    private static final int Content = m26791constructorimpl(3);
    private static final int ContentOrLtr = m26791constructorimpl(4);
    private static final int ContentOrRtl = m26791constructorimpl(5);
    private static final int Unspecified = m26791constructorimpl(Integer.MIN_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m26797getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m26798getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m26799getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m26800getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m26801getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m26802getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextDirection(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m26790boximpl(int i10) {
        return new TextDirection(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26791constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26792equalsimpl(int i10, Object obj) {
        return (obj instanceof TextDirection) && i10 == ((TextDirection) obj).m26796unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26793equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26794hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26795toStringimpl(int i10) {
        return m26793equalsimpl0(i10, Ltr) ? "Ltr" : m26793equalsimpl0(i10, Rtl) ? "Rtl" : m26793equalsimpl0(i10, Content) ? "Content" : m26793equalsimpl0(i10, ContentOrLtr) ? "ContentOrLtr" : m26793equalsimpl0(i10, ContentOrRtl) ? "ContentOrRtl" : m26793equalsimpl0(i10, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26792equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26794hashCodeimpl(this.value);
    }

    public String toString() {
        return m26795toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26796unboximpl() {
        return this.value;
    }
}
