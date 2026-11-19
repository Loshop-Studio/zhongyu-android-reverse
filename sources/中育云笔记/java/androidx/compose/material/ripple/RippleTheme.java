package androidx.compose.material.ripple;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @InterfaceC10770a
        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m28328defaultRippleAlphaDxMtmZc(long j10, boolean z10) {
            return z10 ? ((double) ColorKt.m30930luminance8_81llA(j10)) > 0.5d ? RippleThemeKt.LightThemeHighContrastRippleAlpha : RippleThemeKt.LightThemeLowContrastRippleAlpha : RippleThemeKt.DarkThemeRippleAlpha;
        }

        @InterfaceC10770a
        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m28329defaultRippleColor5vOe2sY(long j10, boolean z10) {
            return (z10 || ((double) ColorKt.m30930luminance8_81llA(j10)) >= 0.5d) ? j10 : Color.Companion.m30915getWhite0d7_KjU();
        }
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: defaultColor-WaAFU9c */
    long mo28317defaultColorWaAFU9c(Composer composer, int i10);

    @Composable
    @InterfaceC10770a
    RippleAlpha rippleAlpha(Composer composer, int i10);
}
