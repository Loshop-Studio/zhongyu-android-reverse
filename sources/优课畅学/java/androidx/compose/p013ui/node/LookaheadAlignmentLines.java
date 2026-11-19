package androidx.compose.p013ui.node;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.p013ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo25736calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j10) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        long jMo25829getPositionnOccac = lookaheadDelegate.mo25829getPositionnOccac();
        float fM27027getXimpl = IntOffset.m27027getXimpl(jMo25829getPositionnOccac);
        float fM27028getYimpl = IntOffset.m27028getYimpl(jMo25829getPositionnOccac);
        return Offset.m24040plusMKHz9U(Offset.m24027constructorimpl((Float.floatToRawIntBits(fM27027getXimpl) << 32) | (Float.floatToRawIntBits(fM27028getYimpl) & 4294967295L)), j10);
    }

    @Override // androidx.compose.p013ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // androidx.compose.p013ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }
}
