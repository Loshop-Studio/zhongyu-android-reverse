package com.xuexiang.xui.widget.progress.materialprogressbar;

/* loaded from: classes.dex */
abstract class BaseProgressDrawable extends BasePaintDrawable implements IntrinsicPaddingDrawable {
    protected boolean mUseIntrinsicPadding = true;

    BaseProgressDrawable() {
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable
    public boolean getUseIntrinsicPadding() {
        return this.mUseIntrinsicPadding;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.IntrinsicPaddingDrawable
    public void setUseIntrinsicPadding(boolean z3) {
        if (this.mUseIntrinsicPadding != z3) {
            this.mUseIntrinsicPadding = z3;
            invalidateSelf();
        }
    }
}
