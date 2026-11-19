package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.camera.video.AudioStats;
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
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setAlpha(get(f10, j9, view, keyCache));
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
        public void setPoint(int i9, float f10, float f11, int i10, float f12) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            this.mCurveFit.getPos(f10, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j10 = j9 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
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
                float[] fArr2 = this.mCache;
                if (i9 >= fArr2.length) {
                    break;
                }
                boolean z9 = this.mContinue;
                float f14 = this.mTempValues[i9];
                this.mContinue = z9 | (((double) f14) != AudioStats.AUDIO_AMPLITUDE_NONE);
                fArr2[i9] = (f14 * fCalcWave) + f12;
                i9++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
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
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i10);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i11);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i11);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
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

        public void setPoint(int i9, ConstraintAttribute constraintAttribute, float f10, int i10, float f11) {
            this.mConstraintAttributeList.append(i9, constraintAttribute);
            this.mWaveProperties.append(i9, new float[]{f10, f11});
            this.mWaveShape = Math.max(this.mWaveShape, i10);
        }
    }

    public static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setElevation(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f10, long j9, double d10, double d11) {
            view.setRotation(get(f10, j9, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    public static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ProgressSet progressSet;
            Method method;
            if (view instanceof MotionLayout) {
                progressSet = this;
                ((MotionLayout) view).setProgress(get(f10, j9, view, keyCache));
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
                        method.invoke(view, Float.valueOf(progressSet.get(f10, j9, view, keyCache)));
                    } catch (IllegalAccessException e10) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e11);
                    }
                }
            }
            return progressSet.mContinue;
        }
    }

    public static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setRotation(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setRotationX(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setRotationY(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setScaleX(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setScaleY(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setTranslationX(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setTranslationY(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f10, long j9, KeyCache keyCache) {
            view.setTranslationZ(get(f10, j9, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewTimeCycle makeSpline(String str, long j9) {
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
        rotationXset.setStartTime(j9);
        return rotationXset;
    }

    public float get(float f10, long j9, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f10, this.mCache);
        float[] fArr = this.mCache;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
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
        float f12 = (float) ((this.mLastCycle + (((j9 - this.mLastTime) * 1.0E-9d) * f11)) % 1.0d);
        this.mLastCycle = f12;
        keyCache.setFloatValue(view, this.mType, 0, f12);
        this.mLastTime = j9;
        float f13 = this.mCache[0];
        float fCalcWave = (calcWave(this.mLastCycle) * f13) + this.mCache[2];
        this.mContinue = (f13 == 0.0f && f11 == 0.0f) ? false : true;
        return fCalcWave;
    }

    public abstract boolean setProperty(View view, float f10, long j9, KeyCache keyCache);
}
