package androidx.compose.p011ui.layout;

import android.view.View;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"view", "Landroid/view/View;", "Landroidx/compose/ui/layout/LayoutInfo;", "getView", "(Landroidx/compose/ui/layout/LayoutInfo;)Landroid/view/View;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LayoutInfo_androidKt {
    @Nullable
    public static final View getView(@NotNull LayoutInfo layoutInfo) {
        AbstractC5830k.m5328e(layoutInfo, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object owner = ((LayoutNode) layoutInfo).getOwner();
        if (owner instanceof View) {
            return (View) owner;
        }
        return null;
    }
}
