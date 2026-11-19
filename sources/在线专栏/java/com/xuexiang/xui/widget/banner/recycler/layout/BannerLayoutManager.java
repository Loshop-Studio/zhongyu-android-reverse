package com.xuexiang.xui.widget.banner.recycler.layout;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.AbstractC0596j;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class BannerLayoutManager extends RecyclerView.AbstractC0570o {
    public static final int DETERMINE_BY_MAX_AND_MIN = -1;
    private static final int DIRECTION_BACKWARD = 1;
    private static final int DIRECTION_FORWARD = 0;
    private static final int DIRECTION_NO_WHERE = -1;
    public static final int HORIZONTAL = 0;
    protected static final int INVALID_SIZE = Integer.MAX_VALUE;
    public static final int VERTICAL = 1;
    private float centerScale;
    private View currentFocusView;
    private int itemSpace;
    protected int mDecoratedMeasurement;
    protected int mDecoratedMeasurementInOther;
    private int mDistanceToBottom;
    private boolean mEnableBringCenterToFront;
    private boolean mInfinite;
    protected float mInterval;
    private int mLeftItems;
    private int mMaxVisibleItemCount;
    protected float mOffset;
    int mOrientation;
    protected AbstractC0596j mOrientationHelper;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    private int mRightItems;
    private boolean mShouldReverseLayout;
    private Interpolator mSmoothScrollInterpolator;
    private boolean mSmoothScrollbarEnabled;
    protected int mSpaceInOther;
    protected int mSpaceMain;
    private float moveSpeed;
    OnPageChangeListener onPageChangeListener;
    private SparseArray<View> positionCache;

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i4);

        void onPageSelected(int i4);
    }

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager.SavedState.1
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
        boolean isReverseLayout;
        float offset;
        int position;

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.position);
            parcel.writeFloat(this.offset);
            parcel.writeInt(this.isReverseLayout ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.position = parcel.readInt();
            this.offset = parcel.readFloat();
            this.isReverseLayout = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.position = savedState.position;
            this.offset = savedState.offset;
            this.isReverseLayout = savedState.isReverseLayout;
        }
    }

    public BannerLayoutManager(Context context) {
        this(context, 0, false);
    }

    private float calculateScale(float f4) {
        float fAbs = Math.abs(f4 - ((this.mOrientationHelper.mo3405n() - this.mDecoratedMeasurement) / 2.0f));
        int i4 = this.mDecoratedMeasurement;
        float f5 = i4 - fAbs;
        float f6 = IGoodView.DEFAULT_TO_ALPHA;
        if (f5 > IGoodView.DEFAULT_TO_ALPHA) {
            f6 = i4 - fAbs;
        }
        return (((this.centerScale - 1.0f) / i4) * f6) + 1.0f;
    }

    private int computeScrollExtent() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.mSmoothScrollbarEnabled) {
            return (int) this.mInterval;
        }
        return 1;
    }

    private int computeScrollOffset() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.mSmoothScrollbarEnabled) {
            return !this.mShouldReverseLayout ? getCurrentPosition() : (getItemCount() - getCurrentPosition()) - 1;
        }
        float offsetOfRightAdapterPosition = getOffsetOfRightAdapterPosition();
        return !this.mShouldReverseLayout ? (int) offsetOfRightAdapterPosition : (int) (((getItemCount() - 1) * this.mInterval) + offsetOfRightAdapterPosition);
    }

    private int computeScrollRange() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.mSmoothScrollbarEnabled ? getItemCount() : (int) (getItemCount() * this.mInterval);
    }

    private int getCurrentPositionOffset() {
        return Math.round(this.mOffset / this.mInterval);
    }

    private int getMovement(int i4) {
        if (this.mOrientation == 1) {
            if (i4 == 33) {
                return !this.mShouldReverseLayout ? 1 : 0;
            }
            if (i4 == 130) {
                return this.mShouldReverseLayout ? 1 : 0;
            }
            return -1;
        }
        if (i4 == 17) {
            return !this.mShouldReverseLayout ? 1 : 0;
        }
        if (i4 == 66) {
            return this.mShouldReverseLayout ? 1 : 0;
        }
        return -1;
    }

    private float getOffsetOfRightAdapterPosition() {
        if (this.mShouldReverseLayout) {
            if (!this.mInfinite) {
                return this.mOffset;
            }
            float f4 = this.mOffset;
            if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
                return f4 % (this.mInterval * getItemCount());
            }
            float itemCount = getItemCount();
            float f5 = this.mInterval;
            return (itemCount * (-f5)) + (this.mOffset % (f5 * getItemCount()));
        }
        if (!this.mInfinite) {
            return this.mOffset;
        }
        float f6 = this.mOffset;
        if (f6 >= IGoodView.DEFAULT_TO_ALPHA) {
            return f6 % (this.mInterval * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f7 = this.mInterval;
        return (itemCount2 * f7) + (this.mOffset % (f7 * getItemCount()));
    }

    private float getProperty(int i4) {
        return i4 * (this.mShouldReverseLayout ? -this.mInterval : this.mInterval);
    }

    private void layoutItems(RecyclerView.C0576u c0576u) {
        int i4;
        int i5;
        int i6;
        detachAndScrapAttachedViews(c0576u);
        this.positionCache.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int currentPositionOffset = this.mShouldReverseLayout ? -getCurrentPositionOffset() : getCurrentPositionOffset();
        int i7 = currentPositionOffset - this.mLeftItems;
        int i8 = this.mRightItems + currentPositionOffset;
        if (useMaxVisibleCount()) {
            int i9 = this.mMaxVisibleItemCount;
            if (i9 % 2 == 0) {
                i5 = i9 / 2;
                i6 = (currentPositionOffset - i5) + 1;
            } else {
                i5 = (i9 - 1) / 2;
                i6 = currentPositionOffset - i5;
            }
            int i10 = i6;
            i8 = i5 + currentPositionOffset + 1;
            i7 = i10;
        }
        if (!this.mInfinite) {
            if (i7 < 0) {
                if (useMaxVisibleCount()) {
                    i8 = this.mMaxVisibleItemCount;
                }
                i7 = 0;
            }
            if (i8 > itemCount) {
                i8 = itemCount;
            }
        }
        float f4 = Float.MIN_VALUE;
        while (i7 < i8) {
            if (useMaxVisibleCount() || !removeCondition(getProperty(i7) - this.mOffset)) {
                if (i7 >= itemCount) {
                    i4 = i7 % itemCount;
                } else if (i7 < 0) {
                    int i11 = (-i7) % itemCount;
                    if (i11 == 0) {
                        i11 = itemCount;
                    }
                    i4 = itemCount - i11;
                } else {
                    i4 = i7;
                }
                View viewM3143o = c0576u.m3143o(i4);
                measureChildWithMargins(viewM3143o, 0, 0);
                resetViewProperty(viewM3143o);
                float property = getProperty(i7) - this.mOffset;
                layoutScrap(viewM3143o, property);
                float viewElevation = this.mEnableBringCenterToFront ? setViewElevation(viewM3143o, property) : i4;
                if (viewElevation > f4) {
                    addView(viewM3143o);
                } else {
                    addView(viewM3143o, 0);
                }
                if (i7 == currentPositionOffset) {
                    this.currentFocusView = viewM3143o;
                }
                this.positionCache.put(i7, viewM3143o);
                f4 = viewElevation;
            }
            i7++;
        }
        this.currentFocusView.requestFocus();
    }

    private void layoutScrap(View view, float f4) {
        int iCalItemLeft = calItemLeft(view, f4);
        int iCalItemTop = calItemTop(view, f4);
        if (this.mOrientation == 1) {
            int i4 = this.mSpaceInOther;
            int i5 = this.mSpaceMain;
            layoutDecorated(view, i4 + iCalItemLeft, i5 + iCalItemTop, i4 + iCalItemLeft + this.mDecoratedMeasurementInOther, i5 + iCalItemTop + this.mDecoratedMeasurement);
        } else {
            int i6 = this.mSpaceMain;
            int i7 = this.mSpaceInOther;
            layoutDecorated(view, i6 + iCalItemLeft, i7 + iCalItemTop, i6 + iCalItemLeft + this.mDecoratedMeasurement, i7 + iCalItemTop + this.mDecoratedMeasurementInOther);
        }
        setItemViewProperty(view, f4);
    }

    private boolean removeCondition(float f4) {
        return f4 > maxRemoveOffset() || f4 < minRemoveOffset();
    }

    private void resetViewProperty(View view) {
        view.setRotation(IGoodView.DEFAULT_TO_ALPHA);
        view.setRotationY(IGoodView.DEFAULT_TO_ALPHA);
        view.setRotationX(IGoodView.DEFAULT_TO_ALPHA);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 0 && getLayoutDirection() == 1) {
            this.mReverseLayout = !this.mReverseLayout;
        }
    }

    private int scrollBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f4 = i4;
        float distanceRatio = f4 / getDistanceRatio();
        if (Math.abs(distanceRatio) < 1.0E-8f) {
            return 0;
        }
        float f5 = this.mOffset + distanceRatio;
        if (!this.mInfinite && f5 < getMinOffset()) {
            i4 = (int) (f4 - ((f5 - getMinOffset()) * getDistanceRatio()));
        } else if (!this.mInfinite && f5 > getMaxOffset()) {
            i4 = (int) ((getMaxOffset() - this.mOffset) * getDistanceRatio());
        }
        this.mOffset += i4 / getDistanceRatio();
        layoutItems(c0576u);
        return i4;
    }

    private boolean useMaxVisibleCount() {
        return this.mMaxVisibleItemCount != -1;
    }

    protected int calItemLeft(View view, float f4) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return (int) f4;
    }

    protected int calItemTop(View view, float f4) {
        if (this.mOrientation == 1) {
            return (int) f4;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollExtent(RecyclerView.C0580y c0580y) {
        return computeScrollExtent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollOffset(RecyclerView.C0580y c0580y) {
        return computeScrollOffset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollRange(RecyclerView.C0580y c0580y) {
        return computeScrollRange();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollExtent(RecyclerView.C0580y c0580y) {
        return computeScrollExtent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollOffset(RecyclerView.C0580y c0580y) {
        return computeScrollOffset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollRange(RecyclerView.C0580y c0580y) {
        return computeScrollRange();
    }

    void ensureLayoutState() {
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = AbstractC0596j.m3393b(this, this.mOrientation);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public View findViewByPosition(int i4) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i5 = 0; i5 < this.positionCache.size(); i5++) {
            int iKeyAt = this.positionCache.keyAt(i5);
            if (iKeyAt < 0) {
                int i6 = iKeyAt % itemCount;
                if (i6 == 0) {
                    i6 = -itemCount;
                }
                if (i6 + itemCount == i4) {
                    return this.positionCache.valueAt(i5);
                }
            } else if (i4 == iKeyAt % itemCount) {
                return this.positionCache.valueAt(i5);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getCurrentPosition() {
        if (getItemCount() == 0) {
            return 0;
        }
        int currentPositionOffset = getCurrentPositionOffset();
        if (!this.mInfinite) {
            return Math.abs(currentPositionOffset);
        }
        int itemCount = !this.mShouldReverseLayout ? currentPositionOffset >= 0 ? currentPositionOffset % getItemCount() : (currentPositionOffset % getItemCount()) + getItemCount() : currentPositionOffset > 0 ? getItemCount() - (currentPositionOffset % getItemCount()) : (-currentPositionOffset) % getItemCount();
        if (itemCount == getItemCount()) {
            return 0;
        }
        return itemCount;
    }

    protected float getDistanceRatio() {
        float f4 = this.moveSpeed;
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f4;
    }

    public int getDistanceToBottom() {
        int i4 = this.mDistanceToBottom;
        return i4 == INVALID_SIZE ? (getTotalSpaceInOther() - this.mDecoratedMeasurementInOther) / 2 : i4;
    }

    public boolean getEnableBringCenterToFront() {
        return this.mEnableBringCenterToFront;
    }

    public boolean getInfinite() {
        return this.mInfinite;
    }

    float getMaxOffset() {
        return !this.mShouldReverseLayout ? (getItemCount() - 1) * this.mInterval : IGoodView.DEFAULT_TO_ALPHA;
    }

    public int getMaxVisibleItemCount() {
        return this.mMaxVisibleItemCount;
    }

    float getMinOffset() {
        return !this.mShouldReverseLayout ? IGoodView.DEFAULT_TO_ALPHA : (-(getItemCount() - 1)) * this.mInterval;
    }

    public int getOffsetToCenter() {
        float currentPosition;
        float distanceRatio;
        if (this.mInfinite) {
            currentPosition = (getCurrentPositionOffset() * this.mInterval) - this.mOffset;
            distanceRatio = getDistanceRatio();
        } else {
            currentPosition = (getCurrentPosition() * (!this.mShouldReverseLayout ? this.mInterval : -this.mInterval)) - this.mOffset;
            distanceRatio = getDistanceRatio();
        }
        return (int) (currentPosition * distanceRatio);
    }

    public int getOffsetToPosition(int i4) {
        float currentPositionOffset;
        float distanceRatio;
        if (this.mInfinite) {
            currentPositionOffset = ((getCurrentPositionOffset() + (!this.mShouldReverseLayout ? i4 - getCurrentPosition() : getCurrentPosition() - i4)) * this.mInterval) - this.mOffset;
            distanceRatio = getDistanceRatio();
        } else {
            currentPositionOffset = (i4 * (!this.mShouldReverseLayout ? this.mInterval : -this.mInterval)) - this.mOffset;
            distanceRatio = getDistanceRatio();
        }
        return (int) (currentPositionOffset * distanceRatio);
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public int getTotalSpaceInOther() {
        int width;
        int paddingRight;
        if (this.mOrientation == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    protected float maxRemoveOffset() {
        return this.mOrientationHelper.mo3405n() - this.mSpaceMain;
    }

    protected float minRemoveOffset() {
        return ((-this.mDecoratedMeasurement) - this.mOrientationHelper.mo3404m()) - this.mSpaceMain;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onAdapterChanged(RecyclerView.AbstractC0562g abstractC0562g, RecyclerView.AbstractC0562g abstractC0562g2) {
        removeAllViews();
        this.mOffset = IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i4, int i5) {
        int currentPosition = getCurrentPosition();
        View viewFindViewByPosition = findViewByPosition(currentPosition);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int movement = getMovement(i4);
            if (movement != -1) {
                recyclerView.smoothScrollToPosition(movement == 1 ? currentPosition - 1 : currentPosition + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i4, i5);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0576u c0576u) {
        super.onDetachedFromWindow(recyclerView, c0576u);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0576u);
            c0576u.m3131c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public View onFocusSearchFailed(View view, int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutChildren(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (c0580y.m3161b() == 0) {
            removeAndRecycleAllViews(c0576u);
            this.mOffset = IGoodView.DEFAULT_TO_ALPHA;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewM3143o = c0576u.m3143o(0);
        measureChildWithMargins(viewM3143o, 0, 0);
        this.mDecoratedMeasurement = this.mOrientationHelper.mo3396e(viewM3143o);
        this.mDecoratedMeasurementInOther = this.mOrientationHelper.mo3397f(viewM3143o);
        this.mSpaceMain = (this.mOrientationHelper.mo3405n() - this.mDecoratedMeasurement) / 2;
        if (this.mDistanceToBottom == INVALID_SIZE) {
            this.mSpaceInOther = (getTotalSpaceInOther() - this.mDecoratedMeasurementInOther) / 2;
        } else {
            this.mSpaceInOther = (getTotalSpaceInOther() - this.mDecoratedMeasurementInOther) - this.mDistanceToBottom;
        }
        this.mInterval = setInterval();
        setUp();
        this.mLeftItems = ((int) Math.abs(minRemoveOffset() / this.mInterval)) + 1;
        this.mRightItems = ((int) Math.abs(maxRemoveOffset() / this.mInterval)) + 1;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            this.mShouldReverseLayout = savedState.isReverseLayout;
            this.mPendingScrollPosition = savedState.position;
            this.mOffset = savedState.offset;
        }
        int i4 = this.mPendingScrollPosition;
        if (i4 != -1) {
            this.mOffset = i4 * (this.mShouldReverseLayout ? -this.mInterval : this.mInterval);
        }
        detachAndScrapAttachedViews(c0576u);
        layoutItems(c0576u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutCompleted(RecyclerView.C0580y c0580y) {
        super.onLayoutCompleted(c0580y);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        savedState.position = this.mPendingScrollPosition;
        savedState.offset = this.mOffset;
        savedState.isReverseLayout = this.mShouldReverseLayout;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollHorizontallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i4, c0576u, c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void scrollToPosition(int i4) {
        if (this.mInfinite || (i4 >= 0 && i4 < getItemCount())) {
            this.mPendingScrollPosition = i4;
            this.mOffset = i4 * (this.mShouldReverseLayout ? -this.mInterval : this.mInterval);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollVerticallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i4, c0576u, c0580y);
    }

    public void setCenterScale(float f4) {
        this.centerScale = f4;
    }

    public void setDistanceToBottom(int i4) {
        assertNotInLayoutOrScroll(null);
        if (this.mDistanceToBottom == i4) {
            return;
        }
        this.mDistanceToBottom = i4;
        removeAllViews();
    }

    public void setEnableBringCenterToFront(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (this.mEnableBringCenterToFront == z3) {
            return;
        }
        this.mEnableBringCenterToFront = z3;
        requestLayout();
    }

    public void setInfinite(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (z3 == this.mInfinite) {
            return;
        }
        this.mInfinite = z3;
        requestLayout();
    }

    protected float setInterval() {
        return (this.mDecoratedMeasurement * (((this.centerScale - 1.0f) / 2.0f) + 1.0f)) + this.itemSpace;
    }

    public void setItemSpace(int i4) {
        this.itemSpace = i4;
    }

    protected void setItemViewProperty(View view, float f4) {
        float fCalculateScale = calculateScale(f4 + this.mSpaceMain);
        view.setScaleX(fCalculateScale);
        view.setScaleY(fCalculateScale);
    }

    public void setMaxVisibleItemCount(int i4) {
        assertNotInLayoutOrScroll(null);
        if (this.mMaxVisibleItemCount == i4) {
            return;
        }
        this.mMaxVisibleItemCount = i4;
        removeAllViews();
    }

    public void setMoveSpeed(float f4) {
        assertNotInLayoutOrScroll(null);
        if (this.moveSpeed == f4) {
            return;
        }
        this.moveSpeed = f4;
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.onPageChangeListener = onPageChangeListener;
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        assertNotInLayoutOrScroll(null);
        if (i4 == this.mOrientation) {
            return;
        }
        this.mOrientation = i4;
        this.mOrientationHelper = null;
        this.mDistanceToBottom = INVALID_SIZE;
        removeAllViews();
    }

    public void setRecycleChildrenOnDetach(boolean z3) {
        this.mRecycleChildrenOnDetach = z3;
    }

    public void setReverseLayout(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (z3 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z3;
        removeAllViews();
    }

    public void setSmoothScrollInterpolator(Interpolator interpolator) {
        this.mSmoothScrollInterpolator = interpolator;
    }

    public void setSmoothScrollbarEnabled(boolean z3) {
        this.mSmoothScrollbarEnabled = z3;
    }

    protected void setUp() {
    }

    protected float setViewElevation(View view, float f4) {
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0580y c0580y, int i4) {
        int offsetToPosition = getOffsetToPosition(i4);
        if (this.mOrientation == 1) {
            recyclerView.smoothScrollBy(0, offsetToPosition, this.mSmoothScrollInterpolator);
        } else {
            recyclerView.smoothScrollBy(offsetToPosition, 0, this.mSmoothScrollInterpolator);
        }
    }

    public BannerLayoutManager(Context context, int i4) {
        this(context, i4, false);
    }

    public BannerLayoutManager(Context context, int i4, boolean z3) {
        this.positionCache = new SparseArray<>();
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingSavedState = null;
        this.mInfinite = true;
        this.mMaxVisibleItemCount = -1;
        this.mDistanceToBottom = INVALID_SIZE;
        this.itemSpace = 20;
        this.centerScale = 1.2f;
        this.moveSpeed = 1.0f;
        setEnableBringCenterToFront(true);
        setMaxVisibleItemCount(3);
        setOrientation(i4);
        setReverseLayout(z3);
        setAutoMeasureEnabled(true);
        setItemPrefetchEnabled(false);
    }
}
