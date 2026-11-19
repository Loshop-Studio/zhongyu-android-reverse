package androidx.compose.foundation;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;
    public static final Companion Companion = new Companion(null);
    private static final int Behind = m20333constructorimpl(0);
    private static final int MediaOverlay = m20333constructorimpl(1);
    private static final int OnTop = m20333constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m20339getBehindB_4ceCc() {
            return AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m20340getMediaOverlayB_4ceCc() {
            return AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m20341getOnTopB_4ceCc() {
            return AndroidExternalSurfaceZOrder.OnTop;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i10) {
        this.zOrder = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidExternalSurfaceZOrder m20332boximpl(int i10) {
        return new AndroidExternalSurfaceZOrder(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m20333constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20334equalsimpl(int i10, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i10 == ((AndroidExternalSurfaceZOrder) obj).m20338unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20335equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20336hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20337toStringimpl(int i10) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m20334equalsimpl(this.zOrder, obj);
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return m20336hashCodeimpl(this.zOrder);
    }

    public String toString() {
        return m20337toStringimpl(this.zOrder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m20338unboximpl() {
        return this.zOrder;
    }
}
