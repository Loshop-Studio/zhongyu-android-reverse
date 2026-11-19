package com.xuexiang.xui.widget.button.shinebutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.EasingInterpolator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import java.util.Random;

/* loaded from: classes.dex */
public class ShineView extends View {
    private static final long FRAME_REFRESH_DELAY = 25;
    private static int[] sColorRandom = new int[10];
    private boolean mAllowRandomColor;
    private long mAnimDuration;
    private int mBigShineColor;
    private int mBtnHeight;
    private int mBtnWidth;
    private int mCenterAnimX;
    private int mCenterAnimY;
    private long mClickAnimDuration;
    private ValueAnimator mClickAnimator;
    private float mClickValue;
    private int mColorCount;
    private float mDistanceOffset;
    private boolean mEnableFlashing;
    private boolean mIsAnimating;
    private Paint mPaint;
    private Paint mPaint2;
    private Paint mPaintSmall;
    private Random mRandom;
    private RectF mRectF;
    private ShineAnimator mShineAnimator;
    private WeakReference<ShineButton> mShineButton;
    private int mShineCount;
    private float mShineDistanceMultiple;
    private int mShineSize;
    private float mSmallOffsetAngle;
    private RectF mSmallRectF;
    private int mSmallShineColor;
    private float mTurnAngle;
    private float mValue;

    public static class ShineParams {
        public boolean allowRandomColor = false;
        public long animDuration = 1500;
        public int bigShineColor = 0;
        public long clickAnimDuration = 200;
        public boolean enableFlashing = false;
        public int shineCount = 7;
        public float shineTurnAngle = 20.0f;
        public float shineDistanceMultiple = 1.5f;
        public float smallShineOffsetAngle = 20.0f;
        public int smallShineColor = 0;
        public int shineSize = 0;

        ShineParams() {
            ShineView.sColorRandom[0] = Color.parseColor("#FFFF99");
            ShineView.sColorRandom[1] = Color.parseColor("#FFCCCC");
            ShineView.sColorRandom[2] = Color.parseColor("#996699");
            ShineView.sColorRandom[3] = Color.parseColor("#FF6666");
            ShineView.sColorRandom[4] = Color.parseColor("#FFFF66");
            ShineView.sColorRandom[5] = Color.parseColor("#F44336");
            ShineView.sColorRandom[6] = Color.parseColor("#666666");
            ShineView.sColorRandom[7] = Color.parseColor("#CCCC00");
            ShineView.sColorRandom[8] = Color.parseColor("#666666");
            ShineView.sColorRandom[9] = Color.parseColor("#999933");
        }
    }

    public ShineView(Context context) {
        super(context);
        this.mColorCount = 10;
        int[] iArr = sColorRandom;
        this.mSmallShineColor = iArr[0];
        this.mBigShineColor = iArr[1];
        this.mShineSize = 0;
        this.mAllowRandomColor = false;
        this.mEnableFlashing = false;
        this.mRectF = new RectF();
        this.mSmallRectF = new RectF();
        this.mRandom = new Random();
        this.mClickValue = IGoodView.DEFAULT_TO_ALPHA;
        this.mIsAnimating = false;
        this.mDistanceOffset = 0.2f;
    }

    private Paint getConfigPaint(Paint paint) {
        if (this.mEnableFlashing) {
            paint.setColor(sColorRandom[this.mRandom.nextInt(this.mColorCount - 1)]);
        }
        return paint;
    }

