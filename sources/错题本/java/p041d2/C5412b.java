package p041d2;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: d2.b */
/* loaded from: classes3.dex */
public final class C5412b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f8371a;

    /* renamed from: b */
    public final /* synthetic */ C5413c f8372b;

    public /* synthetic */ C5412b(C5413c c5413c, int i) {
        this.f8371a = i;
        this.f8372b = c5413c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8371a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5413c c5413c = this.f8372b;
                ((View) c5413c.f8375c).setScaleX(fFloatValue);
                ((View) c5413c.f8375c).setScaleY(fFloatValue);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5413c c5413c2 = this.f8372b;
                ((View) c5413c2.f8375c).setScaleX(fFloatValue2);
                ((View) c5413c2.f8375c).setScaleY(fFloatValue2);
                break;
        }
    }
}
