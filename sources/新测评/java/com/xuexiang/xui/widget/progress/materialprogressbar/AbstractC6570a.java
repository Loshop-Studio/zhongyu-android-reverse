package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import androidx.constraintlayout.motion.widget.Key;
import p284x3.AbstractC9846b;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6570a {

    /* renamed from: a */
    public static final Path f6687a;

    /* renamed from: b */
    public static final Path f6688b;

    /* renamed from: c */
    public static final Path f6689c;

    /* renamed from: d */
    public static final Path f6690d;

    static {
        Path path = new Path();
        f6687a = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f6688b = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f6689c = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f6690d = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* renamed from: a */
    public static Animator m5927a(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "trimPathStart", 0.0f, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(AbstractC6588s.f6726b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "trimPathEnd", 0.0f, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(AbstractC6587r.f6724b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(obj, "trimPathOffset", 0.0f, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        objectAnimatorOfFloat3.setInterpolator(AbstractC6586q.f6722a);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator m5928b(Object obj) {
        ObjectAnimator objectAnimatorM16486a = AbstractC9846b.m16486a(obj, "translateX", null, f6687a);
        objectAnimatorM16486a.setDuration(2000L);
        objectAnimatorM16486a.setInterpolator(AbstractC6583n.f6717b);
        objectAnimatorM16486a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM16486a2 = AbstractC9846b.m16486a(obj, null, "scaleX", f6688b);
        objectAnimatorM16486a2.setDuration(2000L);
        objectAnimatorM16486a2.setInterpolator(AbstractC6582m.f6715b);
        objectAnimatorM16486a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM16486a, objectAnimatorM16486a2);
        return animatorSet;
    }

    /* renamed from: c */
    public static Animator m5929c(Object obj) {
        ObjectAnimator objectAnimatorM16486a = AbstractC9846b.m16486a(obj, "translateX", null, f6689c);
        objectAnimatorM16486a.setDuration(2000L);
        objectAnimatorM16486a.setInterpolator(AbstractC6585p.f6721b);
        objectAnimatorM16486a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM16486a2 = AbstractC9846b.m16486a(obj, null, "scaleX", f6690d);
        objectAnimatorM16486a2.setDuration(2000L);
        objectAnimatorM16486a2.setInterpolator(AbstractC6584o.f6719b);
        objectAnimatorM16486a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM16486a, objectAnimatorM16486a2);
        return animatorSet;
    }

    /* renamed from: d */
    public static Animator m5930d(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, Key.ROTATION, 0.0f, 720.0f);
        objectAnimatorOfFloat.setDuration(6665L);
        objectAnimatorOfFloat.setInterpolator(AbstractC6586q.f6722a);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }
}
