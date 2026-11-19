package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, m13413d2 = {"alignEndEdges", "", "popupLength", "windowLength", "closeAffinity", "", "alignPopupAxis", RequestParameters.POSITION, "alignPopupEndEdgeToPosition", "alignPopupStartEdgeToPosition", "alignStartEdges", "popupFitsBetweenPositionAndEndEdge", "popupFitsBetweenPositionAndStartEdge", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i9, int i10, boolean z9) {
        return alignStartEdges(i9, i10, !z9);
    }

    @VisibleForTesting
    public static final int alignPopupAxis(int i9, int i10, int i11, boolean z9) {
        return i10 >= i11 ? alignStartEdges(i10, i11, z9) : popupFitsBetweenPositionAndEndEdge(i9, i10, i11, z9) ? alignPopupStartEdgeToPosition(i9, i10, z9) : popupFitsBetweenPositionAndStartEdge(i9, i10, i11, z9) ? alignPopupEndEdgeToPosition(i9, i10, z9) : alignEndEdges(i10, i11, z9);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i9, int i10, int i11, boolean z9, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z9 = true;
        }
        return alignPopupAxis(i9, i10, i11, z9);
    }

    private static final int alignPopupEndEdgeToPosition(int i9, int i10, boolean z9) {
        return alignPopupStartEdgeToPosition(i9, i10, !z9);
    }

    private static final int alignPopupStartEdgeToPosition(int i9, int i10, boolean z9) {
        return z9 ? i9 : i9 - i10;
    }

    private static final int alignStartEdges(int i9, int i10, boolean z9) {
        if (z9) {
            return 0;
        }
        return i10 - i9;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i9, int i10, int i11, boolean z9) {
        return popupFitsBetweenPositionAndStartEdge(i9, i10, i11, !z9);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i9, int i10, int i11, boolean z9) {
        return z9 ? i10 <= i9 : i11 - i10 > i9;
    }
}
