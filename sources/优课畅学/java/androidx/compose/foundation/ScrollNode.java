package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.semantics.ScrollAxisRange;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

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

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new InterfaceC10559a() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Float invoke() {
                return Float.valueOf(this.this$0.getState().getValue());
            }
        }, new InterfaceC10559a() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
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

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        CheckScrollableContainerConstraintsKt.m20378checkScrollableContainerConstraintsK40F9xA(j10, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j10, 0, this.isVertical ? Constraints.m26852getMaxWidthimpl(j10) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m26851getMaxHeightimpl(j10), 5, null));
        int iM13513h = AbstractC8323h.m13513h(placeableMo25627measureBRTryo0.getWidth(), Constraints.m26852getMaxWidthimpl(j10));
        int iM13513h2 = AbstractC8323h.m13513h(placeableMo25627measureBRTryo0.getHeight(), Constraints.m26851getMaxHeightimpl(j10));
        final int height = placeableMo25627measureBRTryo0.getHeight() - iM13513h2;
        int width = placeableMo25627measureBRTryo0.getWidth() - iM13513h;
        if (!this.isVertical) {
            height = width;
        }
        this.state.setMaxValue$foundation_release(height);
        this.state.setViewportSize$foundation_release(this.isVertical ? iM13513h2 : iM13513h);
        return MeasureScope.layout$default(measureScope, iM13513h, iM13513h2, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.ScrollNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
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
                final Placeable placeable = placeableMo25627measureBRTryo0;
                placementScope.withMotionFrameOfReferencePlacement(new InterfaceC10570l() { // from class: androidx.compose.foundation.ScrollNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope2) {
                        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope2, placeable, i12, i13, 0.0f, (InterfaceC10570l) null, 12, (Object) null);
                    }
                });
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!this.isVertical) {
            i10 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
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
