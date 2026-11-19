package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.paint.record.model.GraphSnapShot;
import com.zykj.paint.record.model.RulerSnapShot;

/* loaded from: classes.dex */
public class RulerControl extends BaseControl implements ISketchControl {
    public static final int DRAG = 1;
    public static final int DRAW = 5;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final String TAG = "RulerControl";
    public static final int VARY = 3;
    public static final int ZOOM = 4;
    private Path mPath = new Path();
    protected int mode = 0;
    private RulerSnapShot rulerSnapShot;

    public RulerControl(GraphSnapShot graphSnapShot) {
        this.rulerSnapShot = (RulerSnapShot) graphSnapShot;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void cleanAll() {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void draw(Canvas canvas) {
        if (this.mode == 5) {
            canvas.drawPath(this.mPath, this.rulerSnapShot.paint);
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
        this.downMatrix.set(this.rulerSnapShot.matrix);
        if (this.rulerSnapShot.isInDrawGraphRect(this.anchorX, this.anchorY)) {
            this.mode = 5;
            this.mPath = new Path();
            float[] fArrMapPoints = this.rulerSnapShot.mapPoints(this.rulerSnapShot.invertPoints(motionEvent.getX(), motionEvent.getY())[0], 0.0f);
            this.mPath.moveTo(fArrMapPoints[0], fArrMapPoints[1]);
        } else if (this.rulerSnapShot.isInGraphRect(this.anchorX, this.anchorY)) {
            this.mode = 1;
        }
        Log.e(TAG, "touchDown mode--->" + this.mode);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
        int i9 = this.mode;
        if (i9 == 2) {
            this.moveMatrix.set(this.downMatrix);
            double d10 = -this.rulerSnapShot.exactCalculateDegree(this.anchorX, this.anchorY, motionEvent.getX(), motionEvent.getY());
            PointF pointF = this.midPoint;
            this.moveMatrix.postRotate((float) d10, pointF.x, pointF.y);
            this.rulerSnapShot.matrix.set(this.moveMatrix);
            return;
        }
        if (i9 == 1) {
            this.moveMatrix.set(this.downMatrix);
            this.moveMatrix.postTranslate(motionEvent.getX() - this.anchorX, motionEvent.getY() - this.anchorY);
            this.rulerSnapShot.matrix.set(this.moveMatrix);
            return;
        }
        if (i9 == 3) {
            return;
        }
        if (i9 != 4) {
            if (i9 == 5) {
                float[] fArrMapPoints = this.rulerSnapShot.mapPoints(this.rulerSnapShot.invertPoints(motionEvent.getX(), motionEvent.getY())[0], 0.0f);
                this.mPath.lineTo(fArrMapPoints[0], fArrMapPoints[1]);
                return;
            }
            return;
        }
        this.moveMatrix.set(this.downMatrix);
        float rotation = getRotation(motionEvent) - this.oldRotation;
        Matrix matrix = this.moveMatrix;
        PointF pointF2 = this.midPoint;
        matrix.postRotate(rotation, pointF2.x, pointF2.y);
        this.rulerSnapShot.setScaleMatrix(getDistance(motionEvent) / this.oldDistance, rotation);
        this.rulerSnapShot.matrix.set(this.moveMatrix);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerDown(MotionEvent motionEvent) {
        if (this.rulerSnapShot.isInGraphRect(this.anchorX, this.anchorY)) {
            this.downMatrix.set(this.rulerSnapShot.matrix);
            this.rulerSnapShot.setDownScale();
            this.mode = 4;
        }
        this.oldDistance = getDistance(motionEvent);
        this.oldRotation = getRotation(motionEvent);
        this.midPoint = midPoint(motionEvent);
        Log.e(TAG, "touchPointerDown mode--->" + this.mode);
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
