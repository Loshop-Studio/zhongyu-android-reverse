package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.Oscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    protected ConstraintAttribute mCustom;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    public static class AlphaSet extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setAlpha(get(f4));
        }
    }

    public static class CustomSet extends KeyCycleOscillator {
        float[] value = new float[1];

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            this.value[0] = get(f4);
            this.mCustom.setInterpolatedValue(view, this.value);
        }
    }

    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        CurveFit mCurveFit;
        float[] mOffset;
        float mPathLength;
        float[] mPeriod;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;
        Oscillator mOscillator = new Oscillator();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        public CycleOscillator(int i4, int i5, int i6) {
            this.mWaveShape = i4;
            this.mVariesBy = i5;
            this.mOscillator.setType(i4);
            this.mValues = new float[i6];
            this.mPosition = new double[i6];
            this.mPeriod = new float[i6];
            this.mOffset = new float[i6];
            this.mScale = new float[i6];
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.mCustomConstraints.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.mCustomConstraints.get(str);
            if (constraintAttribute2.getType() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute2.getType().name());
        }

        public double getSlope(float f4) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d4 = f4;
                curveFit.getSlope(d4, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d4, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d5 = f4;
            double value = this.mOscillator.getValue(d5);
            double slope = this.mOscillator.getSlope(d5);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[1]) + (slope * this.mSplineValueCache[1]);
        }

        public double getValues(float f4) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f4, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffset[0];
                dArr[1] = this.mValues[0];
            }
            return this.mSplineValueCache[0] + (this.mOscillator.getValue(f4) * this.mSplineValueCache[1]);
        }

        public void setPoint(int i4, int i5, float f4, float f5, float f6) {
            this.mPosition[i4] = i5 / 100.0d;
            this.mPeriod[i4] = f4;
            this.mOffset[i4] = f5;
            this.mValues[i4] = f6;
        }

        public void setup(float f4) {
            this.mPathLength = f4;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.mPosition.length, 2);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 1];
            this.mSplineSlopeCache = new double[fArr.length + 1];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                dArr[i4][0] = this.mOffset[i4];
                int i5 = 0;
                while (true) {
                    if (i5 < this.mValues.length) {
                        dArr[i5][1] = r4[i5];
                        i5++;
                    }
                }
                this.mOscillator.addPoint(this.mPosition[i4], this.mPeriod[i4]);
            }
            this.mOscillator.normalize();
            double[] dArr3 = this.mPosition;
            if (dArr3.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr3, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    public static class ElevationSet extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setElevation(get(f4));
        }
    }

    public static class IntDoubleSort {
        private IntDoubleSort() {
        }

        private static int partition(int[] iArr, float[] fArr, int i4, int i5) {
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

        public static void sort(int[] iArr, float[] fArr, int i4, int i5) {
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

        private static void swap(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
        }
    }

    public static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    swap(iArr, fArr, fArr2, i7, i4);
                    i7++;
                }
                i4++;
            }
            swap(iArr, fArr, fArr2, i7, i5);
            return i7;
        }

        public static void sort(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
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
                    int iPartition = partition(iArr, fArr, fArr2, i8, i9);
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

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
            float f5 = fArr2[i4];
            fArr2[i4] = fArr2[i5];
            fArr2[i5] = f5;
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        public void setPathRotate(View view, float f4, double d4, double d5) {
            view.setRotation(get(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
        }
    }

    public static class ProgressSet extends KeyCycleOscillator {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f4));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f4)));
                } catch (IllegalAccessException e4) {
                    Log.e(KeyCycleOscillator.TAG, "unable to setProgress", e4);
                } catch (InvocationTargetException e5) {
                    Log.e(KeyCycleOscillator.TAG, "unable to setProgress", e5);
                }
            }
        }
    }

    public static class RotationSet extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setRotation(get(f4));
        }
    }

    public static class RotationXset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setRotationX(get(f4));
        }
    }

    public static class RotationYset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setRotationY(get(f4));
        }
    }

    public static class ScaleXset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setScaleX(get(f4));
        }
    }

    public static class ScaleYset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setScaleY(get(f4));
        }
    }

    public static class TranslationXset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setTranslationX(get(f4));
        }
    }

    public static class TranslationYset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setTranslationY(get(f4));
        }
    }

    public static class TranslationZset extends KeyCycleOscillator {
        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(View view, float f4) {
            view.setTranslationZ(get(f4));
        }
    }

    public static class WavePoint {
        float mOffset;
        float mPeriod;
        int mPosition;
        float mValue;

        public WavePoint(int i4, float f4, float f5, float f6) {
            this.mPosition = i4;
            this.mValue = f6;
            this.mOffset = f5;
            this.mPeriod = f4;
        }
    }

    public static KeyCycleOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
        switch (str) {
            case "rotationX":
                return new RotationXset();
            case "rotationY":
                return new RotationYset();
            case "translationX":
                return new TranslationXset();
            case "translationY":
                return new TranslationYset();
            case "translationZ":
                return new TranslationZset();
            case "progress":
                return new ProgressSet();
            case "scaleX":
                return new ScaleXset();
            case "scaleY":
                return new ScaleYset();
            case "waveVariesBy":
                return new AlphaSet();
            case "rotation":
                return new RotationSet();
            case "elevation":
                return new ElevationSet();
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new AlphaSet();
            case "waveOffset":
                return new AlphaSet();
            default:
                return null;
        }
    }

    public float get(float f4) {
        return (float) this.mCycleOscillator.getValues(f4);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f4) {
        return (float) this.mCycleOscillator.getSlope(f4);
    }

    public void setPoint(int i4, int i5, int i6, float f4, float f5, float f6, ConstraintAttribute constraintAttribute) {
        this.mWavePoints.add(new WavePoint(i4, f4, f5, f6));
        if (i6 != -1) {
            this.mVariesBy = i6;
        }
        this.mWaveShape = i5;
        this.mCustom = constraintAttribute;
    }

    public abstract void setProperty(View view, float f4);

    public void setType(String str) {
        this.mType = str;
    }

    @TargetApi(19)
    public void setup(float f4) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.motion.widget.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mVariesBy, size);
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            WavePoint next = it.next();
            float f5 = next.mPeriod;
            dArr[i4] = f5 * 0.01d;
            double[] dArr3 = dArr2[i4];
            float f6 = next.mValue;
            dArr3[0] = f6;
            float f7 = next.mOffset;
            dArr3[1] = f7;
            this.mCycleOscillator.setPoint(i4, next.mPosition, f5, f7, f6);
            i4++;
        }
        this.mCycleOscillator.setup(f4);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().mPosition + " , " + decimalFormat.format(r3.mValue) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i4, int i5, int i6, float f4, float f5, float f6) {
        this.mWavePoints.add(new WavePoint(i4, f4, f5, f6));
        if (i6 != -1) {
            this.mVariesBy = i6;
        }
        this.mWaveShape = i5;
    }
}
