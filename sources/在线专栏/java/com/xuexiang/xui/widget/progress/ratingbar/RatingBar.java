package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class RatingBar extends LinearLayout implements IRatingBar {
    private boolean mClearRatingEnabled;
    private Drawable mEmptyDrawable;
    private Drawable mFilledDrawable;
    private boolean mIsClickable;
    private boolean mIsIndicator;
    private boolean mIsScrollable;
    private float mMinimumStars;
    private int mNumStars;
    private OnRatingChangeListener mOnRatingChangeListener;
    private int mPadding;
    protected List<PartialView> mPartialViews;
    private float mPreviousRating;
    private float mRating;
    private int mStarHeight;
    private int mStarWidth;
    private float mStartX;
    private float mStartY;
    private float mStepSize;

    public interface OnRatingChangeListener {
        void onRatingChange(RatingBar ratingBar, float f4);
    }

    public RatingBar(Context context) {
        this(context, null);
    }

    private PartialView getPartialView(int i4, int i5, int i6, int i7, Drawable drawable, Drawable drawable2) {
        PartialView partialView = new PartialView(getContext(), i4, i5, i6, i7);
        partialView.setFilledDrawable(drawable);
        partialView.setEmptyDrawable(drawable2);
        return partialView;
    }

    private void handleClickEvent(float f4) {
        for (PartialView partialView : this.mPartialViews) {
            if (isPositionInRatingView(f4, partialView)) {
                float f5 = this.mStepSize;
                float fIntValue = f5 == 1.0f ? ((Integer) partialView.getTag()).intValue() : RatingBarUtils.calculateRating(partialView, f5, f4);
                if (this.mPreviousRating == fIntValue && isClearRatingEnabled()) {
                    setRating(this.mMinimumStars);
                    return;
                } else {
                    setRating(fIntValue);
                    return;
                }
            }
        }
    }

    private void handleMoveEvent(float f4) {
        for (PartialView partialView : this.mPartialViews) {
            if (f4 < (partialView.getWidth() / 10.0f) + (this.mMinimumStars * partialView.getWidth())) {
                setRating(this.mMinimumStars);
                return;
            } else if (isPositionInRatingView(f4, partialView)) {
                float fCalculateRating = RatingBarUtils.calculateRating(partialView, this.mStepSize, f4);
                if (this.mRating != fCalculateRating) {
                    setRating(fCalculateRating);
                }
            }
        }
    }

    private void initRatingView() {
        this.mPartialViews = new ArrayList();
        for (int i4 = 1; i4 <= this.mNumStars; i4++) {
            PartialView partialView = getPartialView(i4, this.mStarWidth, this.mStarHeight, this.mPadding, this.mFilledDrawable, this.mEmptyDrawable);
            addView(partialView);
            this.mPartialViews.add(partialView);
        }
    }

    private boolean isPositionInRatingView(float f4, View view) {
        return f4 > ((float) view.getLeft()) && f4 < ((float) view.getRight());
    }

    private void verifyParamsValue() {
        if (this.mNumStars <= 0) {
            this.mNumStars = 5;
        }
        if (this.mPadding < 0) {
            this.mPadding = 0;
        }
        if (this.mEmptyDrawable == null) {
            this.mEmptyDrawable = C0332a.m1806d(getContext(), C2042R.drawable.srb_ic_empty);
        }
        if (this.mFilledDrawable == null) {
            this.mFilledDrawable = C0332a.m1806d(getContext(), C2042R.drawable.srb_ic_filled);
        }
        float f4 = this.mStepSize;
        if (f4 > 1.0f) {
            this.mStepSize = 1.0f;
        } else if (f4 < 0.1f) {
            this.mStepSize = 0.1f;
        }
        this.mMinimumStars = RatingBarUtils.getValidMinimumStars(this.mMinimumStars, this.mNumStars, this.mStepSize);
    }

    protected void emptyRatingBar() {
        fillRatingBar(IGoodView.DEFAULT_TO_ALPHA);
    }

    protected void fillRatingBar(float f4) {
        for (PartialView partialView : this.mPartialViews) {
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f4);
            double d4 = iIntValue;
            if (d4 > dCeil) {
                partialView.setEmpty();
            } else if (d4 == dCeil) {
                partialView.setPartialFilled(f4);
            } else {
                partialView.setFilled();
            }
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public int getNumStars() {
        return this.mNumStars;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public float getRating() {
        return this.mRating;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public int getStarHeight() {
        return this.mStarHeight;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public int getStarPadding() {
        return this.mPadding;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public int getStarWidth() {
        return this.mStarWidth;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public float getStepSize() {
        return this.mStepSize;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public boolean isClearRatingEnabled() {
        return this.mClearRatingEnabled;
    }

    @Override // android.view.View, com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public boolean isClickable() {
        return this.mIsClickable;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public boolean isIndicator() {
        return this.mIsIndicator;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public boolean isScrollable() {
        return this.mIsScrollable;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRating(savedState.getRating());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setRating(this.mRating);
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isIndicator()) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mStartX = x3;
            this.mStartY = y3;
            this.mPreviousRating = this.mRating;
        } else if (action != 1) {
            if (action == 2) {
                if (!isScrollable()) {
                    return false;
                }
                handleMoveEvent(x3);
            }
        } else {
            if (!RatingBarUtils.isClickEvent(this.mStartX, this.mStartY, motionEvent) || !isClickable()) {
                return false;
            }
            handleClickEvent(x3);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setClearRatingEnabled(boolean z3) {
        this.mClearRatingEnabled = z3;
    }

    @Override // android.view.View, com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setClickable(boolean z3) {
        this.mIsClickable = z3;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setEmptyDrawable(Drawable drawable) {
        this.mEmptyDrawable = drawable;
        Iterator<PartialView> it = this.mPartialViews.iterator();
        while (it.hasNext()) {
            it.next().setEmptyDrawable(drawable);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setEmptyDrawableRes(int i4) {
        setEmptyDrawable(C0332a.m1806d(getContext(), i4));
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setFilledDrawable(Drawable drawable) {
        this.mFilledDrawable = drawable;
        Iterator<PartialView> it = this.mPartialViews.iterator();
        while (it.hasNext()) {
            it.next().setFilledDrawable(drawable);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setFilledDrawableRes(int i4) {
        setFilledDrawable(C0332a.m1806d(getContext(), i4));
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setIsIndicator(boolean z3) {
        this.mIsIndicator = z3;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setMinimumStars(float f4) {
        this.mMinimumStars = RatingBarUtils.getValidMinimumStars(f4, this.mNumStars, this.mStepSize);
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setNumStars(int i4) {
        if (i4 <= 0) {
            return;
        }
        this.mPartialViews.clear();
        removeAllViews();
        this.mNumStars = i4;
        initRatingView();
    }

    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        this.mOnRatingChangeListener = onRatingChangeListener;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setRating(float f4) {
        int i4 = this.mNumStars;
        if (f4 > i4) {
            f4 = i4;
        }
        float f5 = this.mMinimumStars;
        if (f4 < f5) {
            f4 = f5;
        }
        if (this.mRating == f4) {
            return;
        }
        this.mRating = f4;
        OnRatingChangeListener onRatingChangeListener = this.mOnRatingChangeListener;
        if (onRatingChangeListener != null) {
            onRatingChangeListener.onRatingChange(this, f4);
        }
        fillRatingBar(f4);
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setScrollable(boolean z3) {
        this.mIsScrollable = z3;
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setStarHeight(int i4) {
        this.mStarHeight = i4;
        Iterator<PartialView> it = this.mPartialViews.iterator();
        while (it.hasNext()) {
            it.next().setStarHeight(i4);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setStarPadding(int i4) {
        if (i4 < 0) {
            return;
        }
        this.mPadding = i4;
        for (PartialView partialView : this.mPartialViews) {
            int i5 = this.mPadding;
            partialView.setPadding(i5, i5, i5, i5);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setStarWidth(int i4) {
        this.mStarWidth = i4;
        Iterator<PartialView> it = this.mPartialViews.iterator();
        while (it.hasNext()) {
            it.next().setStarWidth(i4);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
    public void setStepSize(float f4) {
        this.mStepSize = f4;
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatingBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPadding = 20;
        this.mMinimumStars = IGoodView.DEFAULT_TO_ALPHA;
        this.mRating = -1.0f;
        this.mStepSize = 1.0f;
        this.mPreviousRating = IGoodView.DEFAULT_TO_ALPHA;
        this.mIsIndicator = false;
        this.mIsScrollable = true;
        this.mIsClickable = true;
        this.mClearRatingEnabled = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.RatingBar);
        float f4 = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.RatingBar_srb_rating, IGoodView.DEFAULT_TO_ALPHA);
        this.mNumStars = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RatingBar_srb_numStars, this.mNumStars);
        this.mStepSize = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.RatingBar_srb_stepSize, this.mStepSize);
        this.mMinimumStars = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.RatingBar_srb_minimumStars, this.mMinimumStars);
        this.mPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RatingBar_srb_starPadding, this.mPadding);
        this.mStarWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RatingBar_srb_starWidth, 0);
        this.mStarHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RatingBar_srb_starHeight, 0);
        int i5 = C2042R.styleable.RatingBar_srb_drawableEmpty;
        this.mEmptyDrawable = typedArrayObtainStyledAttributes.hasValue(i5) ? C0332a.m1806d(context, typedArrayObtainStyledAttributes.getResourceId(i5, -1)) : null;
        int i6 = C2042R.styleable.RatingBar_srb_drawableFilled;
        this.mFilledDrawable = typedArrayObtainStyledAttributes.hasValue(i6) ? C0332a.m1806d(context, typedArrayObtainStyledAttributes.getResourceId(i6, -1)) : null;
        this.mIsIndicator = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RatingBar_srb_isIndicator, this.mIsIndicator);
        this.mIsScrollable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RatingBar_srb_scrollable, this.mIsScrollable);
        this.mIsClickable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RatingBar_srb_clickable, this.mIsClickable);
        this.mClearRatingEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RatingBar_srb_clearRatingEnabled, this.mClearRatingEnabled);
        typedArrayObtainStyledAttributes.recycle();
        verifyParamsValue();
        initRatingView();
        setRating(f4);
    }
}
