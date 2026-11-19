package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import androidx.constraintlayout.motion.widget.Key;
import p188n4.AbstractC9093b;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6890a {

    /* renamed from: a */
    public static final Path f7945a;

    /* renamed from: b */
    public static final Path f7946b;

    /* renamed from: c */
    public static final Path f7947c;

    /* renamed from: d */
    public static final Path f7948d;

    static {
        Path path = new Path();
        f7945a = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f7946b = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f7947c = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f7948d = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* renamed from: a */
    public static Animator m7025a(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "trimPathStart", 0.0f, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(AbstractC6908s.f7984b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "trimPathEnd", 0.0f, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(AbstractC6907r.f7982b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(obj, "trimPathOffset", 0.0f, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        objectAnimatorOfFloat3.setInterpolator(AbstractC6906q.f7980a);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator m7026b(Object obj) {
        ObjectAnimator objectAnimatorM14625a = AbstractC9093b.m14625a(obj, "translateX", null, f7945a);
        objectAnimatorM14625a.setDuration(2000L);
        objectAnimatorM14625a.setInterpolator(AbstractC6903n.f7975b);
        objectAnimatorM14625a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM14625a2 = AbstractC9093b.m14625a(obj, null, "scaleX", f7946b);
        objectAnimatorM14625a2.setDuration(2000L);
        objectAnimatorM14625a2.setInterpolator(AbstractC6902m.f7973b);
        objectAnimatorM14625a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM14625a, objectAnimatorM14625a2);
        return animatorSet;
    }

    /* renamed from: c */
    public static Animator m7027c(Object obj) {
        ObjectAnimator objectAnimatorM14625a = AbstractC9093b.m14625a(obj, "translateX", null, f7947c);
        objectAnimatorM14625a.setDuration(2000L);
        objectAnimatorM14625a.setInterpolator(AbstractC6905p.f7979b);
        objectAnimatorM14625a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM14625a2 = AbstractC9093b.m14625a(obj, null, "scaleX", f7948d);
        objectAnimatorM14625a2.setDuration(2000L);
        objectAnimatorM14625a2.setInterpolator(AbstractC6904o.f7977b);
        objectAnimatorM14625a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM14625a, objectAnimatorM14625a2);
        return animatorSet;
    }

    /* renamed from: d */
    public static Animator m7028d(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, Key.ROTATION, 0.0f, 720.0f);
        objectAnimatorOfFloat.setDuration(6665L);
        objectAnimatorOfFloat.setInterpolator(AbstractC6906q.f7980a);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }
}
