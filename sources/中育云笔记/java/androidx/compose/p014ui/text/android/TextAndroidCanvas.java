package androidx.compose.p014ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(Path path) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutPath(canvas, path);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(RectF rectF) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.disableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, rectF, f10, f11, rectF2, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawGlyphs(canvas, iArr, i10, fArr, i11, i12, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i10, i11, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(RenderNode renderNode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawRenderNode(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.enableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f10);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i10);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(Rect rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j10) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, j10);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(RectF rectF) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int i10, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, i10, blendMode);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(Path path) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j10, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, j10, blendMode);
    }

    @Override // android.graphics.Canvas
    @InterfaceC10770a
    public boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f10, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float f10, float f11, float f12, float f13) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC9979u.m20312y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawTextRun(canvas, measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
