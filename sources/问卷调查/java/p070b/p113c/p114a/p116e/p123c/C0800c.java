package p070b.p113c.p114a.p116e.p123c;

import android.animation.ValueAnimator;

/* renamed from: b.c.a.e.c.c */
/* loaded from: classes.dex */
public class C0800c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0804g f4505a;

    public C0800c(C0804g c0804g) {
        this.f4505a = c0804g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4505a.f4509a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
