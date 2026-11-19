package com.zykj.paint.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.Log;
import android.view.ViewTreeObserver;
import com.zykj.paint.Actions;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.draw.PolylineDrawer;
import com.zykj.paint.graphic.RectBmp;
import java.util.List;

/* loaded from: classes2.dex */
public class SketchRender {
    private static final String TAG = "SketchRender";
    public int height;
    public Bitmap mBitmap;
    public Canvas mCanvas;
    public Paint mPaint;
    public Bitmap mScreenBitmap;
    public Canvas mScreenCanvas;
    MapViewer mapViewer;
    private PolylineDrawer polylineDrawer;
    public int width;
    private Path mPath = new Path();

    /* renamed from: mX */
    private float f10157mX = 0.0f;

    /* renamed from: mY */
    private float f10158mY = 0.0f;

    public void clear() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mCanvas.drawPaint(paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.mCanvas.drawColor(0);
        this.mapViewer.postInvalidate();
    }

    public void directDrawBitmap(RectBmp rectBmp, Bitmap bitmap, Canvas canvas, Matrix matrix) {
        canvas.drawBitmap(bitmap, matrix, null);
    }

    public void directDrawPolyLine(List<Vector2D> list, Canvas canvas, Matrix matrix, int i9) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Vector2D vector2D = list.get(i10);
            float f10 = (float) vector2D.f10149x;
            float f11 = (float) vector2D.f10150y;
            if (i10 == 0) {
                Path path = new Path();
                this.mPath = path;
                path.moveTo(f10, f11);
            } else {
                Path path2 = this.mPath;
                float f12 = this.f10157mX;
                float f13 = this.f10158mY;
                path2.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            }
            this.f10157mX = f10;
            this.f10158mY = f11;
        }
        if (matrix != null) {
            this.mPath.transform(matrix);
        }
        this.mPaint.setColor(i9);
        canvas.drawPath(this.mPath, this.mPaint);
    }

    public void drawBezierLine(List<Actions.EzyPoint> list, boolean z9) {
        if (this.polylineDrawer == null) {
            this.polylineDrawer = new PolylineDrawer(this.mPaint);
        }
        this.polylineDrawer.draw(this.mCanvas, list, z9);
        this.mapViewer.postInvalidate();
    }

    public void drawBitmap(RectBmp rectBmp, Bitmap bitmap) {
        Vector2D vector2D = rectBmp.vector2D;
        Vector2D vector2D2 = rectBmp.dstVector2D;
        Vector2D vector2DGeoVector2ViewVector = this.mapViewer.geoVector2ViewVector(vector2D, false);
        Vector2D vector2DGeoVector2ViewVector2 = this.mapViewer.geoVector2ViewVector(vector2D2, false);
        new Rect((int) vector2DGeoVector2ViewVector.f10149x, (int) vector2DGeoVector2ViewVector.f10150y, (int) vector2DGeoVector2ViewVector2.f10149x, (int) vector2DGeoVector2ViewVector2.f10150y);
        this.mScreenCanvas.drawBitmap(bitmap, rectBmp.graphMatrix, null);
    }

    public void drawPolyLine(List<Vector2D> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Vector2D vector2DGeoVector2ViewVector = this.mapViewer.geoVector2ViewVector(list.get(i9));
            float f10 = (float) vector2DGeoVector2ViewVector.f10149x;
            float f11 = (float) vector2DGeoVector2ViewVector.f10150y;
            if (i9 == 0) {
                Path path = new Path();
                this.mPath = path;
                path.moveTo(f10, f11);
            } else {
                Path path2 = this.mPath;
                float f12 = this.f10157mX;
                float f13 = this.f10158mY;
                path2.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            }
            this.f10157mX = f10;
            this.f10158mY = f11;
        }
        this.mCanvas.drawPath(this.mPath, this.mPaint);
        this.mapViewer.postInvalidate();
    }

    public void init(final MapViewer mapViewer) {
        mapViewer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zykj.paint.render.SketchRender.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                mapViewer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                SketchRender.this.width = mapViewer.getWidth();
                SketchRender.this.height = mapViewer.getHeight();
                Log.e(SketchRender.TAG, "width=" + SketchRender.this.width + ",height=" + SketchRender.this.height);
                SketchRender sketchRender = SketchRender.this;
                int i9 = sketchRender.width;
                int i10 = sketchRender.height;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                sketchRender.mBitmap = Bitmap.createBitmap(i9, i10, config);
                SketchRender sketchRender2 = SketchRender.this;
                sketchRender2.mScreenBitmap = Bitmap.createBitmap(sketchRender2.width, sketchRender2.height, config);
                SketchRender.this.mCanvas = new Canvas(SketchRender.this.mBitmap);
                SketchRender.this.mScreenCanvas = new Canvas(SketchRender.this.mScreenBitmap);
            }
        });
        this.mapViewer = mapViewer;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setDither(true);
        this.mPaint.setARGB(255, 0, 0, 0);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setStrokeWidth(3.0f);
    }

    public void release() {
        this.mCanvas = null;
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.mBitmap.recycle();
        this.mBitmap = null;
    }

    public void drawBitmap(Bitmap bitmap, Rect2D rect2D, Rect2D rect2D2) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.mCanvas.drawBitmap(bitmap, rect2D.toRect(), rect2D2.toRect(), paint);
    }
}
