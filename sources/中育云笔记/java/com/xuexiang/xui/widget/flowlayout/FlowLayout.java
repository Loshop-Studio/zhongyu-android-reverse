package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: c */
    public List f15940c;

    /* renamed from: d */
    public List f15941d;

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15940c = new ArrayList();
        this.f15941d = new ArrayList();
    }

    /* renamed from: a */
    public final boolean m12623a() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f15940c.clear();
        this.f15941d.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int iMax = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i16 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i17 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (i14 + i16 > (width - getPaddingLeft()) - getPaddingRight()) {
                this.f15941d.add(Integer.valueOf(iMax));
                this.f15940c.add(arrayList);
                arrayList = new ArrayList();
                i14 = 0;
                iMax = i17;
            }
            i14 += i16;
            iMax = Math.max(iMax, i17);
            arrayList.add(childAt);
        }
        this.f15941d.add(Integer.valueOf(iMax));
        this.f15940c.add(arrayList);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int size = this.f15940c.size();
        for (int i18 = 0; i18 < size; i18++) {
            List list = (List) this.f15940c.get(i18);
            int iIntValue = ((Integer) this.f15941d.get(i18)).intValue();
            for (int i19 = 0; i19 < list.size(); i19++) {
                View view = (View) list.get(i19);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (m12623a()) {
                        int marginStart = width - (marginLayoutParams2.getMarginStart() + paddingStart);
                        int i20 = marginLayoutParams2.topMargin + paddingTop;
                        view.layout(marginStart - view.getMeasuredWidth(), i20, marginStart, view.getMeasuredHeight() + i20);
                    } else {
                        int marginStart2 = marginLayoutParams2.getMarginStart() + paddingStart;
                        int i21 = marginLayoutParams2.topMargin + paddingTop;
                        view.layout(marginStart2, i21, view.getMeasuredWidth() + marginStart2, view.getMeasuredHeight() + i21);
                    }
                    paddingStart += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingStart = getPaddingStart();
            paddingTop += iIntValue;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        int i15 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            measureChild(childAt, i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i16 = size;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i17 = i13 + measuredWidth;
            if (i17 > (i16 - getPaddingLeft()) - getPaddingRight()) {
                iMax = Math.max(iMax, i13);
                i15 += i14;
                i13 = measuredWidth;
            } else {
                measuredHeight = Math.max(i14, measuredHeight);
                i13 = i17;
            }
            i14 = measuredHeight;
            if (i12 == childCount - 1) {
                i15 += i14;
                iMax = Math.max(i13, iMax);
            }
            setMeasuredDimension(mode == 1073741824 ? i16 : iMax, mode2 == 1073741824 ? size2 : i15);
            i12++;
            size = i16;
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15940c = new ArrayList();
        this.f15941d = new ArrayList();
    }

    public FlowLayout(Context context) {
        super(context);
        this.f15940c = new ArrayList();
        this.f15941d = new ArrayList();
    }
}
