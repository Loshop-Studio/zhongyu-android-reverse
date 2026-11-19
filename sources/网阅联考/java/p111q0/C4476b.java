package p111q0;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: q0.b */
/* loaded from: classes2.dex */
public class C4476b implements InterfaceC4475a {

    /* renamed from: a */
    public View f5236a;

    /* renamed from: b */
    public int f5237b = 1;

    /* renamed from: q0.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4476b.this.f5236a.setScaleX(fFloatValue);
            C4476b.this.f5236a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: q0.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4476b.this.f5236a.setScaleX(fFloatValue);
            C4476b.this.f5236a.setScaleY(fFloatValue);
        }
    }

    public C4476b(View view) {
        this.f5236a = view;
    }

    /* renamed from: c */
    public static C4476b m5755c(View view) {
        return new C4476b(view);
    }

    @Override // p111q0.InterfaceC4475a
    /* renamed from: a */
    public void mo5753a(float f4) {
    }

    @Override // p111q0.InterfaceC4475a
    /* renamed from: b */
    public void mo5754b(int i4) {
    }

    @Override // p111q0.InterfaceC4475a
    public int getState() {
        return this.f5237b;
    }

    @Override // p111q0.InterfaceC4475a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5236a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f5237b = 0;
    }

    @Override // p111q0.InterfaceC4475a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5236a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f5237b = 1;
    }
}
