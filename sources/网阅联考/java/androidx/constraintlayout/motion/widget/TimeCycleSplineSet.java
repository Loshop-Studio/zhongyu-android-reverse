package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    private static final int CURVE_OFFSET = 2;
    private static final int CURVE_PERIOD = 1;
    private static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    private static float VAL_2PI = 6.2831855f;
    private int count;
    long last_time;
    protected CurveFit mCurveFit;
    private String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    private float[] mCache = new float[3];
    protected boolean mContinue = false;
    float last_cycle = Float.NaN;

    public static class AlphaSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setAlpha(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        float[] mCache;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setPoint(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            this.mCurveFit.getPos(f4, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float f7 = (float) ((this.last_cycle + (((j4 - this.last_time) * 1.0E-9d) * f5)) % 1.0d);
            this.last_cycle = f7;
            this.last_time = j4;
            float fCalcWave = calcWave(f7);
            this.mContinue = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z3 = this.mContinue;
                float f8 = this.mTempValues[i4];
                this.mContinue = z3 | (((double) f8) != 0.0d);
                fArr2[i4] = (f8 * fCalcWave) + f6;
                i4++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view, this.mCache);
            if (f5 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setup(int i4) {
            int size = this.mConstraintAttributeList.size();
            int iNoOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            int i5 = iNoOfInterpValues + 2;
            this.mTempValues = new float[i5];
            this.mCache = new float[iNoOfInterpValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i5);
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i6);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i6);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i6);
                dArr[i6] = iKeyAt * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i7 = 0;
                while (true) {
                    if (i7 < this.mTempValues.length) {
                        dArr2[i6][i7] = r7[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[iNoOfInterpValues] = fArrValueAt[0];
                dArr3[iNoOfInterpValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i4, dArr, dArr2);
        }

        public void setPoint(int i4, ConstraintAttribute constraintAttribute, float f4, int i5, float f5) {
            this.mConstraintAttributeList.append(i4, constraintAttribute);
            this.mWaveProperties.append(i4, new float[]{f4, f5});
            this.mWaveShape = Math.max(this.mWaveShape, i5);
        }
    }

    public static class ElevationSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setElevation(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends TimeCycleSplineSet {
        public boolean setPathRotate(View view, KeyCache keyCache, float f4, long j4, double d4, double d5) {
            view.setRotation(get(f4, j4, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    public static class ProgressSet extends TimeCycleSplineSet {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f4, j4, view, keyCache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(get(f4, j4, view, keyCache)));
                    } catch (IllegalAccessException e4) {
                        Log.e(TimeCycleSplineSet.TAG, "unable to setProgress", e4);
                    } catch (InvocationTargetException e5) {
                        Log.e(TimeCycleSplineSet.TAG, "unable to setProgress", e5);
                    }
                }
            }
            return this.mContinue;
        }
    }

    public static class RotationSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setRotation(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationXset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setRotationX(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationYset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setRotationY(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleXset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setScaleX(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleYset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setScaleY(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = i6 - 1;
                int i8 = iArr2[i7];
                i6 = i7 - 1;
                int i9 = iArr2[i6];
                if (i8 < i9) {
                    int iPartition = partition(iArr, fArr, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = iPartition - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = iPartition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    swap(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            swap(iArr, fArr, i7, i5);
            return i7;
        }

        private static void swap(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float[] fArr2 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = fArr2;
        }
    }

    public static class TranslationXset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setTranslationX(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationYset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setTranslationY(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationZset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f4, long j4, KeyCache keyCache) {
            view.setTranslationZ(get(f4, j4, view, keyCache));
            return this.mContinue;
        }
    }

    public static TimeCycleSplineSet makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static TimeCycleSplineSet makeSpline(String str, long j4) {
        TimeCycleSplineSet rotationXset;
        str.hashCode();
        switch (str) {
            case "rotationX":
                rotationXset = new RotationXset();
                break;
            case "rotationY":
                rotationXset = new RotationYset();
                break;
            case "translationX":
                rotationXset = new TranslationXset();
                break;
            case "translationY":
                rotationXset = new TranslationYset();
                break;
            case "translationZ":
                rotationXset = new TranslationZset();
                break;
            case "progress":
                rotationXset = new ProgressSet();
                break;
            case "scaleX":
                rotationXset = new ScaleXset();
                break;
            case "scaleY":
                rotationXset = new ScaleYset();
                break;
            case "rotation":
                rotationXset = new RotationSet();
                break;
            case "elevation":
                rotationXset = new ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new PathRotate();
                break;
            case "alpha":
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(j4);
        return rotationXset;
    }

    public float calcWave(float f4) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f4 * VAL_2PI);
            case 2:
                fAbs = Math.abs(f4);
                break;
            case 3:
                return (((f4 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f4 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f4 * VAL_2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f4 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f4 * VAL_2PI);
        }
        return 1.0f - fAbs;
    }

    public float get(float f4, long j4, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f4, this.mCache);
        float[] fArr = this.mCache;
        float f5 = fArr[1];
        if (f5 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.last_cycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.last_cycle = 0.0f;
            }
        }
        float f6 = (float) ((this.last_cycle + (((j4 - this.last_time) * 1.0E-9d) * f5)) % 1.0d);
        this.last_cycle = f6;
        keyCache.setFloatValue(view, this.mType, 0, f6);
        this.last_time = j4;
        float f7 = this.mCache[0];
        float fCalcWave = (calcWave(this.last_cycle) * f7) + this.mCache[2];
        this.mContinue = (f7 == 0.0f && f5 == 0.0f) ? false : true;
        return fCalcWave;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i4, float f4, float f5, int i5, float f6) {
        int[] iArr = this.mTimePoints;
        int i6 = this.count;
        iArr[i6] = i4;
        float[] fArr = this.mValues[i6];
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = f6;
        this.mWaveShape = Math.max(this.mWaveShape, i5);
        this.count++;
    }

    public abstract boolean setProperty(View view, float f4, long j4, KeyCache keyCache);

    public void setStartTime(long j4) {
        this.last_time = j4;
    }

    public void setType(String str) {
        this.mType = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setup(int r12) {
        /*
            r11 = this;
            int r0 = r11.count
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Error no points added to "
            r12.append(r0)
            java.lang.String r0 = r11.mType
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "SplineSet"
            android.util.Log.e(r0, r12)
            return
        L1d:
            int[] r1 = r11.mTimePoints
            float[][] r2 = r11.mValues
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet.Sort.doubleQuickSort(r1, r2, r4, r0)
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
            r2 = 3
            int[] r1 = new int[]{r1, r2}
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r5 = r2
        L4f:
            int r6 = r11.count
            if (r2 >= r6) goto L88
            if (r2 <= 0) goto L60
            int[] r6 = r11.mTimePoints
            r7 = r6[r2]
            int r8 = r2 + (-1)
            r6 = r6[r8]
            if (r7 != r6) goto L60
            goto L85
        L60:
            int[] r6 = r11.mTimePoints
            r6 = r6[r2]
            double r6 = (double) r6
            r8 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r6 = r6 * r8
            r0[r5] = r6
            r6 = r1[r5]
            float[][] r7 = r11.mValues
            r7 = r7[r2]
            r8 = r7[r4]
            double r8 = (double) r8
            r6[r4] = r8
            r8 = r7[r3]
            double r8 = (double) r8
            r6[r3] = r8
            r8 = 2
            r7 = r7[r8]
            double r9 = (double) r7
            r6[r8] = r9
            int r5 = r5 + 1
        L85:
            int r2 = r2 + 1
            goto L4f
        L88:
            androidx.constraintlayout.motion.utils.CurveFit r12 = androidx.constraintlayout.motion.utils.CurveFit.get(r12, r0, r1)
            r11.mCurveFit = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.TimeCycleSplineSet.setup(int):void");
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.count; i4++) {
            str = str + "[" + this.mTimePoints[i4] + " , " + decimalFormat.format(this.mValues[i4]) + "] ";
        }
        return str;
    }
}
