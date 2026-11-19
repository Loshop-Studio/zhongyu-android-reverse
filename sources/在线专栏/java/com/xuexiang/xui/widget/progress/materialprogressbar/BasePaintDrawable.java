package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    BasePaintDrawable() {
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseDrawable
    protected final void onDraw(Canvas canvas, int i4, int i5) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i4, i5, this.mPaint);
    }

    protected abstract void onDraw(Canvas canvas, int i4, int i5, Paint paint);

    protected abstract void onPreparePaint(Paint paint);
}
