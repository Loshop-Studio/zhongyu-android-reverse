package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0367a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f2787r = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    final View f2790c;

    /* renamed from: d */
    private Runnable f2791d;

    /* renamed from: g */
    private int f2794g;

    /* renamed from: h */
    private int f2795h;

    /* renamed from: l */
    private boolean f2799l;

    /* renamed from: m */
    boolean f2800m;

    /* renamed from: n */
    boolean f2801n;

    /* renamed from: o */
    boolean f2802o;

    /* renamed from: p */
    private boolean f2803p;

    /* renamed from: q */
    private boolean f2804q;

    /* renamed from: a */
    final a f2788a = new a();

    /* renamed from: b */
    private final Interpolator f2789b = new AccelerateInterpolator();

    /* renamed from: e */
    private float[] f2792e = {IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};

    /* renamed from: f */
    private float[] f2793f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i */
    private float[] f2796i = {IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};

    /* renamed from: j */
    private float[] f2797j = {IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};

    /* renamed from: k */
    private float[] f2798k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a */
    private static class a {

        /* renamed from: a */
        private int f2805a;

        /* renamed from: b */
        private int f2806b;

        /* renamed from: c */
        private float f2807c;

        /* renamed from: d */
        private float f2808d;

        /* renamed from: j */
        private float f2814j;

        /* renamed from: k */
        private int f2815k;

        /* renamed from: e */
        private long f2809e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f2813i = -1;

        /* renamed from: f */
        private long f2810f = 0;

        /* renamed from: g */
        private int f2811g = 0;

        /* renamed from: h */
        private int f2812h = 0;

        a() {
        }

        /* renamed from: e */
        private float m2160e(long j4) {
            if (j4 < this.f2809e) {
                return IGoodView.DEFAULT_TO_ALPHA;
            }
            long j5 = this.f2813i;
            if (j5 < 0 || j4 < j5) {
                return AbstractViewOnTouchListenerC0367a.m2139e((j4 - r0) / this.f2805a, IGoodView.DEFAULT_TO_ALPHA, 1.0f) * 0.5f;
            }
            float f4 = this.f2814j;
            return (1.0f - f4) + (f4 * AbstractViewOnTouchListenerC0367a.m2139e((j4 - j5) / this.f2815k, IGoodView.DEFAULT_TO_ALPHA, 1.0f));
        }

        /* renamed from: g */
        private float m2161g(float f4) {
            return ((-4.0f) * f4 * f4) + (f4 * 4.0f);
        }

        /* renamed from: a */
        public void m2162a() {
            if (this.f2810f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM2161g = m2161g(m2160e(jCurrentAnimationTimeMillis));
            long j4 = jCurrentAnimationTimeMillis - this.f2810f;
            this.f2810f = jCurrentAnimationTimeMillis;
            float f4 = j4 * fM2161g;
            this.f2811g = (int) (this.f2807c * f4);
            this.f2812h = (int) (f4 * this.f2808d);
        }

        /* renamed from: b */
        public int m2163b() {
            return this.f2811g;
        }

        /* renamed from: c */
        public int m2164c() {
            return this.f2812h;
        }

        /* renamed from: d */
        public int m2165d() {
            float f4 = this.f2807c;
            return (int) (f4 / Math.abs(f4));
        }

        /* renamed from: f */
        public int m2166f() {
            float f4 = this.f2808d;
            return (int) (f4 / Math.abs(f4));
        }

        /* renamed from: h */
        public boolean m2167h() {
            return this.f2813i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2813i + ((long) this.f2815k);
        }

        /* renamed from: i */
        public void m2168i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2815k = AbstractViewOnTouchListenerC0367a.m2140f((int) (jCurrentAnimationTimeMillis - this.f2809e), 0, this.f2806b);
            this.f2814j = m2160e(jCurrentAnimationTimeMillis);
            this.f2813i = jCurrentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m2169j(int i4) {
            this.f2806b = i4;
        }

        /* renamed from: k */
        public void m2170k(int i4) {
            this.f2805a = i4;
        }

        /* renamed from: l */
        public void m2171l(float f4, float f5) {
            this.f2807c = f4;
            this.f2808d = f5;
        }

        /* renamed from: m */
        public void m2172m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2809e = jCurrentAnimationTimeMillis;
            this.f2813i = -1L;
            this.f2810f = jCurrentAnimationTimeMillis;
            this.f2814j = 0.5f;
            this.f2811g = 0;
            this.f2812h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0367a abstractViewOnTouchListenerC0367a = AbstractViewOnTouchListenerC0367a.this;
            if (abstractViewOnTouchListenerC0367a.f2802o) {
                if (abstractViewOnTouchListenerC0367a.f2800m) {
                    abstractViewOnTouchListenerC0367a.f2800m = false;
                    abstractViewOnTouchListenerC0367a.f2788a.m2172m();
                }
                a aVar = AbstractViewOnTouchListenerC0367a.this.f2788a;
                if (aVar.m2167h() || !AbstractViewOnTouchListenerC0367a.this.m2159u()) {
                    AbstractViewOnTouchListenerC0367a.this.f2802o = false;
                    return;
                }
                AbstractViewOnTouchListenerC0367a abstractViewOnTouchListenerC0367a2 = AbstractViewOnTouchListenerC0367a.this;
                if (abstractViewOnTouchListenerC0367a2.f2801n) {
                    abstractViewOnTouchListenerC0367a2.f2801n = false;
                    abstractViewOnTouchListenerC0367a2.m2147c();
                }
                aVar.m2162a();
                AbstractViewOnTouchListenerC0367a.this.mo2148j(aVar.m2163b(), aVar.m2164c());
                C0358u.m2035i0(AbstractViewOnTouchListenerC0367a.this.f2790c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0367a(View view) {
        this.f2790c = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (int) ((1575.0f * f4) + 0.5f);
        m2153o(f5, f5);
        float f6 = (int) ((f4 * 315.0f) + 0.5f);
        m2154p(f6, f6);
        m2150l(1);
        m2152n(Float.MAX_VALUE, Float.MAX_VALUE);
        m2157s(0.2f, 0.2f);
        m2158t(1.0f, 1.0f);
        m2149k(f2787r);
        m2156r(500);
        m2155q(500);
    }

    /* renamed from: d */
    private float m2138d(int i4, float f4, float f5, float f6) {
        float fM2142h = m2142h(this.f2792e[i4], f5, this.f2793f[i4], f4);
        if (fM2142h == IGoodView.DEFAULT_TO_ALPHA) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        float f7 = this.f2796i[i4];
        float f8 = this.f2797j[i4];
        float f9 = this.f2798k[i4];
        float f10 = f7 * f6;
        return fM2142h > IGoodView.DEFAULT_TO_ALPHA ? m2139e(fM2142h * f10, f8, f9) : -m2139e((-fM2142h) * f10, f8, f9);
    }

    /* renamed from: e */
    static float m2139e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    /* renamed from: f */
    static int m2140f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    /* renamed from: g */
    private float m2141g(float f4, float f5) {
        if (f5 == IGoodView.DEFAULT_TO_ALPHA) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        int i4 = this.f2794g;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= IGoodView.DEFAULT_TO_ALPHA) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f2802o && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < IGoodView.DEFAULT_TO_ALPHA) {
            return f4 / (-f5);
        }
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: h */
    private float m2142h(float f4, float f5, float f6, float f7) {
        float interpolation;
        float fM2139e = m2139e(f4 * f5, IGoodView.DEFAULT_TO_ALPHA, f6);
        float fM2141g = m2141g(f5 - f7, fM2139e) - m2141g(f7, fM2139e);
        if (fM2141g < IGoodView.DEFAULT_TO_ALPHA) {
            interpolation = -this.f2789b.getInterpolation(-fM2141g);
        } else {
            if (fM2141g <= IGoodView.DEFAULT_TO_ALPHA) {
                return IGoodView.DEFAULT_TO_ALPHA;
            }
            interpolation = this.f2789b.getInterpolation(fM2141g);
        }
        return m2139e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m2143i() {
        if (this.f2800m) {
            this.f2802o = false;
        } else {
            this.f2788a.m2168i();
        }
    }

    /* renamed from: v */
    private void m2144v() {
        int i4;
        if (this.f2791d == null) {
            this.f2791d = new b();
        }
        this.f2802o = true;
        this.f2800m = true;
        if (this.f2799l || (i4 = this.f2795h) <= 0) {
            this.f2791d.run();
        } else {
            C0358u.m2037j0(this.f2790c, this.f2791d, i4);
        }
        this.f2799l = true;
    }

    /* renamed from: a */
    public abstract boolean mo2145a(int i4);

    /* renamed from: b */
    public abstract boolean mo2146b(int i4);

    /* renamed from: c */
    void m2147c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
        this.f2790c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo2148j(int i4, int i5);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0367a m2149k(int i4) {
        this.f2795h = i4;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC0367a m2150l(int i4) {
        this.f2794g = i4;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC0367a m2151m(boolean z3) {
        if (this.f2803p && !z3) {
            m2143i();
        }
        this.f2803p = z3;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC0367a m2152n(float f4, float f5) {
        float[] fArr = this.f2793f;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC0367a m2153o(float f4, float f5) {
        float[] fArr = this.f2798k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2803p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m2143i()
            goto L58
        L1a:
            r5.f2801n = r2
            r5.f2799l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2790c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2138d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2790c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2138d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2788a
            r7.m2171l(r0, r6)
            boolean r6 = r5.f2802o
            if (r6 != 0) goto L58
            boolean r6 = r5.m2159u()
            if (r6 == 0) goto L58
            r5.m2144v()
        L58:
            boolean r6 = r5.f2804q
            if (r6 == 0) goto L61
            boolean r6 = r5.f2802o
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0367a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC0367a m2154p(float f4, float f5) {
        float[] fArr = this.f2797j;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC0367a m2155q(int i4) {
        this.f2788a.m2169j(i4);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC0367a m2156r(int i4) {
        this.f2788a.m2170k(i4);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC0367a m2157s(float f4, float f5) {
        float[] fArr = this.f2792e;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC0367a m2158t(float f4, float f5) {
        float[] fArr = this.f2796i;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m2159u() {
        a aVar = this.f2788a;
        int iM2166f = aVar.m2166f();
        int iM2165d = aVar.m2165d();
        return (iM2166f != 0 && mo2146b(iM2166f)) || (iM2165d != 0 && mo2145a(iM2165d));
    }
}
