package androidx.compose.p012ui.spatial;

import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.node.DelegatableNode;
import androidx.compose.p012ui.node.DelegatableNodeKt;
import androidx.compose.p012ui.node.LayoutNode;
import androidx.compose.p012ui.node.NodeCoordinator;
import androidx.compose.p012ui.node.NodeKind;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m13413d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Q-MZNJw", "(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,494:1\n83#2:495\n159#3:496\n32#3:505\n30#4:497\n53#5,3:498\n85#5:502\n90#5:504\n80#5:506\n54#6:501\n59#6:503\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n*L\n460#1:495\n470#1:496\n478#1:505\n470#1:497\n470#1:498,3\n478#1:502\n478#1:504\n478#1:506\n478#1:501\n478#1:503\n*E\n"})
/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m23267rectInfoForQMZNJw(DelegatableNode delegatableNode, long j9, long j10, long j11, long j12, float[] fArr) {
        NodeCoordinator nodeCoordinatorM22879requireCoordinator64DMado = DelegatableNodeKt.m22879requireCoordinator64DMado(delegatableNode, NodeKind.m23019constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release() == nodeCoordinatorM22879requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j9, j10, j11, j12, fArr, delegatableNode, null);
        }
        long jM24116constructorimpl = IntOffset.m24116constructorimpl(j9);
        float fM24122getXimpl = IntOffset.m24122getXimpl(jM24116constructorimpl);
        float fM24123getYimpl = IntOffset.m24123getYimpl(jM24116constructorimpl);
        long jM21160constructorimpl = Offset.m21160constructorimpl((Float.floatToRawIntBits(fM24122getXimpl) << 32) | (Float.floatToRawIntBits(fM24123getYimpl) & 4294967295L));
        long jMo22765getSizeYbymL2g = nodeCoordinatorM22879requireCoordinator64DMado.getCoordinates().mo22765getSizeYbymL2g();
        return new RelativeLayoutBounds(IntOffsetKt.m24139roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo22766localPositionOfR5De75A(nodeCoordinatorM22879requireCoordinator64DMado, jM21160constructorimpl)), IntOffset.m24116constructorimpl(((IntOffset.m24122getXimpl(r0) + ((int) (jMo22765getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m24123getYimpl(r0) + ((int) (jMo22765getSizeYbymL2g & 4294967295L))) & 4294967295L)), j11, j12, fArr, delegatableNode, null);
    }
}
