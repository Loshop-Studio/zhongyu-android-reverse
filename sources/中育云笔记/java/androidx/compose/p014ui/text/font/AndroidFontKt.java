package androidx.compose.p014ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import java.io.File;

/* loaded from: classes2.dex */
public final class AndroidFontKt {
    @Stable
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m33024FontEj4NQ78(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i10, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m33026FontEj4NQ78$default(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.Companion.m33084getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            settings = FontVariation.INSTANCE.m33099Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m33024FontEj4NQ78(file, fontWeight, i10, settings);
    }

    @Stable
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m33027FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i10, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m33028FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 8) != 0) {
            i10 = FontStyle.Companion.m33084getNormal_LCdwA();
        }
        if ((i11 & 16) != 0) {
            settings = FontVariation.INSTANCE.m33099Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m33027FontMuC2MFs(str, assetManager, fontWeight, i10, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @RequiresApi(26)
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m33023FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i10, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m33025FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.Companion.m33084getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            settings = FontVariation.INSTANCE.m33099Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m33023FontEj4NQ78(parcelFileDescriptor, fontWeight, i10, settings);
    }
}
