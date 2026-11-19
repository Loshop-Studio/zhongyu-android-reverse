package p070b.p113c.p114a.p116e.p123c;

import android.animation.ValueAnimator;

/* renamed from: b.c.a.e.c.e */
/* loaded from: classes.dex */
public class C0802e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0804g f4507a;

    public C0802e(C0804g c0804g) {
        this.f4507a = c0804g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4507a.f4509a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
