package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import com.google.protobuf.Any;
import com.zykj.paint.Actions;
import com.zykj.paint.record.model.GraphSnapShot;
import com.zykj.paint.record.model.MapSnapShot;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class MapControl extends BaseControl implements ISketchControl {
    public static final int DRAG = 1;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final String TAG = "MapControl";
    public static final int VARY = 3;
    public static final int ZOOM = 4;
    private double degree;
    private double downDegree;
    private boolean isMultiFinger;
    private MapSnapShot mapSnapShot;
    public int mode = 0;
    private final ArrayList<ISketchControl> sketchControls;

    public MapControl(MapSnapShot mapSnapShot, ArrayList<ISketchControl> arrayList) {
        this.mapSnapShot = mapSnapShot;
        this.sketchControls = arrayList;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void cleanAll() {
        this.mapSnapShot.clear();
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void draw(Canvas canvas) {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public GraphSnapShot getGraphSnapShot() {
        return this.mapSnapShot;
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
        this.actionMode = this.mapSnapShot.getActionMode();
        this.anchorX = motionEvent.getX();
        this.anchorY = motionEvent.getY();
        this.downMatrix.set(this.mapSnapShot.matrix);
        this.mode = 1;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
        this.actionMode = this.mapSnapShot.getActionMode();
        Log.i(TAG, "touchMove");
        Log.i(TAG, "actionMode=" + this.actionMode);
        int i = this.mode;
        if (i == 1) {
            this.moveMatrix.set(this.downMatrix);
            this.moveMatrix.postTranslate(motionEvent.getX() - this.anchorX, motionEvent.getY() - this.anchorY);
            this.mapSnapShot.matrix.set(this.moveMatrix);
        } else if (i != 3 && i == 4) {
            this.moveMatrix.set(this.downMatrix);
            float distance = getDistance(motionEvent) / this.oldDistance;
            Matrix matrix = this.moveMatrix;
            PointF pointF = this.midPoint;
            matrix.postScale(distance, distance, pointF.x, pointF.y);
            PointF pointFMidPoint = midPoint(motionEvent);
            Matrix matrix2 = this.moveMatrix;
            float f = pointFMidPoint.x;
            PointF pointF2 = this.midPoint;
            matrix2.postTranslate(f - pointF2.x, pointFMidPoint.y - pointF2.y);
            this.mapSnapShot.matrix.set(this.moveMatrix);
        }
        Actions.EzyMatrixData.Builder builderNewBuilder = Actions.EzyMatrixData.newBuilder();
        float[] fArr = new float[9];
        Matrix matrix3 = new Matrix();
        matrix3.postConcat(getGraphSnapShot().matrix);
        matrix3.getValues(fArr);
        for (int i8 = 0; i8 < 9; i8++) {
            builderNewBuilder.addValues(fArr[i8]);
        }
        Actions.EzyAction.Builder builderNewBuilder2 = Actions.EzyAction.newBuilder();
        builderNewBuilder2.setGraphId(getGraphSnapShot().graphId);
        builderNewBuilder2.setData(Any.pack(builderNewBuilder.build()));
        getGraphSnapShot().sketchView.addMatrixAction(builderNewBuilder2);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerDown(MotionEvent motionEvent) {
        this.actionMode = this.mapSnapShot.getActionMode();
        this.anchorX = motionEvent.getX();
        this.anchorY = motionEvent.getY();
        this.downMatrix.set(this.mapSnapShot.matrix);
        this.mode = 4;
        this.oldDistance = getDistance(motionEvent);
        this.oldRotation = getRotation(motionEvent);
        this.midPoint = midPoint(motionEvent);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerUp(MotionEvent motionEvent) {
        this.actionMode = this.mapSnapShot.getActionMode();
        Log.e(TAG, "[touchPointerUp]-----actionMode=" + this.actionMode);
        Actions.EzyMatrixData.Builder builderNewBuilder = Actions.EzyMatrixData.newBuilder();
        float[] fArr = new float[9];
        Matrix matrix = new Matrix();
        matrix.postConcat(getGraphSnapShot().matrix);
        matrix.getValues(fArr);
        for (int i = 0; i < 9; i++) {
            builderNewBuilder.addValues(fArr[i]);
        }
        Actions.EzyAction.Builder builderNewBuilder2 = Actions.EzyAction.newBuilder();
        builderNewBuilder2.setGraphId(-1);
        builderNewBuilder2.setData(Any.pack(builderNewBuilder.build()));
        getGraphSnapShot().sketchView.addMatrixAction(builderNewBuilder2);
        this.mode = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mapSnapShot.updateMatrix(this.sketchControls);
        getGraphSnapShot().sketchView.updateSnapshot();
        Log.e(TAG, "[touchPointerUp]绘制持续时间------->>>>[" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms]");
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchUp(MotionEvent motionEvent) {
        this.actionMode = this.mapSnapShot.getActionMode();
        Log.e(TAG, "-----actionMode=" + this.actionMode);
        Actions.EzyMatrixData.Builder builderNewBuilder = Actions.EzyMatrixData.newBuilder();
        float[] fArr = new float[9];
        Matrix matrix = new Matrix();
        matrix.postConcat(getGraphSnapShot().matrix);
        matrix.getValues(fArr);
        for (int i = 0; i < 9; i++) {
            builderNewBuilder.addValues(fArr[i]);
        }
        Actions.EzyAction.Builder builderNewBuilder2 = Actions.EzyAction.newBuilder();
        builderNewBuilder2.setGraphId(-1);
        builderNewBuilder2.setData(Any.pack(builderNewBuilder.build()));
        getGraphSnapShot().sketchView.addMatrixAction(builderNewBuilder2);
        this.mode = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mapSnapShot.updateMatrix(this.sketchControls);
        Log.e(TAG, "更新图片消耗------->>>>[" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms]");
        getGraphSnapShot().sketchView.updateSnapshot();
        Log.e(TAG, "绘制持续时间------->>>>[" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms]");
    }
}
