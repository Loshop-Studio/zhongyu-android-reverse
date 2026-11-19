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
public class XSeekBar extends View {
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
    private boolean mIsShowNumber;
    private boolean mIsShowRuler;
    private boolean mIsTouching;
    private boolean mLastTouchedMin;
    private int mLineEndX;
    private int mLineLength;
    private int mLineStartX;
    private int mMax;
    private int mMaxPosition;
    private Rect mMaxTextRect;
    private int mMiddleY;
    private int mMin;
    private float mNumberMarginBottom;
    private int mNumberTextColor;
    private float mNumberTextSize;
    private OnSeekBarListener mOnSeekBarListener;
    private int mOutsideRangeColor;
    private float mOutsideRangeLineStrokeWidth;
    private final Paint mPaint;
    private int mRange;
    private int mRulerColor;
    private float mRulerDividerHeight;
    private int mRulerInterval;
    private float mRulerMarginTop;
    private int mRulerTextColor;
    private float mRulerTextMarginTop;
    private Rect mRulerTextRect;
    private float mRulerTextSize;
    private int mSelectedNumber;
    private Bitmap mSliderIcon;
    private Bitmap mSliderIconFocus;
    private Set<Integer> mTouchingMaxTarget;
    private Set<Integer> mTouchingMinTarget;
    private int mVerticalPadding;

    public interface OnSeekBarListener {
        void onValueChanged(XSeekBar xSeekBar, int i4);
    }

    public XSeekBar(Context context) {
        this(context, null);
    }

    private void calculateConvertFactor() {
        this.mConvertFactor = this.mRange / this.mLineLength;
    }

    private void callMaxChangedCallbacks() {
        OnSeekBarListener onSeekBarListener = this.mOnSeekBarListener;
        if (onSeekBarListener != null) {
            onSeekBarListener.onValueChanged(this, getSelectedNumber());
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
            this.mPaint.setColor(this.mInsideRangeColor);
            canvas.drawCircle(this.mLineStartX, this.mMiddleY, this.mOutsideRangeLineStrokeWidth / 2.0f, this.mPaint);
            this.mPaint.setColor(this.mOutsideRangeColor);
            canvas.drawCircle(this.mLineEndX, this.mMiddleY, this.mOutsideRangeLineStrokeWidth / 2.0f, this.mPaint);
        }
    }

    private void drawRuler(Canvas canvas) {
        float height;
        if (this.mIsShowRuler) {
            float f4 = this.mLineStartX;
            float f5 = this.mRulerInterval / 10.0f;
            float f6 = this.mLineLength;
            int i4 = this.mMax;
            float f7 = (f6 / ((i4 - r5) / f5)) / f5;
            float f8 = f4;
            boolean z3 = false;
            boolean z4 = false;
            for (int i5 = this.mMin; i5 <= this.mMax; i5++) {
                int i6 = this.mRulerInterval;
                if (i5 % i6 == 0) {
                    height = this.mMiddleY + (this.mSliderIcon.getHeight() / 2.0f) + this.mRulerMarginTop;
                    float f9 = height + (this.mRulerDividerHeight * 3.0f);
                    this.mPaint.setColor(this.mRulerTextColor);
                    this.mPaint.setTextSize(this.mRulerTextSize);
                    getRulerTextBounds(String.valueOf(i5), this.mRulerTextRect);
                    canvas.drawText(String.valueOf(i5), f8 - (this.mRulerTextRect.width() / 2.0f), this.mRulerTextRect.height() + f9 + this.mRulerTextMarginTop, this.mPaint);
                    if (i5 == this.mMin) {
                        z4 = true;
                    }
                    if (i5 == this.mMax) {
                        z3 = true;
                    }
                    this.mPaint.setStrokeWidth(DEFAULT_BIG_SCALE_WITH);
                    this.mPaint.setColor(this.mRulerColor);
                    canvas.drawLine(f8, height, f8, f9, this.mPaint);
                } else if (i5 % (i6 / 2) == 0 && i6 % 10 == 0) {
                    height = this.mMiddleY + (this.mSliderIcon.getHeight() / 2.0f) + this.mRulerMarginTop;
                    float f10 = height + (this.mRulerDividerHeight * 2.0f);
                    this.mPaint.setStrokeWidth(DEFAULT_MIDDLE_SCALE_WITH);
                    this.mPaint.setColor(this.mRulerColor);
                    canvas.drawLine(f8, height, f8, f10, this.mPaint);
                } else {
                    height = this.mMiddleY + (this.mSliderIcon.getHeight() / 2.0f) + this.mRulerMarginTop;
                    float f11 = height + this.mRulerDividerHeight;
                    this.mPaint.setStrokeWidth(1.0f);
                    if (i5 % (this.mRulerInterval / 10) == 0) {
                        this.mPaint.setColor(this.mRulerColor);
                        canvas.drawLine(f8, height, f8, f11, this.mPaint);
                    }
                }
                if ((i5 == this.mMax && !z3) || (i5 == this.mMin && !z4)) {
                    this.mPaint.setColor(this.mRulerTextColor);
                    this.mPaint.setTextSize(this.mRulerTextSize);
                    getRulerTextBounds(String.valueOf(i5), this.mRulerTextRect);
                    float fWidth = f8 - (this.mRulerTextRect.width() / 2.0f);
                    if (i5 == this.mMax && i5 % this.mRulerInterval == 1) {
                        fWidth = DEFAULT_TEXT_MIN_SPACE + f8;
                    }
                    if (i5 == this.mMin) {
                        int i7 = this.mRulerInterval;
                        if (i5 % i7 == i7 - 1) {
                            fWidth = (f8 - (this.mRulerTextRect.width() / 2.0f)) - DEFAULT_TEXT_MIN_SPACE;
                        }
                    }
                    canvas.drawText(String.valueOf(i5), fWidth, height + (this.mRulerDividerHeight * 3.0f) + this.mRulerTextRect.height() + this.mRulerTextMarginTop, this.mPaint);
                }
                f8 += f7;
            }
        }
    }

