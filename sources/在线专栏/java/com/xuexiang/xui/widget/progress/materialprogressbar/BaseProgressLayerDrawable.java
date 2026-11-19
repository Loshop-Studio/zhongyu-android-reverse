package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable;
import p152t.C3385d;

/* loaded from: classes.dex */
class BaseProgressLayerDrawable<ProgressDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable, BackgroundDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable> extends LayerDrawable implements IntrinsicPaddingDrawable, MaterialProgressDrawable, ShowBackgroundDrawable, TintableDrawable {
    private float mBackgroundAlpha;
    private BackgroundDrawableType mBackgroundDrawable;
    private ProgressDrawableType mProgressDrawable;
    private ProgressDrawableType mSecondaryProgressDrawable;

    public BaseProgressLayerDrawable(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.mBackgroundAlpha = ThemeUtils.resolveFloat(context, R.attr.disabledAlpha, IGoodView.DEFAULT_TO_ALPHA);
        setId(0, R.id.background);
        this.mBackgroundDrawable = (BackgroundDrawableType) ((IntrinsicPaddingDrawable) getDrawable(0));
        setId(1, R.id.secondaryProgress);
        this.mSecondaryProgressDrawable = (ProgressDrawableType) ((IntrinsicPaddingDrawable) getDrawable(1));
        setId(2, R.id.progress);
        this.mProgressDrawable = (ProgressDrawableType) ((IntrinsicPaddingDrawable) getDrawable(2));
        setTint(ThemeUtils.getColorFromAttrRes(C2042R.attr.colorControlActivated, IGoodView.DEFAULT_TEXT_COLOR, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mBackgroundDrawable.getShowBackground();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable
    public boolean getUseIntrinsicPadding() {
        return this.mBackgroundDrawable.getUseIntrinsicPadding();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z3) {
        if (this.mBackgroundDrawable.getShowBackground() != z3) {
            this.mBackgroundDrawable.setShowBackground(z3);
            this.mSecondaryProgressDrawable.setShowBackground(!z3);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable
    public void setTint(int i4) {
        int iM10303d = C3385d.m10303d(i4, Math.round(Color.alpha(i4) * this.mBackgroundAlpha));
        this.mBackgroundDrawable.setTint(iM10303d);
        this.mSecondaryProgressDrawable.setTint(iM10303d);
        this.mProgressDrawable.setTint(i4);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.mBackgroundAlpha * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        this.mBackgroundDrawable.setTintList(colorStateListWithAlpha);
        this.mSecondaryProgressDrawable.setTintList(colorStateListWithAlpha);
        this.mProgressDrawable.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.TintableDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.mBackgroundDrawable.setTintMode(mode);
        this.mSecondaryProgressDrawable.setTintMode(mode);
        this.mProgressDrawable.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable
    public void setUseIntrinsicPadding(boolean z3) {
        this.mBackgroundDrawable.setUseIntrinsicPadding(z3);
        this.mSecondaryProgressDrawable.setUseIntrinsicPadding(z3);
        this.mProgressDrawable.setUseIntrinsicPadding(z3);
    }
}
