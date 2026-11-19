package androidx.recyclerview.widget;

import androidx.collection.C0250d;
import androidx.collection.C0253g;
import androidx.recyclerview.widget.RecyclerView;
import p011b0.C1023f;
import p011b0.InterfaceC1022e;

/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
class C0603q {

    /* renamed from: a */
    final C0253g<RecyclerView.AbstractC0557b0, a> f3898a = new C0253g<>();

    /* renamed from: b */
    final C0250d<RecyclerView.AbstractC0557b0> f3899b = new C0250d<>();

    /* renamed from: androidx.recyclerview.widget.q$a */
    static class a {

        /* renamed from: d */
        static InterfaceC1022e<a> f3900d = new C1023f(20);

        /* renamed from: a */
        int f3901a;

        /* renamed from: b */
        RecyclerView.AbstractC0567l.c f3902b;

        /* renamed from: c */
        RecyclerView.AbstractC0567l.c f3903c;

        private a() {
        }

        /* renamed from: a */
        static void m3468a() {
            while (f3900d.acquire() != null) {
            }
        }

        /* renamed from: b */
        static a m3469b() {
            a aVarAcquire = f3900d.acquire();
            return aVarAcquire == null ? new a() : aVarAcquire;
        }

        /* renamed from: c */
        static void m3470c(a aVar) {
            aVar.f3901a = 0;
            aVar.f3902b = null;
            aVar.f3903c = null;
            f3900d.release(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    interface b {
        /* renamed from: a */
        void mo3032a(RecyclerView.AbstractC0557b0 abstractC0557b0);

        /* renamed from: b */
        void mo3033b(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2);

        /* renamed from: c */
        void mo3034c(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2);

        /* renamed from: d */
        void mo3035d(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2);
    }

    C0603q() {
    }

    /* renamed from: l */
    private RecyclerView.AbstractC0567l.c m3451l(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4) {
        a aVarValueAt;
        RecyclerView.AbstractC0567l.c cVar;
        int iIndexOfKey = this.f3898a.indexOfKey(abstractC0557b0);
        if (iIndexOfKey >= 0 && (aVarValueAt = this.f3898a.valueAt(iIndexOfKey)) != null) {
            int i5 = aVarValueAt.f3901a;
            if ((i5 & i4) != 0) {
                int i6 = (~i4) & i5;
                aVarValueAt.f3901a = i6;
                if (i4 == 4) {
                    cVar = aVarValueAt.f3902b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarValueAt.f3903c;
                }
                if ((i6 & 12) == 0) {
                    this.f3898a.removeAt(iIndexOfKey);
                    a.m3470c(aVarValueAt);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m3452a(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar) {
        a aVarM3469b = this.f3898a.get(abstractC0557b0);
        if (aVarM3469b == null) {
            aVarM3469b = a.m3469b();
            this.f3898a.put(abstractC0557b0, aVarM3469b);
        }
        aVarM3469b.f3901a |= 2;
        aVarM3469b.f3902b = cVar;
    }

    /* renamed from: b */
    void m3453b(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        a aVarM3469b = this.f3898a.get(abstractC0557b0);
        if (aVarM3469b == null) {
            aVarM3469b = a.m3469b();
            this.f3898a.put(abstractC0557b0, aVarM3469b);
        }
        aVarM3469b.f3901a |= 1;
    }

    /* renamed from: c */
    void m3454c(long j4, RecyclerView.AbstractC0557b0 abstractC0557b0) {
        this.f3899b.m1117i(j4, abstractC0557b0);
    }

    /* renamed from: d */
    void m3455d(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar) {
        a aVarM3469b = this.f3898a.get(abstractC0557b0);
        if (aVarM3469b == null) {
            aVarM3469b = a.m3469b();
            this.f3898a.put(abstractC0557b0, aVarM3469b);
        }
        aVarM3469b.f3903c = cVar;
        aVarM3469b.f3901a |= 8;
    }

    /* renamed from: e */
    void m3456e(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar) {
        a aVarM3469b = this.f3898a.get(abstractC0557b0);
        if (aVarM3469b == null) {
            aVarM3469b = a.m3469b();
            this.f3898a.put(abstractC0557b0, aVarM3469b);
        }
        aVarM3469b.f3902b = cVar;
        aVarM3469b.f3901a |= 4;
    }

    /* renamed from: f */
    void m3457f() {
        this.f3898a.clear();
        this.f3899b.m1111b();
    }

    /* renamed from: g */
    RecyclerView.AbstractC0557b0 m3458g(long j4) {
        return this.f3899b.m1113e(j4);
    }

    /* renamed from: h */
    boolean m3459h(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        a aVar = this.f3898a.get(abstractC0557b0);
        return (aVar == null || (aVar.f3901a & 1) == 0) ? false : true;
    }

    /* renamed from: i */
    boolean m3460i(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        a aVar = this.f3898a.get(abstractC0557b0);
        return (aVar == null || (aVar.f3901a & 4) == 0) ? false : true;
    }

    /* renamed from: j */
    void m3461j() {
        a.m3468a();
    }

    /* renamed from: k */
    public void m3462k(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3466p(abstractC0557b0);
    }

    /* renamed from: m */
    RecyclerView.AbstractC0567l.c m3463m(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        return m3451l(abstractC0557b0, 8);
    }

    /* renamed from: n */
    RecyclerView.AbstractC0567l.c m3464n(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        return m3451l(abstractC0557b0, 4);
    }

    /* renamed from: o */
    void m3465o(b bVar) {
        for (int size = this.f3898a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0557b0 abstractC0557b0KeyAt = this.f3898a.keyAt(size);
            a aVarRemoveAt = this.f3898a.removeAt(size);
            int i4 = aVarRemoveAt.f3901a;
            if ((i4 & 3) == 3) {
                bVar.mo3032a(abstractC0557b0KeyAt);
            } else if ((i4 & 1) != 0) {
                RecyclerView.AbstractC0567l.c cVar = aVarRemoveAt.f3902b;
                if (cVar == null) {
                    bVar.mo3032a(abstractC0557b0KeyAt);
                } else {
                    bVar.mo3034c(abstractC0557b0KeyAt, cVar, aVarRemoveAt.f3903c);
                }
            } else if ((i4 & 14) == 14) {
                bVar.mo3033b(abstractC0557b0KeyAt, aVarRemoveAt.f3902b, aVarRemoveAt.f3903c);
            } else if ((i4 & 12) == 12) {
                bVar.mo3035d(abstractC0557b0KeyAt, aVarRemoveAt.f3902b, aVarRemoveAt.f3903c);
            } else if ((i4 & 4) != 0) {
                bVar.mo3034c(abstractC0557b0KeyAt, aVarRemoveAt.f3902b, null);
            } else if ((i4 & 8) != 0) {
                bVar.mo3033b(abstractC0557b0KeyAt, aVarRemoveAt.f3902b, aVarRemoveAt.f3903c);
            }
            a.m3470c(aVarRemoveAt);
        }
    }

    /* renamed from: p */
    void m3466p(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        a aVar = this.f3898a.get(abstractC0557b0);
        if (aVar == null) {
            return;
        }
        aVar.f3901a &= -2;
    }

    /* renamed from: q */
    void m3467q(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        int iM1120l = this.f3899b.m1120l() - 1;
        while (true) {
            if (iM1120l < 0) {
                break;
            }
            if (abstractC0557b0 == this.f3899b.m1121m(iM1120l)) {
                this.f3899b.m1119k(iM1120l);
                break;
            }
            iM1120l--;
        }
        a aVarRemove = this.f3898a.remove(abstractC0557b0);
        if (aVarRemove != null) {
            a.m3470c(aVarRemove);
        }
    }
}
