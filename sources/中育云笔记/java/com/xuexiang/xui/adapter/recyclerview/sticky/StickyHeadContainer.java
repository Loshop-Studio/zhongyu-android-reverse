package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* loaded from: classes5.dex */
public class StickyHeadContainer extends ViewGroup {

    /* renamed from: c */
    public int f15197c;

    /* renamed from: d */
    public int f15198d;

    /* renamed from: e */
    public int f15199e;

    public StickyHeadContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m12154a() {
        m12158e();
        setVisibility(4);
    }

    /* renamed from: b */
    public void m12155b() {
        m12154a();
    }

    /* renamed from: c */
    public void m12156c(int i10) {
        this.f15199e = i10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    /* renamed from: d */
    public void m12157d(int i10) {
        m12159f(i10);
        setVisibility(0);
    }

    /* renamed from: e */
    public void m12158e() {
        this.f15199e = Integer.MIN_VALUE;
    }

    /* renamed from: f */
    public void m12159f(int i10) {
        if (this.f15198d != i10) {
            this.f15197c = i10;
            View childAt = getChildAt(0);
            if (childAt != null) {
                ViewCompat.offsetTopAndBottom(childAt, this.f15197c - this.f15198d);
            }
        }
        this.f15198d = this.f15197c;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
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
        return this.f15199e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i14 = paddingLeft + marginLayoutParams.leftMargin;
        int measuredWidth = childAt.getMeasuredWidth() + i14;
        int i15 = paddingTop + marginLayoutParams.topMargin + this.f15197c;
        childAt.layout(i14, i15, measuredWidth, childAt.getMeasuredHeight() + i15);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (getChildCount() > 1) {
            throw new IllegalArgumentException("you must set only one child view！");
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        measureChildWithMargins(childAt, i10, 0, i11, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(paddingTop, getSuggestedMinimumHeight()), i11));
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15198d = Integer.MIN_VALUE;
        this.f15199e = Integer.MIN_VALUE;
    }
}
