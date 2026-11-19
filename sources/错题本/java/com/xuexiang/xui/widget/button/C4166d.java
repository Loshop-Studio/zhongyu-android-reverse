package com.xuexiang.xui.widget.button;

import android.animation.ValueAnimator;

/* renamed from: com.xuexiang.xui.widget.button.d */
/* loaded from: classes3.dex */
public final class C4166d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f4136a;

    /* renamed from: b */
    public final /* synthetic */ SmoothCheckBox f4137b;

    public /* synthetic */ C4166d(SmoothCheckBox smoothCheckBox, int i) {
        this.f4136a = i;
        this.f4137b = smoothCheckBox;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4136a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = this.f4137b;
                smoothCheckBox.f4103j = fFloatValue;
                smoothCheckBox.f4110q = SmoothCheckBox.m3463a(1.0f - smoothCheckBox.f4103j, smoothCheckBox.f4109p, smoothCheckBox.f4108o);
                smoothCheckBox.postInvalidate();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox2 = this.f4137b;
                smoothCheckBox2.f4104k = fFloatValue2;
                smoothCheckBox2.postInvalidate();
                break;
            case 2:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox3 = this.f4137b;
                smoothCheckBox3.f4103j = fFloatValue3;
                smoothCheckBox3.f4110q = SmoothCheckBox.m3463a(smoothCheckBox3.f4103j, smoothCheckBox3.f4108o, smoothCheckBox3.f4111r);
                smoothCheckBox3.postInvalidate();
                break;
            default:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox4 = this.f4137b;
                smoothCheckBox4.f4104k = fFloatValue4;
                smoothCheckBox4.postInvalidate();
                break;
        }
    }
}
