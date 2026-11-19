package p070b.p113c.p114a.p116e.p123c;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: b.c.a.e.c.g */
/* loaded from: classes.dex */
public class C0804g implements InterfaceC0798a {

    /* renamed from: a */
    public View f4509a;

    /* renamed from: b */
    public int f4510b = 1;

    /* renamed from: c */
    public int f4511c = 233;

    /* renamed from: d */
    public float f4512d;

    /* renamed from: e */
    public float f4513e;

    public C0804g(View view) {
        this.f4512d = 0.0f;
        this.f4509a = view;
        this.f4512d = view.getY();
        this.f4513e = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0506f) this.f4509a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0506f) this.f4509a.getLayoutParams())).bottomMargin;
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: a */
    public void mo2505a(float f2) {
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: b */
    public void mo2506b() {
        int i = this.f4511c;
        if (i == 233) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4509a.getY(), 0.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new C0801d(this));
            valueAnimatorOfFloat.start();
            this.f4510b = 1;
            return;
        }
        if (i == 2333) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f4509a.getY(), this.f4512d);
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.addUpdateListener(new C0802e(this));
            valueAnimatorOfFloat2.start();
            this.f4510b = 1;
        }
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: c */
    public void mo2507c() {
        int i = this.f4511c;
        if (i == 233) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4509a.getY(), -this.f4509a.getHeight());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new C0800c(this));
            valueAnimatorOfFloat.start();
            this.f4510b = 0;
            return;
        }
        if (i == 2333) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f4509a.getY(), this.f4512d + this.f4509a.getHeight() + this.f4513e);
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.addUpdateListener(new C0803f(this));
            valueAnimatorOfFloat2.start();
            this.f4510b = 0;
        }
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: d */
    public void mo2508d(int i) {
        this.f4511c = i;
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    public int getState() {
        return this.f4510b;
    }
}
