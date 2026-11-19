package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.LookaheadDelegate;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null) {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui_release().getLookaheadDelegate();
                AbstractC9133u.m16130d(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
            LayoutNode parent$ui_release2 = layoutNode.getParent$ui_release();
            LayoutNode lookaheadRoot$ui_release = parent$ui_release2 != null ? parent$ui_release2.getLookaheadRoot$ui_release() : null;
            AbstractC9133u.m16130d(lookaheadRoot$ui_release);
            if (lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                layoutNode = layoutNode.getParent$ui_release();
                AbstractC9133u.m16130d(layoutNode);
            } else {
                LayoutNode parent$ui_release3 = layoutNode.getParent$ui_release();
                AbstractC9133u.m16130d(parent$ui_release3);
                layoutNode = parent$ui_release3.getLookaheadRoot$ui_release();
                AbstractC9133u.m16130d(layoutNode);
            }
        }
    }
}
