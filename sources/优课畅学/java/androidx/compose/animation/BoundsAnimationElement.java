package androidx.compose.animation;

import androidx.compose.p013ui.layout.LookaheadScope;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {
    public static final int $stable = 0;
    private final boolean animateMotionFrameOfReference;
    private final BoundsTransform boundsTransform;
    private final LookaheadScope lookaheadScope;
    private final InterfaceC10574p resolveMeasureConstraints;

    public BoundsAnimationElement(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, InterfaceC10574p interfaceC10574p, boolean z10) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.resolveMeasureConstraints = interfaceC10574p;
        this.animateMotionFrameOfReference = z10;
    }

    public static /* synthetic */ BoundsAnimationElement copy$default(BoundsAnimationElement boundsAnimationElement, LookaheadScope lookaheadScope, BoundsTransform boundsTransform, InterfaceC10574p interfaceC10574p, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lookaheadScope = boundsAnimationElement.lookaheadScope;
        }
        if ((i10 & 2) != 0) {
            boundsTransform = boundsAnimationElement.boundsTransform;
        }
        if ((i10 & 4) != 0) {
            interfaceC10574p = boundsAnimationElement.resolveMeasureConstraints;
        }
        if ((i10 & 8) != 0) {
            z10 = boundsAnimationElement.animateMotionFrameOfReference;
        }
        return boundsAnimationElement.copy(lookaheadScope, boundsTransform, interfaceC10574p, z10);
    }

    public final LookaheadScope component1() {
        return this.lookaheadScope;
    }

    public final BoundsTransform component2() {
        return this.boundsTransform;
    }

    public final InterfaceC10574p component3() {
        return this.resolveMeasureConstraints;
    }

    public final boolean component4() {
        return this.animateMotionFrameOfReference;
    }

    public final BoundsAnimationElement copy(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, InterfaceC10574p interfaceC10574p, boolean z10) {
        return new BoundsAnimationElement(lookaheadScope, boundsTransform, interfaceC10574p, z10);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) obj;
        return AbstractC9133u.m16128b(this.lookaheadScope, boundsAnimationElement.lookaheadScope) && AbstractC9133u.m16128b(this.boundsTransform, boundsAnimationElement.boundsTransform) && AbstractC9133u.m16128b(this.resolveMeasureConstraints, boundsAnimationElement.resolveMeasureConstraints) && this.animateMotionFrameOfReference == boundsAnimationElement.animateMotionFrameOfReference;
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final InterfaceC10574p getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + Boolean.hashCode(this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("boundsAnimation");
        inspectorInfo.getProperties().set("lookaheadScope", this.lookaheadScope);
        inspectorInfo.getProperties().set("boundsTransform", this.boundsTransform);
        inspectorInfo.getProperties().set("onChooseMeasureConstraints", this.resolveMeasureConstraints);
        inspectorInfo.getProperties().set("animateMotionFrameOfReference", Boolean.valueOf(this.animateMotionFrameOfReference));
    }

    public String toString() {
        return "BoundsAnimationElement(lookaheadScope=" + this.lookaheadScope + ", boundsTransform=" + this.boundsTransform + ", resolveMeasureConstraints=" + this.resolveMeasureConstraints + ", animateMotionFrameOfReference=" + this.animateMotionFrameOfReference + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public BoundsAnimationModifierNode create() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(BoundsAnimationModifierNode boundsAnimationModifierNode) {
        boundsAnimationModifierNode.setLookaheadScope(this.lookaheadScope);
        boundsAnimationModifierNode.setBoundsTransform(this.boundsTransform);
        boundsAnimationModifierNode.setOnChooseMeasureConstraints(this.resolveMeasureConstraints);
        boundsAnimationModifierNode.setAnimateMotionFrameOfReference(this.animateMotionFrameOfReference);
    }
}