    private void drawSelectedNumber(Canvas canvas) {
        float height;
        String strValueOf = String.valueOf(getSelectedNumber());
        getTextBounds(strValueOf, this.mMaxTextRect);
        if (this.mIsShowBubble) {
            float height2 = ((this.mMiddleY - (this.mSliderIcon.getHeight() / 2.0f)) - this.mBubbleBitmap.getHeight()) - this.mNumberMarginBottom;
            height = (((this.mBubbleBitmap.getHeight() / 2.0f) + height2) + (this.mMaxTextRect.height() / 2.0f)) - 6.0f;
            canvas.drawBitmap(this.mBubbleBitmap, this.mMaxPosition - (r4.getWidth() / 2.0f), height2, this.mPaint);
        } else {
            height = (this.mMiddleY - (this.mSliderIcon.getHeight() / 2.0f)) - this.mNumberMarginBottom;
        }
        this.mPaint.setTextSize(this.mNumberTextSize);
        this.mPaint.setColor(this.mNumberTextColor);
        canvas.drawText(strValueOf, this.mMaxPosition - (this.mMaxTextRect.width() / 2.0f), height, this.mPaint);
    }

    private void drawSelectedRangeLine(Canvas canvas) {
        this.mPaint.setStrokeWidth(this.mInsideRangeLineStrokeWidth);
        this.mPaint.setColor(this.mInsideRangeColor);
        float f4 = this.mLineStartX;
        int i4 = this.mMiddleY;
        canvas.drawLine(f4, i4, this.mMaxPosition, i4, this.mPaint);
    }

    private void drawSelectedTargets(Canvas canvas) {
        this.mPaint.setColor(this.mInsideRangeColor);
        canvas.drawCircle(this.mMaxPosition, this.mMiddleY, DensityUtils.dp2px(3.0f), this.mPaint);
        if (this.mIsTouching) {
            canvas.drawBitmap(this.mSliderIconFocus, this.mMaxPosition - (this.mSliderIcon.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIcon.getWidth() / 2.0f), this.mPaint);
        } else {
            canvas.drawBitmap(this.mSliderIcon, this.mMaxPosition - (r0.getWidth() / 2.0f), this.mMiddleY - (this.mSliderIcon.getWidth() / 2.0f), this.mPaint);
        }
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
        return false;
    }

    private void jumpToPosition(int i4, MotionEvent motionEvent) {
        if (motionEvent.getX(i4) > this.mMaxPosition && motionEvent.getX(i4) <= this.mLineEndX) {
            this.mMaxPosition = (int) motionEvent.getX(i4);
            invalidate();
            callMaxChangedCallbacks();
        } else {
            if (motionEvent.getX(i4) >= this.mMaxPosition || motionEvent.getX(i4) < this.mLineStartX) {
                return;
            }
            this.mMaxPosition = (int) motionEvent.getX(i4);
            invalidate();
            callMaxChangedCallbacks();
        }
    }

