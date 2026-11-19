package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0358u;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
class C0590d extends RecyclerView.AbstractC0569n implements RecyclerView.InterfaceC0573r {

    /* renamed from: D */
    private static final int[] f3813D = {R.attr.state_pressed};

    /* renamed from: E */
    private static final int[] f3814E = new int[0];

    /* renamed from: A */
    int f3815A;

    /* renamed from: B */
    private final Runnable f3816B;

    /* renamed from: C */
    private final RecyclerView.AbstractC0574s f3817C;

    /* renamed from: a */
    private final int f3818a;

    /* renamed from: b */
    private final int f3819b;

    /* renamed from: c */
    final StateListDrawable f3820c;

    /* renamed from: d */
    final Drawable f3821d;

    /* renamed from: e */
    private final int f3822e;

    /* renamed from: f */
    private final int f3823f;

    /* renamed from: g */
    private final StateListDrawable f3824g;

    /* renamed from: h */
    private final Drawable f3825h;

    /* renamed from: i */
    private final int f3826i;

    /* renamed from: j */
    private final int f3827j;

    /* renamed from: k */
    int f3828k;

    /* renamed from: l */
    int f3829l;

    /* renamed from: m */
    float f3830m;

    /* renamed from: n */
    int f3831n;

    /* renamed from: o */
    int f3832o;

    /* renamed from: p */
    float f3833p;

    /* renamed from: s */
    private RecyclerView f3836s;

    /* renamed from: z */
    final ValueAnimator f3843z;

    /* renamed from: q */
    private int f3834q = 0;

    /* renamed from: r */
    private int f3835r = 0;

    /* renamed from: t */
    private boolean f3837t = false;

    /* renamed from: u */
    private boolean f3838u = false;

    /* renamed from: v */
    private int f3839v = 0;

    /* renamed from: w */
    private int f3840w = 0;

    /* renamed from: x */
    private final int[] f3841x = new int[2];

