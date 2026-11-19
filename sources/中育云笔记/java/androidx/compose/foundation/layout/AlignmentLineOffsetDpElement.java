package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;
    private final AlignmentLine alignmentLine;
    private final float before;
    private final InterfaceC9540l inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f10, float f11, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(alignmentLine, f10, f11, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && AbstractC9979u.m20289b(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && C3186Dp.m33506equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && C3186Dp.m33506equalsimpl0(this.after, alignmentLineOffsetDpElement.after);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m27317getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m27318getBeforeD9Ej5fM() {
        return this.before;
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + C3186Dp.m33507hashCodeimpl(this.before)) * 31) + C3186Dp.m33507hashCodeimpl(this.after);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f10, float f11, InterfaceC9540l interfaceC9540l) {
        this.alignmentLine = alignmentLine;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = interfaceC9540l;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetDpNode.m27322setBefore0680j_4(this.before);
        alignmentLineOffsetDpNode.m27321setAfter0680j_4(this.after);
    }
}
