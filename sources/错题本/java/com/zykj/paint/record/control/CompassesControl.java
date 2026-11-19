package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.paint.record.model.CompassSnapShot;
import com.zykj.paint.record.model.GraphSnapShot;

/* loaded from: classes3.dex */
public class CompassesControl extends BaseControl implements ISketchControl {
    public static final int DRAG = 1;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final String TAG = "CompassesControl";
    public static final int VARY = 3;
    public static final int ZOOM = 4;
    private CompassSnapShot compassSnapShot;
    private double degree;
    private double downDegree;
    protected int mode = 0;

    public CompassesControl(GraphSnapShot graphSnapShot) {
        this.compassSnapShot = (CompassSnapShot) graphSnapShot;
    }

    private boolean circleCheck(GraphSnapShot graphSnapShot, float f, float f7) {
        float[] bitmapPoints = getBitmapPoints(graphSnapShot);
        return ((int) Math.sqrt(Math.pow((double) (f7 - bitmapPoints[3]), 2.0d) + Math.pow((double) (f - bitmapPoints[2]), 2.0d))) < 40;
    }

    private boolean isTouchInGraph(float f, float f7) {
        return pointCheck(this.compassSnapShot, f, f7);
    }

    private boolean pointCheck(GraphSnapShot graphSnapShot, float f, float f7) {
        float[] bitmapPoints = getBitmapPoints(graphSnapShot);
        float f8 = bitmapPoints[0];
        float f9 = bitmapPoints[1];
        float f10 = bitmapPoints[2];
        float f11 = bitmapPoints[3];
        float f12 = bitmapPoints[4];
        float f13 = bitmapPoints[5];
        float f14 = bitmapPoints[6];
        float f15 = bitmapPoints[7];
        return (Math.sqrt(2.0d) + 2.0d) * ((double) ((float) Math.sqrt(Math.pow((double) (f9 - f11), 2.0d) + Math.pow((double) (f8 - f10), 2.0d)))) >= Math.sqrt(Math.pow((double) (f7 - f15), 2.0d) + Math.pow((double) (f - f14), 2.0d)) + (Math.sqrt(Math.pow((double) (f7 - f13), 2.0d) + Math.pow((double) (f - f12), 2.0d)) + (Math.sqrt(Math.pow((double) (f7 - f11), 2.0d) + Math.pow((double) (f - f10), 2.0d)) + Math.sqrt(Math.pow((double) (f7 - f9), 2.0d) + Math.pow((double) (f - f8), 2.0d))));
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void cleanAll() {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void draw(Canvas canvas) {
        if (this.mode == 2) {
            Log.e(TAG, "downDegree,degree--->[" + this.downDegree + "," + this.degree + "]");
            CompassSnapShot compassSnapShot = this.compassSnapShot;
            float[] fArr = compassSnapShot.center;
            float f = fArr[0];
            float f7 = compassSnapShot.radius;
            float f8 = fArr[1];
            canvas.drawArc(f - f7, f8 - f7, f + f7, f8 + f7, (float) this.downDegree, (float) this.degree, false, compassSnapShot.paint);
        }
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public GraphSnapShot getGraphSnapShot() {
        return null;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public boolean hasDraw() {
        return false;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchDown(MotionEvent motionEvent) {
        this.anchorX = motionEvent.getX();
        this.anchorY = motionEvent.getY();
        this.compassSnapShot.setDownMatrix();
        this.downMatrix.set(this.compassSnapShot.matrix);
        if (this.compassSnapShot.isInGraphRect(this.anchorX, this.anchorY)) {
            this.mode = this.compassSnapShot.getCompassMode(this.anchorX, this.anchorY);
        }
        if (this.mode == 2) {
            this.downDegree = this.degree;
        }
        Log.e(TAG, "mode--->" + this.mode);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
        int i = this.mode;
        if (i == 2) {
            this.moveMatrix.set(this.downMatrix);
            double d9 = -this.compassSnapShot.exactCalculateDegree(this.anchorX, this.anchorY, motionEvent.getX(), motionEvent.getY());
            float[] fArr = this.compassSnapShot.center;
            this.moveMatrix.postRotate((float) d9, fArr[0], fArr[1]);
            this.compassSnapShot.matrix.set(this.moveMatrix);
            this.degree = this.downDegree + d9;
            return;
        }
        if (i == 1) {
            this.moveMatrix.set(this.downMatrix);
            this.moveMatrix.postTranslate(motionEvent.getX() - this.anchorX, motionEvent.getY() - this.anchorY);
            this.compassSnapShot.matrix.set(this.moveMatrix);
        } else {
            if (i == 3) {
                this.compassSnapShot.onGraphChange(this.anchorX, this.anchorY, motionEvent.getX(), motionEvent.getY());
                return;
            }
            if (i == 4) {
                this.moveMatrix.set(this.downMatrix);
                float distance = getDistance(motionEvent) / this.oldDistance;
                Matrix matrix = this.moveMatrix;
                PointF pointF = this.midPoint;
                matrix.postScale(distance, distance, pointF.x, pointF.y);
                this.compassSnapShot.matrix.set(this.moveMatrix);
            }
        }
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerDown(MotionEvent motionEvent) {
        this.compassSnapShot.setDownMatrix();
        if (this.compassSnapShot.isInGraphRect(this.anchorX, this.anchorY)) {
            this.downMatrix.set(this.compassSnapShot.matrix);
            this.mode = 4;
        }
        this.oldDistance = getDistance(motionEvent);
        this.oldRotation = getRotation(motionEvent);
        this.midPoint = midPoint(motionEvent);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerUp(MotionEvent motionEvent) {
        this.mode = 0;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchUp(MotionEvent motionEvent) {
        this.mode = 0;
    }
}
