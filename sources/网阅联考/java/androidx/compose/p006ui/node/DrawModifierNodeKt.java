package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m5175d2 = {"invalidateDraw", "", "Landroidx/compose/ui/node/DrawModifierNode;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,47:1\n67#2:48\n*S KotlinDebug\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n*L\n44#1:48\n*E\n"})
/* loaded from: classes.dex */
public final class DrawModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        Intrinsics.checkNotNullParameter(drawModifierNode, "<this>");
        if (drawModifierNode.getNode().getIsAttached()) {
            DelegatableNodeKt.m10677requireCoordinator64DMado(drawModifierNode, NodeKind.m10773constructorimpl(1)).invalidateLayer();
        }
    }
}
