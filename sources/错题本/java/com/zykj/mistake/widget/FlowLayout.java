package com.zykj.mistake.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/mistake/widget/FlowLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getFirstSelectedIndex", "()I", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FlowLayout extends ViewGroup {

    /* renamed from: a */
    public final int f8074a;

    /* renamed from: b */
    public final ArrayList f8075b;

    /* renamed from: c */
    public final ArrayList f8076c;

    @JvmOverloads
    public FlowLayout(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        AbstractC5830k.m5330g(attrs, "attrs");
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public final int getFirstSelectedIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isSelected()) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        ArrayList arrayList = this.f8075b;
        arrayList.clear();
        ArrayList arrayList2 = this.f8076c;
        arrayList2.clear();
        int width = getWidth();
        ArrayList arrayList3 = new ArrayList();
        int childCount = getChildCount();
        int iMax = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredWidth + i11 > (width - getPaddingLeft()) - getPaddingRight()) {
                arrayList2.add(Integer.valueOf(iMax));
                arrayList.add(arrayList3);
                arrayList3 = new ArrayList();
                i11 = 0;
                iMax = measuredHeight;
            }
            i11 += measuredWidth;
            iMax = Math.max(iMax, measuredHeight);
            arrayList3.add(childAt);
        }
        arrayList2.add(Integer.valueOf(iMax));
        arrayList.add(arrayList3);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list = (List) arrayList.get(i13);
            Object obj = arrayList2.get(i13);
            AbstractC5830k.m5329f(obj, "get(...)");
            int iIntValue = ((Number) obj).intValue();
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view = (View) list.get(i14);
                if (view.getVisibility() != 8) {
                    view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
                    paddingLeft = view.getMeasuredWidth() + paddingLeft;
                }
            }
            paddingLeft = getPaddingLeft();
            paddingTop += iIntValue + this.f8074a;
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
        int iMax = 0;
        int iMax2 = 0;
        int i11 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            measureChild(childAt, i, i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = i10 + measuredWidth;
            int i13 = size;
            if (i12 > (size - getPaddingLeft()) - getPaddingRight()) {
                iMax = Math.max(iMax, i10);
                i11 += iMax2 + this.f8074a;
                iMax2 = measuredHeight;
                i10 = measuredWidth;
            } else {
                iMax2 = Math.max(iMax2, measuredHeight);
                i10 = i12;
            }
            if (i9 == childCount - 1) {
                i11 += iMax2;
                iMax = Math.max(i10, iMax);
            }
            i9++;
            size = i13;
        }
        int paddingLeft = mode == 1073741824 ? size : getPaddingLeft() + iMax + getPaddingRight();
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + i11;
        }
        setMeasuredDimension(paddingLeft, size2);
    }

    @JvmOverloads
    public FlowLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ FlowLayout(Context context, AttributeSet attributeSet, int i, int i8) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public FlowLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        int dimensionPixelSize = 0;
        if (context != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlowLayout)) != null) {
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_flow_lineSpacing, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8074a = dimensionPixelSize;
        this.f8075b = new ArrayList();
        this.f8076c = new ArrayList();
    }
}
