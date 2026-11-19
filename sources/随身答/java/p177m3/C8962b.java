package p177m3;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: m3.b */
/* loaded from: classes4.dex */
public class C8962b implements InterfaceC8961a {

    /* renamed from: a */
    public View f15018a;

    /* renamed from: b */
    public int f15019b = 1;

    /* renamed from: m3.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8962b.this.f15018a.setScaleX(fFloatValue);
            C8962b.this.f15018a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: m3.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8962b.this.f15018a.setScaleX(fFloatValue);
            C8962b.this.f15018a.setScaleY(fFloatValue);
        }
    }

    public C8962b(View view) {
        this.f15018a = view;
    }

    /* renamed from: c */
    public static C8962b m14298c(View view) {
        return new C8962b(view);
    }

    @Override // p177m3.InterfaceC8961a
    public int getState() {
        return this.f15019b;
    }

    @Override // p177m3.InterfaceC8961a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15018a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f15019b = 0;
    }

    @Override // p177m3.InterfaceC8961a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15018a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f15019b = 1;
    }

    @Override // p177m3.InterfaceC8961a
    /* renamed from: a */
    public void mo14296a(float f10) {
    }

    @Override // p177m3.InterfaceC8961a
    /* renamed from: b */
    public void mo14297b(int i9) {
    }
}
