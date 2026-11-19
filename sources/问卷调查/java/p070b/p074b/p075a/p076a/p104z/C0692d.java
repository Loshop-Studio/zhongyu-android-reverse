package p070b.p074b.p075a.p076a.p104z;

import android.animation.ValueAnimator;

/* renamed from: b.b.a.a.z.d */
/* loaded from: classes.dex */
public class C0692d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0689a f4129a;

    public C0692d(C0689a c0689a) {
        this.f4129a = c0689a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4129a.f4162c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
