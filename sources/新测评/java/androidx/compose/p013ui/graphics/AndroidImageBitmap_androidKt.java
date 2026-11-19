package androidx.compose.p013ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p013ui.graphics.ImageBitmapConfig;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0001\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0011\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0006*\u00020\u0014H\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m13558d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "createImageBitmap", "bytes", "", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidImageBitmap_androidKt {
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m20844ActualImageBitmapx__hDU(int i10, int i11, int i12, boolean z9, ColorSpace colorSpace) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configM20845toBitmapConfig1JJdX4A = m20845toBitmapConfig1JJdX4A(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Api26Bitmap.m20883createBitmapx__hDU$ui_graphics_release(i10, i11, i12, z9, colorSpace);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configM20845toBitmapConfig1JJdX4A);
            bitmapCreateBitmap.setHasAlpha(z9);
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    public static final ImageBitmap createImageBitmap(byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m20845toBitmapConfig1JJdX4A(int i10) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        if (ImageBitmapConfig.m21191equalsimpl0(i10, companion.m21196getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m21191equalsimpl0(i10, companion.m21195getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m21191equalsimpl0(i10, companion.m21199getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || !ImageBitmapConfig.m21191equalsimpl0(i10, companion.m21197getF16_sVssgQ())) ? (i11 < 26 || !ImageBitmapConfig.m21191equalsimpl0(i10, companion.m21198getGpu_sVssgQ())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.INSTANCE.m21195getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.INSTANCE.m21199getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.INSTANCE.m21196getArgb8888_sVssgQ();
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || config != Bitmap.Config.RGBA_F16) ? (i10 < 26 || config != Bitmap.Config.HARDWARE) ? ImageBitmapConfig.INSTANCE.m21196getArgb8888_sVssgQ() : ImageBitmapConfig.INSTANCE.m21198getGpu_sVssgQ() : ImageBitmapConfig.INSTANCE.m21197getF16_sVssgQ();
    }
}
