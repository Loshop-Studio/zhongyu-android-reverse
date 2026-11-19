package androidx.compose.p014ui.graphics.painter;

import androidx.compose.p014ui.graphics.FilterQuality;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;

/* loaded from: classes2.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m31551BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j10, long j11, int i10) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j10, j11, null);
        bitmapPainter.m31550setFilterQualityvDHp3xo$ui_graphics_release(i10);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m31552BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = IntOffset.Companion.m33640getZeronOccac();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = IntSize.m33667constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = FilterQuality.Companion.m30977getLowfv9h1I();
        }
        return m31551BitmapPainterQZhYCtY(imageBitmap, j12, j13, i10);
    }
}
