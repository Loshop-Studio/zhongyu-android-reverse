package p136p3;

import android.animation.ValueAnimator;

/* renamed from: p3.p */
/* loaded from: classes3.dex */
public final class C6378p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f10426a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC6379q f10427b;

    public /* synthetic */ C6378p(RunnableC6379q runnableC6379q, int i) {
        this.f10426a = i;
        this.f10427b = runnableC6379q;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10426a) {
            case 0:
                RunnableC6379q runnableC6379q = this.f10427b;
                runnableC6379q.f10431d.f10434c = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                runnableC6379q.f10431d.invalidate();
                break;
            case 1:
                RunnableC6379q runnableC6379q2 = this.f10427b;
                runnableC6379q2.f10431d.f10432a = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                runnableC6379q2.f10431d.invalidate();
                break;
            case 2:
                RunnableC6379q runnableC6379q3 = this.f10427b;
                runnableC6379q3.f10431d.f10432a = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                runnableC6379q3.f10431d.invalidate();
                break;
            default:
                RunnableC6379q runnableC6379q4 = this.f10427b;
                runnableC6379q4.f10431d.f10434c = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                runnableC6379q4.f10431d.invalidate();
                break;
        }
    }
}
