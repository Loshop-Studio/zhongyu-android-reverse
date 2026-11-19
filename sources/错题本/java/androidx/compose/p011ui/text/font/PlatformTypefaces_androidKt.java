package androidx.compose.p011ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.text.ExperimentalTextApi;
import androidx.compose.p011ui.text.font.FontVariation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a \u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¨\u0006\r"}, m5110d2 = {"PlatformTypefaces", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "getWeightSuffixForFallbackFamilyName", "", HintConstants.AUTOFILL_HINT_NAME, "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PlatformTypefaces_androidKt {
    @NotNull
    public static final PlatformTypefaces PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }

    @VisibleForTesting
    @NotNull
    public static final String getWeightSuffixForFallbackFamilyName(@NotNull String str, @NotNull FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        return (weight < 0 || weight >= 2) ? (2 > weight || weight >= 4) ? weight == 4 ? str : weight == 5 ? AbstractC0037f.m74C(str, "-medium") : ((6 > weight || weight >= 8) && 8 <= weight && weight < 11) ? AbstractC0037f.m74C(str, "-black") : str : AbstractC0037f.m74C(str, "-light") : AbstractC0037f.m74C(str, "-thin");
    }

    @ExperimentalTextApi
    @Nullable
    public static final Typeface setFontVariationSettings(@Nullable Typeface typeface, @NotNull FontVariation.Settings settings, @NotNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context) : typeface;
    }
}
