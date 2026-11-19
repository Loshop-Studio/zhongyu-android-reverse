package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0595i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p011b0.C1023f;
import p011b0.InterfaceC1022e;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
class C0587a implements C0595i.a {

    /* renamed from: a */
    private InterfaceC1022e<b> f3745a;

    /* renamed from: b */
    final ArrayList<b> f3746b;

    /* renamed from: c */
    final ArrayList<b> f3747c;

    /* renamed from: d */
    final a f3748d;

    /* renamed from: e */
    Runnable f3749e;

    /* renamed from: f */
    final boolean f3750f;

    /* renamed from: g */
    final C0595i f3751g;

    /* renamed from: h */
    private int f3752h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface a {
        /* renamed from: a */
        void mo3047a(int i4, int i5);

        /* renamed from: b */
        void mo3048b(b bVar);

        /* renamed from: c */
        RecyclerView.AbstractC0557b0 mo3049c(int i4);

        /* renamed from: d */
        void mo3050d(int i4, int i5);

        /* renamed from: e */
        void mo3051e(int i4, int i5);

        /* renamed from: f */
        void mo3052f(int i4, int i5);

        /* renamed from: g */
        void mo3053g(b bVar);

        /* renamed from: h */
        void mo3054h(int i4, int i5, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class b {

        /* renamed from: a */
        int f3753a;

        /* renamed from: b */
        int f3754b;

        /* renamed from: c */
        Object f3755c;

        /* renamed from: d */
        int f3756d;

        b(int i4, int i5, int i6, Object obj) {
            this.f3753a = i4;
            this.f3754b = i5;
            this.f3756d = i6;
            this.f3755c = obj;
        }

        /* renamed from: a */
        String m3296a() {
            int i4 = this.f3753a;
            return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f3753a;
            if (i4 != bVar.f3753a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f3756d - this.f3754b) == 1 && this.f3756d == bVar.f3754b && this.f3754b == bVar.f3756d) {
                return true;
            }
            if (this.f3756d != bVar.f3756d || this.f3754b != bVar.f3754b) {
                return false;
            }
            Object obj2 = this.f3755c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3755c)) {
                    return false;
                }
            } else if (bVar.f3755c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3753a * 31) + this.f3754b) * 31) + this.f3756d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m3296a() + ",s:" + this.f3754b + "c:" + this.f3756d + ",p:" + this.f3755c + "]";
        }
    }

    C0587a(a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m3270c(b bVar) {
        m3276v(bVar);
    }

    /* renamed from: d */
    private void m3271d(b bVar) {
        m3276v(bVar);
    }

    /* renamed from: f */
    private void m3272f(b bVar) {
        boolean z3;
        char c4;
        int i4 = bVar.f3754b;
        int i5 = bVar.f3756d + i4;
        char c5 = 65535;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f3748d.mo3049c(i6) != null || m3274h(i6)) {
                if (c5 == 0) {
                    m3275k(mo3279b(2, i4, i7, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c4 = 1;
            } else {
                if (c5 == 1) {
                    m3276v(mo3279b(2, i4, i7, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c4 = 0;
            }
            if (z3) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            c5 = c4;
        }
        if (i7 != bVar.f3756d) {
            mo3278a(bVar);
            bVar = mo3279b(2, i4, i7, null);
        }
        if (c5 == 0) {
            m3275k(bVar);
        } else {
            m3276v(bVar);
        }
    }

    /* renamed from: g */
    private void m3273g(b bVar) {
        int i4 = bVar.f3754b;
        int i5 = bVar.f3756d + i4;
        int i6 = i4;
        char c4 = 65535;
        int i7 = 0;
        while (i4 < i5) {
            if (this.f3748d.mo3049c(i4) != null || m3274h(i4)) {
                if (c4 == 0) {
                    m3275k(mo3279b(4, i6, i7, bVar.f3755c));
                    i6 = i4;
                    i7 = 0;
                }
                c4 = 1;
            } else {
                if (c4 == 1) {
                    m3276v(mo3279b(4, i6, i7, bVar.f3755c));
                    i6 = i4;
                    i7 = 0;
                }
                c4 = 0;
            }
            i7++;
            i4++;
        }
        if (i7 != bVar.f3756d) {
            Object obj = bVar.f3755c;
            mo3278a(bVar);
            bVar = mo3279b(4, i6, i7, obj);
        }
        if (c4 == 0) {
            m3275k(bVar);
        } else {
            m3276v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m3274h(int i4) {
        int size = this.f3747c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f3747c.get(i5);
            int i6 = bVar.f3753a;
            if (i6 == 8) {
                if (m3285n(bVar.f3756d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f3754b;
                int i8 = bVar.f3756d + i7;
                while (i7 < i8) {
                    if (m3285n(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m3275k(b bVar) {
        int i4;
        int i5 = bVar.f3753a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM3277z = m3277z(bVar.f3754b, i5);
        int i6 = bVar.f3754b;
        int i7 = bVar.f3753a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < bVar.f3756d; i9++) {
            int iM3277z2 = m3277z(bVar.f3754b + (i4 * i9), bVar.f3753a);
            int i10 = bVar.f3753a;
            if (i10 == 2 ? iM3277z2 == iM3277z : i10 == 4 && iM3277z2 == iM3277z + 1) {
                i8++;
            } else {
                b bVarMo3279b = mo3279b(i10, iM3277z, i8, bVar.f3755c);
                m3283l(bVarMo3279b, i6);
                mo3278a(bVarMo3279b);
                if (bVar.f3753a == 4) {
                    i6 += i8;
                }
                iM3277z = iM3277z2;
                i8 = 1;
            }
        }
        Object obj = bVar.f3755c;
        mo3278a(bVar);
        if (i8 > 0) {
            b bVarMo3279b2 = mo3279b(bVar.f3753a, iM3277z, i8, obj);
            m3283l(bVarMo3279b2, i6);
            mo3278a(bVarMo3279b2);
        }
    }

    /* renamed from: v */
    private void m3276v(b bVar) {
        this.f3747c.add(bVar);
        int i4 = bVar.f3753a;
        if (i4 == 1) {
            this.f3748d.mo3051e(bVar.f3754b, bVar.f3756d);
            return;
        }
        if (i4 == 2) {
            this.f3748d.mo3050d(bVar.f3754b, bVar.f3756d);
            return;
        }
        if (i4 == 4) {
            this.f3748d.mo3054h(bVar.f3754b, bVar.f3756d, bVar.f3755c);
        } else {
            if (i4 == 8) {
                this.f3748d.mo3047a(bVar.f3754b, bVar.f3756d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m3277z(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f3747c.size() - 1; size >= 0; size--) {
            b bVar = this.f3747c.get(size);
            int i8 = bVar.f3753a;
            if (i8 == 8) {
                int i9 = bVar.f3754b;
                int i10 = bVar.f3756d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            bVar.f3754b = i9 + 1;
                            bVar.f3756d = i10 + 1;
                        } else if (i5 == 2) {
                            bVar.f3754b = i9 - 1;
                            bVar.f3756d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        bVar.f3756d = i10 + 1;
                    } else if (i5 == 2) {
                        bVar.f3756d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        bVar.f3754b = i9 + 1;
                    } else if (i5 == 2) {
                        bVar.f3754b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = bVar.f3754b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= bVar.f3756d;
                    } else if (i8 == 2) {
                        i4 += bVar.f3756d;
                    }
                } else if (i5 == 1) {
                    bVar.f3754b = i11 + 1;
                } else if (i5 == 2) {
                    bVar.f3754b = i11 - 1;
                }
            }
        }
        for (int size2 = this.f3747c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3747c.get(size2);
            if (bVar2.f3753a == 8) {
                int i12 = bVar2.f3756d;
                if (i12 == bVar2.f3754b || i12 < 0) {
                    this.f3747c.remove(size2);
                    mo3278a(bVar2);
                }
            } else if (bVar2.f3756d <= 0) {
                this.f3747c.remove(size2);
                mo3278a(bVar2);
            }
        }
        return i4;
    }

    @Override // androidx.recyclerview.widget.C0595i.a
    /* renamed from: a */
    public void mo3278a(b bVar) {
        if (this.f3750f) {
            return;
        }
        bVar.f3755c = null;
        this.f3745a.release(bVar);
    }

    @Override // androidx.recyclerview.widget.C0595i.a
    /* renamed from: b */
    public b mo3279b(int i4, int i5, int i6, Object obj) {
        b bVarAcquire = this.f3745a.acquire();
        if (bVarAcquire == null) {
            return new b(i4, i5, i6, obj);
        }
        bVarAcquire.f3753a = i4;
        bVarAcquire.f3754b = i5;
        bVarAcquire.f3756d = i6;
        bVarAcquire.f3755c = obj;
        return bVarAcquire;
    }

    /* renamed from: e */
    public int m3280e(int i4) {
        int size = this.f3746b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f3746b.get(i5);
            int i6 = bVar.f3753a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = bVar.f3754b;
                    if (i7 <= i4) {
                        int i8 = bVar.f3756d;
                        if (i7 + i8 > i4) {
                            return -1;
                        }
                        i4 -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = bVar.f3754b;
                    if (i9 == i4) {
                        i4 = bVar.f3756d;
                    } else {
                        if (i9 < i4) {
                            i4--;
                        }
                        if (bVar.f3756d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (bVar.f3754b <= i4) {
                i4 += bVar.f3756d;
            }
        }
        return i4;
    }

    /* renamed from: i */
    void m3281i() {
        int size = this.f3747c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f3748d.mo3048b(this.f3747c.get(i4));
        }
        m3294x(this.f3747c);
        this.f3752h = 0;
    }

    /* renamed from: j */
    void m3282j() {
        m3281i();
        int size = this.f3746b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f3746b.get(i4);
            int i5 = bVar.f3753a;
            if (i5 == 1) {
                this.f3748d.mo3048b(bVar);
                this.f3748d.mo3051e(bVar.f3754b, bVar.f3756d);
            } else if (i5 == 2) {
                this.f3748d.mo3048b(bVar);
                this.f3748d.mo3052f(bVar.f3754b, bVar.f3756d);
            } else if (i5 == 4) {
                this.f3748d.mo3048b(bVar);
                this.f3748d.mo3054h(bVar.f3754b, bVar.f3756d, bVar.f3755c);
            } else if (i5 == 8) {
                this.f3748d.mo3048b(bVar);
                this.f3748d.mo3047a(bVar.f3754b, bVar.f3756d);
            }
            Runnable runnable = this.f3749e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m3294x(this.f3746b);
        this.f3752h = 0;
    }

    /* renamed from: l */
    void m3283l(b bVar, int i4) {
        this.f3748d.mo3053g(bVar);
        int i5 = bVar.f3753a;
        if (i5 == 2) {
            this.f3748d.mo3052f(i4, bVar.f3756d);
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3748d.mo3054h(i4, bVar.f3756d, bVar.f3755c);
        }
    }

    /* renamed from: m */
    int m3284m(int i4) {
        return m3285n(i4, 0);
    }

    /* renamed from: n */
    int m3285n(int i4, int i5) {
        int size = this.f3747c.size();
        while (i5 < size) {
            b bVar = this.f3747c.get(i5);
            int i6 = bVar.f3753a;
            if (i6 == 8) {
                int i7 = bVar.f3754b;
                if (i7 == i4) {
                    i4 = bVar.f3756d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f3756d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = bVar.f3754b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = bVar.f3756d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += bVar.f3756d;
                }
            }
            i5++;
        }
        return i4;
    }

    /* renamed from: o */
    boolean m3286o(int i4) {
        return (i4 & this.f3752h) != 0;
    }

    /* renamed from: p */
    boolean m3287p() {
        return this.f3746b.size() > 0;
    }

    /* renamed from: q */
    boolean m3288q() {
        return (this.f3747c.isEmpty() || this.f3746b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    boolean m3289r(int i4, int i5, Object obj) {
        if (i5 < 1) {
            return false;
        }
        this.f3746b.add(mo3279b(4, i4, i5, obj));
        this.f3752h |= 4;
        return this.f3746b.size() == 1;
    }

    /* renamed from: s */
    boolean m3290s(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f3746b.add(mo3279b(1, i4, i5, null));
        this.f3752h |= 1;
        return this.f3746b.size() == 1;
    }

    /* renamed from: t */
    boolean m3291t(int i4, int i5, int i6) {
        if (i4 == i5) {
            return false;
        }
        if (i6 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f3746b.add(mo3279b(8, i4, i5, null));
        this.f3752h |= 8;
        return this.f3746b.size() == 1;
    }

    /* renamed from: u */
    boolean m3292u(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f3746b.add(mo3279b(2, i4, i5, null));
        this.f3752h |= 2;
        return this.f3746b.size() == 1;
    }

    /* renamed from: w */
    void m3293w() {
        this.f3751g.m3389b(this.f3746b);
        int size = this.f3746b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f3746b.get(i4);
            int i5 = bVar.f3753a;
            if (i5 == 1) {
                m3270c(bVar);
            } else if (i5 == 2) {
                m3272f(bVar);
            } else if (i5 == 4) {
                m3273g(bVar);
            } else if (i5 == 8) {
                m3271d(bVar);
            }
            Runnable runnable = this.f3749e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3746b.clear();
    }

    /* renamed from: x */
    void m3294x(List<b> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            mo3278a(list.get(i4));
        }
        list.clear();
    }

    /* renamed from: y */
    void m3295y() {
        m3294x(this.f3746b);
        m3294x(this.f3747c);
        this.f3752h = 0;
    }

    C0587a(a aVar, boolean z3) {
        this.f3745a = new C1023f(30);
        this.f3746b = new ArrayList<>();
        this.f3747c = new ArrayList<>();
        this.f3752h = 0;
        this.f3748d = aVar;
        this.f3750f = z3;
        this.f3751g = new C0595i(this);
    }
}
