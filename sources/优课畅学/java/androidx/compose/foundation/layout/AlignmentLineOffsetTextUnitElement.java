package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    private final long after;
    private final AlignmentLine alignmentLine;
    private final long before;
    private final InterfaceC10570l inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j10, long j11, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(alignmentLine, j10, j11, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        return alignmentLineOffsetTextUnitElement != null && AbstractC9133u.m16128b(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.m27090equalsimpl0(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.m27090equalsimpl0(this.after, alignmentLineOffsetTextUnitElement.after);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m20721getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m20722getBeforeXSAIIZE() {
        return this.before;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m27094hashCodeimpl(this.before)) * 31) + TextUnit.m27094hashCodeimpl(this.after);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j10, long j11, InterfaceC10570l interfaceC10570l) {
        this.alignmentLine = alignmentLine;
        this.before = j10;
        this.after = j11;
        this.inspectorInfo = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public AlignmentLineOffsetTextUnitNode create() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode) {
        alignmentLineOffsetTextUnitNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetTextUnitNode.m20726setBeforeR2X_6o(this.before);
        alignmentLineOffsetTextUnitNode.m20725setAfterR2X_6o(this.after);
    }
}
