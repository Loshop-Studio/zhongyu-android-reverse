package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class VelocityMatrix {
    private static String sTag = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void applyTransform(float f6, float f7, int i6, int i7, float[] fArr) {
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = (f7 - 0.5f) * 2.0f;
        float f11 = f8 + this.mDTranslateX;
        float f12 = f9 + this.mDTranslateY;
        float f13 = f11 + (this.mDScaleX * (f6 - 0.5f) * 2.0f);
        float f14 = f12 + (this.mDScaleY * f10);
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d6 = radians;
        double d7 = i7 * f10;
        float fSin = f13 + (((float) ((((-i6) * r7) * Math.sin(d6)) - (Math.cos(d6) * d7))) * radians2);
        float fCos = f14 + (radians2 * ((float) (((i6 * r7) * Math.cos(d6)) - (d7 * Math.sin(d6)))));
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

    public void setRotationVelocity(SplineSet splineSet, float f6) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f6);
            this.mRotate = splineSet.get(f6);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f6) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f6);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f6);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f6) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f6);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f6);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f6) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f6);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f6) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f6);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f6);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f6) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f6);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f6);
        }
    }
}
