package androidx.compose.p011ui.node;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsConfigurationKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "Ld6/s;", "invalidateSemantics", "(Landroidx/compose/ui/node/SemanticsModifierNode;)V", "Landroidx/compose/ui/Modifier$Node;", "", "useMinimumTouchTarget", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "(Landroidx/compose/ui/Modifier$Node;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,122:1\n91#2:123\n91#2:124\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n117#1:123\n120#1:124\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(@NotNull SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(@NotNull SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    @NotNull
    public static final Rect touchBoundsInRoot(@NotNull Modifier.Node node, boolean z8) {
        return !node.getNode().getIsAttached() ? Rect.INSTANCE.getZero() : !z8 ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m12160requireCoordinator64DMado(node, NodeKind.m12314constructorimpl(8))) : DelegatableNodeKt.m12160requireCoordinator64DMado(node, NodeKind.m12314constructorimpl(8)).touchBoundsInRoot();
    }
}
