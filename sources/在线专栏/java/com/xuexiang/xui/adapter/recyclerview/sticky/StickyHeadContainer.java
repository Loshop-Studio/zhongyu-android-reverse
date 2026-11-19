package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;

/* loaded from: classes.dex */
public class StickyHeadContainer extends ViewGroup {
    private int mLastOffset;
    private int mLastStickyHeadPosition;
    private int mOffset;
    private OnStickyPositionChangedListener mOnStickyPositionChangedListener;

    public interface OnStickyPositionChangedListener {
        void onPositionChanged(int i4);
    }

    public StickyHeadContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    protected int getChildHeight() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.getMeasuredHeight();
        }
        return 0;
    }

    public int getLastStickyHeadPosition() {
        return this.mLastStickyHeadPosition;
    }

    public void onInVisible() {
        reset();
        setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i8 = paddingLeft + marginLayoutParams.leftMargin;
        int measuredWidth = childAt.getMeasuredWidth() + i8;
        int i9 = paddingTop + marginLayoutParams.topMargin + this.mOffset;
        childAt.layout(i8, i9, measuredWidth, childAt.getMeasuredHeight() + i9);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (getChildCount() > 1) {
            throw new IllegalArgumentException("you must set only one child view！");
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        measureChildWithMargins(childAt, i4, 0, i5, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4), ViewGroup.resolveSize(Math.max(paddingTop, getSuggestedMinimumHeight()), i5));
    }

    public void onNotEnoughHighScroll() {
        onInVisible();
    }

    protected void onPositionChanged(int i4) {
        OnStickyPositionChangedListener onStickyPositionChangedListener = this.mOnStickyPositionChangedListener;
        if (onStickyPositionChangedListener != null && this.mLastStickyHeadPosition != i4) {
            onStickyPositionChangedListener.onPositionChanged(i4);
        }
        this.mLastStickyHeadPosition = i4;
    }

    public void onScrolling(int i4) {
        scrollChild(i4);
        setVisibility(0);
    }

    public void recycle() {
        this.mLastStickyHeadPosition = Integer.MIN_VALUE;
        this.mOnStickyPositionChangedListener = null;
    }

    public void reset() {
        this.mLastStickyHeadPosition = Integer.MIN_VALUE;
    }

    public void scrollChild(int i4) {
        if (this.mLastOffset != i4) {
            this.mOffset = i4;
            View childAt = getChildAt(0);
            if (childAt != null) {
                C0358u.m2021b0(childAt, this.mOffset - this.mLastOffset);
            }
        }
        this.mLastOffset = this.mOffset;
    }

    public StickyHeadContainer setOnStickyPositionChangedListener(OnStickyPositionChangedListener onStickyPositionChangedListener) {
        this.mOnStickyPositionChangedListener = onStickyPositionChangedListener;
        return this;
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mLastOffset = Integer.MIN_VALUE;
        this.mLastStickyHeadPosition = Integer.MIN_VALUE;
    }
}
