package p070b.p074b.p075a.p076a.p104z;

import android.animation.ValueAnimator;

/* renamed from: b.b.a.a.z.e */
/* loaded from: classes.dex */
public class C0693e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0689a f4130a;

    public C0693e(C0689a c0689a) {
        this.f4130a = c0689a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f4130a.f4162c.setScaleX(fFloatValue);
        this.f4130a.f4162c.setScaleY(fFloatValue);
    }
}
