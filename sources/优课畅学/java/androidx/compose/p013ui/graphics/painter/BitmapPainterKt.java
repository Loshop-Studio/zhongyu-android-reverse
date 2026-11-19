package androidx.compose.p013ui.graphics.painter;

import androidx.compose.p013ui.graphics.FilterQuality;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;

/* loaded from: classes2.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m24949BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j10, long j11, int i10) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j10, j11, null);
        bitmapPainter.m24948setFilterQualityvDHp3xo$ui_graphics_release(i10);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m24950BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = IntOffset.Companion.m27038getZeronOccac();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = IntSize.m27065constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = FilterQuality.Companion.m24375getLowfv9h1I();
        }
        return m24949BitmapPainterQZhYCtY(imageBitmap, j12, j13, i10);
    }
}
