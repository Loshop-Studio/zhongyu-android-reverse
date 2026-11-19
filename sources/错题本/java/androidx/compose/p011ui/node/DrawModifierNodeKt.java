package androidx.compose.p011ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Landroidx/compose/ui/node/DrawModifierNode;", "Ld6/s;", "invalidateDraw", "(Landroidx/compose/ui/node/DrawModifierNode;)V", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,44:1\n79#2:45\n*S KotlinDebug\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n*L\n41#1:45\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(@NotNull DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().getIsAttached()) {
            DelegatableNodeKt.m12160requireCoordinator64DMado(drawModifierNode, NodeKind.m12314constructorimpl(1)).invalidateLayer();
        }
    }
}
