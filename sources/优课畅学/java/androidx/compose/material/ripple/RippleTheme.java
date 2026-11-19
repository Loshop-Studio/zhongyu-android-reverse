package androidx.compose.material.ripple;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @InterfaceC8721a
        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m21726defaultRippleAlphaDxMtmZc(long j10, boolean z10) {
            return z10 ? ((double) ColorKt.m24328luminance8_81llA(j10)) > 0.5d ? RippleThemeKt.LightThemeHighContrastRippleAlpha : RippleThemeKt.LightThemeLowContrastRippleAlpha : RippleThemeKt.DarkThemeRippleAlpha;
        }

        @InterfaceC8721a
        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m21727defaultRippleColor5vOe2sY(long j10, boolean z10) {
            return (z10 || ((double) ColorKt.m24328luminance8_81llA(j10)) >= 0.5d) ? j10 : Color.Companion.m24313getWhite0d7_KjU();
        }
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: defaultColor-WaAFU9c */
    long mo21715defaultColorWaAFU9c(Composer composer, int i10);

    @Composable
    @InterfaceC8721a
    RippleAlpha rippleAlpha(Composer composer, int i10);
}
