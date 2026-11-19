package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@ExperimentalComposeUiApi
@Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m5175d2 = {"Landroidx/compose/ui/node/ObserverNode;", "Landroidx/compose/ui/node/DelegatableNode;", "onObservedReadsChanged", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ObserverNode extends DelegatableNode {
    void onObservedReadsChanged();
}
