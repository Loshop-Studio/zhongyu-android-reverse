package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import p123h7.InterfaceC8721a;

@Immutable
/* loaded from: classes2.dex */
public final class CompatRippleTheme implements RippleTheme {
    public static final int $stable = 0;
    public static final CompatRippleTheme INSTANCE = new CompatRippleTheme();

    private CompatRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @InterfaceC8721a
    /* renamed from: defaultColor-WaAFU9c */
    public long mo21715defaultColorWaAFU9c(Composer composer, int i10) {
        composer.startReplaceGroup(-1844533201);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1844533201, i10, -1, "androidx.compose.material3.CompatRippleTheme.defaultColor (Ripple.kt:244)");
        }
        long jM24286unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m24286unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM24286unboximpl;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @InterfaceC8721a
    public RippleAlpha rippleAlpha(Composer composer, int i10) {
        composer.startReplaceGroup(-290975286);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-290975286, i10, -1, "androidx.compose.material3.CompatRippleTheme.rippleAlpha (Ripple.kt:248)");
        }
        RippleAlpha rippleAlpha = RippleDefaults.INSTANCE.getRippleAlpha();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleAlpha;
    }
}
