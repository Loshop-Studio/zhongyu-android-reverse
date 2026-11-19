package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i10, int i11, boolean z10) {
        return alignStartEdges(i10, i11, !z10);
    }

    @VisibleForTesting
    public static final int alignPopupAxis(int i10, int i11, int i12, boolean z10) {
        return i11 >= i12 ? alignStartEdges(i11, i12, z10) : popupFitsBetweenPositionAndEndEdge(i10, i11, i12, z10) ? alignPopupStartEdgeToPosition(i10, i11, z10) : popupFitsBetweenPositionAndStartEdge(i10, i11, i12, z10) ? alignPopupEndEdgeToPosition(i10, i11, z10) : alignEndEdges(i11, i12, z10);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        return alignPopupAxis(i10, i11, i12, z10);
    }

    private static final int alignPopupEndEdgeToPosition(int i10, int i11, boolean z10) {
        return alignPopupStartEdgeToPosition(i10, i11, !z10);
    }

    private static final int alignPopupStartEdgeToPosition(int i10, int i11, boolean z10) {
        return z10 ? i10 : i10 - i11;
    }

    private static final int alignStartEdges(int i10, int i11, boolean z10) {
        if (z10) {
            return 0;
        }
        return i11 - i10;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i10, int i11, int i12, boolean z10) {
        return popupFitsBetweenPositionAndStartEdge(i10, i11, i12, !z10);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i10, int i11, int i12, boolean z10) {
        return z10 ? i11 <= i10 : i12 - i11 > i10;
    }
}
