package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, m5110d2 = {"alignEndEdges", "", "popupLength", "windowLength", "closeAffinity", "", "alignPopupAxis", RequestParameters.POSITION, "alignPopupEndEdgeToPosition", "alignPopupStartEdgeToPosition", "alignStartEdges", "popupFitsBetweenPositionAndEndEdge", "popupFitsBetweenPositionAndStartEdge", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i, int i8, boolean z8) {
        return alignStartEdges(i, i8, !z8);
    }

    @VisibleForTesting
    public static final int alignPopupAxis(int i, int i8, int i9, boolean z8) {
        return i8 >= i9 ? alignStartEdges(i8, i9, z8) : popupFitsBetweenPositionAndEndEdge(i, i8, i9, z8) ? alignPopupStartEdgeToPosition(i, i8, z8) : popupFitsBetweenPositionAndStartEdge(i, i8, i9, z8) ? alignPopupEndEdgeToPosition(i, i8, z8) : alignEndEdges(i8, i9, z8);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z8 = true;
        }
        return alignPopupAxis(i, i8, i9, z8);
    }

    private static final int alignPopupEndEdgeToPosition(int i, int i8, boolean z8) {
        return alignPopupStartEdgeToPosition(i, i8, !z8);
    }

    private static final int alignPopupStartEdgeToPosition(int i, int i8, boolean z8) {
        return z8 ? i : i - i8;
    }

    private static final int alignStartEdges(int i, int i8, boolean z8) {
        if (z8) {
            return 0;
        }
        return i8 - i;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i, int i8, int i9, boolean z8) {
        return popupFitsBetweenPositionAndStartEdge(i, i8, i9, !z8);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i, int i8, int i9, boolean z8) {
        return z8 ? i8 <= i : i9 - i8 > i;
    }
}
