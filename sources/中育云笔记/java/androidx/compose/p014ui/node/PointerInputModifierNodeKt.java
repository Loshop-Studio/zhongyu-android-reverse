package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.LayoutCoordinates;

/* loaded from: classes2.dex */
public final class PointerInputModifierNodeKt {
    public static final LayoutCoordinates getLayoutCoordinates(PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.m32356requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m32510constructorimpl(16));
    }

    public static final boolean isAttached(PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().isAttached();
    }
}
