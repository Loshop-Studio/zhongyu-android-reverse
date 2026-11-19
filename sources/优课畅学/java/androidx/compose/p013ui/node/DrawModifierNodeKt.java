package androidx.compose.p013ui.node;

/* loaded from: classes2.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m25754requireCoordinator64DMado(drawModifierNode, NodeKind.m25908constructorimpl(1)).invalidateLayer();
        }
    }
}
