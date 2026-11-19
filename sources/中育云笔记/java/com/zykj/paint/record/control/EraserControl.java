package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.zykj.paint.SketchSyncView;
import com.zykj.paint.record.model.GraphSnapShot;

/* loaded from: classes6.dex */
public class EraserControl extends BaseControl implements ISketchControl {
    private SketchSyncView sketchSyncView;

    public EraserControl(SketchSyncView sketchSyncView) {
        this.sketchSyncView = sketchSyncView;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void cleanAll() {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void draw(Canvas canvas) {
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
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerDown(MotionEvent motionEvent) {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerUp(MotionEvent motionEvent) {
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchUp(MotionEvent motionEvent) {
    }
}
