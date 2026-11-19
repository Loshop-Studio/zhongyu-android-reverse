package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    private final InterfaceC10575q approachMeasure;
    private final InterfaceC10570l isMeasurementApproachInProgress;
    private final InterfaceC10574p isPlacementApproachInProgress;

    public /* synthetic */ ApproachLayoutElement(InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10575q, interfaceC10570l, (i10 & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : interfaceC10574p);
    }

    public static /* synthetic */ ApproachLayoutElement copy$default(ApproachLayoutElement approachLayoutElement, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10575q = approachLayoutElement.approachMeasure;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l = approachLayoutElement.isMeasurementApproachInProgress;
        }
        if ((i10 & 4) != 0) {
            interfaceC10574p = approachLayoutElement.isPlacementApproachInProgress;
        }
        return approachLayoutElement.copy(interfaceC10575q, interfaceC10570l, interfaceC10574p);
    }

    public final InterfaceC10575q component1() {
        return this.approachMeasure;
    }

    public final InterfaceC10570l component2() {
        return this.isMeasurementApproachInProgress;
    }

    public final InterfaceC10574p component3() {
        return this.isPlacementApproachInProgress;
    }

    public final ApproachLayoutElement copy(InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        return new ApproachLayoutElement(interfaceC10575q, interfaceC10570l, interfaceC10574p);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return AbstractC9133u.m16128b(this.approachMeasure, approachLayoutElement.approachMeasure) && AbstractC9133u.m16128b(this.isMeasurementApproachInProgress, approachLayoutElement.isMeasurementApproachInProgress) && AbstractC9133u.m16128b(this.isPlacementApproachInProgress, approachLayoutElement.isPlacementApproachInProgress);
    }

    public final InterfaceC10575q getApproachMeasure() {
        return this.approachMeasure;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.approachMeasure.hashCode() * 31) + this.isMeasurementApproachInProgress.hashCode()) * 31) + this.isPlacementApproachInProgress.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }

    public final InterfaceC10570l isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    public final InterfaceC10574p isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.approachMeasure + ", isMeasurementApproachInProgress=" + this.isMeasurementApproachInProgress + ", isPlacementApproachInProgress=" + this.isPlacementApproachInProgress + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public ApproachLayoutModifierNodeImpl create() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.setMeasureBlock(this.approachMeasure);
        approachLayoutModifierNodeImpl.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        approachLayoutModifierNodeImpl.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    public ApproachLayoutElement(InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        this.approachMeasure = interfaceC10575q;
        this.isMeasurementApproachInProgress = interfaceC10570l;
        this.isPlacementApproachInProgress = interfaceC10574p;
    }
}
