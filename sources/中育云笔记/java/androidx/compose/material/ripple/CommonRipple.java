package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@Stable
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class CommonRipple extends Ripple {
    public static final int $stable = 0;

    public /* synthetic */ CommonRipple(boolean z10, float f10, State state, AbstractC9972n abstractC9972n) {
        this(z10, f10, state);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo28315rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z10, float f10, State<Color> state, State<RippleAlpha> state2, Composer composer, int i10) {
        composer.startReplaceGroup(-1768051227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1768051227, i10, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:56)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4) | ((((458752 & i10) ^ ProfileVerifier.CompilationStatus.f1974xf2722a21) > 131072 && composer.changed(this)) || (i10 & ProfileVerifier.CompilationStatus.f1974xf2722a21) == 131072);
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            CommonRippleIndicationInstance commonRippleIndicationInstance = new CommonRippleIndicationInstance(z10, f10, state, state2, null);
            composer.updateRememberedValue(commonRippleIndicationInstance);
            objRememberedValue = commonRippleIndicationInstance;
        }
        CommonRippleIndicationInstance commonRippleIndicationInstance2 = (CommonRippleIndicationInstance) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return commonRippleIndicationInstance2;
    }

    private CommonRipple(boolean z10, float f10, State<Color> state) {
        super(z10, f10, state, null);
    }
}
