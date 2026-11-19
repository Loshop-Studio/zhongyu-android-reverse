package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class XUIWrapContentScrollView extends XUIObservableScrollView {
    private int mMaxHeight;

    public XUIWrapContentScrollView(Context context) {
        super(context);
        this.mMaxHeight = 536870911;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XUIWrapContentScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XUIWrapContentScrollView_wcsv_max_height, this.mMaxHeight);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6 = getLayoutParams().height;
        super.onMeasure(i4, (i6 <= 0 || i6 > this.mMaxHeight) ? View.MeasureSpec.makeMeasureSpec(this.mMaxHeight, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
    }

    public void setMaxHeight(int i4) {
        if (this.mMaxHeight != i4) {
            this.mMaxHeight = i4;
            requestLayout();
        }
    }

    public XUIWrapContentScrollView(Context context, int i4) {
        super(context);
        this.mMaxHeight = i4;
    }

    public XUIWrapContentScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxHeight = 536870911;
        initAttrs(context, attributeSet);
    }

    public XUIWrapContentScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mMaxHeight = 536870911;
        initAttrs(context, attributeSet);
    }
}
