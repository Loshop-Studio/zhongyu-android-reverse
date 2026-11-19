package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlowColumnOverflowScopeImpl implements FlowColumnScope, FlowColumnOverflowScope {
    public static final int $stable = 0;
    private final InterfaceC10773d shownItemCount$delegate;
    private final FlowLayoutOverflowState state;
    private final /* synthetic */ FlowColumnScopeInstance $$delegate_0 = FlowColumnScopeInstance.INSTANCE;
    private final InterfaceC10773d totalItemCount$delegate = FlowLayoutOverflowKt.lazyInt$default(null, new InterfaceC9529a() { // from class: androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl$totalItemCount$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final Integer invoke() {
            return Integer.valueOf(this.this$0.state.getItemCount$foundation_layout_release());
        }
    }, 1, null);

    public FlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.shownItemCount$delegate = FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage$foundation_layout_release(), new InterfaceC9529a() { // from class: androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl$shownItemCount$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.state.getItemShown$foundation_layout_release());
            }
        });
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
        return ((Number) this.shownItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount$delegate.getValue()).intValue();
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
