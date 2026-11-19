package androidx.compose.animation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    public static final int $stable = 0;
    private final InterfaceC9544p clipInOverlay;
    private InterfaceC9529a renderInOverlay;
    private SharedTransitionScopeImpl sharedTransitionScope;
    private final float zIndexInOverlay;

    public RenderInTransitionOverlayNodeElement(SharedTransitionScopeImpl sharedTransitionScopeImpl, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = interfaceC9529a;
        this.zIndexInOverlay = f10;
        this.clipInOverlay = interfaceC9544p;
    }

    public static /* synthetic */ RenderInTransitionOverlayNodeElement copy$default(RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement, SharedTransitionScopeImpl sharedTransitionScopeImpl, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sharedTransitionScopeImpl = renderInTransitionOverlayNodeElement.sharedTransitionScope;
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = renderInTransitionOverlayNodeElement.renderInOverlay;
        }
        if ((i10 & 4) != 0) {
            f10 = renderInTransitionOverlayNodeElement.zIndexInOverlay;
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p = renderInTransitionOverlayNodeElement.clipInOverlay;
        }
        return renderInTransitionOverlayNodeElement.copy(sharedTransitionScopeImpl, interfaceC9529a, f10, interfaceC9544p);
    }

    public final SharedTransitionScopeImpl component1() {
        return this.sharedTransitionScope;
    }

    public final InterfaceC9529a component2() {
        return this.renderInOverlay;
    }

    public final float component3() {
        return this.zIndexInOverlay;
    }

    public final InterfaceC9544p component4() {
        return this.clipInOverlay;
    }

    public final RenderInTransitionOverlayNodeElement copy(SharedTransitionScopeImpl sharedTransitionScopeImpl, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p) {
        return new RenderInTransitionOverlayNodeElement(sharedTransitionScopeImpl, interfaceC9529a, f10, interfaceC9544p);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (obj instanceof RenderInTransitionOverlayNodeElement) {
            RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
            if (AbstractC9979u.m20289b(this.sharedTransitionScope, renderInTransitionOverlayNodeElement.sharedTransitionScope) && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay && this.zIndexInOverlay == renderInTransitionOverlayNodeElement.zIndexInOverlay && this.clipInOverlay == renderInTransitionOverlayNodeElement.clipInOverlay) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC9544p getClipInOverlay() {
        return this.clipInOverlay;
    }

    public final InterfaceC9529a getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.sharedTransitionScope.hashCode() * 31) + this.renderInOverlay.hashCode()) * 31) + Float.hashCode(this.zIndexInOverlay)) * 31) + this.clipInOverlay.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("renderInSharedTransitionOverlay");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
        inspectorInfo.getProperties().set("renderInOverlay", this.renderInOverlay);
        inspectorInfo.getProperties().set("zIndexInOverlay", Float.valueOf(this.zIndexInOverlay));
        inspectorInfo.getProperties().set("clipInOverlayDuringTransition", this.clipInOverlay);
    }

    public final void setRenderInOverlay(InterfaceC9529a interfaceC9529a) {
        this.renderInOverlay = interfaceC9529a;
    }

    public final void setSharedTransitionScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.sharedTransitionScope + ", renderInOverlay=" + this.renderInOverlay + ", zIndexInOverlay=" + this.zIndexInOverlay + ", clipInOverlay=" + this.clipInOverlay + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public RenderInTransitionOverlayNode create() {
        return new RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay, this.clipInOverlay);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(RenderInTransitionOverlayNode renderInTransitionOverlayNode) {
        renderInTransitionOverlayNode.setSharedScope(this.sharedTransitionScope);
        renderInTransitionOverlayNode.setRenderInOverlay(this.renderInOverlay);
        renderInTransitionOverlayNode.setZIndexInOverlay(this.zIndexInOverlay);
        renderInTransitionOverlayNode.setClipInOverlay(this.clipInOverlay);
    }
}
