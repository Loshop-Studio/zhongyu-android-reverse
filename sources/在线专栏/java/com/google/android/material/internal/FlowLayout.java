package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0345h;
import androidx.core.view.C0358u;
import com.google.android.material.C1371R;

/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i4, int i5, int i6) {
        return i5 != Integer.MIN_VALUE ? i5 != 1073741824 ? i6 : i4 : Math.min(i6, i4);
    }

    private void loadFromAttributes(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1371R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected int getItemSpacing() {
        return this.itemSpacing;
    }

    protected int getLineSpacing() {
        return this.lineSpacing;
    }

    protected int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(View view) {
        Object tag = view.getTag(C1371R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int iM1936a;
        int iM1937b;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = 1;
        boolean z4 = C0358u.m1978A(this) == 1;
        int paddingRight = z4 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z4 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = (i6 - i4) - paddingLeft;
        int measuredWidth = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C1371R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iM1937b = C0345h.m1937b(marginLayoutParams);
                    iM1936a = C0345h.m1936a(marginLayoutParams);
                } else {
                    iM1936a = 0;
                    iM1937b = 0;
                }
                int measuredWidth2 = measuredWidth + iM1937b + childAt.getMeasuredWidth();
                if (!this.singleLine && measuredWidth2 > i8) {
                    i9 = this.lineSpacing + paddingTop;
                    this.rowCount++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C1371R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int i11 = measuredWidth + iM1937b;
                int measuredWidth3 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z4) {
                    childAt.layout(i8 - measuredWidth3, i9, (i8 - measuredWidth) - iM1937b, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth3, measuredHeight);
                }
                measuredWidth += iM1937b + iM1936a + childAt.getMeasuredWidth() + this.itemSpacing;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i8 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i8 - getPaddingRight();
        int i9 = paddingTop;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin + 0;
                    i7 = marginLayoutParams.rightMargin + 0;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int i12 = paddingLeft2;
                if (paddingLeft2 + i6 + childAt.getMeasuredWidth() <= paddingRight || isSingleLine()) {
                    paddingLeft = i12;
                } else {
                    paddingLeft = getPaddingLeft();
                    i9 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = paddingLeft + i6 + childAt.getMeasuredWidth();
                int measuredHeight = i9 + childAt.getMeasuredHeight();
                if (measuredWidth > i10) {
                    i10 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i6 + i7 + childAt.getMeasuredWidth() + this.itemSpacing;
                if (i11 == getChildCount() - 1) {
                    i10 += i7;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i10 + getPaddingRight()), getMeasuredDimension(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i4) {
        this.itemSpacing = i4;
    }

    protected void setLineSpacing(int i4) {
        this.lineSpacing = i4;
    }

    public void setSingleLine(boolean z3) {
        this.singleLine = z3;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
