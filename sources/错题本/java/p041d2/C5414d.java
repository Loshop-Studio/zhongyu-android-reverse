package p041d2;

import android.animation.ValueAnimator;

/* renamed from: d2.d */
/* loaded from: classes3.dex */
public final class C5414d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f8376a;

    /* renamed from: b */
    public final /* synthetic */ C5415e f8377b;

    public /* synthetic */ C5414d(C5415e c5415e, int i) {
        this.f8376a = i;
        this.f8377b = c5415e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8376a) {
            case 0:
                this.f8377b.f8378a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f8377b.f8378a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.f8377b.f8378a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.f8377b.f8378a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
