package com.xuexiang.xui.widget.button.shinebutton;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.EasingInterpolator;

/* loaded from: classes.dex */
public class ShineAnimator extends ValueAnimator {
    private static final long DEFAULT_ANIM_DURATION = 1500;
    private static final float DEFAULT_MAX_VALUE = 1.5f;

    public ShineAnimator() {
        setFloatValues(1.0f, DEFAULT_MAX_VALUE);
        setDuration(DEFAULT_ANIM_DURATION);
        setStartDelay(200L);
        setInterpolator(new EasingInterpolator(Ease.QUART_OUT));
    }

    public ShineAnimator(long j4, float f4, long j5) {
        setFloatValues(1.0f, f4);
        setDuration(j4);
        setStartDelay(j5);
        setInterpolator(new EasingInterpolator(Ease.QUART_OUT));
    }
}
