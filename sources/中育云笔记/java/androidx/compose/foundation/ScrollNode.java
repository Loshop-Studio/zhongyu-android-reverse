package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isVertical;
    private boolean reverseScrolling;
    private ScrollState state;

    public ScrollNode(ScrollState scrollState, boolean z10, boolean z11) {
        this.state = scrollState;
        this.reverseScrolling = z10;
        this.isVertical = z11;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new InterfaceC9529a() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(this.this$0.getState().getValue());
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(this.this$0.getState().getMaxValue());
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final ScrollState getState() {
        return this.state;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        CheckScrollableContainerConstraintsKt.m26980checkScrollableContainerConstraintsK40F9xA(j10, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, this.isVertical ? Constraints.m33454getMaxWidthimpl(j10) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m33453getMaxHeightimpl(j10), 5, null));
        int iM21756i = AbstractC10410o.m21756i(placeableMo32229measureBRTryo0.getWidth(), Constraints.m33454getMaxWidthimpl(j10));
        int iM21756i2 = AbstractC10410o.m21756i(placeableMo32229measureBRTryo0.getHeight(), Constraints.m33453getMaxHeightimpl(j10));
        final int height = placeableMo32229measureBRTryo0.getHeight() - iM21756i2;
        int width = placeableMo32229measureBRTryo0.getWidth() - iM21756i;
        if (!this.isVertical) {
            height = width;
        }
        this.state.setMaxValue$foundation_release(height);
        this.state.setViewportSize$foundation_release(this.isVertical ? iM21756i2 : iM21756i);
        return MeasureScope.layout$default(measureScope, iM21756i, iM21756i2, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.ScrollNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                int value = this.this$0.getState().getValue();
                int i10 = height;
                if (value < 0) {
                    value = 0;
                }
                if (value <= i10) {
                    i10 = value;
                }
                int i11 = this.this$0.getReverseScrolling() ? i10 - height : -i10;
                final int i12 = this.this$0.isVertical() ? 0 : i11;
                final int i13 = this.this$0.isVertical() ? i11 : 0;
                final Placeable placeable = placeableMo32229measureBRTryo0;
                placementScope.withMotionFrameOfReferencePlacement(new InterfaceC9540l() { // from class: androidx.compose.foundation.ScrollNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope2) {
                        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope2, placeable, i12, i13, 0.0f, (InterfaceC9540l) null, 12, (Object) null);
                    }
                });
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    public final void setReverseScrolling(boolean z10) {
        this.reverseScrolling = z10;
    }

    public final void setState(ScrollState scrollState) {
        this.state = scrollState;
    }

    public final void setVertical(boolean z10) {
        this.isVertical = z10;
    }
}
