package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.FontVariation;

/* loaded from: classes2.dex */
public interface PlatformTypefaces {
    /* renamed from: createDefault-FO1MlWM, reason: not valid java name */
    Typeface mo33104createDefaultFO1MlWM(FontWeight fontWeight, int i10);

    /* renamed from: createNamed-RetOiIg, reason: not valid java name */
    Typeface mo33105createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i10);

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    Typeface mo33106optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, Context context);
}
