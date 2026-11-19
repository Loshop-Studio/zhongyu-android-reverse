package p117m;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import java.util.HashMap;
import p117m.C2857i;
import p121n.C2868d;
import p121n.C2869e;

/* renamed from: m.d */
/* loaded from: classes.dex */
public class C2852d {

    /* renamed from: q */
    private static int f10980q = 1000;

    /* renamed from: r */
    public static boolean f10981r = true;

    /* renamed from: s */
    public static long f10982s;

    /* renamed from: t */
    public static long f10983t;

    /* renamed from: c */
    private a f10986c;

    /* renamed from: f */
    C2850b[] f10989f;

    /* renamed from: m */
    final C2851c f10996m;

    /* renamed from: p */
    private a f10999p;

    /* renamed from: a */
    int f10984a = 0;

    /* renamed from: b */
    private HashMap<String, C2857i> f10985b = null;

    /* renamed from: d */
    private int f10987d = 32;

    /* renamed from: e */
    private int f10988e = 32;

    /* renamed from: g */
    public boolean f10990g = false;

    /* renamed from: h */
    public boolean f10991h = false;

    /* renamed from: i */
    private boolean[] f10992i = new boolean[32];

    /* renamed from: j */
    int f10993j = 1;

    /* renamed from: k */
    int f10994k = 0;

    /* renamed from: l */
    private int f10995l = 32;

    /* renamed from: n */
    private C2857i[] f10997n = new C2857i[f10980q];

    /* renamed from: o */
    private int f10998o = 0;

    /* renamed from: m.d$a */
    interface a {
        /* renamed from: a */
        C2857i mo9571a(C2852d c2852d, boolean[] zArr);

        /* renamed from: b */
        void mo9572b(C2857i c2857i);

        /* renamed from: c */
        void mo9573c(a aVar);

        void clear();

        C2857i getKey();
    }

    /* renamed from: m.d$b */
    class b extends C2850b {
        public b(C2851c c2851c) {
            this.f10974e = new C2858j(this, c2851c);
        }
    }

    public C2852d() {
        this.f10989f = null;
        this.f10989f = new C2850b[32];
        m9596C();
        C2851c c2851c = new C2851c();
        this.f10996m = c2851c;
        this.f10986c = new C2856h(c2851c);
        if (f10981r) {
            this.f10999p = new b(c2851c);
        } else {
            this.f10999p = new C2850b(c2851c);
        }
    }

