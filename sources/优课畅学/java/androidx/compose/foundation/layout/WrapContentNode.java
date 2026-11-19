package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC10574p alignmentCallback;
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(Direction direction, boolean z10, InterfaceC10574p interfaceC10574p) {
        this.direction = direction;
        this.unbounded = z10;
        this.alignmentCallback = interfaceC10574p;
    }

    public final InterfaceC10574p getAlignmentCallback() {
        return this.alignmentCallback;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iM26854getMinWidthimpl = direction != direction2 ? 0 : Constraints.m26854getMinWidthimpl(j10);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(ConstraintsKt.Constraints(iM26854getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m26852getMaxWidthimpl(j10) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m26853getMinHeightimpl(j10) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m26851getMaxHeightimpl(j10) : Integer.MAX_VALUE));
        final int iM13518m = AbstractC8323h.m13518m(placeableMo25627measureBRTryo0.getWidth(), Constraints.m26854getMinWidthimpl(j10), Constraints.m26852getMaxWidthimpl(j10));
        final int iM13518m2 = AbstractC8323h.m13518m(placeableMo25627measureBRTryo0.getHeight(), Constraints.m26853getMinHeightimpl(j10), Constraints.m26851getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, iM13518m, iM13518m2, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m25691place70tqf50$default(placementScope, placeableMo25627measureBRTryo0, ((IntOffset) this.this$0.getAlignmentCallback().invoke(IntSize.m27062boximpl(IntSize.m27065constructorimpl(((iM13518m2 - placeableMo25627measureBRTryo0.getHeight()) & 4294967295L) | ((iM13518m - placeableMo25627measureBRTryo0.getWidth()) << 32))), measureScope.getLayoutDirection())).m27036unboximpl(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public final void setAlignmentCallback(InterfaceC10574p interfaceC10574p) {
        this.alignmentCallback = interfaceC10574p;
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z10) {
        this.unbounded = z10;
    }
}