    private void setSelectedValue(int i4) {
        this.mMaxPosition = Math.round(((i4 - this.mMin) / this.mConvertFactor) + this.mLineStartX);
        callMaxChangedCallbacks();
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

    public int getSelectedNumber() {
        return Math.round(((this.mMaxPosition - this.mLineStartX) * this.mConvertFactor) + this.mMin);
    }

    public void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        DEFAULT_TOUCH_TARGET_SIZE = DensityUtils.dp2px(20.0f);
        DEFAULT_TEXT_MIN_SPACE = DensityUtils.dp2px(2.0f);
        int iResolveColor = ThemeUtils.resolveColor(context, C2042R.attr.colorAccent);
        int iResolveColor2 = ThemeUtils.resolveColor(context, C2042R.attr.colorControlNormal);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XSeekBar, i4, 0);
            this.mVerticalPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_verticalPadding, DensityUtils.dp2px(10.0f));
            this.mInsideRangeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XSeekBar_xsb_insideRangeLineColor, iResolveColor);
            this.mOutsideRangeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XSeekBar_xsb_outsideRangeLineColor, ResUtils.getColor(C2042R.color.default_xrs_outside_line_color));
            this.mInsideRangeLineStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_insideRangeLineStrokeWidth, DensityUtils.dp2px(5.0f));
            this.mOutsideRangeLineStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_outsideRangeLineStrokeWidth, DensityUtils.dp2px(5.0f));
            this.mMin = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XSeekBar_xsb_min, this.mMin);
            this.mMax = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XSeekBar_xsb_max, this.mMax);
            Resources resources = getResources();
            int i5 = C2042R.styleable.XSeekBar_xsb_sliderIcon;
            int i6 = C2042R.drawable.xui_ic_slider_icon;
            this.mSliderIcon = BitmapFactory.decodeResource(resources, typedArrayObtainStyledAttributes.getResourceId(i5, i6));
            this.mSliderIconFocus = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.XSeekBar_xsb_sliderIconFocus, i6));
            this.mIsLineRound = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XSeekBar_xsb_isLineRound, true);
            this.mIsShowBubble = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XSeekBar_xsb_isShowBubble, false);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XSeekBar_xsb_isFitColor, true);
            this.mIsShowNumber = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XSeekBar_xsb_isShowNumber, true);
            this.mNumberTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XSeekBar_xsb_numberTextColor, iResolveColor);
            this.mNumberTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_numberTextSize, DensityUtils.sp2px(12.0f));
            this.mNumberMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_numberMarginBottom, DensityUtils.dp2px(2.0f));
            if (z3) {
                if (this.mIsShowBubble) {
                    this.mNumberTextColor = -1;
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.XSeekBar_xsb_bubbleResource, C2042R.drawable.xui_bg_bubble_blue));
                if (bitmapDecodeResource != null) {
                    this.mBubbleBitmap = bitmapDecodeResource.copy(Bitmap.Config.ARGB_8888, true);
                    new Canvas(this.mBubbleBitmap).drawColor(this.mInsideRangeColor, PorterDuff.Mode.SRC_IN);
                }
            } else {
                this.mBubbleBitmap = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.XSeekBar_xsb_bubbleResource, C2042R.drawable.xui_bg_bubble_blue));
            }
            this.mIsShowRuler = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XSeekBar_xsb_isShowRuler, false);
            this.mRulerColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XSeekBar_xsb_rulerColor, iResolveColor2);
            this.mRulerTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XSeekBar_xsb_rulerTextColor, iResolveColor2);
            this.mRulerTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_rulerTextSize, DensityUtils.sp2px(12.0f));
            this.mRulerMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_rulerMarginTop, DensityUtils.dp2px(4.0f));
            this.mRulerDividerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_rulerDividerHeight, DensityUtils.dp2px(4.0f));
            this.mRulerTextMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XSeekBar_xsb_rulerTextMarginTop, DensityUtils.dp2px(4.0f));
            this.mRulerInterval = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XSeekBar_xsb_rulerInterval, 20);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mRange = this.mMax - this.mMin;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        drawEntireRangeLine(canvas);
        drawSelectedRangeLine(canvas);
        if (this.mIsShowNumber) {
            drawSelectedNumber(canvas);
        }
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
        getTextBounds(String.valueOf(this.mMax), this.mMaxTextRect);
        boolean z3 = this.mIsShowNumber;
        int height = (z3 && this.mIsShowBubble) ? ((int) (this.mSliderIcon.getHeight() + this.mNumberMarginBottom)) + this.mBubbleBitmap.getHeight() : z3 ? (int) (this.mSliderIcon.getHeight() + this.mNumberMarginBottom) : this.mSliderIcon.getHeight();
        int iHeight = (int) (this.mRulerMarginTop + (this.mRulerDividerHeight * 3.0f) + this.mRulerTextMarginTop + this.mRulerTextRect.height());
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
            int i8 = this.mSelectedNumber;
            if (i8 == -1) {
                i8 = this.mMax;
            }
            setSelectedValue(i8);
        }
        setMeasuredDimension(size, i6 + this.mVerticalPadding);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.XSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void reset() {
        this.mMaxPosition = this.mLineEndX;
        OnSeekBarListener onSeekBarListener = this.mOnSeekBarListener;
        if (onSeekBarListener != null) {
            onSeekBarListener.onValueChanged(this, getSelectedNumber());
        }
        invalidate();
    }

    public void setDefaultValue(int i4) {
        this.mSelectedNumber = i4;
        setSelectedValue(i4);
        invalidate();
    }

    public void setInterval(int i4) {
        this.mRulerInterval = i4;
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

    public void setOnSeekBarListener(OnSeekBarListener onSeekBarListener) {
        this.mOnSeekBarListener = onSeekBarListener;
    }

    public XSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.XSeekBarStyle);
    }

    public XSeekBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPaint = new Paint(1);
        this.mMaxPosition = 0;
        this.mMiddleY = 0;
        this.mMaxTextRect = new Rect();
        this.mRulerTextRect = new Rect();
        this.mTouchingMinTarget = new HashSet();
        this.mTouchingMaxTarget = new HashSet();
        this.mIsTouching = false;
        this.mSelectedNumber = -1;
        this.mIsFirstInit = true;
        this.mMax = 100;
        this.mMin = 0;
        initAttrs(context, attributeSet, i4);
    }
}
