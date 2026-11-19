package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import com.xuexiang.xui.widget.popupwindow.bar.Cookie;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.progress.materialprogressbar.Interpolators;
import com.xuexiang.xui.widget.progress.materialprogressbar.internal.ObjectAnimatorCompat;

/* loaded from: classes.dex */
class Animators {
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X;

    static {
        Path path = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X = path;
        path.moveTo(-522.6f, IGoodView.DEFAULT_TO_ALPHA);
        path.rCubicTo(48.89972f, IGoodView.DEFAULT_TO_ALPHA, 166.02657f, IGoodView.DEFAULT_TO_ALPHA, 301.2173f, IGoodView.DEFAULT_TO_ALPHA);
        path.rCubicTo(197.58128f, IGoodView.DEFAULT_TO_ALPHA, 420.9827f, IGoodView.DEFAULT_TO_ALPHA, 420.9827f, IGoodView.DEFAULT_TO_ALPHA);
        Path path2 = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X = path2;
        path2.moveTo(IGoodView.DEFAULT_TO_ALPHA, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X = path3;
        path3.moveTo(-197.6f, IGoodView.DEFAULT_TO_ALPHA);
        path3.rCubicTo(14.28182f, IGoodView.DEFAULT_TO_ALPHA, 85.07782f, IGoodView.DEFAULT_TO_ALPHA, 135.54689f, IGoodView.DEFAULT_TO_ALPHA);
        path3.rCubicTo(54.26191f, IGoodView.DEFAULT_TO_ALPHA, 90.42461f, IGoodView.DEFAULT_TO_ALPHA, 168.24332f, IGoodView.DEFAULT_TO_ALPHA);
        path3.rCubicTo(144.72154f, IGoodView.DEFAULT_TO_ALPHA, 316.40982f, IGoodView.DEFAULT_TO_ALPHA, 316.40982f, IGoodView.DEFAULT_TO_ALPHA);
        Path path4 = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X = path4;
        path4.moveTo(IGoodView.DEFAULT_TO_ALPHA, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    private Animators() {
    }

    public static Animator createIndeterminate(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "trimPathStart", IGoodView.DEFAULT_TO_ALPHA, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(Interpolators.TRIM_PATH_START.INSTANCE);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "trimPathEnd", IGoodView.DEFAULT_TO_ALPHA, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(Interpolators.TRIM_PATH_END.INSTANCE);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(obj, "trimPathOffset", IGoodView.DEFAULT_TO_ALPHA, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        objectAnimatorOfFloat3.setInterpolator(Interpolators.LINEAR.INSTANCE);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    public static Animator createIndeterminateHorizontalRect1(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimatorCompat.ofFloat(obj, "translateX", (String) null, PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X);
        objectAnimatorOfFloat.setDuration(Cookie.DEFAULT_COOKIE_DURATION);
        objectAnimatorOfFloat.setInterpolator(Interpolators.INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X.INSTANCE);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimatorCompat.ofFloat(obj, (String) null, "scaleX", PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X);
        objectAnimatorOfFloat2.setDuration(Cookie.DEFAULT_COOKIE_DURATION);
        objectAnimatorOfFloat2.setInterpolator(Interpolators.INDETERMINATE_HORIZONTAL_RECT1_SCALE_X.INSTANCE);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static Animator createIndeterminateHorizontalRect2(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimatorCompat.ofFloat(obj, "translateX", (String) null, PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X);
        objectAnimatorOfFloat.setDuration(Cookie.DEFAULT_COOKIE_DURATION);
        objectAnimatorOfFloat.setInterpolator(Interpolators.INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X.INSTANCE);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimatorCompat.ofFloat(obj, (String) null, "scaleX", PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X);
        objectAnimatorOfFloat2.setDuration(Cookie.DEFAULT_COOKIE_DURATION);
        objectAnimatorOfFloat2.setInterpolator(Interpolators.INDETERMINATE_HORIZONTAL_RECT2_SCALE_X.INSTANCE);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static Animator createIndeterminateRotation(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "rotation", IGoodView.DEFAULT_TO_ALPHA, 720.0f);
        objectAnimatorOfFloat.setDuration(6665L);
        objectAnimatorOfFloat.setInterpolator(Interpolators.LINEAR.INSTANCE);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }
}
