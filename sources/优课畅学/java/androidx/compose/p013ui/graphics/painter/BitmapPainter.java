package androidx.compose.p013ui.graphics.painter;

import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.FilterQuality;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j10, long j11, AbstractC9126n abstractC9126n) {
        this(imageBitmap, j10, j11);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m24945validateSizeN5eqBDc(long j10, long j11) {
        int i10;
        int i11;
        if (IntOffset.m27027getXimpl(j10) < 0 || IntOffset.m27028getYimpl(j10) < 0 || (i10 = (int) (j11 >> 32)) < 0 || (i11 = (int) (4294967295L & j11)) < 0 || i10 > this.image.getWidth() || i11 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j11;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyAlpha(float f10) {
        this.alpha = f10;
        return true;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return AbstractC9133u.m16128b(this.image, bitmapPainter.image) && IntOffset.m27026equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m27068equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m24370equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m24946getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo24947getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m27082toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m27029hashCodeimpl(this.srcOffset)) * 31) + IntSize.m27071hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m24371hashCodeimpl(this.filterQuality);
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m24810drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSize.m27065constructorimpl((Math.round(Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() >> 32))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m24948setFilterQualityvDHp3xo$ui_graphics_release(int i10) {
        this.filterQuality = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m27034toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m27073toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m24372toStringimpl(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j10, long j11, int i10, AbstractC9126n abstractC9126n) {
        this(imageBitmap, (i10 & 2) != 0 ? IntOffset.Companion.m27038getZeronOccac() : j10, (i10 & 4) != 0 ? IntSize.m27065constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j11, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j10, long j11) {
        this.image = imageBitmap;
        this.srcOffset = j10;
        this.srcSize = j11;
        this.filterQuality = FilterQuality.Companion.m24375getLowfv9h1I();
        this.size = m24945validateSizeN5eqBDc(j10, j11);
        this.alpha = 1.0f;
    }
}
