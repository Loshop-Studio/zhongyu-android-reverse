package androidx.compose.foundation;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;
    public static final Companion Companion = new Companion(null);
    private static final int Behind = m26935constructorimpl(0);
    private static final int MediaOverlay = m26935constructorimpl(1);
    private static final int OnTop = m26935constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m26941getBehindB_4ceCc() {
            return AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m26942getMediaOverlayB_4ceCc() {
            return AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m26943getOnTopB_4ceCc() {
            return AndroidExternalSurfaceZOrder.OnTop;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i10) {
        this.zOrder = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidExternalSurfaceZOrder m26934boximpl(int i10) {
        return new AndroidExternalSurfaceZOrder(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26935constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26936equalsimpl(int i10, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i10 == ((AndroidExternalSurfaceZOrder) obj).m26940unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26937equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26938hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26939toStringimpl(int i10) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m26936equalsimpl(this.zOrder, obj);
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return m26938hashCodeimpl(this.zOrder);
    }

    public String toString() {
        return m26939toStringimpl(this.zOrder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26940unboximpl() {
        return this.zOrder;
    }
}
