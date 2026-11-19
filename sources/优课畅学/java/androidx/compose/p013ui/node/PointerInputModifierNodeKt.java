package androidx.compose.p013ui.node;

import androidx.compose.p013ui.layout.LayoutCoordinates;

/* loaded from: classes2.dex */
public final class PointerInputModifierNodeKt {
    public static final LayoutCoordinates getLayoutCoordinates(PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.m25754requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m25908constructorimpl(16));
    }

    public static final boolean isAttached(PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().isAttached();
    }
}
