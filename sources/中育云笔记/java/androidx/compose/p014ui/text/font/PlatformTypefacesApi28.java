package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(28)
@VisibleForTesting
/* loaded from: classes2.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final Typeface m33110createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i10) {
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m33077equalsimpl0(i10, companion.m33084getNormal_LCdwA()) && AbstractC9979u.m20289b(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m33077equalsimpl0(i10, companion.m33083getItalic_LCdwA()));
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Typeface m33111createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m33110createAndroidTypefaceApi28RetOiIg(str, fontWeight, i10);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m33112loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM33110createAndroidTypefaceApi28RetOiIg = m33110createAndroidTypefaceApi28RetOiIg(str, fontWeight, i10);
        if (AbstractC9979u.m20289b(typefaceM33110createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m33077equalsimpl0(i10, FontStyle.Companion.m33083getItalic_LCdwA()))) || AbstractC9979u.m20289b(typefaceM33110createAndroidTypefaceApi28RetOiIg, m33110createAndroidTypefaceApi28RetOiIg(null, fontWeight, i10))) {
            return null;
        }
        return typefaceM33110createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.p014ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo33104createDefaultFO1MlWM(FontWeight fontWeight, int i10) {
        return m33110createAndroidTypefaceApi28RetOiIg(null, fontWeight, i10);
    }

    @Override // androidx.compose.p014ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo33105createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i10) {
        return m33110createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i10);
    }

    @Override // androidx.compose.p014ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo33106optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(AbstractC9979u.m20289b(str, companion.getSansSerif().getName()) ? mo33105createNamedRetOiIg(companion.getSansSerif(), fontWeight, i10) : AbstractC9979u.m20289b(str, companion.getSerif().getName()) ? mo33105createNamedRetOiIg(companion.getSerif(), fontWeight, i10) : AbstractC9979u.m20289b(str, companion.getMonospace().getName()) ? mo33105createNamedRetOiIg(companion.getMonospace(), fontWeight, i10) : AbstractC9979u.m20289b(str, companion.getCursive().getName()) ? mo33105createNamedRetOiIg(companion.getCursive(), fontWeight, i10) : m33112loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i10), settings, context);
    }
}
