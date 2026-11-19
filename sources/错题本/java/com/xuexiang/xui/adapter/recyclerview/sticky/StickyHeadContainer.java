package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class StickyHeadContainer extends ViewGroup {

    /* renamed from: a */
    public final int f3927a;

    public StickyHeadContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getChildHeight() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.getMeasuredHeight();
        }
        return 0;
    }

    public int getLastStickyHeadPosition() {
        return this.f3927a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i11 = paddingLeft + marginLayoutParams.leftMargin;
        int measuredWidth = childAt.getMeasuredWidth() + i11;
        int i12 = paddingTop + marginLayoutParams.topMargin;
        childAt.layout(i11, i12, measuredWidth, childAt.getMeasuredHeight() + i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        if (getChildCount() > 1) {
            throw new IllegalArgumentException("you must set only one child view！");
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        measureChildWithMargins(childAt, i, 0, i8, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSize(Math.max(paddingRight, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8));
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3927a = Integer.MIN_VALUE;
    }
}
