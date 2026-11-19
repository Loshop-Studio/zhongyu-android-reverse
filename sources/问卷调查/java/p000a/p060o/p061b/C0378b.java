package p000a.p060o.p061b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.o.b.b */
/* loaded from: classes.dex */
public class C0378b {

    /* renamed from: a */
    public final b f2205a;

    /* renamed from: b */
    public final a f2206b = new a();

    /* renamed from: c */
    public final List<View> f2207c = new ArrayList();

    /* renamed from: a.o.b.b$a */
    public static class a {

        /* renamed from: a */
        public long f2208a = 0;

        /* renamed from: b */
        public a f2209b;

        /* renamed from: a */
        public void m1337a(int i) {
            if (i < 64) {
                this.f2208a &= ~(1 << i);
                return;
            }
            a aVar = this.f2209b;
            if (aVar != null) {
                aVar.m1337a(i - 64);
            }
        }

        /* renamed from: b */
        public int m1338b(int i) {
            long j;
            a aVar = this.f2209b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f2208a;
                }
                return Long.bitCount(j);
            }
            if (i >= 64) {
                return Long.bitCount(this.f2208a) + aVar.m1338b(i - 64);
            }
            j = this.f2208a & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        /* renamed from: c */
        public final void m1339c() {
            if (this.f2209b == null) {
                this.f2209b = new a();
            }
        }

        /* renamed from: d */
        public boolean m1340d(int i) {
            if (i < 64) {
                return (this.f2208a & (1 << i)) != 0;
            }
            m1339c();
            return this.f2209b.m1340d(i - 64);
        }

