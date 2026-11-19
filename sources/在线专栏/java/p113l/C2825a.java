package p113l;

import java.util.Arrays;

/* renamed from: l.a */
/* loaded from: classes.dex */
class C2825a extends AbstractC2826b {

    /* renamed from: a */
    private final double[] f10854a;

    /* renamed from: b */
    a[] f10855b;

    /* renamed from: l.a$a */
    private static class a {

        /* renamed from: s */
        private static double[] f10856s = new double[91];

        /* renamed from: a */
        double[] f10857a;

        /* renamed from: b */
        double f10858b;

        /* renamed from: c */
        double f10859c;

        /* renamed from: d */
        double f10860d;

        /* renamed from: e */
        double f10861e;

        /* renamed from: f */
        double f10862f;

        /* renamed from: g */
        double f10863g;

        /* renamed from: h */
        double f10864h;

        /* renamed from: i */
        double f10865i;

        /* renamed from: j */
        double f10866j;

        /* renamed from: k */
        double f10867k;

        /* renamed from: l */
        double f10868l;

        /* renamed from: m */
        double f10869m;

        /* renamed from: n */
        double f10870n;

        /* renamed from: o */
        double f10871o;

        /* renamed from: p */
        double f10872p;

        /* renamed from: q */
        boolean f10873q;

        /* renamed from: r */
        boolean f10874r;

        a(int i4, double d4, double d5, double d6, double d7, double d8, double d9) {
            this.f10874r = false;
            this.f10873q = i4 == 1;
            this.f10859c = d4;
            this.f10860d = d5;
            this.f10865i = 1.0d / (d5 - d4);
            if (3 == i4) {
                this.f10874r = true;
            }
            double d10 = d8 - d6;
            double d11 = d9 - d7;
            if (!this.f10874r && Math.abs(d10) >= 0.001d && Math.abs(d11) >= 0.001d) {
                this.f10857a = new double[101];
                boolean z3 = this.f10873q;
                this.f10866j = d10 * (z3 ? -1 : 1);
                this.f10867k = d11 * (z3 ? 1 : -1);
                this.f10868l = z3 ? d8 : d6;
                this.f10869m = z3 ? d7 : d9;
                m9441a(d6, d7, d8, d9);
                this.f10870n = this.f10858b * this.f10865i;
                return;
            }
            this.f10874r = true;
            this.f10861e = d6;
            this.f10862f = d8;
            this.f10863g = d7;
            this.f10864h = d9;
            double dHypot = Math.hypot(d11, d10);
            this.f10858b = dHypot;
            this.f10870n = dHypot * this.f10865i;
            double d12 = this.f10860d;
            double d13 = this.f10859c;
            this.f10868l = d10 / (d12 - d13);
            this.f10869m = d11 / (d12 - d13);
        }

        /* renamed from: a */
        private void m9441a(double d4, double d5, double d6, double d7) {
            double dHypot;
            double d8 = d6 - d4;
            double d9 = d5 - d7;
            int i4 = 0;
            double d10 = 0.0d;
            double d11 = 0.0d;
            double d12 = 0.0d;
            while (true) {
                if (i4 >= f10856s.length) {
                    break;
                }
                double d13 = d10;
                double radians = Math.toRadians((i4 * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d8;
                double dCos = Math.cos(radians) * d9;
                if (i4 > 0) {
                    dHypot = Math.hypot(dSin - d11, dCos - d12) + d13;
                    f10856s[i4] = dHypot;
                } else {
                    dHypot = d13;
                }
                i4++;
                d12 = dCos;
                d10 = dHypot;
                d11 = dSin;
            }
            double d14 = d10;
            this.f10858b = d14;
            int i5 = 0;
            while (true) {
                double[] dArr = f10856s;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] / d14;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= this.f10857a.length) {
                    return;
                }
                double length = i6 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(f10856s, length);
                if (iBinarySearch >= 0) {
                    this.f10857a[i6] = iBinarySearch / (f10856s.length - 1);
                } else if (iBinarySearch == -1) {
                    this.f10857a[i6] = 0.0d;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    double[] dArr2 = f10856s;
                    this.f10857a[i6] = (i8 + ((length - dArr2[i8]) / (dArr2[i7 - 1] - dArr2[i8]))) / (dArr2.length - 1);
                }
                i6++;
            }
        }

