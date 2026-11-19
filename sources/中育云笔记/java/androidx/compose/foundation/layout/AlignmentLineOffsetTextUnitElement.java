package androidx.compose.foundation.layout;

import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    private final long after;
    private final AlignmentLine alignmentLine;
    private final long before;
    private final InterfaceC9540l inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j10, long j11, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(alignmentLine, j10, j11, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        return alignmentLineOffsetTextUnitElement != null && AbstractC9979u.m20289b(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.m33692equalsimpl0(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.m33692equalsimpl0(this.after, alignmentLineOffsetTextUnitElement.after);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m27323getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m27324getBeforeXSAIIZE() {
        return this.before;
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m33696hashCodeimpl(this.before)) * 31) + TextUnit.m33696hashCodeimpl(this.after);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j10, long j11, InterfaceC9540l interfaceC9540l) {
        this.alignmentLine = alignmentLine;
        this.before = j10;
        this.after = j11;
        this.inspectorInfo = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public AlignmentLineOffsetTextUnitNode create() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode) {
        alignmentLineOffsetTextUnitNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetTextUnitNode.m27328setBeforeR2X_6o(this.before);
        alignmentLineOffsetTextUnitNode.m27327setAfterR2X_6o(this.after);
    }
}
