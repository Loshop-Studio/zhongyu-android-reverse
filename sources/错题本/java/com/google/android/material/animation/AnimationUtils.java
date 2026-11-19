package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.support.v4.media.AbstractC0037f;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f, float f7, float f8) {
        return AbstractC0037f.m77b(f7, f, f8, f);
    }

    public static int lerp(int i, int i8, float f) {
        return Math.round(f * (i8 - i)) + i;
    }

    public static float lerp(float f, float f7, float f8, float f9, float f10) {
        return f10 <= f8 ? f : f10 >= f9 ? f7 : lerp(f, f7, (f10 - f8) / (f9 - f8));
    }
}
