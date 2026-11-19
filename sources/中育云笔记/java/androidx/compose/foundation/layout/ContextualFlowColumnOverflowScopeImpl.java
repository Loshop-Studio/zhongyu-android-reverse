package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class ContextualFlowColumnOverflowScopeImpl implements FlowColumnOverflowScope, ContextualFlowColumnOverflowScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowColumnOverflowScopeImpl $$delegate_0;
    private final FlowLayoutOverflowState state;

    public ContextualFlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.$$delegate_0 = new FlowColumnOverflowScopeImpl(flowLayoutOverflowState);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, verticalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    @ExperimentalLayoutApi
    public Modifier fillMaxColumnWidth(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return this.$$delegate_0.fillMaxColumnWidth(modifier, f10);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getShownItemCount() {
        return this.$$delegate_0.getShownItemCount();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getTotalItemCount() {
        return this.$$delegate_0.getTotalItemCount();
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10) {
        return this.$$delegate_0.weight(modifier, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return this.$$delegate_0.alignBy(modifier, interfaceC9540l);
    }
}
