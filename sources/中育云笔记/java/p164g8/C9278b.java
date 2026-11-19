package p164g8;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: g8.b */
/* loaded from: classes5.dex */
public class C9278b implements InterfaceC9277a {

    /* renamed from: a */
    public View f21619a;

    /* renamed from: b */
    public int f21620b = 1;

    /* renamed from: g8.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C9278b.this.f21619a.setScaleX(fFloatValue);
            C9278b.this.f21619a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: g8.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C9278b.this.f21619a.setScaleX(fFloatValue);
            C9278b.this.f21619a.setScaleY(fFloatValue);
        }
    }

    public C9278b(View view) {
        this.f21619a = view;
    }

    /* renamed from: c */
    public static C9278b m18273c(View view) {
        return new C9278b(view);
    }

    @Override // p164g8.InterfaceC9277a
    public int getState() {
        return this.f21620b;
    }

    @Override // p164g8.InterfaceC9277a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21619a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f21620b = 0;
    }

    @Override // p164g8.InterfaceC9277a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21619a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f21620b = 1;
    }

    @Override // p164g8.InterfaceC9277a
    /* renamed from: a */
    public void mo18271a(float f10) {
    }

    @Override // p164g8.InterfaceC9277a
    /* renamed from: b */
    public void mo18272b(int i10) {
    }
}
