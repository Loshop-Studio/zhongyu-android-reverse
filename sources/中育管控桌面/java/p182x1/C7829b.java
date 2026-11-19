package p182x1;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: x1.b */
/* loaded from: classes3.dex */
public class C7829b implements InterfaceC7828a {

    /* renamed from: a */
    public View f10410a;

    /* renamed from: b */
    public int f10411b = 1;

    /* renamed from: x1.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7829b.this.f10410a.setScaleX(fFloatValue);
            C7829b.this.f10410a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: x1.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7829b.this.f10410a.setScaleX(fFloatValue);
            C7829b.this.f10410a.setScaleY(fFloatValue);
        }
    }

    public C7829b(View view) {
        this.f10410a = view;
    }

    /* renamed from: c */
    public static C7829b m9456c(View view) {
        return new C7829b(view);
    }

    @Override // p182x1.InterfaceC7828a
    public int getState() {
        return this.f10411b;
    }

    @Override // p182x1.InterfaceC7828a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10410a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f10411b = 0;
    }

    @Override // p182x1.InterfaceC7828a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10410a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f10411b = 1;
    }

    @Override // p182x1.InterfaceC7828a
    /* renamed from: a */
    public void mo9454a(float f6) {
    }

    @Override // p182x1.InterfaceC7828a
    /* renamed from: b */
    public void mo9455b(int i6) {
    }
}
