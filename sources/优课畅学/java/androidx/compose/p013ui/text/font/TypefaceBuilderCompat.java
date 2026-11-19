package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.ExperimentalTextApi;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.p013ui.unit.AndroidDensity_androidKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
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
            AbstractC3138g.m1304a();
            arrayList.add(AbstractC3137f.m1303a(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    public final Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return AbstractC3136e.m1302a(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    public final Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return AbstractC3135d.m1301a(file).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    public final Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        AbstractC3140i.m1306a();
        return AbstractC3139h.m1305a(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }
}
