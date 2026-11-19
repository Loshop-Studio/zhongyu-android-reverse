package androidx.core.view.insets;

import android.animation.ValueAnimator;

/* renamed from: androidx.core.view.insets.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2523a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f1057a;

    /* renamed from: b */
    public final /* synthetic */ Protection f1058b;

    public /* synthetic */ C2523a(Protection protection, int i) {
        this.f1057a = i;
        this.f1058b = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1057a) {
            case 0:
                this.f1058b.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                this.f1058b.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
