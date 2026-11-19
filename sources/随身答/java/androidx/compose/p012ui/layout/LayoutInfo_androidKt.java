package androidx.compose.p012ui.layout;

import android.view.View;
import androidx.compose.p012ui.node.LayoutNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13413d2 = {"view", "Landroid/view/View;", "Landroidx/compose/ui/layout/LayoutInfo;", "getView", "(Landroidx/compose/ui/layout/LayoutInfo;)Landroid/view/View;", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LayoutInfo_androidKt {
    public static final View getView(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNull(layoutInfo, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object owner = ((LayoutNode) layoutInfo).getOwner();
        if (owner instanceof View) {
            return (View) owner;
        }
        return null;
    }
}
