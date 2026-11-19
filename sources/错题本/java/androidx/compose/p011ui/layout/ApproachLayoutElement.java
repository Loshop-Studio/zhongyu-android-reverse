package androidx.compose.p011ui.layout;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008e\u0001\u0012A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012.\b\u0002\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\f¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001c*\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!JK\u0010\"\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J6\u0010&\u001a(\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u009b\u0001\u0010(\u001a\u00020\u00002C\b\u0002\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2.\b\u0002\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103RR\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010#R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b\u0011\u0010%R=\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b\u0016\u0010'¨\u00068"}, m5110d2 = {"Landroidx/compose/ui/layout/ApproachLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "approachMeasure", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "isMeasurementApproachInProgress", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "isPlacementApproachInProgress", "<init>", "(Lr6/f;Lr6/c;Lr6/e;)V", "create", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;", "node", "Ld6/s;", "update", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lr6/f;", "component2", "()Lr6/c;", "component3", "()Lr6/e;", "copy", "(Lr6/f;Lr6/c;Lr6/e;)Landroidx/compose/ui/layout/ApproachLayoutElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lr6/f;", "getApproachMeasure", "Lr6/c;", "Lr6/e;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final /* data */ class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {

    @NotNull
    private final InterfaceC6474f approachMeasure;

    @NotNull
    private final InterfaceC6471c isMeasurementApproachInProgress;

    @NotNull
    private final InterfaceC6473e isPlacementApproachInProgress;

    public /* synthetic */ ApproachLayoutElement(InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, int i, AbstractC5824e abstractC5824e) {
        this(interfaceC6474f, interfaceC6471c, (i & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : interfaceC6473e);
    }

    public static /* synthetic */ ApproachLayoutElement copy$default(ApproachLayoutElement approachLayoutElement, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6474f = approachLayoutElement.approachMeasure;
        }
        if ((i & 2) != 0) {
            interfaceC6471c = approachLayoutElement.isMeasurementApproachInProgress;
        }
        if ((i & 4) != 0) {
            interfaceC6473e = approachLayoutElement.isPlacementApproachInProgress;
        }
        return approachLayoutElement.copy(interfaceC6474f, interfaceC6471c, interfaceC6473e);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InterfaceC6474f getApproachMeasure() {
        return this.approachMeasure;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6471c getIsMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InterfaceC6473e getIsPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    @NotNull
    public final ApproachLayoutElement copy(@NotNull InterfaceC6474f approachMeasure, @NotNull InterfaceC6471c isMeasurementApproachInProgress, @NotNull InterfaceC6473e isPlacementApproachInProgress) {
        return new ApproachLayoutElement(approachMeasure, isMeasurementApproachInProgress, isPlacementApproachInProgress);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) other;
        return AbstractC5830k.m5325b(this.approachMeasure, approachLayoutElement.approachMeasure) && AbstractC5830k.m5325b(this.isMeasurementApproachInProgress, approachLayoutElement.isMeasurementApproachInProgress) && AbstractC5830k.m5325b(this.isPlacementApproachInProgress, approachLayoutElement.isPlacementApproachInProgress);
    }

    @NotNull
    public final InterfaceC6474f getApproachMeasure() {
        return this.approachMeasure;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.isPlacementApproachInProgress.hashCode() + ((this.isMeasurementApproachInProgress.hashCode() + (this.approachMeasure.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }

    @NotNull
    public final InterfaceC6471c isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @NotNull
    public final InterfaceC6473e isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    @NotNull
    public String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.approachMeasure + ", isMeasurementApproachInProgress=" + this.isMeasurementApproachInProgress + ", isPlacementApproachInProgress=" + this.isPlacementApproachInProgress + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public ApproachLayoutModifierNodeImpl getNode() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull ApproachLayoutModifierNodeImpl node) {
        node.setMeasureBlock(this.approachMeasure);
        node.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        node.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    public ApproachLayoutElement(@NotNull InterfaceC6474f interfaceC6474f, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e) {
        this.approachMeasure = interfaceC6474f;
        this.isMeasurementApproachInProgress = interfaceC6471c;
        this.isPlacementApproachInProgress = interfaceC6473e;
    }
}
