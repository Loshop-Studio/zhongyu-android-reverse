package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.node.LayoutModifierNode;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    private float after;
    private AlignmentLine alignmentLine;
    private float before;

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f10, float f11, AbstractC9972n abstractC9972n) {
        this(alignmentLine, f10, f11);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m27319getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m27320getBeforeD9Ej5fM() {
        return this.before;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return AlignmentLineKt.m27308alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, this.before, this.after, measurable, j10);
    }

    /* renamed from: setAfter-0680j_4, reason: not valid java name */
    public final void m27321setAfter0680j_4(float f10) {
        this.after = f10;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore-0680j_4, reason: not valid java name */
    public final void m27322setBefore0680j_4(float f10) {
        this.before = f10;
    }

    private AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f10, float f11) {
        this.alignmentLine = alignmentLine;
        this.before = f10;
        this.after = f11;
    }
}
