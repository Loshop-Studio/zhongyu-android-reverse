package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u000e\u001aP\u0010\u000f\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m5110d2 = {"ImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "decodeToImageBitmap", "", "toPixelMap", "Landroidx/compose/ui/graphics/PixelMap;", "startX", "startY", "buffer", "", "bufferOffset", "stride", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    @NotNull
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m10906ImageBitmapx__hDU(int i, int i8, int i9, boolean z8, @NotNull ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m10550ActualImageBitmapx__hDU(i, i8, i9, z8, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m10907ImageBitmapx__hDU$default(int i, int i8, int i9, boolean z8, ColorSpace colorSpace, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i9 = ImageBitmapConfig.INSTANCE.m10902getArgb8888_sVssgQ();
        }
        if ((i10 & 8) != 0) {
            z8 = true;
        }
        if ((i10 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m10906ImageBitmapx__hDU(i, i8, i9, z8, colorSpace);
    }

    @NotNull
    public static final ImageBitmap decodeToImageBitmap(@NotNull byte[] bArr) {
        return AndroidImageBitmap_androidKt.createImageBitmap(bArr);
    }

    @NotNull
    public static final PixelMap toPixelMap(@NotNull ImageBitmap imageBitmap, int i, int i8, int i9, int i10, @NotNull int[] iArr, int i11, int i12) {
        imageBitmap.readPixels(iArr, i, i8, i9, i10, i11, i12);
        return new PixelMap(iArr, i9, i10, i11, i12);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i, int i8, int i9, int i10, int[] iArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = 0;
        }
        if ((i13 & 2) != 0) {
            i8 = 0;
        }
        if ((i13 & 4) != 0) {
            i9 = imageBitmap.getWidth();
        }
        if ((i13 & 8) != 0) {
            i10 = imageBitmap.getHeight();
        }
        if ((i13 & 16) != 0) {
            iArr = new int[i9 * i10];
        }
        if ((i13 & 32) != 0) {
            i11 = 0;
        }
        if ((i13 & 64) != 0) {
            i12 = i9;
        }
        return toPixelMap(imageBitmap, i, i8, i9, i10, iArr, i11, i12);
    }
}
