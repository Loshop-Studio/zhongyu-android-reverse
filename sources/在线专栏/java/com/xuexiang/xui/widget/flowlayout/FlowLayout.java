package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {
    private List<List<View>> mAllViews;
    private List<Integer> mLineHeight;

    public FlowLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.mAllViews.clear();
        this.mLineHeight.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int iMax = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i11 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (i8 + i10 > (width - getPaddingLeft()) - getPaddingRight()) {
                this.mLineHeight.add(Integer.valueOf(iMax));
                this.mAllViews.add(arrayList);
                arrayList = new ArrayList();
                iMax = i11;
                i8 = 0;
            }
            i8 += i10;
            iMax = Math.max(iMax, i11);
            arrayList.add(childAt);
        }
        this.mLineHeight.add(Integer.valueOf(iMax));
        this.mAllViews.add(arrayList);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int size = this.mAllViews.size();
        for (int i12 = 0; i12 < size; i12++) {
            List<View> list = this.mAllViews.get(i12);
            int iIntValue = this.mLineHeight.get(i12).intValue();
            for (int i13 = 0; i13 < list.size(); i13++) {
                View view = list.get(i13);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (isRtl()) {
                        int marginStart = width - (marginLayoutParams2.getMarginStart() + paddingStart);
                        int i14 = marginLayoutParams2.topMargin + paddingTop;
                        view.layout(marginStart - view.getMeasuredWidth(), i14, marginStart, view.getMeasuredHeight() + i14);
                    } else {
                        int marginStart2 = marginLayoutParams2.getMarginStart() + paddingStart;
                        int i15 = marginLayoutParams2.topMargin + paddingTop;
                        view.layout(marginStart2, i15, view.getMeasuredWidth() + marginStart2, view.getMeasuredHeight() + i15);
                    }
                    paddingStart += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingStart = getPaddingStart();
            paddingTop += iIntValue;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i8 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            measureChild(childAt, i4, i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i9 = size2;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i10 = i7 + measuredWidth;
            if (i10 > (size - getPaddingLeft()) - getPaddingRight()) {
                iMax = Math.max(iMax, i7);
                i8 += iMax2;
                iMax2 = measuredHeight;
                i7 = measuredWidth;
            } else {
                iMax2 = Math.max(iMax2, measuredHeight);
                i7 = i10;
            }
            if (i6 == childCount - 1) {
                i8 += iMax2;
                iMax = Math.max(i7, iMax);
            }
            i6++;
            size2 = i9;
        }
        int i11 = size2;
        if (mode != 1073741824) {
            size = iMax;
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i11 : i8);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
    }

    public FlowLayout(Context context) {
        super(context);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
    }
}
