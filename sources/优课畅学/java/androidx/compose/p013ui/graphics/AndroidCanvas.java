package androidx.compose.p013ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.PointMode;
import androidx.compose.p013ui.unit.IntOffset;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes2.dex */
public final class AndroidCanvas implements Canvas {
    private Rect dstRect;
    private Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private Rect srcRect;

    private final void drawLines(List<Offset> list, Paint paint, int i10) {
        if (list.size() >= 2) {
            Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
            int i11 = 0;
            while (i11 < list.size() - 1) {
                long jM24045unboximpl = list.get(i11).m24045unboximpl();
                long jM24045unboximpl2 = list.get(i11 + 1).m24045unboximpl();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (jM24045unboximpl >> 32)), Float.intBitsToFloat((int) (jM24045unboximpl & 4294967295L)), Float.intBitsToFloat((int) (jM24045unboximpl2 >> 32)), Float.intBitsToFloat((int) (jM24045unboximpl2 & 4294967295L)), paintAsFrameworkPaint);
                i11 += i10;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jM24045unboximpl = list.get(i10).m24045unboximpl();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (jM24045unboximpl >> 32)), Float.intBitsToFloat((int) (jM24045unboximpl & 4294967295L)), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i10) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
        int i11 = 0;
        while (i11 < fArr.length - 3) {
            this.internalCanvas.drawLine(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], paintAsFrameworkPaint);
            i11 += i10 * 2;
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i10) {
        if (fArr.length % 2 == 0) {
            Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
            int i11 = 0;
            while (i11 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i11], fArr[i11 + 1], paintAsFrameworkPaint);
                i11 += i10;
            }
        }
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo24129clipPathmtrdDE(Path path, int i10) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m24139toRegionOp7u2Bmg(i10));
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo24130clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10) {
        this.internalCanvas.clipRect(f10, f11, f12, f13, m24139toRegionOp7u2Bmg(i10));
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo24131concat58bKbWc(float[] fArr) {
        if (MatrixKt.m24531isIdentity58bKbWc(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AndroidMatrixConversions_androidKt.m24146setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void disableZ() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        this.internalCanvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo24132drawCircle9KIMszo(long j10, float f10, Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo24133drawImaged4ec7I(ImageBitmap imageBitmap, long j10, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo24134drawImageRectHPBpro0(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        AbstractC9133u.m16130d(rect);
        rect.left = IntOffset.m27027getXimpl(j10);
        rect.top = IntOffset.m27028getYimpl(j10);
        rect.right = IntOffset.m27027getXimpl(j10) + ((int) (j11 >> 32));
        rect.bottom = IntOffset.m27028getYimpl(j10) + ((int) (j11 & 4294967295L));
        C8736p c8736p = C8736p.f16368a;
        Rect rect2 = this.dstRect;
        AbstractC9133u.m16130d(rect2);
        rect2.left = IntOffset.m27027getXimpl(j12);
        rect2.top = IntOffset.m27028getYimpl(j12);
        rect2.right = IntOffset.m27027getXimpl(j12) + ((int) (j13 >> 32));
        rect2.bottom = IntOffset.m27028getYimpl(j12) + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo24135drawLineWko1d7g(long j10, long j11, Paint paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        this.internalCanvas.drawOval(f10, f11, f12, f13, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo24136drawPointsO7TthRY(int i10, List<Offset> list, Paint paint) {
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m24577equalsimpl0(i10, companion.m24581getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m24577equalsimpl0(i10, companion.m24583getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m24577equalsimpl0(i10, companion.m24582getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo24137drawRawPointsO7TthRY(int i10, float[] fArr, Paint paint) {
        if (fArr.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m24577equalsimpl0(i10, companion.m24581getLinesr_lszbg())) {
            drawRawLines(fArr, paint, 2);
        } else if (PointMode.m24577equalsimpl0(i10, companion.m24583getPolygonr_lszbg())) {
            drawRawLines(fArr, paint, 1);
        } else if (PointMode.m24577equalsimpl0(i10, companion.m24582getPointsr_lszbg())) {
            drawRawPoints(fArr, paint, 2);
        }
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        this.internalCanvas.drawRect(f10, f11, f12, f13, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        this.internalCanvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo24138drawVerticesTPEHhCM(Vertices vertices, int i10, Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m24182toAndroidVertexModeJOOmi9M(vertices.m24678getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void enableZ() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void rotate(float f10) {
        this.internalCanvas.rotate(f10);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void saveLayer(androidx.compose.p013ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void scale(float f10, float f11) {
        this.internalCanvas.scale(f10, f11);
    }

    public final void setInternalCanvas(Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void skew(float f10, float f11) {
        this.internalCanvas.skew(f10, f11);
    }

    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m24139toRegionOp7u2Bmg(int i10) {
        return ClipOp.m24260equalsimpl0(i10, ClipOp.Companion.m24264getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void translate(float f10, float f11) {
        this.internalCanvas.translate(f10, f11);
    }
}
