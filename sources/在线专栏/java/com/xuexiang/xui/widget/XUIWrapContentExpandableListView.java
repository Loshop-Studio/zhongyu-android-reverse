package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class XUIWrapContentExpandableListView extends ExpandableListView {
    private int mMaxHeight;

    public XUIWrapContentExpandableListView(Context context) {
        super(context);
        this.mMaxHeight = 536870911;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XUIWrapContentExpandableListView);
        if (typedArrayObtainStyledAttributes != null) {
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XUIWrapContentExpandableListView_wcelv_max_height, this.mMaxHeight);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(this.mMaxHeight, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i4) {
        if (this.mMaxHeight != i4) {
            this.mMaxHeight = i4;
            requestLayout();
        }
    }

    public XUIWrapContentExpandableListView(Context context, int i4) {
        super(context);
        this.mMaxHeight = i4;
    }

    public XUIWrapContentExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxHeight = 536870911;
        initAttrs(context, attributeSet);
    }

    public XUIWrapContentExpandableListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mMaxHeight = 536870911;
        initAttrs(context, attributeSet);
    }
}
