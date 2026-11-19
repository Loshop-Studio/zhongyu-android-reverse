package androidx.compose.p011ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m5110d2 = {"", "path", "Landroid/content/res/AssetManager;", "assetManager", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/Font;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Font", "Ljava/io/File;", "file", "Font-Ej4NQ78", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Ld6/s;", "generateAndroidFontKtForApiCompatibility", "()V", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "AndroidFontKt")
/* loaded from: classes2.dex */
public final class AndroidFontKt {
    @Stable
    @NotNull
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m12828FontEj4NQ78(@NotNull File file, @NotNull FontWeight fontWeight, int i, @NotNull FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m12830FontEj4NQ78$default(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i8 & 4) != 0) {
            i = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        if ((i8 & 8) != 0) {
            settings = FontVariation.INSTANCE.m12903Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m12828FontEj4NQ78(file, fontWeight, i, settings);
    }

    @Stable
    @NotNull
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m12831FontMuC2MFs(@NotNull String str, @NotNull AssetManager assetManager, @NotNull FontWeight fontWeight, int i, @NotNull FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m12832FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i8 & 8) != 0) {
            i = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        if ((i8 & 16) != 0) {
            settings = FontVariation.INSTANCE.m12903Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m12831FontMuC2MFs(str, assetManager, fontWeight, i, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @RequiresApi(26)
    @NotNull
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m12827FontEj4NQ78(@NotNull ParcelFileDescriptor parcelFileDescriptor, @NotNull FontWeight fontWeight, int i, @NotNull FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m12829FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i8 & 4) != 0) {
            i = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        if ((i8 & 8) != 0) {
            settings = FontVariation.INSTANCE.m12903Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m12827FontEj4NQ78(parcelFileDescriptor, fontWeight, i, settings);
    }
}
