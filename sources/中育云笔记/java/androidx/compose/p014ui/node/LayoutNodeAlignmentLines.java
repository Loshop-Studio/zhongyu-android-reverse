package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LayoutNodeAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.p014ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo32338calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j10) {
        return NodeCoordinator.m32483toParentPosition8S9VItk$default(nodeCoordinator, j10, false, 2, null);
    }

    @Override // androidx.compose.p014ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // androidx.compose.p014ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.get(alignmentLine);
    }
}
