package p000a.p022f.p025b;

import java.util.ArrayList;
import p000a.p022f.p025b.C0142d;
import p000a.p022f.p025b.C0145g;

/* renamed from: a.f.b.b */
/* loaded from: classes.dex */
public class C0140b implements C0142d.a {

    /* renamed from: d */
    public a f969d;

    /* renamed from: a */
    public C0145g f966a = null;

    /* renamed from: b */
    public float f967b = 0.0f;

    /* renamed from: c */
    public ArrayList<C0145g> f968c = new ArrayList<>();

    /* renamed from: e */
    public boolean f970e = false;

    /* renamed from: a.f.b.b$a */
    public interface a {
        /* renamed from: a */
        float mo526a(int i);

        /* renamed from: b */
        float mo527b(C0145g c0145g, boolean z);

        /* renamed from: c */
        void mo528c(C0145g c0145g, float f2, boolean z);

        void clear();

        /* renamed from: d */
        C0145g mo529d(int i);

        /* renamed from: e */
        float mo530e(C0145g c0145g);

        /* renamed from: f */
        float mo531f(C0140b c0140b, boolean z);

        /* renamed from: g */
        boolean mo532g(C0145g c0145g);

        /* renamed from: h */
        void mo533h(float f2);

        /* renamed from: i */
        void mo534i();

        /* renamed from: j */
        void mo535j(C0145g c0145g, float f2);

        /* renamed from: k */
        int mo536k();
    }

    public C0140b() {
    }

    public C0140b(C0141c c0141c) {
        this.f969d = new C0139a(this, c0141c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    @Override // p000a.p022f.p025b.C0142d.a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo537a(p000a.p022f.p025b.C0145g r3) {
        /*
            r2 = this;
            int r0 = r3.f1006d
            r1 = 1
            if (r0 != r1) goto L6
            goto L21
        L6:
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 1148846080(0x447a0000, float:1000.0)
            goto L23
        Lc:
            r1 = 3
            if (r0 != r1) goto L13
            r0 = 1232348160(0x49742400, float:1000000.0)
            goto L23
        L13:
            r1 = 4
            if (r0 != r1) goto L1a
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L23
        L1a:
            r1 = 5
            if (r0 != r1) goto L21
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            goto L23
        L21:
            r0 = 1065353216(0x3f800000, float:1.0)
        L23:
            a.f.b.b$a r1 = r2.f969d
            r1.mo535j(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.C0140b.mo537a(a.f.b.g):void");
    }

    @Override // p000a.p022f.p025b.C0142d.a
    /* renamed from: b */
    public C0145g mo538b(C0142d c0142d, boolean[] zArr) {
        return m545i(zArr, null);
    }

    /* renamed from: c */
    public C0140b m539c(C0142d c0142d, int i) {
        this.f969d.mo535j(c0142d.m559k(i, "ep"), 1.0f);
        this.f969d.mo535j(c0142d.m559k(i, "em"), -1.0f);
        return this;
    }

    @Override // p000a.p022f.p025b.C0142d.a
    public void clear() {
        this.f969d.clear();
        this.f966a = null;
        this.f967b = 0.0f;
    }

    /* renamed from: d */
    public C0140b m540d(C0145g c0145g, C0145g c0145g2, C0145g c0145g3, C0145g c0145g4, float f2) {
        this.f969d.mo535j(c0145g, -1.0f);
        this.f969d.mo535j(c0145g2, 1.0f);
        this.f969d.mo535j(c0145g3, f2);
        this.f969d.mo535j(c0145g4, -f2);
        return this;
    }

    /* renamed from: e */
    public C0140b m541e(C0145g c0145g, C0145g c0145g2, C0145g c0145g3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f967b = i;
        }
        if (z) {
            this.f969d.mo535j(c0145g, 1.0f);
            this.f969d.mo535j(c0145g2, -1.0f);
            this.f969d.mo535j(c0145g3, -1.0f);
        } else {
            this.f969d.mo535j(c0145g, -1.0f);
            this.f969d.mo535j(c0145g2, 1.0f);
            this.f969d.mo535j(c0145g3, 1.0f);
        }
        return this;
    }

    /* renamed from: f */
    public C0140b m542f(C0145g c0145g, C0145g c0145g2, C0145g c0145g3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f967b = i;
        }
        if (z) {
            this.f969d.mo535j(c0145g, 1.0f);
            this.f969d.mo535j(c0145g2, -1.0f);
            this.f969d.mo535j(c0145g3, 1.0f);
        } else {
            this.f969d.mo535j(c0145g, -1.0f);
            this.f969d.mo535j(c0145g2, 1.0f);
            this.f969d.mo535j(c0145g3, -1.0f);
        }
        return this;
    }

