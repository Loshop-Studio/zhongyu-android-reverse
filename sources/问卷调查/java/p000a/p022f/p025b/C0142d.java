package p000a.p022f.p025b;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p000a.p022f.p025b.C0140b;
import p000a.p022f.p025b.C0145g;
import p000a.p022f.p025b.p026i.C0149c;

/* renamed from: a.f.b.d */
/* loaded from: classes.dex */
public class C0142d {

    /* renamed from: o */
    public static int f975o = 1000;

    /* renamed from: p */
    public static boolean f976p = true;

    /* renamed from: q */
    public static long f977q;

    /* renamed from: r */
    public static long f978r;

    /* renamed from: b */
    public a f980b;

    /* renamed from: e */
    public C0140b[] f983e;

    /* renamed from: k */
    public final C0141c f989k;

    /* renamed from: n */
    public a f992n;

    /* renamed from: a */
    public int f979a = 0;

    /* renamed from: c */
    public int f981c = 32;

    /* renamed from: d */
    public int f982d = 32;

    /* renamed from: f */
    public boolean f984f = false;

    /* renamed from: g */
    public boolean[] f985g = new boolean[32];

    /* renamed from: h */
    public int f986h = 1;

    /* renamed from: i */
    public int f987i = 0;

    /* renamed from: j */
    public int f988j = 32;

    /* renamed from: l */
    public C0145g[] f990l = new C0145g[f975o];

    /* renamed from: m */
    public int f991m = 0;

    /* renamed from: a.f.b.d$a */
    public interface a {
        /* renamed from: a */
        void mo537a(C0145g c0145g);

        /* renamed from: b */
        C0145g mo538b(C0142d c0142d, boolean[] zArr);

        void clear();
    }

    /* renamed from: a.f.b.d$b */
    public class b extends C0140b {
        public b(C0142d c0142d, C0141c c0141c) {
            this.f969d = new C0146h(this, c0141c);
        }
    }

    public C0142d() {
        this.f983e = null;
        this.f983e = new C0140b[32];
        m567s();
        C0141c c0141c = new C0141c();
        this.f989k = c0141c;
        this.f980b = new C0144f(c0141c);
        this.f992n = f976p ? new b(this, c0141c) : new C0140b(c0141c);
    }

    /* renamed from: a */
    public final C0145g m549a(C0145g.a aVar, String str) {
        C0145g c0145gM569a = this.f989k.f973c.m569a();
        if (c0145gM569a == null) {
            c0145gM569a = new C0145g(aVar);
        } else {
            c0145gM569a.m575c();
        }
        c0145gM569a.f1011i = aVar;
        int i = this.f991m;
        int i2 = f975o;
        if (i >= i2) {
            int i3 = i2 * 2;
            f975o = i3;
            this.f990l = (C0145g[]) Arrays.copyOf(this.f990l, i3);
        }
        C0145g[] c0145gArr = this.f990l;
        int i4 = this.f991m;
        this.f991m = i4 + 1;
        c0145gArr[i4] = c0145gM569a;
        return c0145gM569a;
    }

