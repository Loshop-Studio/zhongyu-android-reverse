package p164g8;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: g8.c */
/* loaded from: classes5.dex */
public class C9279c implements InterfaceC9277a {

    /* renamed from: g */
    public static int f21623g = 233;

    /* renamed from: h */
    public static int f21624h = 2333;

    /* renamed from: a */
    public View f21625a;

    /* renamed from: b */
    public float f21626b;

    /* renamed from: c */
    public int f21627c = 1;

    /* renamed from: d */
    public int f21628d = f21623g;

    /* renamed from: e */
    public float f21629e;

    /* renamed from: f */
    public float f21630f;

    /* renamed from: g8.c$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9279c.this.f21625a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: g8.c$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9279c.this.f21625a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: g8.c$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9279c.this.f21625a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: g8.c$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9279c.this.f21625a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C9279c(View view) {
        this.f21629e = 0.0f;
        this.f21625a = view;
        this.f21629e = view.getY();
        this.f21630f = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f21625a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f21625a.getLayoutParams())).bottomMargin;
    }

    /* renamed from: c */
    public static C9279c m18274c(View view) {
        return new C9279c(view);
    }

    @Override // p164g8.InterfaceC9277a
    /* renamed from: a */
    public void mo18271a(float f10) {
        this.f21626b = f10;
    }

    @Override // p164g8.InterfaceC9277a
    /* renamed from: b */
    public void mo18272b(int i10) {
        this.f21628d = i10;
    }

    /* renamed from: d */
    public final void m18275d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21625a.getY(), this.f21629e + this.f21625a.getHeight() + this.f21630f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.start();
        this.f21627c = 0;
    }

    /* renamed from: e */
    public final void m18276e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21625a.getY(), -this.f21625a.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        this.f21627c = 0;
    }

    /* renamed from: f */
    public final void m18277f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21625a.getY(), this.f21629e);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
        this.f21627c = 1;
    }

    /* renamed from: g */
    public final void m18278g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21625a.getY(), 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
        this.f21627c = 1;
    }

    @Override // p164g8.InterfaceC9277a
    public int getState() {
        return this.f21627c;
    }

    @Override // p164g8.InterfaceC9277a
    public void hide() {
        int i10 = this.f21628d;
        if (i10 == f21623g) {
            m18276e();
        } else if (i10 == f21624h) {
            m18275d();
        }
    }

    @Override // p164g8.InterfaceC9277a
    public void show() {
        int i10 = this.f21628d;
        if (i10 == f21623g) {
            m18278g();
        } else if (i10 == f21624h) {
            m18277f();
        }
    }
}
