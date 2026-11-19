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

    private float getAdjustedPosition(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.mStaggerScale;
            if (f12 != 1.0d) {
                float f13 = this.mStaggerOffset;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i9 = 0;
        while (i9 < size) {
            MotionPaths motionPaths = arrayList.get(i9);
            i9++;
            MotionPaths motionPaths2 = motionPaths;
            Easing easing2 = motionPaths2.mKeyFrameEasing;
            if (easing2 != null) {
                float f15 = motionPaths2.mTime;
                if (f15 < f10) {
                    easing = easing2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = motionPaths2.mTime;
                }
            }
        }
        if (easing != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) easing.get(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d10);
            }
        }
        return f10;
    }

    private static DifferentialInterpolator getInterpolator(int i9, String str, int i10) {
        if (i9 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1

            /* renamed from: mX */
            float f1302mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f10) {
                this.f1302mX = f10;
                return (float) interpolator.get(f10);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) interpolator.getDiff(this.f1302mX);
            }
        };
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i9 = 0;
        float fHypot = 0.0f;
        while (i9 < 100) {
            float f11 = i9 * f10;
            double d12 = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f12 = Float.NaN;
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < size) {
                MotionPaths motionPaths = arrayList.get(i10);
                i10++;
                MotionPaths motionPaths2 = motionPaths;
                float f14 = f10;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f15 = motionPaths2.mTime;
                    if (f15 < f11) {
                        f13 = f15;
                        easing = easing2;
                    } else if (Float.isNaN(f12)) {
                        f12 = motionPaths2.mTime;
                    }
                }
                f10 = f14;
            }
            float f16 = f10;
            if (easing != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d12 = (((float) easing.get((f11 - f13) / r17)) * (f12 - f13)) + f13;
            }
            double d13 = d12;
            this.mSpline[0].getPos(d13, this.mInterpolateData);
            int i11 = i9;
            this.mStartMotionPath.getCenter(d13, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i11 > 0) {
                fHypot += (float) Math.hypot(d11 - fArr[1], d10 - fArr[0]);
            }
            d10 = fArr[0];
            d11 = fArr[1];
            i9 = i11 + 1;
            f10 = f16;
        }
        return fHypot;
    }

    private void insertKey(MotionPaths motionPaths) {
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        MotionPaths motionPaths2 = null;
        int i9 = 0;
        while (i9 < size) {
            MotionPaths motionPaths3 = arrayList.get(i9);
            i9++;
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

    public void buildBounds(float[] fArr, int i9) {
        float f10 = 1.0f;
        float f11 = 1.0f / (i9 - 1);
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
        int i10 = 0;
        while (i10 < i9) {
            float fMin = i10 * f11;
            float f12 = this.mStaggerScale;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.mStaggerOffset;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double d10 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i11 = 0;
            while (i11 < size) {
                MotionPaths motionPaths = arrayList.get(i11);
                i11++;
                MotionPaths motionPaths2 = motionPaths;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f16 = motionPaths2.mTime;
                    if (f16 < fMin) {
                        easing = easing2;
                        f13 = f16;
                    } else if (Float.isNaN(f15)) {
                        f15 = motionPaths2.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d10 = (((float) easing.get((fMin - f13) / r13)) * (f15 - f13)) + f13;
            }
            this.mSpline[0].getPos(d10, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d10, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i10 * 2);
            i10++;
            f10 = 1.0f;
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
            int i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                MotionPaths motionPaths = arrayList.get(i10);
                i10++;
                iArr[i9] = motionPaths.mMode;
                i9++;
            }
        }
        int i11 = 0;
        for (double d10 : timePoints) {
            this.mSpline[0].getPos(d10, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            int i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                MotionPaths motionPaths = arrayList.get(i10);
                i10++;
                iArr[i9] = motionPaths.mMode;
                i9++;
            }
        }
        if (iArr2 != null) {
            ArrayList<MotionPaths> arrayList2 = this.mMotionPaths;
            int size2 = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size2) {
                MotionPaths motionPaths2 = arrayList2.get(i12);
                i12++;
                iArr2[i11] = (int) (motionPaths2.mPosition * 100.0f);
                i11++;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < timePoints.length; i14++) {
            this.mSpline[0].getPos(timePoints[i14], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i14], this.mInterpolateVariables, this.mInterpolateData, fArr, i13);
            i13 += 2;
        }
        return i13 / 2;
    }

    public void buildPath(float[] fArr, int i9) {
        int i10 = i9;
        float f10 = 1.0f;
        float f11 = 1.0f / (i10 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f11;
            float f12 = this.mStaggerScale;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.mStaggerOffset;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double d10 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i12 = 0;
            while (i12 < size) {
                MotionPaths motionPaths = arrayList.get(i12);
                i12++;
                MotionPaths motionPaths2 = motionPaths;
                float f16 = f11;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f17 = motionPaths2.mTime;
                    if (f17 < fMin) {
                        f13 = f17;
                        easing = easing2;
                    } else if (Float.isNaN(f15)) {
                        f15 = motionPaths2.mTime;
                    }
                }
                f11 = f16;
            }
            float f18 = f11;
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d10 = (((float) easing.get((fMin - f13) / r17)) * (f15 - f13)) + f13;
            }
            this.mSpline[0].getPos(d10, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d10, dArr);
                }
            }
            int i13 = i11 * 2;
            this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, this.mInterpolateData, fArr, i13);
            if (keyCycleOscillator != null) {
                fArr[i13] = fArr[i13] + keyCycleOscillator.get(fMin);
            } else if (splineSet != null) {
                fArr[i13] = fArr[i13] + splineSet.get(fMin);
            }
            if (keyCycleOscillator2 != null) {
                int i14 = i13 + 1;
                fArr[i14] = fArr[i14] + keyCycleOscillator2.get(fMin);
            } else if (splineSet2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + splineSet2.get(fMin);
            }
            i11++;
            i10 = i9;
            f11 = f18;
            f10 = 1.0f;
        }
    }

    public void buildRect(float f10, float[] fArr, int i9) {
        this.mSpline[0].getPos(getAdjustedPosition(f10, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
    }

    public void buildRectangles(float[] fArr, int i9) {
        float f10 = 1.0f / (i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
            this.mSpline[0].getPos(getAdjustedPosition(i10 * f10, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i10 * 8);
        }
    }

    public void endTrigger(boolean z9) {
    }

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i9) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = splineSet.get(i10 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d10, dArr);
        this.mSpline[0].getSlope(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f10, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i9 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f13 = motionPaths.f1305mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f14 = f13 - motionPaths2.f1305mX;
            float f15 = motionPaths.f1306mY - motionPaths2.f1306mY;
            float f16 = (motionPaths.mWidth - motionPaths2.mWidth) + f14;
            float f17 = (motionPaths.mHeight - motionPaths2.mHeight) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            return;
        }
        double d10 = adjustedPosition;
        curveFitArr[0].getSlope(d10, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d10, this.mInterpolateData);
        float f18 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i9 >= dArr.length) {
                break;
            }
            dArr[i9] = dArr[i9] * f18;
            i9++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f11, f12, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d10, dArr2);
            this.mArcSpline.getSlope(d10, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f11, f12, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            MotionPaths motionPaths = arrayList.get(i9);
            i9++;
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
        return this.mEndMotionPath.f1305mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f1306mY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i9) {
        return this.mMotionPaths.get(i9);
    }

    public int getKeyFrameInfo(int i9, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            int i13 = i10 + 1;
            MotionKey motionKey = arrayList.get(i10);
            int i14 = motionKey.mType;
            if (i14 == i9 || i9 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i14;
                int i15 = motionKey.mFramePosition;
                iArr[i12 + 2] = i15;
                double d10 = i15 / 100.0f;
                this.mSpline[0].getPos(d10, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i16 = i12 + 4;
                iArr[i16] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i12 + 5] = motionKeyPosition.mPositionType;
                    iArr[i12 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i16 = i12 + 7;
                    iArr[i16] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i17 = i16 + 1;
                iArr[i12] = i17 - i12;
                i11++;
                i12 = i17;
            }
            i10 = i13;
        }
        return i11;
    }

    public float getKeyFrameParameter(int i9, float f10, float f11) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f12 = motionPaths.f1305mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f13 = motionPaths2.f1305mX;
        float f14 = f12 - f13;
        float f15 = motionPaths.f1306mY;
        float f16 = motionPaths2.f1306mY;
        float f17 = f15 - f16;
        float f18 = f13 + (motionPaths2.mWidth / 2.0f);
        float f19 = f16 + (motionPaths2.mHeight / 2.0f);
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f20 * f14) + (f21 * f17);
        if (i9 == 0) {
            return f22 / fHypot;
        }
        if (i9 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i9 == 2) {
            return f20 / f14;
        }
        if (i9 == 3) {
            return f21 / f14;
        }
        if (i9 == 4) {
            return f20 / f17;
        }
        if (i9 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            int i12 = i10 + 1;
            MotionKey motionKey = arrayList.get(i10);
            int i13 = motionKey.mFramePosition;
            iArr[i9] = (motionKey.mType * 1000) + i13;
            double d10 = i13 / 100.0f;
            this.mSpline[0].getPos(d10, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
            i11 += 2;
            i10 = i12;
            i9++;
        }
        return i9;
    }

    public float getMotionStagger() {
        return this.mMotionStagger;
    }

    public double[] getPos(double d10) {
        this.mSpline[0].getPos(d10, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d10, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public MotionKeyPosition getPositionKeyframe(int i9, int i10, float f10, float f11) {
        int i11;
        int i12;
        float f12;
        float f13;
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f14 = motionPaths.f1305mX;
        floatRect.left = f14;
        float f15 = motionPaths.f1306mY;
        floatRect.f18124top = f15;
        floatRect.right = f14 + motionPaths.mWidth;
        floatRect.bottom = f15 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f16 = motionPaths2.f1305mX;
        floatRect2.left = f16;
        float f17 = motionPaths2.f1306mY;
        floatRect2.f18124top = f17;
        floatRect2.right = f16 + motionPaths2.mWidth;
        floatRect2.bottom = f17 + motionPaths2.mHeight;
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            MotionKey motionKey = arrayList.get(i13);
            if (motionKey instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                i11 = i9;
                i12 = i10;
                f12 = f10;
                f13 = f11;
                if (motionKeyPosition.intersects(i11, i12, floatRect, floatRect2, f12, f13)) {
                    return motionKeyPosition;
                }
            } else {
                i11 = i9;
                i12 = i10;
                f12 = f10;
                f13 = f11;
            }
            i9 = i11;
            i10 = i12;
            f10 = f12;
            f11 = f13;
            i13 = i14;
        }
        return null;
    }

    public void getPostLayoutDvDp(float f10, int i9, int i10, float f11, float f12, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f10, this.mVelocity);
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
                double d10 = adjustedPosition;
                curveFit.getPos(d10, dArr);
                this.mArcSpline.getSlope(d10, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f11, f12, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f11, f12, i9, i10, fArr);
            return;
        }
        int i11 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f13 = motionPaths.f1305mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f14 = f13 - motionPaths2.f1305mX;
            float f15 = motionPaths.f1306mY - motionPaths2.f1306mY;
            float f16 = (motionPaths.mWidth - motionPaths2.mWidth) + f14;
            float f17 = f15 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f11, f12, i9, i10, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f18 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i11 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f11, f12, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f11, f12, i9, i10, fArr);
                return;
            } else {
                dArr2[i11] = dArr2[i11] * f18;
                i11++;
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
        return this.mStartMotionPath.f1305mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f1306mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f10, long j9, KeyCache keyCache) {
        MotionWidget motionWidget2 = motionWidget;
        float adjustedPosition = getAdjustedPosition(f10, null);
        int i9 = this.mQuantizeMotionSteps;
        if (i9 != -1) {
            float f11 = 1.0f / i9;
            float fFloor = ((float) Math.floor(adjustedPosition / f11)) * f11;
            float f12 = (adjustedPosition % f11) / f11;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f12 = (f12 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((differentialInterpolator != null ? differentialInterpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = adjustedPosition;
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            Iterator<SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f13);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d10 = f13;
            curveFitArr[0].getPos(d10, this.mInterpolateData);
            this.mSpline[0].getSlope(d10, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d10, dArr);
                    this.mArcSpline.getSlope(d10, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(f13, motionWidget2, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
                f13 = f13;
                motionWidget2 = motionWidget2;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget2.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top2 = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget2.getRight() - motionWidget2.getLeft() > 0 && motionWidget2.getBottom() - motionWidget2.getTop() > 0) {
                        motionWidget2.setPivotX(left - motionWidget2.getLeft());
                        motionWidget2.setPivotY(top2 - motionWidget2.getTop());
                    }
                }
            }
            int i10 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i10 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i10].getPos(d10, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i10 - 1]).setInterpolatedValue(motionWidget2, this.mValuesBuff);
                i10++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f13 <= 0.0f) {
                    motionWidget2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (f13 >= 1.0f) {
                    motionWidget2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    motionWidget2.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i11 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i11 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i11].conditionallyFire(f13, motionWidget2);
                    i11++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f14 = motionPaths.f1305mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f15 = f14 + ((motionPaths2.f1305mX - f14) * f13);
            float f16 = motionPaths.f1306mY;
            float f17 = f16 + ((motionPaths2.f1306mY - f16) * f13);
            float f18 = motionPaths.mWidth;
            float f19 = f18 + ((motionPaths2.mWidth - f18) * f13);
            float f20 = motionPaths.mHeight;
            float f21 = f15 + 0.5f;
            float f22 = f17 + 0.5f;
            motionWidget2.layout((int) f21, (int) f22, (int) (f21 + f19), (int) (f22 + f20 + ((motionPaths2.mHeight - f20) * f13)));
        }
        HashMap<String, KeyCycleOscillator> map2 = this.mCycleMap;
        if (map2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget2, f13, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget2, f13);
                }
            }
        }
        return false;
    }

    public String name() {
        return this.mView.getName();
    }

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f10, float f11, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f12 = motionPaths.f1305mX;
        floatRect.left = f12;
        float f13 = motionPaths.f1306mY;
        floatRect.f18124top = f13;
        floatRect.right = f12 + motionPaths.mWidth;
        floatRect.bottom = f13 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f14 = motionPaths2.f1305mX;
        floatRect2.left = f14;
        float f15 = motionPaths2.f1306mY;
        floatRect2.f18124top = f15;
        floatRect2.right = f14 + motionPaths2.mWidth;
        floatRect2.bottom = f15 + motionPaths2.mHeight;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f10, f11, strArr, fArr);
    }

    public void rotate(Rect rect, Rect rect2, int i9, int i10, int i11) {
        if (i9 == 1) {
            int i12 = rect.left + rect.right;
            rect2.left = ((rect.f18125top + rect.bottom) - rect.width()) / 2;
            rect2.f18125top = i11 - ((i12 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.f18125top + rect.height();
            return;
        }
        if (i9 == 2) {
            int i13 = rect.left + rect.right;
            rect2.left = i10 - (((rect.f18125top + rect.bottom) + rect.width()) / 2);
            rect2.f18125top = (i13 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.f18125top + rect.height();
            return;
        }
        if (i9 == 3) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.f18125top) - (i14 / 2);
            rect2.f18125top = i11 - ((i14 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.f18125top + rect.height();
            return;
        }
        if (i9 != 4) {
            return;
        }
        int i15 = rect.left + rect.right;
        rect2.left = i10 - (((rect.bottom + rect.f18125top) + rect.width()) / 2);
        rect2.f18125top = (i15 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.f18125top + rect.height();
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

    public void setDrawPath(int i9) {
        this.mStartMotionPath.mDrawPath = i9;
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

    public void setPathMotionArc(int i9) {
        this.mPathMotionArc = i9;
    }

    public void setStaggerOffset(float f10) {
        this.mStaggerOffset = f10;
    }

    public void setStaggerScale(float f10) {
        this.mStaggerScale = f10;
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

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i9, int i10, int i11) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i9 == 1) {
            int i12 = viewState.left + viewState.right;
            rect.left = ((viewState.f18126top + viewState.bottom) - viewState.width()) / 2;
            rect.f18125top = i10 - ((i12 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.f18125top + viewState.height();
        } else if (i9 == 2) {
            int i13 = viewState.left + viewState.right;
            rect.left = i11 - (((viewState.f18126top + viewState.bottom) + viewState.width()) / 2);
            rect.f18125top = (i13 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.f18125top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.f18125top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i9, viewState.rotation);
    }

    public void setTransformPivotTarget(int i9) {
        this.mTransformPivotTarget = i9;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i9, boolean z9) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i9, int i10, float f10, long j9) {
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        int i11;
        String[] strArr;
        int i12;
        int i13;
        CustomVariable customVariable;
        SplineSet splineSetMakeSpline;
        CustomVariable customVariable2;
        Integer num;
        HashSet<String> hashSet3;
        HashSet<String> hashSet4;
        int i14;
        SplineSet splineSetMakeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        setupRelative();
        int i15 = this.mPathMotionArc;
        if (i15 != -1) {
            MotionPaths motionPaths = this.mStartMotionPath;
            if (motionPaths.mPathMotionArc == -1) {
                motionPaths.mPathMotionArc = i15;
            }
        }
        this.mStartPoint.different(this.mEndPoint, hashSet6);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        int i16 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i17 = 0;
            arrayList = null;
            while (i17 < size) {
                MotionKey motionKey = arrayList2.get(i17);
                i17++;
                MotionKey motionKey2 = motionKey;
                if (motionKey2 instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey2;
                    insertKey(new MotionPaths(i9, i10, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i18 = motionKeyPosition.mCurveFit;
                    if (i18 != -1) {
                        this.mCurveFitType = i18;
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
        int i19 = 1;
        if (hashSet6.isEmpty()) {
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i11 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet6.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next.split(",")[i19];
                    i14 = i19;
                    ArrayList<MotionKey> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    while (i16 < size2) {
                        MotionKey motionKey3 = arrayList3.get(i16);
                        i16++;
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
                    i14 = i19;
                    splineSetMakeSpline2 = SplineSet.makeSpline(next, j9);
                }
                if (splineSetMakeSpline2 != null) {
                    splineSetMakeSpline2.setType(next);
                    this.mAttributesMap.put(next, splineSetMakeSpline2);
                }
                i19 = i14;
                hashSet7 = hashSet4;
                hashSet5 = hashSet3;
                i16 = 0;
            }
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i11 = i19;
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i20 = 0;
                while (i20 < size3) {
                    MotionKey motionKey5 = arrayList4.get(i20);
                    i20++;
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
                        String str3 = next2.split(",")[i11];
                        ArrayList<MotionKey> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i21 = 0;
                        while (i21 < size4) {
                            MotionKey motionKey7 = arrayList5.get(i21);
                            i21++;
                            MotionKey motionKey8 = motionKey7;
                            HashMap<String, CustomVariable> map3 = motionKey8.mCustom;
                            if (map3 != null && (customVariable2 = map3.get(str3)) != null) {
                                customVar2.append(motionKey8.mFramePosition, customVariable2);
                            }
                        }
                        splineSetMakeSpline = SplineSet.makeCustomSplineSet(next2, customVar2);
                    } else {
                        splineSetMakeSpline = SplineSet.makeSpline(next2, j9);
                    }
                    if (splineSetMakeSpline != null) {
                        splineSetMakeSpline.setType(next2);
                    }
                }
            }
            ArrayList<MotionKey> arrayList6 = this.mKeyList;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i22 = 0;
                while (i22 < size5) {
                    MotionKey motionKey9 = arrayList6.get(i22);
                    i22++;
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
        int i23 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i23];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i24 = i11;
        int i25 = 0;
        while (i25 < size7) {
            MotionPaths motionPaths2 = arrayList7.get(i25);
            i25++;
            motionPathsArr[i24] = motionPaths2;
            i24++;
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
        int i26 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i26 >= strArr.length) {
                break;
            }
            String str6 = strArr[i26];
            this.mAttributeInterpolatorCount[i26] = 0;
            int i27 = 0;
            while (true) {
                if (i27 >= i23) {
                    break;
                }
                if (motionPathsArr[i27].mCustomAttributes.containsKey(str6) && (customVariable = motionPathsArr[i27].mCustomAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i26] = iArr[i26] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i27++;
            }
            i26++;
        }
        boolean z9 = motionPathsArr[0].mPathMotionArc != -1 ? i11 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i28 = i11; i28 < i23; i28++) {
            motionPathsArr[i28].different(motionPathsArr[i28 - 1], zArr, this.mAttributeNames, z9);
        }
        int i29 = 0;
        for (int i30 = i11; i30 < length; i30++) {
            if (zArr[i30]) {
                i29++;
            }
        }
        this.mInterpolateVariables = new int[i29];
        int i31 = 2;
        int iMax = Math.max(2, i29);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i32 = 0;
        for (int i33 = i11; i33 < length; i33++) {
            if (zArr[i33]) {
                this.mInterpolateVariables[i32] = i33;
                i32++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i11] = this.mInterpolateVariables.length;
        iArr2[0] = i23;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i23];
        for (int i34 = 0; i34 < i23; i34++) {
            motionPathsArr[i34].fillStandard(dArr[i34], this.mInterpolateVariables);
            dArr2[i34] = motionPathsArr[i34].mTime;
        }
        int i35 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i35 >= iArr3.length) {
                break;
            }
            if (iArr3[i35] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i35]] + " [";
                for (int i36 = 0; i36 < i23; i36++) {
                    str7 = str7 + dArr[i36][i35];
                }
            }
            i35++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i37 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i37 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i37];
            int i38 = 0;
            int i39 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i38 < i23) {
                if (motionPathsArr[i38].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i23];
                        int[] iArr4 = new int[i31];
                        iArr4[i11] = motionPathsArr[i38].getCustomDataCount(str8);
                        i13 = 0;
                        iArr4[0] = i23;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i13 = 0;
                    }
                    MotionPaths motionPaths3 = motionPathsArr[i38];
                    i12 = i37;
                    dArr3[i39] = motionPaths3.mTime;
                    motionPaths3.getCustomData(str8, dArr4[i39], i13);
                    i39++;
                } else {
                    i12 = i37;
                }
                i38++;
                i37 = i12;
                i31 = 2;
            }
            int i40 = i37 + 1;
            this.mSpline[i40] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i39), (double[][]) Arrays.copyOf(dArr4, i39));
            i37 = i40;
            i31 = 2;
        }
        int i41 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr5 = new int[i23];
            double[] dArr5 = new double[i23];
            int[] iArr6 = new int[2];
            iArr6[i11] = 2;
            iArr6[0] = i23;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i42 = 0; i42 < i23; i42++) {
                iArr5[i42] = motionPathsArr[i42].mPathMotionArc;
                dArr5[i42] = r6.mTime;
                double[] dArr7 = dArr6[i42];
                dArr7[0] = r6.f1305mX;
                dArr7[i11] = r6.f1306mY;
            }
            i41 = 0;
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
            int i43 = i41;
            while (i43 < size8) {
                MotionKey motionKey11 = arrayList8.get(i43);
                i43++;
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
        return " start: x: " + this.mStartMotionPath.f1305mX + " y: " + this.mStartMotionPath.f1306mY + " end: x: " + this.mEndMotionPath.f1305mX + " y: " + this.mEndMotionPath.f1306mY;
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
    public boolean setValue(int i9, int i10) {
        if (i9 == 509) {
            setPathMotionArc(i10);
            return true;
        }
        if (i9 != 610) {
            return i9 == 704;
        }
        this.mQuantizeMotionSteps = i10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i9, float f10) {
        if (602 == i9) {
            this.mQuantizeMotionPhase = f10;
            return true;
        }
        if (600 != i9) {
            return false;
        }
        this.mMotionStagger = f10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i9, String str) {
        if (705 == i9 || 611 == i9) {
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
            return true;
        }
        if (605 != i9) {
            return false;
        }
        this.mStartMotionPath.mAnimateRelativeTo = str;
        return true;
    }
}