        /* renamed from: b */
        double m9442b() {
            double d4 = this.f10866j * this.f10872p;
            double dHypot = this.f10870n / Math.hypot(d4, (-this.f10867k) * this.f10871o);
            if (this.f10873q) {
                d4 = -d4;
            }
            return d4 * dHypot;
        }

        /* renamed from: c */
        double m9443c() {
            double d4 = this.f10866j * this.f10872p;
            double d5 = (-this.f10867k) * this.f10871o;
            double dHypot = this.f10870n / Math.hypot(d4, d5);
            return this.f10873q ? (-d5) * dHypot : d5 * dHypot;
        }

        /* renamed from: d */
        public double m9444d(double d4) {
            return this.f10868l;
        }

        /* renamed from: e */
        public double m9445e(double d4) {
            return this.f10869m;
        }

        /* renamed from: f */
        public double m9446f(double d4) {
            double d5 = (d4 - this.f10859c) * this.f10865i;
            double d6 = this.f10861e;
            return d6 + (d5 * (this.f10862f - d6));
        }

        /* renamed from: g */
        public double m9447g(double d4) {
            double d5 = (d4 - this.f10859c) * this.f10865i;
            double d6 = this.f10863g;
            return d6 + (d5 * (this.f10864h - d6));
        }

        /* renamed from: h */
        double m9448h() {
            return this.f10868l + (this.f10866j * this.f10871o);
        }

        /* renamed from: i */
        double m9449i() {
            return this.f10869m + (this.f10867k * this.f10872p);
        }

        /* renamed from: j */
        double m9450j(double d4) {
            if (d4 <= 0.0d) {
                return 0.0d;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f10857a;
            double length = d4 * (dArr.length - 1);
            int i4 = (int) length;
            return dArr[i4] + ((length - i4) * (dArr[i4 + 1] - dArr[i4]));
        }

        /* renamed from: k */
        void m9451k(double d4) {
            double dM9450j = m9450j((this.f10873q ? this.f10860d - d4 : d4 - this.f10859c) * this.f10865i) * 1.5707963267948966d;
            this.f10871o = Math.sin(dM9450j);
            this.f10872p = Math.cos(dM9450j);
        }
    }

