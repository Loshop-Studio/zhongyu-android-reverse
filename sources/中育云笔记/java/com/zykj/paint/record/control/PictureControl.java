package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import com.google.protobuf.Any;
import com.zykj.paint.Actions;
import com.zykj.paint.record.model.GraphSnapShot;
import com.zykj.paint.record.model.PictureSnapShot;

/* loaded from: classes6.dex */
public class PictureControl extends BaseControl implements ISketchControl {
    public static final int DRAG = 1;
    public static final int DRAW = 5;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final String TAG = "PictureControl";
    public static final int VARY = 3;
    public static final int ZOOM = 4;
    private double degree;
    private double downDegree;
    private Matrix mapMatrix;
    public int mode = 0;
    public PictureSnapShot pictureSnapShot;

    public PictureControl(GraphSnapShot graphSnapShot, Matrix matrix) {
        this.pictureSnapShot = (PictureSnapShot) graphSnapShot;
        this.mapMatrix = matrix;
    }

    private boolean circleCheck(GraphSnapShot graphSnapShot, float f10, float f11) {
        float[] bitmapPoints = getBitmapPoints(graphSnapShot);
        return ((int) Math.sqrt(Math.pow((double) (f10 - bitmapPoints[2]), 2.0d) + Math.pow((double) (f11 - bitmapPoints[3]), 2.0d))) < 40;
    }

    private void getActionMode() {
        this.actionMode = this.pictureSnapShot.getActionMode();
    }

    private boolean isTouchInGraph(float f10, float f11) {
        return pointCheck(this.pictureSnapShot, f10, f11);
    }

    private boolean pointCheck(GraphSnapShot graphSnapShot, float f10, float f11) {
        float[] bitmapPoints = getBitmapPoints(graphSnapShot);
        float f12 = bitmapPoints[0];
        float f13 = bitmapPoints[1];
        float f14 = bitmapPoints[2];
        float f15 = bitmapPoints[3];
        return (Math.sqrt(2.0d) + 2.0d) * ((double) ((float) Math.sqrt(Math.pow((double) (f12 - f14), 2.0d) + Math.pow((double) (f13 - f15), 2.0d)))) >= ((Math.sqrt(Math.pow((double) (f10 - f12), 2.0d) + Math.pow((double) (f11 - f13), 2.0d)) + Math.sqrt(Math.pow((double) (f10 - f14), 2.0d) + Math.pow((double) (f11 - f15), 2.0d))) + Math.sqrt(Math.pow((double) (f10 - bitmapPoints[4]), 2.0d) + Math.pow((double) (f11 - bitmapPoints[5]), 2.0d))) + Math.sqrt(Math.pow((double) (f10 - bitmapPoints[6]), 2.0d) + Math.pow((double) (f11 - bitmapPoints[7]), 2.0d));
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void cleanAll() {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void draw(Canvas canvas) {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public GraphSnapShot getGraphSnapShot() {
        return this.pictureSnapShot;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public boolean hasDraw() {
        return false;
    }

    @Override // com.zykj.paint.record.control.BaseControl
    public void tempDraw(Canvas canvas) {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchDown(MotionEvent motionEvent) {
        getActionMode();
        Log.e(TAG, "actionMode=" + this.actionMode);
        this.anchorX = motionEvent.getX();
        this.anchorY = motionEvent.getY();
        Matrix matrix = new Matrix();
        matrix.postConcat(this.pictureSnapShot.sketchMatrix);
        PictureSnapShot pictureSnapShot = this.pictureSnapShot;
        if (pictureSnapShot.isInGraphRect(pictureSnapShot.sketchBitmap, matrix, this.anchorX, this.anchorY)) {
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(this.pictureSnapShot.matrix);
            this.downMatrix.set(matrix2);
            this.mode = 1;
            Log.i(TAG, "[mode]---->>>DRAG");
        }
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
        getActionMode();
        motionEvent.getX();
        motionEvent.getY();
        int i10 = this.mode;
        if (i10 == 2) {
            this.moveMatrix.set(this.downMatrix);
            double d10 = -this.pictureSnapShot.exactCalculateDegree(this.anchorX, this.anchorY, motionEvent.getX(), motionEvent.getY());
            float[] fArr = this.pictureSnapShot.center;
            this.moveMatrix.postRotate((float) d10, fArr[0], fArr[1]);
            this.pictureSnapShot.matrix.set(this.moveMatrix);
            this.degree = this.downDegree + d10;
        } else if (i10 == 1) {
            this.moveMatrix.set(this.downMatrix);
            this.moveMatrix.postTranslate(motionEvent.getX() - this.anchorX, motionEvent.getY() - this.anchorY);
            this.pictureSnapShot.matrix.set(this.moveMatrix);
        } else if (i10 != 3 && i10 == 4) {
            this.moveMatrix.set(this.downMatrix);
            float rotation = getRotation(motionEvent) - this.oldRotation;
            Matrix matrix = this.moveMatrix;
            PointF pointF = this.midPoint;
            matrix.postRotate(rotation, pointF.x, pointF.y);
            float distance = getDistance(motionEvent) / this.oldDistance;
            Matrix matrix2 = this.moveMatrix;
            PointF pointF2 = this.midPoint;
            matrix2.postScale(distance, distance, pointF2.x, pointF2.y);
            PointF pointFMidPoint = midPoint(motionEvent);
            Matrix matrix3 = this.moveMatrix;
            float f10 = pointFMidPoint.x;
            PointF pointF3 = this.midPoint;
            matrix3.postTranslate(f10 - pointF3.x, pointFMidPoint.y - pointF3.y);
            this.pictureSnapShot.matrix.set(this.moveMatrix);
        }
        Actions.EzyMatrixData.Builder builderNewBuilder = Actions.EzyMatrixData.newBuilder();
        float[] fArr2 = new float[9];
        Matrix matrix4 = new Matrix();
        matrix4.postConcat(getGraphSnapShot().sketchMatrix);
        matrix4.postConcat(getGraphSnapShot().matrix);
        matrix4.getValues(fArr2);
        for (int i11 = 0; i11 < 9; i11++) {
            builderNewBuilder.addValues(fArr2[i11]);
        }
        Actions.EzyAction.Builder builderNewBuilder2 = Actions.EzyAction.newBuilder();
        builderNewBuilder2.setGraphId(getGraphSnapShot().graphId);
        builderNewBuilder2.setData(Any.pack(builderNewBuilder.build()));
        getGraphSnapShot().sketchView.addMatrixAction(builderNewBuilder2);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerDown(MotionEvent motionEvent) {
        getActionMode();
        Log.e(TAG, "[touchPointerDown]actionMode=" + this.actionMode);
        Matrix matrix = new Matrix();
        matrix.postConcat(this.pictureSnapShot.sketchMatrix);
        PictureSnapShot pictureSnapShot = this.pictureSnapShot;
        if (pictureSnapShot.isInGraphRect(pictureSnapShot.sketchBitmap, matrix, motionEvent.getX(), motionEvent.getY())) {
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(this.pictureSnapShot.matrix);
            this.downMatrix.set(matrix2);
            this.mode = 4;
            Log.i(TAG, "[mode]---->>>ZOOM");
            this.oldDistance = getDistance(motionEvent);
            this.oldRotation = getRotation(motionEvent);
            this.midPoint = midPoint(motionEvent);
        }
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerUp(MotionEvent motionEvent) {
        getActionMode();
        this.pictureSnapShot.updateMatrix(null);
        this.mode = 0;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchUp(MotionEvent motionEvent) {
        getActionMode();
        this.pictureSnapShot.updateMatrix(null);
        this.mode = 0;
    }
}
