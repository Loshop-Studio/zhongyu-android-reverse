package androidx.constraintlayout.core.motion;

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

    private float getAdjustedPosition(float f6, float[] fArr) {
        float f7 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f8 = this.mStaggerScale;
            if (f8 != 1.0d) {
                float f9 = this.mStaggerOffset;
                if (f6 < f9) {
                    f6 = 0.0f;
                }
                if (f6 > f9 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f9) * f8, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        float f10 = Float.NaN;
        int i6 = 0;
        while (i6 < size) {
            MotionPaths motionPaths = arrayList.get(i6);
            i6++;
            MotionPaths motionPaths2 = motionPaths;
            Easing easing2 = motionPaths2.mKeyFrameEasing;
            if (easing2 != null) {
                float f11 = motionPaths2.mTime;
                if (f11 < f6) {
                    easing = easing2;
                    f7 = f11;
                } else if (Float.isNaN(f10)) {
                    f10 = motionPaths2.mTime;
                }
            }
        }
        if (easing != null) {
            float f12 = (Float.isNaN(f10) ? 1.0f : f10) - f7;
            double d6 = (f6 - f7) / f12;
            f6 = (((float) easing.get(d6)) * f12) + f7;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d6);
            }
        }
        return f6;
    }

    private static DifferentialInterpolator getInterpolator(int i6, String str, int i7) {
        if (i6 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1

            /* renamed from: mX */
            float f351mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f6) {
                this.f351mX = f6;
                return (float) interpolator.get(f6);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) interpolator.getDiff(this.f351mX);
            }
        };
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f6 = 1.0f / 99;
        double d6 = 0.0d;
        double d7 = 0.0d;
        int i6 = 0;
        float fHypot = 0.0f;
        while (i6 < 100) {
            float f7 = i6 * f6;
            double d8 = f7;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f8 = Float.NaN;
            int i7 = 0;
            float f9 = 0.0f;
            while (i7 < size) {
                MotionPaths motionPaths = arrayList.get(i7);
                i7++;
                MotionPaths motionPaths2 = motionPaths;
                float f10 = f6;
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
                f6 = f10;
            }
            float f12 = f6;
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d8 = (((float) easing.get((f7 - f9) / r17)) * (f8 - f9)) + f9;
            }
            double d9 = d8;
            this.mSpline[0].getPos(d9, this.mInterpolateData);
            int i8 = i6;
            this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i8 > 0) {
                fHypot += (float) Math.hypot(d7 - fArr[1], d6 - fArr[0]);
            }
            d6 = fArr[0];
            d7 = fArr[1];
            i6 = i8 + 1;
            f6 = f12;
        }
        return fHypot;
    }

    private void insertKey(MotionPaths motionPaths) {
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        MotionPaths motionPaths2 = null;
        int i6 = 0;
        while (i6 < size) {
            MotionPaths motionPaths3 = arrayList.get(i6);
            i6++;
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

    public void buildBounds(float[] fArr, int i6) {
        float f6 = 1.0f;
        float f7 = 1.0f / (i6 - 1);
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
        int i7 = 0;
        while (i7 < i6) {
            float fMin = i7 * f7;
            float f8 = this.mStaggerScale;
            float f9 = 0.0f;
            if (f8 != f6) {
                float f10 = this.mStaggerOffset;
                if (fMin < f10) {
                    fMin = 0.0f;
                }
                if (fMin > f10 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f10) * f8, f6);
                }
            }
            double d6 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f11 = Float.NaN;
            int i8 = 0;
            while (i8 < size) {
                MotionPaths motionPaths = arrayList.get(i8);
                i8++;
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
                d6 = (((float) easing.get((fMin - f9) / r13)) * (f11 - f9)) + f9;
            }
            this.mSpline[0].getPos(d6, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d6, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i7 * 2);
            i7++;
            f6 = 1.0f;
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
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                MotionPaths motionPaths = arrayList.get(i7);
                i7++;
                iArr[i6] = motionPaths.mMode;
                i6++;
            }
        }
        int i8 = 0;
        for (double d6 : timePoints) {
            this.mSpline[0].getPos(d6, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i8);
            i8 += 2;
        }
        return i8 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                MotionPaths motionPaths = arrayList.get(i7);
                i7++;
                iArr[i6] = motionPaths.mMode;
                i6++;
            }
        }
        if (iArr2 != null) {
            ArrayList<MotionPaths> arrayList2 = this.mMotionPaths;
            int size2 = arrayList2.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size2) {
                MotionPaths motionPaths2 = arrayList2.get(i9);
                i9++;
                iArr2[i8] = (int) (motionPaths2.mPosition * 100.0f);
                i8++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < timePoints.length; i11++) {
            this.mSpline[0].getPos(timePoints[i11], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i11], this.mInterpolateVariables, this.mInterpolateData, fArr, i10);
            i10 += 2;
        }
        return i10 / 2;
    }

    public void buildPath(float[] fArr, int i6) {
        int i7 = i6;
        float f6 = 1.0f;
        float f7 = 1.0f / (i7 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i8 = 0;
        while (i8 < i7) {
            float fMin = i8 * f7;
            float f8 = this.mStaggerScale;
            float f9 = 0.0f;
            if (f8 != f6) {
                float f10 = this.mStaggerOffset;
                if (fMin < f10) {
                    fMin = 0.0f;
                }
                if (fMin > f10 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f10) * f8, f6);
                }
            }
            double d6 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f11 = Float.NaN;
            int i9 = 0;
            while (i9 < size) {
                MotionPaths motionPaths = arrayList.get(i9);
                i9++;
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
                d6 = (((float) easing.get((fMin - f9) / r17)) * (f11 - f9)) + f9;
            }
            this.mSpline[0].getPos(d6, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d6, dArr);
                }
            }
            int i10 = i8 * 2;
            this.mStartMotionPath.getCenter(d6, this.mInterpolateVariables, this.mInterpolateData, fArr, i10);
            if (keyCycleOscillator != null) {
                fArr[i10] = fArr[i10] + keyCycleOscillator.get(fMin);
            } else if (splineSet != null) {
                fArr[i10] = fArr[i10] + splineSet.get(fMin);
            }
            if (keyCycleOscillator2 != null) {
                int i11 = i10 + 1;
                fArr[i11] = fArr[i11] + keyCycleOscillator2.get(fMin);
            } else if (splineSet2 != null) {
                int i12 = i10 + 1;
                fArr[i12] = fArr[i12] + splineSet2.get(fMin);
            }
            i8++;
            i7 = i6;
            f7 = f14;
            f6 = 1.0f;
        }
    }

    public void buildRect(float f6, float[] fArr, int i6) {
        this.mSpline[0].getPos(getAdjustedPosition(f6, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
    }

    public void buildRectangles(float[] fArr, int i6) {
        float f6 = 1.0f / (i6 - 1);
        for (int i7 = 0; i7 < i6; i7++) {
            this.mSpline[0].getPos(getAdjustedPosition(i7 * f6, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i7 * 8);
        }
    }

    public void endTrigger(boolean z6) {
    }

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i6) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = splineSet.get(i7 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d6, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d6, dArr);
        this.mSpline[0].getSlope(d6, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d6, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f6, float f7, float f8, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f6, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i6 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f9 = motionPaths.f354mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f354mX;
            float f11 = motionPaths.f355mY - motionPaths2.f355mY;
            float f12 = (motionPaths.mWidth - motionPaths2.mWidth) + f10;
            float f13 = (motionPaths.mHeight - motionPaths2.mHeight) + f11;
            fArr[0] = (f10 * (1.0f - f7)) + (f12 * f7);
            fArr[1] = (f11 * (1.0f - f8)) + (f13 * f8);
            return;
        }
        double d6 = adjustedPosition;
        curveFitArr[0].getSlope(d6, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d6, this.mInterpolateData);
        float f14 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i6 >= dArr.length) {
                break;
            }
            dArr[i6] = dArr[i6] * f14;
            i6++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d6, dArr2);
            this.mArcSpline.getSlope(d6, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            MotionPaths motionPaths = arrayList.get(i6);
            i6++;
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
        return this.mEndMotionPath.f354mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f355mY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i6) {
        return this.mMotionPaths.get(i6);
    }

    public int getKeyFrameInfo(int i6, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            MotionKey motionKey = arrayList.get(i7);
            int i11 = motionKey.mType;
            if (i11 == i6 || i6 != -1) {
                iArr[i9] = 0;
                iArr[i9 + 1] = i11;
                int i12 = motionKey.mFramePosition;
                iArr[i9 + 2] = i12;
                double d6 = i12 / 100.0f;
                this.mSpline[0].getPos(d6, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d6, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i9 + 3] = Float.floatToIntBits(fArr[0]);
                int i13 = i9 + 4;
                iArr[i13] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i9 + 5] = motionKeyPosition.mPositionType;
                    iArr[i9 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i13 = i9 + 7;
                    iArr[i13] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i14 = i13 + 1;
                iArr[i9] = i14 - i9;
                i8++;
                i9 = i14;
            }
            i7 = i10;
        }
        return i8;
    }

    public float getKeyFrameParameter(int i6, float f6, float f7) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f8 = motionPaths.f354mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f9 = motionPaths2.f354mX;
        float f10 = f8 - f9;
        float f11 = motionPaths.f355mY;
        float f12 = motionPaths2.f355mY;
        float f13 = f11 - f12;
        float f14 = f9 + (motionPaths2.mWidth / 2.0f);
        float f15 = f12 + (motionPaths2.mHeight / 2.0f);
        float fHypot = (float) Math.hypot(f10, f13);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f16 = f6 - f14;
        float f17 = f7 - f15;
        if (((float) Math.hypot(f16, f17)) == 0.0f) {
            return 0.0f;
        }
        float f18 = (f16 * f10) + (f17 * f13);
        if (i6 == 0) {
            return f18 / fHypot;
        }
        if (i6 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f18 * f18));
        }
        if (i6 == 2) {
            return f16 / f10;
        }
        if (i6 == 3) {
            return f17 / f10;
        }
        if (i6 == 4) {
            return f16 / f13;
        }
        if (i6 != 5) {
            return 0.0f;
        }
        return f17 / f13;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            int i9 = i7 + 1;
            MotionKey motionKey = arrayList.get(i7);
            int i10 = motionKey.mFramePosition;
            iArr[i6] = (motionKey.mType * 1000) + i10;
            double d6 = i10 / 100.0f;
            this.mSpline[0].getPos(d6, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d6, this.mInterpolateVariables, this.mInterpolateData, fArr, i8);
            i8 += 2;
            i7 = i9;
            i6++;
        }
        return i6;
    }

    public float getMotionStagger() {
        return this.mMotionStagger;
    }

    public double[] getPos(double d6) {
        this.mSpline[0].getPos(d6, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d6, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public MotionKeyPosition getPositionKeyframe(int i6, int i7, float f6, float f7) {
        int i8;
        int i9;
        float f8;
        float f9;
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f354mX;
        floatRect.left = f10;
        float f11 = motionPaths.f355mY;
        floatRect.top = f11;
        floatRect.right = f10 + motionPaths.mWidth;
        floatRect.bottom = f11 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f354mX;
        floatRect2.left = f12;
        float f13 = motionPaths2.f355mY;
        floatRect2.top = f13;
        floatRect2.right = f12 + motionPaths2.mWidth;
        floatRect2.bottom = f13 + motionPaths2.mHeight;
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            MotionKey motionKey = arrayList.get(i10);
            if (motionKey instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                i8 = i6;
                i9 = i7;
                f8 = f6;
                f9 = f7;
                if (motionKeyPosition.intersects(i8, i9, floatRect, floatRect2, f8, f9)) {
                    return motionKeyPosition;
                }
            } else {
                i8 = i6;
                i9 = i7;
                f8 = f6;
                f9 = f7;
            }
            i6 = i8;
            i7 = i9;
            f6 = f8;
            f7 = f9;
            i10 = i11;
        }
        return null;
    }

    public void getPostLayoutDvDp(float f6, int i6, int i7, float f7, float f8, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f6, this.mVelocity);
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
                double d6 = adjustedPosition;
                curveFit.getPos(d6, dArr);
                this.mArcSpline.getSlope(d6, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f7, f8, i6, i7, fArr);
            return;
        }
        int i8 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f9 = motionPaths.f354mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f354mX;
            float f11 = motionPaths.f355mY - motionPaths2.f355mY;
            float f12 = (motionPaths.mWidth - motionPaths2.mWidth) + f10;
            float f13 = f11 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = (f10 * (1.0f - f7)) + (f12 * f7);
            fArr[1] = (f11 * (1.0f - f8)) + (f13 * f8);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f7, f8, i6, i7, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f14 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i8 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f7, f8, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f7, f8, i6, i7, fArr);
                return;
            } else {
                dArr2[i8] = dArr2[i8] * f14;
                i8++;
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
        return this.mStartMotionPath.f354mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f355mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f6, long j6, KeyCache keyCache) {
        MotionWidget motionWidget2 = motionWidget;
        float adjustedPosition = getAdjustedPosition(f6, null);
        int i6 = this.mQuantizeMotionSteps;
        if (i6 != -1) {
            float f7 = 1.0f / i6;
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
            double d6 = f9;
            curveFitArr[0].getPos(d6, this.mInterpolateData);
            this.mSpline[0].getSlope(d6, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d6, dArr);
                    this.mArcSpline.getSlope(d6, this.mInterpolateVelocity);
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
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget2.getRight() - motionWidget2.getLeft() > 0 && motionWidget2.getBottom() - motionWidget2.getTop() > 0) {
                        motionWidget2.setPivotX(left - motionWidget2.getLeft());
                        motionWidget2.setPivotY(top - motionWidget2.getTop());
                    }
                }
            }
            int i7 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i7 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i7].getPos(d6, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i7 - 1]).setInterpolatedValue(motionWidget2, this.mValuesBuff);
                i7++;
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
                int i8 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i8 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i8].conditionallyFire(f9, motionWidget2);
                    i8++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f10 = motionPaths.f354mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f11 = f10 + ((motionPaths2.f354mX - f10) * f9);
            float f12 = motionPaths.f355mY;
            float f13 = f12 + ((motionPaths2.f355mY - f12) * f9);
            float f14 = motionPaths.mWidth;
            float f15 = f14 + ((motionPaths2.mWidth - f14) * f9);
            float f16 = motionPaths.mHeight;
            float f17 = f11 + 0.5f;
            float f18 = f13 + 0.5f;
            motionWidget2.layout((int) f17, (int) f18, (int) (f17 + f15), (int) (f18 + f16 + ((motionPaths2.mHeight - f16) * f9)));
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

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f6, float f7, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f8 = motionPaths.f354mX;
        floatRect.left = f8;
        float f9 = motionPaths.f355mY;
        floatRect.top = f9;
        floatRect.right = f8 + motionPaths.mWidth;
        floatRect.bottom = f9 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f10 = motionPaths2.f354mX;
        floatRect2.left = f10;
        float f11 = motionPaths2.f355mY;
        floatRect2.top = f11;
        floatRect2.right = f10 + motionPaths2.mWidth;
        floatRect2.bottom = f11 + motionPaths2.mHeight;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f6, f7, strArr, fArr);
    }

    public void rotate(Rect rect, Rect rect2, int i6, int i7, int i8) {
        if (i6 == 1) {
            int i9 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i8 - ((i9 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i6 == 2) {
            int i10 = rect.left + rect.right;
            rect2.left = i7 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i10 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i6 == 3) {
            int i11 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i11 / 2);
            rect2.top = i8 - ((i11 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i6 != 4) {
            return;
        }
        int i12 = rect.left + rect.right;
        rect2.left = i7 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i12 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
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

    public void setDrawPath(int i6) {
        this.mStartMotionPath.mDrawPath = i6;
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

    public void setPathMotionArc(int i6) {
        this.mPathMotionArc = i6;
    }

    public void setStaggerOffset(float f6) {
        this.mStaggerOffset = f6;
    }

    public void setStaggerScale(float f6) {
        this.mStaggerScale = f6;
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

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i6, int i7, int i8) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i6 == 1) {
            int i9 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i7 - ((i9 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i6 == 2) {
            int i10 = viewState.left + viewState.right;
            rect.left = i8 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i10 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i6, viewState.rotation);
    }

    public void setTransformPivotTarget(int i6) {
        this.mTransformPivotTarget = i6;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i6, boolean z6) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i6, int i7, float f6, long j6) {
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        int i8;
        String[] strArr;
        int i9;
        int i10;
        CustomVariable customVariable;
        SplineSet splineSetMakeSpline;
        CustomVariable customVariable2;
        Integer num;
        HashSet<String> hashSet3;
        HashSet<String> hashSet4;
        int i11;
        SplineSet splineSetMakeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        setupRelative();
        int i12 = this.mPathMotionArc;
        if (i12 != -1) {
            MotionPaths motionPaths = this.mStartMotionPath;
            if (motionPaths.mPathMotionArc == -1) {
                motionPaths.mPathMotionArc = i12;
            }
        }
        this.mStartPoint.different(this.mEndPoint, hashSet6);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        int i13 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i14 = 0;
            arrayList = null;
            while (i14 < size) {
                MotionKey motionKey = arrayList2.get(i14);
                i14++;
                MotionKey motionKey2 = motionKey;
                if (motionKey2 instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey2;
                    insertKey(new MotionPaths(i6, i7, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i15 = motionKeyPosition.mCurveFit;
                    if (i15 != -1) {
                        this.mCurveFitType = i15;
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
        int i16 = 1;
        if (hashSet6.isEmpty()) {
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i8 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet6.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next.split(",")[i16];
                    i11 = i16;
                    ArrayList<MotionKey> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        MotionKey motionKey3 = arrayList3.get(i13);
                        i13++;
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
                    i11 = i16;
                    splineSetMakeSpline2 = SplineSet.makeSpline(next, j6);
                }
                if (splineSetMakeSpline2 != null) {
                    splineSetMakeSpline2.setType(next);
                    this.mAttributesMap.put(next, splineSetMakeSpline2);
                }
                i16 = i11;
                hashSet7 = hashSet4;
                hashSet5 = hashSet3;
                i13 = 0;
            }
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i8 = i16;
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    MotionKey motionKey5 = arrayList4.get(i17);
                    i17++;
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
                        String str3 = next2.split(",")[i8];
                        ArrayList<MotionKey> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            MotionKey motionKey7 = arrayList5.get(i18);
                            i18++;
                            MotionKey motionKey8 = motionKey7;
                            HashMap<String, CustomVariable> map3 = motionKey8.mCustom;
                            if (map3 != null && (customVariable2 = map3.get(str3)) != null) {
                                customVar2.append(motionKey8.mFramePosition, customVariable2);
                            }
                        }
                        splineSetMakeSpline = SplineSet.makeCustomSplineSet(next2, customVar2);
                    } else {
                        splineSetMakeSpline = SplineSet.makeSpline(next2, j6);
                    }
                    if (splineSetMakeSpline != null) {
                        splineSetMakeSpline.setType(next2);
                    }
                }
            }
            ArrayList<MotionKey> arrayList6 = this.mKeyList;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i19 = 0;
                while (i19 < size5) {
                    MotionKey motionKey9 = arrayList6.get(i19);
                    i19++;
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
        int i20 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i20];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i21 = i8;
        int i22 = 0;
        while (i22 < size7) {
            MotionPaths motionPaths2 = arrayList7.get(i22);
            i22++;
            motionPathsArr[i21] = motionPaths2;
            i21++;
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
        int i23 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i23 >= strArr.length) {
                break;
            }
            String str6 = strArr[i23];
            this.mAttributeInterpolatorCount[i23] = 0;
            int i24 = 0;
            while (true) {
                if (i24 >= i20) {
                    break;
                }
                if (motionPathsArr[i24].mCustomAttributes.containsKey(str6) && (customVariable = motionPathsArr[i24].mCustomAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i23] = iArr[i23] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i24++;
            }
            i23++;
        }
        boolean z6 = motionPathsArr[0].mPathMotionArc != -1 ? i8 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i25 = i8; i25 < i20; i25++) {
            motionPathsArr[i25].different(motionPathsArr[i25 - 1], zArr, this.mAttributeNames, z6);
        }
        int i26 = 0;
        for (int i27 = i8; i27 < length; i27++) {
            if (zArr[i27]) {
                i26++;
            }
        }
        this.mInterpolateVariables = new int[i26];
        int i28 = 2;
        int iMax = Math.max(2, i26);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i29 = 0;
        for (int i30 = i8; i30 < length; i30++) {
            if (zArr[i30]) {
                this.mInterpolateVariables[i29] = i30;
                i29++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i8] = this.mInterpolateVariables.length;
        iArr2[0] = i20;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i20];
        for (int i31 = 0; i31 < i20; i31++) {
            motionPathsArr[i31].fillStandard(dArr[i31], this.mInterpolateVariables);
            dArr2[i31] = motionPathsArr[i31].mTime;
        }
        int i32 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i32 >= iArr3.length) {
                break;
            }
            if (iArr3[i32] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i32]] + " [";
                for (int i33 = 0; i33 < i20; i33++) {
                    str7 = str7 + dArr[i33][i32];
                }
            }
            i32++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i34 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i34 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i34];
            int i35 = 0;
            int i36 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i35 < i20) {
                if (motionPathsArr[i35].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i20];
                        int[] iArr4 = new int[i28];
                        iArr4[i8] = motionPathsArr[i35].getCustomDataCount(str8);
                        i10 = 0;
                        iArr4[0] = i20;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i10 = 0;
                    }
                    MotionPaths motionPaths3 = motionPathsArr[i35];
                    i9 = i34;
                    dArr3[i36] = motionPaths3.mTime;
                    motionPaths3.getCustomData(str8, dArr4[i36], i10);
                    i36++;
                } else {
                    i9 = i34;
                }
                i35++;
                i34 = i9;
                i28 = 2;
            }
            int i37 = i34 + 1;
            this.mSpline[i37] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i36), (double[][]) Arrays.copyOf(dArr4, i36));
            i34 = i37;
            i28 = 2;
        }
        int i38 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr5 = new int[i20];
            double[] dArr5 = new double[i20];
            int[] iArr6 = new int[2];
            iArr6[i8] = 2;
            iArr6[0] = i20;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i39 = 0; i39 < i20; i39++) {
                iArr5[i39] = motionPathsArr[i39].mPathMotionArc;
                dArr5[i39] = r6.mTime;
                double[] dArr7 = dArr6[i39];
                dArr7[0] = r6.f354mX;
                dArr7[i8] = r6.f355mY;
            }
            i38 = 0;
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
            int i40 = i38;
            while (i40 < size8) {
                MotionKey motionKey11 = arrayList8.get(i40);
                i40++;
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
        return " start: x: " + this.mStartMotionPath.f354mX + " y: " + this.mStartMotionPath.f355mY + " end: x: " + this.mEndMotionPath.f354mX + " y: " + this.mEndMotionPath.f355mY;
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
    public boolean setValue(int i6, int i7) {
        if (i6 == 509) {
            setPathMotionArc(i7);
            return true;
        }
        if (i6 != 610) {
            return i6 == 704;
        }
        this.mQuantizeMotionSteps = i7;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i6, float f6) {
        if (602 == i6) {
            this.mQuantizeMotionPhase = f6;
            return true;
        }
        if (600 != i6) {
            return false;
        }
        this.mMotionStagger = f6;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i6, String str) {
        if (705 == i6 || 611 == i6) {
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
            return true;
        }
        if (605 != i6) {
            return false;
        }
        this.mStartMotionPath.mAnimateRelativeTo = str;
        return true;
    }
}
