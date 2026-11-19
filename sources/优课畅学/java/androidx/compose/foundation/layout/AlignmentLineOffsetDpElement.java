package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;
    private final AlignmentLine alignmentLine;
    private final float before;
    private final InterfaceC10570l inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f10, float f11, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(alignmentLine, f10, f11, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && AbstractC9133u.m16128b(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && C3156Dp.m26904equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && C3156Dp.m26904equalsimpl0(this.after, alignmentLineOffsetDpElement.after);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m20715getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m20716getBeforeD9Ej5fM() {
        return this.before;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + C3156Dp.m26905hashCodeimpl(this.before)) * 31) + C3156Dp.m26905hashCodeimpl(this.after);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f10, float f11, InterfaceC10570l interfaceC10570l) {
        this.alignmentLine = alignmentLine;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = interfaceC10570l;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetDpNode.m20720setBefore0680j_4(this.before);
        alignmentLineOffsetDpNode.m20719setAfter0680j_4(this.after);
    }
}
