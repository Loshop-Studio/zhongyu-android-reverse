package androidx.compose.p013ui.graphics.painter;

import androidx.compose.p013ui.graphics.FilterQuality;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m13558d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n1#2:156\n30#3:157\n80#4:158\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainterKt\n*L\n49#1:157\n49#1:158\n*E\n"})
/* loaded from: classes2.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m21649BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j10, long j11, int i10) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j10, j11, null);
        bitmapPainter.m21648setFilterQualityvDHp3xo$ui_graphics_release(i10);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m21650BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = IntOffset.INSTANCE.m23700getZeronOccac();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = IntSize.m23727constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = FilterQuality.INSTANCE.m21075getLowfv9h1I();
        }
        return m21649BitmapPainterQZhYCtY(imageBitmap, j12, j13, i10);
    }
}
