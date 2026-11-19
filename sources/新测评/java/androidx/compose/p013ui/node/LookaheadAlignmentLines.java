package androidx.compose.p013ui.node;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\b*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0014R$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006*\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m13558d2 = {"Landroidx/compose/ui/node/LookaheadAlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "alignmentLinesMap", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "Landroidx/compose/ui/node/NodeCoordinator;", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "calculatePositionInParent", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "getPositionFor", "alignmentLine", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,227:1\n159#2:228\n30#3:229\n53#4,3:230\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n225#1:228\n225#1:229\n225#1:230,3\n*E\n"})
/* loaded from: classes2.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.p013ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo22431calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j10) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        long position = lookaheadDelegate.getPosition();
        float fM23689getXimpl = IntOffset.m23689getXimpl(position);
        float fM23690getYimpl = IntOffset.m23690getYimpl(position);
        return Offset.m20740plusMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(fM23689getXimpl) << 32) | (Float.floatToRawIntBits(fM23690getYimpl) & 4294967295L)), j10);
    }

    @Override // androidx.compose.p013ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // androidx.compose.p013ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }
}
