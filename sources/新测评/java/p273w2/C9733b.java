package p273w2;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: w2.b */
/* loaded from: classes4.dex */
public class C9733b implements InterfaceC9732a {

    /* renamed from: a */
    public View f17100a;

    /* renamed from: b */
    public int f17101b = 1;

    /* renamed from: w2.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C9733b.this.f17100a.setScaleX(fFloatValue);
            C9733b.this.f17100a.setScaleY(fFloatValue);
        }
    }

    /* renamed from: w2.b$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C9733b.this.f17100a.setScaleX(fFloatValue);
            C9733b.this.f17100a.setScaleY(fFloatValue);
        }
    }

    public C9733b(View view) {
        this.f17100a = view;
    }

    /* renamed from: c */
    public static C9733b m16304c(View view) {
        return new C9733b(view);
    }

    @Override // p273w2.InterfaceC9732a
    public int getState() {
        return this.f17101b;
    }

    @Override // p273w2.InterfaceC9732a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17100a.getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f17101b = 0;
    }

    @Override // p273w2.InterfaceC9732a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17100a.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f17101b = 1;
    }

    @Override // p273w2.InterfaceC9732a
    /* renamed from: a */
    public void mo16302a(float f10) {
    }

    @Override // p273w2.InterfaceC9732a
    /* renamed from: b */
    public void mo16303b(int i10) {
    }
}
