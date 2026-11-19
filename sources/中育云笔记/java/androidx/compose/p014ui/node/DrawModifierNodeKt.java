package androidx.compose.p014ui.node;

/* loaded from: classes2.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m32356requireCoordinator64DMado(drawModifierNode, NodeKind.m32510constructorimpl(1)).invalidateLayer();
        }
    }
}
