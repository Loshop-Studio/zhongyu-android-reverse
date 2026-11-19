package androidx.compose.p014ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m33425constructorimpl(1);
    private static final int Ellipsis = m33425constructorimpl(2);
    private static final int Visible = m33425constructorimpl(3);
    private static final int StartEllipsis = m33425constructorimpl(4);
    private static final int MiddleEllipsis = m33425constructorimpl(5);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m33431getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m33432getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getMiddleEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m33433getMiddleEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getStartEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m33434getStartEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m33435getVisiblegIe3tQ8$annotations() {
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m33436getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m33437getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m33438getMiddleEllipsisgIe3tQ8() {
            return TextOverflow.MiddleEllipsis;
        }

        /* renamed from: getStartEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m33439getStartEllipsisgIe3tQ8() {
            return TextOverflow.StartEllipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m33440getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextOverflow(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m33424boximpl(int i10) {
        return new TextOverflow(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33425constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33426equalsimpl(int i10, Object obj) {
        return (obj instanceof TextOverflow) && i10 == ((TextOverflow) obj).m33430unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33427equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33428hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33429toStringimpl(int i10) {
        return m33427equalsimpl0(i10, Clip) ? "Clip" : m33427equalsimpl0(i10, Ellipsis) ? "Ellipsis" : m33427equalsimpl0(i10, MiddleEllipsis) ? "MiddleEllipsis" : m33427equalsimpl0(i10, Visible) ? "Visible" : m33427equalsimpl0(i10, StartEllipsis) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33426equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33428hashCodeimpl(this.value);
    }

    public String toString() {
        return m33429toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33430unboximpl() {
        return this.value;
    }
}
