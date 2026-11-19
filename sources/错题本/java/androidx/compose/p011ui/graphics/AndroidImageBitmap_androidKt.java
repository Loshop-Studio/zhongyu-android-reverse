package androidx.compose.p011ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p011ui.graphics.ImageBitmapConfig;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0001\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0011\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0006*\u00020\u0014H\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m5110d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "createImageBitmap", "bytes", "", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    @NotNull
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m10550ActualImageBitmapx__hDU(int i, int i8, int i9, boolean z8, @NotNull ColorSpace colorSpace) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configM10551toBitmapConfig1JJdX4A = m10551toBitmapConfig1JJdX4A(i9);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i8, m10551toBitmapConfig1JJdX4A(i9), z8, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i8, configM10551toBitmapConfig1JJdX4A);
            bitmapCreateBitmap.setHasAlpha(z8);
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    public static final ImageBitmap createImageBitmap(@NotNull byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    @NotNull
    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m10551toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        if (ImageBitmapConfig.m10897equalsimpl0(i, companion.m10902getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m10897equalsimpl0(i, companion.m10901getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m10897equalsimpl0(i, companion.m10905getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i8 = Build.VERSION.SDK_INT;
        return (i8 < 26 || !ImageBitmapConfig.m10897equalsimpl0(i, companion.m10903getF16_sVssgQ())) ? (i8 < 26 || !ImageBitmapConfig.m10897equalsimpl0(i, companion.m10904getGpu_sVssgQ())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.INSTANCE.m10901getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.INSTANCE.m10905getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.INSTANCE.m10902getArgb8888_sVssgQ();
        }
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || config != Bitmap.Config.RGBA_F16) ? (i < 26 || config != Bitmap.Config.HARDWARE) ? ImageBitmapConfig.INSTANCE.m10902getArgb8888_sVssgQ() : ImageBitmapConfig.INSTANCE.m10904getGpu_sVssgQ() : ImageBitmapConfig.INSTANCE.m10903getF16_sVssgQ();
    }
}
