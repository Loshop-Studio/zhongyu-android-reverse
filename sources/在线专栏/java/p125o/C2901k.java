package p125o;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import p121n.C2870f;

/* renamed from: o.k */
/* loaded from: classes.dex */
class C2901k {

    /* renamed from: h */
    public static int f11350h;

    /* renamed from: c */
    AbstractC2903m f11353c;

    /* renamed from: d */
    AbstractC2903m f11354d;

    /* renamed from: f */
    int f11356f;

    /* renamed from: g */
    int f11357g;

    /* renamed from: a */
    public int f11351a = 0;

    /* renamed from: b */
    public boolean f11352b = false;

    /* renamed from: e */
    ArrayList<AbstractC2903m> f11355e = new ArrayList<>();

    public C2901k(AbstractC2903m abstractC2903m, int i4) {
        this.f11353c = null;
        this.f11354d = null;
        int i5 = f11350h;
        this.f11356f = i5;
        f11350h = i5 + 1;
        this.f11353c = abstractC2903m;
        this.f11354d = abstractC2903m;
        this.f11357g = i4;
    }

    /* renamed from: c */
    private long m9957c(C2896f c2896f, long j4) {
        AbstractC2903m abstractC2903m = c2896f.f11329d;
        if (abstractC2903m instanceof C2899i) {
            return j4;
        }
        int size = c2896f.f11336k.size();
        long jMin = j4;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC2894d interfaceC2894d = c2896f.f11336k.get(i4);
            if (interfaceC2894d instanceof C2896f) {
                C2896f c2896f2 = (C2896f) interfaceC2894d;
                if (c2896f2.f11329d != abstractC2903m) {
                    jMin = Math.min(jMin, m9957c(c2896f2, c2896f2.f11331f + j4));
                }
            }
        }
        if (c2896f != abstractC2903m.f11369i) {
            return jMin;
        }
        long jMo9934j = j4 - abstractC2903m.mo9934j();
        return Math.min(Math.min(jMin, m9957c(abstractC2903m.f11368h, jMo9934j)), jMo9934j - abstractC2903m.f11368h.f11331f);
    }

    /* renamed from: d */
    private long m9958d(C2896f c2896f, long j4) {
        AbstractC2903m abstractC2903m = c2896f.f11329d;
        if (abstractC2903m instanceof C2899i) {
            return j4;
        }
        int size = c2896f.f11336k.size();
        long jMax = j4;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC2894d interfaceC2894d = c2896f.f11336k.get(i4);
            if (interfaceC2894d instanceof C2896f) {
                C2896f c2896f2 = (C2896f) interfaceC2894d;
                if (c2896f2.f11329d != abstractC2903m) {
                    jMax = Math.max(jMax, m9958d(c2896f2, c2896f2.f11331f + j4));
                }
            }
        }
        if (c2896f != abstractC2903m.f11368h) {
            return jMax;
        }
        long jMo9934j = j4 + abstractC2903m.mo9934j();
        return Math.max(Math.max(jMax, m9958d(abstractC2903m.f11369i, jMo9934j)), jMo9934j - abstractC2903m.f11369i.f11331f);
    }

    /* renamed from: a */
    public void m9959a(AbstractC2903m abstractC2903m) {
        this.f11355e.add(abstractC2903m);
        this.f11354d = abstractC2903m;
    }

    /* renamed from: b */
    public long m9960b(C2870f c2870f, int i4) {
        long jMo9934j;
        int i5;
        AbstractC2903m abstractC2903m = this.f11353c;
        if (abstractC2903m instanceof C2893c) {
            if (((C2893c) abstractC2903m).f11366f != i4) {
                return 0L;
            }
        } else if (i4 == 0) {
            if (!(abstractC2903m instanceof C2900j)) {
                return 0L;
            }
        } else if (!(abstractC2903m instanceof C2902l)) {
            return 0L;
        }
        C2896f c2896f = (i4 == 0 ? c2870f.f11146e : c2870f.f11148f).f11368h;
        C2896f c2896f2 = (i4 == 0 ? c2870f.f11146e : c2870f.f11148f).f11369i;
        boolean zContains = abstractC2903m.f11368h.f11337l.contains(c2896f);
        boolean zContains2 = this.f11353c.f11369i.f11337l.contains(c2896f2);
        long jMo9934j2 = this.f11353c.mo9934j();
        if (zContains && zContains2) {
            long jM9958d = m9958d(this.f11353c.f11368h, 0L);
            long jM9957c = m9957c(this.f11353c.f11369i, 0L);
            long j4 = jM9958d - jMo9934j2;
            AbstractC2903m abstractC2903m2 = this.f11353c;
            int i6 = abstractC2903m2.f11369i.f11331f;
            if (j4 >= (-i6)) {
                j4 += i6;
            }
            int i7 = abstractC2903m2.f11368h.f11331f;
            long j5 = ((-jM9957c) - jMo9934j2) - i7;
            if (j5 >= i7) {
                j5 -= i7;
            }
            float fM9749p = abstractC2903m2.f11362b.m9749p(i4);
            float f4 = fM9749p > IGoodView.DEFAULT_TO_ALPHA ? (long) ((j5 / fM9749p) + (j4 / (1.0f - fM9749p))) : 0L;
            long j6 = ((long) ((f4 * fM9749p) + 0.5f)) + jMo9934j2 + ((long) ((f4 * (1.0f - fM9749p)) + 0.5f));
            jMo9934j = r13.f11368h.f11331f + j6;
            i5 = this.f11353c.f11369i.f11331f;
        } else {
            if (zContains) {
                return Math.max(m9958d(this.f11353c.f11368h, r13.f11331f), this.f11353c.f11368h.f11331f + jMo9934j2);
            }
            if (zContains2) {
                return Math.max(-m9957c(this.f11353c.f11369i, r13.f11331f), (-this.f11353c.f11369i.f11331f) + jMo9934j2);
            }
            jMo9934j = r13.f11368h.f11331f + this.f11353c.mo9934j();
            i5 = this.f11353c.f11369i.f11331f;
        }
        return jMo9934j - i5;
    }
}
