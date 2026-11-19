package androidx.compose.animation;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0014*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J$\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nHÆ\u0003¢\u0006\u0004\b'\u0010(JR\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\"\"\u0004\b0\u00101R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$\"\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010&R+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010(¨\u0006:"}, m5110d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "sharedTransitionScope", "Lkotlin/Function0;", "", "renderInOverlay", "", "zIndexInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "clipInOverlay", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lr6/a;FLr6/e;)V", "create", "()Landroidx/compose/animation/RenderInTransitionOverlayNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/animation/RenderInTransitionOverlayNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "component2", "()Lr6/a;", "component3", "()F", "component4", "()Lr6/e;", "copy", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lr6/a;FLr6/e;)Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getSharedTransitionScope", "setSharedTransitionScope", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "Lr6/a;", "getRenderInOverlay", "setRenderInOverlay", "(Lr6/a;)V", "F", "getZIndexInOverlay", "Lr6/e;", "getClipInOverlay", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    public static final int $stable = 0;

    @NotNull
    private final InterfaceC6473e clipInOverlay;

    @NotNull
    private InterfaceC6469a renderInOverlay;

    @NotNull
    private SharedTransitionScopeImpl sharedTransitionScope;
    private final float zIndexInOverlay;

    public RenderInTransitionOverlayNodeElement(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl, @NotNull InterfaceC6469a interfaceC6469a, float f, @NotNull InterfaceC6473e interfaceC6473e) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = interfaceC6469a;
        this.zIndexInOverlay = f;
        this.clipInOverlay = interfaceC6473e;
    }

    public static /* synthetic */ RenderInTransitionOverlayNodeElement copy$default(RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement, SharedTransitionScopeImpl sharedTransitionScopeImpl, InterfaceC6469a interfaceC6469a, float f, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedTransitionScopeImpl = renderInTransitionOverlayNodeElement.sharedTransitionScope;
        }
        if ((i & 2) != 0) {
            interfaceC6469a = renderInTransitionOverlayNodeElement.renderInOverlay;
        }
        if ((i & 4) != 0) {
            f = renderInTransitionOverlayNodeElement.zIndexInOverlay;
        }
        if ((i & 8) != 0) {
            interfaceC6473e = renderInTransitionOverlayNodeElement.clipInOverlay;
        }
        return renderInTransitionOverlayNodeElement.copy(sharedTransitionScopeImpl, interfaceC6469a, f, interfaceC6473e);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6469a getRenderInOverlay() {
        return this.renderInOverlay;
    }

    /* renamed from: component3, reason: from getter */
    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InterfaceC6473e getClipInOverlay() {
        return this.clipInOverlay;
    }

    @NotNull
    public final RenderInTransitionOverlayNodeElement copy(@NotNull SharedTransitionScopeImpl sharedTransitionScope, @NotNull InterfaceC6469a renderInOverlay, float zIndexInOverlay, @NotNull InterfaceC6473e clipInOverlay) {
        return new RenderInTransitionOverlayNodeElement(sharedTransitionScope, renderInOverlay, zIndexInOverlay, clipInOverlay);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (other instanceof RenderInTransitionOverlayNodeElement) {
            RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) other;
            if (AbstractC5830k.m5325b(this.sharedTransitionScope, renderInTransitionOverlayNodeElement.sharedTransitionScope) && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay && this.zIndexInOverlay == renderInTransitionOverlayNodeElement.zIndexInOverlay && this.clipInOverlay == renderInTransitionOverlayNodeElement.clipInOverlay) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final InterfaceC6473e getClipInOverlay() {
        return this.clipInOverlay;
    }

    @NotNull
    public final InterfaceC6469a getRenderInOverlay() {
        return this.renderInOverlay;
    }

    @NotNull
    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.clipInOverlay.hashCode() + AbstractC0584a.m901b(this.zIndexInOverlay, (this.renderInOverlay.hashCode() + (this.sharedTransitionScope.hashCode() * 31)) * 31, 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("renderInSharedTransitionOverlay");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
        inspectorInfo.getProperties().set("renderInOverlay", this.renderInOverlay);
        inspectorInfo.getProperties().set("zIndexInOverlay", Float.valueOf(this.zIndexInOverlay));
        inspectorInfo.getProperties().set("clipInOverlayDuringTransition", this.clipInOverlay);
    }

    public final void setRenderInOverlay(@NotNull InterfaceC6469a interfaceC6469a) {
        this.renderInOverlay = interfaceC6469a;
    }

    public final void setSharedTransitionScope(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    @NotNull
    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.sharedTransitionScope + ", renderInOverlay=" + this.renderInOverlay + ", zIndexInOverlay=" + this.zIndexInOverlay + ", clipInOverlay=" + this.clipInOverlay + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public RenderInTransitionOverlayNode getNode() {
        return new RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay, this.clipInOverlay);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull RenderInTransitionOverlayNode node) {
        node.setSharedScope(this.sharedTransitionScope);
        node.setRenderInOverlay(this.renderInOverlay);
        node.setZIndexInOverlay(this.zIndexInOverlay);
        node.setClipInOverlay(this.clipInOverlay);
    }
}
