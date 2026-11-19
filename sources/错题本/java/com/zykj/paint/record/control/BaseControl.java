package com.zykj.paint.record.control;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.zykj.paint.record.model.GraphSnapShot;

/* loaded from: classes3.dex */
public class BaseControl {
    public int actionMode;
    protected Paint blackPaint;
    protected float anchorX = 0.0f;
    protected float anchorY = 0.0f;
    protected float oldDistance = 1.0f;
    protected float oldRotation = 0.0f;
    protected PointF midPoint = new PointF();
    protected Matrix downMatrix = new Matrix();
    protected Matrix moveMatrix = new Matrix();
    protected int mStrokeColor = ViewCompat.MEASURED_STATE_MASK;
    protected int mDefaultSize = 3;

    public BaseControl() {
        Paint paint = new Paint();
        this.blackPaint = paint;
        paint.setAntiAlias(true);
        this.blackPaint.setDither(true);
        this.blackPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.blackPaint.setStyle(Paint.Style.STROKE);
        this.blackPaint.setStrokeJoin(Paint.Join.ROUND);
        this.blackPaint.setStrokeCap(Paint.Cap.ROUND);
        this.blackPaint.setStrokeWidth(3.0f);
    }

    public float[] getBitmapPoints(GraphSnapShot graphSnapShot) {
        return getBitmapPoints(graphSnapShot.bitmap, graphSnapShot.matrix);
    }

    public float getDistance(MotionEvent motionEvent) {
        float x3 = motionEvent.getX(0) - motionEvent.getX(1);
        return (float) Math.sqrt(Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d) + Math.pow(x3, 2.0d));
    }

    public float getRotation(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1)));
    }

    public PointF midPoint(MotionEvent motionEvent) {
        PointF pointF = new PointF();
        pointF.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
        return pointF;
    }

    public void tempDraw(Canvas canvas) {
    }

    public float[] getBitmapPoints(Bitmap bitmap, Matrix matrix) {
        float[] fArr = new float[8];
        matrix.mapPoints(fArr, new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, 0.0f, bitmap.getHeight(), bitmap.getWidth(), bitmap.getHeight()});
        return fArr;
    }

    public float getDistance(MotionEvent motionEvent, Matrix matrix) {
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{motionEvent.getX(0) - motionEvent.getX(1), motionEvent.getY(0) - motionEvent.getY(1)});
        return (float) Math.sqrt(Math.pow(fArr[1], 2.0d) + Math.pow(fArr[0], 2.0d));
    }

    public float getRotation(MotionEvent motionEvent, Matrix matrix) {
        matrix.mapPoints(new float[2], new float[]{motionEvent.getX(0) - motionEvent.getX(1), motionEvent.getY(0) - motionEvent.getY(1)});
        return (float) Math.toDegrees(Math.atan2(r1[1], r1[0]));
    }

    public PointF midPoint(MotionEvent motionEvent, Matrix matrix) {
        PointF pointF = new PointF();
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{(motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f});
        pointF.set(fArr[0], fArr[1]);
        return pointF;
    }
}
