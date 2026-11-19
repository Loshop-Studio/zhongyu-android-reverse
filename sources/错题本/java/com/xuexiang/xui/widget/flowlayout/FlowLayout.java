package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    public final ArrayList f4312a;

    /* renamed from: b */
    public final ArrayList f4313b;

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4312a = new ArrayList();
        this.f4313b = new ArrayList();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        FlowLayout flowLayout = this;
        ArrayList arrayList = flowLayout.f4312a;
        arrayList.clear();
        ArrayList arrayList2 = flowLayout.f4313b;
        arrayList2.clear();
        int width = flowLayout.getWidth();
        ArrayList arrayList3 = new ArrayList();
        int childCount = flowLayout.getChildCount();
        int iMax = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = flowLayout.getChildAt(i12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i14 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (i11 + i13 > (width - flowLayout.getPaddingLeft()) - flowLayout.getPaddingRight()) {
                arrayList2.add(Integer.valueOf(iMax));
                arrayList.add(arrayList3);
                arrayList3 = new ArrayList();
                iMax = i14;
                i11 = 0;
            }
            i11 += i13;
            iMax = Math.max(iMax, i14);
            arrayList3.add(childAt);
        }
        arrayList2.add(Integer.valueOf(iMax));
        arrayList.add(arrayList3);
        int paddingStart = flowLayout.getPaddingStart();
        int paddingTop = flowLayout.getPaddingTop();
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            List list = (List) arrayList.get(i15);
            int iIntValue = ((Integer) arrayList2.get(i15)).intValue();
            int i16 = 0;
            while (i16 < list.size()) {
                View view = (View) list.get(i16);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (flowLayout.getLayoutDirection() == 1) {
                        int marginStart = width - (marginLayoutParams2.getMarginStart() + paddingStart);
                        int i17 = marginLayoutParams2.topMargin + paddingTop;
                        view.layout(marginStart - view.getMeasuredWidth(), i17, marginStart, view.getMeasuredHeight() + i17);
                    } else {
                        int marginStart2 = marginLayoutParams2.getMarginStart() + paddingStart;
                        int i18 = marginLayoutParams2.topMargin + paddingTop;
                        view.layout(marginStart2, i18, view.getMeasuredWidth() + marginStart2, view.getMeasuredHeight() + i18);
                    }
                    paddingStart = view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + paddingStart;
                }
                i16++;
                flowLayout = this;
            }
            paddingStart = getPaddingStart();
            paddingTop += iIntValue;
            i15++;
            flowLayout = this;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            measureChild(childAt, i, i8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i13 = size;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i14 = i10 + measuredWidth;
            if (i14 > (i13 - getPaddingLeft()) - getPaddingRight()) {
                iMax = Math.max(iMax, i10);
                i12 += i11;
                i10 = measuredWidth;
            } else {
                measuredHeight = Math.max(i11, measuredHeight);
                i10 = i14;
            }
            i11 = measuredHeight;
            if (i9 == childCount - 1) {
                i12 += i11;
                iMax = Math.max(i10, iMax);
            }
            setMeasuredDimension(mode == 1073741824 ? i13 : iMax, mode2 == 1073741824 ? size2 : i12);
            i9++;
            size = i13;
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4312a = new ArrayList();
        this.f4313b = new ArrayList();
    }

    public FlowLayout(Context context) {
        super(context);
        this.f4312a = new ArrayList();
        this.f4313b = new ArrayList();
    }
}
