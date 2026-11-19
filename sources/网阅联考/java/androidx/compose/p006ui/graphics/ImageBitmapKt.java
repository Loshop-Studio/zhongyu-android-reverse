package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.graphics.colorspace.ColorSpace;
import androidx.compose.p006ui.graphics.colorspace.ColorSpaces;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aP\u0010\r\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m5175d2 = {"ImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "toPixelMap", "Landroidx/compose/ui/graphics/PixelMap;", "startX", "startY", "buffer", "", "bufferOffset", "stride", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m9379ImageBitmapx__hDU(int i4, int i5, int i6, boolean z3, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return AndroidImageBitmap_androidKt.m9055ActualImageBitmapx__hDU(i4, i5, i6, z3, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m9380ImageBitmapx__hDU$default(int i4, int i5, int i6, boolean z3, ColorSpace colorSpace, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = ImageBitmapConfig.INSTANCE.m9375getArgb8888_sVssgQ();
        }
        if ((i7 & 8) != 0) {
            z3 = true;
        }
        if ((i7 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m9379ImageBitmapx__hDU(i4, i5, i6, z3, colorSpace);
    }

    public static final PixelMap toPixelMap(ImageBitmap imageBitmap, int i4, int i5, int i6, int i7, int[] buffer, int i8, int i9) {
        Intrinsics.checkNotNullParameter(imageBitmap, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        imageBitmap.readPixels(buffer, i4, i5, i6, i7, i8, i9);
        return new PixelMap(buffer, i6, i7, i8, i9);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i4, int i5, int i6, int i7, int[] iArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            i6 = imageBitmap.getWidth();
        }
        if ((i10 & 8) != 0) {
            i7 = imageBitmap.getHeight();
        }
        if ((i10 & 16) != 0) {
            iArr = new int[i6 * i7];
        }
        if ((i10 & 32) != 0) {
            i8 = 0;
        }
        if ((i10 & 64) != 0) {
            i9 = i6;
        }
        return toPixelMap(imageBitmap, i4, i5, i6, i7, iArr, i8, i9);
    }
}
