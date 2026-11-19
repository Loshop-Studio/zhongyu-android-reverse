package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class XUIWrapContentScrollView extends XUIObservableScrollView {

    /* renamed from: e */
    public int f15327e;

    public XUIWrapContentScrollView(Context context) {
        super(context);
        this.f15327e = 536870911;
    }

    /* renamed from: a */
    public final void m12264a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f15327e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentScrollView_wcsv_max_height, this.f15327e);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = getLayoutParams().height;
        super.onMeasure(i10, (i12 <= 0 || i12 > this.f15327e) ? View.MeasureSpec.makeMeasureSpec(this.f15327e, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
    }

    public void setMaxHeight(int i10) {
        if (this.f15327e != i10) {
            this.f15327e = i10;
            requestLayout();
        }
    }

    public XUIWrapContentScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15327e = 536870911;
        m12264a(context, attributeSet);
    }

    public XUIWrapContentScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15327e = 536870911;
        m12264a(context, attributeSet);
    }
}
