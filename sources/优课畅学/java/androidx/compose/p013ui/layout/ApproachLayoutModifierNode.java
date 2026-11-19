package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LookaheadDelegate;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.NodeMeasuringIntrinsics;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* renamed from: approachMeasure-3p2s80s */
    MeasureResult mo20172approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo20173isMeasurementApproachInProgressozmzZPI(long j10);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        AbstractC9133u.m16130d(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo25605measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo20172approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    default int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        AbstractC9133u.m16130d(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo25605measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo20172approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
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

    default int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        AbstractC9133u.m16130d(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo25605measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo20172approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    default int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        AbstractC9133u.m16130d(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo25605measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo20172approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }
}
