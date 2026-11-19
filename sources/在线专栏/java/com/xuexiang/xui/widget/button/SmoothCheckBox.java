package com.xuexiang.xui.widget.button;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SmoothCheckBox extends View implements Checkable {
    private static final int COLOR_FLOOR_UNCHECKED = Color.parseColor("#DFDFDF");
    private static final int DEF_ANIM_DURATION = 300;
    private static final int DEF_DRAW_SIZE = 25;
    private static final String KEY_INSTANCE_STATE = "InstanceState";
    private int mAnimDuration;
    private Point mCenterPoint;
    private boolean mChecked;
    private int mCheckedColor;
    private float mDrewDistance;
    private int mFloorColor;
    private Paint mFloorPaint;
    private float mFloorScale;
    private int mFloorUnCheckedColor;
    private float mLeftLineDistance;
    private OnCheckedChangeListener mOnCheckedChangeListener;
    private Paint mPaint;
    private float mRightLineDistance;
    private float mScaleVal;
    private int mStrokeWidth;
    private boolean mTickDrawing;
    private Paint mTickPaint;
    private Path mTickPath;
    private Point[] mTickPoints;
    private int mUnCheckedColor;
    private int mWidth;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(SmoothCheckBox smoothCheckBox, boolean z3);
    }

    public SmoothCheckBox(Context context) {
        this(context, null);
    }

    private void drawBorder(Canvas canvas) {
        this.mFloorPaint.setColor(this.mFloorColor);
        int i4 = this.mCenterPoint.x;
        canvas.drawCircle(i4, r0.y, i4 * this.mFloorScale, this.mFloorPaint);
    }

    private void drawCenter(Canvas canvas) {
        this.mPaint.setColor(this.mUnCheckedColor);
        canvas.drawCircle(this.mCenterPoint.x, r0.y, (r1 - this.mStrokeWidth) * this.mScaleVal, this.mPaint);
    }

    private void drawTick(Canvas canvas) {
        if (this.mTickDrawing && isChecked()) {
            drawTickPath(canvas);
        }
    }

    private void drawTickDelayed() {
        postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.7
            @Override // java.lang.Runnable
            public void run() {
                SmoothCheckBox.this.mTickDrawing = true;
                SmoothCheckBox.this.postInvalidate();
            }
        }, this.mAnimDuration);
    }

    private void drawTickPath(Canvas canvas) {
        this.mTickPath.reset();
        float f4 = this.mDrewDistance;
        float f5 = this.mLeftLineDistance;
        if (f4 < f5) {
            int i4 = this.mWidth;
            float f6 = f4 + (((float) i4) / 20.0f >= 3.0f ? i4 / 20.0f : 3.0f);
            this.mDrewDistance = f6;
            Point[] pointArr = this.mTickPoints;
            this.mTickPath.moveTo(pointArr[0].x, pointArr[0].y);
            this.mTickPath.lineTo(pointArr[0].x + (((pointArr[1].x - pointArr[0].x) * f6) / f5), pointArr[0].y + (((pointArr[1].y - pointArr[0].y) * f6) / f5));
            canvas.drawPath(this.mTickPath, this.mTickPaint);
            float f7 = this.mDrewDistance;
            float f8 = this.mLeftLineDistance;
            if (f7 > f8) {
                this.mDrewDistance = f8;
            }
        } else {
            Path path = this.mTickPath;
            Point[] pointArr2 = this.mTickPoints;
            path.moveTo(pointArr2[0].x, pointArr2[0].y);
            Path path2 = this.mTickPath;
            Point[] pointArr3 = this.mTickPoints;
            path2.lineTo(pointArr3[1].x, pointArr3[1].y);
            canvas.drawPath(this.mTickPath, this.mTickPaint);
            float f9 = this.mDrewDistance;
            float f10 = this.mLeftLineDistance;
            float f11 = this.mRightLineDistance;
            if (f9 < f10 + f11) {
                Point[] pointArr4 = this.mTickPoints;
                float f12 = pointArr4[1].x + (((pointArr4[2].x - pointArr4[1].x) * (f9 - f10)) / f11);
                float f13 = pointArr4[1].y - (((pointArr4[1].y - pointArr4[2].y) * (f9 - f10)) / f11);
                this.mTickPath.reset();
                Path path3 = this.mTickPath;
                Point[] pointArr5 = this.mTickPoints;
                path3.moveTo(pointArr5[1].x, pointArr5[1].y);
                this.mTickPath.lineTo(f12, f13);
                canvas.drawPath(this.mTickPath, this.mTickPaint);
                this.mDrewDistance += Math.max(this.mWidth / 20, 3);
            } else {
                this.mTickPath.reset();
                Path path4 = this.mTickPath;
                Point[] pointArr6 = this.mTickPoints;
                path4.moveTo(pointArr6[1].x, pointArr6[1].y);
                Path path5 = this.mTickPath;
                Point[] pointArr7 = this.mTickPoints;
                path5.lineTo(pointArr7[2].x, pointArr7[2].y);
                canvas.drawPath(this.mTickPath, this.mTickPaint);
            }
        }
        if (this.mDrewDistance < this.mLeftLineDistance + this.mRightLineDistance) {
            postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.2
                @Override // java.lang.Runnable
                public void run() {
                    SmoothCheckBox.this.postInvalidate();
                }
            }, 10L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getGradientColor(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i4) * f5) + (Color.alpha(i5) * f4)), (int) ((Color.red(i4) * f5) + (Color.red(i5) * f4)), (int) ((Color.green(i4) * f5) + (Color.green(i5) * f4)), (int) ((Color.blue(i4) * f5) + (Color.blue(i5) * f4)));
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.SmoothCheckBox, i4, 0);
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SmoothCheckBox_scb_color_tick, -1);
        this.mAnimDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SmoothCheckBox_scb_duration, 300);
        this.mFloorColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SmoothCheckBox_scb_color_unchecked_stroke, COLOR_FLOOR_UNCHECKED);
        this.mCheckedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SmoothCheckBox_scb_color_checked, ThemeUtils.getMainThemeColor(context));
        this.mUnCheckedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SmoothCheckBox_scb_color_unchecked, -1);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SmoothCheckBox_scb_stroke_width, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mFloorUnCheckedColor = this.mFloorColor;
        Paint paint = new Paint(1);
        this.mTickPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mTickPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mTickPaint.setColor(color);
        Paint paint2 = new Paint(1);
        this.mFloorPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mFloorPaint.setColor(this.mFloorColor);
        Paint paint3 = new Paint(1);
        this.mPaint = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(this.mCheckedColor);
        this.mTickPath = new Path();
        this.mCenterPoint = new Point();
        Point[] pointArr = new Point[3];
        this.mTickPoints = pointArr;
        pointArr[0] = new Point();
        this.mTickPoints[1] = new Point();
        this.mTickPoints[2] = new Point();
        setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SmoothCheckBox.this.toggle();
                SmoothCheckBox.this.mTickDrawing = false;
                SmoothCheckBox.this.mDrewDistance = IGoodView.DEFAULT_TO_ALPHA;
                if (SmoothCheckBox.this.isChecked()) {
                    SmoothCheckBox.this.startCheckedAnimation();
                } else {
                    SmoothCheckBox.this.startUnCheckedAnimation();
                }
            }
        });
    }

    private int measureSize(int i4) {
        int iDp2px = DensityUtils.dp2px(getContext(), 25.0f);
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return Math.min(iDp2px, size);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private void reset() {
        this.mTickDrawing = true;
        this.mFloorScale = 1.0f;
        boolean zIsChecked = isChecked();
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        this.mScaleVal = zIsChecked ? IGoodView.DEFAULT_TO_ALPHA : 1.0f;
        this.mFloorColor = isChecked() ? this.mCheckedColor : this.mFloorUnCheckedColor;
        if (isChecked()) {
            f4 = this.mLeftLineDistance + this.mRightLineDistance;
        }
        this.mDrewDistance = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckedAnimation() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, IGoodView.DEFAULT_TO_ALPHA);
        valueAnimatorOfFloat.setDuration((this.mAnimDuration / 3) * 2);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.mScaleVal = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
                smoothCheckBox.mFloorColor = SmoothCheckBox.getGradientColor(smoothCheckBox.mUnCheckedColor, SmoothCheckBox.this.mCheckedColor, 1.0f - SmoothCheckBox.this.mScaleVal);
                SmoothCheckBox.this.postInvalidate();
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        valueAnimatorOfFloat2.setDuration(this.mAnimDuration);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.mFloorScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox.this.postInvalidate();
            }
        });
        valueAnimatorOfFloat2.start();
        drawTickDelayed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUnCheckedAnimation() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        valueAnimatorOfFloat.setDuration(this.mAnimDuration);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.mScaleVal = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
                smoothCheckBox.mFloorColor = SmoothCheckBox.getGradientColor(smoothCheckBox.mCheckedColor, SmoothCheckBox.this.mFloorUnCheckedColor, SmoothCheckBox.this.mScaleVal);
                SmoothCheckBox.this.postInvalidate();
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        valueAnimatorOfFloat2.setDuration(this.mAnimDuration);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.SmoothCheckBox.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.mFloorScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox.this.postInvalidate();
            }
        });
        valueAnimatorOfFloat2.start();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.mChecked;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        drawBorder(canvas);
        drawCenter(canvas);
        drawTick(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.mWidth = getMeasuredWidth();
        int measuredWidth = this.mStrokeWidth;
        if (measuredWidth == 0) {
            measuredWidth = getMeasuredWidth() / 10;
        }
        this.mStrokeWidth = measuredWidth;
        int iMin = Math.min(measuredWidth, getMeasuredWidth() / 5);
        this.mStrokeWidth = iMin;
        this.mStrokeWidth = Math.max(iMin, 3);
        Point point = this.mCenterPoint;
        point.x = this.mWidth / 2;
        point.y = getMeasuredHeight() / 2;
        this.mTickPoints[0].x = Math.round((getMeasuredWidth() / 30.0f) * 7.0f);
        this.mTickPoints[0].y = Math.round((getMeasuredHeight() / 30.0f) * 14.0f);
        this.mTickPoints[1].x = Math.round((getMeasuredWidth() / 30.0f) * 13.0f);
        this.mTickPoints[1].y = Math.round((getMeasuredHeight() / 30.0f) * 20.0f);
        this.mTickPoints[2].x = Math.round((getMeasuredWidth() / 30.0f) * 22.0f);
        this.mTickPoints[2].y = Math.round((getMeasuredHeight() / 30.0f) * 10.0f);
        Point[] pointArr = this.mTickPoints;
        double dPow = Math.pow(pointArr[1].x - pointArr[0].x, 2.0d);
        Point[] pointArr2 = this.mTickPoints;
        this.mLeftLineDistance = (float) Math.sqrt(dPow + Math.pow(pointArr2[1].y - pointArr2[0].y, 2.0d));
        Point[] pointArr3 = this.mTickPoints;
        double dPow2 = Math.pow(pointArr3[2].x - pointArr3[1].x, 2.0d);
        Point[] pointArr4 = this.mTickPoints;
        this.mRightLineDistance = (float) Math.sqrt(dPow2 + Math.pow(pointArr4[2].y - pointArr4[1].y, 2.0d));
        this.mTickPaint.setStrokeWidth(this.mStrokeWidth);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        setMeasuredDimension(measureSize(i4), measureSize(i5));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setChecked(bundle.getBoolean(KEY_INSTANCE_STATE));
        super.onRestoreInstanceState(bundle.getParcelable(KEY_INSTANCE_STATE));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_INSTANCE_STATE, super.onSaveInstanceState());
        bundle.putBoolean(KEY_INSTANCE_STATE, isChecked());
        return bundle;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedSilent(z3);
        OnCheckedChangeListener onCheckedChangeListener = this.mOnCheckedChangeListener;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, this.mChecked);
        }
    }

    public void setCheckedSilent(boolean z3) {
        this.mChecked = z3;
        reset();
        invalidate();
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.mOnCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.SmoothCheckBoxStyle);
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mScaleVal = 1.0f;
        this.mFloorScale = 1.0f;
        initAttrs(context, attributeSet, i4);
    }

    public void setChecked(boolean z3, boolean z4) {
        if (z4) {
            this.mTickDrawing = false;
            this.mChecked = z3;
            this.mDrewDistance = IGoodView.DEFAULT_TO_ALPHA;
            if (z3) {
                startCheckedAnimation();
            } else {
                startUnCheckedAnimation();
            }
            OnCheckedChangeListener onCheckedChangeListener = this.mOnCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.mChecked);
                return;
            }
            return;
        }
        setChecked(z3);
    }
}
