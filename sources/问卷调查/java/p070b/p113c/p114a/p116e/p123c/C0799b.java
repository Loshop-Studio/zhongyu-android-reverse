package p070b.p113c.p114a.p116e.p123c;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: b.c.a.e.c.b */
/* loaded from: classes.dex */
public class C0799b implements InterfaceC0798a {

    /* renamed from: a */
    public View f4501a;

    /* renamed from: b */
    public int f4502b = 1;

    /* renamed from: b.c.a.e.c.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0799b.this.f4501a.setScaleX(fFloatValue);
            C0799b.this.f4501a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: b.c.a.e.c.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0799b.this.f4501a.setScaleX(fFloatValue);
            C0799b.this.f4501a.setScaleY(fFloatValue);
        }
    }

    public C0799b(View view) {
        this.f4501a = view;
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: a */
    public void mo2505a(float f2) {
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: b */
    public void mo2506b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4501a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f4502b = 1;
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: c */
    public void mo2507c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4501a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f4502b = 0;
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    /* renamed from: d */
    public void mo2508d(int i) {
    }

    @Override // p070b.p113c.p114a.p116e.p123c.InterfaceC0798a
    public int getState() {
        return this.f4502b;
    }
}
