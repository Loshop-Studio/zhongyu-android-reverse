package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m5110d2 = {"Landroidx/compose/foundation/layout/WrapContentNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "unbounded", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLr6/e;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "Z", "getUnbounded", "()Z", "setUnbounded", "(Z)V", "Lr6/e;", "getAlignmentCallback", "()Lr6/e;", "setAlignmentCallback", "(Lr6/e;)V", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    private InterfaceC6473e alignmentCallback;

    @NotNull
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(@NotNull Direction direction, boolean z8, @NotNull InterfaceC6473e interfaceC6473e) {
        this.direction = direction;
        this.unbounded = z8;
        this.alignmentCallback = interfaceC6473e;
    }

    @NotNull
    public final InterfaceC6473e getAlignmentCallback() {
        return this.alignmentCallback;
    }

    @NotNull
    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iM13260getMinWidthimpl = direction != direction2 ? 0 : Constraints.m13260getMinWidthimpl(j7);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(ConstraintsKt.Constraints(iM13260getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m13258getMaxWidthimpl(j7) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m13259getMinHeightimpl(j7) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m13257getMaxHeightimpl(j7) : Integer.MAX_VALUE));
        final int iM5274m = AbstractC5806u.m5274m(placeableMo12033measureBRTryo0.getWidth(), Constraints.m13260getMinWidthimpl(j7), Constraints.m13258getMaxWidthimpl(j7));
        final int iM5274m2 = AbstractC5806u.m5274m(placeableMo12033measureBRTryo0.getHeight(), Constraints.m13259getMinHeightimpl(j7), Constraints.m13257getMaxHeightimpl(j7));
        return MeasureScope.layout$default(measureScope, iM5274m, iM5274m2, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m12097place70tqf50$default(placementScope, placeableMo12033measureBRTryo0, ((IntOffset) this.this$0.getAlignmentCallback().invoke(IntSize.m13468boximpl(IntSize.m13471constructorimpl(((iM5274m2 - placeableMo12033measureBRTryo0.getHeight()) & 4294967295L) | ((iM5274m - placeableMo12033measureBRTryo0.getWidth()) << 32))), measureScope.getLayoutDirection())).m13442unboximpl(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public final void setAlignmentCallback(@NotNull InterfaceC6473e interfaceC6473e) {
        this.alignmentCallback = interfaceC6473e;
    }

    public final void setDirection(@NotNull Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z8) {
        this.unbounded = z8;
    }
}
