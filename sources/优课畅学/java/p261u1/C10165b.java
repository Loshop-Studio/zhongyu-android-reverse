package p261u1;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: u1.b */
/* loaded from: classes4.dex */
public class C10165b implements InterfaceC10164a {

    /* renamed from: a */
    public View f20288a;

    /* renamed from: b */
    public int f20289b = 1;

    /* renamed from: u1.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C10165b.this.f20288a.setScaleX(fFloatValue);
            C10165b.this.f20288a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: u1.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C10165b.this.f20288a.setScaleX(fFloatValue);
            C10165b.this.f20288a.setScaleY(fFloatValue);
        }
    }

    public C10165b(View view) {
        this.f20288a = view;
    }

    /* renamed from: c */
    public static C10165b m19031c(View view) {
        return new C10165b(view);
    }

    @Override // p261u1.InterfaceC10164a
    public int getState() {
        return this.f20289b;
    }

    @Override // p261u1.InterfaceC10164a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20288a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f20289b = 0;
    }

    @Override // p261u1.InterfaceC10164a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20288a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f20289b = 1;
    }

    @Override // p261u1.InterfaceC10164a
    /* renamed from: a */
    public void mo19029a(float f10) {
    }

    @Override // p261u1.InterfaceC10164a
    /* renamed from: b */
    public void mo19030b(int i10) {
    }
}
