package androidx.compose.p013ui.unit;

import android.content.Context;
import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p013ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m13558d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "context", "Landroid/content/Context;", "ui-unit_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter fontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(f10);
        if (fontScaleConverterForScale == null) {
            fontScaleConverterForScale = new LinearFontScaleConverter(f10);
        }
        return new DensityWithConverter(f11, f10, fontScaleConverterForScale);
    }
}
