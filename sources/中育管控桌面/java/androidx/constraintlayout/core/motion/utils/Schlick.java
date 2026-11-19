package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;

    /* renamed from: mS */
    double f364mS;

    /* renamed from: mT */
    double f365mT;

    public Schlick(String str) {
        this.mStr = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f364mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i6 = iIndexOf2 + 1;
        this.f365mT = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
    }

    private double dfunc(double d6) {
        double d7 = this.f365mT;
        if (d6 < d7) {
            double d8 = this.f364mS;
            return ((d8 * d7) * d7) / ((((d7 - d6) * d8) + d6) * ((d8 * (d7 - d6)) + d6));
        }
        double d9 = this.f364mS;
        return (((d7 - 1.0d) * d9) * (d7 - 1.0d)) / (((((-d9) * (d7 - d6)) - d6) + 1.0d) * ((((-d9) * (d7 - d6)) - d6) + 1.0d));
    }

    private double func(double d6) {
        double d7 = this.f365mT;
        return d6 < d7 ? (d7 * d6) / (d6 + (this.f364mS * (d7 - d6))) : ((1.0d - d7) * (d6 - 1.0d)) / ((1.0d - d6) - (this.f364mS * (d7 - d6)));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d6) {
        return func(d6);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d6) {
        return dfunc(d6);
    }
}
