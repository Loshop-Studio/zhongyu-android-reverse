package androidx.compose.p012ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p012ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(m13412d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\b\u0010\u0015\u001a\u00020\u0016H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m13413d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-Ej4NQ78", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "file", "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "path", "", "assetManager", "Landroid/content/res/AssetManager;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "generateAndroidFontKtForApiCompatibility", "", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "AndroidFontKt")
/* loaded from: classes2.dex */
public final class AndroidFontKt {
    @Stable
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m23518FontEj4NQ78(File file, FontWeight fontWeight, int i9, FontVariation.Settings settings) {
        return new Font(file, fontWeight, i9, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m23520FontEj4NQ78$default(File file, FontWeight fontWeight, int i9, FontVariation.Settings settings, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i10 & 4) != 0) {
            i9 = FontStyle.INSTANCE.m23578getNormal_LCdwA();
        }
        if ((i10 & 8) != 0) {
            settings = FontVariation.INSTANCE.m23593Settings6EWAqTQ(fontWeight, i9, new FontVariation.Setting[0]);
        }
        return m23518FontEj4NQ78(file, fontWeight, i9, settings);
    }

    @Stable
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m23521FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i9, FontVariation.Settings settings) {
        return new Font(assetManager, str, fontWeight, i9, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m23522FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i9, FontVariation.Settings settings, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i10 & 8) != 0) {
            i9 = FontStyle.INSTANCE.m23578getNormal_LCdwA();
        }
        if ((i10 & 16) != 0) {
            settings = FontVariation.INSTANCE.m23593Settings6EWAqTQ(fontWeight, i9, new FontVariation.Setting[0]);
        }
        return m23521FontMuC2MFs(str, assetManager, fontWeight, i9, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @RequiresApi(26)
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m23517FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i9, FontVariation.Settings settings) {
        return new Font(parcelFileDescriptor, fontWeight, i9, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m23519FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i9, FontVariation.Settings settings, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i10 & 4) != 0) {
            i9 = FontStyle.INSTANCE.m23578getNormal_LCdwA();
        }
        if ((i10 & 8) != 0) {
            settings = FontVariation.INSTANCE.m23593Settings6EWAqTQ(fontWeight, i9, new FontVariation.Setting[0]);
        }
        return m23517FontEj4NQ78(parcelFileDescriptor, fontWeight, i9, settings);
    }
}
