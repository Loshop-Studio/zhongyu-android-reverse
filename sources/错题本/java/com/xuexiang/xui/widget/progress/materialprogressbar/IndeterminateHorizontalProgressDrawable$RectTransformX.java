package com.xuexiang.xui.widget.progress.materialprogressbar;

import androidx.annotation.Keep;

/* loaded from: classes3.dex */
class IndeterminateHorizontalProgressDrawable$RectTransformX {

    /* renamed from: a */
    public float f4723a;

    /* renamed from: b */
    public float f4724b;

    public IndeterminateHorizontalProgressDrawable$RectTransformX(float f) {
        this.f4723a = f;
        this.f4724b = 0.1f;
    }

    @Keep
    public void setScaleX(float f) {
        this.f4724b = f;
    }

    @Keep
    public void setTranslateX(float f) {
        this.f4723a = f;
    }

    public IndeterminateHorizontalProgressDrawable$RectTransformX(IndeterminateHorizontalProgressDrawable$RectTransformX indeterminateHorizontalProgressDrawable$RectTransformX) {
        this.f4723a = indeterminateHorizontalProgressDrawable$RectTransformX.f4723a;
        this.f4724b = indeterminateHorizontalProgressDrawable$RectTransformX.f4724b;
    }
}
