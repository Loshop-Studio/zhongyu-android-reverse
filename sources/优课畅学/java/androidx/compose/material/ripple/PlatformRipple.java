package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;

@Stable
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class PlatformRipple extends Ripple {
    public static final int $stable = 0;

    public /* synthetic */ PlatformRipple(boolean z10, float f10, State state, AbstractC9126n abstractC9126n) {
        this(z10, f10, state);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo21713rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z10, float f10, State<Color> state, State<RippleAlpha> state2, Composer composer, int i10) {
        composer.startReplaceGroup(331259447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:84)");
        }
        ViewGroup viewGroupFindNearestViewGroup = Ripple_androidKt.findNearestViewGroup((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4) | ((((458752 & i10) ^ ProfileVerifier.CompilationStatus.f1860xf2722a21) > 131072 && composer.changed(this)) || (i10 & ProfileVerifier.CompilationStatus.f1860xf2722a21) == 131072) | composer.changed(viewGroupFindNearestViewGroup);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            Object androidRippleIndicationInstance = new AndroidRippleIndicationInstance(z10, f10, state, state2, viewGroupFindNearestViewGroup, null);
            composer.updateRememberedValue(androidRippleIndicationInstance);
            objRememberedValue = androidRippleIndicationInstance;
        }
        AndroidRippleIndicationInstance androidRippleIndicationInstance2 = (AndroidRippleIndicationInstance) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return androidRippleIndicationInstance2;
    }

    private PlatformRipple(boolean z10, float f10, State<Color> state) {
        super(z10, f10, state, null);
    }
}
