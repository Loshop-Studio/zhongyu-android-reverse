package androidx.compose.p014ui.text.style;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m33393constructorimpl(1);
    private static final int Rtl = m33393constructorimpl(2);
    private static final int Content = m33393constructorimpl(3);
    private static final int ContentOrLtr = m33393constructorimpl(4);
    private static final int ContentOrRtl = m33393constructorimpl(5);
    private static final int Unspecified = m33393constructorimpl(Integer.MIN_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m33399getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m33400getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m33401getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m33402getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m33403getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m33404getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextDirection(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m33392boximpl(int i10) {
        return new TextDirection(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33393constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33394equalsimpl(int i10, Object obj) {
        return (obj instanceof TextDirection) && i10 == ((TextDirection) obj).m33398unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33395equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33396hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33397toStringimpl(int i10) {
        return m33395equalsimpl0(i10, Ltr) ? "Ltr" : m33395equalsimpl0(i10, Rtl) ? "Rtl" : m33395equalsimpl0(i10, Content) ? "Content" : m33395equalsimpl0(i10, ContentOrLtr) ? "ContentOrLtr" : m33395equalsimpl0(i10, ContentOrRtl) ? "ContentOrRtl" : m33395equalsimpl0(i10, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33394equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33396hashCodeimpl(this.value);
    }

    public String toString() {
        return m33397toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33398unboximpl() {
        return this.value;
    }
}
