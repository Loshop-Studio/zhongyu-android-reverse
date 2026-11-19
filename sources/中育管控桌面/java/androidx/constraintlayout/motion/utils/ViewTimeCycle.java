package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    public static class AlphaSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setAlpha(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends ViewTimeCycle {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i6, float f6, float f7, int i7, float f8) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            this.mCurveFit.getPos(f6, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            long j7 = j6 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
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
                float[] fArr2 = this.mCache;
                if (i6 >= fArr2.length) {
                    break;
                }
                boolean z6 = this.mContinue;
                float f10 = this.mTempValues[i6];
                this.mContinue = z6 | (((double) f10) != 0.0d);
                fArr2[i6] = (f10 * fCalcWave) + f8;
                i6++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
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
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i7);
            for (int i8 = 0; i8 < size; i8++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i8);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i8);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i8);
                dArr[i8] = iKeyAt * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
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

        public void setPoint(int i6, ConstraintAttribute constraintAttribute, float f6, int i7, float f7) {
            this.mConstraintAttributeList.append(i6, constraintAttribute);
            this.mWaveProperties.append(i6, new float[]{f6, f7});
            this.mWaveShape = Math.max(this.mWaveShape, i7);
        }
    }

    public static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setElevation(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f6, long j6, double d6, double d7) {
            view.setRotation(get(f6, j6, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    public static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ProgressSet progressSet;
            Method method;
            if (view instanceof MotionLayout) {
                progressSet = this;
                ((MotionLayout) view).setProgress(get(f6, j6, view, keyCache));
            } else {
                progressSet = this;
                if (progressSet.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    progressSet.mNoMethod = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(progressSet.get(f6, j6, view, keyCache)));
                    } catch (IllegalAccessException e6) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e6);
                    } catch (InvocationTargetException e7) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e7);
                    }
                }
            }
            return progressSet.mContinue;
        }
    }

    public static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setRotation(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setRotationX(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setRotationY(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setScaleX(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setScaleY(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setTranslationX(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setTranslationY(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f6, long j6, KeyCache keyCache) {
            view.setTranslationZ(get(f6, j6, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewTimeCycle makeSpline(String str, long j6) {
        ViewTimeCycle rotationXset;
        str.getClass();
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
        rotationXset.setStartTime(j6);
        return rotationXset;
    }

    public float get(float f6, long j6, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f6, this.mCache);
        float[] fArr = this.mCache;
        float f7 = fArr[1];
        if (f7 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mLastCycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.mLastCycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.mLastCycle = 0.0f;
            }
        }
        float f8 = (float) ((this.mLastCycle + (((j6 - this.mLastTime) * 1.0E-9d) * f7)) % 1.0d);
        this.mLastCycle = f8;
        keyCache.setFloatValue(view, this.mType, 0, f8);
        this.mLastTime = j6;
        float f9 = this.mCache[0];
        float fCalcWave = (calcWave(this.mLastCycle) * f9) + this.mCache[2];
        this.mContinue = (f9 == 0.0f && f7 == 0.0f) ? false : true;
        return fCalcWave;
    }

    public abstract boolean setProperty(View view, float f6, long j6, KeyCache keyCache);
}
