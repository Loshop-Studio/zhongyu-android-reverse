package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {RequestParameters.POSITION, "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    LinkedHashMap<String, ConstraintAttribute> mAttributes;
    float mHeight;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPosition;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;

    /* renamed from: mX */
    float f383mX;

    /* renamed from: mY */
    float f384mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i6 = Key.UNSET;
        this.mPathMotionArc = i6;
        this.mAnimateRelativeTo = i6;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f6, float f7) {
        return (Float.isNaN(f6) || Float.isNaN(f7)) ? Float.isNaN(f6) != Float.isNaN(f7) : Math.abs(f6 - f7) > 1.0E-6f;
    }

    private static float xRotate(float f6, float f7, float f8, float f9, float f10, float f11) {
        return (((f10 - f8) * f7) - ((f11 - f9) * f6)) + f8;
    }

    private static float yRotate(float f6, float f7, float f8, float f9, float f10, float f11) {
        return ((f10 - f8) * f6) + ((f11 - f9) * f7) + f9;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z6) {
        boolean zDiff = diff(this.f383mX, motionPaths.f383mX);
        boolean zDiff2 = diff(this.f384mY, motionPaths.f384mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z7 = zDiff | zDiff2 | z6;
        zArr[1] = zArr[1] | z7;
        zArr[2] = z7 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.f383mX, this.f384mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i6 = 0;
        for (int i7 : iArr) {
            if (i7 < 6) {
                dArr[i6] = fArr[r1];
                i6++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i6) {
        float f6 = this.mWidth;
        float f7 = this.mHeight;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f8 = (float) dArr[i7];
            int i8 = iArr[i7];
            if (i8 == 3) {
                f6 = f8;
            } else if (i8 == 4) {
                f7 = f8;
            }
        }
        fArr[i6] = f6;
        fArr[i6 + 1] = f7;
    }

    public void getCenter(double d6, int[] iArr, double[] dArr, float[] fArr, int i6) {
        float fSin = this.f383mX;
        float fCos = this.f384mY;
        float f6 = this.mWidth;
        float f7 = this.mHeight;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f8 = (float) dArr[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                fSin = f8;
            } else if (i8 == 2) {
                fCos = f8;
            } else if (i8 == 3) {
                f6 = f8;
            } else if (i8 == 4) {
                f7 = f8;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d6, fArr2, new float[2]);
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            double d7 = f9;
            double d8 = fSin;
            double d9 = fCos;
            fSin = (float) ((d7 + (Math.sin(d9) * d8)) - (f6 / 2.0f));
            fCos = (float) ((f10 - (d8 * Math.cos(d9))) - (f7 / 2.0f));
        }
        fArr[i6] = fSin + (f6 / 2.0f) + 0.0f;
        fArr[i6 + 1] = fCos + (f7 / 2.0f) + 0.0f;
    }

    public void getCenterVelocity(double d6, int[] iArr, double[] dArr, float[] fArr, int i6) {
        float fSin = this.f383mX;
        float fCos = this.f384mY;
        float f6 = this.mWidth;
        float f7 = this.mHeight;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f8 = (float) dArr[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                fSin = f8;
            } else if (i8 == 2) {
                fCos = f8;
            } else if (i8 == 3) {
                f6 = f8;
            } else if (i8 == 4) {
                f7 = f8;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d6, fArr2, new float[2]);
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            double d7 = f9;
            double d8 = fSin;
            double d9 = fCos;
            fSin = (float) ((d7 + (Math.sin(d9) * d8)) - (f6 / 2.0f));
            fCos = (float) ((f10 - (d8 * Math.cos(d9))) - (f7 / 2.0f));
        }
        fArr[i6] = fSin + (f6 / 2.0f) + 0.0f;
        fArr[i6 + 1] = fCos + (f7 / 2.0f) + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i6) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i7 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i6] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i7 < iNumberOfInterpolatedValues) {
            dArr[i6] = r2[i7];
            i7++;
            i6++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i6) {
        float f6 = this.f383mX;
        float fCos = this.f384mY;
        float f7 = this.mWidth;
        float f8 = this.mHeight;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f9 = (float) dArr[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                f6 = f9;
            } else if (i8 == 2) {
                fCos = f9;
            } else if (i8 == 3) {
                f7 = f9;
            } else if (i8 == 4) {
                f8 = f9;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d6 = f6;
            double d7 = fCos;
            float fSin = (float) ((centerX + (Math.sin(d7) * d6)) - (f7 / 2.0f));
            fCos = (float) ((centerY - (d6 * Math.cos(d7))) - (f8 / 2.0f));
            f6 = fSin;
        }
        float f10 = f7 + f6;
        float f11 = f8 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i6] = f6 + 0.0f;
        fArr[i6 + 1] = fCos + 0.0f;
        fArr[i6 + 2] = f10 + 0.0f;
        fArr[i6 + 3] = fCos + 0.0f;
        fArr[i6 + 4] = f10 + 0.0f;
        fArr[i6 + 5] = f11 + 0.0f;
        fArr[i6 + 6] = f6 + 0.0f;
        fArr[i6 + 7] = f11 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f6 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f6;
        this.mDrawPath = keyPosition.mDrawPath;
        float f7 = Float.isNaN(keyPosition.mPercentWidth) ? f6 : keyPosition.mPercentWidth;
        float f8 = Float.isNaN(keyPosition.mPercentHeight) ? f6 : keyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth;
        float f10 = motionPaths.mWidth;
        float f11 = f9 - f10;
        float f12 = motionPaths2.mHeight;
        float f13 = motionPaths.mHeight;
        float f14 = f12 - f13;
        this.mPosition = this.mTime;
        float f15 = (f10 / 2.0f) + motionPaths.f383mX;
        float f16 = motionPaths.f384mY + (f13 / 2.0f);
        float f17 = f6;
        float f18 = motionPaths2.f383mX + (f9 / 2.0f);
        float f19 = motionPaths2.f384mY + (f12 / 2.0f);
        if (f15 > f18) {
            f15 = f18;
            f18 = f15;
        }
        if (f16 <= f19) {
            f16 = f19;
            f19 = f16;
        }
        float f20 = f18 - f15;
        float f21 = f16 - f19;
        float f22 = (f11 * f7) / 2.0f;
        this.f383mX = (int) ((r13 + (f20 * f17)) - f22);
        float f23 = (f14 * f8) / 2.0f;
        this.f384mY = (int) ((r14 + (f21 * f17)) - f23);
        this.mWidth = (int) (f10 + r9);
        this.mHeight = (int) (f13 + r12);
        float f24 = Float.isNaN(keyPosition.mPercentX) ? f17 : keyPosition.mPercentX;
        float f25 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f17 = keyPosition.mPercentY;
        }
        float f26 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f383mX = (int) (((motionPaths.f383mX + (f24 * f20)) + (f26 * f21)) - f22);
        this.f384mY = (int) (((motionPaths.f384mY + (f20 * f25)) + (f21 * f17)) - f23);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f6 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f6;
        this.mDrawPath = keyPosition.mDrawPath;
        float f7 = Float.isNaN(keyPosition.mPercentWidth) ? f6 : keyPosition.mPercentWidth;
        float f8 = Float.isNaN(keyPosition.mPercentHeight) ? f6 : keyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth;
        float f10 = motionPaths.mWidth;
        float f11 = motionPaths2.mHeight;
        float f12 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f13 = motionPaths.f383mX;
        float f14 = motionPaths.f384mY;
        float f15 = f6;
        float f16 = (motionPaths2.f383mX + (f9 / 2.0f)) - ((f10 / 2.0f) + f13);
        float f17 = (motionPaths2.f384mY + (f11 / 2.0f)) - (f14 + (f12 / 2.0f));
        float f18 = ((f9 - f10) * f7) / 2.0f;
        this.f383mX = (int) ((f13 + (f16 * f15)) - f18);
        float f19 = ((f11 - f12) * f8) / 2.0f;
        this.f384mY = (int) ((f14 + (f17 * f15)) - f19);
        this.mWidth = (int) (f10 + r9);
        this.mHeight = (int) (f12 + r12);
        float f20 = Float.isNaN(keyPosition.mPercentX) ? f15 : keyPosition.mPercentX;
        float f21 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f15 = keyPosition.mPercentY;
        }
        float f22 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f383mX = (int) (((motionPaths.f383mX + (f20 * f16)) + (f22 * f17)) - f18);
        this.f384mY = (int) (((motionPaths.f384mY + (f16 * f21)) + (f17 * f15)) - f19);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f6 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f6;
        this.mDrawPath = keyPosition.mDrawPath;
        float f7 = Float.isNaN(keyPosition.mPercentWidth) ? f6 : keyPosition.mPercentWidth;
        float f8 = Float.isNaN(keyPosition.mPercentHeight) ? f6 : keyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth - motionPaths.mWidth;
        float f10 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f6 = keyPosition.mPercentX;
        }
        float f11 = motionPaths.f383mX;
        float f12 = motionPaths.mWidth;
        float f13 = motionPaths.f384mY;
        float f14 = motionPaths.mHeight;
        float f15 = f6;
        float f16 = (motionPaths2.f383mX + (motionPaths2.mWidth / 2.0f)) - ((f12 / 2.0f) + f11);
        float f17 = (motionPaths2.f384mY + (motionPaths2.mHeight / 2.0f)) - ((f14 / 2.0f) + f13);
        float f18 = f16 * f15;
        float f19 = (f9 * f7) / 2.0f;
        this.f383mX = (int) ((f11 + f18) - f19);
        float f20 = f17 * f15;
        float f21 = (f10 * f8) / 2.0f;
        this.f384mY = (int) ((f13 + f20) - f21);
        this.mWidth = (int) (f12 + r7);
        this.mHeight = (int) (f14 + r8);
        float f22 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f23 = (int) ((motionPaths.f383mX + f18) - f19);
        float f24 = (int) ((motionPaths.f384mY + f20) - f21);
        this.f383mX = f23 + ((-f17) * f22);
        this.f384mY = f24 + (f16 * f22);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i6, int i7, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f6;
        float f7 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f7;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f8 = Float.isNaN(keyPosition.mPercentWidth) ? f7 : keyPosition.mPercentWidth;
        float f9 = Float.isNaN(keyPosition.mPercentHeight) ? f7 : keyPosition.mPercentHeight;
        float f10 = motionPaths2.mWidth;
        float f11 = motionPaths.mWidth;
        float f12 = motionPaths2.mHeight;
        float f13 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f11 + ((f10 - f11) * f8));
        this.mHeight = (int) (f13 + ((f12 - f13) * f9));
        if (keyPosition.mPositionType != 2) {
            float f14 = Float.isNaN(keyPosition.mPercentX) ? f7 : keyPosition.mPercentX;
            float f15 = motionPaths2.f383mX;
            float f16 = motionPaths.f383mX;
            this.f383mX = (f14 * (f15 - f16)) + f16;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f7 = keyPosition.mPercentY;
            }
            float f17 = motionPaths2.f384mY;
            float f18 = motionPaths.f384mY;
            this.f384mY = (f7 * (f17 - f18)) + f18;
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f19 = motionPaths2.f383mX;
                float f20 = motionPaths.f383mX;
                fMin = ((f19 - f20) * f7) + f20;
            } else {
                fMin = Math.min(f9, f8) * keyPosition.mPercentX;
            }
            this.f383mX = fMin;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f21 = motionPaths2.f384mY;
                float f22 = motionPaths.f384mY;
                f6 = (f7 * (f21 - f22)) + f22;
            } else {
                f6 = keyPosition.mPercentY;
            }
            this.f384mY = f6;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i6, int i7, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f6 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f6;
        this.mDrawPath = keyPosition.mDrawPath;
        float f7 = Float.isNaN(keyPosition.mPercentWidth) ? f6 : keyPosition.mPercentWidth;
        float f8 = Float.isNaN(keyPosition.mPercentHeight) ? f6 : keyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth;
        float f10 = motionPaths.mWidth;
        float f11 = motionPaths2.mHeight;
        float f12 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f13 = motionPaths.f383mX;
        float f14 = motionPaths.f384mY;
        float f15 = motionPaths2.f383mX + (f9 / 2.0f);
        float f16 = motionPaths2.f384mY + (f11 / 2.0f);
        float f17 = (f9 - f10) * f7;
        this.f383mX = (int) ((f13 + ((f15 - ((f10 / 2.0f) + f13)) * f6)) - (f17 / 2.0f));
        float f18 = (f11 - f12) * f8;
        this.f384mY = (int) ((f14 + ((f16 - (f14 + (f12 / 2.0f))) * f6)) - (f18 / 2.0f));
        this.mWidth = (int) (f10 + f17);
        this.mHeight = (int) (f12 + f18);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f383mX = (int) (keyPosition.mPercentX * (i6 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f384mY = (int) (keyPosition.mPercentY * (i7 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f6, float f7, float f8, float f9) {
        this.f383mX = f6;
        this.f384mY = f7;
        this.mWidth = f8;
        this.mHeight = f9;
    }

    public void setDpDt(float f6, float f7, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f12 = (float) dArr[i6];
            double d6 = dArr2[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f8 = f12;
            } else if (i7 == 2) {
                f10 = f12;
            } else if (i7 == 3) {
                f9 = f12;
            } else if (i7 == 4) {
                f11 = f12;
            }
        }
        float f13 = f8 - ((0.0f * f9) / 2.0f);
        float f14 = f10 - ((0.0f * f11) / 2.0f);
        fArr[0] = (f13 * (1.0f - f6)) + (((f9 * 1.0f) + f13) * f6) + 0.0f;
        fArr[1] = (f14 * (1.0f - f7)) + (((f11 * 1.0f) + f14) * f7) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setView(float f6, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z6) {
        float f7;
        float fSin = this.f383mX;
        float fCos = this.f384mY;
        float f8 = this.mWidth;
        float f9 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i6 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i6];
            this.mTempDelta = new double[i6];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            double[] dArr4 = this.mTempValue;
            int i8 = iArr[i7];
            dArr4[i8] = dArr[i7];
            this.mTempDelta[i8] = dArr2[i7];
        }
        float f10 = Float.NaN;
        int i9 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i9 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i9]) && (dArr3 == null || dArr3[i9] == 0.0d)) {
                f7 = f10;
            } else {
                double d6 = dArr3 != null ? dArr3[i9] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i9])) {
                    d6 = this.mTempValue[i9] + d6;
                }
                f7 = f10;
                float f15 = (float) d6;
                float f16 = (float) this.mTempDelta[i9];
                if (i9 == 1) {
                    f10 = f7;
                    f11 = f16;
                    fSin = f15;
                } else if (i9 == 2) {
                    f10 = f7;
                    f12 = f16;
                    fCos = f15;
                } else if (i9 == 3) {
                    f10 = f7;
                    f13 = f16;
                    f8 = f15;
                } else if (i9 == 4) {
                    f10 = f7;
                    f14 = f16;
                    f9 = f15;
                } else if (i9 == 5) {
                    f10 = f15;
                }
                i9++;
            }
            f10 = f7;
            i9++;
        }
        float f17 = f10;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f6, fArr, fArr2);
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr2[0];
            float f21 = fArr2[1];
            double d7 = f18;
            double d8 = fSin;
            double d9 = fCos;
            fSin = (float) ((d7 + (Math.sin(d9) * d8)) - (f8 / 2.0f));
            fCos = (float) ((f19 - (Math.cos(d9) * d8)) - (f9 / 2.0f));
            double d10 = f20;
            double d11 = f11;
            double dSin = d10 + (Math.sin(d9) * d11);
            double dCos = Math.cos(d9) * d8;
            double d12 = f12;
            float f22 = (float) (dSin + (dCos * d12));
            float fCos2 = (float) ((f21 - (d11 * Math.cos(d9))) + (Math.sin(d9) * d8 * d12));
            if (dArr2.length >= 2) {
                dArr2[0] = f22;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f17)) {
                view.setRotation((float) (f17 + Math.toDegrees(Math.atan2(fCos2, f22))));
            }
        } else if (!Float.isNaN(f17)) {
            view.setRotation(f17 + ((float) Math.toDegrees(Math.atan2(f12 + (f14 / 2.0f), f11 + (f13 / 2.0f)))) + 0.0f);
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(fSin, fCos, f8 + fSin, f9 + fCos);
            return;
        }
        float f23 = fSin + 0.5f;
        int i10 = (int) f23;
        float f24 = fCos + 0.5f;
        int i11 = (int) f24;
        int i12 = (int) (f23 + f8);
        int i13 = (int) (f24 + f9);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != view.getMeasuredWidth() || i15 != view.getMeasuredHeight() || z6) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i14, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i15, BasicMeasure.EXACTLY));
        }
        view.layout(i10, i11, i12, i13);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d6 = ((this.f383mX + (this.mWidth / 2.0f)) - motionPaths.f383mX) - (motionPaths.mWidth / 2.0f);
        double d7 = ((this.f384mY + (this.mHeight / 2.0f)) - motionPaths.f384mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.f383mX = (float) Math.hypot(d7, d6);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f384mY = (float) (Math.atan2(d7, d6) + 1.5707963267948966d);
        } else {
            this.f384mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public MotionPaths(int i6, int i7, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i8 = Key.UNSET;
        this.mPathMotionArc = i8;
        this.mAnimateRelativeTo = i8;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i6, i7, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i9 = keyPosition.mPositionType;
        if (i9 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i9 == 2) {
            initScreen(i6, i7, keyPosition, motionPaths, motionPaths2);
        } else if (i9 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d6, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f6;
        float fSin = this.f383mX;
        float fCos = this.f384mY;
        float f7 = this.mWidth;
        float f8 = this.mHeight;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f13 = (float) dArr[i6];
            float f14 = (float) dArr2[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                fSin = f13;
                f9 = f14;
            } else if (i7 == 2) {
                fCos = f13;
                f11 = f14;
            } else if (i7 == 3) {
                f7 = f13;
                f10 = f14;
            } else if (i7 == 4) {
                f8 = f13;
                f12 = f14;
            }
        }
        float f15 = (f10 / 2.0f) + f9;
        float fCos2 = (f12 / 2.0f) + f11;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d6, fArr3, fArr4);
            float f16 = fArr3[0];
            float f17 = fArr3[1];
            float f18 = fArr4[0];
            float f19 = fArr4[1];
            f6 = 2.0f;
            double d7 = fSin;
            double d8 = fCos;
            fSin = (float) ((f16 + (Math.sin(d8) * d7)) - (f7 / 2.0f));
            fCos = (float) ((f17 - (Math.cos(d8) * d7)) - (f8 / 2.0f));
            double d9 = f9;
            double dSin = f18 + (Math.sin(d8) * d9);
            double d10 = f11;
            float fCos3 = (float) (dSin + (Math.cos(d8) * d10));
            fCos2 = (float) ((f19 - (d9 * Math.cos(d8))) + (Math.sin(d8) * d10));
            f15 = fCos3;
        } else {
            f6 = 2.0f;
        }
        fArr[0] = fSin + (f7 / f6) + 0.0f;
        fArr[1] = fCos + (f8 / f6) + 0.0f;
        fArr2[0] = f15;
        fArr2[1] = fCos2;
    }
}
