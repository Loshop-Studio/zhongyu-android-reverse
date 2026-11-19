package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;
    private final boolean bounded;
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z10, final State<RippleAlpha> state) {
        this.bounded = z10;
        this.stateLayer = new StateLayer(z10, new InterfaceC9529a() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$stateLayer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final RippleAlpha invoke() {
                return state.getValue();
            }
        });
    }

    public abstract void addRipple(PressInteraction.Press press, InterfaceC11122i0 interfaceC11122i0);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m28323drawStateLayerH2RKhps(DrawScope drawScope, float f10, long j10) throws Throwable {
        this.stateLayer.m28331drawStateLayermxwnekA(drawScope, Float.isNaN(f10) ? RippleAnimationKt.m28319getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo31429getSizeNHjbRc()) : drawScope.mo27099toPx0680j_4(f10), j10);
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void updateStateLayer$material_ripple_release(Interaction interaction, InterfaceC11122i0 interfaceC11122i0) {
        this.stateLayer.handleInteraction$material_ripple_release(interaction, interfaceC11122i0);
    }
}
