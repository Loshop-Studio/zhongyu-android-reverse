package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC9544p alignmentCallback;
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(Direction direction, boolean z10, InterfaceC9544p interfaceC9544p) {
        this.direction = direction;
        this.unbounded = z10;
        this.alignmentCallback = interfaceC9544p;
    }

    public final InterfaceC9544p getAlignmentCallback() {
        return this.alignmentCallback;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iM33456getMinWidthimpl = direction != direction2 ? 0 : Constraints.m33456getMinWidthimpl(j10);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.Constraints(iM33456getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m33454getMaxWidthimpl(j10) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m33455getMinHeightimpl(j10) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m33453getMaxHeightimpl(j10) : Integer.MAX_VALUE));
        final int iM21761n = AbstractC10410o.m21761n(placeableMo32229measureBRTryo0.getWidth(), Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10));
        final int iM21761n2 = AbstractC10410o.m21761n(placeableMo32229measureBRTryo0.getHeight(), Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, iM21761n, iM21761n2, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m32293place70tqf50$default(placementScope, placeableMo32229measureBRTryo0, ((IntOffset) this.this$0.getAlignmentCallback().invoke(IntSize.m33664boximpl(IntSize.m33667constructorimpl(((iM21761n2 - placeableMo32229measureBRTryo0.getHeight()) & 4294967295L) | ((iM21761n - placeableMo32229measureBRTryo0.getWidth()) << 32))), measureScope.getLayoutDirection())).m33638unboximpl(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public final void setAlignmentCallback(InterfaceC9544p interfaceC9544p) {
        this.alignmentCallback = interfaceC9544p;
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z10) {
        this.unbounded = z10;
    }
}
