package androidx.compose.p013ui.spatial;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;

/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m26171rectInfoForQMZNJw(DelegatableNode delegatableNode, long j10, long j11, long j12, long j13, float[] fArr) {
        NodeCoordinator nodeCoordinatorM25754requireCoordinator64DMado = DelegatableNodeKt.m25754requireCoordinator64DMado(delegatableNode, NodeKind.m25908constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release() == nodeCoordinatorM25754requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j10, j11, j12, j13, fArr, delegatableNode, null);
        }
        long jM27021constructorimpl = IntOffset.m27021constructorimpl(j10);
        float fM27027getXimpl = IntOffset.m27027getXimpl(jM27021constructorimpl);
        float fM27028getYimpl = IntOffset.m27028getYimpl(jM27021constructorimpl);
        long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(fM27027getXimpl) << 32) | (Float.floatToRawIntBits(fM27028getYimpl) & 4294967295L));
        long jMo25635getSizeYbymL2g = nodeCoordinatorM25754requireCoordinator64DMado.getCoordinates().mo25635getSizeYbymL2g();
        return new RelativeLayoutBounds(IntOffsetKt.m27044roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo25636localPositionOfR5De75A(nodeCoordinatorM25754requireCoordinator64DMado, jM24027constructorimpl)), IntOffset.m27021constructorimpl(((IntOffset.m27027getXimpl(r0) + ((int) (jMo25635getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m27028getYimpl(r0) + ((int) (jMo25635getSizeYbymL2g & 4294967295L))) & 4294967295L)), j12, j13, fArr, delegatableNode, null);
    }
}
