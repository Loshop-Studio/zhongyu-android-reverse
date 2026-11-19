package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0006"}, m5175d2 = {"invalidateLayer", "", "Landroidx/compose/ui/node/LayoutModifierNode;", "invalidateLayout", "invalidateMeasurements", "requestRemeasure", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,302:1\n69#2:303\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n137#1:303\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        DelegatableNodeKt.m10677requireCoordinator64DMado(layoutModifierNode, NodeKind.m10773constructorimpl(2)).invalidateLayer();
    }

    @ExperimentalComposeUiApi
    public static final void invalidateLayout(LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    @ExperimentalComposeUiApi
    public static final void invalidateMeasurements(LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    @ExperimentalComposeUiApi
    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<this>");
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }
}
