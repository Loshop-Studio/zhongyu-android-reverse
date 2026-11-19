package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {
    private InterfaceC10570l isMeasurementApproachInProgress;
    private InterfaceC10574p isPlacementApproachInProgress;
    private InterfaceC10575q measureBlock;

    public ApproachLayoutModifierNodeImpl(InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        this.measureBlock = interfaceC10575q;
        this.isMeasurementApproachInProgress = interfaceC10570l;
        this.isPlacementApproachInProgress = interfaceC10574p;
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo20172approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
        return (MeasureResult) this.measureBlock.invoke(approachMeasureScope, measurable, Constraints.m26839boximpl(j10));
    }

    public final InterfaceC10575q getMeasureBlock() {
        return this.measureBlock;
    }

    public final InterfaceC10570l isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo20173isMeasurementApproachInProgressozmzZPI(long j10) {
        return ((Boolean) this.isMeasurementApproachInProgress.invoke(IntSize.m27062boximpl(j10))).booleanValue();
    }

    public final InterfaceC10574p isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public final void setMeasureBlock(InterfaceC10575q interfaceC10575q) {
        this.measureBlock = interfaceC10575q;
    }

    public final void setMeasurementApproachInProgress(InterfaceC10570l interfaceC10570l) {
        this.isMeasurementApproachInProgress = interfaceC10570l;
    }

    public final void setPlacementApproachInProgress(InterfaceC10574p interfaceC10574p) {
        this.isPlacementApproachInProgress = interfaceC10574p;
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return ((Boolean) this.isPlacementApproachInProgress.invoke(placementScope, layoutCoordinates)).booleanValue();
    }
}
