package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.text.ExperimentalTextApi;
import androidx.compose.p013ui.text.font.FontVariation;

/* loaded from: classes2.dex */
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }

    @VisibleForTesting
    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            return str + "-medium";
        }
        if ((6 <= weight && weight < 8) || 8 > weight || weight >= 11) {
            return str;
        }
        return str + "-black";
    }

    @ExperimentalTextApi
    public static final Typeface setFontVariationSettings(Typeface typeface, FontVariation.Settings settings, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context) : typeface;
    }
}
