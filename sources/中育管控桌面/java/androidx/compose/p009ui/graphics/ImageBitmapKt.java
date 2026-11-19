package androidx.compose.p009ui.graphics;

import androidx.compose.p009ui.graphics.colorspace.ColorSpace;
import androidx.compose.p009ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u000e\u001aP\u0010\u000f\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m7880d2 = {"ImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "decodeToImageBitmap", "", "toPixelMap", "Landroidx/compose/ui/graphics/PixelMap;", "startX", "startY", "buffer", "", "bufferOffset", "stride", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class ImageBitmapKt {
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m14123ImageBitmapx__hDU(int i6, int i7, int i8, boolean z6, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m13767ActualImageBitmapx__hDU(i6, i7, i8, z6, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m14124ImageBitmapx__hDU$default(int i6, int i7, int i8, boolean z6, ColorSpace colorSpace, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = ImageBitmapConfig.INSTANCE.m14119getArgb8888_sVssgQ();
        }
        if ((i9 & 8) != 0) {
            z6 = true;
        }
        if ((i9 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m14123ImageBitmapx__hDU(i6, i7, i8, z6, colorSpace);
    }

    public static final ImageBitmap decodeToImageBitmap(byte[] bArr) {
        return AndroidImageBitmap_androidKt.createImageBitmap(bArr);
    }

    public static final PixelMap toPixelMap(ImageBitmap imageBitmap, int i6, int i7, int i8, int i9, int[] iArr, int i10, int i11) {
        imageBitmap.readPixels(iArr, i6, i7, i8, i9, i10, i11);
        return new PixelMap(iArr, i8, i9, i10, i11);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i6, int i7, int i8, int i9, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i6 = 0;
        }
        if ((i12 & 2) != 0) {
            i7 = 0;
        }
        if ((i12 & 4) != 0) {
            i8 = imageBitmap.getWidth();
        }
        if ((i12 & 8) != 0) {
            i9 = imageBitmap.getHeight();
        }
        if ((i12 & 16) != 0) {
            iArr = new int[i8 * i9];
        }
        if ((i12 & 32) != 0) {
            i10 = 0;
        }
        if ((i12 & 64) != 0) {
            i11 = i8;
        }
        return toPixelMap(imageBitmap, i6, i7, i8, i9, iArr, i10, i11);
    }
}
