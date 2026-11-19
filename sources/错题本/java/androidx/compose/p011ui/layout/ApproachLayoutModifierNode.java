package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.NodeMeasuringIntrinsics;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J&\u0010\u001c\u001a\u00020\t*\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010!\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "isPlacementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lookaheadCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxApproachIntrinsicHeight", "", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxApproachIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minApproachIntrinsicHeight", "minApproachIntrinsicWidth", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nApproachLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachLayoutModifierNode.kt\nandroidx/compose/ui/layout/ApproachLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes2.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    @NotNull
    /* renamed from: approachMeasure-3p2s80s */
    MeasureResult mo6578approachMeasure3p2s80s(@NotNull ApproachMeasureScope approachMeasureScope, @NotNull Measurable measurable, long j7);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo6579isMeasurementApproachInProgressozmzZPI(long lookaheadSize);

    default boolean isPlacementApproachInProgress(@NotNull Placeable.PlacementScope placementScope, @NotNull LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int maxApproachIntrinsicHeight(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        AbstractC5830k.m5327d(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        AbstractC5830k.m5327d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo12011measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j7) {
                return ApproachLayoutModifierNode.this.mo6578approachMeasure3p2s80s(approachMeasureScope, measurable, j7);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    default int maxApproachIntrinsicWidth(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        AbstractC5830k.m5327d(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        AbstractC5830k.m5327d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo12011measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j7) {
                return ApproachLayoutModifierNode.this.mo6578approachMeasure3p2s80s(approachMeasureScope, measurable, j7);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    default int minApproachIntrinsicHeight(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        AbstractC5830k.m5327d(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        AbstractC5830k.m5327d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo12011measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j7) {
                return ApproachLayoutModifierNode.this.mo6578approachMeasure3p2s80s(approachMeasureScope, measurable, j7);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    default int minApproachIntrinsicWidth(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        AbstractC5830k.m5327d(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        AbstractC5830k.m5327d(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo12011measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j7) {
                return ApproachLayoutModifierNode.this.mo6578approachMeasure3p2s80s(approachMeasureScope, measurable, j7);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
