package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private InterfaceC10559a isEnabled;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private final Transition<EnterExitState> transition;

    public EnterExitTransitionElement(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC10559a interfaceC10559a, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = interfaceC10559a;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public static /* synthetic */ EnterExitTransitionElement copy$default(EnterExitTransitionElement enterExitTransitionElement, Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC10559a interfaceC10559a, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transition = enterExitTransitionElement.transition;
        }
        if ((i10 & 2) != 0) {
            deferredAnimation = enterExitTransitionElement.sizeAnimation;
        }
        if ((i10 & 4) != 0) {
            deferredAnimation2 = enterExitTransitionElement.offsetAnimation;
        }
        if ((i10 & 8) != 0) {
            deferredAnimation3 = enterExitTransitionElement.slideAnimation;
        }
        if ((i10 & 16) != 0) {
            enterTransition = enterExitTransitionElement.enter;
        }
        if ((i10 & 32) != 0) {
            exitTransition = enterExitTransitionElement.exit;
        }
        if ((i10 & 64) != 0) {
            interfaceC10559a = enterExitTransitionElement.isEnabled;
        }
        if ((i10 & 128) != 0) {
            graphicsLayerBlockForEnterExit = enterExitTransitionElement.graphicsLayerBlock;
        }
        InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit2 = graphicsLayerBlockForEnterExit;
        EnterTransition enterTransition2 = enterTransition;
        ExitTransition exitTransition2 = exitTransition;
        return enterExitTransitionElement.copy(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition2, exitTransition2, interfaceC10559a2, graphicsLayerBlockForEnterExit2);
    }

    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    public final EnterTransition component5() {
        return this.enter;
    }

    public final ExitTransition component6() {
        return this.exit;
    }

    public final InterfaceC10559a component7() {
        return this.isEnabled;
    }

    public final GraphicsLayerBlockForEnterExit component8() {
        return this.graphicsLayerBlock;
    }

    public final EnterExitTransitionElement copy(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC10559a interfaceC10559a, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        return new EnterExitTransitionElement(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition, exitTransition, interfaceC10559a, graphicsLayerBlockForEnterExit);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return AbstractC9133u.m16128b(this.transition, enterExitTransitionElement.transition) && AbstractC9133u.m16128b(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && AbstractC9133u.m16128b(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && AbstractC9133u.m16128b(this.slideAnimation, enterExitTransitionElement.slideAnimation) && AbstractC9133u.m16128b(this.enter, enterExitTransitionElement.enter) && AbstractC9133u.m16128b(this.exit, enterExitTransitionElement.exit) && AbstractC9133u.m16128b(this.isEnabled, enterExitTransitionElement.isEnabled) && AbstractC9133u.m16128b(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return ((((((((iHashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.transition);
        inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
        inspectorInfo.getProperties().set("offsetAnimation", this.offsetAnimation);
        inspectorInfo.getProperties().set("slideAnimation", this.slideAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set("exit", this.exit);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
    }

    public final InterfaceC10559a isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(InterfaceC10559a interfaceC10559a) {
        this.isEnabled = interfaceC10559a;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.setTransition(this.transition);
        enterExitTransitionModifierNode.setSizeAnimation(this.sizeAnimation);
        enterExitTransitionModifierNode.setOffsetAnimation(this.offsetAnimation);
        enterExitTransitionModifierNode.setSlideAnimation(this.slideAnimation);
        enterExitTransitionModifierNode.setEnter(this.enter);
        enterExitTransitionModifierNode.setExit(this.exit);
        enterExitTransitionModifierNode.setEnabled(this.isEnabled);
        enterExitTransitionModifierNode.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }
}
