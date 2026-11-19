package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class XUIWrapContentListView extends ListView {

    /* renamed from: a */
    public int f3982a;

    public XUIWrapContentListView(Context context) {
        super(context);
        this.f3982a = 536870911;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f3982a, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i) {
        if (this.f3982a != i) {
            this.f3982a = i;
            requestLayout();
        }
    }

    public XUIWrapContentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3982a = 536870911;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3982a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentListView_wclv_max_height, this.f3982a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public XUIWrapContentListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3982a = 536870911;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3982a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentListView_wclv_max_height, this.f3982a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
