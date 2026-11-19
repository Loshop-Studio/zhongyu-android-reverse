package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class TextHighlightType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int HandwritingSelectPreview = m21352constructorimpl(0);
    private static final int HandwritingDeletePreview = m21352constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m21358getHandwritingDeletePreviewsxJuwY() {
            return TextHighlightType.HandwritingDeletePreview;
        }

        /* renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m21359getHandwritingSelectPreviewsxJuwY() {
            return TextHighlightType.HandwritingSelectPreview;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextHighlightType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextHighlightType m21351boximpl(int i10) {
        return new TextHighlightType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m21352constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21353equalsimpl(int i10, Object obj) {
        return (obj instanceof TextHighlightType) && i10 == ((TextHighlightType) obj).m21357unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21354equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21355hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21356toStringimpl(int i10) {
        return "TextHighlightType(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m21353equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m21355hashCodeimpl(this.value);
    }

    public String toString() {
        return m21356toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m21357unboximpl() {
        return this.value;
    }
}
