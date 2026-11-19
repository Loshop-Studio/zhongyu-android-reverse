package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes4.dex */
public class XUIWrapContentListView extends ListView {

    /* renamed from: a */
    public int f7104a;

    public XUIWrapContentListView(Context context) {
        super(context);
        this.f7104a = 536870911;
    }

    /* renamed from: a */
    public final void m6519a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f7104a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentListView_wclv_max_height, this.f7104a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f7104a, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i10) {
        if (this.f7104a != i10) {
            this.f7104a = i10;
            requestLayout();
        }
    }

    public XUIWrapContentListView(Context context, int i10) {
        super(context);
        this.f7104a = i10;
    }

    public XUIWrapContentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7104a = 536870911;
        m6519a(context, attributeSet);
    }
}
