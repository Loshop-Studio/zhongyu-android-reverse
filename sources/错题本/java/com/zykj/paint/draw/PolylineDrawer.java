package com.zykj.paint.draw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import com.zykj.paint.Actions;
import java.util.List;

/* loaded from: classes3.dex */
public class PolylineDrawer implements ISketchDraw {
    private static final String TAG = "PolylineDrawer";
    private static final float TOUCH_TOLERANCE = 4.0f;
    private Paint mPaint;
    private Path mPath = new Path();
    private boolean m_hasDrawn = false;

    /* renamed from: mX */
    private float f8120mX = 0.0f;

    /* renamed from: mY */
    private float f8121mY = 0.0f;

    public PolylineDrawer(Paint paint) {
        this.mPaint = paint;
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void cleanAll() {
        this.mPath.reset();
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void draw(Canvas canvas) {
        if (canvas != null) {
            canvas.drawPath(this.mPath, this.mPaint);
        }
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public boolean hasDraw() {
        return this.m_hasDrawn;
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void touchDown(float f, float f7) {
        this.mPath.moveTo(f, f7);
        this.mPath.lineTo(f, f7);
        this.f8120mX = f;
        this.f8121mY = f7;
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void touchMove(float f, float f7) {
        float fAbs = Math.abs(f - this.f8120mX);
        float fAbs2 = Math.abs(f7 - this.f8121mY);
        if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
            Path path = this.mPath;
            float f8 = this.f8120mX;
            float f9 = this.f8121mY;
            path.quadTo(f8, f9, (f + f8) / 2.0f, (f7 + f9) / 2.0f);
            this.m_hasDrawn = true;
            this.f8120mX = f;
            this.f8121mY = f7;
            this.mPath.lineTo(f, f7);
        }
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void touchUp(float f, float f7) {
        this.mPath.lineTo(this.f8120mX, this.f8121mY);
        this.f8120mX = f;
        this.f8121mY = f7;
    }

    public void draw(Canvas canvas, List<Actions.EzyPoint> list, boolean z8) {
        if (z8) {
            Log.e(TAG, "[第一个点]");
            Actions.EzyPoint ezyPoint = list.get(0);
            float x3 = (float) ezyPoint.getX();
            float y2 = (float) ezyPoint.getY();
            Path path = new Path();
            this.mPath = path;
            path.moveTo(x3, y2);
            this.f8120mX = x3;
            this.f8121mY = y2;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Actions.EzyPoint ezyPoint2 = list.get(i);
            float x8 = (float) ezyPoint2.getX();
            float y3 = (float) ezyPoint2.getY();
            Path path2 = this.mPath;
            float f = this.f8120mX;
            float f7 = this.f8121mY;
            path2.quadTo(f, f7, (x8 + f) / 2.0f, (y3 + f7) / 2.0f);
            this.f8120mX = x8;
            this.f8121mY = y3;
        }
        canvas.drawPath(this.mPath, this.mPaint);
    }
}
