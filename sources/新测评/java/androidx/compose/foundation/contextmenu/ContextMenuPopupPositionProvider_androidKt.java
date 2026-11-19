package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, m13558d2 = {"alignEndEdges", "", "popupLength", "windowLength", "closeAffinity", "", "alignPopupAxis", RequestParameters.POSITION, "alignPopupEndEdgeToPosition", "alignPopupStartEdgeToPosition", "alignStartEdges", "popupFitsBetweenPositionAndEndEdge", "popupFitsBetweenPositionAndStartEdge", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i10, int i11, boolean z9) {
        return alignStartEdges(i10, i11, !z9);
    }

    @VisibleForTesting
    public static final int alignPopupAxis(int i10, int i11, int i12, boolean z9) {
        return i11 >= i12 ? alignStartEdges(i11, i12, z9) : popupFitsBetweenPositionAndEndEdge(i10, i11, i12, z9) ? alignPopupStartEdgeToPosition(i10, i11, z9) : popupFitsBetweenPositionAndStartEdge(i10, i11, i12, z9) ? alignPopupEndEdgeToPosition(i10, i11, z9) : alignEndEdges(i11, i12, z9);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i10, int i11, int i12, boolean z9, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z9 = true;
        }
        return alignPopupAxis(i10, i11, i12, z9);
    }

    private static final int alignPopupEndEdgeToPosition(int i10, int i11, boolean z9) {
        return alignPopupStartEdgeToPosition(i10, i11, !z9);
    }

    private static final int alignPopupStartEdgeToPosition(int i10, int i11, boolean z9) {
        return z9 ? i10 : i10 - i11;
    }

    private static final int alignStartEdges(int i10, int i11, boolean z9) {
        if (z9) {
            return 0;
        }
        return i11 - i10;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i10, int i11, int i12, boolean z9) {
        return popupFitsBetweenPositionAndStartEdge(i10, i11, i12, !z9);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i10, int i11, int i12, boolean z9) {
        return z9 ? i11 <= i10 : i12 - i11 > i10;
    }
}
