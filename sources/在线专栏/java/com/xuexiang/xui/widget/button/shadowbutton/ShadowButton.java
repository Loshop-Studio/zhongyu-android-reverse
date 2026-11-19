package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class ShadowButton extends BaseShadowButton {
    private int COVER_ALPHA;
    private int mPressedColor;
    private Paint mPressedPaint;

    public ShadowButton(Context context) {
        super(context);
        this.COVER_ALPHA = 48;
    }

    public int getPressedColor() {
        return this.mPressedColor;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton
    protected void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ShadowButton);
        this.COVER_ALPHA = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShadowButton_sb_alpha_pressed, this.COVER_ALPHA);
        this.mPressedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowButton_sb_color_pressed, getResources().getColor(C2042R.color.default_shadow_button_color_pressed));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mPressedPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPressedPaint.setColor(this.mPressedColor);
        this.mPressedPaint.setAlpha(0);
        this.mPressedPaint.setAntiAlias(true);
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mShapeType == 0) {
            int i4 = this.mWidth;
            canvas.drawCircle(i4 / 2.0f, this.mHeight / 2.0f, i4 / 2.1038f, this.mPressedPaint);
        } else {
            RectF rectF = this.mRectF;
            int i5 = this.mRadius;
            canvas.drawRoundRect(rectF, i5, i5, this.mPressedPaint);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPressedPaint.setAlpha(this.COVER_ALPHA);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.mPressedPaint.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i4) {
        this.mPressedPaint.setColor(this.mPressedColor);
        invalidate();
    }

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.COVER_ALPHA = 48;
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.COVER_ALPHA = 48;
    }
}
