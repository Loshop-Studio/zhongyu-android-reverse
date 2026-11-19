package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;

@LayoutScopeMarker
@Stable
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public interface FlowColumnOverflowScope extends FlowColumnScope {
    @ExperimentalLayoutApi
    static /* synthetic */ void getShownItemCount$annotations() {
    }

    @ExperimentalLayoutApi
    static /* synthetic */ void getTotalItemCount$annotations() {
    }

    int getShownItemCount();

    int getTotalItemCount();
}
