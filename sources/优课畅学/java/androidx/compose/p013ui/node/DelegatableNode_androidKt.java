package androidx.compose.p013ui.node;

import android.view.View;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class DelegatableNode_androidKt {
    public static final View requireView(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objRequireOwner = LayoutNodeKt.requireOwner(DelegatableNodeKt.requireLayoutNode(delegatableNode));
        AbstractC9133u.m16131e(objRequireOwner, "null cannot be cast to non-null type android.view.View");
        return (View) objRequireOwner;
    }
}
