package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class XUIWrapContentListView extends ListView {

    /* renamed from: c */
    public int f15326c;

    public XUIWrapContentListView(Context context) {
        super(context);
        this.f15326c = 536870911;
    }

    /* renamed from: a */
    public final void m12263a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f15326c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentListView_wclv_max_height, this.f15326c);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f15326c, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i10) {
        if (this.f15326c != i10) {
            this.f15326c = i10;
            requestLayout();
        }
    }

    public XUIWrapContentListView(Context context, int i10) {
        super(context);
        this.f15326c = i10;
    }

    public XUIWrapContentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15326c = 536870911;
        m12263a(context, attributeSet);
    }

    public XUIWrapContentListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15326c = 536870911;
        m12263a(context, attributeSet);
    }
}
