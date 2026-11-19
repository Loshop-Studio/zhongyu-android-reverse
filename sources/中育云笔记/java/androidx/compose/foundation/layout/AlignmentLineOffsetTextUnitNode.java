package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;
    private AlignmentLine alignmentLine;
    private long before;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j10, long j11, AbstractC9972n abstractC9972n) {
        this(alignmentLine, j10, j11);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m27325getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m27326getBeforeXSAIIZE() {
        return this.before;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return AlignmentLineKt.m27308alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, TextUnit.m33693getRawTypeimpl(this.before) == 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : measureScope.mo27094toDpGaN1DYA(this.before), TextUnit.m33693getRawTypeimpl(this.after) == 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : measureScope.mo27094toDpGaN1DYA(this.after), measurable, j10);
    }

    /* renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m27327setAfterR2X_6o(long j10) {
        this.after = j10;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m27328setBeforeR2X_6o(long j10) {
        this.before = j10;
    }

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j10, long j11) {
        this.alignmentLine = alignmentLine;
        this.before = j10;
        this.after = j11;
    }
}
