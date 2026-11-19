package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
class PartialView extends RelativeLayout {
    private ImageView mEmptyView;
    private ImageView mFilledView;
    private int mStarHeight;
    private int mStarWidth;

    public PartialView(Context context, int i4, int i5, int i6, int i7) {
        super(context);
        this.mStarWidth = i5;
        this.mStarHeight = i6;
        setTag(Integer.valueOf(i4));
        setPadding(i7, i7, i7, i7);
        init();
    }

    private void init() {
        int i4 = this.mStarWidth;
        if (i4 == 0) {
            i4 = -2;
        }
        int i5 = this.mStarHeight;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i4, i5 != 0 ? i5 : -2);
        ImageView imageView = new ImageView(getContext());
        this.mFilledView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.mFilledView, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.mEmptyView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.mEmptyView, layoutParams);
        setEmpty();
    }

    public void setEmpty() {
        this.mFilledView.setImageLevel(0);
        this.mEmptyView.setImageLevel(10000);
    }

    public void setEmptyDrawable(Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }
        this.mEmptyView.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388613, 1));
    }

    public void setFilled() {
        this.mFilledView.setImageLevel(10000);
        this.mEmptyView.setImageLevel(0);
    }

    public void setFilledDrawable(Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }
        this.mFilledView.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388611, 1));
    }

    public void setPartialFilled(float f4) {
        int i4 = (int) ((f4 % 1.0f) * 10000.0f);
        if (i4 == 0) {
            i4 = 10000;
        }
        this.mFilledView.setImageLevel(i4);
        this.mEmptyView.setImageLevel(10000 - i4);
    }

    public void setStarHeight(int i4) {
        this.mStarHeight = i4;
        ViewGroup.LayoutParams layoutParams = this.mFilledView.getLayoutParams();
        layoutParams.height = this.mStarHeight;
        this.mFilledView.setLayoutParams(layoutParams);
        this.mEmptyView.setLayoutParams(layoutParams);
    }

    public void setStarWidth(int i4) {
        this.mStarWidth = i4;
        ViewGroup.LayoutParams layoutParams = this.mFilledView.getLayoutParams();
        layoutParams.width = this.mStarWidth;
        this.mFilledView.setLayoutParams(layoutParams);
        this.mEmptyView.setLayoutParams(layoutParams);
    }

    public PartialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStarWidth = 0;
        this.mStarHeight = 0;
        init();
    }

    public PartialView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mStarWidth = 0;
        this.mStarHeight = 0;
        init();
    }
}
