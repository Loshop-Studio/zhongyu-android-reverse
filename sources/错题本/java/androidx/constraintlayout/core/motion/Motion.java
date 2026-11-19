package androidx.constraintlayout.core.motion;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    String[] mAttributeTable;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    public String mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    Motion mRelativeMotion;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = 0;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int mMaxDimension = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f7 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f8 = this.mStaggerScale;
            if (f8 != 1.0d) {
                float f9 = this.mStaggerOffset;
                if (f < f9) {
                    f = 0.0f;
                }
                if (f > f9 && f < 1.0d) {
                    f = Math.min((f - f9) * f8, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        float f10 = Float.NaN;
        int i = 0;
        while (i < size) {
            MotionPaths motionPaths = arrayList.get(i);
            i++;
            MotionPaths motionPaths2 = motionPaths;
            Easing easing2 = motionPaths2.mKeyFrameEasing;
            if (easing2 != null) {
                float f11 = motionPaths2.mTime;
                if (f11 < f) {
                    easing = easing2;
                    f7 = f11;
                } else if (Float.isNaN(f10)) {
                    f10 = motionPaths2.mTime;
                }
            }
        }
        if (easing != null) {
            float f12 = (Float.isNaN(f10) ? 1.0f : f10) - f7;
            double d9 = (f - f7) / f12;
            f = (((float) easing.get(d9)) * f12) + f7;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d9);
            }
        }
        return f;
    }

    private static DifferentialInterpolator getInterpolator(int i, String str, int i8) {
        if (i != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1

            /* renamed from: mX */
            float f945mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f) {
                this.f945mX = f;
                return (float) interpolator.get(f);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) interpolator.getDiff(this.f945mX);
            }
        };
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d9 = 0.0d;
        double d10 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f7 = i * f;
            double d11 = f7;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f8 = Float.NaN;
            int i8 = 0;
            float f9 = 0.0f;
            while (i8 < size) {
                MotionPaths motionPaths = arrayList.get(i8);
                i8++;
                MotionPaths motionPaths2 = motionPaths;
                float f10 = f;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f11 = motionPaths2.mTime;
                    if (f11 < f7) {
                        f9 = f11;
                        easing = easing2;
                    } else if (Float.isNaN(f8)) {
                        f8 = motionPaths2.mTime;
                    }
                }
                f = f10;
            }
            float f12 = f;
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d11 = (((float) easing.get((f7 - f9) / r17)) * (f8 - f9)) + f9;
            }
            double d12 = d11;
            this.mSpline[0].getPos(d12, this.mInterpolateData);
            int i9 = i;
            this.mStartMotionPath.getCenter(d12, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i9 > 0) {
                fHypot += (float) Math.hypot(d10 - fArr[1], d9 - fArr[0]);
            }
            d9 = fArr[0];
            d10 = fArr[1];
            i = i9 + 1;
            f = f12;
        }
        return fHypot;
    }

    private void insertKey(MotionPaths motionPaths) {
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        MotionPaths motionPaths2 = null;
        int i = 0;
        while (i < size) {
            MotionPaths motionPaths3 = arrayList.get(i);
            i++;
            MotionPaths motionPaths4 = motionPaths3;
            if (motionPaths.mPosition == motionPaths4.mPosition) {
                motionPaths2 = motionPaths4;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    public void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i) {
        float f = 1.0f;
        float f7 = 1.0f / (i - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            map4.get("translationY");
        }
        int i8 = 0;
        while (i8 < i) {
            float fMin = i8 * f7;
            float f8 = this.mStaggerScale;
            float f9 = 0.0f;
            if (f8 != f) {
                float f10 = this.mStaggerOffset;
                if (fMin < f10) {
                    fMin = 0.0f;
                }
                if (fMin > f10 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f10) * f8, f);
                }
            }
            double d9 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f11 = Float.NaN;
            int i9 = 0;
            while (i9 < size) {
                MotionPaths motionPaths = arrayList.get(i9);
                i9++;
                MotionPaths motionPaths2 = motionPaths;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f12 = motionPaths2.mTime;
                    if (f12 < fMin) {
                        easing = easing2;
                        f9 = f12;
                    } else if (Float.isNaN(f11)) {
                        f11 = motionPaths2.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d9 = (((float) easing.get((fMin - f9) / r13)) * (f11 - f9)) + f9;
            }
            this.mSpline[0].getPos(d9, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d9, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i8 * 2);
            i8++;
            f = 1.0f;
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            int i = 0;
            int i8 = 0;
            while (i8 < size) {
                MotionPaths motionPaths = arrayList.get(i8);
                i8++;
                iArr[i] = motionPaths.mMode;
                i++;
            }
        }
        int i9 = 0;
        for (double d9 : timePoints) {
            this.mSpline[0].getPos(d9, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
        }
        return i9 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            int i = 0;
            int i8 = 0;
            while (i8 < size) {
                MotionPaths motionPaths = arrayList.get(i8);
                i8++;
                iArr[i] = motionPaths.mMode;
                i++;
            }
        }
        if (iArr2 != null) {
            ArrayList<MotionPaths> arrayList2 = this.mMotionPaths;
            int size2 = arrayList2.size();
            int i9 = 0;
            int i10 = 0;
            while (i10 < size2) {
                MotionPaths motionPaths2 = arrayList2.get(i10);
                i10++;
                iArr2[i9] = (int) (motionPaths2.mPosition * 100.0f);
                i9++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < timePoints.length; i12++) {
            this.mSpline[0].getPos(timePoints[i12], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i12], this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public void buildPath(float[] fArr, int i) {
        int i8 = i;
        float f = 1.0f;
        float f7 = 1.0f / (i8 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i9 = 0;
        while (i9 < i8) {
            float fMin = i9 * f7;
            float f8 = this.mStaggerScale;
            float f9 = 0.0f;
            if (f8 != f) {
                float f10 = this.mStaggerOffset;
                if (fMin < f10) {
                    fMin = 0.0f;
                }
                if (fMin > f10 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f10) * f8, f);
                }
            }
            double d9 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f11 = Float.NaN;
            int i10 = 0;
            while (i10 < size) {
                MotionPaths motionPaths = arrayList.get(i10);
                i10++;
                MotionPaths motionPaths2 = motionPaths;
                float f12 = f7;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f13 = motionPaths2.mTime;
                    if (f13 < fMin) {
                        f9 = f13;
                        easing = easing2;
                    } else if (Float.isNaN(f11)) {
                        f11 = motionPaths2.mTime;
                    }
                }
                f7 = f12;
            }
            float f14 = f7;
            if (easing != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d9 = (((float) easing.get((fMin - f9) / r17)) * (f11 - f9)) + f9;
            }
            this.mSpline[0].getPos(d9, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d9, dArr);
                }
            }
            int i11 = i9 * 2;
            this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
            if (keyCycleOscillator != null) {
                fArr[i11] = keyCycleOscillator.get(fMin) + fArr[i11];
            } else if (splineSet != null) {
                fArr[i11] = splineSet.get(fMin) + fArr[i11];
            }
            if (keyCycleOscillator2 != null) {
                int i12 = i11 + 1;
                fArr[i12] = keyCycleOscillator2.get(fMin) + fArr[i12];
            } else if (splineSet2 != null) {
                int i13 = i11 + 1;
                fArr[i13] = splineSet2.get(fMin) + fArr[i13];
            }
            i9++;
            i8 = i;
            f7 = f14;
            f = 1.0f;
        }
    }

    public void buildRect(float f, float[] fArr, int i) {
        this.mSpline[0].getPos(getAdjustedPosition(f, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    public void buildRectangles(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i8 = 0; i8 < i; i8++) {
            this.mSpline[0].getPos(getAdjustedPosition(i8 * f, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i8 * 8);
        }
    }

    public void endTrigger(boolean z8) {
    }

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr[i8] = splineSet.get(i8 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d9, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d9, dArr);
        this.mSpline[0].getSlope(d9, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f, float f7, float f8, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f9 = motionPaths.f948mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f948mX;
            float f11 = motionPaths.f949mY - motionPaths2.f949mY;
            float f12 = motionPaths.mWidth - motionPaths2.mWidth;
            float f13 = (motionPaths.mHeight - motionPaths2.mHeight) + f11;
            fArr[0] = ((f12 + f10) * f7) + ((1.0f - f7) * f10);
            fArr[1] = (f13 * f8) + ((1.0f - f8) * f11);
            return;
        }
        double d9 = adjustedPosition;
        curveFitArr[0].getSlope(d9, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d9, this.mInterpolateData);
        float f14 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f14;
            i++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d9, dArr2);
            this.mArcSpline.getSlope(d9, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            MotionPaths motionPaths = arrayList.get(i);
            i++;
            iMax = Math.max(iMax, motionPaths.mDrawPath);
        }
        return Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.mHeight;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.mWidth;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f948mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f949mY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            int i11 = i8 + 1;
            MotionKey motionKey = arrayList.get(i8);
            int i12 = motionKey.mType;
            if (i12 == i || i != -1) {
                iArr[i10] = 0;
                iArr[i10 + 1] = i12;
                int i13 = motionKey.mFramePosition;
                iArr[i10 + 2] = i13;
                double d9 = i13 / 100.0f;
                this.mSpline[0].getPos(d9, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i10 + 3] = Float.floatToIntBits(fArr[0]);
                int i14 = i10 + 4;
                iArr[i14] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i10 + 5] = motionKeyPosition.mPositionType;
                    iArr[i10 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i14 = i10 + 7;
                    iArr[i14] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i15 = i14 + 1;
                iArr[i10] = i15 - i10;
                i9++;
                i10 = i15;
            }
            i8 = i11;
        }
        return i9;
    }

    public float getKeyFrameParameter(int i, float f, float f7) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f8 = motionPaths.f948mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f9 = motionPaths2.f948mX;
        float f10 = f8 - f9;
        float f11 = motionPaths.f949mY;
        float f12 = motionPaths2.f949mY;
        float f13 = f11 - f12;
        float f14 = (motionPaths2.mWidth / 2.0f) + f9;
        float f15 = (motionPaths2.mHeight / 2.0f) + f12;
        float fHypot = (float) Math.hypot(f10, f13);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f16 = f - f14;
        float f17 = f7 - f15;
        if (((float) Math.hypot(f16, f17)) == 0.0f) {
            return 0.0f;
        }
        float f18 = (f17 * f13) + (f16 * f10);
        if (i == 0) {
            return f18 / fHypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f18 * f18));
        }
        if (i == 2) {
            return f16 / f10;
        }
        if (i == 3) {
            return f17 / f10;
        }
        if (i == 4) {
            return f16 / f13;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f17 / f13;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            int i10 = i8 + 1;
            MotionKey motionKey = arrayList.get(i8);
            int i11 = motionKey.mFramePosition;
            iArr[i] = (motionKey.mType * 1000) + i11;
            double d9 = i11 / 100.0f;
            this.mSpline[0].getPos(d9, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
            i8 = i10;
            i++;
        }
        return i;
    }

    public float getMotionStagger() {
        return this.mMotionStagger;
    }

    public double[] getPos(double d9) {
        this.mSpline[0].getPos(d9, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d9, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public MotionKeyPosition getPositionKeyframe(int i, int i8, float f, float f7) {
        int i9;
        int i10;
        float f8;
        float f9;
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f948mX;
        floatRect.left = f10;
        float f11 = motionPaths.f949mY;
        floatRect.f11676top = f11;
        floatRect.right = f10 + motionPaths.mWidth;
        floatRect.bottom = f11 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f948mX;
        floatRect2.left = f12;
        float f13 = motionPaths2.f949mY;
        floatRect2.f11676top = f13;
        floatRect2.right = f12 + motionPaths2.mWidth;
        floatRect2.bottom = f13 + motionPaths2.mHeight;
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            MotionKey motionKey = arrayList.get(i11);
            if (motionKey instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                i9 = i;
                i10 = i8;
                f8 = f;
                f9 = f7;
                if (motionKeyPosition.intersects(i9, i10, floatRect, floatRect2, f8, f9)) {
                    return motionKeyPosition;
                }
            } else {
                i9 = i;
                i10 = i8;
                f8 = f;
                f9 = f7;
            }
            i = i9;
            i8 = i10;
            f = f8;
            f7 = f9;
            i11 = i12;
        }
        return null;
    }

    public void getPostLayoutDvDp(float f, int i, int i8, float f7, float f8, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, SplineSet> map3 = this.mAttributesMap;
        SplineSet splineSet3 = map3 == null ? null : map3.get("rotationZ");
        HashMap<String, SplineSet> map4 = this.mAttributesMap;
        SplineSet splineSet4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, SplineSet> map5 = this.mAttributesMap;
        SplineSet splineSet5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, KeyCycleOscillator> map6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map6 == null ? null : map6.get("translationX");
        HashMap<String, KeyCycleOscillator> map7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, KeyCycleOscillator> map8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = map8 == null ? null : map8.get("rotationZ");
        HashMap<String, KeyCycleOscillator> map9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, KeyCycleOscillator> map10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = map10 != null ? map10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d9 = adjustedPosition;
                curveFit.getPos(d9, dArr);
                this.mArcSpline.getSlope(d9, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f7, f8, i, i8, fArr);
            return;
        }
        int i9 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f9 = motionPaths.f948mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f948mX;
            float f11 = motionPaths.f949mY - motionPaths2.f949mY;
            float f12 = motionPaths.mWidth - motionPaths2.mWidth;
            float f13 = f11 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = ((f12 + f10) * f7) + ((1.0f - f7) * f10);
            fArr[1] = (f13 * f8) + ((1.0f - f8) * f11);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f7, f8, i, i8, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f14 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i9 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f7, f8, i, i8, fArr);
                return;
            } else {
                dArr2[i9] = dArr2[i9] * f14;
                i9++;
            }
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.mHeight;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.mWidth;
    }

    public float getStartX() {
        return this.mStartMotionPath.f948mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f949mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f, long j7, KeyCache keyCache) {
        MotionWidget motionWidget2 = motionWidget;
        float adjustedPosition = getAdjustedPosition(f, null);
        int i = this.mQuantizeMotionSteps;
        if (i != -1) {
            float f7 = 1.0f / i;
            float fFloor = ((float) Math.floor(adjustedPosition / f7)) * f7;
            float f8 = (adjustedPosition % f7) / f7;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f8 = (f8 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((differentialInterpolator != null ? differentialInterpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + fFloor;
        }
        float f9 = adjustedPosition;
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            Iterator<SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f9);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d9 = f9;
            curveFitArr[0].getPos(d9, this.mInterpolateData);
            this.mSpline[0].getSlope(d9, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d9, dArr);
                    this.mArcSpline.getSlope(d9, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(f9, motionWidget2, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
                f9 = f9;
                motionWidget2 = motionWidget2;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget2.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (motionWidget2.getRight() - motionWidget2.getLeft() > 0 && motionWidget2.getBottom() - motionWidget2.getTop() > 0) {
                        motionWidget2.setPivotX(right - motionWidget2.getLeft());
                        motionWidget2.setPivotY(bottom - motionWidget2.getTop());
                    }
                }
            }
            int i8 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i8 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i8].getPos(d9, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i8 - 1]).setInterpolatedValue(motionWidget2, this.mValuesBuff);
                i8++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f9 <= 0.0f) {
                    motionWidget2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (f9 >= 1.0f) {
                    motionWidget2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    motionWidget2.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i9 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i9 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i9].conditionallyFire(f9, motionWidget2);
                    i9++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f10 = motionPaths.f948mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float fM77b = AbstractC0037f.m77b(motionPaths2.f948mX, f10, f9, f10);
            float f11 = motionPaths.f949mY;
            float fM77b2 = AbstractC0037f.m77b(motionPaths2.f949mY, f11, f9, f11);
            float f12 = motionPaths.mWidth;
            float fM77b3 = AbstractC0037f.m77b(motionPaths2.mWidth, f12, f9, f12);
            float f13 = motionPaths.mHeight;
            float f14 = fM77b + 0.5f;
            float f15 = fM77b2 + 0.5f;
            motionWidget2.layout((int) f14, (int) f15, (int) (f14 + fM77b3), (int) (f15 + AbstractC0037f.m77b(motionPaths2.mHeight, f13, f9, f13)));
        }
        HashMap<String, KeyCycleOscillator> map2 = this.mCycleMap;
        if (map2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget2, f9, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget2, f9);
                }
            }
        }
        return false;
    }

    public String name() {
        return this.mView.getName();
    }

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f, float f7, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f8 = motionPaths.f948mX;
        floatRect.left = f8;
        float f9 = motionPaths.f949mY;
        floatRect.f11676top = f9;
        floatRect.right = f8 + motionPaths.mWidth;
        floatRect.bottom = f9 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f10 = motionPaths2.f948mX;
        floatRect2.left = f10;
        float f11 = motionPaths2.f949mY;
        floatRect2.f11676top = f11;
        floatRect2.right = f10 + motionPaths2.mWidth;
        floatRect2.bottom = f11 + motionPaths2.mHeight;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f, f7, strArr, fArr);
    }

    public void rotate(Rect rect, Rect rect2, int i, int i8, int i9) {
        if (i == 1) {
            int i10 = rect.left + rect.right;
            rect2.left = ((rect.f11677top + rect.bottom) - rect.width()) / 2;
            rect2.f11677top = i9 - ((rect.height() + i10) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.f11677top;
            return;
        }
        if (i == 2) {
            int i11 = rect.left + rect.right;
            rect2.left = i8 - ((rect.width() + (rect.f11677top + rect.bottom)) / 2);
            rect2.f11677top = (i11 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.f11677top;
            return;
        }
        if (i == 3) {
            int i12 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.f11677top) - (i12 / 2);
            rect2.f11677top = i9 - ((rect.height() + i12) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.f11677top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i13 = rect.left + rect.right;
        rect2.left = i8 - ((rect.width() + (rect.bottom + rect.f11677top)) / 2);
        rect2.f11677top = (i13 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.f11677top;
    }

    public void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setIdString(String str) {
        this.mId = str;
        this.mStartMotionPath.mId = str;
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    public void setStaggerOffset(float f) {
        this.mStaggerOffset = f;
    }

    public void setStaggerScale(float f) {
        this.mStaggerScale = f;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
        TypedBundle motionProperties = motionWidget.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i, int i8, int i9) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i10 = viewState.left + viewState.right;
            rect.left = ((viewState.f11678top + viewState.bottom) - viewState.width()) / 2;
            rect.f11677top = i8 - ((viewState.height() + i10) / 2);
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.f11677top;
        } else if (i == 2) {
            int i11 = viewState.left + viewState.right;
            rect.left = i9 - ((viewState.width() + (viewState.f11678top + viewState.bottom)) / 2);
            rect.f11677top = (i11 - viewState.height()) / 2;
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.f11677top;
        }
        this.mStartMotionPath.setBounds(rect.left, rect.f11677top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z8) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i, int i8, float f, long j7) {
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        int i9;
        String[] strArr;
        int i10;
        int i11;
        CustomVariable customVariable;
        SplineSet splineSetMakeSpline;
        CustomVariable customVariable2;
        Integer num;
        HashSet<String> hashSet3;
        HashSet<String> hashSet4;
        int i12;
        SplineSet splineSetMakeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        setupRelative();
        int i13 = this.mPathMotionArc;
        if (i13 != -1) {
            MotionPaths motionPaths = this.mStartMotionPath;
            if (motionPaths.mPathMotionArc == -1) {
                motionPaths.mPathMotionArc = i13;
            }
        }
        this.mStartPoint.different(this.mEndPoint, hashSet6);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        int i14 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i15 = 0;
            arrayList = null;
            while (i15 < size) {
                MotionKey motionKey = arrayList2.get(i15);
                i15++;
                MotionKey motionKey2 = motionKey;
                if (motionKey2 instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey2;
                    insertKey(new MotionPaths(i, i8, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i16 = motionKeyPosition.mCurveFit;
                    if (i16 != -1) {
                        this.mCurveFitType = i16;
                    }
                } else if (motionKey2 instanceof MotionKeyCycle) {
                    motionKey2.getAttributeNames(hashSet7);
                } else if (motionKey2 instanceof MotionKeyTimeCycle) {
                    motionKey2.getAttributeNames(hashSet5);
                } else if (motionKey2 instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) motionKey2);
                } else {
                    motionKey2.setInterpolation(map);
                    motionKey2.getAttributeNames(hashSet6);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        int i17 = 1;
        if (hashSet6.isEmpty()) {
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i9 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet6.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next.split(",")[i17];
                    i12 = i17;
                    ArrayList<MotionKey> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    while (i14 < size2) {
                        MotionKey motionKey3 = arrayList3.get(i14);
                        i14++;
                        HashSet<String> hashSet8 = hashSet5;
                        MotionKey motionKey4 = motionKey3;
                        HashSet<String> hashSet9 = hashSet7;
                        HashMap<String, CustomVariable> map2 = motionKey4.mCustom;
                        if (map2 != null && (customVariable3 = map2.get(str)) != null) {
                            customVar.append(motionKey4.mFramePosition, customVariable3);
                        }
                        hashSet7 = hashSet9;
                        hashSet5 = hashSet8;
                    }
                    hashSet3 = hashSet5;
                    hashSet4 = hashSet7;
                    splineSetMakeSpline2 = SplineSet.makeCustomSplineSet(next, customVar);
                } else {
                    hashSet3 = hashSet5;
                    hashSet4 = hashSet7;
                    i12 = i17;
                    splineSetMakeSpline2 = SplineSet.makeSpline(next, j7);
                }
                if (splineSetMakeSpline2 != null) {
                    splineSetMakeSpline2.setType(next);
                    this.mAttributesMap.put(next, splineSetMakeSpline2);
                }
                i17 = i12;
                hashSet7 = hashSet4;
                hashSet5 = hashSet3;
                i14 = 0;
            }
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i9 = i17;
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i18 = 0;
                while (i18 < size3) {
                    MotionKey motionKey5 = arrayList4.get(i18);
                    i18++;
                    MotionKey motionKey6 = motionKey5;
                    if (motionKey6 instanceof MotionKeyAttributes) {
                        motionKey6.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int iIntValue = (!map.containsKey(str2) || (num = map.get(str2)) == null) ? 0 : num.intValue();
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next2)) {
                    if (next2.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next2.split(",")[i9];
                        ArrayList<MotionKey> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size4) {
                            MotionKey motionKey7 = arrayList5.get(i19);
                            i19++;
                            MotionKey motionKey8 = motionKey7;
                            HashMap<String, CustomVariable> map3 = motionKey8.mCustom;
                            if (map3 != null && (customVariable2 = map3.get(str3)) != null) {
                                customVar2.append(motionKey8.mFramePosition, customVariable2);
                            }
                        }
                        splineSetMakeSpline = SplineSet.makeCustomSplineSet(next2, customVar2);
                    } else {
                        splineSetMakeSpline = SplineSet.makeSpline(next2, j7);
                    }
                    if (splineSetMakeSpline != null) {
                        splineSetMakeSpline.setType(next2);
                    }
                }
            }
            ArrayList<MotionKey> arrayList6 = this.mKeyList;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i20 = 0;
                while (i20 < size5) {
                    MotionKey motionKey9 = arrayList6.get(i20);
                    i20++;
                    MotionKey motionKey10 = motionKey9;
                    if (motionKey10 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey10).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(map.containsKey(str4) ? map.get(str4).intValue() : 0);
            }
        }
        int size6 = this.mMotionPaths.size();
        int i21 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i21];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i22 = i9;
        int i23 = 0;
        while (i23 < size7) {
            MotionPaths motionPaths2 = arrayList7.get(i23);
            i23++;
            motionPathsArr[i22] = motionPaths2;
            i22++;
        }
        HashSet hashSet10 = new HashSet();
        for (String str5 : this.mEndMotionPath.mCustomAttributes.keySet()) {
            if (this.mStartMotionPath.mCustomAttributes.containsKey(str5)) {
                if (!hashSet6.contains("CUSTOM," + str5)) {
                    hashSet10.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet10.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i24 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i24 >= strArr.length) {
                break;
            }
            String str6 = strArr[i24];
            this.mAttributeInterpolatorCount[i24] = 0;
            int i25 = 0;
            while (true) {
                if (i25 >= i21) {
                    break;
                }
                if (motionPathsArr[i25].mCustomAttributes.containsKey(str6) && (customVariable = motionPathsArr[i25].mCustomAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i24] = customVariable.numberOfInterpolatedValues() + iArr[i24];
                    break;
                }
                i25++;
            }
            i24++;
        }
        boolean z8 = motionPathsArr[0].mPathMotionArc != -1 ? i9 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i26 = i9; i26 < i21; i26++) {
            motionPathsArr[i26].different(motionPathsArr[i26 - 1], zArr, this.mAttributeNames, z8);
        }
        int i27 = 0;
        for (int i28 = i9; i28 < length; i28++) {
            if (zArr[i28]) {
                i27++;
            }
        }
        this.mInterpolateVariables = new int[i27];
        int i29 = 2;
        int iMax = Math.max(2, i27);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i30 = 0;
        for (int i31 = i9; i31 < length; i31++) {
            if (zArr[i31]) {
                this.mInterpolateVariables[i30] = i31;
                i30++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i9] = this.mInterpolateVariables.length;
        iArr2[0] = i21;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i21];
        for (int i32 = 0; i32 < i21; i32++) {
            motionPathsArr[i32].fillStandard(dArr[i32], this.mInterpolateVariables);
            dArr2[i32] = motionPathsArr[i32].mTime;
        }
        int i33 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i33 >= iArr3.length) {
                break;
            }
            if (iArr3[i33] < MotionPaths.sNames.length) {
                String strM91p = AbstractC0037f.m91p(new StringBuilder(), MotionPaths.sNames[this.mInterpolateVariables[i33]], " [");
                for (int i34 = 0; i34 < i21; i34++) {
                    StringBuilder sbM97v = AbstractC0037f.m97v(strM91p);
                    sbM97v.append(dArr[i34][i33]);
                    strM91p = sbM97v.toString();
                }
            }
            i33++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i35 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i35 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i35];
            int i36 = 0;
            int i37 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i36 < i21) {
                if (motionPathsArr[i36].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i21];
                        int[] iArr4 = new int[i29];
                        iArr4[i9] = motionPathsArr[i36].getCustomDataCount(str7);
                        i11 = 0;
                        iArr4[0] = i21;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i11 = 0;
                    }
                    MotionPaths motionPaths3 = motionPathsArr[i36];
                    i10 = i35;
                    dArr3[i37] = motionPaths3.mTime;
                    motionPaths3.getCustomData(str7, dArr4[i37], i11);
                    i37++;
                } else {
                    i10 = i35;
                }
                i36++;
                i35 = i10;
                i29 = 2;
            }
            int i38 = i35 + 1;
            this.mSpline[i38] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i37), (double[][]) Arrays.copyOf(dArr4, i37));
            i35 = i38;
            i29 = 2;
        }
        int i39 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr5 = new int[i21];
            double[] dArr5 = new double[i21];
            int[] iArr6 = new int[2];
            iArr6[i9] = 2;
            iArr6[0] = i21;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i40 = 0; i40 < i21; i40++) {
                iArr5[i40] = motionPathsArr[i40].mPathMotionArc;
                dArr5[i40] = r6.mTime;
                double[] dArr7 = dArr6[i40];
                dArr7[0] = r6.f948mX;
                dArr7[i9] = r6.f949mY;
            }
            i39 = 0;
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it3 = hashSet2.iterator();
            float preCycleDistance = Float.NaN;
            while (it3.hasNext()) {
                String next3 = it3.next();
                KeyCycleOscillator keyCycleOscillatorMakeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next3);
                if (keyCycleOscillatorMakeWidgetCycle != null) {
                    if (keyCycleOscillatorMakeWidgetCycle.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    keyCycleOscillatorMakeWidgetCycle.setType(next3);
                    this.mCycleMap.put(next3, keyCycleOscillatorMakeWidgetCycle);
                }
            }
            ArrayList<MotionKey> arrayList8 = this.mKeyList;
            int size8 = arrayList8.size();
            int i41 = i39;
            while (i41 < size8) {
                MotionKey motionKey11 = arrayList8.get(i41);
                i41++;
                MotionKey motionKey12 = motionKey11;
                if (motionKey12 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) motionKey12).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it4 = this.mCycleMap.values().iterator();
            while (it4.hasNext()) {
                it4.next().setup(preCycleDistance);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.mRelativeMotion = motion;
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f948mX + " y: " + this.mStartMotionPath.f949mY + " end: x: " + this.mEndMotionPath.f948mX + " y: " + this.mEndMotionPath.f949mY;
    }

    private void setupRelative() {
        Motion motion = this.mRelativeMotion;
        if (motion == null) {
            return;
        }
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        MotionPaths motionPaths = this.mEndMotionPath;
        Motion motion2 = this.mRelativeMotion;
        motionPaths.setupRelative(motion2, motion2.mEndMotionPath);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i8) {
        if (i == 509) {
            setPathMotionArc(i8);
            return true;
        }
        if (i != 610) {
            return i == 704;
        }
        this.mQuantizeMotionSteps = i8;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (602 == i) {
            this.mQuantizeMotionPhase = f;
            return true;
        }
        if (600 != i) {
            return false;
        }
        this.mMotionStagger = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (705 == i || 611 == i) {
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
            return true;
        }
        if (605 != i) {
            return false;
        }
        this.mStartMotionPath.mAnimateRelativeTo = str;
        return true;
    }
}
