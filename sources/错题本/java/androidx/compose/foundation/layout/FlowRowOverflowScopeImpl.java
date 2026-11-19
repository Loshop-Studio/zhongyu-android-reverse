package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u0007*\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\b\b\u0003\u0010\u0018\u001a\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\u0007*\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u001b\u0010$\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006("}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "alignBy", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "totalItemCount$delegate", "Ld6/e;", "getTotalItemCount", "()I", "totalItemCount", "shownItemCount$delegate", "getShownItemCount", "shownItemCount", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {
    public static final int $stable = 0;

    /* renamed from: shownItemCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e shownItemCount;

    @NotNull
    private final FlowLayoutOverflowState state;
    private final /* synthetic */ FlowRowScopeInstance $$delegate_0 = FlowRowScopeInstance.INSTANCE;

    /* renamed from: totalItemCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e totalItemCount = FlowLayoutOverflowKt.lazyInt$default(null, new InterfaceC6469a() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$totalItemCount$2
        {
            super(0);
        }

        @Override // p152r6.InterfaceC6469a
        public final Integer invoke() {
            return Integer.valueOf(this.this$0.state.getItemCount());
        }
    }, 1, null);

    public FlowRowOverflowScopeImpl(@NotNull FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.shownItemCount = FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage(), new InterfaceC6469a() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$shownItemCount$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.state.getItemShown());
            }
        });
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier, @NotNull Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    @ExperimentalLayoutApi
    @NotNull
    public Modifier fillMaxRowHeight(@NotNull Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f) {
        return this.$$delegate_0.fillMaxRowHeight(modifier, f);
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getShownItemCount() {
        return ((Number) this.shownItemCount.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f, boolean z8) {
        return this.$$delegate_0.weight(modifier, f, z8);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return this.$$delegate_0.alignBy(modifier, interfaceC6471c);
    }
}
