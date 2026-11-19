package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC9979u;

@VisibleForTesting
/* loaded from: classes2.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final Typeface m33107createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i10) {
        if (FontStyle.m33077equalsimpl0(i10, FontStyle.Companion.m33084getNormal_LCdwA()) && AbstractC9979u.m20289b(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM33029getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m33029getAndroidTypefaceStyleFO1MlWM(fontWeight, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM33029getAndroidTypefaceStyleFO1MlWM) : Typeface.create(str, iM33029getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Typeface m33108createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.Companion.m33084getNormal_LCdwA();
        }
        return platformTypefacesApi.m33107createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i10);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m33109loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM33107createAndroidTypefaceUsingTypefaceStyleRetOiIg = m33107createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i10);
        if (AbstractC9979u.m20289b(typefaceM33107createAndroidTypefaceUsingTypefaceStyleRetOiIg, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m33029getAndroidTypefaceStyleFO1MlWM(fontWeight, i10))) || AbstractC9979u.m20289b(typefaceM33107createAndroidTypefaceUsingTypefaceStyleRetOiIg, m33107createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i10))) {
            return null;
        }
        return typefaceM33107createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.p014ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo33104createDefaultFO1MlWM(FontWeight fontWeight, int i10) {
        return m33107createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i10);
    }

    @Override // androidx.compose.p014ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo33105createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i10) {
        Typeface typefaceM33109loadNamedFromTypefaceCacheOrNullRetOiIg = m33109loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i10);
        return typefaceM33109loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m33107createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i10) : typefaceM33109loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.p014ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo33106optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(AbstractC9979u.m20289b(str, companion.getSansSerif().getName()) ? mo33105createNamedRetOiIg(companion.getSansSerif(), fontWeight, i10) : AbstractC9979u.m20289b(str, companion.getSerif().getName()) ? mo33105createNamedRetOiIg(companion.getSerif(), fontWeight, i10) : AbstractC9979u.m20289b(str, companion.getMonospace().getName()) ? mo33105createNamedRetOiIg(companion.getMonospace(), fontWeight, i10) : AbstractC9979u.m20289b(str, companion.getCursive().getName()) ? mo33105createNamedRetOiIg(companion.getCursive(), fontWeight, i10) : m33109loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i10), settings, context);
    }
}
