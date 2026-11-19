package androidx.constraintlayout.core.motion;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {RequestParameters.POSITION, "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    String mAnimateRelativeTo;
    HashMap<String, CustomVariable> mCustomAttributes;
    int mDrawPath;
    float mHeight;
    public String mId;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mPosition;
    float mProgress;
    float mRelativeAngle;
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;

    /* renamed from: mX */
    float f948mX;

    /* renamed from: mY */
    float f949mY;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = null;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mCustomAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f, float f7) {
        return (Float.isNaN(f) || Float.isNaN(f7)) ? Float.isNaN(f) != Float.isNaN(f7) : Math.abs(f - f7) > 1.0E-6f;
    }

    private static float xRotate(float f, float f7, float f8, float f9, float f10, float f11) {
        return (((f10 - f8) * f7) - ((f11 - f9) * f)) + f8;
    }

    private static float yRotate(float f, float f7, float f8, float f9, float f10, float f11) {
        return ((f11 - f9) * f7) + ((f10 - f8) * f) + f9;
    }

    public void applyParameters(MotionWidget motionWidget) {
        ConstraintWidget constraintWidget;
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.mMotion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.mMotion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.mPropertySet.mProgress;
        WidgetFrame widgetFrame = motionWidget.mWidgetFrame;
        if (widgetFrame != null && (constraintWidget = widgetFrame.widget) != null) {
            this.mRelativeAngle = constraintWidget.mCircleConstraintAngle;
        }
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z8) {
        boolean zDiff = diff(this.f948mX, motionPaths.f948mX);
        boolean zDiff2 = diff(this.f949mY, motionPaths.f949mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        zArr[1] = zArr[1] | (zDiff || zDiff2 || z8);
        zArr[2] = zArr[2] | (zDiff || zDiff2 || z8);
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.f948mX, this.f949mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i = 0;
        for (int i8 : iArr) {
            if (i8 < 6) {
                dArr[i] = fArr[r1];
                i++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.mWidth;
        float f7 = this.mHeight;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f8 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 3) {
                f = f8;
            } else if (i9 == 4) {
                f7 = f8;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f7;
    }

    public void getCenter(double d9, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fM76a = this.f948mX;
        float fCos = this.f949mY;
        float f = this.mWidth;
        float f7 = this.mHeight;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f8 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                fM76a = f8;
            } else if (i9 == 2) {
                fCos = f8;
            } else if (i9 == 3) {
                f = f8;
            } else if (i9 == 4) {
                f7 = f8;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d9, fArr2, new float[2]);
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            double d10 = fM76a;
            double d11 = fCos;
            fM76a = (float) (AbstractC0037f.m76a(d11, d10, f9) - (f / 2.0f));
            fCos = (float) ((f10 - (Math.cos(d11) * d10)) - (f7 / 2.0f));
        }
        fArr[i] = (f / 2.0f) + fM76a + 0.0f;
        fArr[i + 1] = (f7 / 2.0f) + fCos + 0.0f;
    }

    public void getCenterVelocity(double d9, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fM76a = this.f948mX;
        float fCos = this.f949mY;
        float f = this.mWidth;
        float f7 = this.mHeight;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f8 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                fM76a = f8;
            } else if (i9 == 2) {
                fCos = f8;
            } else if (i9 == 3) {
                f = f8;
            } else if (i9 == 4) {
                f7 = f8;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d9, fArr2, new float[2]);
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            double d10 = fM76a;
            double d11 = fCos;
            fM76a = (float) (AbstractC0037f.m76a(d11, d10, f9) - (f / 2.0f));
            fCos = (float) ((f10 - (Math.cos(d11) * d10)) - (f7 / 2.0f));
        }
        fArr[i] = (f / 2.0f) + fM76a + 0.0f;
        fArr[i + 1] = (f7 / 2.0f) + fCos + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i) {
        CustomVariable customVariable = this.mCustomAttributes.get(str);
        int i8 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i] = customVariable.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i8 < iNumberOfInterpolatedValues) {
            dArr[i] = r2[i8];
            i8++;
            i++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.mCustomAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float fM76a = this.f948mX;
        float fCos = this.f949mY;
        float f = this.mWidth;
        float f7 = this.mHeight;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f8 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                fM76a = f8;
            } else if (i9 == 2) {
                fCos = f8;
            } else if (i9 == 3) {
                f = f8;
            } else if (i9 == 4) {
                f7 = f8;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d9 = fM76a;
            double d10 = fCos;
            fM76a = (float) (AbstractC0037f.m76a(d10, d9, centerX) - (f / 2.0f));
            fCos = (float) ((centerY - (Math.cos(d10) * d9)) - (f7 / 2.0f));
        }
        float f9 = f + fM76a;
        float f10 = f7 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = fM76a + 0.0f;
        fArr[i + 1] = fCos + 0.0f;
        fArr[i + 2] = f9 + 0.0f;
        fArr[i + 3] = fCos + 0.0f;
        fArr[i + 4] = f9 + 0.0f;
        fArr[i + 5] = f10 + 0.0f;
        fArr[i + 6] = fM76a + 0.0f;
        fArr[i + 7] = f10 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mCustomAttributes.containsKey(str);
    }

    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f7 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f8 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth;
        float f10 = motionPaths.mWidth;
        float f11 = f9 - f10;
        float f12 = motionPaths2.mHeight;
        float f13 = motionPaths.mHeight;
        float f14 = f12 - f13;
        this.mPosition = this.mTime;
        float f15 = motionPaths.f948mX;
        float f16 = motionPaths.f949mY;
        float f17 = f;
        float f18 = ((f9 / 2.0f) + motionPaths2.f948mX) - ((f10 / 2.0f) + f15);
        float f19 = ((f12 / 2.0f) + motionPaths2.f949mY) - ((f13 / 2.0f) + f16);
        float f20 = (f11 * f7) / 2.0f;
        this.f948mX = (int) (((f18 * f17) + f15) - f20);
        float f21 = (f14 * f8) / 2.0f;
        this.f949mY = (int) (((f19 * f17) + f16) - f21);
        this.mWidth = (int) (f10 + r9);
        this.mHeight = (int) (f13 + r12);
        float f22 = Float.isNaN(motionKeyPosition.mPercentX) ? f17 : motionKeyPosition.mPercentX;
        float f23 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f17 = motionKeyPosition.mPercentY;
        }
        float f24 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.f948mX = (int) (((f24 * f19) + ((f22 * f18) + motionPaths.f948mX)) - f20);
        this.f949mY = (int) (((f19 * f17) + ((f18 * f23) + motionPaths.f949mY)) - f21);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f7 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f8 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth - motionPaths.mWidth;
        float f10 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f = motionKeyPosition.mPercentX;
        }
        float f11 = motionPaths.f948mX;
        float f12 = motionPaths.mWidth;
        float f13 = motionPaths.f949mY;
        float f14 = motionPaths.mHeight;
        float f15 = f;
        float f16 = ((motionPaths2.mWidth / 2.0f) + motionPaths2.f948mX) - ((f12 / 2.0f) + f11);
        float f17 = ((motionPaths2.mHeight / 2.0f) + motionPaths2.f949mY) - ((f14 / 2.0f) + f13);
        float f18 = f16 * f15;
        float f19 = (f9 * f7) / 2.0f;
        this.f948mX = (int) ((f11 + f18) - f19);
        float f20 = f17 * f15;
        float f21 = (f10 * f8) / 2.0f;
        this.f949mY = (int) ((f13 + f20) - f21);
        this.mWidth = (int) (f12 + r7);
        this.mHeight = (int) (f14 + r8);
        float f22 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        this.mMode = 1;
        float f23 = (int) ((motionPaths.f948mX + f18) - f19);
        float f24 = (int) ((motionPaths.f949mY + f20) - f21);
        this.f948mX = f23 + ((-f17) * f22);
        this.f949mY = f24 + (f16 * f22);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPolar(int i, int i8, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float fM77b;
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        float f7 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f8 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth;
        float f10 = motionPaths.mWidth;
        float f11 = motionPaths2.mHeight;
        float f12 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (((f9 - f10) * f7) + f10);
        this.mHeight = (int) (((f11 - f12) * f8) + f12);
        int i9 = motionKeyPosition.mPositionType;
        if (i9 == 1) {
            float f13 = Float.isNaN(motionKeyPosition.mPercentX) ? f : motionKeyPosition.mPercentX;
            float f14 = motionPaths2.f948mX;
            float f15 = motionPaths.f948mX;
            this.f948mX = AbstractC0037f.m77b(f14, f15, f13, f15);
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f = motionKeyPosition.mPercentY;
            }
            float f16 = motionPaths2.f949mY;
            float f17 = motionPaths.f949mY;
            this.f949mY = AbstractC0037f.m77b(f16, f17, f, f17);
        } else if (i9 != 2) {
            float f18 = Float.isNaN(motionKeyPosition.mPercentX) ? f : motionKeyPosition.mPercentX;
            float f19 = motionPaths2.f948mX;
            float f20 = motionPaths.f948mX;
            this.f948mX = AbstractC0037f.m77b(f19, f20, f18, f20);
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f = motionKeyPosition.mPercentY;
            }
            float f21 = motionPaths2.f949mY;
            float f22 = motionPaths.f949mY;
            this.f949mY = AbstractC0037f.m77b(f21, f22, f, f22);
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f23 = motionPaths2.f948mX;
                float f24 = motionPaths.f948mX;
                fMin = AbstractC0037f.m77b(f23, f24, f, f24);
            } else {
                fMin = Math.min(f8, f7) * motionKeyPosition.mPercentX;
            }
            this.f948mX = fMin;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f25 = motionPaths2.f949mY;
                float f26 = motionPaths.f949mY;
                fM77b = AbstractC0037f.m77b(f25, f26, f, f26);
            } else {
                fM77b = motionKeyPosition.mPercentY;
            }
            this.f949mY = fM77b;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initScreen(int i, int i8, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f7 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f8 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f9 = motionPaths2.mWidth;
        float f10 = f9 - motionPaths.mWidth;
        float f11 = motionPaths2.mHeight;
        float f12 = f11 - motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f13 = motionPaths.f948mX;
        float f14 = motionPaths.f949mY;
        float f15 = (f9 / 2.0f) + motionPaths2.f948mX;
        float f16 = (f11 / 2.0f) + motionPaths2.f949mY;
        float f17 = f10 * f7;
        this.f948mX = (int) ((((f15 - ((r8 / 2.0f) + f13)) * f) + f13) - (f17 / 2.0f));
        float f18 = f12 * f8;
        this.f949mY = (int) ((((f16 - ((r11 / 2.0f) + f14)) * f) + f14) - (f18 / 2.0f));
        this.mWidth = (int) (r8 + f17);
        this.mHeight = (int) (r11 + f18);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f948mX = (int) (motionKeyPosition.mPercentX * (i - ((int) this.mWidth)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f949mY = (int) (motionKeyPosition.mPercentY * (i8 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setBounds(float f, float f7, float f8, float f9) {
        this.f948mX = f;
        this.f949mY = f7;
        this.mWidth = f8;
        this.mHeight = f9;
    }

    public void setDpDt(float f, float f7, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f12 = (float) dArr[i];
            int i8 = iArr[i];
            if (i8 == 1) {
                f8 = f12;
            } else if (i8 == 2) {
                f10 = f12;
            } else if (i8 == 3) {
                f9 = f12;
            } else if (i8 == 4) {
                f11 = f12;
            }
        }
        float fM1036D = AbstractC1923c.m1036D(0.0f, f9, 2.0f, f8);
        float fM1036D2 = AbstractC1923c.m1036D(0.0f, f11, 2.0f, f10);
        fArr[0] = (((f9 * 1.0f) + fM1036D) * f) + ((1.0f - f) * fM1036D) + 0.0f;
        fArr[1] = (((f11 * 1.0f) + fM1036D2) * f7) + ((1.0f - f7) * fM1036D2) + 0.0f;
    }

    public void setView(float f, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f7;
        float f8 = this.f948mX;
        float f9 = this.f949mY;
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i8 = 0; i8 < iArr.length; i8++) {
            double[] dArr4 = this.mTempValue;
            int i9 = iArr[i8];
            dArr4[i9] = dArr[i8];
            this.mTempDelta[i9] = dArr2[i8];
        }
        float f12 = Float.NaN;
        int i10 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i10 >= dArr5.length) {
                break;
            }
            boolean zIsNaN = Double.isNaN(dArr5[i10]);
            double d9 = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (zIsNaN && (dArr3 == null || dArr3[i10] == AudioStats.AUDIO_AMPLITUDE_NONE)) {
                f7 = f12;
            } else {
                if (dArr3 != null) {
                    d9 = dArr3[i10];
                }
                if (!Double.isNaN(this.mTempValue[i10])) {
                    d9 = this.mTempValue[i10] + d9;
                }
                f7 = f12;
                float f17 = (float) d9;
                float f18 = (float) this.mTempDelta[i10];
                if (i10 == 1) {
                    f12 = f7;
                    f13 = f18;
                    f8 = f17;
                } else if (i10 == 2) {
                    f12 = f7;
                    f14 = f18;
                    f9 = f17;
                } else if (i10 == 3) {
                    f12 = f7;
                    f15 = f18;
                    f10 = f17;
                } else if (i10 == 4) {
                    f12 = f7;
                    f16 = f18;
                    f11 = f17;
                } else if (i10 == 5) {
                    f12 = f17;
                }
                i10++;
            }
            f12 = f7;
            i10++;
        }
        float f19 = f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d10 = f20;
            double d11 = f8;
            double d12 = f9;
            float fM76a = (float) (AbstractC0037f.m76a(d12, d11, d10) - (f10 / 2.0f));
            float fCos = (float) ((f21 - (Math.cos(d12) * d11)) - (f11 / 2.0f));
            double d13 = f22;
            double d14 = f13;
            double d15 = f14;
            float fCos2 = (float) ((Math.cos(d12) * d11 * d15) + AbstractC0037f.m76a(d12, d14, d13));
            float fSin = (float) ((Math.sin(d12) * d11 * d15) + (f23 - (Math.cos(d12) * d14)));
            if (dArr2.length >= 2) {
                dArr2[0] = fCos2;
                dArr2[1] = fSin;
            }
            if (!Float.isNaN(f19)) {
                motionWidget.setRotationZ((float) (Math.toDegrees(Math.atan2(fSin, fCos2)) + f19));
            }
            f8 = fM76a;
            f9 = fCos;
        } else if (!Float.isNaN(f19)) {
            motionWidget.setRotationZ(((float) (Math.toDegrees(Math.atan2((f16 / 2.0f) + f14, (f15 / 2.0f) + f13)) + f19)) + 0.0f);
        }
        float f24 = f8 + 0.5f;
        float f25 = f9 + 0.5f;
        motionWidget.layout((int) f24, (int) f25, (int) (f24 + f10), (int) (f25 + f11));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d9 = (((this.mWidth / 2.0f) + this.f948mX) - motionPaths.f948mX) - (motionPaths.mWidth / 2.0f);
        double d10 = (((this.mHeight / 2.0f) + this.f949mY) - motionPaths.f949mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motion;
        this.f948mX = (float) Math.hypot(d10, d9);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f949mY = (float) (Math.atan2(d10, d9) + 1.5707963267948966d);
        } else {
            this.f949mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public MotionPaths(int i, int i8, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = null;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mCustomAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != null) {
            initPolar(i, i8, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i9 = motionKeyPosition.mPositionType;
        if (i9 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i9 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i8, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d9, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float fM76a = this.f948mX;
        float fCos = this.f949mY;
        float f7 = this.mWidth;
        float f8 = this.mHeight;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f13 = (float) dArr[i];
            float f14 = (float) dArr2[i];
            int i8 = iArr[i];
            if (i8 == 1) {
                fM76a = f13;
                f9 = f14;
            } else if (i8 == 2) {
                fCos = f13;
                f11 = f14;
            } else if (i8 == 3) {
                f7 = f13;
                f10 = f14;
            } else if (i8 == 4) {
                f8 = f13;
                f12 = f14;
            }
        }
        float f15 = (f10 / 2.0f) + f9;
        float fM76a2 = (f12 / 2.0f) + f11;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d9, fArr3, fArr4);
            float f16 = fArr3[0];
            float f17 = fArr3[1];
            float f18 = fArr4[0];
            float f19 = fArr4[1];
            f = 2.0f;
            double d10 = fM76a;
            double d11 = fCos;
            fM76a = (float) (AbstractC0037f.m76a(d11, d10, f16) - (f7 / 2.0f));
            fCos = (float) ((f17 - (Math.cos(d11) * d10)) - (f8 / 2.0f));
            double d12 = f9;
            double dM76a = AbstractC0037f.m76a(d11, d12, f18);
            double d13 = f11;
            float fCos2 = (float) ((Math.cos(d11) * d13) + dM76a);
            fM76a2 = (float) AbstractC0037f.m76a(d11, d13, f19 - (Math.cos(d11) * d12));
            f15 = fCos2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f7 / f) + fM76a + 0.0f;
        fArr[1] = (f8 / f) + fCos + 0.0f;
        fArr2[0] = f15;
        fArr2[1] = fM76a2;
    }
}
