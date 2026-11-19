package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class BaseShadowButton extends AppCompatButton {
    public static final int SHAPE_TYPE_RECTANGLE = 1;
    public static final int SHAPE_TYPE_ROUND = 0;
    protected Paint mBackgroundPaint;
    protected int mHeight;
    protected int mRadius;
    protected RectF mRectF;
    protected int mShapeType;
    protected int mWidth;

    public BaseShadowButton(Context context) {
        super(context);
        init(context, null);
    }

    protected void eraseOriginalBackgroundColor(int i4) {
        if (i4 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.mRadius;
    }

    public int getShapeType() {
        return this.mShapeType;
    }

    protected void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ShadowButton);
        this.mShapeType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ShadowButton_sb_shape_type, 1);
        this.mRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(C2042R.dimen.default_shadow_button_radius));
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowButton_sb_color_unpressed, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mBackgroundPaint.setAlpha(Color.alpha(color));
        this.mBackgroundPaint.setColor(color);
        this.mBackgroundPaint.setAntiAlias(true);
        setWillNotDraw(false);
        setDrawingCacheEnabled(true);
        setClickable(true);
        eraseOriginalBackgroundColor(color);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint = this.mBackgroundPaint;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.mShapeType == 0) {
            int i4 = this.mWidth;
            canvas.drawCircle(i4 / 2.0f, this.mHeight / 2.0f, i4 / 2.0f, paint);
        } else {
            RectF rectF = this.mRectF;
            int i5 = this.mRadius;
            canvas.drawRoundRect(rectF, i5, i5, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mWidth = i4;
        this.mHeight = i5;
        this.mRectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mWidth, this.mHeight);
    }

    public void setRadius(int i4) {
        this.mRadius = i4;
        invalidate();
    }

    public void setShapeType(int i4) {
        this.mShapeType = i4;
        invalidate();
    }

    public void setUnpressedColor(int i4) {
        this.mBackgroundPaint.setAlpha(Color.alpha(i4));
        this.mBackgroundPaint.setColor(i4);
        eraseOriginalBackgroundColor(i4);
        invalidate();
    }

    public BaseShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public BaseShadowButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context, attributeSet);
    }
}
