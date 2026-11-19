package androidx.compose.p014ui.spatial;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;

/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m32773rectInfoForQMZNJw(DelegatableNode delegatableNode, long j10, long j11, long j12, long j13, float[] fArr) {
        NodeCoordinator nodeCoordinatorM32356requireCoordinator64DMado = DelegatableNodeKt.m32356requireCoordinator64DMado(delegatableNode, NodeKind.m32510constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release() == nodeCoordinatorM32356requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j10, j11, j12, j13, fArr, delegatableNode, null);
        }
        long jM33623constructorimpl = IntOffset.m33623constructorimpl(j10);
        float fM33629getXimpl = IntOffset.m33629getXimpl(jM33623constructorimpl);
        float fM33630getYimpl = IntOffset.m33630getYimpl(jM33623constructorimpl);
        long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl) << 32) | (Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L));
        long jMo32237getSizeYbymL2g = nodeCoordinatorM32356requireCoordinator64DMado.getCoordinates().mo32237getSizeYbymL2g();
        return new RelativeLayoutBounds(IntOffsetKt.m33646roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo32238localPositionOfR5De75A(nodeCoordinatorM32356requireCoordinator64DMado, jM30629constructorimpl)), IntOffset.m33623constructorimpl(((IntOffset.m33629getXimpl(r0) + ((int) (jMo32237getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m33630getYimpl(r0) + ((int) (jMo32237getSizeYbymL2g & 4294967295L))) & 4294967295L)), j12, j13, fArr, delegatableNode, null);
    }
}
