package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    public static class CoreSpline extends KeyCycleOscillator {
        String mType;
        int mTypeId;

        public CoreSpline(String str) {
            this.mType = str;
            this.mTypeId = TypedValues.CycleType.getId(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f6) {
            motionWidget.setValue(this.mTypeId, get(f6));
        }
    }

    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        CurveFit mCurveFit;
        float[] mOffsetArr;
        private final int mOffst;
        Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        private final int mPhase;
        float[] mPhaseArr;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        private final int mValue;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        public CycleOscillator(int i6, String str, int i7, int i8) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.mOffst = 0;
            this.mPhase = 1;
            this.mValue = 2;
            this.mWaveShape = i6;
            this.mVariesBy = i7;
            oscillator.setType(i6, str);
            this.mValues = new float[i8];
            this.mPosition = new double[i8];
            this.mPeriod = new float[i8];
            this.mOffsetArr = new float[i8];
            this.mPhaseArr = new float[i8];
            this.mScale = new float[i8];
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f6) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d6 = f6;
                curveFit.getSlope(d6, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d6, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d7 = f6;
            double value = this.mOscillator.getValue(d7, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d7, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.mSplineValueCache[2]);
        }

        public double getValues(float f6) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f6, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffsetArr[0];
                dArr[1] = this.mPhaseArr[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue(f6, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public void setPoint(int i6, int i7, float f6, float f7, float f8, float f9) {
            this.mPosition[i6] = i7 / 100.0d;
            this.mPeriod[i6] = f6;
            this.mOffsetArr[i6] = f7;
            this.mPhaseArr[i6] = f8;
            this.mValues[i6] = f9;
        }

        public void setup(float f6) {
            this.mPathLength = f6;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i6 = 0; i6 < dArr.length; i6++) {
                double[] dArr3 = dArr[i6];
                dArr3[0] = this.mOffsetArr[i6];
                dArr3[1] = this.mPhaseArr[i6];
                dArr3[2] = this.mValues[i6];
                this.mOscillator.addPoint(this.mPosition[i6], this.mPeriod[i6]);
            }
            this.mOscillator.normalize();
            double[] dArr4 = this.mPosition;
            if (dArr4.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr4, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        String mType;
        int mTypeId;

        public PathRotateSet(String str) {
            this.mType = str;
            this.mTypeId = TypedValues.CycleType.getId(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f6, double d6, double d7) {
            motionWidget.setRotationZ(get(f6) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f6) {
            motionWidget.setValue(this.mTypeId, get(f6));
        }
    }

    public static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i6, float f6, float f7, float f8, float f9) {
            this.mPosition = i6;
            this.mValue = f9;
            this.mOffset = f7;
            this.mPeriod = f6;
            this.mPhase = f8;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        return str.equals("pathRotate") ? new PathRotateSet(str) : new CoreSpline(str);
    }

    public float get(float f6) {
        return (float) this.mCycleOscillator.getValues(f6);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f6) {
        return (float) this.mCycleOscillator.getSlope(f6);
    }

    public void setCustom(Object obj) {
    }

    public void setPoint(int i6, int i7, String str, int i8, float f6, float f7, float f8, float f9, Object obj) {
        this.mWavePoints.add(new WavePoint(i6, f6, f7, f8, f9));
        if (i8 != -1) {
            this.mVariesBy = i8;
        }
        this.mWaveShape = i7;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setProperty(MotionWidget motionWidget, float f6) {
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(float f6) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        char c7 = 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        ArrayList<WavePoint> arrayList = this.mWavePoints;
        int size2 = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size2) {
            int i8 = i6 + 1;
            WavePoint wavePoint = arrayList.get(i6);
            float f7 = wavePoint.mPeriod;
            dArr[i7] = f7 * 0.01d;
            double[] dArr3 = dArr2[i7];
            float f8 = wavePoint.mValue;
            dArr3[0] = f8;
            float f9 = wavePoint.mOffset;
            char c8 = c7;
            dArr3[1] = f9;
            float f10 = wavePoint.mPhase;
            dArr3[c8] = f10;
            this.mCycleOscillator.setPoint(i7, wavePoint.mPosition, f7, f9, f10, f8);
            i7++;
            i6 = i8;
            c7 = c8;
            dArr2 = dArr2;
        }
        this.mCycleOscillator.setup(f6);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<WavePoint> arrayList = this.mWavePoints;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            WavePoint wavePoint = arrayList.get(i6);
            i6++;
            str = str + "[" + wavePoint.mPosition + " , " + decimalFormat.format(r5.mValue) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i6, int i7, String str, int i8, float f6, float f7, float f8, float f9) {
        this.mWavePoints.add(new WavePoint(i6, f6, f7, f8, f9));
        if (i8 != -1) {
            this.mVariesBy = i8;
        }
        this.mWaveShape = i7;
        this.mWaveString = str;
    }
}
