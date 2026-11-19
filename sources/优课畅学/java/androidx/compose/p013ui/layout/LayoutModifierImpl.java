package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private InterfaceC10575q measureBlock;

    public LayoutModifierImpl(InterfaceC10575q interfaceC10575q) {
        this.measureBlock = interfaceC10575q;
    }

    public final InterfaceC10575q getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return (MeasureResult) this.measureBlock.invoke(measureScope, measurable, Constraints.m26839boximpl(j10));
    }

    public final void setMeasureBlock(InterfaceC10575q interfaceC10575q) {
        this.measureBlock = interfaceC10575q;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
