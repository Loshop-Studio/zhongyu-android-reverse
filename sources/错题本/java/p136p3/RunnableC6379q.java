package p136p3;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* renamed from: p3.q */
/* loaded from: classes3.dex */
public final class RunnableC6379q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10428a;

    /* renamed from: b */
    public final /* synthetic */ float f10429b;

    /* renamed from: c */
    public final /* synthetic */ float f10430c;

    /* renamed from: d */
    public final /* synthetic */ C6380r f10431d;

    public RunnableC6379q(C6380r c6380r, int i, float f, float f7) {
        this.f10431d = c6380r;
        this.f10428a = i;
        this.f10429b = f;
        this.f10430c = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator duration;
        ValueAnimator duration2;
        float f = this.f10430c;
        float f7 = this.f10429b;
        C6380r c6380r = this.f10431d;
        int i = this.f10428a;
        if (i > 0) {
            duration = ValueAnimator.ofFloat(c6380r.f10434c, f7).setDuration(100L);
            duration.addUpdateListener(new C6378p(this, 0));
            duration2 = ValueAnimator.ofFloat(c6380r.f10432a, f).setDuration(100L);
            duration2.addUpdateListener(new C6378p(this, 1));
        } else if (i < 0) {
            ValueAnimator duration3 = ValueAnimator.ofFloat(c6380r.f10432a, f).setDuration(100L);
            duration3.addUpdateListener(new C6378p(this, 2));
            duration2 = ValueAnimator.ofFloat(c6380r.f10434c, f7).setDuration(100L);
            duration2.addUpdateListener(new C6378p(this, 3));
            duration = duration3;
        } else {
            duration = null;
            duration2 = null;
        }
        if (duration != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            c6380r.f10438g = animatorSet;
            animatorSet.play(duration2).after(duration);
            c6380r.f10438g.start();
        }
    }
}
