package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.CanvasKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.ImageBitmapConfig;
import androidx.compose.p013ui.graphics.ImageBitmapKt;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m27075getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m24496getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    private final void clear(DrawScope drawScope) {
        DrawScope.m24821drawRectnJ9OG0$default(drawScope, Color.Companion.m24302getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m24191getClear0nO6VwU(), 62, null);
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
    public final void m24954drawCachedImageFqjB98A(int i10, long j10, Density density, LayoutDirection layoutDirection, InterfaceC10570l interfaceC10570l) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmapM24501ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.cachedCanvas;
        if (imageBitmapM24501ImageBitmapx__hDU$default == null || Canvas == null || ((int) (j10 >> 32)) > imageBitmapM24501ImageBitmapx__hDU$default.getWidth() || ((int) (j10 & 4294967295L)) > imageBitmapM24501ImageBitmapx__hDU$default.getHeight() || !ImageBitmapConfig.m24491equalsimpl0(this.config, i10)) {
            imageBitmapM24501ImageBitmapx__hDU$default = ImageBitmapKt.m24501ImageBitmapx__hDU$default((int) (j10 >> 32), (int) (4294967295L & j10), i10, false, null, 24, null);
            Canvas = CanvasKt.Canvas(imageBitmapM24501ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM24501ImageBitmapx__hDU$default;
            this.cachedCanvas = Canvas;
            this.config = i10;
        }
        this.size = j10;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long jM27082toSizeozmzZPI = IntSizeKt.m27082toSizeozmzZPI(j10);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM24744component4NHjbRc = drawParams.m24744component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m24747setSizeuvyYCjk(jM27082toSizeozmzZPI);
        Canvas.save();
        clear(canvasDrawScope);
        interfaceC10570l.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m24747setSizeuvyYCjk(jM24744component4NHjbRc);
        imageBitmapM24501ImageBitmapx__hDU$default.prepareToDraw();
    }

    public final void drawInto(DrawScope drawScope, float f10, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (!(imageBitmap != null)) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m24810drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f10, null, colorFilter, 0, 0, 858, null);
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }
}
