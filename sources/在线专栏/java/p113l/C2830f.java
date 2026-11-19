package p113l;

import java.util.Arrays;

/* renamed from: l.f */
/* loaded from: classes.dex */
public class C2830f {

    /* renamed from: c */
    double[] f10894c;

    /* renamed from: d */
    int f10895d;

    /* renamed from: a */
    float[] f10892a = new float[0];

    /* renamed from: b */
    double[] f10893b = new double[0];

    /* renamed from: e */
    double f10896e = 6.283185307179586d;

    /* renamed from: f */
    private boolean f10897f = false;

    /* renamed from: a */
    public void m9461a(double d4, float f4) {
        int length = this.f10892a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f10893b, d4);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f10893b = Arrays.copyOf(this.f10893b, length);
        this.f10892a = Arrays.copyOf(this.f10892a, length);
        this.f10894c = new double[length];
        double[] dArr = this.f10893b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f10893b[iBinarySearch] = d4;
        this.f10892a[iBinarySearch] = f4;
        this.f10897f = false;
    }

    /* renamed from: b */
    double m9462b(double d4) {
        if (d4 <= 0.0d) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f10893b, d4);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i4 = (-iBinarySearch) - 1;
        float[] fArr = this.f10892a;
        int i5 = i4 - 1;
        double d5 = fArr[i4] - fArr[i5];
        double[] dArr = this.f10893b;
        double d6 = d5 / (dArr[i4] - dArr[i5]);
        return (fArr[i5] - (d6 * dArr[i5])) + (d4 * d6);
    }

    /* renamed from: c */
    double m9463c(double d4) {
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f10893b, d4);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i4 = (-iBinarySearch) - 1;
        float[] fArr = this.f10892a;
        int i5 = i4 - 1;
        double d5 = fArr[i4] - fArr[i5];
        double[] dArr = this.f10893b;
        double d6 = d5 / (dArr[i4] - dArr[i5]);
        return this.f10894c[i5] + ((fArr[i5] - (dArr[i5] * d6)) * (d4 - dArr[i5])) + ((d6 * ((d4 * d4) - (dArr[i5] * dArr[i5]))) / 2.0d);
    }

    /* renamed from: d */
    public double m9464d(double d4) {
        double dM9462b;
        double dSignum;
        double dM9462b2;
        double dM9462b3;
        double dSin;
        switch (this.f10895d) {
            case 1:
                return 0.0d;
            case 2:
                dM9462b = m9462b(d4) * 4.0d;
                dSignum = Math.signum((((m9463c(d4) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return dM9462b * dSignum;
            case 3:
                dM9462b2 = m9462b(d4);
                return dM9462b2 * 2.0d;
            case 4:
                dM9462b2 = -m9462b(d4);
                return dM9462b2 * 2.0d;
            case 5:
                dM9462b3 = (-this.f10896e) * m9462b(d4);
                dSin = Math.sin(this.f10896e * m9463c(d4));
                return dM9462b3 * dSin;
            case 6:
                dM9462b = m9462b(d4) * 4.0d;
                dSignum = (((m9463c(d4) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return dM9462b * dSignum;
            default:
                dM9462b3 = this.f10896e * m9462b(d4);
                dSin = Math.cos(this.f10896e * m9463c(d4));
                return dM9462b3 * dSin;
        }
    }

    /* renamed from: e */
    public double m9465e(double d4) {
        double dAbs;
        switch (this.f10895d) {
            case 1:
                return Math.signum(0.5d - (m9463c(d4) % 1.0d));
            case 2:
                dAbs = Math.abs((((m9463c(d4) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m9463c(d4) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((m9463c(d4) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f10896e * m9463c(d4));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((m9463c(d4) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(this.f10896e * m9463c(d4));
        }
        return 1.0d - dAbs;
    }

    /* renamed from: f */
    public void m9466f() {
        double d4 = 0.0d;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f10892a.length) {
                break;
            }
            d4 += r7[i4];
            i4++;
        }
        double d5 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr = this.f10892a;
            if (i5 >= fArr.length) {
                break;
            }
            int i6 = i5 - 1;
            float f4 = (fArr[i6] + fArr[i5]) / 2.0f;
            double[] dArr = this.f10893b;
            d5 += (dArr[i5] - dArr[i6]) * f4;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f10892a;
            if (i7 >= fArr2.length) {
                break;
            }
            fArr2[i7] = (float) (fArr2[i7] * (d4 / d5));
            i7++;
        }
        this.f10894c[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr3 = this.f10892a;
            if (i8 >= fArr3.length) {
                this.f10897f = true;
                return;
            }
            int i9 = i8 - 1;
            float f5 = (fArr3[i9] + fArr3[i8]) / 2.0f;
            double[] dArr2 = this.f10893b;
            double d6 = dArr2[i8] - dArr2[i9];
            double[] dArr3 = this.f10894c;
            dArr3[i8] = dArr3[i9] + (d6 * f5);
            i8++;
        }
    }

    /* renamed from: g */
    public void m9467g(int i4) {
        this.f10895d = i4;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f10893b) + " period=" + Arrays.toString(this.f10892a);
    }
}
