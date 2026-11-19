package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.text.ExperimentalTextApi;
import androidx.compose.p014ui.text.font.FontVariation;
import androidx.compose.p014ui.unit.AndroidDensity_androidKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(api = 26)
/* loaded from: classes2.dex */
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @ExperimentalTextApi
    @RequiresApi(26)
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else {
            if (settings.getNeedsDensity$ui_text_release()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i10 = 0; i10 < size; i10++) {
            FontVariation.Setting setting = settings2.get(i10);
            AbstractC3168g.m1381a();
            arrayList.add(AbstractC3167f.m1380a(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    public final Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return AbstractC3166e.m1379a(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    public final Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return AbstractC3165d.m1378a(file).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    public final Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        AbstractC3170i.m1383a();
        return AbstractC3169h.m1382a(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }
}
