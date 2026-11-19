package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class XUIWrapContentScrollView extends XUIObservableScrollView {

    /* renamed from: b */
    public int f3983b;

    public XUIWrapContentScrollView(Context context) {
        super(context);
        this.f3983b = 536870911;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        int i9 = getLayoutParams().height;
        super.onMeasure(i, (i9 <= 0 || i9 > this.f3983b) ? View.MeasureSpec.makeMeasureSpec(this.f3983b, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY));
    }

    public void setMaxHeight(int i) {
        if (this.f3983b != i) {
            this.f3983b = i;
            requestLayout();
        }
    }

    public XUIWrapContentScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3983b = 536870911;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3983b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentScrollView_wcsv_max_height, this.f3983b);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public XUIWrapContentScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3983b = 536870911;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIWrapContentScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3983b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIWrapContentScrollView_wcsv_max_height, this.f3983b);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
