package com.xuexiang.xui.widget.progress.loading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class MiniLoadingView extends View {
    private static final int DEGREE_PER_LINE = 30;
    private static final int LINE_COUNT = 12;
    private int mAnimateValue;
    private ValueAnimator mAnimator;
    private Paint mPaint;
    private int mPaintColor;
    private int mSize;
    private ValueAnimator.AnimatorUpdateListener mUpdateListener;

    public MiniLoadingView(Context context) {
        this(context, null);
    }

    private void drawLoading(Canvas canvas, int i4) {
        int i5 = this.mSize;
        int i6 = i5 / 12;
        int i7 = i5 / 6;
        float f4 = i6;
        this.mPaint.setStrokeWidth(f4);
        int i8 = this.mSize;
        canvas.rotate(i4, i8 / 2.0f, i8 / 2.0f);
        int i9 = this.mSize;
        canvas.translate(i9 / 2.0f, i9 / 2.0f);
        int i10 = 0;
        while (i10 < 12) {
            canvas.rotate(30.0f);
            i10++;
            this.mPaint.setAlpha((int) ((i10 * 255.0f) / 12.0f));
            float f5 = f4 / 2.0f;
            canvas.translate(IGoodView.DEFAULT_TO_ALPHA, ((-this.mSize) / 2.0f) + f5);
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, i7, this.mPaint);
            canvas.translate(IGoodView.DEFAULT_TO_ALPHA, (this.mSize / 2.0f) - f5);
        }
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.MiniLoadingView, i4, 0);
        this.mSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.MiniLoadingView_mlv_loading_view_size, DensityUtils.dp2px(context, 32.0f));
        this.mPaintColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(this.mPaintColor);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, getWidth(), getHeight(), null, 31);
        drawLoading(canvas, this.mAnimateValue * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6 = this.mSize;
        setMeasuredDimension(i6, i6);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (i4 == 0) {
            start();
        } else {
            stop();
        }
    }

    public void setColor(int i4) {
        this.mPaintColor = i4;
        this.mPaint.setColor(i4);
        invalidate();
    }

    public void setSize(int i4) {
        this.mSize = i4;
        requestLayout();
    }

    public void start() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.mAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.mAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.mUpdateListener);
        this.mAnimator.setDuration(600L);
        this.mAnimator.setRepeatMode(1);
        this.mAnimator.setRepeatCount(-1);
        this.mAnimator.setInterpolator(new LinearInterpolator());
        this.mAnimator.start();
    }

    public void stop() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.mUpdateListener);
            this.mAnimator.removeAllUpdateListeners();
            this.mAnimator.cancel();
            this.mAnimator = null;
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.MiniLoadingStyle);
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mAnimateValue = 0;
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.progress.loading.MiniLoadingView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MiniLoadingView.this.mAnimateValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                MiniLoadingView.this.invalidate();
            }
        };
        initAttrs(context, attributeSet, i4);
        initPaint();
    }

    public MiniLoadingView(Context context, int i4, int i5) {
        super(context);
        this.mAnimateValue = 0;
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.progress.loading.MiniLoadingView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MiniLoadingView.this.mAnimateValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                MiniLoadingView.this.invalidate();
            }
        };
        this.mSize = i4;
        this.mPaintColor = i5;
        initPaint();
    }
}
