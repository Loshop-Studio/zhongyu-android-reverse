package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, m7880d2 = {"alignEndEdges", "", "popupLength", "windowLength", "closeAffinity", "", "alignPopupAxis", RequestParameters.POSITION, "alignPopupEndEdgeToPosition", "alignPopupStartEdgeToPosition", "alignStartEdges", "popupFitsBetweenPositionAndEndEdge", "popupFitsBetweenPositionAndStartEdge", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i6, int i7, boolean z6) {
        return alignStartEdges(i6, i7, !z6);
    }

    @VisibleForTesting
    public static final int alignPopupAxis(int i6, int i7, int i8, boolean z6) {
        return i7 >= i8 ? alignStartEdges(i7, i8, z6) : popupFitsBetweenPositionAndEndEdge(i6, i7, i8, z6) ? alignPopupStartEdgeToPosition(i6, i7, z6) : popupFitsBetweenPositionAndStartEdge(i6, i7, i8, z6) ? alignPopupEndEdgeToPosition(i6, i7, z6) : alignEndEdges(i7, i8, z6);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i6, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            z6 = true;
        }
        return alignPopupAxis(i6, i7, i8, z6);
    }

    private static final int alignPopupEndEdgeToPosition(int i6, int i7, boolean z6) {
        return alignPopupStartEdgeToPosition(i6, i7, !z6);
    }

    private static final int alignPopupStartEdgeToPosition(int i6, int i7, boolean z6) {
        return z6 ? i6 : i6 - i7;
    }

    private static final int alignStartEdges(int i6, int i7, boolean z6) {
        if (z6) {
            return 0;
        }
        return i7 - i6;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i6, int i7, int i8, boolean z6) {
        return popupFitsBetweenPositionAndStartEdge(i6, i7, i8, !z6);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i6, int i7, int i8, boolean z6) {
        return z6 ? i7 <= i6 : i8 - i7 > i6;
    }
}
