package p111q0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: q0.c */
/* loaded from: classes2.dex */
public class C4477c implements InterfaceC4475a {

    /* renamed from: g */
    public static int f5240g = 233;

    /* renamed from: h */
    public static int f5241h = 2333;

    /* renamed from: a */
    public View f5242a;

    /* renamed from: b */
    public float f5243b;

    /* renamed from: c */
    public int f5244c = 1;

    /* renamed from: d */
    public int f5245d = f5240g;

    /* renamed from: e */
    public float f5246e;

    /* renamed from: f */
    public float f5247f;

    /* renamed from: q0.c$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4477c.this.f5242a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: q0.c$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4477c.this.f5242a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: q0.c$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4477c.this.f5242a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: q0.c$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4477c.this.f5242a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C4477c(View view) {
        this.f5246e = 0.0f;
        this.f5242a = view;
        this.f5246e = view.getY();
        this.f5247f = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f5242a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f5242a.getLayoutParams())).bottomMargin;
    }

    /* renamed from: c */
    public static C4477c m5756c(View view) {
        return new C4477c(view);
    }

    @Override // p111q0.InterfaceC4475a
    /* renamed from: a */
    public void mo5753a(float f4) {
        this.f5243b = f4;
    }

    @Override // p111q0.InterfaceC4475a
    /* renamed from: b */
    public void mo5754b(int i4) {
        this.f5245d = i4;
    }

    /* renamed from: d */
    public final void m5757d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5242a.getY(), this.f5246e + this.f5242a.getHeight() + this.f5247f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.start();
        this.f5244c = 0;
    }

    /* renamed from: e */
    public final void m5758e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5242a.getY(), -this.f5242a.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        this.f5244c = 0;
    }

    /* renamed from: f */
    public final void m5759f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5242a.getY(), this.f5246e);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
        this.f5244c = 1;
    }

    /* renamed from: g */
    public final void m5760g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5242a.getY(), 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
        this.f5244c = 1;
    }

    @Override // p111q0.InterfaceC4475a
    public int getState() {
        return this.f5244c;
    }

    @Override // p111q0.InterfaceC4475a
    public void hide() {
        int i4 = this.f5245d;
        if (i4 == f5240g) {
            m5758e();
        } else if (i4 == f5241h) {
            m5757d();
        }
    }

    @Override // p111q0.InterfaceC4475a
    public void show() {
        int i4 = this.f5245d;
        if (i4 == f5240g) {
            m5760g();
        } else if (i4 == f5241h) {
            m5759f();
        }
    }
}