    /* renamed from: y */
    private final int[] f3842y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0590d.this.m3352k(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    class b extends RecyclerView.AbstractC0574s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            C0590d.this.m3358v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3846a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3846a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3846a) {
                this.f3846a = false;
                return;
            }
            if (((Float) C0590d.this.f3843z.getAnimatedValue()).floatValue() == IGoodView.DEFAULT_TO_ALPHA) {
                C0590d c0590d = C0590d.this;
                c0590d.f3815A = 0;
                c0590d.m3356s(0);
            } else {
                C0590d c0590d2 = C0590d.this;
                c0590d2.f3815A = 2;
                c0590d2.m3355p();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0590d.this.f3820c.setAlpha(iFloatValue);
            C0590d.this.f3821d.setAlpha(iFloatValue);
            C0590d.this.m3355p();
        }
    }

    C0590d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        this.f3843z = valueAnimatorOfFloat;
        this.f3815A = 0;
        this.f3816B = new a();
        this.f3817C = new b();
        this.f3820c = stateListDrawable;
        this.f3821d = drawable;
        this.f3824g = stateListDrawable2;
        this.f3825h = drawable2;
        this.f3822e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f3823f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f3826i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f3827j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f3818a = i5;
        this.f3819b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m3351d(recyclerView);
    }

    /* renamed from: e */
    private void m3339e() {
        this.f3836s.removeCallbacks(this.f3816B);
    }

    /* renamed from: f */
    private void m3340f() {
        this.f3836s.removeItemDecoration(this);
        this.f3836s.removeOnItemTouchListener(this);
        this.f3836s.removeOnScrollListener(this.f3817C);
        m3339e();
    }

    /* renamed from: g */
    private void m3341g(Canvas canvas) {
        int i4 = this.f3835r;
        int i5 = this.f3826i;
        int i6 = this.f3832o;
        int i7 = this.f3831n;
        this.f3824g.setBounds(0, 0, i7, i5);
        this.f3825h.setBounds(0, 0, this.f3834q, this.f3827j);
        canvas.translate(IGoodView.DEFAULT_TO_ALPHA, i4 - i5);
        this.f3825h.draw(canvas);
        canvas.translate(i6 - (i7 / 2), IGoodView.DEFAULT_TO_ALPHA);
        this.f3824g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: h */
    private void m3342h(Canvas canvas) {
        int i4 = this.f3834q;
        int i5 = this.f3822e;
        int i6 = i4 - i5;
        int i7 = this.f3829l;
        int i8 = this.f3828k;
        int i9 = i7 - (i8 / 2);
        this.f3820c.setBounds(0, 0, i5, i8);
        this.f3821d.setBounds(0, 0, this.f3823f, this.f3835r);
        if (!m3346m()) {
            canvas.translate(i6, IGoodView.DEFAULT_TO_ALPHA);
            this.f3821d.draw(canvas);
            canvas.translate(IGoodView.DEFAULT_TO_ALPHA, i9);
            this.f3820c.draw(canvas);
            canvas.translate(-i6, -i9);
            return;
        }
        this.f3821d.draw(canvas);
        canvas.translate(this.f3822e, i9);
        canvas.scale(-1.0f, 1.0f);
        this.f3820c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f3822e, -i9);
    }

    /* renamed from: i */
    private int[] m3343i() {
        int[] iArr = this.f3842y;
        int i4 = this.f3819b;
        iArr[0] = i4;
        iArr[1] = this.f3834q - i4;
        return iArr;
    }

    /* renamed from: j */
    private int[] m3344j() {
        int[] iArr = this.f3841x;
        int i4 = this.f3819b;
        iArr[0] = i4;
        iArr[1] = this.f3835r - i4;
        return iArr;
    }

    /* renamed from: l */
    private void m3345l(float f4) {
        int[] iArrM3343i = m3343i();
        float fMax = Math.max(iArrM3343i[0], Math.min(iArrM3343i[1], f4));
        if (Math.abs(this.f3832o - fMax) < 2.0f) {
            return;
        }
        int iM3348r = m3348r(this.f3833p, fMax, iArrM3343i, this.f3836s.computeHorizontalScrollRange(), this.f3836s.computeHorizontalScrollOffset(), this.f3834q);
        if (iM3348r != 0) {
            this.f3836s.scrollBy(iM3348r, 0);
        }
        this.f3833p = fMax;
    }

    /* renamed from: m */
    private boolean m3346m() {
        return C0358u.m1978A(this.f3836s) == 1;
    }

    /* renamed from: q */
    private void m3347q(int i4) {
        m3339e();
        this.f3836s.postDelayed(this.f3816B, i4);
    }

    /* renamed from: r */
    private int m3348r(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    /* renamed from: t */
    private void m3349t() {
        this.f3836s.addItemDecoration(this);
        this.f3836s.addOnItemTouchListener(this);
        this.f3836s.addOnScrollListener(this.f3817C);
    }

    /* renamed from: w */
    private void m3350w(float f4) {
        int[] iArrM3344j = m3344j();
        float fMax = Math.max(iArrM3344j[0], Math.min(iArrM3344j[1], f4));
        if (Math.abs(this.f3829l - fMax) < 2.0f) {
            return;
        }
        int iM3348r = m3348r(this.f3830m, fMax, iArrM3344j, this.f3836s.computeVerticalScrollRange(), this.f3836s.computeVerticalScrollOffset(), this.f3835r);
        if (iM3348r != 0) {
            this.f3836s.scrollBy(0, iM3348r);
        }
        this.f3830m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0573r
    /* renamed from: a */
    public boolean mo3099a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i4 = this.f3839v;
        if (i4 == 1) {
            boolean zM3354o = m3354o(motionEvent.getX(), motionEvent.getY());
            boolean zM3353n = m3353n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zM3354o && !zM3353n) {
                return false;
            }
            if (zM3353n) {
                this.f3840w = 1;
                this.f3833p = (int) motionEvent.getX();
            } else if (zM3354o) {
                this.f3840w = 2;
                this.f3830m = (int) motionEvent.getY();
            }
            m3356s(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0573r
    /* renamed from: b */
    public void mo3100b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3839v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM3354o = m3354o(motionEvent.getX(), motionEvent.getY());
            boolean zM3353n = m3353n(motionEvent.getX(), motionEvent.getY());
            if (zM3354o || zM3353n) {
                if (zM3353n) {
                    this.f3840w = 1;
                    this.f3833p = (int) motionEvent.getX();
                } else if (zM3354o) {
                    this.f3840w = 2;
                    this.f3830m = (int) motionEvent.getY();
                }
                m3356s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3839v == 2) {
            this.f3830m = IGoodView.DEFAULT_TO_ALPHA;
            this.f3833p = IGoodView.DEFAULT_TO_ALPHA;
            m3356s(1);
            this.f3840w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3839v == 2) {
            m3357u();
            if (this.f3840w == 1) {
                m3345l(motionEvent.getX());
            }
            if (this.f3840w == 2) {
                m3350w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0573r
    /* renamed from: c */
    public void mo3101c(boolean z3) {
    }

    /* renamed from: d */
    public void m3351d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3836s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m3340f();
        }
        this.f3836s = recyclerView;
        if (recyclerView != null) {
            m3349t();
        }
    }

    /* renamed from: k */
    void m3352k(int i4) {
        int i5 = this.f3815A;
        if (i5 == 1) {
            this.f3843z.cancel();
        } else if (i5 != 2) {
            return;
        }
        this.f3815A = 3;
        ValueAnimator valueAnimator = this.f3843z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), IGoodView.DEFAULT_TO_ALPHA);
        this.f3843z.setDuration(i4);
        this.f3843z.start();
    }

    /* renamed from: n */
    boolean m3353n(float f4, float f5) {
        if (f5 >= this.f3835r - this.f3826i) {
            int i4 = this.f3832o;
            int i5 = this.f3831n;
            if (f4 >= i4 - (i5 / 2) && f4 <= i4 + (i5 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    boolean m3354o(float f4, float f5) {
        if (!m3346m() ? f4 >= this.f3834q - this.f3822e : f4 <= this.f3822e / 2) {
            int i4 = this.f3829l;
            int i5 = this.f3828k;
            if (f5 >= i4 - (i5 / 2) && f5 <= i4 + (i5 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0569n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0580y c0580y) {
        if (this.f3834q != this.f3836s.getWidth() || this.f3835r != this.f3836s.getHeight()) {
            this.f3834q = this.f3836s.getWidth();
            this.f3835r = this.f3836s.getHeight();
            m3356s(0);
        } else if (this.f3815A != 0) {
            if (this.f3837t) {
                m3342h(canvas);
            }
            if (this.f3838u) {
                m3341g(canvas);
            }
        }
    }

    /* renamed from: p */
    void m3355p() {
        this.f3836s.invalidate();
    }

    /* renamed from: s */
    void m3356s(int i4) {
        if (i4 == 2 && this.f3839v != 2) {
            this.f3820c.setState(f3813D);
            m3339e();
        }
        if (i4 == 0) {
            m3355p();
        } else {
            m3357u();
        }
        if (this.f3839v == 2 && i4 != 2) {
            this.f3820c.setState(f3814E);
            m3347q(1200);
        } else if (i4 == 1) {
            m3347q(1500);
        }
        this.f3839v = i4;
    }

    /* renamed from: u */
    public void m3357u() {
        int i4 = this.f3815A;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                this.f3843z.cancel();
            }
        }
        this.f3815A = 1;
        ValueAnimator valueAnimator = this.f3843z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3843z.setDuration(500L);
        this.f3843z.setStartDelay(0L);
        this.f3843z.start();
    }

    /* renamed from: v */
    void m3358v(int i4, int i5) {
        int iComputeVerticalScrollRange = this.f3836s.computeVerticalScrollRange();
        int i6 = this.f3835r;
        this.f3837t = iComputeVerticalScrollRange - i6 > 0 && i6 >= this.f3818a;
        int iComputeHorizontalScrollRange = this.f3836s.computeHorizontalScrollRange();
        int i7 = this.f3834q;
        boolean z3 = iComputeHorizontalScrollRange - i7 > 0 && i7 >= this.f3818a;
        this.f3838u = z3;
        boolean z4 = this.f3837t;
        if (!z4 && !z3) {
            if (this.f3839v != 0) {
                m3356s(0);
                return;
            }
            return;
        }
        if (z4) {
            float f4 = i6;
            this.f3829l = (int) ((f4 * (i5 + (f4 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3828k = Math.min(i6, (i6 * i6) / iComputeVerticalScrollRange);
        }
        if (this.f3838u) {
            float f5 = i7;
            this.f3832o = (int) ((f5 * (i4 + (f5 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3831n = Math.min(i7, (i7 * i7) / iComputeHorizontalScrollRange);
        }
        int i8 = this.f3839v;
        if (i8 == 0 || i8 == 1) {
            m3356s(1);
        }
    }
}
