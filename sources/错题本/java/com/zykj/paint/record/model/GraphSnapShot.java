package com.zykj.paint.record.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import androidx.camera.video.AudioStats;
import com.zykj.paint.SketchSyncView;

/* loaded from: classes3.dex */
public class GraphSnapShot {
    private static final String TAG = "GraphSnapShot";
    public Bitmap bitmap;
    public int graphId;
    public Canvas mCanvas;
    public float[] origin;
    public Paint paint;
    public Bitmap sketchBitmap;
    public SketchSyncView sketchView;
    public Paint snapShotPaint;
    private double temp;
    public boolean isSelect = false;
    public Matrix matrix = new Matrix();
    public float[] center = new float[2];
    public float[] markerCenter = new float[2];
    public Matrix midMatrix = new Matrix();
    public Matrix sketchMatrix = new Matrix();

    public GraphSnapShot() {
        Log.e(TAG, TAG);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(Color.parseColor("#3399FF"));
        Paint paint2 = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.paint;
        Paint.Join join = Paint.Join.ROUND;
        paint3.setStrokeJoin(join);
        Paint paint4 = this.paint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        this.paint.setStrokeWidth(3.0f);
        Paint paint5 = new Paint();
        this.snapShotPaint = paint5;
        paint5.setAntiAlias(true);
        this.snapShotPaint.setDither(true);
        this.snapShotPaint.setColor(Color.parseColor("#27C69A"));
        this.snapShotPaint.setStyle(style);
        this.snapShotPaint.setStrokeJoin(join);
        this.snapShotPaint.setStrokeCap(cap);
        this.snapShotPaint.setStrokeWidth(3.0f);
    }

    public double calculateDegree(float f, float f7, float f8, float f9) {
        return calculateDegree(this.origin, f, f7, f8, f9);
    }

    public void delByLines(MotionEvent motionEvent) {
    }

    public double exactCalculateDegree(float[] fArr, float f, float f7, float f8, float f9) {
        double[] dArrRoughCalculate = roughCalculate(fArr, f, f7, f8, f9);
        if (dArrRoughCalculate[1] < AudioStats.AUDIO_AMPLITUDE_NONE) {
            double d9 = dArrRoughCalculate[0];
            if ((d9 > 90.0d && this.temp < -90.0d) || this.temp < -180.0d) {
                dArrRoughCalculate[0] = d9 - 360.0d;
            }
        } else {
            double d10 = dArrRoughCalculate[0];
            if ((d10 <= 90.0d || this.temp <= 90.0d) && this.temp <= 180.0d) {
                dArrRoughCalculate[0] = -d10;
            } else {
                dArrRoughCalculate[0] = 360.0d - d10;
            }
        }
        double d11 = dArrRoughCalculate[0];
        this.temp = d11;
        return d11;
    }

    public int getActionMode() {
        return this.sketchView.actionMode;
    }

    public double getPointsLength(float f, float f7, float f8, float f9) {
        PointF pointF = new PointF();
        pointF.set(f - f8, f7 - f9);
        return getVectorLength(pointF);
    }

    public double getVectorLength(PointF pointF) {
        float f = pointF.x;
        float f7 = pointF.y;
        return Math.sqrt((f7 * f7) + (f * f));
    }

    public float[] invertPoints(float f, float f7) {
        return invertPoints(this.matrix, f, f7);
    }

    public boolean isInGraphRect(float f, float f7) {
        return isInGraphRect(this.bitmap, f, f7);
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public PointF mapPointF(PointF pointF, Matrix matrix) {
        PointF pointF2 = new PointF();
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }

    public float[] mapPoints(float f, float f7) {
        float[] fArr = new float[2];
        Matrix matrix = new Matrix();
        matrix.postConcat(this.matrix);
        matrix.mapPoints(fArr, new float[]{f, f7});
        return fArr;
    }

    public void release() {
        try {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.bitmap.recycle();
                this.bitmap = null;
            }
            Bitmap bitmap2 = this.sketchBitmap;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            this.sketchBitmap.recycle();
            this.sketchBitmap = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset() {
        this.temp = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public double[] roughCalculate(float[] fArr, float f, float f7, float f8, float f9) {
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        pointF.set(f - fArr[0], f7 - fArr[1]);
        pointF2.set(f8 - fArr[0], f9 - fArr[1]);
        double vectorLength = getVectorLength(pointF);
        double vectorLength2 = getVectorLength(pointF2);
        double d9 = ((pointF.y * pointF2.y) + (pointF.x * pointF2.x)) / (vectorLength * vectorLength2);
        if (d9 > 1.0d) {
            d9 = 1.0d;
        }
        double dAcos = (Math.acos(d9) * 180.0d) / 3.141592653589793d;
        pointF.x = (float) (pointF.x / vectorLength);
        pointF.y = (float) (pointF.y / vectorLength);
        pointF2.x = (float) (pointF2.x / vectorLength2);
        pointF2.y = (float) (pointF2.y / vectorLength2);
        PointF pointF3 = new PointF(pointF2.y, -pointF2.x);
        return new double[]{dAcos, (pointF.y * pointF3.y) + (pointF.x * pointF3.x)};
    }

    public void setGraphMiddle(int i, int i8) {
        this.matrix.postTranslate((i - this.bitmap.getWidth()) / 2, (i8 - this.bitmap.getHeight()) / 2);
        this.matrix.postScale(1.0f, 1.0f, i / 2, i8 / 2);
    }

    public void setSelect(boolean z8) {
        this.isSelect = z8;
    }

    public double calculateDegree(float[] fArr, float f, float f7, float f8, float f9) {
        double[] dArrRoughCalculate = roughCalculate(fArr, f, f7, f8, f9);
        if (dArrRoughCalculate[1] <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            dArrRoughCalculate[0] = -dArrRoughCalculate[0];
        }
        return dArrRoughCalculate[0];
    }

    public float[] invertPoints(Matrix matrix, float f, float f7) {
        float[] fArr = new float[2];
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr, new float[]{f, f7});
        return fArr;
    }

    public boolean isInGraphRect(Bitmap bitmap, float f, float f7) {
        return isInGraphRect(bitmap, null, f, f7);
    }

    public boolean isInGraphRect(Bitmap bitmap, Matrix matrix, float f, float f7) {
        if (bitmap == null) {
            return false;
        }
        Matrix matrix2 = new Matrix();
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.postConcat(this.matrix);
        float[] fArrInvertPoints = invertPoints(matrix2, f, f7);
        return new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()).contains(fArrInvertPoints[0], fArrInvertPoints[1]);
    }

    public double exactCalculateDegree(float f, float f7, float f8, float f9) {
        return exactCalculateDegree(this.center, f, f7, f8, f9);
    }
}
