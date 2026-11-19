package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.modifier.ModifierLocalMap;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {
    private final ValueInsets insets;
    private long oldPosition;
    private final ModifierLocalMap providedValues;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.insets = valueInsets;
        this.oldPosition = IntOffset.Companion.m33640getZeronOccac();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(AbstractC10776g.m22975a(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), valueInsets));
    }

    public final ValueInsets getInsets() {
        return this.insets;
    }

    /* renamed from: getOldPosition-nOcc-ac, reason: not valid java name */
    public final long m27483getOldPositionnOccac() {
        return this.oldPosition;
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, final Measurable measurable, long j10) {
        if (Constraints.m33452getHasFixedWidthimpl(j10) && Constraints.m33451getHasFixedHeightimpl(j10)) {
            final int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
            final int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
            return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33453getMaxHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
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
                    WindowInsets insets;
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        this.this$0.m27484setOldPositiongyyYBs(IntOffsetKt.m33646roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates)));
                    }
                    if (coordinates == null) {
                        insets = (WindowInsets) this.this$0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
                    } else {
                        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                        long jMo32237getSizeYbymL2g = coordinates.mo32237getSizeYbymL2g();
                        long jMo32240localToRootMKHz9U = coordinates.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g >> 32)) << 32)));
                        long jMo32237getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo32237getSizeYbymL2g();
                        int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
                        int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L)));
                        int iRound3 = ((int) (jMo32237getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jMo32240localToRootMKHz9U >> 32)));
                        int iRound4 = ((int) (jMo32237getSizeYbymL2g2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jMo32240localToRootMKHz9U & 4294967295L)));
                        InsetsValues value$foundation_layout_release = this.this$0.getInsets().getValue$foundation_layout_release();
                        if (value$foundation_layout_release.getLeft() != iRound || value$foundation_layout_release.getTop() != iRound2 || value$foundation_layout_release.getRight() != iRound3 || value$foundation_layout_release.getBottom() != iRound4) {
                            this.this$0.getInsets().setValue$foundation_layout_release(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                        }
                        insets = this.this$0.getInsets();
                    }
                    this.this$0.provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), insets);
                    Placeable.PlacementScope.place$default(placementScope, measurable.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo(iM33454getMaxWidthimpl, iM33453getMaxHeightimpl)), 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets()));
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        long jM33646roundk4lQ0M = IntOffsetKt.m33646roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        boolean zM33628equalsimpl0 = IntOffset.m33628equalsimpl0(this.oldPosition, jM33646roundk4lQ0M);
        this.oldPosition = jM33646roundk4lQ0M;
        if (zM33628equalsimpl0) {
            return;
        }
        LayoutModifierNodeKt.invalidatePlacement(this);
    }

    /* renamed from: setOldPosition--gyyYBs, reason: not valid java name */
    public final void m27484setOldPositiongyyYBs(long j10) {
        this.oldPosition = j10;
    }
}
