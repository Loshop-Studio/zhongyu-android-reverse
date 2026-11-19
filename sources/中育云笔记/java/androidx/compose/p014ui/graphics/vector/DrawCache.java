package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.CanvasKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.ImageBitmapConfig;
import androidx.compose.p014ui.graphics.ImageBitmapKt;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m33677getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m31098getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    private final void clear(DrawScope drawScope) {
        DrawScope.m31423drawRectnJ9OG0$default(drawScope, Color.Companion.m30904getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m30793getClear0nO6VwU(), 62, null);
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f10, ColorFilter colorFilter, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f10, colorFilter);
    }

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    /* renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m31556drawCachedImageFqjB98A(int i10, long j10, Density density, LayoutDirection layoutDirection, InterfaceC9540l interfaceC9540l) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmapM31103ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.cachedCanvas;
        if (imageBitmapM31103ImageBitmapx__hDU$default == null || Canvas == null || ((int) (j10 >> 32)) > imageBitmapM31103ImageBitmapx__hDU$default.getWidth() || ((int) (j10 & 4294967295L)) > imageBitmapM31103ImageBitmapx__hDU$default.getHeight() || !ImageBitmapConfig.m31093equalsimpl0(this.config, i10)) {
            imageBitmapM31103ImageBitmapx__hDU$default = ImageBitmapKt.m31103ImageBitmapx__hDU$default((int) (j10 >> 32), (int) (4294967295L & j10), i10, false, null, 24, null);
            Canvas = CanvasKt.Canvas(imageBitmapM31103ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM31103ImageBitmapx__hDU$default;
            this.cachedCanvas = Canvas;
            this.config = i10;
        }
        this.size = j10;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long jM33684toSizeozmzZPI = IntSizeKt.m33684toSizeozmzZPI(j10);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM31346component4NHjbRc = drawParams.m31346component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m31349setSizeuvyYCjk(jM33684toSizeozmzZPI);
        Canvas.save();
        clear(canvasDrawScope);
        interfaceC9540l.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m31349setSizeuvyYCjk(jM31346component4NHjbRc);
        imageBitmapM31103ImageBitmapx__hDU$default.prepareToDraw();
    }

    public final void drawInto(DrawScope drawScope, float f10, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (!(imageBitmap != null)) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m31412drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f10, null, colorFilter, 0, 0, 858, null);
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }
}
