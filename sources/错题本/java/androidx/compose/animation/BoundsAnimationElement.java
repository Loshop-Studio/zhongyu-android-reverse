package androidx.compose.animation;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.layout.LookaheadScope;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#Jh\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u000528\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001fRG\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010#¨\u00068"}, m5110d2 = {"Landroidx/compose/animation/BoundsAnimationElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/BoundsAnimationModifierNode;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animatedSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "resolveMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lr6/e;Z)V", "create", "()Landroidx/compose/animation/BoundsAnimationModifierNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/animation/BoundsAnimationModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/layout/LookaheadScope;", "component2", "()Landroidx/compose/animation/BoundsTransform;", "component3", "()Lr6/e;", "component4", "()Z", "copy", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lr6/e;Z)Landroidx/compose/animation/BoundsAnimationElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/LookaheadScope;", "getLookaheadScope", "Landroidx/compose/animation/BoundsTransform;", "getBoundsTransform", "Lr6/e;", "getResolveMeasureConstraints", "Z", "getAnimateMotionFrameOfReference", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {
    public static final int $stable = 0;
    private final boolean animateMotionFrameOfReference;

    @NotNull
    private final BoundsTransform boundsTransform;

    @NotNull
    private final LookaheadScope lookaheadScope;

    @NotNull
    private final InterfaceC6473e resolveMeasureConstraints;

    public BoundsAnimationElement(@NotNull LookaheadScope lookaheadScope, @NotNull BoundsTransform boundsTransform, @NotNull InterfaceC6473e interfaceC6473e, boolean z8) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.resolveMeasureConstraints = interfaceC6473e;
        this.animateMotionFrameOfReference = z8;
    }

    public static /* synthetic */ BoundsAnimationElement copy$default(BoundsAnimationElement boundsAnimationElement, LookaheadScope lookaheadScope, BoundsTransform boundsTransform, InterfaceC6473e interfaceC6473e, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            lookaheadScope = boundsAnimationElement.lookaheadScope;
        }
        if ((i & 2) != 0) {
            boundsTransform = boundsAnimationElement.boundsTransform;
        }
        if ((i & 4) != 0) {
            interfaceC6473e = boundsAnimationElement.resolveMeasureConstraints;
        }
        if ((i & 8) != 0) {
            z8 = boundsAnimationElement.animateMotionFrameOfReference;
        }
        return boundsAnimationElement.copy(lookaheadScope, boundsTransform, interfaceC6473e, z8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InterfaceC6473e getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    @NotNull
    public final BoundsAnimationElement copy(@NotNull LookaheadScope lookaheadScope, @NotNull BoundsTransform boundsTransform, @NotNull InterfaceC6473e resolveMeasureConstraints, boolean animateMotionFrameOfReference) {
        return new BoundsAnimationElement(lookaheadScope, boundsTransform, resolveMeasureConstraints, animateMotionFrameOfReference);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) other;
        return AbstractC5830k.m5325b(this.lookaheadScope, boundsAnimationElement.lookaheadScope) && AbstractC5830k.m5325b(this.boundsTransform, boundsAnimationElement.boundsTransform) && AbstractC5830k.m5325b(this.resolveMeasureConstraints, boundsAnimationElement.resolveMeasureConstraints) && this.animateMotionFrameOfReference == boundsAnimationElement.animateMotionFrameOfReference;
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    @NotNull
    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    @NotNull
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @NotNull
    public final InterfaceC6473e getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.animateMotionFrameOfReference) + ((this.resolveMeasureConstraints.hashCode() + ((this.boundsTransform.hashCode() + (this.lookaheadScope.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("boundsAnimation");
        inspectorInfo.getProperties().set("lookaheadScope", this.lookaheadScope);
        inspectorInfo.getProperties().set("boundsTransform", this.boundsTransform);
        inspectorInfo.getProperties().set("onChooseMeasureConstraints", this.resolveMeasureConstraints);
        inspectorInfo.getProperties().set("animateMotionFrameOfReference", Boolean.valueOf(this.animateMotionFrameOfReference));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BoundsAnimationElement(lookaheadScope=");
        sb.append(this.lookaheadScope);
        sb.append(", boundsTransform=");
        sb.append(this.boundsTransform);
        sb.append(", resolveMeasureConstraints=");
        sb.append(this.resolveMeasureConstraints);
        sb.append(", animateMotionFrameOfReference=");
        return AbstractC0037f.m93r(sb, this.animateMotionFrameOfReference, ')');
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public BoundsAnimationModifierNode getNode() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull BoundsAnimationModifierNode node) {
        node.setLookaheadScope(this.lookaheadScope);
        node.setBoundsTransform(this.boundsTransform);
        node.setOnChooseMeasureConstraints(this.resolveMeasureConstraints);
        node.setAnimateMotionFrameOfReference(this.animateMotionFrameOfReference);
    }
}