    /* renamed from: g */
    public C0140b m543g(C0145g c0145g, C0145g c0145g2, C0145g c0145g3, C0145g c0145g4, float f2) {
        this.f969d.mo535j(c0145g3, 0.5f);
        this.f969d.mo535j(c0145g4, 0.5f);
        this.f969d.mo535j(c0145g, -0.5f);
        this.f969d.mo535j(c0145g2, -0.5f);
        this.f967b = -f2;
        return this;
    }

    /* renamed from: h */
    public final boolean m544h(C0145g c0145g) {
        return c0145g.f1014l <= 1;
    }

    /* renamed from: i */
    public final C0145g m545i(boolean[] zArr, C0145g c0145g) {
        C0145g.a aVar;
        int iMo536k = this.f969d.mo536k();
        C0145g c0145g2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < iMo536k; i++) {
            float fMo526a = this.f969d.mo526a(i);
            if (fMo526a < 0.0f) {
                C0145g c0145gMo529d = this.f969d.mo529d(i);
                if ((zArr == null || !zArr[c0145gMo529d.f1004b]) && c0145gMo529d != c0145g && (((aVar = c0145gMo529d.f1011i) == C0145g.a.SLACK || aVar == C0145g.a.ERROR) && fMo526a < f2)) {
                    f2 = fMo526a;
                    c0145g2 = c0145gMo529d;
                }
            }
        }
        return c0145g2;
    }

    /* renamed from: j */
    public void m546j(C0145g c0145g) {
        C0145g c0145g2 = this.f966a;
        if (c0145g2 != null) {
            this.f969d.mo535j(c0145g2, -1.0f);
            this.f966a = null;
        }
        float fMo527b = this.f969d.mo527b(c0145g, true) * (-1.0f);
        this.f966a = c0145g;
        if (fMo527b == 1.0f) {
            return;
        }
        this.f967b /= fMo527b;
        this.f969d.mo533h(fMo527b);
    }

    /* renamed from: k */
    public void m547k(C0145g c0145g, boolean z) {
        if (c0145g.f1008f) {
            float fMo530e = this.f969d.mo530e(c0145g);
            this.f967b = (c0145g.f1007e * fMo530e) + this.f967b;
            this.f969d.mo527b(c0145g, z);
            if (z) {
                c0145g.m574b(this);
            }
        }
    }

    /* renamed from: l */
    public void mo548l(C0140b c0140b, boolean z) {
        float fMo531f = this.f969d.mo531f(c0140b, z);
        this.f967b = (c0140b.f967b * fMo531f) + this.f967b;
        if (z) {
            c0140b.f966a.m574b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            a.f.b.g r0 = r10.f966a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
            a.f.b.g r1 = r10.f966a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = p070b.p071a.p072a.p073a.C0561a.m2076d(r0, r1)
            float r1 = r10.f967b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
            float r1 = r10.f967b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            a.f.b.b$a r5 = r10.f969d
            int r5 = r5.mo536k()
        L3b:
            if (r3 >= r5) goto La5
            a.f.b.b$a r6 = r10.f969d
            a.f.b.g r6 = r6.mo529d(r3)
            if (r6 != 0) goto L46
            goto La2
        L46:
            a.f.b.b$a r7 = r10.f969d
            float r7 = r7.mo526a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto La2
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
            java.lang.String r1 = "- "
            goto L76
        L64:
            java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L74:
            java.lang.String r1 = " - "
        L76:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L97:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        La2:
            int r3 = r3 + 1
            goto L3b
        La5:
            if (r1 != 0) goto Lad
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p070b.p071a.p072a.p073a.C0561a.m2076d(r0, r1)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.C0140b.toString():java.lang.String");
    }
}
