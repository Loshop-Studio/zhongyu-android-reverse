package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {
    public static final int $stable = 0;
    private final InterfaceC10773d shownItemCount$delegate;
    private final FlowLayoutOverflowState state;
    private final /* synthetic */ FlowRowScopeInstance $$delegate_0 = FlowRowScopeInstance.INSTANCE;
    private final InterfaceC10773d totalItemCount$delegate = FlowLayoutOverflowKt.lazyInt$default(null, new InterfaceC9529a() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$totalItemCount$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final Integer invoke() {
            return Integer.valueOf(this.this$0.state.getItemCount$foundation_layout_release());
        }
    }, 1, null);

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.shownItemCount$delegate = FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage$foundation_layout_release(), new InterfaceC9529a() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$shownItemCount$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.state.getItemShown$foundation_layout_release());
            }
        });
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
        return ((Number) this.shownItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount$delegate.getValue()).intValue();
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
