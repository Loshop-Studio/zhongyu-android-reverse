package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import androidx.constraintlayout.motion.widget.Key;
import p148s2.AbstractC7691b;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5948a {

    /* renamed from: a */
    public static final Path f5396a;

    /* renamed from: b */
    public static final Path f5397b;

    /* renamed from: c */
    public static final Path f5398c;

    /* renamed from: d */
    public static final Path f5399d;

    static {
        Path path = new Path();
        f5396a = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f5397b = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f5398c = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f5399d = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* renamed from: a */
    public static Animator m4936a(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "trimPathStart", 0.0f, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(AbstractC5966s.f5435b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "trimPathEnd", 0.0f, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(AbstractC5965r.f5433b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(obj, "trimPathOffset", 0.0f, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        objectAnimatorOfFloat3.setInterpolator(AbstractC5964q.f5431a);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator m4937b(Object obj) {
        ObjectAnimator objectAnimatorM9150a = AbstractC7691b.m9150a(obj, "translateX", null, f5396a);
        objectAnimatorM9150a.setDuration(2000L);
        objectAnimatorM9150a.setInterpolator(AbstractC5961n.f5426b);
        objectAnimatorM9150a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM9150a2 = AbstractC7691b.m9150a(obj, null, "scaleX", f5397b);
        objectAnimatorM9150a2.setDuration(2000L);
        objectAnimatorM9150a2.setInterpolator(AbstractC5960m.f5424b);
        objectAnimatorM9150a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM9150a, objectAnimatorM9150a2);
        return animatorSet;
    }

    /* renamed from: c */
    public static Animator m4938c(Object obj) {
        ObjectAnimator objectAnimatorM9150a = AbstractC7691b.m9150a(obj, "translateX", null, f5398c);
        objectAnimatorM9150a.setDuration(2000L);
        objectAnimatorM9150a.setInterpolator(AbstractC5963p.f5430b);
        objectAnimatorM9150a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM9150a2 = AbstractC7691b.m9150a(obj, null, "scaleX", f5399d);
        objectAnimatorM9150a2.setDuration(2000L);
        objectAnimatorM9150a2.setInterpolator(AbstractC5962o.f5428b);
        objectAnimatorM9150a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM9150a, objectAnimatorM9150a2);
        return animatorSet;
    }

    /* renamed from: d */
    public static Animator m4939d(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, Key.ROTATION, 0.0f, 720.0f);
        objectAnimatorOfFloat.setDuration(6665L);
        objectAnimatorOfFloat.setInterpolator(AbstractC5964q.f5431a);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }
}
