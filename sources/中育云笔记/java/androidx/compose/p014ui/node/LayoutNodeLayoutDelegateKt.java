package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.runtime.collection.MutableVector;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        return (parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null || layoutNode.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Measurable> void updateChildMeasurables(LayoutNode layoutNode, MutableVector<T> mutableVector, InterfaceC9540l interfaceC9540l) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (mutableVector.getSize() <= i10) {
                mutableVector.add(interfaceC9540l.invoke(layoutNode2));
            } else {
                mutableVector.set(i10, interfaceC9540l.invoke(layoutNode2));
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
    }
}
