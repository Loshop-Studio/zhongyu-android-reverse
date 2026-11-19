package com.zykj.paint.draw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import com.zykj.paint.Actions;
import java.util.List;

/* loaded from: classes6.dex */
public class PolylineDrawer implements ISketchDraw {
    private static final String TAG = "PolylineDrawer";
    private static final float TOUCH_TOLERANCE = 4.0f;
    private Paint mPaint;
    private Path mPath = new Path();
    private boolean m_hasDrawn = false;

    /* renamed from: mX */
    private float f19849mX = 0.0f;

    /* renamed from: mY */
    private float f19850mY = 0.0f;

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
    public void touchDown(float f10, float f11) {
        this.mPath.moveTo(f10, f11);
        this.mPath.lineTo(f10, f11);
        this.f19849mX = f10;
        this.f19850mY = f11;
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void touchMove(float f10, float f11) {
        float fAbs = Math.abs(f10 - this.f19849mX);
        float fAbs2 = Math.abs(f11 - this.f19850mY);
        if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
            Path path = this.mPath;
            float f12 = this.f19849mX;
            float f13 = this.f19850mY;
            path.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            this.m_hasDrawn = true;
            this.f19849mX = f10;
            this.f19850mY = f11;
            this.mPath.lineTo(f10, f11);
        }
    }

    @Override // com.zykj.paint.draw.ISketchDraw
    public void touchUp(float f10, float f11) {
        this.mPath.lineTo(this.f19849mX, this.f19850mY);
        this.f19849mX = f10;
        this.f19850mY = f11;
    }

    public void draw(Canvas canvas, List<Actions.EzyPoint> list, boolean z10) {
        if (z10) {
            Log.e(TAG, "[第一个点]");
            Actions.EzyPoint ezyPoint = list.get(0);
            float x10 = (float) ezyPoint.getX();
            float y10 = (float) ezyPoint.getY();
            Path path = new Path();
            this.mPath = path;
            path.moveTo(x10, y10);
            this.f19849mX = x10;
            this.f19850mY = y10;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Actions.EzyPoint ezyPoint2 = list.get(i10);
            float x11 = (float) ezyPoint2.getX();
            float y11 = (float) ezyPoint2.getY();
            Path path2 = this.mPath;
            float f10 = this.f19849mX;
            float f11 = this.f19850mY;
            path2.quadTo(f10, f11, (x11 + f10) / 2.0f, (y11 + f11) / 2.0f);
            this.f19849mX = x11;
            this.f19850mY = y11;
        }
        canvas.drawPath(this.mPath, this.mPaint);
    }
}