    /* renamed from: b */
    public void m550b(C0145g c0145g, C0145g c0145g2, int i, float f2, C0145g c0145g3, C0145g c0145g4, int i2, int i3) {
        int i4;
        float f3;
        C0140b c0140bM561m = m561m();
        if (c0145g2 == c0145g3) {
            c0140bM561m.f969d.mo535j(c0145g, 1.0f);
            c0140bM561m.f969d.mo535j(c0145g4, 1.0f);
            c0140bM561m.f969d.mo535j(c0145g2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                c0140bM561m.f969d.mo535j(c0145g, 1.0f);
                c0140bM561m.f969d.mo535j(c0145g2, -1.0f);
                c0140bM561m.f969d.mo535j(c0145g3, -1.0f);
                c0140bM561m.f969d.mo535j(c0145g4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f3 = i4;
                }
            } else if (f2 <= 0.0f) {
                c0140bM561m.f969d.mo535j(c0145g, -1.0f);
                c0140bM561m.f969d.mo535j(c0145g2, 1.0f);
                f3 = i;
            } else if (f2 >= 1.0f) {
                c0140bM561m.f969d.mo535j(c0145g4, -1.0f);
                c0140bM561m.f969d.mo535j(c0145g3, 1.0f);
                i4 = -i2;
                f3 = i4;
            } else {
                float f4 = 1.0f - f2;
                c0140bM561m.f969d.mo535j(c0145g, f4 * 1.0f);
                c0140bM561m.f969d.mo535j(c0145g2, f4 * (-1.0f));
                c0140bM561m.f969d.mo535j(c0145g3, (-1.0f) * f2);
                c0140bM561m.f969d.mo535j(c0145g4, 1.0f * f2);
                if (i > 0 || i2 > 0) {
                    c0140bM561m.f967b = (i2 * f2) + ((-i) * f4);
                }
            }
            c0140bM561m.f967b = f3;
        }
        if (i3 != 8) {
            c0140bM561m.m539c(this, i3);
        }
        m551c(c0140bM561m);
    }

