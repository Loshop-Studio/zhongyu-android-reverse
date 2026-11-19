package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class HorizontalProgressDrawable extends BaseProgressLayerDrawable<SingleHorizontalProgressDrawable, HorizontalProgressBackgroundDrawable> {
    public HorizontalProgressDrawable(Context context) {
        super(new Drawable[]{new HorizontalProgressBackgroundDrawable(context), new SingleHorizontalProgressDrawable(context), new SingleHorizontalProgressDrawable(context)}, context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public /* bridge */ /* synthetic */ boolean getShowBackground() {
        return super.getShowBackground();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable
    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public /* bridge */ /* synthetic */ void setShowBackground(boolean z3) {
        super.setShowBackground(z3);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable
    public /* bridge */ /* synthetic */ void setTint(int i4) {
        super.setTint(i4);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.BaseProgressLayerDrawable, com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable
    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z3) {
        super.setUseIntrinsicPadding(z3);
    }
}
