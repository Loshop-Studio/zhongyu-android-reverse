package com.xuexiang.xui.widget.guidview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class GuideImageView extends AppCompatImageView {
    private static final int DEFAULT_ANIM_COUNTER = 20;
    private int mAnimCounter;
    private double mAnimMoveFactor;
    private boolean mAnimationEnabled;
    private int mBackgroundColor;
    private Paint mBackgroundPaint;
    private Bitmap mBitmap;
    private Calculator mCalculator;
    private Paint mCircleBorderPaint;
    private Paint mErasePaint;
    private int mFocusAnimationMaxValue;
    private int mFocusAnimationStep;
    private int mFocusBorderSize;
    private Path mPath;
    private int mRoundRectRadius;
    private int mStep;
    private RectF rectF;

    public GuideImageView(Context context) {
        super(context);
        this.mBackgroundColor = 0;
        this.mRoundRectRadius = 20;
        this.mStep = 1;
        this.mAnimMoveFactor = 1.0d;
        this.mAnimationEnabled = true;
        init();
    }

    private void drawCircle(Canvas canvas) {
        canvas.drawCircle(this.mCalculator.getCircleCenterX(), this.mCalculator.getCircleCenterY(), this.mCalculator.circleRadius(this.mAnimCounter, this.mAnimMoveFactor), this.mErasePaint);
        if (this.mFocusBorderSize > 0) {
            this.mPath.reset();
            this.mPath.moveTo(this.mCalculator.getCircleCenterX(), this.mCalculator.getCircleCenterY());
            this.mPath.addCircle(this.mCalculator.getCircleCenterX(), this.mCalculator.getCircleCenterY(), this.mCalculator.circleRadius(this.mAnimCounter, this.mAnimMoveFactor), Path.Direction.CW);
            canvas.drawPath(this.mPath, this.mCircleBorderPaint);
        }
    }

    private void drawRoundedRectangle(Canvas canvas) {
        this.rectF.set(this.mCalculator.roundRectLeft(this.mAnimCounter, this.mAnimMoveFactor), this.mCalculator.roundRectTop(this.mAnimCounter, this.mAnimMoveFactor), this.mCalculator.roundRectRight(this.mAnimCounter, this.mAnimMoveFactor), this.mCalculator.roundRectBottom(this.mAnimCounter, this.mAnimMoveFactor));
        RectF rectF = this.rectF;
        int i4 = this.mRoundRectRadius;
        canvas.drawRoundRect(rectF, i4, i4, this.mErasePaint);
        if (this.mFocusBorderSize > 0) {
            this.mPath.reset();
            this.mPath.moveTo(this.mCalculator.getCircleCenterX(), this.mCalculator.getCircleCenterY());
            Path path = this.mPath;
            RectF rectF2 = this.rectF;
            int i5 = this.mRoundRectRadius;
            path.addRoundRect(rectF2, i5, i5, Path.Direction.CW);
            canvas.drawPath(this.mPath, this.mCircleBorderPaint);
        }
    }

    private void init() {
        setLayerType(2, null);
        setWillNotDraw(false);
        setBackgroundColor(0);
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mBackgroundPaint.setAlpha(255);
        Paint paint2 = new Paint();
        this.mErasePaint = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mErasePaint.setAlpha(255);
        this.mErasePaint.setAntiAlias(true);
        this.mPath = new Path();
        Paint paint3 = new Paint();
        this.mCircleBorderPaint = paint3;
        paint3.setAntiAlias(true);
        this.mCircleBorderPaint.setColor(0);
        this.mCircleBorderPaint.setStrokeWidth(this.mFocusBorderSize);
        this.mCircleBorderPaint.setStyle(Paint.Style.STROKE);
        this.rectF = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mBitmap == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.mBitmap = bitmapCreateBitmap;
            bitmapCreateBitmap.eraseColor(this.mBackgroundColor);
        }
        canvas.drawBitmap(this.mBitmap, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mBackgroundPaint);
        if (this.mCalculator.hasFocus()) {
            if (this.mCalculator.getFocusShape().equals(FocusShape.CIRCLE)) {
                drawCircle(canvas);
            } else {
                drawRoundedRectangle(canvas);
            }
            if (this.mAnimationEnabled) {
                int i4 = this.mAnimCounter;
                if (i4 == this.mFocusAnimationMaxValue) {
                    this.mStep = this.mFocusAnimationStep * (-1);
                } else if (i4 == 0) {
                    this.mStep = this.mFocusAnimationStep;
                }
                this.mAnimCounter = i4 + this.mStep;
                postInvalidate();
            }
        }
    }

    public void setAnimationEnabled(boolean z3) {
        this.mAnimationEnabled = z3;
        this.mAnimCounter = z3 ? 20 : 0;
    }

    public void setBorderParameters(int i4, int i5) {
        this.mFocusBorderSize = i5;
        this.mCircleBorderPaint.setColor(i4);
        this.mCircleBorderPaint.setStrokeWidth(i5);
    }

    public void setFocusAnimationParameters(int i4, int i5) {
        this.mFocusAnimationMaxValue = i4;
        this.mFocusAnimationStep = i5;
    }

    public void setParameters(int i4, Calculator calculator) {
        this.mBackgroundColor = i4;
        this.mAnimMoveFactor = 1.0d;
        this.mCalculator = calculator;
    }

    public void setRoundRectRadius(int i4) {
        this.mRoundRectRadius = i4;
    }

    public GuideImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBackgroundColor = 0;
        this.mRoundRectRadius = 20;
        this.mStep = 1;
        this.mAnimMoveFactor = 1.0d;
        this.mAnimationEnabled = true;
        init();
    }

    public GuideImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mBackgroundColor = 0;
        this.mRoundRectRadius = 20;
        this.mStep = 1;
        this.mAnimMoveFactor = 1.0d;
        this.mAnimationEnabled = true;
        init();
    }
}
