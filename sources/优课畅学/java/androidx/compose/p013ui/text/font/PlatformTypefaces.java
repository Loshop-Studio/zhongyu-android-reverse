package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.FontVariation;

/* loaded from: classes2.dex */
public interface PlatformTypefaces {
    /* renamed from: createDefault-FO1MlWM, reason: not valid java name */
    Typeface mo26502createDefaultFO1MlWM(FontWeight fontWeight, int i10);

    /* renamed from: createNamed-RetOiIg, reason: not valid java name */
    Typeface mo26503createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i10);

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    Typeface mo26504optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, Context context);
}
