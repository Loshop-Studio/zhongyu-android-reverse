package com.xuexiang.xui.widget.picker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class RulerView extends View implements HasTypeface {
    private int mBgColor;
    private Paint mBgPaint;
    private RectF mBgRect;
    private float mComputeScale;
    public float mCurrentScale;
    private float mDownX;
    private float mFirstScale;
    private int mHeight;
    private boolean mIsBgRoundRect;
    private boolean mIsUp;
    private Rect mKgRect;
    private int mLagScaleHeight;
    private Paint mLagScalePaint;
    private int mLargeScaleColor;
    private int mLargeScaleStroke;
    private float mLastMoveX;
    private int mMaxScale;
    private int mMidScaleColor;
    private int mMidScaleHeight;
    private Paint mMidScalePaint;
    private int mMidScaleStroke;
    private int mMinScale;
    private float mMoveX;
    private OnChooseResultListener mOnChooseResultListener;
    private int mResultNumColor;
    private TextPaint mResultNumPaint;
    private Rect mResultNumRect;
    private int mResultNumTextSize;
    private String mResultText;
    private int mRoundRadius;
    private int mRulerHeight;
    private int mRulerToResultGap;
    private int mScaleCount;
    private int mScaleGap;
    private int mScaleLimit;
    private int mScaleNumColor;
    private TextPaint mScaleNumPaint;
    private Rect mScaleNumRect;
    private int mScaleNumTextSize;
    private boolean mShowScaleResult;
    private int mSmallScaleColor;
    private int mSmallScaleHeight;
    private Paint mSmallScalePaint;
    private int mSmallScaleStroke;
    private String mUnit;
    private int mUnitColor;
    private TextPaint mUnitPaint;
    private int mUnitTextSize;
    private ValueAnimator mValueAnimator;
    private VelocityTracker mVelocityTracker;
    private int mWidth;

    public interface OnChooseResultListener {
        void onEndResult(String str);

        void onScrollResult(String str);
    }

    public RulerView(Context context) {
        this(context, null);
    }

    private void autoVelocityScroll(int i4) {
        if (Math.abs(i4) < 50) {
            this.mIsUp = true;
            return;
        }
        if (this.mValueAnimator.isRunning()) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, i4 / 20).setDuration(Math.abs(i4 / 10));
        this.mValueAnimator = duration;
        duration.setInterpolator(new DecelerateInterpolator());
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.picker.RulerView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RulerView.this.mMoveX += ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (RulerView.this.mMoveX >= RulerView.this.mWidth / 2.0f) {
                    RulerView.this.mMoveX = r3.mWidth / 2.0f;
                } else {
                    if (RulerView.this.mMoveX <= RulerView.this.getWhichScaleMoveX(r0.mMaxScale)) {
                        RulerView rulerView = RulerView.this;
                        rulerView.mMoveX = rulerView.getWhichScaleMoveX(rulerView.mMaxScale);
                    }
                }
                RulerView rulerView2 = RulerView.this;
                rulerView2.mLastMoveX = rulerView2.mMoveX;
                RulerView.this.invalidate();
            }
        });
        this.mValueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.picker.RulerView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RulerView.this.mIsUp = true;
                RulerView.this.invalidate();
            }
        });
        this.mValueAnimator.start();
    }

    private void computeScrollTo(float f4) {
        float f5 = f4 / this.mScaleLimit;
        if (f5 < this.mMinScale || f5 > this.mMaxScale) {
            return;
        }
        this.mComputeScale = f5;
        invalidate();
    }

    private void drawBg(Canvas canvas) {
        this.mBgRect.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mWidth, this.mHeight);
        if (!this.mIsBgRoundRect) {
            canvas.drawRect(this.mBgRect, this.mBgPaint);
            return;
        }
        RectF rectF = this.mBgRect;
        int i4 = this.mRoundRadius;
        canvas.drawRoundRect(rectF, i4, i4, this.mBgPaint);
    }

    private void drawResultText(Canvas canvas, String str) {
        if (this.mShowScaleResult) {
            canvas.translate(IGoodView.DEFAULT_TO_ALPHA, (-this.mResultNumRect.height()) - (this.mRulerToResultGap / 2.0f));
            this.mResultNumPaint.getTextBounds(str, 0, str.length(), this.mResultNumRect);
            canvas.drawText(str, (this.mWidth / 2.0f) - (this.mResultNumRect.width() / 2.0f), this.mResultNumRect.height(), this.mResultNumPaint);
            canvas.drawText(this.mUnit, (this.mWidth / 2) + (this.mResultNumRect.width() / 2) + 10, this.mKgRect.height() + 2, this.mUnitPaint);
        }
    }

    private void drawScaleAndNum(Canvas canvas) {
        canvas.translate(IGoodView.DEFAULT_TO_ALPHA, (this.mShowScaleResult ? this.mResultNumRect.height() : 0) + this.mRulerToResultGap);
        float f4 = this.mFirstScale;
        if (f4 != -1.0f) {
            float whichScaleMoveX = getWhichScaleMoveX(f4);
            this.mMoveX = whichScaleMoveX;
            this.mLastMoveX = whichScaleMoveX;
            this.mFirstScale = -1.0f;
        }
        if (this.mComputeScale != -1.0f) {
            this.mLastMoveX = this.mMoveX;
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null && !valueAnimator.isRunning()) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getWhichScaleMoveX(this.mCurrentScale), getWhichScaleMoveX(this.mComputeScale));
                this.mValueAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.picker.RulerView.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        RulerView.this.mMoveX = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        RulerView rulerView = RulerView.this;
                        rulerView.mLastMoveX = rulerView.mMoveX;
                        RulerView.this.invalidate();
                    }
                });
                this.mValueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.picker.RulerView.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        RulerView.this.mComputeScale = -1.0f;
                    }
                });
                this.mValueAnimator.setDuration(Math.abs((long) ((getWhichScaleMoveX(this.mComputeScale) - getWhichScaleMoveX(this.mCurrentScale)) / 100.0f)));
                this.mValueAnimator.start();
            }
        }
        float f5 = this.mMoveX;
        int i4 = this.mScaleGap;
        int i5 = -((int) (f5 / i4));
        float f6 = f5 % i4;
        canvas.save();
        if (this.mIsUp) {
            int i6 = this.mScaleGap;
            float fAbs = (this.mMoveX - ((this.mWidth / 2.0f) % i6)) % i6;
            if (fAbs <= IGoodView.DEFAULT_TO_ALPHA) {
                fAbs = i6 - Math.abs(fAbs);
            }
            float fAbs2 = fAbs <= ((float) this.mScaleGap) / 2.0f ? this.mMoveX - ((int) Math.abs(fAbs)) : this.mMoveX + ((int) (this.mScaleGap - Math.abs(fAbs)));
            ValueAnimator valueAnimator2 = this.mValueAnimator;
            if (valueAnimator2 != null && !valueAnimator2.isRunning()) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.mMoveX, fAbs2);
                this.mValueAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.picker.RulerView.5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        RulerView.this.mMoveX = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        RulerView rulerView = RulerView.this;
                        rulerView.mLastMoveX = rulerView.mMoveX;
                        RulerView.this.invalidate();
                    }
                });
                this.mValueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.picker.RulerView.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (RulerView.this.mOnChooseResultListener != null) {
                            RulerView.this.mOnChooseResultListener.onEndResult(RulerView.this.mResultText);
                        }
                    }
                });
                this.mValueAnimator.setDuration(300L);
                this.mValueAnimator.start();
                this.mIsUp = false;
            }
            float f7 = this.mMoveX;
            int i7 = this.mScaleGap;
            i5 = (int) (-(f7 / i7));
            f6 = f7 % i7;
        }
        canvas.translate(f6, IGoodView.DEFAULT_TO_ALPHA);
        float fFloatValue = ((BigDecimal) new WeakReference(new BigDecimal(((((this.mWidth / 2.0f) - this.mMoveX) / (this.mScaleGap * this.mScaleCount)) + this.mMinScale) * this.mScaleLimit)).get()).setScale(1, 4).floatValue();
        this.mCurrentScale = fFloatValue;
        String strValueOf = String.valueOf(fFloatValue);
        this.mResultText = strValueOf;
        OnChooseResultListener onChooseResultListener = this.mOnChooseResultListener;
        if (onChooseResultListener != null) {
            onChooseResultListener.onScrollResult(strValueOf);
        }
        int i8 = 0;
        while (true) {
            int i9 = this.mWidth;
            if (i8 >= i9) {
                canvas.restore();
                int i10 = this.mWidth;
                canvas.drawLine(i10 / 2.0f, IGoodView.DEFAULT_TO_ALPHA, i10 / 2.0f, this.mLagScaleHeight, this.mLagScalePaint);
                return;
            }
            if (i5 % this.mScaleCount == 0) {
                float f8 = this.mMoveX;
                if ((f8 < IGoodView.DEFAULT_TO_ALPHA || i8 >= f8 - this.mScaleGap) && (i9 / 2.0f) - i8 > getWhichScaleMoveX(this.mMaxScale + 1) - this.mMoveX) {
                    canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mMidScaleHeight, this.mMidScalePaint);
                    this.mScaleNumPaint.getTextBounds(((i5 / this.mScaleGap) + this.mMinScale) + "", 0, (((i5 / this.mScaleGap) + this.mMinScale) + "").length(), this.mScaleNumRect);
                    canvas.drawText((((i5 / this.mScaleCount) + this.mMinScale) * this.mScaleLimit) + "", (-this.mScaleNumRect.width()) / 2.0f, this.mLagScaleHeight + ((this.mRulerHeight - r8) / 2.0f) + this.mScaleNumRect.height(), this.mScaleNumPaint);
                }
            } else {
                float f9 = this.mMoveX;
                if ((f9 < IGoodView.DEFAULT_TO_ALPHA || i8 >= f9) && (i9 / 2.0f) - i8 >= getWhichScaleMoveX(this.mMaxScale) - this.mMoveX) {
                    canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mSmallScaleHeight, this.mSmallScalePaint);
                }
            }
            i5++;
            int i11 = this.mScaleGap;
            i8 += i11;
            canvas.translate(i11, IGoodView.DEFAULT_TO_ALPHA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getWhichScaleMoveX(float f4) {
        return (this.mWidth / 2.0f) - ((this.mScaleGap * this.mScaleCount) * (f4 - this.mMinScale));
    }

    private void init() {
        this.mBgPaint = new Paint(1);
        this.mSmallScalePaint = new Paint(1);
        this.mMidScalePaint = new Paint(1);
        this.mLagScalePaint = new Paint(1);
        this.mScaleNumPaint = new TextPaint(1);
        this.mResultNumPaint = new TextPaint(1);
        this.mUnitPaint = new TextPaint(1);
        this.mBgPaint.setColor(this.mBgColor);
        this.mSmallScalePaint.setColor(this.mSmallScaleColor);
        this.mMidScalePaint.setColor(this.mMidScaleColor);
        this.mLagScalePaint.setColor(this.mLargeScaleColor);
        this.mScaleNumPaint.setColor(this.mScaleNumColor);
        this.mResultNumPaint.setColor(this.mResultNumColor);
        this.mUnitPaint.setColor(this.mUnitColor);
        this.mResultNumPaint.setStyle(Paint.Style.FILL);
        this.mUnitPaint.setStyle(Paint.Style.FILL);
        this.mBgPaint.setStyle(Paint.Style.FILL);
        this.mSmallScalePaint.setStyle(Paint.Style.FILL);
        this.mMidScalePaint.setStyle(Paint.Style.FILL);
        this.mLagScalePaint.setStyle(Paint.Style.FILL);
        this.mLagScalePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mMidScalePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mSmallScalePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mSmallScalePaint.setStrokeWidth(this.mSmallScaleStroke);
        this.mMidScalePaint.setStrokeWidth(this.mMidScaleStroke);
        this.mLagScalePaint.setStrokeWidth(this.mLargeScaleStroke);
        this.mResultNumPaint.setTextSize(this.mResultNumTextSize);
        this.mUnitPaint.setTextSize(this.mUnitTextSize);
        this.mScaleNumPaint.setTextSize(this.mScaleNumTextSize);
        this.mBgRect = new RectF();
        this.mResultNumRect = new Rect();
        this.mScaleNumRect = new Rect();
        this.mKgRect = new Rect();
        TextPaint textPaint = this.mResultNumPaint;
        String str = this.mResultText;
        textPaint.getTextBounds(str, 0, str.length(), this.mResultNumRect);
        this.mUnitPaint.getTextBounds(this.mResultText, 0, 1, this.mKgRect);
        int i4 = this.mRulerHeight;
        this.mSmallScaleHeight = i4 / 4;
        this.mMidScaleHeight = i4 / 2;
        this.mLagScaleHeight = (i4 / 2) + 5;
        this.mValueAnimator = new ValueAnimator();
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.RulerView, i4, 0);
        this.mScaleLimit = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RulerView_rv_scaleLimit, this.mScaleLimit);
        this.mRulerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_rulerHeight, (int) TypedValue.applyDimension(1, this.mRulerHeight, getResources().getDisplayMetrics()));
        this.mRulerToResultGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_rulerToResultGap, (int) TypedValue.applyDimension(1, this.mRulerToResultGap, getResources().getDisplayMetrics()));
        this.mScaleCount = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RulerView_rv_scaleCount, this.mScaleCount);
        this.mScaleGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_scaleGap, (int) TypedValue.applyDimension(1, this.mScaleGap, getResources().getDisplayMetrics()));
        this.mMinScale = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RulerView_rv_minScale, this.mMinScale) / this.mScaleLimit;
        this.mFirstScale = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.RulerView_rv_firstScale, this.mFirstScale) / this.mScaleLimit;
        this.mMaxScale = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RulerView_rv_maxScale, this.mMaxScale) / this.mScaleLimit;
        this.mBgColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_bgColor, ResUtils.getColor(C2042R.color.default_ruler_view_bg_color));
        this.mSmallScaleColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_smallScaleColor, ResUtils.getColor(C2042R.color.default_ruler_view_small_scale_color));
        this.mMidScaleColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_midScaleColor, ResUtils.getColor(C2042R.color.default_ruler_view_mid_scale_color));
        this.mLargeScaleColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_largeScaleColor, ResUtils.getColor(C2042R.color.default_ruler_view_large_scale_color));
        this.mScaleNumColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_scaleNumColor, ResUtils.getColor(C2042R.color.default_ruler_view_scale_num_color));
        this.mResultNumColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_resultNumColor, ResUtils.getColor(C2042R.color.default_ruler_view_result_num_color));
        this.mUnitColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RulerView_rv_unitColor, ResUtils.getColor(C2042R.color.default_ruler_view_unit_color));
        String str = this.mUnit;
        String string = typedArrayObtainStyledAttributes.getString(C2042R.styleable.RulerView_rv_unit);
        this.mUnit = string;
        if (TextUtils.isEmpty(string)) {
            this.mUnit = str;
        }
        this.mSmallScaleStroke = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_smallScaleStroke, (int) TypedValue.applyDimension(1, this.mSmallScaleStroke, getResources().getDisplayMetrics()));
        this.mMidScaleStroke = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_midScaleStroke, (int) TypedValue.applyDimension(1, this.mMidScaleStroke, getResources().getDisplayMetrics()));
        this.mLargeScaleStroke = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_largeScaleStroke, (int) TypedValue.applyDimension(1, this.mLargeScaleStroke, getResources().getDisplayMetrics()));
        this.mResultNumTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_resultNumTextSize, (int) TypedValue.applyDimension(2, this.mResultNumTextSize, getResources().getDisplayMetrics()));
        this.mScaleNumTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_scaleNumTextSize, (int) TypedValue.applyDimension(2, this.mScaleNumTextSize, getResources().getDisplayMetrics()));
        this.mUnitTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_unitTextSize, (int) TypedValue.applyDimension(2, this.mUnitTextSize, getResources().getDisplayMetrics()));
        this.mShowScaleResult = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RulerView_rv_showScaleResult, this.mShowScaleResult);
        this.mIsBgRoundRect = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RulerView_rv_isBgRoundRect, this.mIsBgRoundRect);
        this.mRoundRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RulerView_rv_roundRadius, (int) TypedValue.applyDimension(1, this.mRoundRadius, getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public float getCurrentValue() {
        return this.mCurrentScale;
    }

    public String getSelectValue() {
        return this.mResultText;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        drawBg(canvas);
        drawScaleAndNum(canvas);
        drawResultText(canvas, this.mResultText);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            this.mHeight = this.mRulerHeight + (this.mShowScaleResult ? this.mResultNumRect.height() : 0) + (this.mRulerToResultGap * 2) + getPaddingTop() + getPaddingBottom();
        } else if (mode == 0 || mode == 1073741824) {
            this.mHeight = size + getPaddingTop() + getPaddingBottom();
        }
        int paddingLeft = size2 + getPaddingLeft() + getPaddingRight();
        this.mWidth = paddingLeft;
        setMeasuredDimension(paddingLeft, this.mHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        float x3 = motionEvent.getX();
        this.mIsUp = false;
        this.mVelocityTracker.computeCurrentVelocity(500);
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mValueAnimator.end();
                this.mValueAnimator.cancel();
            }
            this.mDownX = motionEvent.getX();
        } else if (action == 1) {
            this.mLastMoveX = this.mMoveX;
            autoVelocityScroll((int) this.mVelocityTracker.getXVelocity());
            this.mVelocityTracker.clear();
        } else if (action == 2) {
            float f4 = (x3 - this.mDownX) + this.mLastMoveX;
            this.mMoveX = f4;
            int i4 = this.mWidth;
            if (f4 >= i4 / 2.0f) {
                this.mMoveX = i4 / 2.0f;
            } else if (f4 <= getWhichScaleMoveX(this.mMaxScale)) {
                this.mMoveX = getWhichScaleMoveX(this.mMaxScale);
            }
        }
        invalidate();
        return true;
    }

    public void setBgColor(int i4) {
        this.mBgColor = i4;
        invalidate();
    }

    public void setCurrentValue(float f4) {
        computeScrollTo(f4);
    }

    public void setFirstScale(float f4) {
        this.mFirstScale = f4;
        invalidate();
    }

    public void setIsBgRoundRect(boolean z3) {
        this.mIsBgRoundRect = z3;
        invalidate();
    }

    public void setLargeScaleColor(int i4) {
        this.mLargeScaleColor = i4;
    }

    public void setLargeScaleStroke(int i4) {
        this.mLargeScaleStroke = i4;
        invalidate();
    }

    public void setMaxScale(int i4) {
        this.mMaxScale = i4;
        invalidate();
    }

    public void setMidScaleColor(int i4) {
        this.mMidScaleColor = i4;
        invalidate();
    }

    public void setMidScaleStroke(int i4) {
        this.mMidScaleStroke = i4;
        invalidate();
    }

    public void setMinScale(int i4) {
        this.mMinScale = i4;
        invalidate();
    }

    public RulerView setOnChooseResultListener(OnChooseResultListener onChooseResultListener) {
        this.mOnChooseResultListener = onChooseResultListener;
        return this;
    }

    public void setResultNumColor(int i4) {
        this.mResultNumColor = i4;
        invalidate();
    }

    public void setResultNumTextSize(int i4) {
        this.mResultNumTextSize = i4;
        invalidate();
    }

    public void setRulerHeight(int i4) {
        this.mRulerHeight = i4;
        invalidate();
    }

    public void setRulerToResultGap(int i4) {
        this.mRulerToResultGap = i4;
        invalidate();
    }

    public void setScaleCount(int i4) {
        this.mScaleCount = i4;
        invalidate();
    }

    public void setScaleGap(int i4) {
        this.mScaleGap = i4;
        invalidate();
    }

    public void setScaleLimit(int i4) {
        this.mScaleLimit = i4;
        invalidate();
    }

    public void setScaleNumColor(int i4) {
        this.mScaleNumColor = i4;
        invalidate();
    }

    public void setScaleNumTextSize(int i4) {
        this.mScaleNumTextSize = i4;
        invalidate();
    }

    public void setShowScaleResult(boolean z3) {
        this.mShowScaleResult = z3;
        invalidate();
    }

    public void setSmallScaleColor(int i4) {
        this.mSmallScaleColor = i4;
        invalidate();
    }

    public void setSmallScaleStroke(int i4) {
        this.mSmallScaleStroke = i4;
        invalidate();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.mResultNumPaint;
        if (textPaint != null) {
            textPaint.setTypeface(typeface);
        }
        TextPaint textPaint2 = this.mUnitPaint;
        if (textPaint2 != null) {
            textPaint2.setTypeface(typeface);
        }
        TextPaint textPaint3 = this.mScaleNumPaint;
        if (textPaint3 != null) {
            textPaint3.setTypeface(typeface);
        }
    }

    public void setUnit(String str) {
        this.mUnit = str;
        invalidate();
    }

    public void setUnitColor(int i4) {
        this.mUnitColor = i4;
        invalidate();
    }

    public void setUnitTextSize(int i4) {
        this.mUnitTextSize = i4;
        invalidate();
    }

    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.RulerViewStyle);
    }

    public RulerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mScaleLimit = 1;
        this.mRulerHeight = 50;
        this.mRulerToResultGap = 50 / 4;
        this.mScaleCount = 10;
        this.mScaleGap = 10;
        this.mMinScale = 0;
        this.mFirstScale = 50.0f;
        this.mMaxScale = 100;
        this.mUnit = "kg";
        this.mSmallScaleStroke = 2;
        this.mMidScaleStroke = 3;
        this.mLargeScaleStroke = 5;
        this.mResultNumTextSize = 20;
        this.mScaleNumTextSize = 16;
        this.mUnitTextSize = 13;
        this.mShowScaleResult = true;
        this.mIsBgRoundRect = true;
        this.mRoundRadius = 10;
        this.mComputeScale = -1.0f;
        this.mCurrentScale = 50.0f;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mResultText = String.valueOf(this.mFirstScale);
        this.mMoveX = IGoodView.DEFAULT_TO_ALPHA;
        this.mLastMoveX = IGoodView.DEFAULT_TO_ALPHA;
        this.mIsUp = false;
        initAttrs(context, attributeSet, i4);
        init();
    }
}
