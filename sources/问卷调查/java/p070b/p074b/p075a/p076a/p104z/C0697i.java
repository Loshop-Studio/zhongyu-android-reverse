package p070b.p074b.p075a.p076a.p104z;

import android.animation.ValueAnimator;

/* renamed from: b.b.a.a.z.i */
/* loaded from: classes.dex */
public class C0697i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0696h f4155a;

    public C0697i(C0696h c0696h) {
        this.f4155a = c0696h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4155a.f4162c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
