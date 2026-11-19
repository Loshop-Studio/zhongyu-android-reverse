package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
class C0588b {

    /* renamed from: a */
    final b f3757a;

    /* renamed from: b */
    final a f3758b = new a();

    /* renamed from: c */
    final List<View> f3759c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    static class a {

        /* renamed from: a */
        long f3760a = 0;

        /* renamed from: b */
        a f3761b;

        a() {
        }

        /* renamed from: c */
        private void m3317c() {
            if (this.f3761b == null) {
                this.f3761b = new a();
            }
        }

        /* renamed from: a */
        void m3318a(int i4) {
            if (i4 < 64) {
                this.f3760a &= ~(1 << i4);
                return;
            }
            a aVar = this.f3761b;
            if (aVar != null) {
                aVar.m3318a(i4 - 64);
            }
        }

        /* renamed from: b */
        int m3319b(int i4) {
            a aVar = this.f3761b;
            return aVar == null ? i4 >= 64 ? Long.bitCount(this.f3760a) : Long.bitCount(this.f3760a & ((1 << i4) - 1)) : i4 < 64 ? Long.bitCount(this.f3760a & ((1 << i4) - 1)) : aVar.m3319b(i4 - 64) + Long.bitCount(this.f3760a);
        }

        /* renamed from: d */
        boolean m3320d(int i4) {
            if (i4 < 64) {
                return (this.f3760a & (1 << i4)) != 0;
            }
            m3317c();
            return this.f3761b.m3320d(i4 - 64);
        }

        /* renamed from: e */
        void m3321e(int i4, boolean z3) {
            if (i4 >= 64) {
                m3317c();
                this.f3761b.m3321e(i4 - 64, z3);
                return;
            }
            long j4 = this.f3760a;
            boolean z4 = (Long.MIN_VALUE & j4) != 0;
            long j5 = (1 << i4) - 1;
            this.f3760a = ((j4 & (~j5)) << 1) | (j4 & j5);
            if (z3) {
                m3324h(i4);
            } else {
                m3318a(i4);
            }
            if (z4 || this.f3761b != null) {
                m3317c();
                this.f3761b.m3321e(0, z4);
            }
        }

        /* renamed from: f */
        boolean m3322f(int i4) {
            if (i4 >= 64) {
                m3317c();
                return this.f3761b.m3322f(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f3760a;
            boolean z3 = (j5 & j4) != 0;
            long j6 = j5 & (~j4);
            this.f3760a = j6;
            long j7 = j4 - 1;
            this.f3760a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f3761b;
            if (aVar != null) {
                if (aVar.m3320d(0)) {
                    m3324h(63);
                }
                this.f3761b.m3322f(0);
            }
            return z3;
        }

        /* renamed from: g */
        void m3323g() {
            this.f3760a = 0L;
            a aVar = this.f3761b;
            if (aVar != null) {
                aVar.m3323g();
            }
        }

        /* renamed from: h */
        void m3324h(int i4) {
            if (i4 < 64) {
                this.f3760a |= 1 << i4;
            } else {
                m3317c();
                this.f3761b.m3324h(i4 - 64);
            }
        }

        public String toString() {
            if (this.f3761b == null) {
                return Long.toBinaryString(this.f3760a);
            }
            return this.f3761b.toString() + "xx" + Long.toBinaryString(this.f3760a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    interface b {
        /* renamed from: a */
        View mo3036a(int i4);

        /* renamed from: b */
        void mo3037b(View view);

        /* renamed from: c */
        RecyclerView.AbstractC0557b0 mo3038c(View view);

        /* renamed from: d */
        void mo3039d(int i4);

        /* renamed from: e */
        void mo3040e(View view);

        /* renamed from: f */
        void mo3041f(View view, int i4);

        /* renamed from: g */
        int mo3042g();

        /* renamed from: h */
        void mo3043h(int i4);

        /* renamed from: i */
        void mo3044i();

        /* renamed from: j */
        void mo3045j(View view, int i4, ViewGroup.LayoutParams layoutParams);

        /* renamed from: k */
        int mo3046k(View view);
    }

    C0588b(b bVar) {
        this.f3757a = bVar;
    }

    /* renamed from: h */
    private int m3297h(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int iMo3042g = this.f3757a.mo3042g();
        int i5 = i4;
        while (i5 < iMo3042g) {
            int iM3319b = i4 - (i5 - this.f3758b.m3319b(i5));
            if (iM3319b == 0) {
                while (this.f3758b.m3320d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += iM3319b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m3298l(View view) {
        this.f3759c.add(view);
        this.f3757a.mo3037b(view);
    }

    /* renamed from: t */
    private boolean m3299t(View view) {
        if (!this.f3759c.remove(view)) {
            return false;
        }
        this.f3757a.mo3040e(view);
        return true;
    }

    /* renamed from: a */
    void m3300a(View view, int i4, boolean z3) {
        int iMo3042g = i4 < 0 ? this.f3757a.mo3042g() : m3297h(i4);
        this.f3758b.m3321e(iMo3042g, z3);
        if (z3) {
            m3298l(view);
        }
        this.f3757a.mo3041f(view, iMo3042g);
    }

    /* renamed from: b */
    void m3301b(View view, boolean z3) {
        m3300a(view, -1, z3);
    }

    /* renamed from: c */
    void m3302c(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        int iMo3042g = i4 < 0 ? this.f3757a.mo3042g() : m3297h(i4);
        this.f3758b.m3321e(iMo3042g, z3);
        if (z3) {
            m3298l(view);
        }
        this.f3757a.mo3045j(view, iMo3042g, layoutParams);
    }

    /* renamed from: d */
    void m3303d(int i4) {
        int iM3297h = m3297h(i4);
        this.f3758b.m3322f(iM3297h);
        this.f3757a.mo3039d(iM3297h);
    }

    /* renamed from: e */
    View m3304e(int i4) {
        int size = this.f3759c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f3759c.get(i5);
            RecyclerView.AbstractC0557b0 abstractC0557b0Mo3038c = this.f3757a.mo3038c(view);
            if (abstractC0557b0Mo3038c.getLayoutPosition() == i4 && !abstractC0557b0Mo3038c.isInvalid() && !abstractC0557b0Mo3038c.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    View m3305f(int i4) {
        return this.f3757a.mo3036a(m3297h(i4));
    }

    /* renamed from: g */
    int m3306g() {
        return this.f3757a.mo3042g() - this.f3759c.size();
    }

    /* renamed from: i */
    View m3307i(int i4) {
        return this.f3757a.mo3036a(i4);
    }

    /* renamed from: j */
    int m3308j() {
        return this.f3757a.mo3042g();
    }

    /* renamed from: k */
    void m3309k(View view) {
        int iMo3046k = this.f3757a.mo3046k(view);
        if (iMo3046k >= 0) {
            this.f3758b.m3324h(iMo3046k);
            m3298l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: m */
    int m3310m(View view) {
        int iMo3046k = this.f3757a.mo3046k(view);
        if (iMo3046k == -1 || this.f3758b.m3320d(iMo3046k)) {
            return -1;
        }
        return iMo3046k - this.f3758b.m3319b(iMo3046k);
    }

    /* renamed from: n */
    boolean m3311n(View view) {
        return this.f3759c.contains(view);
    }

    /* renamed from: o */
    void m3312o() {
        this.f3758b.m3323g();
        for (int size = this.f3759c.size() - 1; size >= 0; size--) {
            this.f3757a.mo3040e(this.f3759c.get(size));
            this.f3759c.remove(size);
        }
        this.f3757a.mo3044i();
    }

    /* renamed from: p */
    void m3313p(View view) {
        int iMo3046k = this.f3757a.mo3046k(view);
        if (iMo3046k < 0) {
            return;
        }
        if (this.f3758b.m3322f(iMo3046k)) {
            m3299t(view);
        }
        this.f3757a.mo3043h(iMo3046k);
    }

    /* renamed from: q */
    void m3314q(int i4) {
        int iM3297h = m3297h(i4);
        View viewMo3036a = this.f3757a.mo3036a(iM3297h);
        if (viewMo3036a == null) {
            return;
        }
        if (this.f3758b.m3322f(iM3297h)) {
            m3299t(viewMo3036a);
        }
        this.f3757a.mo3043h(iM3297h);
    }

    /* renamed from: r */
    boolean m3315r(View view) {
        int iMo3046k = this.f3757a.mo3046k(view);
        if (iMo3046k == -1) {
            m3299t(view);
            return true;
        }
        if (!this.f3758b.m3320d(iMo3046k)) {
            return false;
        }
        this.f3758b.m3322f(iMo3046k);
        m3299t(view);
        this.f3757a.mo3043h(iMo3046k);
        return true;
    }

    /* renamed from: s */
    void m3316s(View view) {
        int iMo3046k = this.f3757a.mo3046k(view);
        if (iMo3046k < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3758b.m3320d(iMo3046k)) {
            this.f3758b.m3318a(iMo3046k);
            m3299t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3758b.toString() + ", hidden list:" + this.f3759c.size();
    }
}
