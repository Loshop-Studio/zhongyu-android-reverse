package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"rootLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinatesKt {
    @NotNull
    public static final LookaheadDelegate getRootLookaheadDelegate(@NotNull LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot() : null) == null) {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui_release().getLookaheadDelegate();
                AbstractC5830k.m5327d(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
            LayoutNode parent$ui_release2 = layoutNode.getParent$ui_release();
            LayoutNode lookaheadRoot = parent$ui_release2 != null ? parent$ui_release2.getLookaheadRoot() : null;
            AbstractC5830k.m5327d(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.getParent$ui_release();
                AbstractC5830k.m5327d(layoutNode);
            } else {
                LayoutNode parent$ui_release3 = layoutNode.getParent$ui_release();
                AbstractC5830k.m5327d(parent$ui_release3);
                layoutNode = parent$ui_release3.getLookaheadRoot();
                AbstractC5830k.m5327d(layoutNode);
            }
        }
    }
}
