package androidx.compose.p014ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p014ui.graphics.ImageBitmapConfig;
import androidx.compose.p014ui.graphics.colorspace.ColorSpace;

/* loaded from: classes2.dex */
public final class AndroidImageBitmap_androidKt {
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m30746ActualImageBitmapx__hDU(int i10, int i11, int i12, boolean z10, ColorSpace colorSpace) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configM30747toBitmapConfig1JJdX4A = m30747toBitmapConfig1JJdX4A(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, m30747toBitmapConfig1JJdX4A(i12), z10, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configM30747toBitmapConfig1JJdX4A);
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
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
    public static final Bitmap.Config m30747toBitmapConfig1JJdX4A(int i10) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m31093equalsimpl0(i10, companion.m31098getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m31093equalsimpl0(i10, companion.m31097getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m31093equalsimpl0(i10, companion.m31101getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || !ImageBitmapConfig.m31093equalsimpl0(i10, companion.m31099getF16_sVssgQ())) ? (i11 < 26 || !ImageBitmapConfig.m31093equalsimpl0(i10, companion.m31100getGpu_sVssgQ())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m31097getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m31101getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m31098getArgb8888_sVssgQ();
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || config != Bitmap.Config.RGBA_F16) ? (i10 < 26 || config != Bitmap.Config.HARDWARE) ? ImageBitmapConfig.Companion.m31098getArgb8888_sVssgQ() : ImageBitmapConfig.Companion.m31100getGpu_sVssgQ() : ImageBitmapConfig.Companion.m31099getF16_sVssgQ();
    }
}
