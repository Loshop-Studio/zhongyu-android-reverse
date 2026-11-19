package androidx.compose.foundation.lazy;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;
    private State<Integer> heightState;
    private State<Integer> widthState;

    public /* synthetic */ ParentSizeNode(float f10, State state, State state2, int i10, AbstractC9126n abstractC9126n) {
        this(f10, (i10 & 2) != 0 ? null : state, (i10 & 4) != 0 ? null : state2);
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        State<Integer> state = this.widthState;
        int iRound = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(state.getValue().floatValue() * this.fraction);
        State<Integer> state2 = this.heightState;
        int iRound2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(state2.getValue().floatValue() * this.fraction);
        int iM26854getMinWidthimpl = iRound != Integer.MAX_VALUE ? iRound : Constraints.m26854getMinWidthimpl(j10);
        int iM26853getMinHeightimpl = iRound2 != Integer.MAX_VALUE ? iRound2 : Constraints.m26853getMinHeightimpl(j10);
        if (iRound == Integer.MAX_VALUE) {
            iRound = Constraints.m26852getMaxWidthimpl(j10);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = Constraints.m26851getMaxHeightimpl(j10);
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(ConstraintsKt.Constraints(iM26854getMinWidthimpl, iRound, iM26853getMinHeightimpl, iRound2));
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setFraction(float f10) {
        this.fraction = f10;
    }

    public final void setHeightState(State<Integer> state) {
        this.heightState = state;
    }

    public final void setWidthState(State<Integer> state) {
        this.widthState = state;
    }

    public ParentSizeNode(float f10, State<Integer> state, State<Integer> state2) {
        this.fraction = f10;
        this.widthState = state;
        this.heightState = state2;
    }
}
