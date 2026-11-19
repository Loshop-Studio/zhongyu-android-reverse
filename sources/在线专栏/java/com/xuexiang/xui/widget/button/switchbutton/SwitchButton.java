package com.xuexiang.xui.widget.button.switchbutton;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.zykj.download.OssUtils;

/* loaded from: classes.dex */
public class SwitchButton extends CompoundButton {
    public static final int DEFAULT_ANIMATION_DURATION = 250;
    public static final int DEFAULT_THUMB_MARGIN_DP = 2;
    public static final float DEFAULT_THUMB_RANGE_RATIO = 1.8f;
    public static final int DEFAULT_THUMB_SIZE_DP = 20;
    public static final int DEFAULT_TINT_COLOR = 3309506;
    private long mAnimationDuration;
    private ColorStateList mBackColor;
    private Drawable mBackDrawable;
    private int mBackHeight;
    private float mBackRadius;
    private RectF mBackRectF;
    private int mBackWidth;
    private boolean mCatch;
    private CompoundButton.OnCheckedChangeListener mChildOnCheckedChangeListener;
    private int mClickTimeout;
    private int mCurrBackColor;
    private int mCurrThumbColor;
    private Drawable mCurrentBackDrawable;
    private boolean mDrawDebugRect;
    private boolean mFadeBack;
    private boolean mIsBackUseDrawable;
    private boolean mIsThumbUseDrawable;
    private float mLastX;
    private int mNextBackColor;
    private Drawable mNextBackDrawable;
    private Layout mOffLayout;
    private int mOffTextColor;
    private Layout mOnLayout;
    private int mOnTextColor;
    private Paint mPaint;
    private RectF mPresentThumbRectF;
    private float mProgress;
    private ObjectAnimator mProgressAnimator;
    private boolean mReady;
    private Paint mRectPaint;
    private boolean mRestoring;
    private RectF mSafeRectF;
    private float mStartX;
    private float mStartY;
    private int mTextAdjust;
    private int mTextExtra;
    private float mTextHeight;
    private CharSequence mTextOff;
    private RectF mTextOffRectF;
    private CharSequence mTextOn;
    private RectF mTextOnRectF;
    private TextPaint mTextPaint;
    private int mTextThumbInset;
    private float mTextWidth;
    private ColorStateList mThumbColor;
    private Drawable mThumbDrawable;
    private int mThumbHeight;
    private RectF mThumbMargin;
    private float mThumbRadius;
    private float mThumbRangeRatio;
    private RectF mThumbRectF;
    private int mThumbWidth;
    private int mTintColor;
    private int mTouchSlop;
    private static int[] CHECKED_PRESSED_STATE = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};
    private static int[] UNCHECKED_PRESSED_STATE = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        };
        CharSequence offText;
        CharSequence onText;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.onText, parcel, i4);
            TextUtils.writeToParcel(this.offText, parcel, i4);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.onText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.offText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mDrawDebugRect = false;
        this.mRestoring = false;
        this.mReady = false;
        this.mCatch = false;
        init(context, attributeSet);
    }

    private void catchView() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.mCatch = true;
    }

    private int ceil(double d4) {
        return (int) Math.ceil(d4);
    }

    private float getProgress() {
        return this.mProgress;
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    private void init(Context context, AttributeSet attributeSet) {
        boolean z3;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mClickTimeout = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.mPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mRectPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mRectPaint.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.mTextPaint = getPaint();
        this.mThumbRectF = new RectF();
        this.mBackRectF = new RectF();
        this.mSafeRectF = new RectF();
        this.mThumbMargin = new RectF();
        this.mTextOnRectF = new RectF();
        this.mTextOffRectF = new RectF();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, OssUtils.PROGRESS, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA).setDuration(250L);
        this.mProgressAnimator = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mPresentThumbRectF = new RectF();
        float f4 = getResources().getDisplayMetrics().density * 2.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.SwitchButton);
        Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.SwitchButton_swb_thumbDrawable);
        ColorStateList colorStateListAttrRes = ResUtils.getColorStateListAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.SwitchButton_swb_thumbColor);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbMargin, f4);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbMarginLeft, dimension);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbMarginRight, dimension);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbMarginTop, dimension);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbMarginBottom, dimension);
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbWidth, IGoodView.DEFAULT_TO_ALPHA);
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbHeight, IGoodView.DEFAULT_TO_ALPHA);
        float dimension8 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_thumbRadius, -1.0f);
        float dimension9 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SwitchButton_swb_backRadius, -1.0f);
        Drawable drawableAttrRes2 = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.SwitchButton_swb_backDrawable);
        ColorStateList colorStateListAttrRes2 = ResUtils.getColorStateListAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.SwitchButton_swb_backColor);
        float f5 = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.SwitchButton_swb_thumbRangeRatio, 1.8f);
        int integer = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.SwitchButton_swb_animationDuration, DEFAULT_ANIMATION_DURATION);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SwitchButton_swb_fadeBack, true);
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SwitchButton_swb_tintColor, 0);
        String string = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SwitchButton_swb_textOn);
        String string2 = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SwitchButton_swb_textOff);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SwitchButton_swb_textThumbInset, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SwitchButton_swb_textExtra, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SwitchButton_swb_textAdjust, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable});
        boolean z5 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        boolean z6 = typedArrayObtainStyledAttributes2.getBoolean(1, z5);
        setFocusable(z5);
        setClickable(z6);
        typedArrayObtainStyledAttributes2.recycle();
        this.mTextOn = string;
        this.mTextOff = string2;
        this.mTextThumbInset = dimensionPixelSize;
        this.mTextExtra = dimensionPixelSize2;
        this.mTextAdjust = dimensionPixelSize3;
        this.mThumbDrawable = drawableAttrRes;
        this.mThumbColor = colorStateListAttrRes;
        this.mIsThumbUseDrawable = drawableAttrRes != null;
        this.mTintColor = color;
        if (color == 0) {
            TypedValue typedValue = new TypedValue();
            z3 = true;
            if (context.getTheme().resolveAttribute(C2042R.attr.colorAccent, typedValue, true)) {
                this.mTintColor = typedValue.data;
            } else {
                this.mTintColor = DEFAULT_TINT_COLOR;
            }
        } else {
            z3 = true;
        }
        if (!this.mIsThumbUseDrawable && this.mThumbColor == null) {
            ColorStateList colorStateListGenerateThumbColorWithTintColor = ColorUtils.generateThumbColorWithTintColor(this.mTintColor);
            this.mThumbColor = colorStateListGenerateThumbColorWithTintColor;
            this.mCurrThumbColor = colorStateListGenerateThumbColorWithTintColor.getDefaultColor();
        }
        this.mThumbWidth = ceil(dimension6);
        this.mThumbHeight = ceil(dimension7);
        this.mBackDrawable = drawableAttrRes2;
        this.mBackColor = colorStateListAttrRes2;
        if (drawableAttrRes2 == null) {
            z3 = false;
        }
        this.mIsBackUseDrawable = z3;
        if (!z3 && colorStateListAttrRes2 == null) {
            ColorStateList colorStateListGenerateBackColorWithTintColor = ColorUtils.generateBackColorWithTintColor(this.mTintColor);
            this.mBackColor = colorStateListGenerateBackColorWithTintColor;
            int defaultColor = colorStateListGenerateBackColorWithTintColor.getDefaultColor();
            this.mCurrBackColor = defaultColor;
            this.mNextBackColor = this.mBackColor.getColorForState(CHECKED_PRESSED_STATE, defaultColor);
        }
        this.mThumbMargin.set(dimension2, dimension4, dimension3, dimension5);
        this.mThumbRangeRatio = this.mThumbMargin.width() >= IGoodView.DEFAULT_TO_ALPHA ? Math.max(f5, 1.0f) : f5;
        this.mThumbRadius = dimension8;
        this.mBackRadius = dimension9;
        long j4 = integer;
        this.mAnimationDuration = j4;
        this.mFadeBack = z4;
        this.mProgressAnimator.setDuration(j4);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    private Layout makeLayout(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)), Layout.Alignment.ALIGN_CENTER, 1.0f, IGoodView.DEFAULT_TO_ALPHA, false);
    }

    private int measureHeight(int i4) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        if (this.mThumbHeight == 0 && this.mIsThumbUseDrawable) {
            this.mThumbHeight = this.mThumbDrawable.getIntrinsicHeight();
        }
        if (mode != 1073741824) {
            if (this.mThumbHeight == 0) {
                this.mThumbHeight = ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f4 = this.mThumbHeight;
            RectF rectF = this.mThumbMargin;
            int iCeil = ceil(f4 + rectF.top + rectF.bottom);
            this.mBackHeight = iCeil;
            if (iCeil < 0) {
                this.mBackHeight = 0;
                this.mThumbHeight = 0;
                return size;
            }
            int iCeil2 = ceil(this.mTextHeight - iCeil);
            if (iCeil2 > 0) {
                this.mBackHeight += iCeil2;
                this.mThumbHeight += iCeil2;
            }
            int iMax = Math.max(this.mThumbHeight, this.mBackHeight);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (this.mThumbHeight != 0) {
            RectF rectF2 = this.mThumbMargin;
            this.mBackHeight = ceil(r6 + rectF2.top + rectF2.bottom);
            this.mBackHeight = ceil(Math.max(r6, this.mTextHeight));
            if ((((r6 + getPaddingTop()) + getPaddingBottom()) - Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.top)) - Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.bottom) > size) {
                this.mThumbHeight = 0;
            }
        }
        if (this.mThumbHeight == 0) {
            int iCeil3 = ceil(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.top) + Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.bottom));
            this.mBackHeight = iCeil3;
            if (iCeil3 < 0) {
                this.mBackHeight = 0;
                this.mThumbHeight = 0;
                return size;
            }
            RectF rectF3 = this.mThumbMargin;
            this.mThumbHeight = ceil((iCeil3 - rectF3.top) - rectF3.bottom);
        }
        if (this.mThumbHeight >= 0) {
            return size;
        }
        this.mBackHeight = 0;
        this.mThumbHeight = 0;
        return size;
    }

    private int measureWidth(int i4) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        if (this.mThumbWidth == 0 && this.mIsThumbUseDrawable) {
            this.mThumbWidth = this.mThumbDrawable.getIntrinsicWidth();
        }
        int iCeil = ceil(this.mTextWidth);
        if (this.mThumbRangeRatio == IGoodView.DEFAULT_TO_ALPHA) {
            this.mThumbRangeRatio = 1.8f;
        }
        if (mode != 1073741824) {
            if (this.mThumbWidth == 0) {
                this.mThumbWidth = ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.mThumbRangeRatio == IGoodView.DEFAULT_TO_ALPHA) {
                this.mThumbRangeRatio = 1.8f;
            }
            int iCeil2 = ceil(this.mThumbWidth * this.mThumbRangeRatio);
            float f4 = iCeil + this.mTextExtra;
            float f5 = iCeil2 - this.mThumbWidth;
            RectF rectF = this.mThumbMargin;
            int iCeil3 = ceil(f4 - ((f5 + Math.max(rectF.left, rectF.right)) + this.mTextThumbInset));
            float f6 = iCeil2;
            RectF rectF2 = this.mThumbMargin;
            int iCeil4 = ceil(rectF2.left + f6 + rectF2.right + Math.max(0, iCeil3));
            this.mBackWidth = iCeil4;
            if (iCeil4 >= 0) {
                int iCeil5 = ceil(f6 + Math.max(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.left) + Math.max(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.right) + Math.max(0, iCeil3));
                return Math.max(iCeil5, getPaddingLeft() + iCeil5 + getPaddingRight());
            }
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.mThumbWidth != 0) {
            int iCeil6 = ceil(r2 * this.mThumbRangeRatio);
            int i5 = this.mTextExtra + iCeil;
            int i6 = iCeil6 - this.mThumbWidth;
            RectF rectF3 = this.mThumbMargin;
            int iCeil7 = i5 - (i6 + ceil(Math.max(rectF3.left, rectF3.right)));
            float f7 = iCeil6;
            RectF rectF4 = this.mThumbMargin;
            int iCeil8 = ceil(rectF4.left + f7 + rectF4.right + Math.max(iCeil7, 0));
            this.mBackWidth = iCeil8;
            if (iCeil8 < 0) {
                this.mThumbWidth = 0;
            }
            if (f7 + Math.max(this.mThumbMargin.left, IGoodView.DEFAULT_TO_ALPHA) + Math.max(this.mThumbMargin.right, IGoodView.DEFAULT_TO_ALPHA) + Math.max(iCeil7, 0) > paddingLeft) {
                this.mThumbWidth = 0;
            }
        }
        if (this.mThumbWidth != 0) {
            return size;
        }
        int iCeil9 = ceil((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.mThumbMargin.left, IGoodView.DEFAULT_TO_ALPHA)) - Math.max(this.mThumbMargin.right, IGoodView.DEFAULT_TO_ALPHA));
        if (iCeil9 < 0) {
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        float f8 = iCeil9;
        this.mThumbWidth = ceil(f8 / this.mThumbRangeRatio);
        RectF rectF5 = this.mThumbMargin;
        int iCeil10 = ceil(f8 + rectF5.left + rectF5.right);
        this.mBackWidth = iCeil10;
        if (iCeil10 < 0) {
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        int i7 = iCeil + this.mTextExtra;
        int i8 = iCeil9 - this.mThumbWidth;
        RectF rectF6 = this.mThumbMargin;
        int iCeil11 = i7 - (i8 + ceil(Math.max(rectF6.left, rectF6.right)));
        if (iCeil11 > 0) {
            this.mThumbWidth -= iCeil11;
        }
        if (this.mThumbWidth >= 0) {
            return size;
        }
        this.mThumbWidth = 0;
        this.mBackWidth = 0;
        return size;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    private void setProgress(float f4) {
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            f4 = IGoodView.DEFAULT_TO_ALPHA;
        }
        this.mProgress = f4;
        invalidate();
    }

    private void setup() {
        int i4;
        if (this.mThumbWidth == 0 || (i4 = this.mThumbHeight) == 0 || this.mBackWidth == 0 || this.mBackHeight == 0) {
            return;
        }
        if (this.mThumbRadius == -1.0f) {
            this.mThumbRadius = Math.min(r0, i4) / 2.0f;
        }
        if (this.mBackRadius == -1.0f) {
            this.mBackRadius = Math.min(this.mBackWidth, this.mBackHeight) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iCeil = ceil((this.mBackWidth - Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.left)) - Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.right));
        float paddingTop = measuredHeight <= ceil((this.mBackHeight - Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.top)) - Math.min(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.bottom)) ? getPaddingTop() + Math.max(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.top) : (((measuredHeight - r3) + 1) / 2.0f) + getPaddingTop() + Math.max(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.top);
        float paddingLeft = measuredWidth <= this.mBackWidth ? getPaddingLeft() + Math.max(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.left) : (((measuredWidth - iCeil) + 1) / 2.0f) + getPaddingLeft() + Math.max(IGoodView.DEFAULT_TO_ALPHA, this.mThumbMargin.left);
        this.mThumbRectF.set(paddingLeft, paddingTop, this.mThumbWidth + paddingLeft, this.mThumbHeight + paddingTop);
        RectF rectF = this.mThumbRectF;
        float f4 = rectF.left;
        RectF rectF2 = this.mThumbMargin;
        float f5 = f4 - rectF2.left;
        RectF rectF3 = this.mBackRectF;
        float f6 = rectF.top;
        float f7 = rectF2.top;
        rectF3.set(f5, f6 - f7, this.mBackWidth + f5, (f6 - f7) + this.mBackHeight);
        RectF rectF4 = this.mSafeRectF;
        RectF rectF5 = this.mThumbRectF;
        rectF4.set(rectF5.left, IGoodView.DEFAULT_TO_ALPHA, (this.mBackRectF.right - this.mThumbMargin.right) - rectF5.width(), IGoodView.DEFAULT_TO_ALPHA);
        this.mBackRadius = Math.min(Math.min(this.mBackRectF.width(), this.mBackRectF.height()) / 2.0f, this.mBackRadius);
        Drawable drawable = this.mBackDrawable;
        if (drawable != null) {
            RectF rectF6 = this.mBackRectF;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, ceil(rectF6.right), ceil(this.mBackRectF.bottom));
        }
        if (this.mOnLayout != null) {
            RectF rectF7 = this.mBackRectF;
            float fWidth = (rectF7.left + (((((rectF7.width() + this.mTextThumbInset) - this.mThumbWidth) - this.mThumbMargin.right) - this.mOnLayout.getWidth()) / 2.0f)) - this.mTextAdjust;
            RectF rectF8 = this.mBackRectF;
            float fHeight = rectF8.top + ((rectF8.height() - this.mOnLayout.getHeight()) / 2.0f);
            this.mTextOnRectF.set(fWidth, fHeight, this.mOnLayout.getWidth() + fWidth, this.mOnLayout.getHeight() + fHeight);
        }
        if (this.mOffLayout != null) {
            RectF rectF9 = this.mBackRectF;
            float fWidth2 = ((rectF9.right - (((((rectF9.width() + this.mTextThumbInset) - this.mThumbWidth) - this.mThumbMargin.left) - this.mOffLayout.getWidth()) / 2.0f)) - this.mOffLayout.getWidth()) + this.mTextAdjust;
            RectF rectF10 = this.mBackRectF;
            float fHeight2 = rectF10.top + ((rectF10.height() - this.mOffLayout.getHeight()) / 2.0f);
            this.mTextOffRectF.set(fWidth2, fHeight2, this.mOffLayout.getWidth() + fWidth2, this.mOffLayout.getHeight() + fHeight2);
        }
        this.mReady = true;
    }

    protected void animateToState(boolean z3) {
        ObjectAnimator objectAnimator = this.mProgressAnimator;
        if (objectAnimator == null) {
            return;
        }
        if (objectAnimator.isRunning()) {
            this.mProgressAnimator.cancel();
        }
        this.mProgressAnimator.setDuration(this.mAnimationDuration);
        if (z3) {
            this.mProgressAnimator.setFloatValues(this.mProgress, 1.0f);
        } else {
            this.mProgressAnimator.setFloatValues(this.mProgress, IGoodView.DEFAULT_TO_ALPHA);
        }
        this.mProgressAnimator.start();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.mIsThumbUseDrawable || (colorStateList2 = this.mThumbColor) == null) {
            setDrawableState(this.mThumbDrawable);
        } else {
            this.mCurrThumbColor = colorStateList2.getColorForState(getDrawableState(), this.mCurrThumbColor);
        }
        int[] iArr = isChecked() ? UNCHECKED_PRESSED_STATE : CHECKED_PRESSED_STATE;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.mOnTextColor = textColors.getColorForState(CHECKED_PRESSED_STATE, defaultColor);
            this.mOffTextColor = textColors.getColorForState(UNCHECKED_PRESSED_STATE, defaultColor);
        }
        if (!this.mIsBackUseDrawable && (colorStateList = this.mBackColor) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.mCurrBackColor);
            this.mCurrBackColor = colorForState;
            this.mNextBackColor = this.mBackColor.getColorForState(iArr, colorForState);
            return;
        }
        Drawable drawable = this.mBackDrawable;
        if ((drawable instanceof StateListDrawable) && this.mFadeBack) {
            drawable.setState(iArr);
            this.mNextBackDrawable = this.mBackDrawable.getCurrent().mutate();
        } else {
            this.mNextBackDrawable = null;
        }
        setDrawableState(this.mBackDrawable);
        Drawable drawable2 = this.mBackDrawable;
        if (drawable2 != null) {
            this.mCurrentBackDrawable = drawable2.getCurrent().mutate();
        }
    }

    public long getAnimationDuration() {
        return this.mAnimationDuration;
    }

    public ColorStateList getBackColor() {
        return this.mBackColor;
    }

    public Drawable getBackDrawable() {
        return this.mBackDrawable;
    }

    public float getBackRadius() {
        return this.mBackRadius;
    }

    public PointF getBackSizeF() {
        return new PointF(this.mBackRectF.width(), this.mBackRectF.height());
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public ColorStateList getThumbColor() {
        return this.mThumbColor;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public float getThumbHeight() {
        return this.mThumbHeight;
    }

    public RectF getThumbMargin() {
        return this.mThumbMargin;
    }

    public float getThumbRadius() {
        return this.mThumbRadius;
    }

    public float getThumbRangeRatio() {
        return this.mThumbRangeRatio;
    }

    public float getThumbWidth() {
        return this.mThumbWidth;
    }

    public int getTintColor() {
        return this.mTintColor;
    }

    public boolean isDrawDebugRect() {
        return this.mDrawDebugRect;
    }

    public boolean isFadeBack() {
        return this.mFadeBack;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.mOnLayout == null && !TextUtils.isEmpty(this.mTextOn)) {
            this.mOnLayout = makeLayout(this.mTextOn);
        }
        if (this.mOffLayout == null && !TextUtils.isEmpty(this.mTextOff)) {
            this.mOffLayout = makeLayout(this.mTextOff);
        }
        float width = this.mOnLayout != null ? r0.getWidth() : IGoodView.DEFAULT_TO_ALPHA;
        float width2 = this.mOffLayout != null ? r2.getWidth() : IGoodView.DEFAULT_TO_ALPHA;
        if (width == IGoodView.DEFAULT_TO_ALPHA && width2 == IGoodView.DEFAULT_TO_ALPHA) {
            this.mTextWidth = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            this.mTextWidth = Math.max(width, width2);
        }
        float height = this.mOnLayout != null ? r0.getHeight() : IGoodView.DEFAULT_TO_ALPHA;
        float height2 = this.mOffLayout != null ? r2.getHeight() : IGoodView.DEFAULT_TO_ALPHA;
        if (height == IGoodView.DEFAULT_TO_ALPHA && height2 == IGoodView.DEFAULT_TO_ALPHA) {
            this.mTextHeight = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            this.mTextHeight = Math.max(height, height2);
        }
        setMeasuredDimension(measureWidth(i4), measureHeight(i5));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        setText(savedState.onText, savedState.offText);
        this.mRestoring = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mRestoring = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.onText = this.mTextOn;
        savedState.offText = this.mTextOff;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        setup();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setAnimationDuration(long j4) {
        this.mAnimationDuration = j4;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.mBackColor = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i4) {
        setBackColor(C0332a.m1805c(getContext(), i4));
    }

    public void setBackDrawable(Drawable drawable) {
        this.mBackDrawable = drawable;
        this.mIsBackUseDrawable = drawable != null;
        refreshDrawableState();
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i4) {
        setBackDrawable(C0332a.m1806d(getContext(), i4));
    }

    public void setBackRadius(float f4) {
        this.mBackRadius = f4;
        if (this.mIsBackUseDrawable) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        if (isChecked() != z3) {
            animateToState(z3);
        }
        if (this.mRestoring) {
            setCheckedImmediatelyNoEvent(z3);
        } else {
            super.setChecked(z3);
        }
    }

    public void setCheckedImmediately(boolean z3) {
        super.setChecked(z3);
        ObjectAnimator objectAnimator = this.mProgressAnimator;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.mProgressAnimator.cancel();
        }
        setProgress(z3 ? 1.0f : IGoodView.DEFAULT_TO_ALPHA);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z3) {
        if (this.mChildOnCheckedChangeListener == null) {
            setCheckedImmediately(z3);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z3);
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setCheckedNoEvent(boolean z3) {
        if (this.mChildOnCheckedChangeListener == null) {
            setChecked(z3);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z3);
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setDrawDebugRect(boolean z3) {
        this.mDrawDebugRect = z3;
        invalidate();
    }

    public void setFadeBack(boolean z3) {
        this.mFadeBack = z3;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.mChildOnCheckedChangeListener = onCheckedChangeListener;
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.mTextOn = charSequence;
        this.mTextOff = charSequence2;
        this.mOnLayout = null;
        this.mOffLayout = null;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextAdjust(int i4) {
        this.mTextAdjust = i4;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i4) {
        this.mTextExtra = i4;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i4) {
        this.mTextThumbInset = i4;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.mThumbColor = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i4) {
        setThumbColor(C0332a.m1805c(getContext(), i4));
    }

    public void setThumbDrawable(Drawable drawable) {
        this.mThumbDrawable = drawable;
        this.mIsThumbUseDrawable = drawable != null;
        refreshDrawableState();
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i4) {
        setThumbDrawable(C0332a.m1806d(getContext(), i4));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            setThumbMargin(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
        } else {
            setThumbMargin(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f4) {
        this.mThumbRadius = f4;
        if (this.mIsThumbUseDrawable) {
            return;
        }
        invalidate();
    }

    public void setThumbRangeRatio(float f4) {
        this.mThumbRangeRatio = f4;
        this.mReady = false;
        requestLayout();
    }

    public void setThumbSize(int i4, int i5) {
        this.mThumbWidth = i4;
        this.mThumbHeight = i5;
        this.mReady = false;
        requestLayout();
    }

    public void setTintColor(int i4) {
        this.mTintColor = i4;
        this.mThumbColor = ColorUtils.generateThumbColorWithTintColor(i4);
        this.mBackColor = ColorUtils.generateBackColorWithTintColor(this.mTintColor);
        this.mIsBackUseDrawable = false;
        this.mIsThumbUseDrawable = false;
        refreshDrawableState();
        invalidate();
    }

    public void toggleImmediately() {
        setCheckedImmediately(!isChecked());
    }

    public void toggleImmediatelyNoEvent() {
        if (this.mChildOnCheckedChangeListener == null) {
            toggleImmediately();
            return;
        }
        super.setOnCheckedChangeListener(null);
        toggleImmediately();
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void toggleNoEvent() {
        if (this.mChildOnCheckedChangeListener == null) {
            toggle();
            return;
        }
        super.setOnCheckedChangeListener(null);
        toggle();
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setThumbMargin(float f4, float f5, float f6, float f7) {
        this.mThumbMargin.set(f4, f5, f6, f7);
        this.mReady = false;
        requestLayout();
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawDebugRect = false;
        this.mRestoring = false;
        this.mReady = false;
        this.mCatch = false;
        init(context, attributeSet);
    }

    public SwitchButton(Context context) {
        super(context);
        this.mDrawDebugRect = false;
        this.mRestoring = false;
        this.mReady = false;
        this.mCatch = false;
        init(context, null);
    }
}