    private void initShineParams(ShineParams shineParams, ShineButton shineButton) {
        this.mShineCount = shineParams.shineCount;
        this.mTurnAngle = shineParams.shineTurnAngle;
        this.mSmallOffsetAngle = shineParams.smallShineOffsetAngle;
        this.mEnableFlashing = shineParams.enableFlashing;
        this.mAllowRandomColor = shineParams.allowRandomColor;
        this.mShineDistanceMultiple = shineParams.shineDistanceMultiple;
        this.mAnimDuration = shineParams.animDuration;
        this.mClickAnimDuration = shineParams.clickAnimDuration;
        int i4 = shineParams.smallShineColor;
        this.mSmallShineColor = i4;
        int i5 = shineParams.bigShineColor;
        this.mBigShineColor = i5;
        this.mShineSize = shineParams.shineSize;
        if (i4 == 0) {
            this.mSmallShineColor = sColorRandom[6];
        }
        if (i5 == 0) {
            this.mBigShineColor = shineButton.getColor();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i4 = 0; i4 < this.mShineCount; i4++) {
            if (this.mAllowRandomColor) {
                Paint paint = this.mPaint;
                int[] iArr = sColorRandom;
                int iAbs = Math.abs((this.mColorCount / 2) - i4);
                int i5 = this.mColorCount;
                paint.setColor(iArr[iAbs >= i5 ? i5 - 1 : Math.abs((i5 / 2) - i4)]);
            }
            canvas.drawArc(this.mRectF, ((360.0f / this.mShineCount) * i4) + 1.0f + ((this.mValue - 1.0f) * this.mTurnAngle), 0.1f, false, getConfigPaint(this.mPaint));
        }
        for (int i6 = 0; i6 < this.mShineCount; i6++) {
            if (this.mAllowRandomColor) {
                Paint paint2 = this.mPaint;
                int[] iArr2 = sColorRandom;
                int iAbs2 = Math.abs((this.mColorCount / 2) - i6);
                int i7 = this.mColorCount;
                paint2.setColor(iArr2[iAbs2 >= i7 ? i7 - 1 : Math.abs((i7 / 2) - i6)]);
            }
            canvas.drawArc(this.mSmallRectF, ((((360.0f / this.mShineCount) * i6) + 1.0f) - this.mSmallOffsetAngle) + ((this.mValue - 1.0f) * this.mTurnAngle), 0.1f, false, getConfigPaint(this.mPaintSmall));
        }
        this.mPaint.setStrokeWidth(this.mBtnWidth * this.mClickValue * (this.mShineDistanceMultiple - this.mDistanceOffset));
        float f4 = this.mClickValue;
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            this.mPaint2.setStrokeWidth(((this.mBtnWidth * f4) * (this.mShineDistanceMultiple - this.mDistanceOffset)) - 8.0f);
        } else {
            this.mPaint2.setStrokeWidth(IGoodView.DEFAULT_TO_ALPHA);
        }
        canvas.drawPoint(this.mCenterAnimX, this.mCenterAnimY, this.mPaint);
        canvas.drawPoint(this.mCenterAnimX, this.mCenterAnimY, this.mPaint2);
        if (this.mShineAnimator == null || this.mIsAnimating) {
            return;
        }
        this.mIsAnimating = true;
        showAnimation(this.mShineButton.get());
    }

    public void showAnimation(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.mBtnWidth = shineButton.getWidth();
        this.mBtnHeight = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.mCenterAnimX = iArr[0] + (shineButton.getWidth() / 2);
        this.mCenterAnimY = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.mCenterAnimX -= decorView.getPaddingLeft();
            this.mCenterAnimY -= decorView.getPaddingTop();
        }
        this.mShineAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.shinebutton.ShineView.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShineView.this.mValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ShineView.this.mShineSize == 0 || ShineView.this.mShineSize <= 0) {
                    ShineView.this.mPaint.setStrokeWidth((ShineView.this.mBtnWidth / 2.0f) * (ShineView.this.mShineDistanceMultiple - ShineView.this.mValue));
                    ShineView.this.mPaintSmall.setStrokeWidth((ShineView.this.mBtnWidth / 3.0f) * (ShineView.this.mShineDistanceMultiple - ShineView.this.mValue));
                } else {
                    ShineView.this.mPaint.setStrokeWidth(ShineView.this.mShineSize * (ShineView.this.mShineDistanceMultiple - ShineView.this.mValue));
                    ShineView.this.mPaintSmall.setStrokeWidth((ShineView.this.mShineSize / 3.0f) * 2.0f * (ShineView.this.mShineDistanceMultiple - ShineView.this.mValue));
                }
                ShineView.this.mRectF.set(ShineView.this.mCenterAnimX - ((ShineView.this.mBtnWidth / (3.0f - ShineView.this.mShineDistanceMultiple)) * ShineView.this.mValue), ShineView.this.mCenterAnimY - ((ShineView.this.mBtnHeight / (3.0f - ShineView.this.mShineDistanceMultiple)) * ShineView.this.mValue), ShineView.this.mCenterAnimX + ((ShineView.this.mBtnWidth / (3.0f - ShineView.this.mShineDistanceMultiple)) * ShineView.this.mValue), ShineView.this.mCenterAnimY + ((ShineView.this.mBtnHeight / (3.0f - ShineView.this.mShineDistanceMultiple)) * ShineView.this.mValue));
                ShineView.this.mSmallRectF.set(ShineView.this.mCenterAnimX - ((ShineView.this.mBtnWidth / ((3.0f - ShineView.this.mShineDistanceMultiple) + ShineView.this.mDistanceOffset)) * ShineView.this.mValue), ShineView.this.mCenterAnimY - ((ShineView.this.mBtnHeight / ((3.0f - ShineView.this.mShineDistanceMultiple) + ShineView.this.mDistanceOffset)) * ShineView.this.mValue), ShineView.this.mCenterAnimX + ((ShineView.this.mBtnWidth / ((3.0f - ShineView.this.mShineDistanceMultiple) + ShineView.this.mDistanceOffset)) * ShineView.this.mValue), ShineView.this.mCenterAnimY + ((ShineView.this.mBtnHeight / ((3.0f - ShineView.this.mShineDistanceMultiple) + ShineView.this.mDistanceOffset)) * ShineView.this.mValue));
                ShineView.this.invalidate();
            }
        });
        this.mShineAnimator.start();
        this.mClickAnimator.start();
    }

    public ShineView(Context context, ShineButton shineButton, ShineParams shineParams) {
        super(context);
        this.mColorCount = 10;
        int[] iArr = sColorRandom;
        this.mSmallShineColor = iArr[0];
        this.mBigShineColor = iArr[1];
        this.mShineSize = 0;
        this.mAllowRandomColor = false;
        this.mEnableFlashing = false;
        this.mRectF = new RectF();
        this.mSmallRectF = new RectF();
        this.mRandom = new Random();
        this.mClickValue = IGoodView.DEFAULT_TO_ALPHA;
        this.mIsAnimating = false;
        this.mDistanceOffset = 0.2f;
        initShineParams(shineParams, shineButton);
        this.mShineButton = new WeakReference<>(shineButton);
        this.mShineAnimator = new ShineAnimator(this.mAnimDuration, this.mShineDistanceMultiple, this.mClickAnimDuration);
        ValueAnimator.setFrameDelay(FRAME_REFRESH_DELAY);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(this.mBigShineColor);
        this.mPaint.setStrokeWidth(20.0f);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.mPaint2 = paint2;
        paint2.setColor(-1);
        this.mPaint2.setStrokeWidth(20.0f);
        this.mPaint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        this.mPaintSmall = paint3;
        paint3.setColor(this.mSmallShineColor);
        this.mPaintSmall.setStrokeWidth(10.0f);
        this.mPaintSmall.setStyle(Paint.Style.STROKE);
        this.mPaintSmall.setStrokeCap(Paint.Cap.ROUND);
        this.mClickAnimator = ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA, 1.1f);
        ValueAnimator.setFrameDelay(FRAME_REFRESH_DELAY);
        this.mClickAnimator.setDuration(this.mClickAnimDuration);
        this.mClickAnimator.setInterpolator(new EasingInterpolator(Ease.QUART_OUT));
        this.mClickAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.shinebutton.ShineView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShineView.this.mClickValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShineView.this.invalidate();
            }
        });
        this.mClickAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.button.shinebutton.ShineView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ShineView.this.mClickValue = IGoodView.DEFAULT_TO_ALPHA;
                ShineView.this.invalidate();
            }
        });
        this.mShineAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.button.shinebutton.ShineView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ShineView.this.mShineButton == null || ShineView.this.mShineButton.get() == null) {
                    return;
                }
                ((ShineButton) ShineView.this.mShineButton.get()).removeView(ShineView.this);
            }
        });
    }

    public ShineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mColorCount = 10;
        int[] iArr = sColorRandom;
        this.mSmallShineColor = iArr[0];
        this.mBigShineColor = iArr[1];
        this.mShineSize = 0;
        this.mAllowRandomColor = false;
        this.mEnableFlashing = false;
        this.mRectF = new RectF();
        this.mSmallRectF = new RectF();
        this.mRandom = new Random();
        this.mClickValue = IGoodView.DEFAULT_TO_ALPHA;
        this.mIsAnimating = false;
        this.mDistanceOffset = 0.2f;
    }

    public ShineView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mColorCount = 10;
        int[] iArr = sColorRandom;
        this.mSmallShineColor = iArr[0];
        this.mBigShineColor = iArr[1];
        this.mShineSize = 0;
        this.mAllowRandomColor = false;
        this.mEnableFlashing = false;
        this.mRectF = new RectF();
        this.mSmallRectF = new RectF();
        this.mRandom = new Random();
        this.mClickValue = IGoodView.DEFAULT_TO_ALPHA;
        this.mIsAnimating = false;
        this.mDistanceOffset = 0.2f;
    }
}
