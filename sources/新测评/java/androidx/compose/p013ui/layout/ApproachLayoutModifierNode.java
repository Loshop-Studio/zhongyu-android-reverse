package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LookaheadDelegate;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J&\u0010\u001c\u001a\u00020\t*\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010!\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, m13558d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "isPlacementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lookaheadCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxApproachIntrinsicHeight", "", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxApproachIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minApproachIntrinsicHeight", "minApproachIntrinsicWidth", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nApproachLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachLayoutModifierNode.kt\nandroidx/compose/ui/layout/ApproachLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes2.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* renamed from: approachMeasure-3p2s80s */
    MeasureResult mo17021approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo17022isMeasurementApproachInProgressozmzZPI(long lookaheadSize);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo22302measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo17021approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    default int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo22302measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo17021approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo17016measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo22324measureBRTryo0.getWidth(), placeableMo22324measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo22324measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    default int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo22302measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo17021approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    default int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo22302measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
                return ApproachLayoutModifierNode.this.mo17021approachMeasure3p2s80s(approachMeasureScope, measurable, j10);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i10) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }
}
