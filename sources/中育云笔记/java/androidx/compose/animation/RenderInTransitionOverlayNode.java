package androidx.compose.animation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private InterfaceC9544p clipInOverlay;
    private LayerWithRenderer layerWithRenderer;
    private InterfaceC9529a renderInOverlay;
    private SharedTransitionScopeImpl sharedScope;
    private final MutableFloatState zIndexInOverlay$delegate;

    public final class LayerWithRenderer implements LayerRenderer {
        private final GraphicsLayer layer;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public void drawInOverlay(DrawScope drawScope) {
            if (((Boolean) RenderInTransitionOverlayNode.this.getRenderInOverlay().invoke()).booleanValue()) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
                long jMo32238localPositionOfR5De75A = renderInTransitionOverlayNode.getSharedScope().getRoot$animation_release().mo32238localPositionOfR5De75A(DelegatableNodeKt.requireLayoutCoordinates(renderInTransitionOverlayNode), Offset.Companion.m30653getZeroF1C5BW0());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A & 4294967295L));
                Path path = (Path) renderInTransitionOverlayNode.getClipInOverlay().invoke(drawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(renderInTransitionOverlayNode));
                if (path == null) {
                    drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, this.layer);
                        return;
                    } finally {
                    }
                }
                int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo31352clipPathmtrdDE(path, iM30867getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, this.layer);
                    } finally {
                    }
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                }
            }
        }

        public final GraphicsLayer getLayer() {
            return this.layer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public SharedElementInternalState getParentState() {
            return RenderInTransitionOverlayNode.this.getParentState();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public float getZIndex() {
            return RenderInTransitionOverlayNode.this.getZIndexInOverlay();
        }
    }

    public RenderInTransitionOverlayNode(SharedTransitionScopeImpl sharedTransitionScopeImpl, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p) {
        this.sharedScope = sharedTransitionScopeImpl;
        this.renderInOverlay = interfaceC9529a;
        this.clipInOverlay = interfaceC9544p;
        this.zIndexInOverlay$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        GraphicsLayer layer = getLayer();
        if (layer == null) {
            throw new IllegalArgumentException("Error: layer never initialized");
        }
        DrawScope.m31427recordJVtK1S4$default(contentDrawScope, layer, 0L, new InterfaceC9540l() { // from class: androidx.compose.animation.RenderInTransitionOverlayNode.draw.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                contentDrawScope.drawContent();
            }
        }, 1, null);
        if (((Boolean) this.renderInOverlay.invoke()).booleanValue()) {
            return;
        }
        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
    }

    public final InterfaceC9544p getClipInOverlay() {
        return this.clipInOverlay;
    }

    public final GraphicsLayer getLayer() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            return layerWithRenderer.getLayer();
        }
        return null;
    }

    public final SharedElementInternalState getParentState() {
        return (SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState());
    }

    public final InterfaceC9529a getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final SharedTransitionScopeImpl getSharedScope() {
        return this.sharedScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay$delegate.getFloatValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.sharedScope.onLayerRendererCreated$animation_release(layerWithRenderer);
        this.layerWithRenderer = layerWithRenderer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            this.sharedScope.onLayerRendererRemoved$animation_release(layerWithRenderer);
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(layerWithRenderer.getLayer());
        }
    }

    public final void setClipInOverlay(InterfaceC9544p interfaceC9544p) {
        this.clipInOverlay = interfaceC9544p;
    }

    public final void setRenderInOverlay(InterfaceC9529a interfaceC9529a) {
        this.renderInOverlay = interfaceC9529a;
    }

    public final void setSharedScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedScope = sharedTransitionScopeImpl;
    }

    public final void setZIndexInOverlay(float f10) {
        this.zIndexInOverlay$delegate.setFloatValue(f10);
    }
}
