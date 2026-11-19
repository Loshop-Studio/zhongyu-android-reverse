package p182x1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x1.c */
/* loaded from: classes3.dex */
public class C7830c implements InterfaceC7828a {

    /* renamed from: g */
    public static int f10414g = 233;

    /* renamed from: h */
    public static int f10415h = 2333;

    /* renamed from: a */
    public View f10416a;

    /* renamed from: b */
    public float f10417b;

    /* renamed from: c */
    public int f10418c = 1;

    /* renamed from: d */
    public int f10419d = f10414g;

    /* renamed from: e */
    public float f10420e;

    /* renamed from: f */
    public float f10421f;

    /* renamed from: x1.c$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7830c.this.f10416a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: x1.c$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7830c.this.f10416a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: x1.c$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7830c.this.f10416a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: x1.c$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7830c.this.f10416a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C7830c(View view) {
        this.f10420e = 0.0f;
        this.f10416a = view;
        this.f10420e = view.getY();
        this.f10421f = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f10416a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f10416a.getLayoutParams())).bottomMargin;
    }

    /* renamed from: c */
    public static C7830c m9457c(View view) {
        return new C7830c(view);
    }

    @Override // p182x1.InterfaceC7828a
    /* renamed from: a */
    public void mo9454a(float f6) {
        this.f10417b = f6;
    }

    @Override // p182x1.InterfaceC7828a
    /* renamed from: b */
    public void mo9455b(int i6) {
        this.f10419d = i6;
    }

    /* renamed from: d */
    public final void m9458d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10416a.getY(), this.f10420e + this.f10416a.getHeight() + this.f10421f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.start();
        this.f10418c = 0;
    }

    /* renamed from: e */
    public final void m9459e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10416a.getY(), -this.f10416a.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        this.f10418c = 0;
    }

    /* renamed from: f */
    public final void m9460f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10416a.getY(), this.f10420e);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
        this.f10418c = 1;
    }

    /* renamed from: g */
    public final void m9461g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10416a.getY(), 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
        this.f10418c = 1;
    }

    @Override // p182x1.InterfaceC7828a
    public int getState() {
        return this.f10418c;
    }

    @Override // p182x1.InterfaceC7828a
    public void hide() {
        int i6 = this.f10419d;
        if (i6 == f10414g) {
            m9459e();
        } else if (i6 == f10415h) {
            m9458d();
        }
    }

    @Override // p182x1.InterfaceC7828a
    public void show() {
        int i6 = this.f10419d;
        if (i6 == f10414g) {
            m9461g();
        } else if (i6 == f10415h) {
            m9460f();
        }
    }
}
