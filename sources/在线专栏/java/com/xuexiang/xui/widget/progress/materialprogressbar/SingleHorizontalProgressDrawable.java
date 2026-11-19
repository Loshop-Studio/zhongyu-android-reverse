package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class SingleHorizontalProgressDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private boolean mShowBackground;

    public SingleHorizontalProgressDrawable(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseSingleHorizontalProgressDrawable
    protected void onDrawRect(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(level / 10000.0f, 1.0f, BaseSingleHorizontalProgressDrawable.RECT_BOUND.left, IGoodView.DEFAULT_TO_ALPHA);
        super.onDrawRect(canvas, paint);
        if (this.mShowBackground) {
            super.onDrawRect(canvas, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        invalidateSelf();
        return true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z3) {
        if (this.mShowBackground != z3) {
            this.mShowBackground = z3;
            invalidateSelf();
        }
    }
}
