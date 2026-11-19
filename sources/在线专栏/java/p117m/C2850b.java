package p117m;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.Iterator;
import p117m.C2852d;
import p117m.C2857i;

/* renamed from: m.b */
/* loaded from: classes.dex */
public class C2850b implements C2852d.a {

    /* renamed from: e */
    public a f10974e;

    /* renamed from: a */
    C2857i f10970a = null;

    /* renamed from: b */
    float f10971b = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: c */
    boolean f10972c = false;

    /* renamed from: d */
    ArrayList<C2857i> f10973d = new ArrayList<>();

    /* renamed from: f */
    boolean f10975f = false;

    /* renamed from: m.b$a */
    public interface a {
        /* renamed from: a */
        float mo9555a(int i4);

        /* renamed from: b */
        void mo9556b(C2857i c2857i, float f4, boolean z3);

        /* renamed from: c */
        boolean mo9557c(C2857i c2857i);

        void clear();

        /* renamed from: d */
        float mo9558d(C2857i c2857i);

        /* renamed from: e */
        void mo9559e(C2857i c2857i, float f4);

        /* renamed from: f */
        C2857i mo9560f(int i4);

        /* renamed from: g */
        void mo9561g(float f4);

        int getCurrentSize();

        /* renamed from: h */
        float mo9562h(C2850b c2850b, boolean z3);

        /* renamed from: i */
        float mo9563i(C2857i c2857i, boolean z3);

        /* renamed from: j */
        void mo9564j();
    }

    public C2850b() {
    }

    /* renamed from: v */
    private boolean m9565v(C2857i c2857i, C2852d c2852d) {
        return c2857i.f11026m <= 1;
    }

    /* renamed from: x */
    private C2857i m9566x(boolean[] zArr, C2857i c2857i) {
        C2857i.a aVar;
        int currentSize = this.f10974e.getCurrentSize();
        C2857i c2857i2 = null;
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        for (int i4 = 0; i4 < currentSize; i4++) {
            float fMo9555a = this.f10974e.mo9555a(i4);
            if (fMo9555a < IGoodView.DEFAULT_TO_ALPHA) {
                C2857i c2857iMo9560f = this.f10974e.mo9560f(i4);
                if ((zArr == null || !zArr[c2857iMo9560f.f11016c]) && c2857iMo9560f != c2857i && (((aVar = c2857iMo9560f.f11023j) == C2857i.a.SLACK || aVar == C2857i.a.ERROR) && fMo9555a < f4)) {
                    f4 = fMo9555a;
                    c2857i2 = c2857iMo9560f;
                }
            }
        }
        return c2857i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String m9567A() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117m.C2850b.m9567A():java.lang.String");
    }

