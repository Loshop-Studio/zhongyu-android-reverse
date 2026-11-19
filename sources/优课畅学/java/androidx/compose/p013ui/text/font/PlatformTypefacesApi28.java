package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(28)
@VisibleForTesting
/* loaded from: classes2.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final Typeface m26508createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i10) {
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m26475equalsimpl0(i10, companion.m26482getNormal_LCdwA()) && AbstractC9133u.m16128b(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m26475equalsimpl0(i10, companion.m26481getItalic_LCdwA()));
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Typeface m26509createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m26508createAndroidTypefaceApi28RetOiIg(str, fontWeight, i10);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m26510loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM26508createAndroidTypefaceApi28RetOiIg = m26508createAndroidTypefaceApi28RetOiIg(str, fontWeight, i10);
        if (AbstractC9133u.m16128b(typefaceM26508createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m26475equalsimpl0(i10, FontStyle.Companion.m26481getItalic_LCdwA()))) || AbstractC9133u.m16128b(typefaceM26508createAndroidTypefaceApi28RetOiIg, m26508createAndroidTypefaceApi28RetOiIg(null, fontWeight, i10))) {
            return null;
        }
        return typefaceM26508createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo26502createDefaultFO1MlWM(FontWeight fontWeight, int i10) {
        return m26508createAndroidTypefaceApi28RetOiIg(null, fontWeight, i10);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo26503createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i10) {
        return m26508createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i10);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo26504optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(AbstractC9133u.m16128b(str, companion.getSansSerif().getName()) ? mo26503createNamedRetOiIg(companion.getSansSerif(), fontWeight, i10) : AbstractC9133u.m16128b(str, companion.getSerif().getName()) ? mo26503createNamedRetOiIg(companion.getSerif(), fontWeight, i10) : AbstractC9133u.m16128b(str, companion.getMonospace().getName()) ? mo26503createNamedRetOiIg(companion.getMonospace(), fontWeight, i10) : AbstractC9133u.m16128b(str, companion.getCursive().getName()) ? mo26503createNamedRetOiIg(companion.getCursive(), fontWeight, i10) : m26510loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i10), settings, context);
    }
}
