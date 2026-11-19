package p000a.p022f.p025b;

import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.Arrays;
import p000a.p022f.p025b.C0140b;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.a */
/* loaded from: classes.dex */
public class C0139a implements C0140b.a {

    /* renamed from: b */
    public final C0140b f957b;

    /* renamed from: c */
    public final C0141c f958c;

    /* renamed from: a */
    public int f956a = 0;

    /* renamed from: d */
    public int f959d = 8;

    /* renamed from: e */
    public int[] f960e = new int[8];

    /* renamed from: f */
    public int[] f961f = new int[8];

    /* renamed from: g */
    public float[] f962g = new float[8];

    /* renamed from: h */
    public int f963h = -1;

    /* renamed from: i */
    public int f964i = -1;

    /* renamed from: j */
    public boolean f965j = false;

    public C0139a(C0140b c0140b, C0141c c0141c) {
        this.f957b = c0140b;
        this.f958c = c0141c;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: a */
    public float mo526a(int i) {
        int i2 = this.f963h;
        for (int i3 = 0; i2 != -1 && i3 < this.f956a; i3++) {
            if (i3 == i) {
                return this.f962g[i2];
            }
            i2 = this.f961f[i2];
        }
        return 0.0f;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: b */
    public final float mo527b(C0145g c0145g, boolean z) {
        int i = this.f963h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f956a) {
            if (this.f960e[i] == c0145g.f1004b) {
                if (i == this.f963h) {
                    this.f963h = this.f961f[i];
                } else {
                    int[] iArr = this.f961f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0145g.m574b(this.f957b);
                }
                c0145g.f1014l--;
                this.f956a--;
                this.f960e[i] = -1;
                if (this.f965j) {
                    this.f964i = i;
                }
                return this.f962g[i];
            }
            i2++;
            i3 = i;
            i = this.f961f[i];
        }
        return 0.0f;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: c */
    public void mo528c(C0145g c0145g, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f963h;
            if (i == -1) {
                this.f963h = 0;
                this.f962g[0] = f2;
                this.f960e[0] = c0145g.f1004b;
                this.f961f[0] = -1;
                c0145g.f1014l++;
                c0145g.m573a(this.f957b);
                this.f956a++;
                if (this.f965j) {
                    return;
                }
                int i2 = this.f964i + 1;
                this.f964i = i2;
                int[] iArr = this.f960e;
                if (i2 >= iArr.length) {
                    this.f965j = true;
                    this.f964i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f956a; i4++) {
                int[] iArr2 = this.f960e;
                int i5 = iArr2[i];
                int i6 = c0145g.f1004b;
                if (i5 == i6) {
                    float[] fArr = this.f962g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f963h) {
                            this.f963h = this.f961f[i];
                        } else {
                            int[] iArr3 = this.f961f;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            c0145g.m574b(this.f957b);
                        }
                        if (this.f965j) {
                            this.f964i = i;
                        }
                        c0145g.f1014l--;
                        this.f956a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f961f[i];
            }
            int length = this.f964i;
            int i7 = length + 1;
            if (this.f965j) {
                int[] iArr4 = this.f960e;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i7;
            }
            int[] iArr5 = this.f960e;
            if (length >= iArr5.length && this.f956a < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.f960e;
                    if (i8 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr7 = this.f960e;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i9 = this.f959d * 2;
                this.f959d = i9;
                this.f965j = false;
                this.f964i = length - 1;
                this.f962g = Arrays.copyOf(this.f962g, i9);
                this.f960e = Arrays.copyOf(this.f960e, this.f959d);
                this.f961f = Arrays.copyOf(this.f961f, this.f959d);
            }
            this.f960e[length] = c0145g.f1004b;
            this.f962g[length] = f2;
            int[] iArr8 = this.f961f;
            if (i3 != -1) {
                iArr8[length] = iArr8[i3];
                iArr8[i3] = length;
            } else {
                iArr8[length] = this.f963h;
                this.f963h = length;
            }
            c0145g.f1014l++;
            c0145g.m573a(this.f957b);
            this.f956a++;
            if (!this.f965j) {
                this.f964i++;
            }
            int i10 = this.f964i;
            int[] iArr9 = this.f960e;
            if (i10 >= iArr9.length) {
                this.f965j = true;
                this.f964i = iArr9.length - 1;
            }
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    public final void clear() {
        int i = this.f963h;
        for (int i2 = 0; i != -1 && i2 < this.f956a; i2++) {
            C0145g c0145g = this.f958c.f974d[this.f960e[i]];
            if (c0145g != null) {
                c0145g.m574b(this.f957b);
            }
            i = this.f961f[i];
        }
        this.f963h = -1;
        this.f964i = -1;
        this.f965j = false;
        this.f956a = 0;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: d */
    public C0145g mo529d(int i) {
        int i2 = this.f963h;
        for (int i3 = 0; i2 != -1 && i3 < this.f956a; i3++) {
            if (i3 == i) {
                return this.f958c.f974d[this.f960e[i2]];
            }
            i2 = this.f961f[i2];
        }
        return null;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: e */
    public final float mo530e(C0145g c0145g) {
        int i = this.f963h;
        for (int i2 = 0; i != -1 && i2 < this.f956a; i2++) {
            if (this.f960e[i] == c0145g.f1004b) {
                return this.f962g[i];
            }
            i = this.f961f[i];
        }
        return 0.0f;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: f */
    public float mo531f(C0140b c0140b, boolean z) {
        float fMo530e = mo530e(c0140b.f966a);
        mo527b(c0140b.f966a, z);
        C0140b.a aVar = c0140b.f969d;
        int iMo536k = aVar.mo536k();
        for (int i = 0; i < iMo536k; i++) {
            C0145g c0145gMo529d = aVar.mo529d(i);
            mo528c(c0145gMo529d, aVar.mo530e(c0145gMo529d) * fMo530e, z);
        }
        return fMo530e;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: g */
    public boolean mo532g(C0145g c0145g) {
        int i = this.f963h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f956a; i2++) {
            if (this.f960e[i] == c0145g.f1004b) {
                return true;
            }
            i = this.f961f[i];
        }
        return false;
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: h */
    public void mo533h(float f2) {
        int i = this.f963h;
        for (int i2 = 0; i != -1 && i2 < this.f956a; i2++) {
            float[] fArr = this.f962g;
            fArr[i] = fArr[i] / f2;
            i = this.f961f[i];
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: i */
    public void mo534i() {
        int i = this.f963h;
        for (int i2 = 0; i != -1 && i2 < this.f956a; i2++) {
            float[] fArr = this.f962g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f961f[i];
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: j */
    public final void mo535j(C0145g c0145g, float f2) {
        if (f2 == 0.0f) {
            mo527b(c0145g, true);
            return;
        }
        int i = this.f963h;
        if (i == -1) {
            this.f963h = 0;
            this.f962g[0] = f2;
            this.f960e[0] = c0145g.f1004b;
            this.f961f[0] = -1;
            c0145g.f1014l++;
            c0145g.m573a(this.f957b);
            this.f956a++;
            if (this.f965j) {
                return;
            }
            int i2 = this.f964i + 1;
            this.f964i = i2;
            int[] iArr = this.f960e;
            if (i2 >= iArr.length) {
                this.f965j = true;
                this.f964i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f956a; i4++) {
            int[] iArr2 = this.f960e;
            int i5 = iArr2[i];
            int i6 = c0145g.f1004b;
            if (i5 == i6) {
                this.f962g[i] = f2;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f961f[i];
        }
        int length = this.f964i;
        int i7 = length + 1;
        if (this.f965j) {
            int[] iArr3 = this.f960e;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f960e;
        if (length >= iArr4.length && this.f956a < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f960e;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.f960e;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f959d * 2;
            this.f959d = i9;
            this.f965j = false;
            this.f964i = length - 1;
            this.f962g = Arrays.copyOf(this.f962g, i9);
            this.f960e = Arrays.copyOf(this.f960e, this.f959d);
            this.f961f = Arrays.copyOf(this.f961f, this.f959d);
        }
        this.f960e[length] = c0145g.f1004b;
        this.f962g[length] = f2;
        int[] iArr7 = this.f961f;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.f963h;
            this.f963h = length;
        }
        c0145g.f1014l++;
        c0145g.m573a(this.f957b);
        int i10 = this.f956a + 1;
        this.f956a = i10;
        if (!this.f965j) {
            this.f964i++;
        }
        int[] iArr8 = this.f960e;
        if (i10 >= iArr8.length) {
            this.f965j = true;
        }
        if (this.f964i >= iArr8.length) {
            this.f965j = true;
            this.f964i = iArr8.length - 1;
        }
    }

    @Override // p000a.p022f.p025b.C0140b.a
    /* renamed from: k */
    public int mo536k() {
        return this.f956a;
    }

    public String toString() {
        int i = this.f963h;
        String string = BuildConfig.FLAVOR;
        for (int i2 = 0; i != -1 && i2 < this.f956a; i2++) {
            StringBuilder sbM2079g = C0561a.m2079g(C0561a.m2076d(string, " -> "));
            sbM2079g.append(this.f962g[i]);
            sbM2079g.append(" : ");
            StringBuilder sbM2079g2 = C0561a.m2079g(sbM2079g.toString());
            sbM2079g2.append(this.f958c.f974d[this.f960e[i]]);
            string = sbM2079g2.toString();
            i = this.f961f[i];
        }
        return string;
    }
}
