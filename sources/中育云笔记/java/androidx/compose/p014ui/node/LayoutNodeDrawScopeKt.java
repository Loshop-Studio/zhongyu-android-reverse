package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;

/* loaded from: classes2.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(4);
        int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(2);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
            return null;
        }
        while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & iM32510constructorimpl2) == 0) {
            if ((child$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
