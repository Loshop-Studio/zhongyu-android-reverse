package androidx.compose.p014ui.node;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.CompositionLocal;

/* loaded from: classes2.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final <T> T currentValueOf(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, CompositionLocal<T> compositionLocal) {
        if (!compositionLocalConsumerModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) DelegatableNodeKt.requireLayoutNode(compositionLocalConsumerModifierNode).getCompositionLocalMap().get(compositionLocal);
    }
}
