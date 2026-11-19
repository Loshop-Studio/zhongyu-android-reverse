package androidx.compose.material.ripple;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes2.dex */
final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @InterfaceC10770a
    /* renamed from: defaultColor-WaAFU9c, reason: not valid java name */
    public long mo28317defaultColorWaAFU9c(Composer composer, int i10) {
        composer.startReplaceGroup(2042140174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, i10, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:237)");
        }
        long jM28329defaultRippleColor5vOe2sY = RippleTheme.Companion.m28329defaultRippleColor5vOe2sY(Color.Companion.m30904getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM28329defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @InterfaceC10770a
    public RippleAlpha rippleAlpha(Composer composer, int i10) {
        composer.startReplaceGroup(-1629816343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1629816343, i10, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:242)");
        }
        RippleAlpha rippleAlphaM28328defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m28328defaultRippleAlphaDxMtmZc(Color.Companion.m30904getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleAlphaM28328defaultRippleAlphaDxMtmZc;
    }
}
