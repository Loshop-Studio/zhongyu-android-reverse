package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    public StepCurve(String str) {
        this.mStr = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i6 = 0;
        while (iIndexOf2 != -1) {
            dArr[i6] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i6++;
        }
        dArr[i6] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i6 + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i6 = 0; i6 < length; i6++) {
            dArr[i6] = Double.parseDouble(strArrSplit[i6]);
        }
        return genSpline(dArr);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d6) {
        return this.mCurveFit.getPos(d6, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d6) {
        return this.mCurveFit.getSlope(d6, 0);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d6 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i6 = 0; i6 < dArr.length; i6++) {
            double d7 = dArr[i6];
            int i7 = i6 + length2;
            dArr2[i7][0] = d7;
            double d8 = i6 * d6;
            dArr3[i7] = d8;
            if (i6 > 0) {
                int i8 = (length2 * 2) + i6;
                dArr2[i8][0] = d7 + 1.0d;
                dArr3[i8] = d8 + 1.0d;
                int i9 = i6 - 1;
                dArr2[i9][0] = (d7 - 1.0d) - d6;
                dArr3[i9] = (d8 - 1.0d) - d6;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        System.out.println(" 0 " + monotonicCurveFit.getPos(0.0d, 0));
        System.out.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }
}
