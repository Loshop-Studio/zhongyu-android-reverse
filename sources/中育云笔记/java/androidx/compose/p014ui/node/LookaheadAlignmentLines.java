package androidx.compose.p014ui.node;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.p014ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo32338calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j10) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        long jMo32431getPositionnOccac = lookaheadDelegate.mo32431getPositionnOccac();
        float fM33629getXimpl = IntOffset.m33629getXimpl(jMo32431getPositionnOccac);
        float fM33630getYimpl = IntOffset.m33630getYimpl(jMo32431getPositionnOccac);
        return Offset.m30642plusMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl) << 32) | (Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L)), j10);
    }

    @Override // androidx.compose.p014ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // androidx.compose.p014ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }
}
