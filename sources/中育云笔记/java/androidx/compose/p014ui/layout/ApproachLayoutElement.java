package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    private final InterfaceC9545q approachMeasure;
    private final InterfaceC9540l isMeasurementApproachInProgress;
    private final InterfaceC9544p isPlacementApproachInProgress;

    public /* synthetic */ ApproachLayoutElement(InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC9545q, interfaceC9540l, (i10 & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : interfaceC9544p);
    }

    public static /* synthetic */ ApproachLayoutElement copy$default(ApproachLayoutElement approachLayoutElement, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9545q = approachLayoutElement.approachMeasure;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = approachLayoutElement.isMeasurementApproachInProgress;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = approachLayoutElement.isPlacementApproachInProgress;
        }
        return approachLayoutElement.copy(interfaceC9545q, interfaceC9540l, interfaceC9544p);
    }

    public final InterfaceC9545q component1() {
        return this.approachMeasure;
    }

    public final InterfaceC9540l component2() {
        return this.isMeasurementApproachInProgress;
    }

    public final InterfaceC9544p component3() {
        return this.isPlacementApproachInProgress;
    }

    public final ApproachLayoutElement copy(InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        return new ApproachLayoutElement(interfaceC9545q, interfaceC9540l, interfaceC9544p);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return AbstractC9979u.m20289b(this.approachMeasure, approachLayoutElement.approachMeasure) && AbstractC9979u.m20289b(this.isMeasurementApproachInProgress, approachLayoutElement.isMeasurementApproachInProgress) && AbstractC9979u.m20289b(this.isPlacementApproachInProgress, approachLayoutElement.isPlacementApproachInProgress);
    }

    public final InterfaceC9545q getApproachMeasure() {
        return this.approachMeasure;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.approachMeasure.hashCode() * 31) + this.isMeasurementApproachInProgress.hashCode()) * 31) + this.isPlacementApproachInProgress.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }

    public final InterfaceC9540l isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    public final InterfaceC9544p isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.approachMeasure + ", isMeasurementApproachInProgress=" + this.isMeasurementApproachInProgress + ", isPlacementApproachInProgress=" + this.isPlacementApproachInProgress + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ApproachLayoutModifierNodeImpl create() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.setMeasureBlock(this.approachMeasure);
        approachLayoutModifierNodeImpl.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        approachLayoutModifierNodeImpl.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    public ApproachLayoutElement(InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        this.approachMeasure = interfaceC9545q;
        this.isMeasurementApproachInProgress = interfaceC9540l;
        this.isPlacementApproachInProgress = interfaceC9544p;
    }
}
