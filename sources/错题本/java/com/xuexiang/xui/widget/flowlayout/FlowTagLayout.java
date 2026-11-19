package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$styleable;
import java.util.List;
import p122n2.AbstractC6213a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class FlowTagLayout extends ViewGroup {

    /* renamed from: a */
    public int f4314a;

    public FlowTagLayout(Context context) {
        super(context);
        this.f4314a = 0;
        new SparseBooleanArray();
    }

    /* renamed from: a */
    public final void m3488a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlowTagLayout);
        this.f4314a = typedArrayObtainStyledAttributes.getInt(R$styleable.FlowTagLayout_ftl_check_mode, 0);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.FlowTagLayout_ftl_single_cancelable, false);
        if (typedArrayObtainStyledAttributes.getResourceId(R$styleable.FlowTagLayout_ftl_entries, 0) == 0) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            AbstractC6582a.m6217a();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public AbstractC6213a getAdapter() {
        return null;
    }

    @Deprecated
    public int getSelectedIndex() {
        return -1;
    }

    @Nullable
    @Deprecated
    public List<Integer> getSelectedIndexs() {
        return null;
    }

    @Nullable
    @Deprecated
    public <T> T getSelectedItem() {
        return null;
    }

    public int getTagCheckMode() {
        return this.f4314a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        int width = getWidth();
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i12 = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
                int i13 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                if (paddingStart + i12 > (width - getPaddingLeft()) - getPaddingRight()) {
                    paddingTop += i13;
                    paddingStart = getPaddingStart();
                }
                if (getLayoutDirection() == 1) {
                    int marginStart = width - (marginLayoutParams.getMarginStart() + paddingStart);
                    int i14 = marginLayoutParams.topMargin + paddingTop;
                    childAt.layout(marginStart - measuredWidth, i14, marginStart, measuredHeight + i14);
                } else {
                    int marginStart2 = marginLayoutParams.getMarginStart() + paddingStart;
                    int i15 = marginLayoutParams.topMargin + paddingTop;
                    childAt.layout(marginStart2, i15, measuredWidth + marginStart2, measuredHeight + i15);
                }
                paddingStart += i12;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int iMax = 0;
        int i11 = 0;
        int iMax2 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            measureChild(childAt, i, i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i12 = size;
            int i13 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i14 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i15 = i10 + i13;
            if (i15 > (i12 - getPaddingLeft()) - getPaddingRight()) {
                iMax2 = Math.max(i10, i13);
                i11 += i14;
                i10 = i13;
                iMax = i14;
            } else {
                iMax = Math.max(iMax, i14);
                i10 = i15;
            }
            if (i9 == childCount - 1) {
                i11 += iMax;
                iMax2 = Math.max(i10, iMax2);
            }
            setMeasuredDimension(mode == 1073741824 ? i12 : iMax2, mode2 == 1073741824 ? size2 : i11);
            i9++;
            size = i12;
        }
    }

    public FlowTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4314a = 0;
        new SparseBooleanArray();
        m3488a(context, attributeSet);
    }

    public FlowTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4314a = 0;
        new SparseBooleanArray();
        m3488a(context, attributeSet);
    }
}
