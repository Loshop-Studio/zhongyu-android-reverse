package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

@Stable
@InterfaceC10770a
/* loaded from: classes2.dex */
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z10, float f10, State state, AbstractC9972n abstractC9972n) {
        this(z10, f10, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.bounded == ripple.bounded && C3186Dp.m33506equalsimpl0(this.radius, ripple.radius) && AbstractC9979u.m20289b(this.color, ripple.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + C3186Dp.m33507hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @InterfaceC10770a
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i10) {
        long jMo28317defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        if (this.color.getValue().m30888unboximpl() != 16) {
            composer.startReplaceGroup(-303557454);
            composer.endReplaceGroup();
            jMo28317defaultColorWaAFU9c = this.color.getValue().m30888unboximpl();
        } else {
            composer.startReplaceGroup(-303499670);
            jMo28317defaultColorWaAFU9c = rippleTheme.mo28317defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(jMo28317defaultColorWaAFU9c), composer, 0);
        State<RippleAlpha> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i11 = i10 & 14;
        RippleIndicationInstance rippleIndicationInstanceMo28315rememberUpdatedRippleInstance942rkJo = mo28315rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, stateRememberUpdatedState, stateRememberUpdatedState2, composer, i11 | ((i10 << 12) & 458752));
        boolean zChangedInstance = composer.changedInstance(rippleIndicationInstanceMo28315rememberUpdatedRippleInstance942rkJo) | (((i11 ^ 6) > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Ripple$rememberUpdatedInstance$1$1(interactionSource, rippleIndicationInstanceMo28315rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo28315rememberUpdatedRippleInstance942rkJo, interactionSource, (InterfaceC9544p) objRememberedValue, composer, (i10 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleIndicationInstanceMo28315rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo28315rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z10, float f10, State<Color> state, State<RippleAlpha> state2, Composer composer, int i10);

    private Ripple(boolean z10, float f10, State<Color> state) {
        this.bounded = z10;
        this.radius = f10;
        this.color = state;
    }
}
