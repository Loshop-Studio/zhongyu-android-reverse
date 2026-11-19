package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.modifier.ModifierLocalMap;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {
    private final ValueInsets insets;
    private long oldPosition;
    private final ModifierLocalMap providedValues;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.insets = valueInsets;
        this.oldPosition = IntOffset.Companion.m27038getZeronOccac();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(AbstractC8726f.m14230a(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), valueInsets));
    }

    public final ValueInsets getInsets() {
        return this.insets;
    }

    /* renamed from: getOldPosition-nOcc-ac, reason: not valid java name */
    public final long m20881getOldPositionnOccac() {
        return this.oldPosition;
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, final Measurable measurable, long j10) {
        if (Constraints.m26850getHasFixedWidthimpl(j10) && Constraints.m26849getHasFixedHeightimpl(j10)) {
            final int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
            final int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
            return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iM26851getMaxHeightimpl, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
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
                    WindowInsets insets;
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        this.this$0.m20882setOldPositiongyyYBs(IntOffsetKt.m27044roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates)));
                    }
                    if (coordinates == null) {
                        insets = (WindowInsets) this.this$0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
                    } else {
                        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                        long jMo25635getSizeYbymL2g = coordinates.mo25635getSizeYbymL2g();
                        long jMo25638localToRootMKHz9U = coordinates.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g >> 32)) << 32)));
                        long jMo25635getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo25635getSizeYbymL2g();
                        int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
                        int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L)));
                        int iRound3 = ((int) (jMo25635getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jMo25638localToRootMKHz9U >> 32)));
                        int iRound4 = ((int) (jMo25635getSizeYbymL2g2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jMo25638localToRootMKHz9U & 4294967295L)));
                        InsetsValues value$foundation_layout_release = this.this$0.getInsets().getValue$foundation_layout_release();
                        if (value$foundation_layout_release.getLeft() != iRound || value$foundation_layout_release.getTop() != iRound2 || value$foundation_layout_release.getRight() != iRound3 || value$foundation_layout_release.getBottom() != iRound4) {
                            this.this$0.getInsets().setValue$foundation_layout_release(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                        }
                        insets = this.this$0.getInsets();
                    }
                    this.this$0.provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), insets);
                    Placeable.PlacementScope.place$default(placementScope, measurable.mo25627measureBRTryo0(Constraints.Companion.m26862fixedJhjzzOo(iM26852getMaxWidthimpl, iM26851getMaxHeightimpl)), 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets()));
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        long jM27044roundk4lQ0M = IntOffsetKt.m27044roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        boolean zM27026equalsimpl0 = IntOffset.m27026equalsimpl0(this.oldPosition, jM27044roundk4lQ0M);
        this.oldPosition = jM27044roundk4lQ0M;
        if (zM27026equalsimpl0) {
            return;
        }
        LayoutModifierNodeKt.invalidatePlacement(this);
    }

    /* renamed from: setOldPosition--gyyYBs, reason: not valid java name */
    public final void m20882setOldPositiongyyYBs(long j10) {
        this.oldPosition = j10;
    }
}
