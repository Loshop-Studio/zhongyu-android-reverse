package androidx.compose.p006ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p006ui.text.ExperimentalTextApi;
import androidx.compose.p006ui.text.font.FontVariation;
import androidx.compose.p006ui.unit.AndroidDensity_androidKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DensityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(api = 26)
@Metadata(m5174d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m5175d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "()V", "createFromAssets", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", C3380c.f1965R, "Landroid/content/Context;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "createFromFile", "file", "Ljava/io/File;", "createFromFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "toVariationSettings", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidPreloadedFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,235:1\n151#2,3:236\n33#2,4:239\n154#2,2:243\n38#2:245\n156#2:246\n37#3,2:247\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n230#1:236,3\n230#1:239,4\n230#1:243,2\n230#1:245\n230#1:246\n232#1:247,2\n*E\n"})
/* loaded from: classes.dex */
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
            if (settings.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i4 = 0; i4 < size; i4++) {
            FontVariation.Setting setting = settings2.get(i4);
            AbstractC1675h.m890a();
            arrayList.add(AbstractC1674g.m889a(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    public final Typeface createFromAssets(AssetManager assetManager, String path, Context context, FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return AbstractC1676i.m891a(assetManager, path).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    public final Typeface createFromFile(File file, Context context, FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return AbstractC1673f.m888a(file).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    public final Typeface createFromFileDescriptor(ParcelFileDescriptor fileDescriptor, Context context, FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        AbstractC1678k.m893a();
        return AbstractC1677j.m892a(fileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }
}