    public C2825a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f10854a = dArr;
        this.f10855b = new a[dArr.length - 1];
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (true) {
            a[] aVarArr = this.f10855b;
            if (i4 >= aVarArr.length) {
                return;
            }
            int i7 = iArr[i4];
            if (i7 == 0) {
                i6 = 3;
            } else if (i7 == 1) {
                i5 = 1;
                i6 = 1;
            } else if (i7 == 2) {
                i5 = 2;
                i6 = 2;
            } else if (i7 == 3) {
                i5 = i5 == 1 ? 2 : 1;
                i6 = i5;
            }
            int i8 = i4 + 1;
            aVarArr[i4] = new a(i6, dArr[i4], dArr[i8], dArr2[i4][0], dArr2[i4][1], dArr2[i8][0], dArr2[i8][1]);
            i4 = i8;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: c */
    public double mo9435c(double d4, int i4) {
        a[] aVarArr = this.f10855b;
        int i5 = 0;
        if (d4 < aVarArr[0].f10859c) {
            d4 = aVarArr[0].f10859c;
        } else if (d4 > aVarArr[aVarArr.length - 1].f10860d) {
            d4 = aVarArr[aVarArr.length - 1].f10860d;
        }
        while (true) {
            a[] aVarArr2 = this.f10855b;
            if (i5 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d4 <= aVarArr2[i5].f10860d) {
                if (aVarArr2[i5].f10874r) {
                    return i4 == 0 ? aVarArr2[i5].m9446f(d4) : aVarArr2[i5].m9447g(d4);
                }
                aVarArr2[i5].m9451k(d4);
                return i4 == 0 ? this.f10855b[i5].m9448h() : this.f10855b[i5].m9449i();
            }
            i5++;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: d */
    public void mo9436d(double d4, double[] dArr) {
        a[] aVarArr = this.f10855b;
        if (d4 < aVarArr[0].f10859c) {
            d4 = aVarArr[0].f10859c;
        }
        if (d4 > aVarArr[aVarArr.length - 1].f10860d) {
            d4 = aVarArr[aVarArr.length - 1].f10860d;
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr2 = this.f10855b;
            if (i4 >= aVarArr2.length) {
                return;
            }
            if (d4 <= aVarArr2[i4].f10860d) {
                if (aVarArr2[i4].f10874r) {
                    dArr[0] = aVarArr2[i4].m9446f(d4);
                    dArr[1] = this.f10855b[i4].m9447g(d4);
                    return;
                } else {
                    aVarArr2[i4].m9451k(d4);
                    dArr[0] = this.f10855b[i4].m9448h();
                    dArr[1] = this.f10855b[i4].m9449i();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: e */
    public void mo9437e(double d4, float[] fArr) {
        a[] aVarArr = this.f10855b;
        if (d4 < aVarArr[0].f10859c) {
            d4 = aVarArr[0].f10859c;
        } else if (d4 > aVarArr[aVarArr.length - 1].f10860d) {
            d4 = aVarArr[aVarArr.length - 1].f10860d;
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr2 = this.f10855b;
            if (i4 >= aVarArr2.length) {
                return;
            }
            if (d4 <= aVarArr2[i4].f10860d) {
                if (aVarArr2[i4].f10874r) {
                    fArr[0] = (float) aVarArr2[i4].m9446f(d4);
                    fArr[1] = (float) this.f10855b[i4].m9447g(d4);
                    return;
                } else {
                    aVarArr2[i4].m9451k(d4);
                    fArr[0] = (float) this.f10855b[i4].m9448h();
                    fArr[1] = (float) this.f10855b[i4].m9449i();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: f */
    public double mo9438f(double d4, int i4) {
        a[] aVarArr = this.f10855b;
        int i5 = 0;
        if (d4 < aVarArr[0].f10859c) {
            d4 = aVarArr[0].f10859c;
        }
        if (d4 > aVarArr[aVarArr.length - 1].f10860d) {
            d4 = aVarArr[aVarArr.length - 1].f10860d;
        }
        while (true) {
            a[] aVarArr2 = this.f10855b;
            if (i5 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d4 <= aVarArr2[i5].f10860d) {
                if (aVarArr2[i5].f10874r) {
                    return i4 == 0 ? aVarArr2[i5].m9444d(d4) : aVarArr2[i5].m9445e(d4);
                }
                aVarArr2[i5].m9451k(d4);
                return i4 == 0 ? this.f10855b[i5].m9442b() : this.f10855b[i5].m9443c();
            }
            i5++;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: g */
    public void mo9439g(double d4, double[] dArr) {
        a[] aVarArr = this.f10855b;
        if (d4 < aVarArr[0].f10859c) {
            d4 = aVarArr[0].f10859c;
        } else if (d4 > aVarArr[aVarArr.length - 1].f10860d) {
            d4 = aVarArr[aVarArr.length - 1].f10860d;
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr2 = this.f10855b;
            if (i4 >= aVarArr2.length) {
                return;
            }
            if (d4 <= aVarArr2[i4].f10860d) {
                if (aVarArr2[i4].f10874r) {
                    dArr[0] = aVarArr2[i4].m9444d(d4);
                    dArr[1] = this.f10855b[i4].m9445e(d4);
                    return;
                } else {
                    aVarArr2[i4].m9451k(d4);
                    dArr[0] = this.f10855b[i4].m9442b();
                    dArr[1] = this.f10855b[i4].m9443c();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: h */
    public double[] mo9440h() {
        return this.f10854a;
    }
}
