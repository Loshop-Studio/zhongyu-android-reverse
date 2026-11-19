package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p104j0.C2686a;
import p104j0.C2687b;
import p104j0.C2688c;

/* loaded from: classes.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C2687b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new C2686a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new C2688c();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f4, float f5, float f6) {
        return f4 + (f6 * (f5 - f4));
    }

    public static int lerp(int i4, int i5, float f4) {
        return i4 + Math.round(f4 * (i5 - i4));
    }
}
