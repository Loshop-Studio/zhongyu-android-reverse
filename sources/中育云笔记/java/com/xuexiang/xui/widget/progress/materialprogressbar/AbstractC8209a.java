package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import androidx.constraintlayout.motion.widget.Key;
import p148f9.AbstractC9207b;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8209a {

    /* renamed from: a */
    public static final Path f16821a;

    /* renamed from: b */
    public static final Path f16822b;

    /* renamed from: c */
    public static final Path f16823c;

    /* renamed from: d */
    public static final Path f16824d;

    static {
        Path path = new Path();
        f16821a = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f16822b = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f16823c = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f16824d = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* renamed from: a */
    public static Animator m13142a(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "trimPathStart", 0.0f, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(AbstractC8227s.f16860b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "trimPathEnd", 0.0f, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(AbstractC8226r.f16858b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(obj, "trimPathOffset", 0.0f, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        objectAnimatorOfFloat3.setInterpolator(AbstractC8225q.f16856a);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator m13143b(Object obj) {
        ObjectAnimator objectAnimatorM18116a = AbstractC9207b.m18116a(obj, "translateX", null, f16821a);
        objectAnimatorM18116a.setDuration(2000L);
        objectAnimatorM18116a.setInterpolator(AbstractC8222n.f16851b);
        objectAnimatorM18116a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM18116a2 = AbstractC9207b.m18116a(obj, null, "scaleX", f16822b);
        objectAnimatorM18116a2.setDuration(2000L);
        objectAnimatorM18116a2.setInterpolator(AbstractC8221m.f16849b);
        objectAnimatorM18116a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM18116a, objectAnimatorM18116a2);
        return animatorSet;
    }

    /* renamed from: c */
    public static Animator m13144c(Object obj) {
        ObjectAnimator objectAnimatorM18116a = AbstractC9207b.m18116a(obj, "translateX", null, f16823c);
        objectAnimatorM18116a.setDuration(2000L);
        objectAnimatorM18116a.setInterpolator(AbstractC8224p.f16855b);
        objectAnimatorM18116a.setRepeatCount(-1);
        ObjectAnimator objectAnimatorM18116a2 = AbstractC9207b.m18116a(obj, null, "scaleX", f16824d);
        objectAnimatorM18116a2.setDuration(2000L);
        objectAnimatorM18116a2.setInterpolator(AbstractC8223o.f16853b);
        objectAnimatorM18116a2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorM18116a, objectAnimatorM18116a2);
        return animatorSet;
    }

    /* renamed from: d */
    public static Animator m13145d(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, Key.ROTATION, 0.0f, 720.0f);
        objectAnimatorOfFloat.setDuration(6665L);
        objectAnimatorOfFloat.setInterpolator(AbstractC8225q.f16856a);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }
}
