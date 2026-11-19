package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class ContextualFlowRowOverflowScopeImpl implements FlowRowOverflowScope, ContextualFlowRowOverflowScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowRowOverflowScopeImpl $$delegate_0;
    private final FlowLayoutOverflowState state;

    public ContextualFlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.$$delegate_0 = new FlowRowOverflowScopeImpl(flowLayoutOverflowState);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    @ExperimentalLayoutApi
    public Modifier fillMaxRowHeight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return this.$$delegate_0.fillMaxRowHeight(modifier, f10);
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getShownItemCount() {
        return this.$$delegate_0.getShownItemCount();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getTotalItemCount() {
        return this.$$delegate_0.getTotalItemCount();
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10) {
        return this.$$delegate_0.weight(modifier, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return this.$$delegate_0.alignBy(modifier, interfaceC9540l);
    }
}