    /* renamed from: B */
    public void m9568B(C2852d c2852d, C2857i c2857i, boolean z3) {
        if (c2857i.f11020g) {
            this.f10971b += c2857i.f11019f * this.f10974e.mo9558d(c2857i);
            this.f10974e.mo9563i(c2857i, z3);
            if (z3) {
                c2857i.m9637c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo9569C(C2850b c2850b, boolean z3) {
        this.f10971b += c2850b.f10971b * this.f10974e.mo9562h(c2850b, z3);
        if (z3) {
            c2850b.f10970a.m9637c(this);
        }
    }

    /* renamed from: D */
    public void m9570D(C2852d c2852d) {
        if (c2852d.f10989f.length == 0) {
            return;
        }
        boolean z3 = false;
        while (!z3) {
            int currentSize = this.f10974e.getCurrentSize();
            for (int i4 = 0; i4 < currentSize; i4++) {
                C2857i c2857iMo9560f = this.f10974e.mo9560f(i4);
                if (c2857iMo9560f.f11017d != -1 || c2857iMo9560f.f11020g) {
                    this.f10973d.add(c2857iMo9560f);
                }
            }
            if (this.f10973d.size() > 0) {
                Iterator<C2857i> it = this.f10973d.iterator();
                while (it.hasNext()) {
                    C2857i next = it.next();
                    if (next.f11020g) {
                        m9568B(c2852d, next, true);
                    } else {
                        mo9569C(c2852d.f10989f[next.f11017d], true);
                    }
                }
                this.f10973d.clear();
            } else {
                z3 = true;
            }
        }
    }

    @Override // p117m.C2852d.a
    /* renamed from: a */
    public C2857i mo9571a(C2852d c2852d, boolean[] zArr) {
        return m9566x(zArr, null);
    }

    @Override // p117m.C2852d.a
    /* renamed from: b */
    public void mo9572b(C2857i c2857i) {
        int i4 = c2857i.f11018e;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f10974e.mo9559e(c2857i, f4);
    }

    @Override // p117m.C2852d.a
    /* renamed from: c */
    public void mo9573c(C2852d.a aVar) {
        if (aVar instanceof C2850b) {
            C2850b c2850b = (C2850b) aVar;
            this.f10970a = null;
            this.f10974e.clear();
            for (int i4 = 0; i4 < c2850b.f10974e.getCurrentSize(); i4++) {
                this.f10974e.mo9556b(c2850b.f10974e.mo9560f(i4), c2850b.f10974e.mo9555a(i4), true);
            }
        }
    }

    @Override // p117m.C2852d.a
    public void clear() {
        this.f10974e.clear();
        this.f10970a = null;
        this.f10971b = IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: d */
    public C2850b m9574d(C2852d c2852d, int i4) {
        this.f10974e.mo9559e(c2852d.m9617o(i4, "ep"), 1.0f);
        this.f10974e.mo9559e(c2852d.m9617o(i4, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    C2850b m9575e(C2857i c2857i, int i4) {
        this.f10974e.mo9559e(c2857i, i4);
        return this;
    }

    /* renamed from: f */
    boolean m9576f(C2852d c2852d) {
        boolean z3;
        C2857i c2857iM9577g = m9577g(c2852d);
        if (c2857iM9577g == null) {
            z3 = true;
        } else {
            m9593y(c2857iM9577g);
            z3 = false;
        }
        if (this.f10974e.getCurrentSize() == 0) {
            this.f10975f = true;
        }
        return z3;
    }

    /* renamed from: g */
    C2857i m9577g(C2852d c2852d) {
        int currentSize = this.f10974e.getCurrentSize();
        C2857i c2857i = null;
        C2857i c2857i2 = null;
        boolean z3 = false;
        boolean z4 = false;
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        float f5 = IGoodView.DEFAULT_TO_ALPHA;
        for (int i4 = 0; i4 < currentSize; i4++) {
            float fMo9555a = this.f10974e.mo9555a(i4);
            C2857i c2857iMo9560f = this.f10974e.mo9560f(i4);
            if (c2857iMo9560f.f11023j == C2857i.a.UNRESTRICTED) {
                if (c2857i == null || f4 > fMo9555a) {
                    boolean zM9565v = m9565v(c2857iMo9560f, c2852d);
                    z3 = zM9565v;
                    f4 = fMo9555a;
                    c2857i = c2857iMo9560f;
                } else if (!z3 && m9565v(c2857iMo9560f, c2852d)) {
                    f4 = fMo9555a;
                    c2857i = c2857iMo9560f;
                    z3 = true;
                }
            } else if (c2857i == null && fMo9555a < IGoodView.DEFAULT_TO_ALPHA) {
                if (c2857i2 == null || f5 > fMo9555a) {
                    boolean zM9565v2 = m9565v(c2857iMo9560f, c2852d);
                    z4 = zM9565v2;
                    f5 = fMo9555a;
                    c2857i2 = c2857iMo9560f;
                } else if (!z4 && m9565v(c2857iMo9560f, c2852d)) {
                    f5 = fMo9555a;
                    c2857i2 = c2857iMo9560f;
                    z4 = true;
                }
            }
        }
        return c2857i != null ? c2857i : c2857i2;
    }

    @Override // p117m.C2852d.a
    public C2857i getKey() {
        return this.f10970a;
    }

    /* renamed from: h */
    C2850b m9578h(C2857i c2857i, C2857i c2857i2, int i4, float f4, C2857i c2857i3, C2857i c2857i4, int i5) {
        if (c2857i2 == c2857i3) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i4, 1.0f);
            this.f10974e.mo9559e(c2857i2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
            this.f10974e.mo9559e(c2857i3, -1.0f);
            this.f10974e.mo9559e(c2857i4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                this.f10971b = (-i4) + i5;
            }
        } else if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
            this.f10974e.mo9559e(c2857i, -1.0f);
            this.f10974e.mo9559e(c2857i2, 1.0f);
            this.f10971b = i4;
        } else if (f4 >= 1.0f) {
            this.f10974e.mo9559e(c2857i4, -1.0f);
            this.f10974e.mo9559e(c2857i3, 1.0f);
            this.f10971b = -i5;
        } else {
            float f5 = 1.0f - f4;
            this.f10974e.mo9559e(c2857i, f5 * 1.0f);
            this.f10974e.mo9559e(c2857i2, f5 * (-1.0f));
            this.f10974e.mo9559e(c2857i3, (-1.0f) * f4);
            this.f10974e.mo9559e(c2857i4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                this.f10971b = ((-i4) * f5) + (i5 * f4);
            }
        }
        return this;
    }

    /* renamed from: i */
    C2850b m9579i(C2857i c2857i, int i4) {
        this.f10970a = c2857i;
        float f4 = i4;
        c2857i.f11019f = f4;
        this.f10971b = f4;
        this.f10975f = true;
        return this;
    }

    /* renamed from: j */
    C2850b m9580j(C2857i c2857i, C2857i c2857i2, float f4) {
        this.f10974e.mo9559e(c2857i, -1.0f);
        this.f10974e.mo9559e(c2857i2, f4);
        return this;
    }

    /* renamed from: k */
    public C2850b m9581k(C2857i c2857i, C2857i c2857i2, C2857i c2857i3, C2857i c2857i4, float f4) {
        this.f10974e.mo9559e(c2857i, -1.0f);
        this.f10974e.mo9559e(c2857i2, 1.0f);
        this.f10974e.mo9559e(c2857i3, f4);
        this.f10974e.mo9559e(c2857i4, -f4);
        return this;
    }

    /* renamed from: l */
    public C2850b m9582l(float f4, float f5, float f6, C2857i c2857i, C2857i c2857i2, C2857i c2857i3, C2857i c2857i4) {
        this.f10971b = IGoodView.DEFAULT_TO_ALPHA;
        if (f5 == IGoodView.DEFAULT_TO_ALPHA || f4 == f6) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
            this.f10974e.mo9559e(c2857i4, 1.0f);
            this.f10974e.mo9559e(c2857i3, -1.0f);
        } else if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
        } else if (f6 == IGoodView.DEFAULT_TO_ALPHA) {
            this.f10974e.mo9559e(c2857i3, 1.0f);
            this.f10974e.mo9559e(c2857i4, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
            this.f10974e.mo9559e(c2857i4, f7);
            this.f10974e.mo9559e(c2857i3, -f7);
        }
        return this;
    }

    /* renamed from: m */
    public C2850b m9583m(C2857i c2857i, int i4) {
        if (i4 < 0) {
            this.f10971b = i4 * (-1);
            this.f10974e.mo9559e(c2857i, 1.0f);
        } else {
            this.f10971b = i4;
            this.f10974e.mo9559e(c2857i, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C2850b m9584n(C2857i c2857i, C2857i c2857i2, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f10971b = i4;
        }
        if (z3) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
        } else {
            this.f10974e.mo9559e(c2857i, -1.0f);
            this.f10974e.mo9559e(c2857i2, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C2850b m9585o(C2857i c2857i, C2857i c2857i2, C2857i c2857i3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f10971b = i4;
        }
        if (z3) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
            this.f10974e.mo9559e(c2857i3, -1.0f);
        } else {
            this.f10974e.mo9559e(c2857i, -1.0f);
            this.f10974e.mo9559e(c2857i2, 1.0f);
            this.f10974e.mo9559e(c2857i3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C2850b m9586p(C2857i c2857i, C2857i c2857i2, C2857i c2857i3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f10971b = i4;
        }
        if (z3) {
            this.f10974e.mo9559e(c2857i, 1.0f);
            this.f10974e.mo9559e(c2857i2, -1.0f);
            this.f10974e.mo9559e(c2857i3, 1.0f);
        } else {
            this.f10974e.mo9559e(c2857i, -1.0f);
            this.f10974e.mo9559e(c2857i2, 1.0f);
            this.f10974e.mo9559e(c2857i3, -1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C2850b m9587q(C2857i c2857i, C2857i c2857i2, C2857i c2857i3, C2857i c2857i4, float f4) {
        this.f10974e.mo9559e(c2857i3, 0.5f);
        this.f10974e.mo9559e(c2857i4, 0.5f);
        this.f10974e.mo9559e(c2857i, -0.5f);
        this.f10974e.mo9559e(c2857i2, -0.5f);
        this.f10971b = -f4;
        return this;
    }

    /* renamed from: r */
    void m9588r() {
        float f4 = this.f10971b;
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            this.f10971b = f4 * (-1.0f);
            this.f10974e.mo9564j();
        }
    }

    /* renamed from: s */
    boolean m9589s() {
        C2857i c2857i = this.f10970a;
        return c2857i != null && (c2857i.f11023j == C2857i.a.UNRESTRICTED || this.f10971b >= IGoodView.DEFAULT_TO_ALPHA);
    }

    /* renamed from: t */
    boolean m9590t(C2857i c2857i) {
        return this.f10974e.mo9557c(c2857i);
    }

    public String toString() {
        return m9567A();
    }

    /* renamed from: u */
    public boolean m9591u() {
        return this.f10970a == null && this.f10971b == IGoodView.DEFAULT_TO_ALPHA && this.f10974e.getCurrentSize() == 0;
    }

    /* renamed from: w */
    public C2857i m9592w(C2857i c2857i) {
        return m9566x(null, c2857i);
    }

    /* renamed from: y */
    void m9593y(C2857i c2857i) {
        C2857i c2857i2 = this.f10970a;
        if (c2857i2 != null) {
            this.f10974e.mo9559e(c2857i2, -1.0f);
            this.f10970a = null;
        }
        float fMo9563i = this.f10974e.mo9563i(c2857i, true) * (-1.0f);
        this.f10970a = c2857i;
        if (fMo9563i == 1.0f) {
            return;
        }
        this.f10971b /= fMo9563i;
        this.f10974e.mo9561g(fMo9563i);
    }

    /* renamed from: z */
    public void m9594z() {
        this.f10970a = null;
        this.f10974e.clear();
        this.f10971b = IGoodView.DEFAULT_TO_ALPHA;
        this.f10975f = false;
    }

    public C2850b(C2851c c2851c) {
        this.f10974e = new C2849a(this, c2851c);
    }
}
