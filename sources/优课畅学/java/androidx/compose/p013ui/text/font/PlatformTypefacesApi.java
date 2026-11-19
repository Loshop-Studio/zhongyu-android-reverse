package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC9133u;

@VisibleForTesting
/* loaded from: classes2.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final Typeface m26505createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i10) {
        if (FontStyle.m26475equalsimpl0(i10, FontStyle.Companion.m26482getNormal_LCdwA()) && AbstractC9133u.m16128b(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM26427getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m26427getAndroidTypefaceStyleFO1MlWM(fontWeight, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM26427getAndroidTypefaceStyleFO1MlWM) : Typeface.create(str, iM26427getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Typeface m26506createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.Companion.m26482getNormal_LCdwA();
        }
        return platformTypefacesApi.m26505createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i10);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m26507loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM26505createAndroidTypefaceUsingTypefaceStyleRetOiIg = m26505createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i10);
        if (AbstractC9133u.m16128b(typefaceM26505createAndroidTypefaceUsingTypefaceStyleRetOiIg, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m26427getAndroidTypefaceStyleFO1MlWM(fontWeight, i10))) || AbstractC9133u.m16128b(typefaceM26505createAndroidTypefaceUsingTypefaceStyleRetOiIg, m26505createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i10))) {
            return null;
        }
        return typefaceM26505createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo26502createDefaultFO1MlWM(FontWeight fontWeight, int i10) {
        return m26505createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i10);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo26503createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i10) {
        Typeface typefaceM26507loadNamedFromTypefaceCacheOrNullRetOiIg = m26507loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i10);
        return typefaceM26507loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m26505createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i10) : typefaceM26507loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo26504optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(AbstractC9133u.m16128b(str, companion.getSansSerif().getName()) ? mo26503createNamedRetOiIg(companion.getSansSerif(), fontWeight, i10) : AbstractC9133u.m16128b(str, companion.getSerif().getName()) ? mo26503createNamedRetOiIg(companion.getSerif(), fontWeight, i10) : AbstractC9133u.m16128b(str, companion.getMonospace().getName()) ? mo26503createNamedRetOiIg(companion.getMonospace(), fontWeight, i10) : AbstractC9133u.m16128b(str, companion.getCursive().getName()) ? mo26503createNamedRetOiIg(companion.getCursive(), fontWeight, i10) : m26507loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i10), settings, context);
    }
}
