package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class CircularProgressBackgroundDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    CircularProgressBackgroundDrawable() {
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShow;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseSingleCircularProgressDrawable
    protected void onDrawRing(Canvas canvas, Paint paint) {
        drawRing(canvas, paint, IGoodView.DEFAULT_TO_ALPHA, 360.0f);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z3) {
        if (this.mShow != z3) {
            this.mShow = z3;
            invalidateSelf();
        }
    }
}
