package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
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
        int i9 = 0;
        while (iIndexOf2 != -1) {
            dArr[i9] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i9++;
        }
        dArr[i9] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i9 + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i9 = 0; i9 < length; i9++) {
            dArr[i9] = Double.parseDouble(strArrSplit[i9]);
        }
        return genSpline(dArr);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d10) {
        return this.mCurveFit.getPos(d10, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d10) {
        return this.mCurveFit.getSlope(d10, 0);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d10 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i9 = 0; i9 < dArr.length; i9++) {
            double d11 = dArr[i9];
            int i10 = i9 + length2;
            dArr2[i10][0] = d11;
            double d12 = i9 * d10;
            dArr3[i10] = d12;
            if (i9 > 0) {
                int i11 = (length2 * 2) + i9;
                dArr2[i11][0] = d11 + 1.0d;
                dArr3[i11] = d12 + 1.0d;
                int i12 = i9 - 1;
                dArr2[i12][0] = (d11 - 1.0d) - d10;
                dArr3[i12] = (d12 - 1.0d) - d10;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        System.out.println(" 0 " + monotonicCurveFit.getPos(AudioStats.AUDIO_AMPLITUDE_NONE, 0));
        System.out.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }
}
