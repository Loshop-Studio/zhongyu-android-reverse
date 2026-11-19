package com.xuexiang.xui.widget.button.shinebutton.interpolator;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class EasingInterpolator implements Interpolator {
    private final Ease ease;

    public EasingInterpolator(Ease ease) {
        this.ease = ease;
    }

    public Ease getEase() {
        return this.ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        return EasingProvider.get(this.ease, f4);
    }
}
