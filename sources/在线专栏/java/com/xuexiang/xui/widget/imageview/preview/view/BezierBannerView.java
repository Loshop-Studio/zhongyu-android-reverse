package com.xuexiang.xui.widget.imageview.preview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class BezierBannerView extends View implements ViewPager.InterfaceC0779i {
    public static int DIRECTION_LEFT = 1;
    public static int DIRECTION_RIGHT = 2;
    private static final String TAG = BezierBannerView.class.getName();
    private int MOVE_STEP_ONE;
    private int MOVE_STEP_TWO;
    Interpolator accelerateinterpolator;
    private boolean autoMove;
    float controlPointX;
    float controlPointY;
    private int count;
    private float distance;
    float endPointX;
    float endPointY;
    float mCenterPointX;
    float mCenterPointY;
    private float mChangeBgRadius;
    private float mChangeRadius;
    private Paint mCirclePaint;
    private Paint mCirclePaint2;
    private int mDrection;
    private float mNomarlRadius;
    private float mOriginProgress;
    private Path mPath;
    private Path mPath2;
    private float mProgress;
    private float mProgress2;
    private float mRadius;
    private int mSelectedColor;
    private int mSelectedIndex;
    float mStartX;
    float mStartY;
    private float mSupportChangeRadius;
    float mSupportCircleX;
    float mSupportCircleY;
    private float mSupport_Next_ChangeRadius;
    float mSupport_next_centerX;
    float mSupport_next_centerY;
    private int mUnSelectedColor;
    float mbgNextPointX;
    float mbgNextPointY;

    public BezierBannerView(Context context) {
        this(context, null);
    }

    private float getCenterPointAt(int i4) {
        if (i4 == 0) {
            return this.mRadius;
        }
        float f4 = this.distance;
        float f5 = this.mNomarlRadius;
        return (i4 * (f4 + (2.0f * f5))) + f5 + (this.mRadius - f5);
    }

    private void initAttrs(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.BezierBannerView);
        this.mSelectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BezierBannerView_bbv_selectedColor, -1);
        this.mUnSelectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.mRadius = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BezierBannerView_bbv_selectedRadius, this.mRadius);
        this.mNomarlRadius = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BezierBannerView_bbv_unSelectedRadius, this.mNomarlRadius);
        this.distance = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BezierBannerView_bbv_spacing, this.distance);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initPaint() {
        Paint paint = new Paint(1);
        paint.setColor(this.mSelectedColor);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.mCirclePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.mUnSelectedColor);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.mCirclePaint2 = paint2;
    }

    private void moveToNext() {
        this.mPath.reset();
        this.mPath2.reset();
        float interpolation = this.accelerateinterpolator.getInterpolation(this.mOriginProgress);
        this.mCenterPointX = getValue(getCenterPointAt(this.mSelectedIndex), getCenterPointAt(this.mSelectedIndex + 1) - this.mRadius, this.MOVE_STEP_TWO);
        float f4 = this.mRadius;
        this.mCenterPointY = f4;
        this.mChangeRadius = getValue(f4, IGoodView.DEFAULT_TO_ALPHA, interpolation);
        double radians = Math.toRadians(getValue(45.0f, IGoodView.DEFAULT_TO_ALPHA, this.MOVE_STEP_ONE));
        float fSin = (float) (Math.sin(radians) * this.mChangeRadius);
        float fCos = (float) (Math.cos(radians) * this.mChangeRadius);
        this.mSupportCircleX = getValue(getCenterPointAt(this.mSelectedIndex) + this.mRadius, getCenterPointAt(this.mSelectedIndex + 1), this.MOVE_STEP_ONE);
        float f5 = this.mRadius;
        this.mSupportCircleY = f5;
        this.mSupportChangeRadius = getValue(IGoodView.DEFAULT_TO_ALPHA, f5, interpolation);
        double radians2 = Math.toRadians(getValue(IGoodView.DEFAULT_TO_ALPHA, 45.0f, this.MOVE_STEP_TWO));
        float fSin2 = (float) (Math.sin(radians2) * this.mSupportChangeRadius);
        float fCos2 = (float) (Math.cos(radians2) * this.mSupportChangeRadius);
        this.mStartX = this.mCenterPointX + fSin;
        this.mStartY = this.mCenterPointY - fCos;
        this.endPointX = this.mSupportCircleX - fSin2;
        this.endPointY = this.mRadius - fCos2;
        this.controlPointX = getValueForAll(getCenterPointAt(this.mSelectedIndex) + this.mRadius, getCenterPointAt(this.mSelectedIndex + 1) - this.mRadius);
        this.controlPointY = this.mRadius;
        this.mPath.moveTo(this.mStartX, this.mStartY);
        this.mPath.quadTo(this.controlPointX, this.controlPointY, this.endPointX, this.endPointY);
        this.mPath.lineTo(this.endPointX, this.mRadius + fCos2);
        this.mPath.quadTo(this.controlPointX, this.mRadius, this.mStartX, this.mStartY + (fCos * 2.0f));
        this.mPath.lineTo(this.mStartX, this.mStartY);
        this.mbgNextPointX = getValue(getCenterPointAt(this.mSelectedIndex + 1), getCenterPointAt(this.mSelectedIndex) + this.mNomarlRadius, this.MOVE_STEP_TWO);
        this.mbgNextPointY = this.mRadius;
        this.mChangeBgRadius = getValue(this.mNomarlRadius, IGoodView.DEFAULT_TO_ALPHA, interpolation);
        double radians3 = Math.toRadians(getValue(45.0f, IGoodView.DEFAULT_TO_ALPHA, this.MOVE_STEP_ONE));
        float fSin3 = (float) (Math.sin(radians3) * this.mChangeBgRadius);
        float fCos3 = (float) (Math.cos(radians3) * this.mChangeBgRadius);
        this.mSupport_next_centerX = getValue(getCenterPointAt(this.mSelectedIndex + 1) - this.mNomarlRadius, getCenterPointAt(this.mSelectedIndex), this.MOVE_STEP_ONE);
        this.mSupport_next_centerY = this.mRadius;
        this.mSupport_Next_ChangeRadius = getValue(IGoodView.DEFAULT_TO_ALPHA, this.mNomarlRadius, interpolation);
        double radians4 = Math.toRadians(getValue(IGoodView.DEFAULT_TO_ALPHA, 45.0f, this.MOVE_STEP_TWO));
        float fSin4 = (float) (Math.sin(radians4) * this.mSupport_Next_ChangeRadius);
        float fCos4 = (float) (Math.cos(radians4) * this.mSupport_Next_ChangeRadius);
        float f6 = this.mbgNextPointX - fSin3;
        float f7 = this.mbgNextPointY - fCos3;
        float f8 = this.mSupport_next_centerX + fSin4;
        float f9 = this.mSupport_next_centerY - fCos4;
        float valueForAll = getValueForAll(getCenterPointAt(this.mSelectedIndex + 1) - this.mNomarlRadius, getCenterPointAt(this.mSelectedIndex) + this.mNomarlRadius);
        float f10 = this.mRadius;
        this.mPath2.moveTo(f6, f7);
        this.mPath2.quadTo(valueForAll, f10, f8, f9);
        this.mPath2.lineTo(f8, this.mRadius + fCos4);
        this.mPath2.quadTo(valueForAll, f10, f6, (fCos3 * 2.0f) + f7);
        this.mPath2.lineTo(f6, f7);
    }

    private void moveToPrivous() {
        this.mPath.reset();
        this.mPath2.reset();
        float interpolation = this.accelerateinterpolator.getInterpolation(this.mOriginProgress);
        this.mCenterPointX = getValue(getCenterPointAt(this.mSelectedIndex), getCenterPointAt(this.mSelectedIndex - 1) + this.mRadius, this.MOVE_STEP_TWO);
        float f4 = this.mRadius;
        this.mCenterPointY = f4;
        this.mChangeRadius = getValue(f4, IGoodView.DEFAULT_TO_ALPHA, interpolation);
        double radians = Math.toRadians(getValue(45.0f, IGoodView.DEFAULT_TO_ALPHA, this.MOVE_STEP_ONE));
        float fSin = (float) (Math.sin(radians) * this.mChangeRadius);
        float fCos = (float) (Math.cos(radians) * this.mChangeRadius);
        this.mSupportCircleX = getValue(getCenterPointAt(this.mSelectedIndex) - this.mRadius, getCenterPointAt(this.mSelectedIndex - 1), this.MOVE_STEP_ONE);
        float f5 = this.mRadius;
        this.mSupportCircleY = f5;
        this.mSupportChangeRadius = getValue(IGoodView.DEFAULT_TO_ALPHA, f5, interpolation);
        double radians2 = Math.toRadians(getValue(IGoodView.DEFAULT_TO_ALPHA, 45.0f, this.MOVE_STEP_TWO));
        float fSin2 = (float) (Math.sin(radians2) * this.mSupportChangeRadius);
        float fCos2 = (float) (Math.cos(radians2) * this.mSupportChangeRadius);
        this.mStartX = this.mCenterPointX - fSin;
        this.mStartY = this.mCenterPointY - fCos;
        this.endPointX = this.mSupportCircleX + fSin2;
        this.endPointY = this.mRadius - fCos2;
        this.controlPointX = getValueForAll(getCenterPointAt(this.mSelectedIndex) - this.mRadius, getCenterPointAt(this.mSelectedIndex - 1) + this.mRadius);
        this.controlPointY = this.mRadius;
        this.mPath.moveTo(this.mStartX, this.mStartY);
        this.mPath.quadTo(this.controlPointX, this.controlPointY, this.endPointX, this.endPointY);
        this.mPath.lineTo(this.endPointX, this.mRadius + fCos2);
        this.mPath.quadTo(this.controlPointX, this.mRadius, this.mStartX, this.mStartY + (fCos * 2.0f));
        this.mPath.lineTo(this.mStartX, this.mStartY);
        this.mbgNextPointX = getValue(getCenterPointAt(this.mSelectedIndex - 1), getCenterPointAt(this.mSelectedIndex) - this.mNomarlRadius, this.MOVE_STEP_TWO);
        this.mbgNextPointY = this.mRadius;
        this.mChangeBgRadius = getValue(this.mNomarlRadius, IGoodView.DEFAULT_TO_ALPHA, interpolation);
        double radians3 = Math.toRadians(getValue(45.0f, IGoodView.DEFAULT_TO_ALPHA, this.MOVE_STEP_ONE));
        float fSin3 = (float) (Math.sin(radians3) * this.mChangeBgRadius);
        float fCos3 = (float) (Math.cos(radians3) * this.mChangeBgRadius);
        this.mSupport_next_centerX = getValue(getCenterPointAt(this.mSelectedIndex - 1) + this.mNomarlRadius, getCenterPointAt(this.mSelectedIndex), this.MOVE_STEP_ONE);
        this.mSupport_next_centerY = this.mRadius;
        this.mSupport_Next_ChangeRadius = getValue(IGoodView.DEFAULT_TO_ALPHA, this.mNomarlRadius, interpolation);
        double radians4 = Math.toRadians(getValue(IGoodView.DEFAULT_TO_ALPHA, 45.0f, this.MOVE_STEP_TWO));
        float fSin4 = (float) (Math.sin(radians4) * this.mSupport_Next_ChangeRadius);
        float fCos4 = (float) (Math.cos(radians4) * this.mSupport_Next_ChangeRadius);
        float f6 = this.mbgNextPointX + fSin3;
        float f7 = this.mbgNextPointY - fCos3;
        float f8 = this.mSupport_next_centerX - fSin4;
        float f9 = this.mSupport_next_centerY - fCos4;
        float valueForAll = getValueForAll(getCenterPointAt(this.mSelectedIndex - 1) + this.mNomarlRadius, getCenterPointAt(this.mSelectedIndex) - this.mNomarlRadius);
        float f10 = this.mRadius;
        this.mPath2.moveTo(f6, f7);
        this.mPath2.quadTo(valueForAll, f10, f8, f9);
        this.mPath2.lineTo(f8, this.mRadius + fCos4);
        this.mPath2.quadTo(valueForAll, f10, f6, (fCos3 * 2.0f) + f7);
        this.mPath2.lineTo(f6, f7);
    }

    public void attachToViewpager(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.count = viewPager.getAdapter().getCount();
        }
        this.mSelectedIndex = viewPager.getCurrentItem();
        moveToNext();
        this.mDrection = DIRECTION_RIGHT;
        invalidate();
    }

    public float getValue(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    public float getValue(float f4, float f5, int i4) {
        float f6;
        float f7;
        if (i4 == this.MOVE_STEP_ONE) {
            f6 = f5 - f4;
            f7 = this.mProgress;
        } else {
            f6 = f5 - f4;
            f7 = this.mProgress2;
        }
        return f4 + (f6 * f7);
    }

    public float getValueForAll(float f4, float f5) {
        return f4 + ((f5 - f4) * this.mOriginProgress);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i5 = 0; i5 < this.count; i5++) {
            int i6 = this.mDrection;
            if (i6 == DIRECTION_RIGHT) {
                int i7 = this.mSelectedIndex;
                if (i5 != i7 && i5 != i7 + 1) {
                    canvas.drawCircle(getCenterPointAt(i5), this.mRadius, this.mNomarlRadius, this.mCirclePaint2);
                }
            } else if (i6 == DIRECTION_LEFT && i5 != (i4 = this.mSelectedIndex) && i5 != i4 - 1) {
                canvas.drawCircle(getCenterPointAt(i5), this.mRadius, this.mNomarlRadius, this.mCirclePaint2);
            }
        }
        canvas.drawCircle(this.mSupport_next_centerX, this.mSupport_next_centerY, this.mSupport_Next_ChangeRadius, this.mCirclePaint2);
        canvas.drawCircle(this.mbgNextPointX, this.mbgNextPointY, this.mChangeBgRadius, this.mCirclePaint2);
        canvas.drawPath(this.mPath2, this.mCirclePaint2);
        canvas.drawCircle(this.mSupportCircleX, this.mSupportCircleY, this.mSupportChangeRadius, this.mCirclePaint);
        canvas.drawCircle(this.mCenterPointX, this.mCenterPointY, this.mChangeRadius, this.mCirclePaint);
        canvas.drawPath(this.mPath, this.mCirclePaint);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        float f4 = this.mNomarlRadius;
        int paddingLeft = (int) ((f4 * 2.0f * this.count) + ((this.mRadius - f4) * 2.0f) + ((r5 - 1) * this.distance) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.mRadius * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
    public void onPageScrolled(int i4, float f4, int i5) {
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            this.mSelectedIndex = i4;
            Log.d(TAG, "到达");
            resetProgress();
        }
        float f5 = i4 + f4;
        int i6 = this.mSelectedIndex;
        if (f5 - i6 > IGoodView.DEFAULT_TO_ALPHA) {
            this.mDrection = DIRECTION_RIGHT;
            if (f5 <= i6 + 1) {
                setProgress(f4);
                return;
            } else {
                this.mSelectedIndex = i4;
                Log.d(TAG, "向左快速滑动");
                return;
            }
        }
        if (f5 - i6 < IGoodView.DEFAULT_TO_ALPHA) {
            this.mDrection = DIRECTION_LEFT;
            if (f5 >= i6 - 1) {
                setProgress(1.0f - f4);
            } else {
                this.mSelectedIndex = i4;
                Log.d(TAG, "向右快速滑动");
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
    public void onPageSelected(int i4) {
    }

    public void resetProgress() {
        this.mProgress = IGoodView.DEFAULT_TO_ALPHA;
        this.mProgress2 = IGoodView.DEFAULT_TO_ALPHA;
        this.mOriginProgress = IGoodView.DEFAULT_TO_ALPHA;
    }

    public void setDirection(int i4) {
        this.mDrection = i4;
    }

    public void setProgress(float f4) {
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            return;
        }
        this.mOriginProgress = f4;
        if (f4 <= 0.5d) {
            this.mProgress = f4 / 0.5f;
            this.mProgress2 = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            this.mProgress2 = (f4 - 0.5f) / 0.5f;
            this.mProgress = 1.0f;
        }
        if (this.mDrection == DIRECTION_RIGHT) {
            moveToNext();
        } else {
            moveToPrivous();
        }
        invalidate();
    }

    public BezierBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezierBannerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPath = new Path();
        this.mPath2 = new Path();
        this.distance = 80.0f;
        this.mRadius = 30.0f;
        this.mNomarlRadius = 20.0f;
        this.autoMove = false;
        this.mProgress = IGoodView.DEFAULT_TO_ALPHA;
        this.mProgress2 = IGoodView.DEFAULT_TO_ALPHA;
        this.mSelectedIndex = 0;
        this.MOVE_STEP_ONE = 1;
        this.MOVE_STEP_TWO = 2;
        this.accelerateinterpolator = new AccelerateDecelerateInterpolator();
        initAttrs(attributeSet);
        initPaint();
    }
}
