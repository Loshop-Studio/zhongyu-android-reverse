package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {
    private InterfaceC9540l isMeasurementApproachInProgress;
    private InterfaceC9544p isPlacementApproachInProgress;
    private InterfaceC9545q measureBlock;

    public ApproachLayoutModifierNodeImpl(InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        this.measureBlock = interfaceC9545q;
        this.isMeasurementApproachInProgress = interfaceC9540l;
        this.isPlacementApproachInProgress = interfaceC9544p;
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo26774approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
        return (MeasureResult) this.measureBlock.invoke(approachMeasureScope, measurable, Constraints.m33441boximpl(j10));
    }

    public final InterfaceC9545q getMeasureBlock() {
        return this.measureBlock;
    }

    public final InterfaceC9540l isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo26775isMeasurementApproachInProgressozmzZPI(long j10) {
        return ((Boolean) this.isMeasurementApproachInProgress.invoke(IntSize.m33664boximpl(j10))).booleanValue();
    }

    public final InterfaceC9544p isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public final void setMeasureBlock(InterfaceC9545q interfaceC9545q) {
        this.measureBlock = interfaceC9545q;
    }

    public final void setMeasurementApproachInProgress(InterfaceC9540l interfaceC9540l) {
        this.isMeasurementApproachInProgress = interfaceC9540l;
    }

    public final void setPlacementApproachInProgress(InterfaceC9544p interfaceC9544p) {
        this.isPlacementApproachInProgress = interfaceC9544p;
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return ((Boolean) this.isPlacementApproachInProgress.invoke(placementScope, layoutCoordinates)).booleanValue();
    }
}
