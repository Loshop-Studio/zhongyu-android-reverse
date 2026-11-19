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

/* loaded from: classes5.dex */
public class MapRender {
    private static final String TAG = "MapRender";
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
    private float f10713mX = 0.0f;

    /* renamed from: mY */
    private float f10714mY = 0.0f;

    public MapRender() {
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

    public void directDrawPolyLine(List<Vector2D> list, Canvas canvas, Matrix matrix, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Vector2D vector2D = list.get(i11);
            float f10 = (float) vector2D.f10707x;
            float f11 = (float) vector2D.f10708y;
            if (i11 == 0) {
                Path path = new Path();
                this.mPath = path;
                path.moveTo(f10, f11);
            } else {
                Path path2 = this.mPath;
                float f12 = this.f10713mX;
                float f13 = this.f10714mY;
                path2.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            }
            this.f10713mX = f10;
            this.f10714mY = f11;
        }
        if (matrix != null) {
            this.mPath.transform(matrix);
        }
        this.mPaint.setColor(i10);
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
        new Rect((int) vector2DGeoVector2ViewVector.f10707x, (int) vector2DGeoVector2ViewVector.f10708y, (int) vector2DGeoVector2ViewVector2.f10707x, (int) vector2DGeoVector2ViewVector2.f10708y);
        this.mScreenCanvas.drawBitmap(bitmap, rectBmp.graphMatrix, null);
    }

    public void drawPolyLine(List<Vector2D> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Vector2D vector2DGeoVector2ViewVector = this.mapViewer.geoVector2ViewVector(list.get(i10));
            float f10 = (float) vector2DGeoVector2ViewVector.f10707x;
            float f11 = (float) vector2DGeoVector2ViewVector.f10708y;
            if (i10 == 0) {
                Path path = new Path();
                this.mPath = path;
                path.moveTo(f10, f11);
            } else {
                Path path2 = this.mPath;
                float f12 = this.f10713mX;
                float f13 = this.f10714mY;
                path2.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            }
            this.f10713mX = f10;
            this.f10714mY = f11;
        }
        this.mCanvas.drawPath(this.mPath, this.mPaint);
        this.mapViewer.postInvalidate();
    }

    public void init(final MapViewer mapViewer) {
        mapViewer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zykj.paint.render.MapRender.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                mapViewer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MapRender.this.width = mapViewer.getWidth();
                MapRender.this.height = mapViewer.getHeight();
                Log.e(MapRender.TAG, "width=" + MapRender.this.width + ",height=" + MapRender.this.height);
                MapRender mapRender = MapRender.this;
                int i10 = mapRender.width;
                int i11 = mapRender.height;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                mapRender.mBitmap = Bitmap.createBitmap(i10, i11, config);
                MapRender mapRender2 = MapRender.this;
                mapRender2.mScreenBitmap = Bitmap.createBitmap(mapRender2.width, mapRender2.height, config);
                MapRender.this.mCanvas = new Canvas(MapRender.this.mBitmap);
                MapRender.this.mScreenCanvas = new Canvas(MapRender.this.mScreenBitmap);
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