    /* renamed from: B */
    private final int m9595B(a aVar, boolean z3) {
        for (int i4 = 0; i4 < this.f10993j; i4++) {
            this.f10992i[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            i5++;
            if (i5 >= this.f10993j * 2) {
                return i5;
            }
            if (aVar.getKey() != null) {
                this.f10992i[aVar.getKey().f11016c] = true;
            }
            C2857i c2857iMo9571a = aVar.mo9571a(this, this.f10992i);
            if (c2857iMo9571a != null) {
                boolean[] zArr = this.f10992i;
                int i6 = c2857iMo9571a.f11016c;
                if (zArr[i6]) {
                    return i5;
                }
                zArr[i6] = true;
            }
            if (c2857iMo9571a != null) {
                float f4 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.f10994k; i8++) {
                    C2850b c2850b = this.f10989f[i8];
                    if (c2850b.f10970a.f11023j != C2857i.a.UNRESTRICTED && !c2850b.f10975f && c2850b.m9590t(c2857iMo9571a)) {
                        float fMo9558d = c2850b.f10974e.mo9558d(c2857iMo9571a);
                        if (fMo9558d < IGoodView.DEFAULT_TO_ALPHA) {
                            float f5 = (-c2850b.f10971b) / fMo9558d;
                            if (f5 < f4) {
                                i7 = i8;
                                f4 = f5;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    C2850b c2850b2 = this.f10989f[i7];
                    c2850b2.f10970a.f11017d = -1;
                    c2850b2.m9593y(c2857iMo9571a);
                    C2857i c2857i = c2850b2.f10970a;
                    c2857i.f11017d = i7;
                    c2857i.m9641g(c2850b2);
                }
            } else {
                z4 = true;
            }
        }
        return i5;
    }

    /* renamed from: C */
    private void m9596C() {
        int i4 = 0;
        if (f10981r) {
            while (true) {
                C2850b[] c2850bArr = this.f10989f;
                if (i4 >= c2850bArr.length) {
                    return;
                }
                C2850b c2850b = c2850bArr[i4];
                if (c2850b != null) {
                    this.f10996m.f10976a.release(c2850b);
                }
                this.f10989f[i4] = null;
                i4++;
            }
        } else {
            while (true) {
                C2850b[] c2850bArr2 = this.f10989f;
                if (i4 >= c2850bArr2.length) {
                    return;
                }
                C2850b c2850b2 = c2850bArr2[i4];
                if (c2850b2 != null) {
                    this.f10996m.f10977b.release(c2850b2);
                }
                this.f10989f[i4] = null;
                i4++;
            }
        }
    }

    /* renamed from: a */
    private C2857i m9597a(C2857i.a aVar, String str) {
        C2857i c2857iAcquire = this.f10996m.f10978c.acquire();
        if (c2857iAcquire == null) {
            c2857iAcquire = new C2857i(aVar, str);
            c2857iAcquire.m9640f(aVar, str);
        } else {
            c2857iAcquire.m9638d();
            c2857iAcquire.m9640f(aVar, str);
        }
        int i4 = this.f10998o;
        int i5 = f10980q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f10980q = i6;
            this.f10997n = (C2857i[]) Arrays.copyOf(this.f10997n, i6);
        }
        C2857i[] c2857iArr = this.f10997n;
        int i7 = this.f10998o;
        this.f10998o = i7 + 1;
        c2857iArr[i7] = c2857iAcquire;
        return c2857iAcquire;
    }

    /* renamed from: l */
    private final void m9598l(C2850b c2850b) {
        if (f10981r) {
            C2850b[] c2850bArr = this.f10989f;
            int i4 = this.f10994k;
            if (c2850bArr[i4] != null) {
                this.f10996m.f10976a.release(c2850bArr[i4]);
            }
        } else {
            C2850b[] c2850bArr2 = this.f10989f;
            int i5 = this.f10994k;
            if (c2850bArr2[i5] != null) {
                this.f10996m.f10977b.release(c2850bArr2[i5]);
            }
        }
        C2850b[] c2850bArr3 = this.f10989f;
        int i6 = this.f10994k;
        c2850bArr3[i6] = c2850b;
        C2857i c2857i = c2850b.f10970a;
        c2857i.f11017d = i6;
        this.f10994k = i6 + 1;
        c2857i.m9641g(c2850b);
    }

    /* renamed from: n */
    private void m9599n() {
        for (int i4 = 0; i4 < this.f10994k; i4++) {
            C2850b c2850b = this.f10989f[i4];
            c2850b.f10970a.f11019f = c2850b.f10971b;
        }
    }

    /* renamed from: s */
    public static C2850b m9600s(C2852d c2852d, C2857i c2857i, C2857i c2857i2, float f4) {
        return c2852d.m9620r().m9580j(c2857i, c2857i2, f4);
    }

    /* renamed from: u */
    private int m9601u(a aVar) throws Exception {
        float f4;
        boolean z3;
        int i4 = 0;
        while (true) {
            int i5 = this.f10994k;
            f4 = IGoodView.DEFAULT_TO_ALPHA;
            if (i4 >= i5) {
                z3 = false;
                break;
            }
            C2850b[] c2850bArr = this.f10989f;
            if (c2850bArr[i4].f10970a.f11023j != C2857i.a.UNRESTRICTED && c2850bArr[i4].f10971b < IGoodView.DEFAULT_TO_ALPHA) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (!z3) {
            return 0;
        }
        boolean z4 = false;
        int i6 = 0;
        while (!z4) {
            i6++;
            float f5 = Float.MAX_VALUE;
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            while (i7 < this.f10994k) {
                C2850b c2850b = this.f10989f[i7];
                if (c2850b.f10970a.f11023j != C2857i.a.UNRESTRICTED && !c2850b.f10975f && c2850b.f10971b < f4) {
                    int i11 = 1;
                    while (i11 < this.f10993j) {
                        C2857i c2857i = this.f10996m.f10979d[i11];
                        float fMo9558d = c2850b.f10974e.mo9558d(c2857i);
                        if (fMo9558d > f4) {
                            for (int i12 = 0; i12 < 9; i12++) {
                                float f6 = c2857i.f11021h[i12] / fMo9558d;
                                if ((f6 < f5 && i12 == i10) || i12 > i10) {
                                    i10 = i12;
                                    f5 = f6;
                                    i8 = i7;
                                    i9 = i11;
                                }
                            }
                        }
                        i11++;
                        f4 = IGoodView.DEFAULT_TO_ALPHA;
                    }
                }
                i7++;
                f4 = IGoodView.DEFAULT_TO_ALPHA;
            }
            if (i8 != -1) {
                C2850b c2850b2 = this.f10989f[i8];
                c2850b2.f10970a.f11017d = -1;
                c2850b2.m9593y(this.f10996m.f10979d[i9]);
                C2857i c2857i2 = c2850b2.f10970a;
                c2857i2.f11017d = i8;
                c2857i2.m9641g(c2850b2);
            } else {
                z4 = true;
            }
            if (i6 > this.f10993j / 2) {
                z4 = true;
            }
            f4 = IGoodView.DEFAULT_TO_ALPHA;
        }
        return i6;
    }

    /* renamed from: w */
    public static C2853e m9602w() {
        return null;
    }

    /* renamed from: y */
    private void m9603y() {
        int i4 = this.f10987d * 2;
        this.f10987d = i4;
        this.f10989f = (C2850b[]) Arrays.copyOf(this.f10989f, i4);
        C2851c c2851c = this.f10996m;
        c2851c.f10979d = (C2857i[]) Arrays.copyOf(c2851c.f10979d, this.f10987d);
        int i5 = this.f10987d;
        this.f10992i = new boolean[i5];
        this.f10988e = i5;
        this.f10995l = i5;
    }

    /* renamed from: A */
    void m9604A(a aVar) throws Exception {
        m9601u(aVar);
        m9595B(aVar, false);
        m9599n();
    }

    /* renamed from: D */
    public void m9605D() {
        C2851c c2851c;
        int i4 = 0;
        while (true) {
            c2851c = this.f10996m;
            C2857i[] c2857iArr = c2851c.f10979d;
            if (i4 >= c2857iArr.length) {
                break;
            }
            C2857i c2857i = c2857iArr[i4];
            if (c2857i != null) {
                c2857i.m9638d();
            }
            i4++;
        }
        c2851c.f10978c.mo9625a(this.f10997n, this.f10998o);
        this.f10998o = 0;
        Arrays.fill(this.f10996m.f10979d, (Object) null);
        HashMap<String, C2857i> map = this.f10985b;
        if (map != null) {
            map.clear();
        }
        this.f10984a = 0;
        this.f10986c.clear();
        this.f10993j = 1;
        for (int i5 = 0; i5 < this.f10994k; i5++) {
            this.f10989f[i5].f10972c = false;
        }
        m9596C();
        this.f10994k = 0;
        if (f10981r) {
            this.f10999p = new b(this.f10996m);
        } else {
            this.f10999p = new C2850b(this.f10996m);
        }
    }

    /* renamed from: b */
    public void m9606b(C2869e c2869e, C2869e c2869e2, float f4, int i4) {
        C2868d.b bVar = C2868d.b.LEFT;
        C2857i c2857iM9619q = m9619q(c2869e.mo9745n(bVar));
        C2868d.b bVar2 = C2868d.b.TOP;
        C2857i c2857iM9619q2 = m9619q(c2869e.mo9745n(bVar2));
        C2868d.b bVar3 = C2868d.b.RIGHT;
        C2857i c2857iM9619q3 = m9619q(c2869e.mo9745n(bVar3));
        C2868d.b bVar4 = C2868d.b.BOTTOM;
        C2857i c2857iM9619q4 = m9619q(c2869e.mo9745n(bVar4));
        C2857i c2857iM9619q5 = m9619q(c2869e2.mo9745n(bVar));
        C2857i c2857iM9619q6 = m9619q(c2869e2.mo9745n(bVar2));
        C2857i c2857iM9619q7 = m9619q(c2869e2.mo9745n(bVar3));
        C2857i c2857iM9619q8 = m9619q(c2869e2.mo9745n(bVar4));
        C2850b c2850bM9620r = m9620r();
        double d4 = f4;
        double d5 = i4;
        c2850bM9620r.m9587q(c2857iM9619q2, c2857iM9619q4, c2857iM9619q6, c2857iM9619q8, (float) (Math.sin(d4) * d5));
        m9608d(c2850bM9620r);
        C2850b c2850bM9620r2 = m9620r();
        c2850bM9620r2.m9587q(c2857iM9619q, c2857iM9619q3, c2857iM9619q5, c2857iM9619q7, (float) (Math.cos(d4) * d5));
        m9608d(c2850bM9620r2);
    }

    /* renamed from: c */
    public void m9607c(C2857i c2857i, C2857i c2857i2, int i4, float f4, C2857i c2857i3, C2857i c2857i4, int i5, int i6) {
        C2850b c2850bM9620r = m9620r();
        c2850bM9620r.m9578h(c2857i, c2857i2, i4, f4, c2857i3, c2857i4, i5);
        if (i6 != 8) {
            c2850bM9620r.m9574d(this, i6);
        }
        m9608d(c2850bM9620r);
    }

    /* renamed from: d */
    public void m9608d(C2850b c2850b) {
        C2857i c2857iM9592w;
        if (c2850b == null) {
            return;
        }
        boolean z3 = true;
        if (this.f10994k + 1 >= this.f10995l || this.f10993j + 1 >= this.f10988e) {
            m9603y();
        }
        boolean z4 = false;
        if (!c2850b.f10975f) {
            c2850b.m9570D(this);
            if (c2850b.m9591u()) {
                return;
            }
            c2850b.m9588r();
            if (c2850b.m9576f(this)) {
                C2857i c2857iM9618p = m9618p();
                c2850b.f10970a = c2857iM9618p;
                m9598l(c2850b);
                this.f10999p.mo9573c(c2850b);
                m9595B(this.f10999p, true);
                if (c2857iM9618p.f11017d == -1) {
                    if (c2850b.f10970a == c2857iM9618p && (c2857iM9592w = c2850b.m9592w(c2857iM9618p)) != null) {
                        c2850b.m9593y(c2857iM9592w);
                    }
                    if (!c2850b.f10975f) {
                        c2850b.f10970a.m9641g(c2850b);
                    }
                    this.f10994k--;
                }
            } else {
                z3 = false;
            }
            if (!c2850b.m9589s()) {
                return;
            } else {
                z4 = z3;
            }
        }
        if (z4) {
            return;
        }
        m9598l(c2850b);
    }

    /* renamed from: e */
    public C2850b m9609e(C2857i c2857i, C2857i c2857i2, int i4, int i5) {
        if (i5 == 8 && c2857i2.f11020g && c2857i.f11017d == -1) {
            c2857i.m9639e(this, c2857i2.f11019f + i4);
            return null;
        }
        C2850b c2850bM9620r = m9620r();
        c2850bM9620r.m9584n(c2857i, c2857i2, i4);
        if (i5 != 8) {
            c2850bM9620r.m9574d(this, i5);
        }
        m9608d(c2850bM9620r);
        return c2850bM9620r;
    }

    /* renamed from: f */
    public void m9610f(C2857i c2857i, int i4) {
        int i5 = c2857i.f11017d;
        if (i5 == -1) {
            c2857i.m9639e(this, i4);
            return;
        }
        if (i5 == -1) {
            C2850b c2850bM9620r = m9620r();
            c2850bM9620r.m9579i(c2857i, i4);
            m9608d(c2850bM9620r);
            return;
        }
        C2850b c2850b = this.f10989f[i5];
        if (c2850b.f10975f) {
            c2850b.f10971b = i4;
            return;
        }
        if (c2850b.f10974e.getCurrentSize() == 0) {
            c2850b.f10975f = true;
            c2850b.f10971b = i4;
        } else {
            C2850b c2850bM9620r2 = m9620r();
            c2850bM9620r2.m9583m(c2857i, i4);
            m9608d(c2850bM9620r2);
        }
    }

    /* renamed from: g */
    public void m9611g(C2857i c2857i, C2857i c2857i2, int i4, boolean z3) {
        C2850b c2850bM9620r = m9620r();
        C2857i c2857iM9621t = m9621t();
        c2857iM9621t.f11018e = 0;
        c2850bM9620r.m9585o(c2857i, c2857i2, c2857iM9621t, i4);
        m9608d(c2850bM9620r);
    }

    /* renamed from: h */
    public void m9612h(C2857i c2857i, C2857i c2857i2, int i4, int i5) {
        C2850b c2850bM9620r = m9620r();
        C2857i c2857iM9621t = m9621t();
        c2857iM9621t.f11018e = 0;
        c2850bM9620r.m9585o(c2857i, c2857i2, c2857iM9621t, i4);
        if (i5 != 8) {
            m9616m(c2850bM9620r, (int) (c2850bM9620r.f10974e.mo9558d(c2857iM9621t) * (-1.0f)), i5);
        }
        m9608d(c2850bM9620r);
    }

    /* renamed from: i */
    public void m9613i(C2857i c2857i, C2857i c2857i2, int i4, boolean z3) {
        C2850b c2850bM9620r = m9620r();
        C2857i c2857iM9621t = m9621t();
        c2857iM9621t.f11018e = 0;
        c2850bM9620r.m9586p(c2857i, c2857i2, c2857iM9621t, i4);
        m9608d(c2850bM9620r);
    }

    /* renamed from: j */
    public void m9614j(C2857i c2857i, C2857i c2857i2, int i4, int i5) {
        C2850b c2850bM9620r = m9620r();
        C2857i c2857iM9621t = m9621t();
        c2857iM9621t.f11018e = 0;
        c2850bM9620r.m9586p(c2857i, c2857i2, c2857iM9621t, i4);
        if (i5 != 8) {
            m9616m(c2850bM9620r, (int) (c2850bM9620r.f10974e.mo9558d(c2857iM9621t) * (-1.0f)), i5);
        }
        m9608d(c2850bM9620r);
    }

    /* renamed from: k */
    public void m9615k(C2857i c2857i, C2857i c2857i2, C2857i c2857i3, C2857i c2857i4, float f4, int i4) {
        C2850b c2850bM9620r = m9620r();
        c2850bM9620r.m9581k(c2857i, c2857i2, c2857i3, c2857i4, f4);
        if (i4 != 8) {
            c2850bM9620r.m9574d(this, i4);
        }
        m9608d(c2850bM9620r);
    }

    /* renamed from: m */
    void m9616m(C2850b c2850b, int i4, int i5) {
        c2850b.m9575e(m9617o(i5, null), i4);
    }

    /* renamed from: o */
    public C2857i m9617o(int i4, String str) {
        if (this.f10993j + 1 >= this.f10988e) {
            m9603y();
        }
        C2857i c2857iM9597a = m9597a(C2857i.a.ERROR, str);
        int i5 = this.f10984a + 1;
        this.f10984a = i5;
        this.f10993j++;
        c2857iM9597a.f11016c = i5;
        c2857iM9597a.f11018e = i4;
        this.f10996m.f10979d[i5] = c2857iM9597a;
        this.f10986c.mo9572b(c2857iM9597a);
        return c2857iM9597a;
    }

    /* renamed from: p */
    public C2857i m9618p() {
        if (this.f10993j + 1 >= this.f10988e) {
            m9603y();
        }
        C2857i c2857iM9597a = m9597a(C2857i.a.SLACK, null);
        int i4 = this.f10984a + 1;
        this.f10984a = i4;
        this.f10993j++;
        c2857iM9597a.f11016c = i4;
        this.f10996m.f10979d[i4] = c2857iM9597a;
        return c2857iM9597a;
    }

    /* renamed from: q */
    public C2857i m9619q(Object obj) {
        C2857i c2857iM9679f = null;
        if (obj == null) {
            return null;
        }
        if (this.f10993j + 1 >= this.f10988e) {
            m9603y();
        }
        if (obj instanceof C2868d) {
            C2868d c2868d = (C2868d) obj;
            c2857iM9679f = c2868d.m9679f();
            if (c2857iM9679f == null) {
                c2868d.m9686m(this.f10996m);
                c2857iM9679f = c2868d.m9679f();
            }
            int i4 = c2857iM9679f.f11016c;
            if (i4 == -1 || i4 > this.f10984a || this.f10996m.f10979d[i4] == null) {
                if (i4 != -1) {
                    c2857iM9679f.m9638d();
                }
                int i5 = this.f10984a + 1;
                this.f10984a = i5;
                this.f10993j++;
                c2857iM9679f.f11016c = i5;
                c2857iM9679f.f11023j = C2857i.a.UNRESTRICTED;
                this.f10996m.f10979d[i5] = c2857iM9679f;
            }
        }
        return c2857iM9679f;
    }

    /* renamed from: r */
    public C2850b m9620r() {
        C2850b c2850bAcquire;
        if (f10981r) {
            c2850bAcquire = this.f10996m.f10976a.acquire();
            if (c2850bAcquire == null) {
                c2850bAcquire = new b(this.f10996m);
                f10983t++;
            } else {
                c2850bAcquire.m9594z();
            }
        } else {
            c2850bAcquire = this.f10996m.f10977b.acquire();
            if (c2850bAcquire == null) {
                c2850bAcquire = new C2850b(this.f10996m);
                f10982s++;
            } else {
                c2850bAcquire.m9594z();
            }
        }
        C2857i.m9635b();
        return c2850bAcquire;
    }

    /* renamed from: t */
    public C2857i m9621t() {
        if (this.f10993j + 1 >= this.f10988e) {
            m9603y();
        }
        C2857i c2857iM9597a = m9597a(C2857i.a.SLACK, null);
        int i4 = this.f10984a + 1;
        this.f10984a = i4;
        this.f10993j++;
        c2857iM9597a.f11016c = i4;
        this.f10996m.f10979d[i4] = c2857iM9597a;
        return c2857iM9597a;
    }

    /* renamed from: v */
    public C2851c m9622v() {
        return this.f10996m;
    }

    /* renamed from: x */
    public int m9623x(Object obj) {
        C2857i c2857iM9679f = ((C2868d) obj).m9679f();
        if (c2857iM9679f != null) {
            return (int) (c2857iM9679f.f11019f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void m9624z() throws Exception {
        if (!this.f10990g && !this.f10991h) {
            m9604A(this.f10986c);
            return;
        }
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f10994k) {
                z3 = true;
                break;
            } else if (!this.f10989f[i4].f10975f) {
                break;
            } else {
                i4++;
            }
        }
        if (z3) {
            m9599n();
        } else {
            m9604A(this.f10986c);
        }
    }
}
