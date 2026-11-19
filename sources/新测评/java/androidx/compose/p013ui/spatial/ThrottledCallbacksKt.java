package androidx.compose.p013ui.spatial;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m13558d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Q-MZNJw", "(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,494:1\n83#2:495\n159#3:496\n32#3:505\n30#4:497\n53#5,3:498\n85#5:502\n90#5:504\n80#5:506\n54#6:501\n59#6:503\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n*L\n460#1:495\n470#1:496\n478#1:505\n470#1:497\n470#1:498,3\n478#1:502\n478#1:504\n478#1:506\n478#1:501\n478#1:503\n*E\n"})
/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m22834rectInfoForQMZNJw(DelegatableNode delegatableNode, long j10, long j11, long j12, long j13, float[] fArr) {
        NodeCoordinator nodeCoordinatorM22446requireCoordinator64DMado = DelegatableNodeKt.m22446requireCoordinator64DMado(delegatableNode, NodeKind.m22586constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release() == nodeCoordinatorM22446requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j10, j11, j12, j13, fArr, delegatableNode, null);
        }
        long jM23683constructorimpl = IntOffset.m23683constructorimpl(j10);
        float fM23689getXimpl = IntOffset.m23689getXimpl(jM23683constructorimpl);
        float fM23690getYimpl = IntOffset.m23690getYimpl(jM23683constructorimpl);
        long jM20727constructorimpl = Offset.m20727constructorimpl((Float.floatToRawIntBits(fM23689getXimpl) << 32) | (Float.floatToRawIntBits(fM23690getYimpl) & 4294967295L));
        long jMo22332getSizeYbymL2g = nodeCoordinatorM22446requireCoordinator64DMado.getCoordinates().mo22332getSizeYbymL2g();
        return new RelativeLayoutBounds(IntOffsetKt.m23706roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo22333localPositionOfR5De75A(nodeCoordinatorM22446requireCoordinator64DMado, jM20727constructorimpl)), IntOffset.m23683constructorimpl(((IntOffset.m23689getXimpl(r0) + ((int) (jMo22332getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m23690getYimpl(r0) + ((int) (jMo22332getSizeYbymL2g & 4294967295L))) & 4294967295L)), j12, j13, fArr, delegatableNode, null);
    }
}
