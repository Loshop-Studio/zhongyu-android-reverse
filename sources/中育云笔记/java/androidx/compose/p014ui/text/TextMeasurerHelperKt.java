package androidx.compose.p014ui.text;

import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes2.dex */
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 8;

    @Composable
    public static final TextMeasurer rememberTextMeasurer(int i10, Composer composer, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = DefaultCacheSize;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean zChanged = composer.changed(resolver) | composer.changed(density) | composer.changed(layoutDirection);
        if ((((i11 & 14) ^ 6) <= 4 || !composer.changed(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = zChanged | z10;
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new TextMeasurer(resolver, density, layoutDirection, i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        TextMeasurer textMeasurer = (TextMeasurer) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textMeasurer;
    }
}
