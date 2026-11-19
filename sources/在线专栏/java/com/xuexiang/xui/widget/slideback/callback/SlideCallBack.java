package com.xuexiang.xui.widget.slideback.callback;

/* loaded from: classes.dex */
public abstract class SlideCallBack implements SlideBackCallBack {
    private SlideBackCallBack mCallback;

    public SlideCallBack() {
    }

    public abstract void onSlide(int i4);

    @Override // com.xuexiang.xui.widget.slideback.callback.SlideBackCallBack
    public void onSlideBack() {
        SlideBackCallBack slideBackCallBack = this.mCallback;
        if (slideBackCallBack != null) {
            slideBackCallBack.onSlideBack();
        }
    }

    public SlideCallBack(SlideBackCallBack slideBackCallBack) {
        this.mCallback = slideBackCallBack;
    }
}
