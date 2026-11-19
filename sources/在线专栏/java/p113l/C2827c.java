package p113l;

import android.util.Log;
import java.util.Arrays;

/* renamed from: l.c */
/* loaded from: classes.dex */
public class C2827c {

    /* renamed from: b */
    static C2827c f10877b = new C2827c();

    /* renamed from: c */
    public static String[] f10878c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    String f10879a = "identity";

    /* renamed from: l.c$a */
    static class a extends C2827c {

        /* renamed from: h */
        private static double f10880h = 0.01d;

        /* renamed from: i */
        private static double f10881i = 1.0E-4d;

        /* renamed from: d */
        double f10882d;

        /* renamed from: e */
        double f10883e;

        /* renamed from: f */
        double f10884f;

        /* renamed from: g */
        double f10885g;

        a(String str) {
            this.f10879a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f10882d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i4 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i4);
            this.f10883e = Double.parseDouble(str.substring(i4, iIndexOf3).trim());
            int i5 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i5);
            this.f10884f = Double.parseDouble(str.substring(i5, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            this.f10885g = Double.parseDouble(str.substring(i6, str.indexOf(41, i6)).trim());
        }

        /* renamed from: d */
        private double m9457d(double d4) {
            double d5 = 1.0d - d4;
            double d6 = 3.0d * d5;
            return (this.f10882d * d5 * d6 * d4) + (this.f10884f * d6 * d4 * d4) + (d4 * d4 * d4);
        }

        /* renamed from: e */
        private double m9458e(double d4) {
            double d5 = 1.0d - d4;
            double d6 = 3.0d * d5;
            return (this.f10883e * d5 * d6 * d4) + (this.f10885g * d6 * d4 * d4) + (d4 * d4 * d4);
        }

        @Override // p113l.C2827c
        /* renamed from: a */
        public double mo9455a(double d4) {
            if (d4 <= 0.0d) {
                return 0.0d;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double d5 = 0.5d;
            double d6 = 0.5d;
            while (d5 > f10880h) {
                d5 *= 0.5d;
                d6 = m9457d(d6) < d4 ? d6 + d5 : d6 - d5;
            }
            double d7 = d6 - d5;
            double dM9457d = m9457d(d7);
            double d8 = d6 + d5;
            double dM9457d2 = m9457d(d8);
            double dM9458e = m9458e(d7);
            return (((m9458e(d8) - dM9458e) * (d4 - dM9457d)) / (dM9457d2 - dM9457d)) + dM9458e;
        }

        @Override // p113l.C2827c
        /* renamed from: b */
        public double mo9456b(double d4) {
            double d5 = 0.5d;
            double d6 = 0.5d;
            while (d5 > f10881i) {
                d5 *= 0.5d;
                d6 = m9457d(d6) < d4 ? d6 + d5 : d6 - d5;
            }
            double d7 = d6 - d5;
            double d8 = d6 + d5;
            return (m9458e(d8) - m9458e(d7)) / (m9457d(d8) - m9457d(d7));
        }
    }

    /* renamed from: c */
    public static C2827c m9454c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f10878c));
                return f10877b;
        }
    }

    /* renamed from: a */
    public double mo9455a(double d4) {
        return d4;
    }

    /* renamed from: b */
    public double mo9456b(double d4) {
        return 1.0d;
    }

    public String toString() {
        return this.f10879a;
    }
}
