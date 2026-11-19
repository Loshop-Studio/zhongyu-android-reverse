package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.paint.record.model.GraphSnapShot;

/* loaded from: classes3.dex */
public class PenControl extends BaseControl implements ISketchControl {
    private static final String TAG = "PenControl";
    private Paint m_paint = new Paint();
    private boolean m_hasDrawn = false;

    /* renamed from: mX */
    private float f8122mX = 0.0f;

    /* renamed from: mY */
    private float f8123mY = 0.0f;
    public Path m_path = new Path();

    public PenControl(int i, int i8) {
        this.m_paint.setAntiAlias(true);
        this.m_paint.setDither(true);
        this.m_paint.setColor(i8);
        this.m_paint.setStyle(Paint.Style.STROKE);
        this.m_paint.setStrokeJoin(Paint.Join.ROUND);
        this.m_paint.setStrokeCap(Paint.Cap.ROUND);
        this.m_paint.setStrokeWidth(i);
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void cleanAll() {
        this.m_path.reset();
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void draw(Canvas canvas) {
        if (canvas != null) {
            canvas.drawPath(this.m_path, this.m_paint);
        }
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public GraphSnapShot getGraphSnapShot() {
        return null;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public boolean hasDraw() {
        return this.m_hasDrawn;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchDown(MotionEvent motionEvent) {
        Log.e(TAG, "pen touchDown");
        float x3 = (int) motionEvent.getX();
        float y2 = (int) motionEvent.getY();
        this.m_path.moveTo(x3, y2);
        this.m_path.lineTo(x3, y2);
        this.f8122mX = x3;
        this.f8123mY = y2;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
        Log.e(TAG, "pen touchMove");
        int x3 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        Path path = this.m_path;
        float f = this.f8122mX;
        float f7 = this.f8123mY;
        float f8 = x3;
        float f9 = y2;
        path.quadTo(f, f7, (f8 + f) / 2.0f, (f9 + f7) / 2.0f);
        this.m_hasDrawn = true;
        this.f8122mX = f8;
        this.f8123mY = f9;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerDown(MotionEvent motionEvent) {
        Log.e(TAG, "pen touchPointerDown");
        motionEvent.getX();
        motionEvent.getY();
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchPointerUp(MotionEvent motionEvent) {
        Log.e(TAG, "pen touchPointerUp");
        motionEvent.getX();
        motionEvent.getY();
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchUp(MotionEvent motionEvent) {
        Log.e(TAG, "pen touchUp");
        int x3 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        this.m_path.lineTo(this.f8122mX, this.f8123mY);
        this.f8122mX = x3;
        this.f8123mY = y2;
    }

    public void draw(Canvas canvas, Paint paint) {
        if (canvas != null) {
            canvas.drawPath(this.m_path, paint);
        }
    }
}
