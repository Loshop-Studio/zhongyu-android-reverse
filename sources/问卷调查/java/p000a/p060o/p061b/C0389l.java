package p000a.p060o.p061b;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.o.b.l */
/* loaded from: classes.dex */
public class C0389l extends RecyclerView.AbstractC0537k implements RecyclerView.InterfaceC0541o {

    /* renamed from: D */
    public static final int[] f2267D = {R.attr.state_pressed};

    /* renamed from: E */
    public static final int[] f2268E = new int[0];

    /* renamed from: A */
    public int f2269A;

    /* renamed from: B */
    public final Runnable f2270B;

    /* renamed from: C */
    public final RecyclerView.AbstractC0542p f2271C;

    /* renamed from: a */
    public final int f2272a;

    /* renamed from: b */
    public final int f2273b;

    /* renamed from: c */
    public final StateListDrawable f2274c;

    /* renamed from: d */
    public final Drawable f2275d;

    /* renamed from: e */
    public final int f2276e;

    /* renamed from: f */
    public final int f2277f;

    /* renamed from: g */
    public final StateListDrawable f2278g;

    /* renamed from: h */
    public final Drawable f2279h;

    /* renamed from: i */
    public final int f2280i;

    /* renamed from: j */
    public final int f2281j;

    /* renamed from: k */
    public int f2282k;

    /* renamed from: l */
    public int f2283l;

    /* renamed from: m */
    public float f2284m;

    /* renamed from: n */
    public int f2285n;

    /* renamed from: o */
    public int f2286o;

    /* renamed from: p */
    public float f2287p;

    /* renamed from: s */
    public RecyclerView f2290s;

    /* renamed from: z */
    public final ValueAnimator f2297z;

    /* renamed from: q */
    public int f2288q = 0;

    /* renamed from: r */
    public int f2289r = 0;

    /* renamed from: t */
    public boolean f2291t = false;

    /* renamed from: u */
    public boolean f2292u = false;

    /* renamed from: v */
    public int f2293v = 0;

    /* renamed from: w */
    public int f2294w = 0;

    /* renamed from: x */
    public final int[] f2295x = new int[2];

    /* renamed from: y */
    public final int[] f2296y = new int[2];

