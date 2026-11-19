package p177m3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: m3.c */
/* loaded from: classes4.dex */
public class C8963c implements InterfaceC8961a {

    /* renamed from: g */
    public static int f15022g = 233;

    /* renamed from: h */
    public static int f15023h = 2333;

    /* renamed from: a */
    public View f15024a;

    /* renamed from: b */
    public float f15025b;

    /* renamed from: c */
    public int f15026c = 1;

    /* renamed from: d */
    public int f15027d = f15022g;

    /* renamed from: e */
    public float f15028e;

    /* renamed from: f */
    public float f15029f;

    /* renamed from: m3.c$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8963c.this.f15024a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: m3.c$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8963c.this.f15024a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: m3.c$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8963c.this.f15024a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: m3.c$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8963c.this.f15024a.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C8963c(View view) {
        this.f15028e = 0.0f;
        this.f15024a = view;
        this.f15028e = view.getY();
        this.f15029f = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f15024a.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) this.f15024a.getLayoutParams())).bottomMargin;
    }

    /* renamed from: c */
    public static C8963c m14299c(View view) {
        return new C8963c(view);
    }

    @Override // p177m3.InterfaceC8961a
    /* renamed from: a */
    public void mo14296a(float f10) {
        this.f15025b = f10;
    }

    @Override // p177m3.InterfaceC8961a
    /* renamed from: b */
    public void mo14297b(int i9) {
        this.f15027d = i9;
    }

    /* renamed from: d */
    public final void m14300d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15024a.getY(), this.f15028e + this.f15024a.getHeight() + this.f15029f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.start();
        this.f15026c = 0;
    }

    /* renamed from: e */
    public final void m14301e() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15024a.getY(), -this.f15024a.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        this.f15026c = 0;
    }

    /* renamed from: f */
    public final void m14302f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15024a.getY(), this.f15028e);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
        this.f15026c = 1;
    }

    /* renamed from: g */
    public final void m14303g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15024a.getY(), 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
        this.f15026c = 1;
    }

    @Override // p177m3.InterfaceC8961a
    public int getState() {
        return this.f15026c;
    }

    @Override // p177m3.InterfaceC8961a
    public void hide() {
        int i9 = this.f15027d;
        if (i9 == f15022g) {
            m14301e();
        } else if (i9 == f15023h) {
            m14300d();
        }
    }

    @Override // p177m3.InterfaceC8961a
    public void show() {
        int i9 = this.f15027d;
        if (i9 == f15022g) {
            m14303g();
        } else if (i9 == f15023h) {
            m14302f();
        }
    }
}
