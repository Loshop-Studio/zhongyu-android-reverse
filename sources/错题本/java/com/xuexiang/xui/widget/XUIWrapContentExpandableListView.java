package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class XUIWrapContentExpandableListView extends ExpandableListView {

    /* renamed from: a */
    public int f3981a;

    public XUIWrapContentExpandableListView(Context context) {
        super(context);
        this.f3981a = 536870911;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f3981a, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i) {
        if (this.f3981a != i) {
            this.f3981a = i;
            requestLayout();
        }
    }

    public XUIWrapContentExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3981a = 536870911;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentExpandableListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3981a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentExpandableListView_wcelv_max_height, this.f3981a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public XUIWrapContentExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3981a = 536870911;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentExpandableListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3981a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentExpandableListView_wcelv_max_height, this.f3981a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
