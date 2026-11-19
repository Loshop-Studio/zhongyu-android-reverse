package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class PwdTextView extends AppCompatTextView {
    private boolean mHasPassword;
    private Paint mPaint;
    private float mRadius;

    public PwdTextView(Context context) {
        this(context, null);
    }

    private void initPaint() {
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
        this.mPaint.setStyle(Paint.Style.FILL);
    }

    public void clearPassword() {
        this.mHasPassword = false;
        invalidate();
    }

    public void drawPassword(float f4) {
        this.mHasPassword = true;
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            this.mRadius = getWidth() >> 2;
        } else {
            this.mRadius = f4;
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mHasPassword) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.mRadius, this.mPaint);
        } else {
            super.onDraw(canvas);
        }
    }

    public PwdTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PwdTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initPaint();
    }
}
