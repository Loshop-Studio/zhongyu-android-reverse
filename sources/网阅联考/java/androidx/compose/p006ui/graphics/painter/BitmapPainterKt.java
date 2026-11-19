package androidx.compose.p006ui.graphics.painter;

import androidx.compose.p006ui.graphics.FilterQuality;
import androidx.compose.p006ui.graphics.ImageBitmap;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m5175d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m9709BitmapPainterQZhYCtY(ImageBitmap image, long j4, long j5, int i4) {
        Intrinsics.checkNotNullParameter(image, "image");
        BitmapPainter bitmapPainter = new BitmapPainter(image, j4, j5, null);
        bitmapPainter.m9708setFilterQualityvDHp3xo$ui_graphics_release(i4);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m9710BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j4, long j5, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j4 = IntOffset.INSTANCE.m11653getZeronOccac();
        }
        long j6 = j4;
        if ((i5 & 4) != 0) {
            j5 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
        }
        long j7 = j5;
        if ((i5 & 8) != 0) {
            i4 = FilterQuality.INSTANCE.m9273getLowfv9h1I();
        }
        return m9709BitmapPainterQZhYCtY(imageBitmap, j6, j7, i4);
    }
}
