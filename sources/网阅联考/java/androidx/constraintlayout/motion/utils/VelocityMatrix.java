package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.SplineSet;

/* loaded from: classes.dex */
public class VelocityMatrix {
    private static String TAG = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void applyTransform(float f4, float f5, int i4, int i5, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = (f5 - 0.5f) * 2.0f;
        float f9 = f6 + this.mDTranslateX;
        float f10 = f7 + this.mDTranslateY;
        float f11 = f9 + (this.mDScaleX * (f4 - 0.5f) * 2.0f);
        float f12 = f10 + (this.mDScaleY * f8);
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d4 = radians;
        double d5 = i5 * f8;
        float fSin = f11 + (((float) ((((-i4) * r7) * Math.sin(d4)) - (Math.cos(d4) * d5))) * radians2);
        float fCos = f12 + (radians2 * ((float) (((i4 * r7) * Math.cos(d4)) - (d5 * Math.sin(d4)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f4) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f4);
            this.mRotate = splineSet.get(f4);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f4) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f4);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f4);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f4) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f4);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f4);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f4) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f4);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f4) {
        if (keyCycleOscillator == null && keyCycleOscillator2 == null) {
            return;
        }
        if (keyCycleOscillator == null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f4);
        }
        if (keyCycleOscillator2 == null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f4);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f4) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f4);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f4);
        }
    }
}
