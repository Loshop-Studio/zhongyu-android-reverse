package androidx.compose.p011ui.layout;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u001d\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0015\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u001cJ&\u0010\u001f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR]\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b\u0011\u0010&\"\u0004\b'\u0010(R9\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5110d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measureBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "isMeasurementApproachInProgress", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isPlacementApproachInProgress", "<init>", "(Lr6/f;Lr6/c;Lr6/e;)V", "lookaheadSize", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "lookaheadCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Lr6/f;", "getMeasureBlock", "()Lr6/f;", "setMeasureBlock", "(Lr6/f;)V", "Lr6/c;", "()Lr6/c;", "setMeasurementApproachInProgress", "(Lr6/c;)V", "Lr6/e;", "()Lr6/e;", "setPlacementApproachInProgress", "(Lr6/e;)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {

    @NotNull
    private InterfaceC6471c isMeasurementApproachInProgress;

    @NotNull
    private InterfaceC6473e isPlacementApproachInProgress;

    @NotNull
    private InterfaceC6474f measureBlock;

    public ApproachLayoutModifierNodeImpl(@NotNull InterfaceC6474f interfaceC6474f, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e) {
        this.measureBlock = interfaceC6474f;
        this.isMeasurementApproachInProgress = interfaceC6471c;
        this.isPlacementApproachInProgress = interfaceC6473e;
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    @NotNull
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo6578approachMeasure3p2s80s(@NotNull ApproachMeasureScope approachMeasureScope, @NotNull Measurable measurable, long j7) {
        return (MeasureResult) this.measureBlock.invoke(approachMeasureScope, measurable, Constraints.m13245boximpl(j7));
    }

    @NotNull
    public final InterfaceC6474f getMeasureBlock() {
        return this.measureBlock;
    }

    @NotNull
    /* renamed from: isMeasurementApproachInProgress, reason: from getter */
    public final InterfaceC6471c getIsMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo6579isMeasurementApproachInProgressozmzZPI(long lookaheadSize) {
        return ((Boolean) this.isMeasurementApproachInProgress.invoke(IntSize.m13468boximpl(lookaheadSize))).booleanValue();
    }

    @NotNull
    /* renamed from: isPlacementApproachInProgress, reason: from getter */
    public final InterfaceC6473e getIsPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public final void setMeasureBlock(@NotNull InterfaceC6474f interfaceC6474f) {
        this.measureBlock = interfaceC6474f;
    }

    public final void setMeasurementApproachInProgress(@NotNull InterfaceC6471c interfaceC6471c) {
        this.isMeasurementApproachInProgress = interfaceC6471c;
    }

    public final void setPlacementApproachInProgress(@NotNull InterfaceC6473e interfaceC6473e) {
        this.isPlacementApproachInProgress = interfaceC6473e;
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(@NotNull Placeable.PlacementScope placementScope, @NotNull LayoutCoordinates layoutCoordinates) {
        return ((Boolean) this.isPlacementApproachInProgress.invoke(placementScope, layoutCoordinates)).booleanValue();
    }
}
