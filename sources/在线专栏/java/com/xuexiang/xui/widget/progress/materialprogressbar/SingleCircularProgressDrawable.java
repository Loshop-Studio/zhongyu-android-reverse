package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    SingleCircularProgressDrawable(int i4) {
        if (i4 == 0) {
            this.mStartAngleMax = 0.0f;
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.mStartAngleMax = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseSingleCircularProgressDrawable
    protected void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f4 = level / 10000.0f;
        float f5 = this.mStartAngleMax * f4;
        float f6 = f4 * 360.0f;
        drawRing(canvas, paint, f5, f6);
        if (this.mShowBackground) {
            drawRing(canvas, paint, f5, f6);
        }
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
