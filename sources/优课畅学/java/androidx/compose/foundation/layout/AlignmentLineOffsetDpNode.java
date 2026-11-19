package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.node.LayoutModifierNode;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    private float after;
    private AlignmentLine alignmentLine;
    private float before;

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f10, float f11, AbstractC9126n abstractC9126n) {
        this(alignmentLine, f10, f11);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m20717getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m20718getBeforeD9Ej5fM() {
        return this.before;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return AlignmentLineKt.m20706alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, this.before, this.after, measurable, j10);
    }

    /* renamed from: setAfter-0680j_4, reason: not valid java name */
    public final void m20719setAfter0680j_4(float f10) {
        this.after = f10;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore-0680j_4, reason: not valid java name */
    public final void m20720setBefore0680j_4(float f10) {
        this.before = f10;
    }

    private AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f10, float f11) {
        this.alignmentLine = alignmentLine;
        this.before = f10;
        this.after = f11;
    }
}
