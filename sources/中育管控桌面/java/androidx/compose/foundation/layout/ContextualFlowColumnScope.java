package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.p009ui.Modifier;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Deprecated;
import kotlin.Metadata;

@LayoutScopeMarker
@ExperimentalLayoutApi
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u000e\u001a\u00020\u000f*\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u0011H'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\u00020\tX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\tX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m7880d2 = {"Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "Landroidx/compose/foundation/layout/ColumnScope;", "indexInLine", "", "getIndexInLine", "()I", "lineIndex", "getLineIndex", "maxHeightInLine", "Landroidx/compose/ui/unit/Dp;", "getMaxHeightInLine-D9Ej5fM", "()F", "maxWidth", "getMaxWidth-D9Ej5fM", "fillMaxColumnWidth", "Landroidx/compose/ui/Modifier;", "fraction", "", "foundation-layout_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@Stable
@Deprecated(message = "ContextualFlowLayouts are no longer maintained")
/* loaded from: classes.dex */
public interface ContextualFlowColumnScope extends ColumnScope {
    static /* synthetic */ Modifier fillMaxColumnWidth$default(ContextualFlowColumnScope contextualFlowColumnScope, Modifier modifier, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        return contextualFlowColumnScope.fillMaxColumnWidth(modifier, f6);
    }

    @ExperimentalLayoutApi
    Modifier fillMaxColumnWidth(Modifier modifier, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeightInLine-D9Ej5fM, reason: not valid java name */
    float mo10519getMaxHeightInLineD9Ej5fM();

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo10520getMaxWidthD9Ej5fM();
}
