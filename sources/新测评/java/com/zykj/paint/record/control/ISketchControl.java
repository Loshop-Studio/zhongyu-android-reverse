package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.zykj.paint.record.model.GraphSnapShot;

/* loaded from: classes5.dex */
public interface ISketchControl {
    void cleanAll();

    void draw(Canvas canvas);

    GraphSnapShot getGraphSnapShot();

    boolean hasDraw();

    void touchDown(MotionEvent motionEvent);

    void touchMove(MotionEvent motionEvent);

    void touchPointerDown(MotionEvent motionEvent);

    void touchPointerUp(MotionEvent motionEvent);

    void touchUp(MotionEvent motionEvent);
}
