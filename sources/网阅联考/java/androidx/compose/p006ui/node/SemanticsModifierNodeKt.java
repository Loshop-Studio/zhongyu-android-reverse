package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.semantics.SemanticsActions;
import androidx.compose.p006ui.semantics.SemanticsConfiguration;
import androidx.compose.p006ui.semantics.SemanticsConfigurationKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0002H\u0007\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m5175d2 = {"useMinimumTouchTarget", "", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getUseMinimumTouchTarget$annotations", "(Landroidx/compose/ui/node/SemanticsModifierNode;)V", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/node/SemanticsModifierNode;)Z", "collapsedSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "invalidateSemantics", "", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,73:1\n73#2:74\n73#2:76\n73#2:77\n308#3:75\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n48#1:74\n68#1:76\n71#1:77\n48#1:75\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final SemanticsConfiguration collapsedSemanticsConfiguration(SemanticsModifierNode semanticsModifierNode) {
        Intrinsics.checkNotNullParameter(semanticsModifierNode, "<this>");
        Object objLocalChild = DelegatableNodeKt.localChild(semanticsModifierNode, NodeKind.m10773constructorimpl(8));
        if (!(objLocalChild instanceof SemanticsModifierNode)) {
            objLocalChild = null;
        }
        SemanticsModifierNode semanticsModifierNode2 = (SemanticsModifierNode) objLocalChild;
        if (semanticsModifierNode2 == null || semanticsModifierNode.getSemanticsConfiguration().getIsClearingSemantics()) {
            return semanticsModifierNode.getSemanticsConfiguration();
        }
        SemanticsConfiguration semanticsConfigurationCopy = semanticsModifierNode.getSemanticsConfiguration().copy();
        semanticsConfigurationCopy.collapsePeer$ui_release(collapsedSemanticsConfiguration(semanticsModifierNode2));
        return semanticsConfigurationCopy;
    }

    public static final boolean getUseMinimumTouchTarget(SemanticsModifierNode semanticsModifierNode) {
        Intrinsics.checkNotNullParameter(semanticsModifierNode, "<this>");
        return SemanticsConfigurationKt.getOrNull(semanticsModifierNode.getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static /* synthetic */ void getUseMinimumTouchTarget$annotations(SemanticsModifierNode semanticsModifierNode) {
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        Intrinsics.checkNotNullParameter(semanticsModifierNode, "<this>");
        DelegatableNodeKt.requireOwner(semanticsModifierNode).onSemanticsChange();
    }

    public static final Rect touchBoundsInRoot(SemanticsModifierNode semanticsModifierNode) {
        Intrinsics.checkNotNullParameter(semanticsModifierNode, "<this>");
        return !semanticsModifierNode.getNode().getIsAttached() ? Rect.INSTANCE.getZero() : !getUseMinimumTouchTarget(semanticsModifierNode) ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m10677requireCoordinator64DMado(semanticsModifierNode, NodeKind.m10773constructorimpl(8))) : DelegatableNodeKt.m10677requireCoordinator64DMado(semanticsModifierNode, NodeKind.m10773constructorimpl(8)).touchBoundsInRoot();
    }
}
