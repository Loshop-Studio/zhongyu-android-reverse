package androidx.compose.p006ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p006ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000e\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\b\u0010\u0015\u001a\u00020\u0016H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m5175d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-Ej4NQ78", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "file", "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "path", "", "assetManager", "Landroid/content/res/AssetManager;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "generateAndroidFontKtForApiCompatibility", "", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidFontKt {
    @Stable
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m11110FontEj4NQ78(File file, FontWeight weight, int i4, FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new Font(file, weight, i4, variationSettings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m11112FontEj4NQ78$default(File file, FontWeight fontWeight, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i5 & 4) != 0) {
            i4 = FontStyle.INSTANCE.m11167getNormal_LCdwA();
        }
        if ((i5 & 8) != 0) {
            settings = FontVariation.INSTANCE.m11182Settings6EWAqTQ(fontWeight, i4, new FontVariation.Setting[0]);
        }
        return m11110FontEj4NQ78(file, fontWeight, i4, settings);
    }

    @Stable
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m11113FontMuC2MFs(String path, AssetManager assetManager, FontWeight weight, int i4, FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new Font(assetManager, path, weight, i4, variationSettings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m11114FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i5 & 8) != 0) {
            i4 = FontStyle.INSTANCE.m11167getNormal_LCdwA();
        }
        if ((i5 & 16) != 0) {
            settings = FontVariation.INSTANCE.m11182Settings6EWAqTQ(fontWeight, i4, new FontVariation.Setting[0]);
        }
        return m11113FontMuC2MFs(str, assetManager, fontWeight, i4, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @RequiresApi(26)
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m11109FontEj4NQ78(ParcelFileDescriptor fileDescriptor, FontWeight weight, int i4, FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new Font(fileDescriptor, weight, i4, variationSettings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m11111FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i5 & 4) != 0) {
            i4 = FontStyle.INSTANCE.m11167getNormal_LCdwA();
        }
        if ((i5 & 8) != 0) {
            settings = FontVariation.INSTANCE.m11182Settings6EWAqTQ(fontWeight, i4, new FontVariation.Setting[0]);
        }
        return m11109FontEj4NQ78(parcelFileDescriptor, fontWeight, i4, settings);
    }
}
