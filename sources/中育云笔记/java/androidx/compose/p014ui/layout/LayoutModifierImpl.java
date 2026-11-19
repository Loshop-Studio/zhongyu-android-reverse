package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9545q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private InterfaceC9545q measureBlock;

    public LayoutModifierImpl(InterfaceC9545q interfaceC9545q) {
        this.measureBlock = interfaceC9545q;
    }

    public final InterfaceC9545q getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return (MeasureResult) this.measureBlock.invoke(measureScope, measurable, Constraints.m33441boximpl(j10));
    }

    public final void setMeasureBlock(InterfaceC9545q interfaceC9545q) {
        this.measureBlock = interfaceC9545q;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
