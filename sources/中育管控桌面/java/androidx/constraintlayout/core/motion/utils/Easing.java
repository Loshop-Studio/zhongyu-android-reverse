package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String ANTICIPATE_NAME = "anticipate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String OVERSHOOT_NAME = "overshoot";
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    String mStr = "identity";
    static Easing sDefault = new Easing();
    private static final String STANDARD_NAME = "standard";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};

    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        switch (str) {
            case "accelerate":
                return new CubicEasing(ACCELERATE);
            case "decelerate":
                return new CubicEasing(DECELERATE);
            case "anticipate":
                return new CubicEasing(ANTICIPATE);
            case "linear":
                return new CubicEasing(LINEAR);
            case "overshoot":
                return new CubicEasing(OVERSHOOT);
            case "standard":
                return new CubicEasing(STANDARD);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return sDefault;
        }
    }

    public double get(double d6) {
        return d6;
    }

    public double getDiff(double d6) {
        return 1.0d;
    }

    public String toString() {
        return this.mStr;
    }

    public static class CubicEasing extends Easing {
        private static double sDError = 1.0E-4d;
        private static double sError = 0.01d;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public CubicEasing(String str) {
            this.mStr = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.mX1 = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i6 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i6);
            this.mY1 = Double.parseDouble(str.substring(i6, iIndexOf3).trim());
            int i7 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i7);
            this.mX2 = Double.parseDouble(str.substring(i7, iIndexOf4).trim());
            int i8 = iIndexOf4 + 1;
            this.mY2 = Double.parseDouble(str.substring(i8, str.indexOf(41, i8)).trim());
        }

        private double getDiffX(double d6) {
            double d7 = 1.0d - d6;
            double d8 = this.mX1;
            double d9 = this.mX2;
            return (d7 * 3.0d * d7 * d8) + (d7 * 6.0d * d6 * (d9 - d8)) + (3.0d * d6 * d6 * (1.0d - d9));
        }

        private double getDiffY(double d6) {
            double d7 = 1.0d - d6;
            double d8 = this.mY1;
            double d9 = this.mY2;
            return (d7 * 3.0d * d7 * d8) + (d7 * 6.0d * d6 * (d9 - d8)) + (3.0d * d6 * d6 * (1.0d - d9));
        }

        private double getX(double d6) {
            double d7 = 1.0d - d6;
            double d8 = 3.0d * d7;
            return (this.mX1 * d7 * d8 * d6) + (this.mX2 * d8 * d6 * d6) + (d6 * d6 * d6);
        }

        private double getY(double d6) {
            double d7 = 1.0d - d6;
            double d8 = 3.0d * d7;
            return (this.mY1 * d7 * d8 * d6) + (this.mY2 * d8 * d6 * d6) + (d6 * d6 * d6);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d6) {
            if (d6 <= 0.0d) {
                return 0.0d;
            }
            if (d6 >= 1.0d) {
                return 1.0d;
            }
            double d7 = 0.5d;
            double d8 = 0.5d;
            while (d7 > sError) {
                d7 *= 0.5d;
                d8 = getX(d8) < d6 ? d8 + d7 : d8 - d7;
            }
            double d9 = d8 - d7;
            double x6 = getX(d9);
            double d10 = d8 + d7;
            double x7 = getX(d10);
            double y6 = getY(d9);
            return (((getY(d10) - y6) * (d6 - x6)) / (x7 - x6)) + y6;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d6) {
            double d7 = 0.5d;
            double d8 = 0.5d;
            while (d7 > sDError) {
                d7 *= 0.5d;
                d8 = getX(d8) < d6 ? d8 + d7 : d8 - d7;
            }
            double d9 = d8 - d7;
            double d10 = d8 + d7;
            return (getY(d10) - getY(d9)) / (getX(d10) - getX(d9));
        }

        public void setup(double d6, double d7, double d8, double d9) {
            this.mX1 = d6;
            this.mY1 = d7;
            this.mX2 = d8;
            this.mY2 = d9;
        }

        public CubicEasing(double d6, double d7, double d8, double d9) {
            setup(d6, d7, d8, d9);
        }
    }
}
