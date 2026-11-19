package p000a.p022f.p025b;

import java.util.Arrays;
import p000a.p022f.p025b.C0140b;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.h */
/* loaded from: classes.dex */
public class C0146h implements C0140b.a {

    /* renamed from: a */
    public int f1021a = 16;

    /* renamed from: b */
    public int[] f1022b = new int[16];

    /* renamed from: c */
    public int[] f1023c = new int[16];

    /* renamed from: d */
    public int[] f1024d = new int[16];

    /* renamed from: e */
    public float[] f1025e = new float[16];

    /* renamed from: f */
    public int[] f1026f = new int[16];

    /* renamed from: g */
    public int[] f1027g = new int[16];

    /* renamed from: h */
    public int f1028h = 0;

    /* renamed from: i */
    public int f1029i = -1;

    /* renamed from: j */
    public final C0140b f1030j;

    /* renamed from: k */
    public final C0141c f1031k;

    public C0146h(C0140b c0140b, C0141c c0141c) {
        this.f1030j = c0140b;
        this.f1031k = c0141c;
        clear();
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: a */
    public float mo526a(int i) {
        int i2 = this.f1028h;
        int i3 = this.f1029i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f1025e[i3];
            }
            i3 = this.f1027g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: b */
    public float mo527b(C0145g c0145g, boolean z) {
        int[] iArr;
        int iM580n = m580n(c0145g);
        if (iM580n == -1) {
            return 0.0f;
        }
        int i = c0145g.f1004b;
        int i2 = i % 16;
        int[] iArr2 = this.f1022b;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f1024d[i3] == i) {
                int[] iArr3 = this.f1023c;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
            } else {
                while (true) {
                    iArr = this.f1023c;
                    if (iArr[i3] == -1 || this.f1024d[iArr[i3]] == i) {
                        break;
                    }
                    i3 = iArr[i3];
                }
                int i4 = iArr[i3];
                if (i4 != -1 && this.f1024d[i4] == i) {
                    iArr[i3] = iArr[i4];
                    iArr[i4] = -1;
                }
            }
        }
        float f2 = this.f1025e[iM580n];
        if (this.f1029i == iM580n) {
            this.f1029i = this.f1027g[iM580n];
        }
        this.f1024d[iM580n] = -1;
        int[] iArr4 = this.f1026f;
        if (iArr4[iM580n] != -1) {
            int[] iArr5 = this.f1027g;
            iArr5[iArr4[iM580n]] = iArr5[iM580n];
        }
        int[] iArr6 = this.f1027g;
        if (iArr6[iM580n] != -1) {
            iArr4[iArr6[iM580n]] = iArr4[iM580n];
        }
        this.f1028h--;
        c0145g.f1014l--;
        if (z) {
            c0145g.m574b(this.f1030j);
        }
        return f2;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: c */
    public void mo528c(C0145g c0145g, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int iM580n = m580n(c0145g);
            if (iM580n == -1) {
                mo535j(c0145g, f2);
                return;
            }
            float[] fArr = this.f1025e;
            fArr[iM580n] = fArr[iM580n] + f2;
            if (fArr[iM580n] <= -0.001f || fArr[iM580n] >= 0.001f) {
                return;
            }
            fArr[iM580n] = 0.0f;
            mo527b(c0145g, z);
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    public void clear() {
        int i = this.f1028h;
        for (int i2 = 0; i2 < i; i2++) {
            C0145g c0145gMo529d = mo529d(i2);
            if (c0145gMo529d != null) {
                c0145gMo529d.m574b(this.f1030j);
            }
        }
        for (int i3 = 0; i3 < this.f1021a; i3++) {
            this.f1024d[i3] = -1;
            this.f1023c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f1022b[i4] = -1;
        }
        this.f1028h = 0;
        this.f1029i = -1;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: d */
    public C0145g mo529d(int i) {
        int i2 = this.f1028h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f1029i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f1031k.f974d[this.f1024d[i3]];
            }
            i3 = this.f1027g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: e */
    public float mo530e(C0145g c0145g) {
        int iM580n = m580n(c0145g);
        if (iM580n != -1) {
            return this.f1025e[iM580n];
        }
        return 0.0f;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: f */
    public float mo531f(C0140b c0140b, boolean z) {
        float fMo530e = mo530e(c0140b.f966a);
        mo527b(c0140b.f966a, z);
        C0146h c0146h = (C0146h) c0140b.f969d;
        int i = c0146h.f1028h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = c0146h.f1024d;
            if (iArr[i3] != -1) {
                mo528c(this.f1031k.f974d[iArr[i3]], c0146h.f1025e[i3] * fMo530e, z);
                i2++;
            }
            i3++;
        }
        return fMo530e;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: g */
    public boolean mo532g(C0145g c0145g) {
        return m580n(c0145g) != -1;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: h */
    public void mo533h(float f2) {
        int i = this.f1028h;
        int i2 = this.f1029i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f1025e;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f1027g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: i */
    public void mo534i() {
        int i = this.f1028h;
        int i2 = this.f1029i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f1025e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f1027g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: j */
    public void mo535j(C0145g c0145g, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            mo527b(c0145g, true);
            return;
        }
        int i = 0;
        if (this.f1028h == 0) {
            m579m(0, c0145g, f2);
            m578l(c0145g, 0);
            this.f1029i = 0;
            return;
        }
        int iM580n = m580n(c0145g);
        if (iM580n != -1) {
            this.f1025e[iM580n] = f2;
            return;
        }
        int i2 = this.f1028h + 1;
        int i3 = this.f1021a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f1024d = Arrays.copyOf(this.f1024d, i4);
            this.f1025e = Arrays.copyOf(this.f1025e, i4);
            this.f1026f = Arrays.copyOf(this.f1026f, i4);
            this.f1027g = Arrays.copyOf(this.f1027g, i4);
            this.f1023c = Arrays.copyOf(this.f1023c, i4);
            for (int i5 = this.f1021a; i5 < i4; i5++) {
                this.f1024d[i5] = -1;
                this.f1023c[i5] = -1;
            }
            this.f1021a = i4;
        }
        int i6 = this.f1028h;
        int i7 = this.f1029i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int[] iArr = this.f1024d;
            int i10 = iArr[i7];
            int i11 = c0145g.f1004b;
            if (i10 == i11) {
                this.f1025e[i7] = f2;
                return;
            }
            if (iArr[i7] < i11) {
                i8 = i7;
            }
            i7 = this.f1027g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f1021a) {
                i = -1;
                break;
            } else if (this.f1024d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m579m(i, c0145g, f2);
        int[] iArr2 = this.f1026f;
        if (i8 != -1) {
            iArr2[i] = i8;
            int[] iArr3 = this.f1027g;
            iArr3[i] = iArr3[i8];
            iArr3[i8] = i;
        } else {
            iArr2[i] = -1;
            if (this.f1028h > 0) {
                this.f1027g[i] = this.f1029i;
                this.f1029i = i;
            } else {
                this.f1027g[i] = -1;
            }
        }
        int[] iArr4 = this.f1027g;
        if (iArr4[i] != -1) {
            this.f1026f[iArr4[i]] = i;
        }
        m578l(c0145g, i);
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: k */
    public int mo536k() {
        return this.f1028h;
    }

    /* renamed from: l */
    public final void m578l(C0145g c0145g, int i) {
        int[] iArr;
        int i2 = c0145g.f1004b % 16;
        int[] iArr2 = this.f1022b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f1023c;
                if (iArr[i3] == -1) {
                    break;
                } else {
                    i3 = iArr[i3];
                }
            }
            iArr[i3] = i;
        }
        this.f1023c[i] = -1;
    }

    /* renamed from: m */
    public final void m579m(int i, C0145g c0145g, float f2) {
        this.f1024d[i] = c0145g.f1004b;
        this.f1025e[i] = f2;
        this.f1026f[i] = -1;
        this.f1027g[i] = -1;
        c0145g.m573a(this.f1030j);
        c0145g.f1014l++;
        this.f1028h++;
    }

    /* renamed from: n */
    public int m580n(C0145g c0145g) {
        int[] iArr;
        if (this.f1028h == 0) {
            return -1;
        }
        int i = c0145g.f1004b;
        int i2 = this.f1022b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.f1024d[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.f1023c;
            if (iArr[i2] == -1 || this.f1024d[iArr[i2]] == i) {
                break;
            }
            i2 = iArr[i2];
        }
        if (iArr[i2] != -1 && this.f1024d[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sbM2079g;
        String strM2076d;
        String strM2076d2 = hashCode() + " { ";
        int i = this.f1028h;
        for (int i2 = 0; i2 < i; i2++) {
            C0145g c0145gMo529d = mo529d(i2);
            if (c0145gMo529d != null) {
                String str = strM2076d2 + c0145gMo529d + " = " + mo526a(i2) + " ";
                int iM580n = m580n(c0145gMo529d);
                String strM2076d3 = C0561a.m2076d(str, "[p: ");
                if (this.f1026f[iM580n] != -1) {
                    sbM2079g = C0561a.m2079g(strM2076d3);
                    sbM2079g.append(this.f1031k.f974d[this.f1024d[this.f1026f[iM580n]]]);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM2076d3);
                    sb.append("none");
                    sbM2079g = sb;
                }
                String strM2076d4 = C0561a.m2076d(sbM2079g.toString(), ", n: ");
                if (this.f1027g[iM580n] != -1) {
                    StringBuilder sbM2079g2 = C0561a.m2079g(strM2076d4);
                    sbM2079g2.append(this.f1031k.f974d[this.f1024d[this.f1027g[iM580n]]]);
                    strM2076d = sbM2079g2.toString();
                } else {
                    strM2076d = C0561a.m2076d(strM2076d4, "none");
                }
                strM2076d2 = C0561a.m2076d(strM2076d, "]");
            }
        }
        return C0561a.m2076d(strM2076d2, " }");
    }
}
