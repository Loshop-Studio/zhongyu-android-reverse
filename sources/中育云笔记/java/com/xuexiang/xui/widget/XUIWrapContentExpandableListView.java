package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class XUIWrapContentExpandableListView extends ExpandableListView {

    /* renamed from: c */
    public int f15325c;

    public XUIWrapContentExpandableListView(Context context) {
        super(context);
        this.f15325c = 536870911;
    }

    /* renamed from: a */
    public final void m12262a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentExpandableListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f15325c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentExpandableListView_wcelv_max_height, this.f15325c);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f15325c, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i10) {
        if (this.f15325c != i10) {
            this.f15325c = i10;
            requestLayout();
        }
    }

    public XUIWrapContentExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15325c = 536870911;
        m12262a(context, attributeSet);
    }

    public XUIWrapContentExpandableListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15325c = 536870911;
        m12262a(context, attributeSet);
    }
}
