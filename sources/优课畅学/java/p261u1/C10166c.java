package p261u1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: u1.c */
/* loaded from: classes4.dex */
public class C10166c implements InterfaceC10164a {

    /* renamed from: g */
    public static int f20292g = 233;

    /* renamed from: h */
    public static int f20293h = 2333;

    /* renamed from: a */
    public View f20294a;

    /* renamed from: b */
    public float f20295b;

    /* renamed from: c */
    public int f20296c = 1;

    /* renamed from: d */
    public int f20297d = f20292g;

    /* renamed from: e */
    public float f20298e;

    /* renamed from: f */
    public float f20299f;

    /* renamed from: u1.c$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10166c.this.f20294a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: u1.c$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10166c.this.f20294a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: u1.c$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10166c.this.f20294a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: u1.c$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10166c.this.f20294a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C10166c(View view) {
        this.f20298e = 0.0f;
        this.f20294a = view;
        this.f20298e = view.getY();
        this.f20299f = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f20294a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f20294a.getLayoutParams())).bottomMargin;
    }

    /* renamed from: c */
    public static C10166c m19032c(View view) {
        return new C10166c(view);
    }

    @Override // p261u1.InterfaceC10164a
    /* renamed from: a */
    public void mo19029a(float f10) {
        this.f20295b = f10;
    }

    @Override // p261u1.InterfaceC10164a
    /* renamed from: b */
    public void mo19030b(int i10) {
        this.f20297d = i10;
    }

    /* renamed from: d */
    public final void m19033d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20294a.getY(), this.f20298e + this.f20294a.getHeight() + this.f20299f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.start();
        this.f20296c = 0;
    }

    /* renamed from: e */
    public final void m19034e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20294a.getY(), -this.f20294a.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        this.f20296c = 0;
    }

    /* renamed from: f */
    public final void m19035f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20294a.getY(), this.f20298e);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
        this.f20296c = 1;
    }

    /* renamed from: g */
    public final void m19036g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20294a.getY(), 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
        this.f20296c = 1;
    }

    @Override // p261u1.InterfaceC10164a
    public int getState() {
        return this.f20296c;
    }

    @Override // p261u1.InterfaceC10164a
    public void hide() {
        int i10 = this.f20297d;
        if (i10 == f20292g) {
            m19034e();
        } else if (i10 == f20293h) {
            m19033d();
        }
    }

    @Override // p261u1.InterfaceC10164a
    public void show() {
        int i10 = this.f20297d;
        if (i10 == f20292g) {
            m19036g();
        } else if (i10 == f20293h) {
            m19035f();
        }
    }
}
