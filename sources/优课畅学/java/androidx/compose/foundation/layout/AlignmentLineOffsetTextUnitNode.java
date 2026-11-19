package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;
    private AlignmentLine alignmentLine;
    private long before;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j10, long j11, AbstractC9126n abstractC9126n) {
        this(alignmentLine, j10, j11);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m20723getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m20724getBeforeXSAIIZE() {
        return this.before;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return AlignmentLineKt.m20706alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, TextUnit.m27091getRawTypeimpl(this.before) == 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : measureScope.mo20492toDpGaN1DYA(this.before), TextUnit.m27091getRawTypeimpl(this.after) == 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : measureScope.mo20492toDpGaN1DYA(this.after), measurable, j10);
    }

    /* renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m20725setAfterR2X_6o(long j10) {
        this.after = j10;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m20726setBeforeR2X_6o(long j10) {
        this.before = j10;
    }

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j10, long j11) {
        this.alignmentLine = alignmentLine;
        this.before = j10;
        this.after = j11;
    }
}