    /* renamed from: c */
    public void m551c(C0140b c0140b) {
        boolean z;
        boolean z2;
        boolean z3;
        C0145g c0145gM545i;
        C0145g.a aVar = C0145g.a.UNRESTRICTED;
        boolean z4 = true;
        if (this.f987i + 1 >= this.f988j || this.f986h + 1 >= this.f982d) {
            m564p();
        }
        if (c0140b.f970e) {
            z = false;
        } else {
            if (this.f983e.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iMo536k = c0140b.f969d.mo536k();
                    for (int i = 0; i < iMo536k; i++) {
                        C0145g c0145gMo529d = c0140b.f969d.mo529d(i);
                        if (c0145gMo529d.f1005c != -1 || c0145gMo529d.f1008f) {
                            c0140b.f968c.add(c0145gMo529d);
                        }
                    }
                    if (c0140b.f968c.size() > 0) {
                        Iterator<C0145g> it = c0140b.f968c.iterator();
                        while (it.hasNext()) {
                            C0145g next = it.next();
                            if (next.f1008f) {
                                c0140b.m547k(next, true);
                            } else {
                                c0140b.mo548l(this.f983e[next.f1005c], true);
                            }
                        }
                        c0140b.f968c.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            if (c0140b.f966a == null && c0140b.f967b == 0.0f && c0140b.f969d.mo536k() == 0) {
                return;
            }
            float f2 = c0140b.f967b;
            if (f2 < 0.0f) {
                c0140b.f967b = f2 * (-1.0f);
                c0140b.f969d.mo534i();
            }
            int iMo536k2 = c0140b.f969d.mo536k();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C0145g c0145g = null;
            C0145g c0145g2 = null;
            boolean zM544h = false;
            boolean zM544h2 = false;
            for (int i2 = 0; i2 < iMo536k2; i2++) {
                float fMo526a = c0140b.f969d.mo526a(i2);
                C0145g c0145gMo529d2 = c0140b.f969d.mo529d(i2);
                if (c0145gMo529d2.f1011i == aVar) {
                    if (c0145g == null || f3 > fMo526a) {
                        zM544h = c0140b.m544h(c0145gMo529d2);
                    } else if (!zM544h && c0140b.m544h(c0145gMo529d2)) {
                        zM544h = true;
                    }
                    f3 = fMo526a;
                    c0145g = c0145gMo529d2;
                } else if (c0145g == null && fMo526a < 0.0f) {
                    if (c0145g2 == null || f4 > fMo526a) {
                        zM544h2 = c0140b.m544h(c0145gMo529d2);
                    } else if (!zM544h2 && c0140b.m544h(c0145gMo529d2)) {
                        zM544h2 = true;
                    }
                    f4 = fMo526a;
                    c0145g2 = c0145gMo529d2;
                }
            }
            if (c0145g == null) {
                c0145g = c0145g2;
            }
            if (c0145g == null) {
                z2 = true;
            } else {
                c0140b.m546j(c0145g);
                z2 = false;
            }
            if (c0140b.f969d.mo536k() == 0) {
                c0140b.f970e = true;
            }
            if (z2) {
                if (this.f986h + 1 >= this.f982d) {
                    m564p();
                }
                C0145g c0145gM549a = m549a(C0145g.a.SLACK, null);
                int i3 = this.f979a + 1;
                this.f979a = i3;
                this.f986h++;
                c0145gM549a.f1004b = i3;
                this.f989k.f974d[i3] = c0145gM549a;
                c0140b.f966a = c0145gM549a;
                m557i(c0140b);
                C0140b c0140b2 = (C0140b) this.f992n;
                Objects.requireNonNull(c0140b2);
                c0140b2.f966a = null;
                c0140b2.f969d.clear();
                for (int i4 = 0; i4 < c0140b.f969d.mo536k(); i4++) {
                    c0140b2.f969d.mo528c(c0140b.f969d.mo529d(i4), c0140b.f969d.mo526a(i4), true);
                }
                m566r(this.f992n);
                if (c0145gM549a.f1005c == -1) {
                    if (c0140b.f966a == c0145gM549a && (c0145gM545i = c0140b.m545i(null, c0145gM549a)) != null) {
                        c0140b.m546j(c0145gM545i);
                    }
                    if (!c0140b.f970e) {
                        c0140b.f966a.m577e(c0140b);
                    }
                    this.f987i--;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            C0145g c0145g3 = c0140b.f966a;
            if (c0145g3 == null || (c0145g3.f1011i != aVar && c0140b.f967b < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        m557i(c0140b);
    }

    /* renamed from: d */
    public C0140b m552d(C0145g c0145g, C0145g c0145g2, int i, int i2) {
        if (i2 == 8 && c0145g2.f1008f && c0145g.f1005c == -1) {
            c0145g.m576d(this, c0145g2.f1007e + i);
            return null;
        }
        C0140b c0140bM561m = m561m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0140bM561m.f967b = i;
        }
        if (z) {
            c0140bM561m.f969d.mo535j(c0145g, 1.0f);
            c0140bM561m.f969d.mo535j(c0145g2, -1.0f);
        } else {
            c0140bM561m.f969d.mo535j(c0145g, -1.0f);
            c0140bM561m.f969d.mo535j(c0145g2, 1.0f);
        }
        if (i2 != 8) {
            c0140bM561m.m539c(this, i2);
        }
        m551c(c0140bM561m);
        return c0140bM561m;
    }

    /* renamed from: e */
    public void m553e(C0145g c0145g, int i) {
        C0140b c0140bM561m;
        C0140b.a aVar;
        float f2;
        int i2 = c0145g.f1005c;
        if (i2 == -1) {
            c0145g.m576d(this, i);
            return;
        }
        if (i2 != -1) {
            C0140b c0140b = this.f983e[i2];
            if (!c0140b.f970e) {
                if (c0140b.f969d.mo536k() == 0) {
                    c0140b.f970e = true;
                } else {
                    c0140bM561m = m561m();
                    if (i < 0) {
                        c0140bM561m.f967b = i * (-1);
                        aVar = c0140bM561m.f969d;
                        f2 = 1.0f;
                    } else {
                        c0140bM561m.f967b = i;
                        aVar = c0140bM561m.f969d;
                        f2 = -1.0f;
                    }
                    aVar.mo535j(c0145g, f2);
                }
            }
            c0140b.f967b = i;
            return;
        }
        c0140bM561m = m561m();
        c0140bM561m.f966a = c0145g;
        float f3 = i;
        c0145g.f1007e = f3;
        c0140bM561m.f967b = f3;
        c0140bM561m.f970e = true;
        m551c(c0140bM561m);
    }

    /* renamed from: f */
    public void m554f(C0145g c0145g, C0145g c0145g2, int i, int i2) {
        C0140b c0140bM561m = m561m();
        C0145g c0145gM562n = m562n();
        c0145gM562n.f1006d = 0;
        c0140bM561m.m541e(c0145g, c0145g2, c0145gM562n, i);
        if (i2 != 8) {
            c0140bM561m.f969d.mo535j(m559k(i2, null), (int) (c0140bM561m.f969d.mo530e(c0145gM562n) * (-1.0f)));
        }
        m551c(c0140bM561m);
    }

    /* renamed from: g */
    public void m555g(C0145g c0145g, C0145g c0145g2, int i, int i2) {
        C0140b c0140bM561m = m561m();
        C0145g c0145gM562n = m562n();
        c0145gM562n.f1006d = 0;
        c0140bM561m.m542f(c0145g, c0145g2, c0145gM562n, i);
        if (i2 != 8) {
            c0140bM561m.f969d.mo535j(m559k(i2, null), (int) (c0140bM561m.f969d.mo530e(c0145gM562n) * (-1.0f)));
        }
        m551c(c0140bM561m);
    }

    /* renamed from: h */
    public void m556h(C0145g c0145g, C0145g c0145g2, C0145g c0145g3, C0145g c0145g4, float f2, int i) {
        C0140b c0140bM561m = m561m();
        c0140bM561m.m540d(c0145g, c0145g2, c0145g3, c0145g4, f2);
        if (i != 8) {
            c0140bM561m.m539c(this, i);
        }
        m551c(c0140bM561m);
    }

    /* renamed from: i */
    public final void m557i(C0140b c0140b) {
        C0143e<C0140b> c0143e;
        C0140b c0140b2;
        if (f976p) {
            C0140b[] c0140bArr = this.f983e;
            int i = this.f987i;
            if (c0140bArr[i] != null) {
                c0143e = this.f989k.f971a;
                c0140b2 = c0140bArr[i];
                c0143e.m570b(c0140b2);
            }
        } else {
            C0140b[] c0140bArr2 = this.f983e;
            int i2 = this.f987i;
            if (c0140bArr2[i2] != null) {
                c0143e = this.f989k.f972b;
                c0140b2 = c0140bArr2[i2];
                c0143e.m570b(c0140b2);
            }
        }
        C0140b[] c0140bArr3 = this.f983e;
        int i3 = this.f987i;
        c0140bArr3[i3] = c0140b;
        C0145g c0145g = c0140b.f966a;
        c0145g.f1005c = i3;
        this.f987i = i3 + 1;
        c0145g.m577e(c0140b);
    }

    /* renamed from: j */
    public final void m558j() {
        for (int i = 0; i < this.f987i; i++) {
            C0140b c0140b = this.f983e[i];
            c0140b.f966a.f1007e = c0140b.f967b;
        }
    }

    /* renamed from: k */
    public C0145g m559k(int i, String str) {
        if (this.f986h + 1 >= this.f982d) {
            m564p();
        }
        C0145g c0145gM549a = m549a(C0145g.a.ERROR, str);
        int i2 = this.f979a + 1;
        this.f979a = i2;
        this.f986h++;
        c0145gM549a.f1004b = i2;
        c0145gM549a.f1006d = i;
        this.f989k.f974d[i2] = c0145gM549a;
        this.f980b.mo537a(c0145gM549a);
        return c0145gM549a;
    }

    /* renamed from: l */
    public C0145g m560l(Object obj) {
        C0145g c0145g = null;
        if (obj == null) {
            return null;
        }
        if (this.f986h + 1 >= this.f982d) {
            m564p();
        }
        if (obj instanceof C0149c) {
            C0149c c0149c = (C0149c) obj;
            c0145g = c0149c.f1061g;
            if (c0145g == null) {
                c0149c.m588f();
                c0145g = c0149c.f1061g;
            }
            int i = c0145g.f1004b;
            if (i == -1 || i > this.f979a || this.f989k.f974d[i] == null) {
                if (i != -1) {
                    c0145g.m575c();
                }
                int i2 = this.f979a + 1;
                this.f979a = i2;
                this.f986h++;
                c0145g.f1004b = i2;
                c0145g.f1011i = C0145g.a.UNRESTRICTED;
                this.f989k.f974d[i2] = c0145g;
            }
        }
        return c0145g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r0
      0x0038: PHI (r0v6 a.f.b.b) = (r0v4 a.f.b.b), (r0v11 a.f.b.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000a.p022f.p025b.C0140b m561m() {
        /*
            r5 = this;
            boolean r0 = p000a.p022f.p025b.C0142d.f976p
            r1 = 1
            if (r0 == 0) goto L1f
            a.f.b.c r0 = r5.f989k
            a.f.b.e<a.f.b.b> r0 = r0.f971a
            java.lang.Object r0 = r0.m569a()
            a.f.b.b r0 = (p000a.p022f.p025b.C0140b) r0
            if (r0 != 0) goto L38
            a.f.b.d$b r0 = new a.f.b.d$b
            a.f.b.c r3 = r5.f989k
            r0.<init>(r5, r3)
            long r3 = p000a.p022f.p025b.C0142d.f978r
            long r3 = r3 + r1
            p000a.p022f.p025b.C0142d.f978r = r3
            goto L46
        L1f:
            a.f.b.c r0 = r5.f989k
            a.f.b.e<a.f.b.b> r0 = r0.f972b
            java.lang.Object r0 = r0.m569a()
            a.f.b.b r0 = (p000a.p022f.p025b.C0140b) r0
            if (r0 != 0) goto L38
            a.f.b.b r0 = new a.f.b.b
            a.f.b.c r3 = r5.f989k
            r0.<init>(r3)
            long r3 = p000a.p022f.p025b.C0142d.f977q
            long r3 = r3 + r1
            p000a.p022f.p025b.C0142d.f977q = r3
            goto L46
        L38:
            r1 = 0
            r0.f966a = r1
            a.f.b.b$a r1 = r0.f969d
            r1.clear()
            r1 = 0
            r0.f967b = r1
            r1 = 0
            r0.f970e = r1
        L46:
            int r1 = p000a.p022f.p025b.C0145g.f1002m
            int r1 = r1 + 1
            p000a.p022f.p025b.C0145g.f1002m = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.C0142d.m561m():a.f.b.b");
    }

    /* renamed from: n */
    public C0145g m562n() {
        if (this.f986h + 1 >= this.f982d) {
            m564p();
        }
        C0145g c0145gM549a = m549a(C0145g.a.SLACK, null);
        int i = this.f979a + 1;
        this.f979a = i;
        this.f986h++;
        c0145gM549a.f1004b = i;
        this.f989k.f974d[i] = c0145gM549a;
        return c0145gM549a;
    }

    /* renamed from: o */
    public int m563o(Object obj) {
        C0145g c0145g = ((C0149c) obj).f1061g;
        if (c0145g != null) {
            return (int) (c0145g.f1007e + 0.5f);
        }
        return 0;
    }

    /* renamed from: p */
    public final void m564p() {
        int i = this.f981c * 2;
        this.f981c = i;
        this.f983e = (C0140b[]) Arrays.copyOf(this.f983e, i);
        C0141c c0141c = this.f989k;
        c0141c.f974d = (C0145g[]) Arrays.copyOf(c0141c.f974d, this.f981c);
        int i2 = this.f981c;
        this.f985g = new boolean[i2];
        this.f982d = i2;
        this.f988j = i2;
    }

    /* renamed from: q */
    public void m565q(a aVar) {
        float f2;
        int i;
        boolean z;
        C0145g.a aVar2 = C0145g.a.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            i = 1;
            if (i2 >= this.f987i) {
                z = false;
                break;
            }
            C0140b[] c0140bArr = this.f983e;
            if (c0140bArr[i2].f966a.f1011i != aVar2 && c0140bArr[i2].f967b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f3 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f987i) {
                    C0140b c0140b = this.f983e[i6];
                    if (c0140b.f966a.f1011i != aVar2 && !c0140b.f970e && c0140b.f967b < f2) {
                        int i8 = i;
                        while (i8 < this.f986h) {
                            C0145g c0145g = this.f989k.f974d[i8];
                            float fMo530e = c0140b.f969d.mo530e(c0145g);
                            if (fMo530e > f2) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f4 = c0145g.f1009g[i9] / fMo530e;
                                    if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f3 = f4;
                                        i4 = i6;
                                        i5 = i8;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i6++;
                    f2 = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    C0140b c0140b2 = this.f983e[i4];
                    c0140b2.f966a.f1005c = -1;
                    c0140b2.m546j(this.f989k.f974d[i5]);
                    C0145g c0145g2 = c0140b2.f966a;
                    c0145g2.f1005c = i4;
                    c0145g2.m577e(c0140b2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f986h / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i = 1;
            }
        }
        m566r(aVar);
        m558j();
    }

    /* renamed from: r */
    public final int m566r(a aVar) {
        for (int i = 0; i < this.f986h; i++) {
            this.f985g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f986h * 2) {
                return i2;
            }
            C0145g c0145g = ((C0140b) aVar).f966a;
            if (c0145g != null) {
                this.f985g[c0145g.f1004b] = true;
            }
            C0145g c0145gMo538b = aVar.mo538b(this, this.f985g);
            if (c0145gMo538b != null) {
                boolean[] zArr = this.f985g;
                int i3 = c0145gMo538b.f1004b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c0145gMo538b != null) {
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f987i; i5++) {
                    C0140b c0140b = this.f983e[i5];
                    if (c0140b.f966a.f1011i != C0145g.a.UNRESTRICTED && !c0140b.f970e && c0140b.f969d.mo532g(c0145gMo538b)) {
                        float fMo530e = c0140b.f969d.mo530e(c0145gMo538b);
                        if (fMo530e < 0.0f) {
                            float f3 = (-c0140b.f967b) / fMo530e;
                            if (f3 < f2) {
                                i4 = i5;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0140b c0140b2 = this.f983e[i4];
                    c0140b2.f966a.f1005c = -1;
                    c0140b2.m546j(c0145gMo538b);
                    C0145g c0145g2 = c0140b2.f966a;
                    c0145g2.f1005c = i4;
                    c0145g2.m577e(c0140b2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    /* renamed from: s */
    public final void m567s() {
        int i = 0;
        if (f976p) {
            while (true) {
                C0140b[] c0140bArr = this.f983e;
                if (i >= c0140bArr.length) {
                    return;
                }
                C0140b c0140b = c0140bArr[i];
                if (c0140b != null) {
                    this.f989k.f971a.m570b(c0140b);
                }
                this.f983e[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0140b[] c0140bArr2 = this.f983e;
                if (i >= c0140bArr2.length) {
                    return;
                }
                C0140b c0140b2 = c0140bArr2[i];
                if (c0140b2 != null) {
                    this.f989k.f972b.m570b(c0140b2);
                }
                this.f983e[i] = null;
                i++;
            }
        }
    }

    /* renamed from: t */
    public void m568t() {
        C0141c c0141c;
        int i = 0;
        while (true) {
            c0141c = this.f989k;
            C0145g[] c0145gArr = c0141c.f974d;
            if (i >= c0145gArr.length) {
                break;
            }
            C0145g c0145g = c0145gArr[i];
            if (c0145g != null) {
                c0145g.m575c();
            }
            i++;
        }
        C0143e<C0145g> c0143e = c0141c.f973c;
        C0145g[] c0145gArr2 = this.f990l;
        int length = this.f991m;
        Objects.requireNonNull(c0143e);
        if (length > c0145gArr2.length) {
            length = c0145gArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0145g c0145g2 = c0145gArr2[i2];
            int i3 = c0143e.f994b;
            Object[] objArr = c0143e.f993a;
            if (i3 < objArr.length) {
                objArr[i3] = c0145g2;
                c0143e.f994b = i3 + 1;
            }
        }
        this.f991m = 0;
        Arrays.fill(this.f989k.f974d, (Object) null);
        this.f979a = 0;
        this.f980b.clear();
        this.f986h = 1;
        for (int i4 = 0; i4 < this.f987i; i4++) {
            Objects.requireNonNull(this.f983e[i4]);
        }
        m567s();
        this.f987i = 0;
        this.f992n = f976p ? new b(this, this.f989k) : new C0140b(this.f989k);
    }
}
