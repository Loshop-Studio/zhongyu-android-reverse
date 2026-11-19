package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    protected static float sVal2PI = 6.2831855f;
    protected int mCount;
    protected CurveFit mCurveFit;
    protected long mLastTime;
    protected String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float mLastCycle = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mCustomCache;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i9, float f10, float f11, int i10, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f10, long j9, KeyCache keyCache) {
            this.mCurveFit.getPos(f10, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j10 = j9 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f13 = (float) ((this.mLastCycle + ((j10 * 1.0E-9d) * f11)) % 1.0d);
            this.mLastCycle = f13;
            this.mLastTime = j9;
            float fCalcWave = calcWave(f13);
            this.mContinue = false;
            int i9 = 0;
            while (true) {
                float[] fArr2 = this.mCustomCache;
                if (i9 >= fArr2.length) {
                    break;
                }
                boolean z9 = this.mContinue;
                float f14 = this.mTempValues[i9];
                this.mContinue = z9 | (((double) f14) != AudioStats.AUDIO_AMPLITUDE_NONE);
                fArr2[i9] = (f14 * fCalcWave) + f12;
                i9++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCustomCache);
            if (f11 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i9) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i10 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i10];
            this.mCustomCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i10);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i11);
                CustomAttribute customAttributeValueAt = this.mConstraintAttributeList.valueAt(i11);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i12 = 0;
                while (true) {
                    if (i12 < this.mTempValues.length) {
                        dArr2[i11][i12] = r8[i12];
                        i12++;
                    }
                }
                double[] dArr3 = dArr2[i11];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i9, dArr, dArr2);
        }

        public void setPoint(int i9, CustomAttribute customAttribute, float f10, int i10, float f11) {
            this.mConstraintAttributeList.append(i9, customAttribute);
            this.mWaveProperties.append(i9, new float[]{f10, f11});
            this.mWaveShape = Math.max(this.mWaveShape, i10);
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
        String mAttributeName;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mCustomCache;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i9, float f10, float f11, int i10, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f10, long j9, KeyCache keyCache) {
            this.mCurveFit.getPos(f10, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j10 = j9 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f13 = (float) ((this.mLastCycle + ((j10 * 1.0E-9d) * f11)) % 1.0d);
            this.mLastCycle = f13;
            this.mLastTime = j9;
            float fCalcWave = calcWave(f13);
            this.mContinue = false;
            int i9 = 0;
            while (true) {
                float[] fArr2 = this.mCustomCache;
                if (i9 >= fArr2.length) {
                    break;
                }
                boolean z9 = this.mContinue;
                float f14 = this.mTempValues[i9];
                this.mContinue = z9 | (((double) f14) != AudioStats.AUDIO_AMPLITUDE_NONE);
                fArr2[i9] = (f14 * fCalcWave) + f12;
                i9++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCustomCache);
            if (f11 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i9) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i10 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i10];
            this.mCustomCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i10);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i11);
                CustomVariable customVariableValueAt = this.mConstraintAttributeList.valueAt(i11);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.mTempValues);
                int i12 = 0;
                while (true) {
                    if (i12 < this.mTempValues.length) {
                        dArr2[i11][i12] = r8[i12];
                        i12++;
                    }
                }
                double[] dArr3 = dArr2[i11];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i9, dArr, dArr2);
        }

        public void setPoint(int i9, CustomVariable customVariable, float f10, int i10, float f11) {
            this.mConstraintAttributeList.append(i9, customVariable);
            this.mWaveProperties.append(i9, new float[]{f10, f11});
            this.mWaveShape = Math.max(this.mWaveShape, i10);
        }
    }

    public static class Sort {
        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i9, int i10) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i10;
            iArr2[1] = i9;
            int i11 = 2;
            while (i11 > 0) {
                int i12 = iArr2[i11 - 1];
                int i13 = i11 - 2;
                int i14 = iArr2[i13];
                if (i12 < i14) {
                    int iPartition = partition(iArr, fArr, i12, i14);
                    iArr2[i13] = iPartition - 1;
                    iArr2[i11 - 1] = i12;
                    int i15 = i11 + 1;
                    iArr2[i11] = i14;
                    i11 += 2;
                    iArr2[i15] = iPartition + 1;
                } else {
                    i11 = i13;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i9, int i10) {
            int i11 = iArr[i10];
            int i12 = i9;
            while (i9 < i10) {
                if (iArr[i9] <= i11) {
                    swap(iArr, fArr, i12, i9);
                    i12++;
                }
                i9++;
            }
            swap(iArr, fArr, i12, i10);
            return i12;
        }

        private static void swap(int[] iArr, float[][] fArr, int i9, int i10) {
            int i11 = iArr[i9];
            iArr[i9] = iArr[i10];
            iArr[i10] = i11;
            float[] fArr2 = fArr[i9];
            fArr[i9] = fArr[i10];
            fArr[i10] = fArr2;
        }
    }

    public float calcWave(float f10) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f10 * sVal2PI);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * sVal2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * sVal2PI);
        }
        return 1.0f - fAbs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i9, float f10, float f11, int i10, float f12) {
        int[] iArr = this.mTimePoints;
        int i11 = this.mCount;
        iArr[i11] = i9;
        float[] fArr = this.mValues[i11];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.mWaveShape = Math.max(this.mWaveShape, i10);
        this.mCount++;
    }

    public void setStartTime(long j9) {
        this.mLastTime = j9;
    }

    public void setType(String str) {
        this.mType = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setup(int r12) {
        /*
            r11 = this;
            int r0 = r11.mCount
            if (r0 != 0) goto L1d
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error no points added to "
            r0.append(r1)
            java.lang.String r1 = r11.mType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.println(r0)
            return
        L1d:
            int[] r1 = r11.mTimePoints
            float[][] r2 = r11.mValues
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.Sort.doubleQuickSort(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L29:
            int[] r2 = r11.mTimePoints
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = r4
            r6 = r5
        L52:
            int r7 = r11.mCount
            if (r5 >= r7) goto L8a
            if (r5 <= 0) goto L63
            int[] r7 = r11.mTimePoints
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L63
            goto L87
        L63:
            int[] r7 = r11.mTimePoints
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.mValues
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L87:
            int r5 = r5 + 1
            goto L52
        L8a:
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r0, r1)
            r11.mCurveFit = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.setup(int):void");
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i9 = 0; i9 < this.mCount; i9++) {
            str = str + "[" + this.mTimePoints[i9] + " , " + decimalFormat.format(this.mValues[i9]) + "] ";
        }
        return str;
    }
}
