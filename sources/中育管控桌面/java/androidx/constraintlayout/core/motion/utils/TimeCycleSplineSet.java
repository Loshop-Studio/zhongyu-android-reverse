package androidx.constraintlayout.core.motion.utils;

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
        public void setPoint(int i6, float f6, float f7, int i7, float f8) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f6, long j6, KeyCache keyCache) {
            this.mCurveFit.getPos(f6, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            long j7 = j6 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f9 = (float) ((this.mLastCycle + ((j7 * 1.0E-9d) * f7)) % 1.0d);
            this.mLastCycle = f9;
            this.mLastTime = j6;
            float fCalcWave = calcWave(f9);
            this.mContinue = false;
            int i6 = 0;
            while (true) {
                float[] fArr2 = this.mCustomCache;
                if (i6 >= fArr2.length) {
                    break;
                }
                boolean z6 = this.mContinue;
                float f10 = this.mTempValues[i6];
                this.mContinue = z6 | (((double) f10) != 0.0d);
                fArr2[i6] = (f10 * fCalcWave) + f8;
                i6++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCustomCache);
            if (f7 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i6) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i7 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i7];
            this.mCustomCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i7);
            for (int i8 = 0; i8 < size; i8++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i8);
                CustomAttribute customAttributeValueAt = this.mConstraintAttributeList.valueAt(i8);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i8);
                dArr[i8] = iKeyAt * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i9 = 0;
                while (true) {
                    if (i9 < this.mTempValues.length) {
                        dArr2[i8][i9] = r8[i9];
                        i9++;
                    }
                }
                double[] dArr3 = dArr2[i8];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i6, dArr, dArr2);
        }

        public void setPoint(int i6, CustomAttribute customAttribute, float f6, int i7, float f7) {
            this.mConstraintAttributeList.append(i6, customAttribute);
            this.mWaveProperties.append(i6, new float[]{f6, f7});
            this.mWaveShape = Math.max(this.mWaveShape, i7);
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
        public void setPoint(int i6, float f6, float f7, int i7, float f8) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f6, long j6, KeyCache keyCache) {
            this.mCurveFit.getPos(f6, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            long j7 = j6 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f9 = (float) ((this.mLastCycle + ((j7 * 1.0E-9d) * f7)) % 1.0d);
            this.mLastCycle = f9;
            this.mLastTime = j6;
            float fCalcWave = calcWave(f9);
            this.mContinue = false;
            int i6 = 0;
            while (true) {
                float[] fArr2 = this.mCustomCache;
                if (i6 >= fArr2.length) {
                    break;
                }
                boolean z6 = this.mContinue;
                float f10 = this.mTempValues[i6];
                this.mContinue = z6 | (((double) f10) != 0.0d);
                fArr2[i6] = (f10 * fCalcWave) + f8;
                i6++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCustomCache);
            if (f7 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i6) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i7 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i7];
            this.mCustomCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i7);
            for (int i8 = 0; i8 < size; i8++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i8);
                CustomVariable customVariableValueAt = this.mConstraintAttributeList.valueAt(i8);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i8);
                dArr[i8] = iKeyAt * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.mTempValues);
                int i9 = 0;
                while (true) {
                    if (i9 < this.mTempValues.length) {
                        dArr2[i8][i9] = r8[i9];
                        i9++;
                    }
                }
                double[] dArr3 = dArr2[i8];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i6, dArr, dArr2);
        }

        public void setPoint(int i6, CustomVariable customVariable, float f6, int i7, float f7) {
            this.mConstraintAttributeList.append(i6, customVariable);
            this.mWaveProperties.append(i6, new float[]{f6, f7});
            this.mWaveShape = Math.max(this.mWaveShape, i7);
        }
    }

    public static class Sort {
        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i6, int i7) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i7;
            iArr2[1] = i6;
            int i8 = 2;
            while (i8 > 0) {
                int i9 = iArr2[i8 - 1];
                int i10 = i8 - 2;
                int i11 = iArr2[i10];
                if (i9 < i11) {
                    int iPartition = partition(iArr, fArr, i9, i11);
                    iArr2[i10] = iPartition - 1;
                    iArr2[i8 - 1] = i9;
                    int i12 = i8 + 1;
                    iArr2[i8] = i11;
                    i8 += 2;
                    iArr2[i12] = iPartition + 1;
                } else {
                    i8 = i10;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i6, int i7) {
            int i8 = iArr[i7];
            int i9 = i6;
            while (i6 < i7) {
                if (iArr[i6] <= i8) {
                    swap(iArr, fArr, i9, i6);
                    i9++;
                }
                i6++;
            }
            swap(iArr, fArr, i9, i7);
            return i9;
        }

        private static void swap(int[] iArr, float[][] fArr, int i6, int i7) {
            int i8 = iArr[i6];
            iArr[i6] = iArr[i7];
            iArr[i7] = i8;
            float[] fArr2 = fArr[i6];
            fArr[i6] = fArr[i7];
            fArr[i7] = fArr2;
        }
    }

    public float calcWave(float f6) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f6 * sVal2PI);
            case 2:
                fAbs = Math.abs(f6);
                break;
            case 3:
                return (((f6 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f6 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f6 * sVal2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f6 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f6 * sVal2PI);
        }
        return 1.0f - fAbs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i6, float f6, float f7, int i7, float f8) {
        int[] iArr = this.mTimePoints;
        int i8 = this.mCount;
        iArr[i8] = i6;
        float[] fArr = this.mValues[i8];
        fArr[0] = f6;
        fArr[1] = f7;
        fArr[2] = f8;
        this.mWaveShape = Math.max(this.mWaveShape, i7);
        this.mCount++;
    }

    public void setStartTime(long j6) {
        this.mLastTime = j6;
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
        for (int i6 = 0; i6 < this.mCount; i6++) {
            str = str + "[" + this.mTimePoints[i6] + " , " + decimalFormat.format(this.mValues[i6]) + "] ";
        }
        return str;
    }
}
