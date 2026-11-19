package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10574p;

@Stable
@InterfaceC8721a
/* loaded from: classes2.dex */
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z10, float f10, State state, AbstractC9126n abstractC9126n) {
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
        return this.bounded == ripple.bounded && C3156Dp.m26904equalsimpl0(this.radius, ripple.radius) && AbstractC9133u.m16128b(this.color, ripple.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + C3156Dp.m26905hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @InterfaceC8721a
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i10) {
        long jMo21715defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        if (this.color.getValue().m24286unboximpl() != 16) {
            composer.startReplaceGroup(-303557454);
            composer.endReplaceGroup();
            jMo21715defaultColorWaAFU9c = this.color.getValue().m24286unboximpl();
        } else {
            composer.startReplaceGroup(-303499670);
            jMo21715defaultColorWaAFU9c = rippleTheme.mo21715defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m24266boximpl(jMo21715defaultColorWaAFU9c), composer, 0);
        State<RippleAlpha> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i11 = i10 & 14;
        RippleIndicationInstance rippleIndicationInstanceMo21713rememberUpdatedRippleInstance942rkJo = mo21713rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, stateRememberUpdatedState, stateRememberUpdatedState2, composer, i11 | ((i10 << 12) & 458752));
        boolean zChangedInstance = composer.changedInstance(rippleIndicationInstanceMo21713rememberUpdatedRippleInstance942rkJo) | (((i11 ^ 6) > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Ripple$rememberUpdatedInstance$1$1(interactionSource, rippleIndicationInstanceMo21713rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo21713rememberUpdatedRippleInstance942rkJo, interactionSource, (InterfaceC10574p) objRememberedValue, composer, (i10 << 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleIndicationInstanceMo21713rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo21713rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z10, float f10, State<Color> state, State<RippleAlpha> state2, Composer composer, int i10);

    private Ripple(boolean z10, float f10, State<Color> state) {
        this.bounded = z10;
        this.radius = f10;
        this.color = state;
    }
}
