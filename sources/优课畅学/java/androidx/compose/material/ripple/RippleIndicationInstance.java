package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.InterfaceC8721a;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
@InterfaceC8721a
/* loaded from: classes2.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;
    private final boolean bounded;
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z10, final State<RippleAlpha> state) {
        this.bounded = z10;
        this.stateLayer = new StateLayer(z10, new InterfaceC10559a() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$stateLayer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final RippleAlpha invoke() {
                return state.getValue();
            }
        });
    }

    public abstract void addRipple(PressInteraction.Press press, InterfaceC8822b0 interfaceC8822b0);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m21721drawStateLayerH2RKhps(DrawScope drawScope, float f10, long j10) throws Throwable {
        this.stateLayer.m21729drawStateLayermxwnekA(drawScope, Float.isNaN(f10) ? RippleAnimationKt.m21717getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo24827getSizeNHjbRc()) : drawScope.mo20497toPx0680j_4(f10), j10);
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void updateStateLayer$material_ripple_release(Interaction interaction, InterfaceC8822b0 interfaceC8822b0) {
        this.stateLayer.handleInteraction$material_ripple_release(interaction, interfaceC8822b0);
    }
}
