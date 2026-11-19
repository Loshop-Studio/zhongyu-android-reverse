package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.Easing;
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
    float f1334mX;

    /* renamed from: mY */
    float f1335mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i9 = Key.UNSET;
        this.mPathMotionArc = i9;
        this.mAnimateRelativeTo = i9;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    private static float xRotate(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    private static float yRotate(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f14 - f12) * f10) + ((f15 - f13) * f11) + f13;
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

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z9) {
        boolean zDiff = diff(this.f1334mX, motionPaths.f1334mX);
        boolean zDiff2 = diff(this.f1335mY, motionPaths.f1335mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z10 = zDiff | zDiff2 | z9;
        zArr[1] = zArr[1] | z10;
        zArr[2] = z10 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.f1334mX, this.f1335mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i9 = 0;
        for (int i10 : iArr) {
            if (i10 < 6) {
                dArr[i9] = fArr[r1];
                i9++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i9) {
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f12 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        fArr[i9] = f10;
        fArr[i9 + 1] = f11;
    }

    public void getCenter(double d10, int[] iArr, double[] dArr, float[] fArr, int i9) {
        float fSin = this.f1334mX;
        float fCos = this.f1335mY;
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f12 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f12;
            } else if (i11 == 2) {
                fCos = f12;
            } else if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - (f10 / 2.0f));
            fCos = (float) ((f14 - (d12 * Math.cos(d13))) - (f11 / 2.0f));
        }
        fArr[i9] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i9 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    public void getCenterVelocity(double d10, int[] iArr, double[] dArr, float[] fArr, int i9) {
        float fSin = this.f1334mX;
        float fCos = this.f1335mY;
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f12 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f12;
            } else if (i11 == 2) {
                fCos = f12;
            } else if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - (f10 / 2.0f));
            fCos = (float) ((f14 - (d12 * Math.cos(d13))) - (f11 / 2.0f));
        }
        fArr[i9] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i9 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i9) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i10 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i9] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i10 < iNumberOfInterpolatedValues) {
            dArr[i9] = r2[i10];
            i10++;
            i9++;
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

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i9) {
        float f10 = this.f1334mX;
        float fCos = this.f1335mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f13 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f10 = f13;
            } else if (i11 == 2) {
                fCos = f13;
            } else if (i11 == 3) {
                f11 = f13;
            } else if (i11 == 4) {
                f12 = f13;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((centerX + (Math.sin(d11) * d10)) - (f11 / 2.0f));
            fCos = (float) ((centerY - (d10 * Math.cos(d11))) - (f12 / 2.0f));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i9] = f10 + 0.0f;
        fArr[i9 + 1] = fCos + 0.0f;
        fArr[i9 + 2] = f14 + 0.0f;
        fArr[i9 + 3] = fCos + 0.0f;
        fArr[i9 + 4] = f14 + 0.0f;
        fArr[i9 + 5] = f15 + 0.0f;
        fArr[i9 + 6] = f10 + 0.0f;
        fArr[i9 + 7] = f15 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f10;
        this.mDrawPath = keyPosition.mDrawPath;
        float f11 = Float.isNaN(keyPosition.mPercentWidth) ? f10 : keyPosition.mPercentWidth;
        float f12 = Float.isNaN(keyPosition.mPercentHeight) ? f10 : keyPosition.mPercentHeight;
        float f13 = motionPaths2.mWidth;
        float f14 = motionPaths.mWidth;
        float f15 = f13 - f14;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        float f18 = f16 - f17;
        this.mPosition = this.mTime;
        float f19 = (f14 / 2.0f) + motionPaths.f1334mX;
        float f20 = motionPaths.f1335mY + (f17 / 2.0f);
        float f21 = f10;
        float f22 = motionPaths2.f1334mX + (f13 / 2.0f);
        float f23 = motionPaths2.f1335mY + (f16 / 2.0f);
        if (f19 > f22) {
            f19 = f22;
            f22 = f19;
        }
        if (f20 <= f23) {
            f20 = f23;
            f23 = f20;
        }
        float f24 = f22 - f19;
        float f25 = f20 - f23;
        float f26 = (f15 * f11) / 2.0f;
        this.f1334mX = (int) ((r13 + (f24 * f21)) - f26);
        float f27 = (f18 * f12) / 2.0f;
        this.f1335mY = (int) ((r14 + (f25 * f21)) - f27);
        this.mWidth = (int) (f14 + r9);
        this.mHeight = (int) (f17 + r12);
        float f28 = Float.isNaN(keyPosition.mPercentX) ? f21 : keyPosition.mPercentX;
        float f29 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f21 = keyPosition.mPercentY;
        }
        float f30 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f1334mX = (int) (((motionPaths.f1334mX + (f28 * f24)) + (f30 * f25)) - f26);
        this.f1335mY = (int) (((motionPaths.f1335mY + (f24 * f29)) + (f25 * f21)) - f27);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f10;
        this.mDrawPath = keyPosition.mDrawPath;
        float f11 = Float.isNaN(keyPosition.mPercentWidth) ? f10 : keyPosition.mPercentWidth;
        float f12 = Float.isNaN(keyPosition.mPercentHeight) ? f10 : keyPosition.mPercentHeight;
        float f13 = motionPaths2.mWidth;
        float f14 = motionPaths.mWidth;
        float f15 = motionPaths2.mHeight;
        float f16 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f17 = motionPaths.f1334mX;
        float f18 = motionPaths.f1335mY;
        float f19 = f10;
        float f20 = (motionPaths2.f1334mX + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f21 = (motionPaths2.f1335mY + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f22 = ((f13 - f14) * f11) / 2.0f;
        this.f1334mX = (int) ((f17 + (f20 * f19)) - f22);
        float f23 = ((f15 - f16) * f12) / 2.0f;
        this.f1335mY = (int) ((f18 + (f21 * f19)) - f23);
        this.mWidth = (int) (f14 + r9);
        this.mHeight = (int) (f16 + r12);
        float f24 = Float.isNaN(keyPosition.mPercentX) ? f19 : keyPosition.mPercentX;
        float f25 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f19 = keyPosition.mPercentY;
        }
        float f26 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f1334mX = (int) (((motionPaths.f1334mX + (f24 * f20)) + (f26 * f21)) - f22);
        this.f1335mY = (int) (((motionPaths.f1335mY + (f20 * f25)) + (f21 * f19)) - f23);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f10;
        this.mDrawPath = keyPosition.mDrawPath;
        float f11 = Float.isNaN(keyPosition.mPercentWidth) ? f10 : keyPosition.mPercentWidth;
        float f12 = Float.isNaN(keyPosition.mPercentHeight) ? f10 : keyPosition.mPercentHeight;
        float f13 = motionPaths2.mWidth - motionPaths.mWidth;
        float f14 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f10 = keyPosition.mPercentX;
        }
        float f15 = motionPaths.f1334mX;
        float f16 = motionPaths.mWidth;
        float f17 = motionPaths.f1335mY;
        float f18 = motionPaths.mHeight;
        float f19 = f10;
        float f20 = (motionPaths2.f1334mX + (motionPaths2.mWidth / 2.0f)) - ((f16 / 2.0f) + f15);
        float f21 = (motionPaths2.f1335mY + (motionPaths2.mHeight / 2.0f)) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = (f13 * f11) / 2.0f;
        this.f1334mX = (int) ((f15 + f22) - f23);
        float f24 = f21 * f19;
        float f25 = (f14 * f12) / 2.0f;
        this.f1335mY = (int) ((f17 + f24) - f25);
        this.mWidth = (int) (f16 + r7);
        this.mHeight = (int) (f18 + r8);
        float f26 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f27 = (int) ((motionPaths.f1334mX + f22) - f23);
        float f28 = (int) ((motionPaths.f1335mY + f24) - f25);
        this.f1334mX = f27 + ((-f21) * f26);
        this.f1335mY = f28 + (f20 * f26);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i9, int i10, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f10;
        float f11 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f12 = Float.isNaN(keyPosition.mPercentWidth) ? f11 : keyPosition.mPercentWidth;
        float f13 = Float.isNaN(keyPosition.mPercentHeight) ? f11 : keyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f15 + ((f14 - f15) * f12));
        this.mHeight = (int) (f17 + ((f16 - f17) * f13));
        if (keyPosition.mPositionType != 2) {
            float f18 = Float.isNaN(keyPosition.mPercentX) ? f11 : keyPosition.mPercentX;
            float f19 = motionPaths2.f1334mX;
            float f20 = motionPaths.f1334mX;
            this.f1334mX = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f11 = keyPosition.mPercentY;
            }
            float f21 = motionPaths2.f1335mY;
            float f22 = motionPaths.f1335mY;
            this.f1335mY = (f11 * (f21 - f22)) + f22;
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f23 = motionPaths2.f1334mX;
                float f24 = motionPaths.f1334mX;
                fMin = ((f23 - f24) * f11) + f24;
            } else {
                fMin = Math.min(f13, f12) * keyPosition.mPercentX;
            }
            this.f1334mX = fMin;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f25 = motionPaths2.f1335mY;
                float f26 = motionPaths.f1335mY;
                f10 = (f11 * (f25 - f26)) + f26;
            } else {
                f10 = keyPosition.mPercentY;
            }
            this.f1335mY = f10;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i9, int i10, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f10 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f10;
        this.mDrawPath = keyPosition.mDrawPath;
        float f11 = Float.isNaN(keyPosition.mPercentWidth) ? f10 : keyPosition.mPercentWidth;
        float f12 = Float.isNaN(keyPosition.mPercentHeight) ? f10 : keyPosition.mPercentHeight;
        float f13 = motionPaths2.mWidth;
        float f14 = motionPaths.mWidth;
        float f15 = motionPaths2.mHeight;
        float f16 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f17 = motionPaths.f1334mX;
        float f18 = motionPaths.f1335mY;
        float f19 = motionPaths2.f1334mX + (f13 / 2.0f);
        float f20 = motionPaths2.f1335mY + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f1334mX = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f1335mY = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.mWidth = (int) (f14 + f21);
        this.mHeight = (int) (f16 + f22);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f1334mX = (int) (keyPosition.mPercentX * (i9 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f1335mY = (int) (keyPosition.mPercentY * (i10 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f10, float f11, float f12, float f13) {
        this.f1334mX = f10;
        this.f1335mY = f11;
        this.mWidth = f12;
        this.mHeight = f13;
    }

    public void setDpDt(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f16 = (float) dArr[i9];
            double d10 = dArr2[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f12 = f16;
            } else if (i10 == 2) {
                f14 = f16;
            } else if (i10 == 3) {
                f13 = f16;
            } else if (i10 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setView(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z9) {
        float f11;
        float fSin = this.f1334mX;
        float fCos = this.f1335mY;
        float f12 = this.mWidth;
        float f13 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i9 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i9];
            this.mTempDelta = new double[i9];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            double[] dArr4 = this.mTempValue;
            int i11 = iArr[i10];
            dArr4[i11] = dArr[i10];
            this.mTempDelta[i11] = dArr2[i10];
        }
        float f14 = Float.NaN;
        int i12 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i12 >= dArr5.length) {
                break;
            }
            boolean zIsNaN = Double.isNaN(dArr5[i12]);
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (zIsNaN && (dArr3 == null || dArr3[i12] == AudioStats.AUDIO_AMPLITUDE_NONE)) {
                f11 = f14;
            } else {
                if (dArr3 != null) {
                    d10 = dArr3[i12];
                }
                if (!Double.isNaN(this.mTempValue[i12])) {
                    d10 = this.mTempValue[i12] + d10;
                }
                f11 = f14;
                float f19 = (float) d10;
                float f20 = (float) this.mTempDelta[i12];
                if (i12 == 1) {
                    f14 = f11;
                    f15 = f20;
                    fSin = f19;
                } else if (i12 == 2) {
                    f14 = f11;
                    f16 = f20;
                    fCos = f19;
                } else if (i12 == 3) {
                    f14 = f11;
                    f17 = f20;
                    f12 = f19;
                } else if (i12 == 4) {
                    f14 = f11;
                    f18 = f20;
                    f13 = f19;
                } else if (i12 == 5) {
                    f14 = f19;
                }
                i12++;
            }
            f14 = f11;
            i12++;
        }
        float f21 = f14;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f10, fArr, fArr2);
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            double d11 = f22;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - (f12 / 2.0f));
            fCos = (float) ((f23 - (Math.cos(d13) * d12)) - (f13 / 2.0f));
            double d14 = f24;
            double d15 = f15;
            double dSin = d14 + (Math.sin(d13) * d15);
            double dCos = Math.cos(d13) * d12;
            double d16 = f16;
            float f26 = (float) (dSin + (dCos * d16));
            float fCos2 = (float) ((f25 - (d15 * Math.cos(d13))) + (Math.sin(d13) * d12 * d16));
            if (dArr2.length >= 2) {
                dArr2[0] = f26;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f21)) {
                view.setRotation((float) (f21 + Math.toDegrees(Math.atan2(fCos2, f26))));
            }
        } else if (!Float.isNaN(f21)) {
            view.setRotation(f21 + ((float) Math.toDegrees(Math.atan2(f16 + (f18 / 2.0f), f15 + (f17 / 2.0f)))) + 0.0f);
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(fSin, fCos, f12 + fSin, f13 + fCos);
            return;
        }
        float f27 = fSin + 0.5f;
        int i13 = (int) f27;
        float f28 = fCos + 0.5f;
        int i14 = (int) f28;
        int i15 = (int) (f27 + f12);
        int i16 = (int) (f28 + f13);
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        if (i17 != view.getMeasuredWidth() || i18 != view.getMeasuredHeight() || z9) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
        }
        view.layout(i13, i14, i15, i16);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d10 = ((this.f1334mX + (this.mWidth / 2.0f)) - motionPaths.f1334mX) - (motionPaths.mWidth / 2.0f);
        double d11 = ((this.f1335mY + (this.mHeight / 2.0f)) - motionPaths.f1335mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.f1334mX = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f1335mY = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f1335mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public MotionPaths(int i9, int i10, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i11 = Key.UNSET;
        this.mPathMotionArc = i11;
        this.mAnimateRelativeTo = i11;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i9, i10, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i12 = keyPosition.mPositionType;
        if (i12 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i12 == 2) {
            initScreen(i9, i10, keyPosition, motionPaths, motionPaths2);
        } else if (i12 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float fSin = this.f1334mX;
        float fCos = this.f1335mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f17 = (float) dArr[i9];
            float f18 = (float) dArr2[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                fSin = f17;
                f13 = f18;
            } else if (i10 == 2) {
                fCos = f17;
                f15 = f18;
            } else if (i10 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i10 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = (f14 / 2.0f) + f13;
        float fCos2 = (f16 / 2.0f) + f15;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d10, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            f10 = 2.0f;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) ((f20 + (Math.sin(d12) * d11)) - (f11 / 2.0f));
            fCos = (float) ((f21 - (Math.cos(d12) * d11)) - (f12 / 2.0f));
            double d13 = f13;
            double dSin = f22 + (Math.sin(d12) * d13);
            double d14 = f15;
            float fCos3 = (float) (dSin + (Math.cos(d12) * d14));
            fCos2 = (float) ((f23 - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f19 = fCos3;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = fSin + (f11 / f10) + 0.0f;
        fArr[1] = fCos + (f12 / f10) + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = fCos2;
    }
}
