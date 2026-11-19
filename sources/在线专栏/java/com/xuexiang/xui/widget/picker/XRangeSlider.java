package com.xuexiang.xui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class XRangeSlider extends View {
    private static final float DEFAULT_BIG_SCALE_WITH = 1.7f;
    private static final int DEFAULT_MAX = 100;
    private static final float DEFAULT_MIDDLE_SCALE_WITH = 1.2f;
    private static final float DEFAULT_SMALL_SCALE_WITH = 1.0f;
    private static int DEFAULT_TEXT_MIN_SPACE;
    private static int DEFAULT_TOUCH_TARGET_SIZE;
    private Bitmap mBubbleBitmap;
    private float mConvertFactor;
    private int mInsideRangeColor;
    private float mInsideRangeLineStrokeWidth;
    private boolean mIsFirstInit;
    private boolean mIsLineRound;
    private boolean mIsShowBubble;
    private boolean mIsShowRuler;
    private boolean mIsTouching;
    private boolean mIsTouchingMin;
    private boolean mLastTouchedMin;
    private int mLineEndX;
    private int mLineLength;
    private int mLineStartX;
    private int mMax;
    private int mMaxPosition;
    private Rect mMaxTextRect;
    private int mMiddleY;
    private int mMin;
    private int mMinPosition;
    private Rect mMinTextRect;
    private float mNumberMarginBottom;
    private int mNumberTextColor;
    private float mNumberTextSize;
    private OnRangeSliderListener mOnRangeSliderListener;
    private int mOutsideRangeColor;
    private float mOutsideRangeLineStrokeWidth;
    private final Paint mPaint;
    private int mRange;
    private float mRuleTextMarginTop;
    private int mRulerColor;
    private float mRulerDividerHeight;
    private int mRulerInterval;
    private float mRulerMarginTop;
    private int mRulerTextColor;
    private Rect mRulerTextRect;
    private float mRulerTextSize;
    private Bitmap mSliderIcon;
    private Bitmap mSliderIconFocus;
    private int mStartingMax;
    private int mStartingMin;
    private Set<Integer> mTouchingMaxTarget;
    private Set<Integer> mTouchingMinTarget;
    private int mVerticalPadding;

    public interface OnRangeSliderListener {
        void onMaxChanged(XRangeSlider xRangeSlider, int i4);

        void onMinChanged(XRangeSlider xRangeSlider, int i4);
    }

    public XRangeSlider(Context context) {
        this(context, null);
    }

    private void calculateConvertFactor() {
        this.mConvertFactor = this.mRange / this.mLineLength;
    }

    private void callMaxChangedCallbacks() {
        OnRangeSliderListener onRangeSliderListener = this.mOnRangeSliderListener;
        if (onRangeSliderListener != null) {
            onRangeSliderListener.onMaxChanged(this, getSelectedMax());
        }
    }

    private void callMinChangedCallbacks() {
        OnRangeSliderListener onRangeSliderListener = this.mOnRangeSliderListener;
        if (onRangeSliderListener != null) {
            onRangeSliderListener.onMinChanged(this, getSelectedMin());
        }
    }

    private boolean checkTouchingMaxTarget(int i4, MotionEvent motionEvent) {
        if (!isTouchingMaxTarget(i4, motionEvent)) {
            return false;
        }
        this.mLastTouchedMin = false;
        this.mTouchingMaxTarget.add(Integer.valueOf(motionEvent.getPointerId(i4)));
        return true;
    }

    private boolean checkTouchingMinTarget(int i4, MotionEvent motionEvent) {
        if (!isTouchingMinTarget(i4, motionEvent)) {
            return false;
        }
        this.mLastTouchedMin = true;
        this.mTouchingMinTarget.add(Integer.valueOf(motionEvent.getPointerId(i4)));
        return true;
    }

    private <T extends Number> T clamp(T t3, T t4, T t5) {
        return t3.doubleValue() > t5.doubleValue() ? t5 : t3.doubleValue() < t4.doubleValue() ? t4 : t3;
    }

    private void drawEntireRangeLine(Canvas canvas) {
        this.mPaint.setColor(this.mOutsideRangeColor);
        this.mPaint.setStrokeWidth(this.mOutsideRangeLineStrokeWidth);
        float f4 = this.mLineStartX;
        int i4 = this.mMiddleY;
        canvas.drawLine(f4, i4, this.mLineEndX, i4, this.mPaint);
        if (this.mIsLineRound) {
            canvas.drawCircle(this.mLineStartX, this.mMiddleY, this.mOutsideRangeLineStrokeWidth / 2.0f, this.mPaint);
            canvas.drawCircle(this.mLineEndX, this.mMiddleY, this.mOutsideRangeLineStrokeWidth / 2.0f, this.mPaint);
        }
    }

    private void drawRuler(Canvas canvas) {
        float height;
        if (this.mIsShowRuler) {
            float f4 = this.mLineStartX;
            int i4 = this.mRulerInterval;
            float f5 = this.mLineLength;
            int i5 = this.mMax;
            float f6 = (f5 / ((i5 - r6) / (i4 / 10))) / (i4 / 10);
            float f7 = f4;
            boolean z3 = false;
            boolean z4 = false;
            for (int i6 = this.mMin; i6 <= this.mMax; i6++) {
                int i7 = this.mRulerInterval;
                if (i6 % i7 == 0) {
                    height = this.mMiddleY + (this.mSliderIcon.getHeight() / 2.0f) + this.mRulerMarginTop;
                    float f8 = height + (this.mRulerDividerHeight * 3.0f);
                    this.mPaint.setColor(this.mRulerTextColor);
                    this.mPaint.setTextSize(this.mRulerTextSize);
                    getRulerTextBounds(String.valueOf(i6), this.mRulerTextRect);
                    canvas.drawText(String.valueOf(i6), f7 - (this.mRulerTextRect.width() / 2.0f), this.mRulerTextRect.height() + f8 + this.mRuleTextMarginTop, this.mPaint);
                    if (i6 == this.mMin) {
                        z4 = true;
                    }
                    if (i6 == this.mMax) {
                        z3 = true;
                    }
                    this.mPaint.setStrokeWidth(DEFAULT_BIG_SCALE_WITH);
                    this.mPaint.setColor(this.mRulerColor);
                    canvas.drawLine(f7, height, f7, f8, this.mPaint);
                } else if (i6 % (i7 / 2) == 0) {
                    height = this.mMiddleY + (this.mSliderIcon.getHeight() / 2.0f) + this.mRulerMarginTop;
                    float f9 = height + (this.mRulerDividerHeight * 2.0f);
                    this.mPaint.setStrokeWidth(DEFAULT_MIDDLE_SCALE_WITH);
                    this.mPaint.setColor(this.mRulerColor);
                    canvas.drawLine(f7, height, f7, f9, this.mPaint);
                } else {
                    height = this.mMiddleY + (this.mSliderIcon.getHeight() / 2.0f) + this.mRulerMarginTop;
                    float f10 = height + this.mRulerDividerHeight;
                    this.mPaint.setStrokeWidth(1.0f);
                    if (i6 % (this.mRulerInterval / 10) == 0) {
                        this.mPaint.setColor(this.mRulerColor);
                        canvas.drawLine(f7, height, f7, f10, this.mPaint);
                    }
                }
                if ((i6 == this.mMax && !z3) || (i6 == this.mMin && !z4)) {
                    this.mPaint.setColor(this.mRulerTextColor);
                    this.mPaint.setTextSize(this.mRulerTextSize);
                    getRulerTextBounds(String.valueOf(i6), this.mRulerTextRect);
                    float fWidth = f7 - (this.mRulerTextRect.width() / 2.0f);
                    if (i6 == this.mMax && i6 % this.mRulerInterval == 1) {
                        fWidth = DEFAULT_TEXT_MIN_SPACE + f7;
                    }
                    if (i6 == this.mMin) {
                        int i8 = this.mRulerInterval;
                        if (i6 % i8 == i8 - 1) {
                            fWidth = (f7 - (this.mRulerTextRect.width() / 2.0f)) - DEFAULT_TEXT_MIN_SPACE;
                        }
                    }
                    canvas.drawText(String.valueOf(i6), fWidth, height + (this.mRulerDividerHeight * 3.0f) + this.mRulerTextRect.height() + this.mRuleTextMarginTop, this.mPaint);
                }
                f7 += f6;
            }
        }
    }

    private void drawSelectedNumber(Canvas canvas) {
        float height;
        String strValueOf = String.valueOf(getSelectedMin());
        String strValueOf2 = String.valueOf(getSelectedMax());
        getTextBounds(strValueOf, this.mMinTextRect);
        getTextBounds(strValueOf2, this.mMaxTextRect);
        float width = this.mMinPosition - (this.mBubbleBitmap.getWidth() / 2.0f);
        float width2 = this.mMaxPosition - (this.mBubbleBitmap.getWidth() / 2.0f);
        int width3 = this.mBubbleBitmap.getWidth() + 5;
        if (this.mIsTouching && this.mTouchingMaxTarget.size() > 0) {
            float f4 = width3;
            if (Math.abs(width2 - width) <= f4) {
                width2 = width + f4;
                int i4 = this.mLineEndX;
                float f5 = f4 / 2.0f;
                if (width2 > i4 - f5) {
                    width2 = i4 - f5;
                }
            }
        }
        if (this.mIsTouching && this.mTouchingMinTarget.size() > 0) {
            float f6 = width3;
            if (Math.abs(width2 - width) <= f6) {
                width = width2 - f6;
                int i5 = this.mLineStartX;
                if (width < i5) {
                    width = i5;
                }
            }
        }
        float f7 = width3;
        if (Math.abs(width2 - width) <= f7) {
            if (this.mIsTouchingMin) {
                width = width2 - f7;
                int i6 = this.mLineStartX;
                float f8 = f7 / 2.0f;
                if (width < i6 + f8) {
                    width = i6 + f8;
                    width2 = width + f7;
                }
            } else {
                width2 = width + f7;
                int i7 = this.mLineEndX;
                float f9 = f7 / 2.0f;
                if (width2 > i7 - f9) {
                    width2 = i7 - f9;
                    width = width2 - f7;
                }
            }
        }
        if (this.mIsShowBubble) {
            float height2 = ((this.mMiddleY - (this.mSliderIcon.getHeight() / 2.0f)) - this.mBubbleBitmap.getHeight()) - this.mNumberMarginBottom;
            height = (((this.mBubbleBitmap.getHeight() / 2.0f) + height2) + (this.mMinTextRect.height() / 2.0f)) - 6.0f;
            canvas.drawBitmap(this.mBubbleBitmap, width2, height2, this.mPaint);
            canvas.drawBitmap(this.mBubbleBitmap, width, height2, this.mPaint);
        } else {
            height = (this.mMiddleY - (this.mSliderIcon.getHeight() / 2.0f)) - this.mNumberMarginBottom;
        }
        float fWidth = this.mMinPosition - (this.mMinTextRect.width() / 2.0f);
        float fWidth2 = (this.mMaxPosition - (this.mMaxTextRect.width() / 2.0f)) - 6.0f;
        int width4 = this.mIsShowBubble ? this.mBubbleBitmap.getWidth() : getMaxTextLength() + 5;
        if (this.mIsTouching && this.mTouchingMaxTarget.size() > 0) {
            float f10 = width4;
            if (Math.abs(fWidth2 - fWidth) <= f10) {
                fWidth2 = fWidth + f10;
                int i8 = this.mLineEndX;
                float f11 = f10 / 2.0f;
                if (fWidth2 > i8 - f11) {
                    fWidth2 = i8 - f11;
                }
            }
        }
        if (this.mIsTouching && this.mTouchingMinTarget.size() > 0) {
            float f12 = width4;
            if (Math.abs(fWidth2 - fWidth) <= f12) {
                fWidth = fWidth2 - f12;
                int i9 = this.mLineStartX;
                if (fWidth < i9) {
                    fWidth = i9;
                }
            }
        }
        float f13 = width4;
        if (Math.abs(fWidth2 - fWidth) <= f13) {
            if (this.mIsTouchingMin) {
                fWidth = fWidth2 - f13;
                int i10 = this.mLineStartX;
                float f14 = f13 / 2.0f;
                if (fWidth < i10 + f14) {
                    fWidth = i10 + f14;
                    fWidth2 = fWidth + f13;
                }
            } else {
                fWidth2 = fWidth + f13;
                int i11 = this.mLineEndX;
                float f15 = f13 / 2.0f;
                if (fWidth2 > i11 - f15) {
                    fWidth2 = i11 - f15;
                    fWidth = fWidth2 - f13;
                }
            }
        }
        this.mPaint.setTextSize(this.mNumberTextSize);
        this.mPaint.setColor(this.mNumberTextColor);
        canvas.drawText(strValueOf, fWidth, height, this.mPaint);
        this.mPaint.setColor(this.mNumberTextColor);
        canvas.drawText(strValueOf2, fWidth2, height, this.mPaint);
    }

    private void drawSelectedRangeLine(Canvas canvas) {
        this.mPaint.setStrokeWidth(this.mInsideRangeLineStrokeWidth);
        this.mPaint.setColor(this.mInsideRangeColor);
        float f4 = this.mMinPosition;
        int i4 = this.mMiddleY;
        canvas.drawLine(f4, i4, this.mMaxPosition, i4, this.mPaint);
    }

    private void drawSelectedTargets(Canvas canvas) {
        this.mPaint.setColor(this.mInsideRangeColor);
        canvas.drawCircle(this.mMinPosition, this.mMiddleY, DensityUtils.dp2px(3.0f), this.mPaint);
        canvas.drawCircle(this.mMaxPosition, this.mMiddleY, DensityUtils.dp2px(3.0f), this.mPaint);
        if (!this.mIsTouching) {
            canvas.drawBitmap(this.mSliderIcon, this.mMaxPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIcon.getWidth() / 2.0f), this.mPaint);
            canvas.drawBitmap(this.mSliderIcon, this.mMinPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIcon.getWidth() / 2.0f), this.mPaint);
            return;
        }
        if (this.mLastTouchedMin) {
            canvas.drawBitmap(this.mSliderIconFocus, this.mMinPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIconFocus.getWidth() / 2.0f), this.mPaint);
            canvas.drawBitmap(this.mSliderIcon, this.mMaxPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIcon.getWidth() / 2.0f), this.mPaint);
            return;
        }
        canvas.drawBitmap(this.mSliderIcon, this.mMinPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIcon.getWidth() / 2.0f), this.mPaint);
        canvas.drawBitmap(this.mSliderIconFocus, this.mMaxPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIconFocus.getWidth() / 2.0f), this.mPaint);
    }

    private int getMaxTextLength() {
        getTextBounds(String.valueOf(this.mMax), this.mMaxTextRect);
        return this.mMaxTextRect.width();
    }

    private int getMinTextLength() {
        getTextBounds(String.valueOf(this.mMin), this.mMinTextRect);
        return this.mMinTextRect.width();
    }

    private void getRulerTextBounds(String str, Rect rect) {
        this.mPaint.setTextSize(this.mRulerTextSize);
        this.mPaint.getTextBounds(str, 0, str.length(), rect);
    }

    private void getTextBounds(String str, Rect rect) {
        this.mPaint.setTextSize(this.mNumberTextSize);
        this.mPaint.getTextBounds(str, 0, str.length(), rect);
    }

    private boolean isTouchingMaxTarget(int i4, MotionEvent motionEvent) {
        return motionEvent.getX(i4) > ((float) (this.mMaxPosition - DEFAULT_TOUCH_TARGET_SIZE)) && motionEvent.getX(i4) < ((float) (this.mMaxPosition + DEFAULT_TOUCH_TARGET_SIZE)) && motionEvent.getY(i4) > ((float) (this.mMiddleY - DEFAULT_TOUCH_TARGET_SIZE)) && motionEvent.getY(i4) < ((float) (this.mMiddleY + DEFAULT_TOUCH_TARGET_SIZE));
    }

    private boolean isTouchingMinTarget(int i4, MotionEvent motionEvent) {
        return motionEvent.getX(i4) > ((float) (this.mMinPosition - DEFAULT_TOUCH_TARGET_SIZE)) && motionEvent.getX(i4) < ((float) (this.mMinPosition + DEFAULT_TOUCH_TARGET_SIZE)) && motionEvent.getY(i4) > ((float) (this.mMiddleY - DEFAULT_TOUCH_TARGET_SIZE)) && motionEvent.getY(i4) < ((float) (this.mMiddleY + DEFAULT_TOUCH_TARGET_SIZE));
    }

    private void jumpToPosition(int i4, MotionEvent motionEvent) {
        if (motionEvent.getX(i4) > this.mMaxPosition && motionEvent.getX(i4) <= this.mLineEndX) {
            this.mMaxPosition = (int) motionEvent.getX(i4);
            invalidate();
            callMaxChangedCallbacks();
        } else {
            if (motionEvent.getX(i4) >= this.mMinPosition || motionEvent.getX(i4) < this.mLineStartX) {
                return;
            }
            this.mMinPosition = (int) motionEvent.getX(i4);
            invalidate();
            callMinChangedCallbacks();
        }
    }

    private void setSelectedMax(int i4) {
        this.mMaxPosition = Math.round(((i4 - this.mMin) / this.mConvertFactor) + this.mLineStartX);
        callMaxChangedCallbacks();
    }

    private void setSelectedMin(int i4) {
        this.mMinPosition = Math.round(((i4 - this.mMin) / this.mConvertFactor) + this.mLineStartX);
        callMinChangedCallbacks();
    }

    private void updateTouchStatus(boolean z3) {
        this.mIsTouching = z3;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    public int getMax() {
        return this.mMax;
    }

    public int getMin() {
        return this.mMin;
    }

    public int getSelectedMax() {
        return Math.round(((this.mMaxPosition - this.mLineStartX) * this.mConvertFactor) + this.mMin);
    }

    public int getSelectedMin() {
        return Math.round(((this.mMinPosition - this.mLineStartX) * this.mConvertFactor) + this.mMin);
    }

    public void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        DEFAULT_TOUCH_TARGET_SIZE = DensityUtils.dp2px(20.0f);
        DEFAULT_TEXT_MIN_SPACE = DensityUtils.dp2px(2.0f);
        int iResolveColor = ThemeUtils.resolveColor(context, C2042R.attr.colorAccent);
        int iResolveColor2 = ThemeUtils.resolveColor(context, C2042R.attr.colorControlNormal);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XRangeSlider, i4, 0);
            this.mVerticalPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_verticalPadding, DensityUtils.dp2px(10.0f));
            this.mInsideRangeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XRangeSlider_xrs_insideRangeLineColor, iResolveColor);
            this.mOutsideRangeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XRangeSlider_xrs_outsideRangeLineColor, ResUtils.getColor(C2042R.color.default_xrs_outside_line_color));
            this.mInsideRangeLineStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_insideRangeLineStrokeWidth, DensityUtils.dp2px(5.0f));
            this.mOutsideRangeLineStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_outsideRangeLineStrokeWidth, DensityUtils.dp2px(5.0f));
            this.mMin = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XRangeSlider_xrs_min, this.mMin);
            this.mMax = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XRangeSlider_xrs_max, this.mMax);
            Resources resources = getResources();
            int i5 = C2042R.styleable.XRangeSlider_xrs_sliderIcon;
            int i6 = C2042R.drawable.xui_ic_slider_icon;
            this.mSliderIcon = BitmapFactory.decodeResource(resources, typedArrayObtainStyledAttributes.getResourceId(i5, i6));
            this.mSliderIconFocus = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.XRangeSlider_xrs_sliderIconFocus, i6));
            this.mIsLineRound = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XRangeSlider_xrs_isLineRound, true);
            this.mIsShowBubble = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XRangeSlider_xrs_isShowBubble, false);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XRangeSlider_xrs_isFitColor, true);
            this.mNumberTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XRangeSlider_xrs_numberTextColor, iResolveColor);
            this.mNumberTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_numberTextSize, DensityUtils.sp2px(12.0f));
            this.mNumberMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_numberMarginBottom, DensityUtils.dp2px(2.0f));
            if (z3) {
                if (this.mIsShowBubble) {
                    this.mNumberTextColor = -1;
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.XRangeSlider_xrs_bubbleResource, C2042R.drawable.xui_bg_bubble_blue));
                if (bitmapDecodeResource != null) {
                    this.mBubbleBitmap = bitmapDecodeResource.copy(Bitmap.Config.ARGB_8888, true);
                    new Canvas(this.mBubbleBitmap).drawColor(this.mInsideRangeColor, PorterDuff.Mode.SRC_IN);
                }
            } else {
                this.mBubbleBitmap = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.XRangeSlider_xrs_bubbleResource, C2042R.drawable.xui_bg_bubble_blue));
            }
            this.mIsShowRuler = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XRangeSlider_xrs_isShowRuler, false);
            this.mRulerColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XRangeSlider_xrs_rulerColor, iResolveColor2);
            this.mRulerTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XRangeSlider_xrs_rulerTextColor, iResolveColor2);
            this.mRulerTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_rulerTextSize, DensityUtils.sp2px(12.0f));
            this.mRulerMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_rulerMarginTop, DensityUtils.dp2px(4.0f));
            this.mRulerDividerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_rulerDividerHeight, DensityUtils.dp2px(4.0f));
            this.mRuleTextMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XRangeSlider_xrs_rulerTextMarginTop, DensityUtils.dp2px(4.0f));
            this.mRulerInterval = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XRangeSlider_xrs_rulerInterval, 20);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mRange = this.mMax - this.mMin;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        drawEntireRangeLine(canvas);
        drawSelectedRangeLine(canvas);
        drawSelectedNumber(canvas);
        drawRuler(canvas);
        drawSelectedTargets(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        getTextBounds(String.valueOf(this.mMin), this.mMinTextRect);
        getTextBounds(String.valueOf(this.mMax), this.mMaxTextRect);
        int height = this.mIsShowBubble ? ((int) (this.mSliderIcon.getHeight() + this.mNumberMarginBottom)) + this.mBubbleBitmap.getHeight() : (int) (this.mSliderIcon.getHeight() + this.mNumberMarginBottom + this.mMinTextRect.height());
        int iHeight = (int) (this.mRulerMarginTop + (this.mRulerDividerHeight * 3.0f) + this.mRuleTextMarginTop + this.mRulerTextRect.height());
        if (this.mIsShowRuler) {
            getRulerTextBounds(String.valueOf(this.mMin), this.mRulerTextRect);
            height += iHeight;
        }
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, size);
        }
        if (mode2 != 1073741824) {
            size2 = height;
        }
        int i6 = size2 + this.mVerticalPadding;
        int width = this.mIsShowBubble ? this.mBubbleBitmap.getWidth() : Math.max(this.mSliderIcon.getWidth(), this.mMaxTextRect.width());
        this.mLineLength = size - width;
        this.mMiddleY = this.mIsShowRuler ? (i6 - iHeight) - (this.mSliderIcon.getHeight() / 2) : i6 - (this.mSliderIcon.getHeight() / 2);
        int i7 = width / 2;
        this.mLineStartX = i7;
        this.mLineEndX = this.mLineLength + i7;
        calculateConvertFactor();
        if (this.mIsFirstInit) {
            int i8 = this.mStartingMin;
            if (i8 == -1) {
                i8 = this.mMin;
            }
            setSelectedMin(i8);
            int i9 = this.mStartingMax;
            if (i9 == -1) {
                i9 = this.mMax;
            }
            setSelectedMax(i9);
        }
        setMeasuredDimension(size, i6 + this.mVerticalPadding);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.XRangeSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void reset() {
        this.mMinPosition = this.mLineStartX;
        this.mMaxPosition = this.mLineEndX;
        OnRangeSliderListener onRangeSliderListener = this.mOnRangeSliderListener;
        if (onRangeSliderListener != null) {
            onRangeSliderListener.onMinChanged(this, getSelectedMin());
            this.mOnRangeSliderListener.onMaxChanged(this, getSelectedMax());
        }
        invalidate();
    }

    public void setMax(int i4) {
        this.mMax = i4;
        this.mRange = i4 - this.mMin;
    }

    public void setMin(int i4) {
        this.mMin = i4;
        this.mRange = this.mMax - i4;
    }

    public void setOnRangeSliderListener(OnRangeSliderListener onRangeSliderListener) {
        this.mOnRangeSliderListener = onRangeSliderListener;
    }

    public void setStartingMinMax(int i4, int i5) {
        this.mStartingMin = i4;
        this.mStartingMax = i5;
        setSelectedMin(i4);
        setSelectedMax(i5);
        invalidate();
    }

    public XRangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.XRangeSliderStyle);
    }

    public XRangeSlider(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPaint = new Paint(1);
        this.mMinPosition = 0;
        this.mMaxPosition = 0;
        this.mMiddleY = 0;
        this.mStartingMin = -1;
        this.mStartingMax = -1;
        this.mIsFirstInit = true;
        this.mIsTouching = false;
        this.mMinTextRect = new Rect();
        this.mMaxTextRect = new Rect();
        this.mRulerTextRect = new Rect();
        this.mTouchingMinTarget = new HashSet();
        this.mTouchingMaxTarget = new HashSet();
        this.mMin = 0;
        this.mMax = 100;
        initAttrs(context, attributeSet, i4);
    }
}
