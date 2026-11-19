package com.zykj.paint.record.control;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.paint.record.model.GraphSnapShot;

/* loaded from: classes5.dex */
public class PenControl extends BaseControl implements ISketchControl {
    private static final String TAG = "PenControl";
    private Paint m_paint = new Paint();
    private boolean m_hasDrawn = false;

    /* renamed from: mX */
    private float f10711mX = 0.0f;

    /* renamed from: mY */
    private float f10712mY = 0.0f;
    public Path m_path = new Path();

    public PenControl(int i10, int i11) {
        this.m_paint.setAntiAlias(true);
        this.m_paint.setDither(true);
        this.m_paint.setColor(i11);
        this.m_paint.setStyle(Paint.Style.STROKE);
        this.m_paint.setStrokeJoin(Paint.Join.ROUND);
        this.m_paint.setStrokeCap(Paint.Cap.ROUND);
        this.m_paint.setStrokeWidth(i10);
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
        float x9 = (int) motionEvent.getX();
        float y9 = (int) motionEvent.getY();
        this.m_path.moveTo(x9, y9);
        this.m_path.lineTo(x9, y9);
        this.f10711mX = x9;
        this.f10712mY = y9;
    }

    @Override // com.zykj.paint.record.control.ISketchControl
    public void touchMove(MotionEvent motionEvent) {
        Log.e(TAG, "pen touchMove");
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        Path path = this.m_path;
        float f10 = this.f10711mX;
        float f11 = this.f10712mY;
        float f12 = x9;
        float f13 = y9;
        path.quadTo(f10, f11, (f12 + f10) / 2.0f, (f13 + f11) / 2.0f);
        this.m_hasDrawn = true;
        this.f10711mX = f12;
        this.f10712mY = f13;
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
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        this.m_path.lineTo(this.f10711mX, this.f10712mY);
        this.f10711mX = x9;
        this.f10712mY = y9;
    }

    public void draw(Canvas canvas, Paint paint) {
        if (canvas != null) {
            canvas.drawPath(this.m_path, paint);
        }
    }
}
