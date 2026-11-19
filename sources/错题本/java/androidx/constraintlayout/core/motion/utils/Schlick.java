package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;

    /* renamed from: mS */
    double f958mS;

    /* renamed from: mT */
    double f959mT;

    public Schlick(String str) {
        this.mStr = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f958mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f959mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d9) {
        double d10 = this.f959mT;
        if (d9 < d10) {
            double d11 = this.f958mS;
            return ((d11 * d10) * d10) / ((((d10 - d9) * d11) + d9) * (((d10 - d9) * d11) + d9));
        }
        double d12 = this.f958mS;
        return ((d10 - 1.0d) * ((d10 - 1.0d) * d12)) / (((((d10 - d9) * (-d12)) - d9) + 1.0d) * ((((d10 - d9) * (-d12)) - d9) + 1.0d));
    }

    private double func(double d9) {
        double d10 = this.f959mT;
        if (d9 < d10) {
            return (d10 * d9) / (((d10 - d9) * this.f958mS) + d9);
        }
        return ((d9 - 1.0d) * (1.0d - d10)) / ((1.0d - d9) - ((d10 - d9) * this.f958mS));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d9) {
        return func(d9);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d9) {
        return dfunc(d9);
    }
}