        /* renamed from: e */
        public void m1341e(int i, boolean z) {
            if (i >= 64) {
                m1339c();
                this.f2209b.m1341e(i - 64, z);
                return;
            }
            long j = this.f2208a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2208a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m1344h(i);
            } else {
                m1337a(i);
            }
            if (z2 || this.f2209b != null) {
                m1339c();
                this.f2209b.m1341e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m1342f(int i) {
            if (i >= 64) {
                m1339c();
                return this.f2209b.m1342f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f2208a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f2208a = j3;
            long j4 = j - 1;
            this.f2208a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f2209b;
            if (aVar != null) {
                if (aVar.m1340d(0)) {
                    m1344h(63);
                }
                this.f2209b.m1342f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m1343g() {
            this.f2208a = 0L;
            a aVar = this.f2209b;
            if (aVar != null) {
                aVar.m1343g();
            }
        }

        /* renamed from: h */
        public void m1344h(int i) {
            if (i < 64) {
                this.f2208a |= 1 << i;
            } else {
                m1339c();
                this.f2209b.m1344h(i - 64);
            }
        }

        public String toString() {
            if (this.f2209b == null) {
                return Long.toBinaryString(this.f2208a);
            }
            return this.f2209b.toString() + "xx" + Long.toBinaryString(this.f2208a);
        }
    }

    /* renamed from: a.o.b.b$b */
    public interface b {
    }

    public C0378b(b bVar) {
        this.f2205a = bVar;
    }

    /* renamed from: a */
    public void m1324a(View view, int i, boolean z) {
        int iM1408b = i < 0 ? ((C0398u) this.f2205a).m1408b() : m1329f(i);
        this.f2206b.m1341e(iM1408b, z);
        if (z) {
            m1332i(view);
        }
        C0398u c0398u = (C0398u) this.f2205a;
        c0398u.f2341a.addView(view, iM1408b);
        RecyclerView recyclerView = c0398u.f2341a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.m1821K(view);
        recyclerView.m1843S();
    }

    /* renamed from: b */
    public void m1325b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM1408b = i < 0 ? ((C0398u) this.f2205a).m1408b() : m1329f(i);
        this.f2206b.m1341e(iM1408b, z);
        if (z) {
            m1332i(view);
        }
        C0398u c0398u = (C0398u) this.f2205a;
        Objects.requireNonNull(c0398u);
        RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
        if (abstractC0552zM1821K != null) {
            if (!abstractC0552zM1821K.m2012n() && !abstractC0552zM1821K.m2018t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(abstractC0552zM1821K);
                throw new IllegalArgumentException(C0561a.m2074b(c0398u.f2341a, sb));
            }
            abstractC0552zM1821K.f3437j &= -257;
        }
        c0398u.f2341a.attachViewToParent(view, iM1408b, layoutParams);
    }

    /* renamed from: c */
    public void m1326c(int i) {
        RecyclerView.AbstractC0552z abstractC0552zM1821K;
        int iM1329f = m1329f(i);
        this.f2206b.m1342f(iM1329f);
        C0398u c0398u = (C0398u) this.f2205a;
        View childAt = c0398u.f2341a.getChildAt(iM1329f);
        if (childAt != null && (abstractC0552zM1821K = RecyclerView.m1821K(childAt)) != null) {
            if (abstractC0552zM1821K.m2012n() && !abstractC0552zM1821K.m2018t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(abstractC0552zM1821K);
                throw new IllegalArgumentException(C0561a.m2074b(c0398u.f2341a, sb));
            }
            abstractC0552zM1821K.m2000b(256);
        }
        c0398u.f2341a.detachViewFromParent(iM1329f);
    }

    /* renamed from: d */
    public View m1327d(int i) {
        return ((C0398u) this.f2205a).m1407a(m1329f(i));
    }

    /* renamed from: e */
    public int m1328e() {
        return ((C0398u) this.f2205a).m1408b() - this.f2207c.size();
    }

    /* renamed from: f */
    public final int m1329f(int i) {
        if (i < 0) {
            return -1;
        }
        int iM1408b = ((C0398u) this.f2205a).m1408b();
        int i2 = i;
        while (i2 < iM1408b) {
            int iM1338b = i - (i2 - this.f2206b.m1338b(i2));
            if (iM1338b == 0) {
                while (this.f2206b.m1340d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM1338b;
        }
        return -1;
    }

    /* renamed from: g */
    public View m1330g(int i) {
        return ((C0398u) this.f2205a).f2341a.getChildAt(i);
    }

    /* renamed from: h */
    public int m1331h() {
        return ((C0398u) this.f2205a).m1408b();
    }

    /* renamed from: i */
    public final void m1332i(View view) {
        this.f2207c.add(view);
        C0398u c0398u = (C0398u) this.f2205a;
        Objects.requireNonNull(c0398u);
        RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
        if (abstractC0552zM1821K != null) {
            RecyclerView recyclerView = c0398u.f2341a;
            int importantForAccessibility = abstractC0552zM1821K.f3444q;
            if (importantForAccessibility == -1) {
                View view2 = abstractC0552zM1821K.f3428a;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                importantForAccessibility = view2.getImportantForAccessibility();
            }
            abstractC0552zM1821K.f3443p = importantForAccessibility;
            recyclerView.m1865j0(abstractC0552zM1821K, 4);
        }
    }

    /* renamed from: j */
    public int m1333j(View view) {
        int iIndexOfChild = ((C0398u) this.f2205a).f2341a.indexOfChild(view);
        if (iIndexOfChild == -1 || this.f2206b.m1340d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.f2206b.m1338b(iIndexOfChild);
    }

    /* renamed from: k */
    public boolean m1334k(View view) {
        return this.f2207c.contains(view);
    }

    /* renamed from: l */
    public void m1335l(int i) {
        int iM1329f = m1329f(i);
        View viewM1407a = ((C0398u) this.f2205a).m1407a(iM1329f);
        if (viewM1407a == null) {
            return;
        }
        if (this.f2206b.m1342f(iM1329f)) {
            m1336m(viewM1407a);
        }
        ((C0398u) this.f2205a).m1409c(iM1329f);
    }

    /* renamed from: m */
    public final boolean m1336m(View view) {
        if (!this.f2207c.remove(view)) {
            return false;
        }
        C0398u c0398u = (C0398u) this.f2205a;
        Objects.requireNonNull(c0398u);
        RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
        if (abstractC0552zM1821K == null) {
            return true;
        }
        c0398u.f2341a.m1865j0(abstractC0552zM1821K, abstractC0552zM1821K.f3443p);
        abstractC0552zM1821K.f3443p = 0;
        return true;
    }

    public String toString() {
        return this.f2206b.toString() + ", hidden list:" + this.f2207c.size();
    }
}
