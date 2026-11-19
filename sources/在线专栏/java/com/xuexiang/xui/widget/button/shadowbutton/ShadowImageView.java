package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ShadowImageView extends AppCompatImageView {
    private int mHeight;
    private Paint mPaint;
    private int mPaintAlpha;
    private int mPressedColor;
    private int mRadius;
    private RectF mRectF;
    private int mShapeType;
    private int mWidth;

    public ShadowImageView(Context context) {
        super(context);
        this.mPaintAlpha = 48;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ShadowButton);
        this.mPressedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowButton_sb_color_pressed, getResources().getColor(C2042R.color.default_shadow_button_color_pressed));
        this.mPaintAlpha = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShadowButton_sb_alpha_pressed, this.mPaintAlpha);
        this.mShapeType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ShadowButton_sb_shape_type, 1);
        this.mRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(C2042R.dimen.default_shadow_button_radius));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(this.mPressedColor);
        setWillNotDraw(false);
        this.mPaint.setAlpha(0);
        this.mPaint.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        setClickable(true);
    }

    public int getPressedColor() {
        return this.mPressedColor;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        if (this.mShapeType == 0) {
            int i4 = this.mWidth;
            canvas.drawCircle(i4 / 2.0f, this.mHeight / 2.0f, i4 / 2.1038f, paint);
        } else {
            RectF rectF = this.mRectF;
            int i5 = this.mRadius;
            canvas.drawRoundRect(rectF, i5, i5, paint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mWidth = i4;
        this.mHeight = i5;
        this.mRectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mWidth, this.mHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPaint.setAlpha(this.mPaintAlpha);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.mPaint.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i4) {
        this.mPaint.setColor(this.mPressedColor);
        invalidate();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaintAlpha = 48;
        init(context, attributeSet);
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPaintAlpha = 48;
        init(context, attributeSet);
    }
}
