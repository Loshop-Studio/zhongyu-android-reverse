package androidx.compose.p009ui.unit;

import android.content.Context;
import androidx.compose.p009ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p009ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m7880d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "context", "Landroid/content/Context;", "ui-unit_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        float f6 = context.getResources().getConfiguration().fontScale;
        float f7 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter fontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(f6);
        if (fontScaleConverterForScale == null) {
            fontScaleConverterForScale = new LinearFontScaleConverter(f6);
        }
        return new DensityWithConverter(f7, f6, fontScaleConverterForScale);
    }
}
