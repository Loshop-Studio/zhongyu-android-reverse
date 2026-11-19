package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @Composable
    @InterfaceC10770a
    public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468328074, i10, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        DecayAnimationSpec<Float> decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return decayAnimationSpecRememberSplineBasedDecay;
    }
}
