package p273w2;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: w2.c */
/* loaded from: classes4.dex */
public class C9734c implements InterfaceC9732a {

    /* renamed from: g */
    public static int f17104g = 233;

    /* renamed from: h */
    public static int f17105h = 2333;

    /* renamed from: a */
    public View f17106a;

    /* renamed from: b */
    public float f17107b;

    /* renamed from: c */
    public int f17108c = 1;

    /* renamed from: d */
    public int f17109d = f17104g;

    /* renamed from: e */
    public float f17110e;

    /* renamed from: f */
    public float f17111f;

    /* renamed from: w2.c$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9734c.this.f17106a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: w2.c$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9734c.this.f17106a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: w2.c$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9734c.this.f17106a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: w2.c$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9734c.this.f17106a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C9734c(View view) {
        this.f17110e = 0.0f;
        this.f17106a = view;
        this.f17110e = view.getY();
        this.f17111f = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f17106a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f17106a.getLayoutParams())).bottomMargin;
    }

    /* renamed from: c */
    public static C9734c m16305c(View view) {
        return new C9734c(view);
    }

    @Override // p273w2.InterfaceC9732a
    /* renamed from: a */
    public void mo16302a(float f10) {
        this.f17107b = f10;
    }

    @Override // p273w2.InterfaceC9732a
    /* renamed from: b */
    public void mo16303b(int i10) {
        this.f17109d = i10;
    }

    /* renamed from: d */
    public final void m16306d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17106a.getY(), this.f17110e + this.f17106a.getHeight() + this.f17111f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.start();
        this.f17108c = 0;
    }

    /* renamed from: e */
    public final void m16307e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17106a.getY(), -this.f17106a.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        this.f17108c = 0;
    }

    /* renamed from: f */
    public final void m16308f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17106a.getY(), this.f17110e);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
        this.f17108c = 1;
    }

    /* renamed from: g */
    public final void m16309g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17106a.getY(), 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
        this.f17108c = 1;
    }

    @Override // p273w2.InterfaceC9732a
    public int getState() {
        return this.f17108c;
    }

    @Override // p273w2.InterfaceC9732a
    public void hide() {
        int i10 = this.f17109d;
        if (i10 == f17104g) {
            m16307e();
        } else if (i10 == f17105h) {
            m16306d();
        }
    }

    @Override // p273w2.InterfaceC9732a
    public void show() {
        int i10 = this.f17109d;
        if (i10 == f17104g) {
            m16309g();
        } else if (i10 == f17105h) {
            m16308f();
        }
    }
}
