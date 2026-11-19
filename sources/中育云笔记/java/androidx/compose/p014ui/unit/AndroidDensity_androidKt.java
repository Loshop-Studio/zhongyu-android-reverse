package androidx.compose.p014ui.unit;

import android.content.Context;
import androidx.compose.p014ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p014ui.unit.fontscaling.FontScaleConverterFactory;

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
