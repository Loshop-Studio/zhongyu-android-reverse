package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class RippleThemeKt {
    private static final String RippleThemeDeprecationMessage = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com";
    private static final ProvidableCompositionLocal<RippleTheme> LocalRippleTheme = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        @Override // p181hd.InterfaceC9529a
        public final RippleTheme invoke() {
            return DebugRippleTheme.INSTANCE;
        }
    });
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
    private static final RippleAlpha DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return LocalRippleTheme;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getLocalRippleTheme$annotations() {
    }
}
