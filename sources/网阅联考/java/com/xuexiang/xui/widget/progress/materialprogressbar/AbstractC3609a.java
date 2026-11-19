package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import p073i1.AbstractC3779b;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3609a {

    /* renamed from: a */
    public static final Path f3875a;

    /* renamed from: b */
    public static final Path f3876b;

    /* renamed from: c */
    public static final Path f3877c;

    /* renamed from: d */
    public static final Path f3878d;

    static {
        Path path = new Path();
        f3875a = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f3876b = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f3877c = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f3878d = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* renamed from: a */
    public static Animator m4558a(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "trimPathStart", 0.0f, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(AbstractC3627s.f3914b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "trimPathEnd", 0.0f, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(AbstractC3626r.f3912b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(obj, "trimPathOffset", 0.0f, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        objectAnimatorOfFloat3.setInterpolator(AbstractC3625q.f3910a);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator m4559b(Object obj) {
        ObjectAnimator objectAnimatorM4922a = AbstractC3779b.m4922a(obj, "translateX", null, f3875a);
        objectAnimatorM4922a.setDuration(2000L);
        objectAnimatorM4922a.setInterpolator(AbstractC3622n.f3905b);
        objectAnimatorM4922a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM4922a2 = AbstractC3779b.m4922a(obj, null, "scaleX", f3876b);
        objectAnimatorM4922a2.setDuration(2000L);
        objectAnimatorM4922a2.setInterpolator(AbstractC3621m.f3903b);
        objectAnimatorM4922a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM4922a, objectAnimatorM4922a2);
        return animatorSet;
    }

    /* renamed from: c */
    public static Animator m4560c(Object obj) {
        ObjectAnimator objectAnimatorM4922a = AbstractC3779b.m4922a(obj, "translateX", null, f3877c);
        objectAnimatorM4922a.setDuration(2000L);
        objectAnimatorM4922a.setInterpolator(AbstractC3624p.f3909b);
        objectAnimatorM4922a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM4922a2 = AbstractC3779b.m4922a(obj, null, "scaleX", f3878d);
        objectAnimatorM4922a2.setDuration(2000L);
        objectAnimatorM4922a2.setInterpolator(AbstractC3623o.f3907b);
        objectAnimatorM4922a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM4922a, objectAnimatorM4922a2);
        return animatorSet;
    }

    /* renamed from: d */
    public static Animator m4561d(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "rotation", 0.0f, 720.0f);
        objectAnimatorOfFloat.setDuration(6665L);
        objectAnimatorOfFloat.setInterpolator(AbstractC3625q.f3910a);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }
}