    /* renamed from: a.o.b.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0389l c0389l = C0389l.this;
            int i = c0389l.f2269A;
            if (i == 1) {
                c0389l.f2297z.cancel();
            } else if (i != 2) {
                return;
            }
            c0389l.f2269A = 3;
            ValueAnimator valueAnimator = c0389l.f2297z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            c0389l.f2297z.setDuration(500);
            c0389l.f2297z.start();
        }
    }

    /* renamed from: a.o.b.l$b */
    public class b extends RecyclerView.AbstractC0542p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0542p
        /* renamed from: b */
        public void mo1373b(RecyclerView recyclerView, int i, int i2) {
            C0389l c0389l = C0389l.this;
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = c0389l.f2290s.computeVerticalScrollRange();
            int i3 = c0389l.f2289r;
            c0389l.f2291t = iComputeVerticalScrollRange - i3 > 0 && i3 >= c0389l.f2272a;
            int iComputeHorizontalScrollRange = c0389l.f2290s.computeHorizontalScrollRange();
            int i4 = c0389l.f2288q;
            boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= c0389l.f2272a;
            c0389l.f2292u = z;
            boolean z2 = c0389l.f2291t;
            if (!z2 && !z) {
                if (c0389l.f2293v != 0) {
                    c0389l.m1371j(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f2 = i3;
                c0389l.f2283l = (int) ((((f2 / 2.0f) + iComputeVerticalScrollOffset) * f2) / iComputeVerticalScrollRange);
                c0389l.f2282k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (c0389l.f2292u) {
                float f3 = iComputeHorizontalScrollOffset;
                float f4 = i4;
                c0389l.f2286o = (int) ((((f4 / 2.0f) + f3) * f4) / iComputeHorizontalScrollRange);
                c0389l.f2285n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
            }
            int i5 = c0389l.f2293v;
            if (i5 == 0 || i5 == 1) {
                c0389l.m1371j(1);
            }
        }
    }

    /* renamed from: a.o.b.l$c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2300a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2300a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2300a) {
                this.f2300a = false;
                return;
            }
            if (((Float) C0389l.this.f2297z.getAnimatedValue()).floatValue() == 0.0f) {
                C0389l c0389l = C0389l.this;
                c0389l.f2269A = 0;
                c0389l.m1371j(0);
            } else {
                C0389l c0389l2 = C0389l.this;
                c0389l2.f2269A = 2;
                c0389l2.f2290s.invalidate();
            }
        }
    }

    /* renamed from: a.o.b.l$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0389l.this.f2274c.setAlpha(iFloatValue);
            C0389l.this.f2275d.setAlpha(iFloatValue);
            C0389l.this.f2290s.invalidate();
        }
    }

    public C0389l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2297z = valueAnimatorOfFloat;
        this.f2269A = 0;
        this.f2270B = new a();
        b bVar = new b();
        this.f2271C = bVar;
        this.f2274c = stateListDrawable;
        this.f2275d = drawable;
        this.f2278g = stateListDrawable2;
        this.f2279h = drawable2;
        this.f2276e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2277f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2280i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2281j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2272a = i2;
        this.f2273b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2290s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.AbstractC0538l abstractC0538l = recyclerView2.f3311m;
            if (abstractC0538l != null) {
                abstractC0538l.mo1782d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.f3315o.remove(this);
            if (recyclerView2.f3315o.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1841Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2290s;
            recyclerView3.f3317p.remove(this);
            if (recyclerView3.f3319q == this) {
                recyclerView3.f3319q = null;
            }
            List<RecyclerView.AbstractC0542p> list = this.f2290s.f3302h0;
            if (list != null) {
                list.remove(bVar);
            }
            m1367f();
        }
        this.f2290s = recyclerView;
        recyclerView.m1858g(this);
        this.f2290s.f3317p.add(this);
        this.f2290s.m1860h(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0541o
    /* renamed from: a */
    public void mo1363a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0541o
    /* renamed from: b */
    public boolean mo1364b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2293v;
        if (i == 1) {
            boolean zM1369h = m1369h(motionEvent.getX(), motionEvent.getY());
            boolean zM1368g = m1368g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zM1369h || zM1368g)) {
                if (zM1368g) {
                    this.f2294w = 1;
                    this.f2287p = (int) motionEvent.getX();
                } else if (zM1369h) {
                    this.f2294w = 2;
                    this.f2284m = (int) motionEvent.getY();
                }
                m1371j(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0541o
    /* renamed from: c */
    public void mo1365c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2293v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM1369h = m1369h(motionEvent.getX(), motionEvent.getY());
            boolean zM1368g = m1368g(motionEvent.getX(), motionEvent.getY());
            if (zM1369h || zM1368g) {
                if (zM1368g) {
                    this.f2294w = 1;
                    this.f2287p = (int) motionEvent.getX();
                } else if (zM1369h) {
                    this.f2294w = 2;
                    this.f2284m = (int) motionEvent.getY();
                }
                m1371j(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2293v == 2) {
            this.f2284m = 0.0f;
            this.f2287p = 0.0f;
            m1371j(1);
            this.f2294w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2293v == 2) {
            m1372k();
            if (this.f2294w == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f2296y;
                int i = this.f2273b;
                iArr[0] = i;
                iArr[1] = this.f2288q - i;
                float fMax = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f2286o - fMax) >= 2.0f) {
                    int iM1370i = m1370i(this.f2287p, fMax, iArr, this.f2290s.computeHorizontalScrollRange(), this.f2290s.computeHorizontalScrollOffset(), this.f2288q);
                    if (iM1370i != 0) {
                        this.f2290s.scrollBy(iM1370i, 0);
                    }
                    this.f2287p = fMax;
                }
            }
            if (this.f2294w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f2295x;
                int i2 = this.f2273b;
                iArr2[0] = i2;
                iArr2[1] = this.f2289r - i2;
                float fMax2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f2283l - fMax2) < 2.0f) {
                    return;
                }
                int iM1370i2 = m1370i(this.f2284m, fMax2, iArr2, this.f2290s.computeVerticalScrollRange(), this.f2290s.computeVerticalScrollOffset(), this.f2289r);
                if (iM1370i2 != 0) {
                    this.f2290s.scrollBy(0, iM1370i2);
                }
                this.f2284m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0537k
    /* renamed from: e */
    public void mo1366e(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0549w c0549w) {
        if (this.f2288q != this.f2290s.getWidth() || this.f2289r != this.f2290s.getHeight()) {
            this.f2288q = this.f2290s.getWidth();
            this.f2289r = this.f2290s.getHeight();
            m1371j(0);
            return;
        }
        if (this.f2269A != 0) {
            if (this.f2291t) {
                int i = this.f2288q;
                int i2 = this.f2276e;
                int i3 = i - i2;
                int i4 = this.f2283l;
                int i5 = this.f2282k;
                int i6 = i4 - (i5 / 2);
                this.f2274c.setBounds(0, 0, i2, i5);
                this.f2275d.setBounds(0, 0, this.f2277f, this.f2289r);
                RecyclerView recyclerView2 = this.f2290s;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    this.f2275d.draw(canvas);
                    canvas.translate(this.f2276e, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2274c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i3 = this.f2276e;
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f2275d.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f2274c.draw(canvas);
                }
                canvas.translate(-i3, -i6);
            }
            if (this.f2292u) {
                int i7 = this.f2289r;
                int i8 = this.f2280i;
                int i9 = this.f2286o;
                int i10 = this.f2285n;
                this.f2278g.setBounds(0, 0, i10, i8);
                this.f2279h.setBounds(0, 0, this.f2288q, this.f2281j);
                canvas.translate(0.0f, i7 - i8);
                this.f2279h.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.f2278g.draw(canvas);
                canvas.translate(-r2, -r7);
            }
        }
    }

    /* renamed from: f */
    public final void m1367f() {
        this.f2290s.removeCallbacks(this.f2270B);
    }

    /* renamed from: g */
    public boolean m1368g(float f2, float f3) {
        if (f3 >= this.f2289r - this.f2280i) {
            int i = this.f2286o;
            int i2 = this.f2285n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m1369h(float f2, float f3) {
        RecyclerView recyclerView = this.f2290s;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f2 > this.f2276e / 2) {
                return false;
            }
        } else if (f2 < this.f2288q - this.f2276e) {
            return false;
        }
        int i = this.f2283l;
        int i2 = this.f2282k / 2;
        return f3 >= ((float) (i - i2)) && f3 <= ((float) (i2 + i));
    }

    /* renamed from: i */
    public final int m1370i(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: j */
    public void m1371j(int i) {
        int i2;
        if (i == 2 && this.f2293v != 2) {
            this.f2274c.setState(f2267D);
            m1367f();
        }
        if (i == 0) {
            this.f2290s.invalidate();
        } else {
            m1372k();
        }
        if (this.f2293v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.f2293v = i;
        }
        this.f2274c.setState(f2268E);
        m1367f();
        this.f2290s.postDelayed(this.f2270B, i2);
        this.f2293v = i;
    }

    /* renamed from: k */
    public void m1372k() {
        int i = this.f2269A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f2297z.cancel();
            }
        }
        this.f2269A = 1;
        ValueAnimator valueAnimator = this.f2297z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2297z.setDuration(500L);
        this.f2297z.setStartDelay(0L);
        this.f2297z.start();
    }
}
