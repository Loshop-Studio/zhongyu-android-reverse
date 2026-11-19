package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionController {
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
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
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
    private ArrayList<Key> mKeyList = new ArrayList<>();

    public MotionController(View view) {
        int i9 = Key.UNSET;
        this.mPathMotionArc = i9;
        this.mTransformPivotTarget = i9;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i9;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
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

    private static Interpolator getInterpolator(Context context, int i9, String str, int i10) {
        if (i9 == -2) {
            return AnimationUtils.loadInterpolator(context, i10);
        }
        if (i9 == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f10) {
                    return (float) interpolator.get(f10);
                }
            };
        }
        if (i9 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i9 == 1) {
            return new AccelerateInterpolator();
        }
        if (i9 == 2) {
            return new DecelerateInterpolator();
        }
        if (i9 == 4) {
            return new BounceInterpolator();
        }
        if (i9 != 5) {
            return null;
        }
        return new OvershootInterpolator();
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
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Log.e(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i9) {
        float f10 = 1.0f;
        float f11 = 1.0f / (i9 - 1);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, ViewOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
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

    public int buildKeyFrames(float[] fArr, int[] iArr) {
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
        for (int i12 = 0; i12 < timePoints.length; i12++) {
            this.mSpline[0].getPos(timePoints[i12], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i12], this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public void buildPath(float[] fArr, int i9) {
        int i10 = i9;
        float f10 = 1.0f;
        float f11 = 1.0f / (i10 - 1);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewOscillator> map3 = this.mCycleMap;
        ViewOscillator viewOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = map4 != null ? map4.get("translationY") : null;
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
            if (viewOscillator != null) {
                fArr[i13] = fArr[i13] + viewOscillator.get(fMin);
            } else if (viewSpline != null) {
                fArr[i13] = fArr[i13] + viewSpline.get(fMin);
            }
            if (viewOscillator2 != null) {
                int i14 = i13 + 1;
                fArr[i14] = fArr[i14] + viewOscillator2.get(fMin);
            } else if (viewSpline2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + viewSpline2.get(fMin);
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
        if (!"button".equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i9 >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i9].conditionallyFire(z9 ? -100.0f : 100.0f, this.mView);
            i9++;
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i9) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = viewSpline.get(i10 / (fArr.length - 1));
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
            float f13 = motionPaths.f1334mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f14 = f13 - motionPaths2.f1334mX;
            float f15 = motionPaths.f1335mY - motionPaths2.f1335mY;
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
        return this.mEndMotionPath.f1334mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f1335mY;
    }

    public MotionPaths getKeyFrame(int i9) {
        return this.mMotionPaths.get(i9);
    }

    public int getKeyFrameInfo(int i9, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            int i13 = i10 + 1;
            Key key = arrayList.get(i10);
            int i14 = key.mType;
            if (i14 == i9 || i9 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i14;
                int i15 = key.mFramePosition;
                iArr[i12 + 2] = i15;
                double d10 = i15 / 100.0f;
                this.mSpline[0].getPos(d10, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i16 = i12 + 4;
                iArr[i16] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i12 + 5] = keyPosition.mPositionType;
                    iArr[i12 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i16 = i12 + 7;
                    iArr[i16] = Float.floatToIntBits(keyPosition.mPercentY);
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
        float f12 = motionPaths.f1334mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f13 = motionPaths2.f1334mX;
        float f14 = f12 - f13;
        float f15 = motionPaths.f1335mY;
        float f16 = motionPaths2.f1335mY;
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
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            int i12 = i10 + 1;
            Key key = arrayList.get(i10);
            int i13 = key.mFramePosition;
            iArr[i9] = (key.mType * 1000) + i13;
            double d10 = i13 / 100.0f;
            this.mSpline[0].getPos(d10, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d10, this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
            i11 += 2;
            i10 = i12;
            i9++;
        }
        return i9;
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

    public KeyPositionBase getPositionKeyframe(int i9, int i10, float f10, float f11) {
        int i11;
        int i12;
        float f12;
        float f13;
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f14 = motionPaths.f1334mX;
        rectF.left = f14;
        float f15 = motionPaths.f1335mY;
        rectF.top = f15;
        rectF.right = f14 + motionPaths.mWidth;
        rectF.bottom = f15 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f16 = motionPaths2.f1334mX;
        rectF2.left = f16;
        float f17 = motionPaths2.f1335mY;
        rectF2.top = f17;
        rectF2.right = f16 + motionPaths2.mWidth;
        rectF2.bottom = f17 + motionPaths2.mHeight;
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            Key key = arrayList.get(i13);
            if (key instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) key;
                i11 = i9;
                i12 = i10;
                f12 = f10;
                f13 = f11;
                if (keyPositionBase.intersects(i11, i12, rectF, rectF2, f12, f13)) {
                    return keyPositionBase;
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
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewSpline> map3 = this.mAttributesMap;
        ViewSpline viewSpline3 = map3 == null ? null : map3.get(Key.ROTATION);
        HashMap<String, ViewSpline> map4 = this.mAttributesMap;
        ViewSpline viewSpline4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, ViewSpline> map5 = this.mAttributesMap;
        ViewSpline viewSpline5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, ViewOscillator> map6 = this.mCycleMap;
        ViewOscillator viewOscillator = map6 == null ? null : map6.get("translationX");
        HashMap<String, ViewOscillator> map7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, ViewOscillator> map8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = map8 == null ? null : map8.get(Key.ROTATION);
        HashMap<String, ViewOscillator> map9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, ViewOscillator> map10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = map10 != null ? map10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
            float f13 = motionPaths.f1334mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f14 = f13 - motionPaths2.f1334mX;
            float f15 = motionPaths.f1335mY - motionPaths2.f1335mY;
            float f16 = (motionPaths.mWidth - motionPaths2.mWidth) + f14;
            float f17 = f15 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
        return this.mStartMotionPath.f1334mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f1335mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    public boolean interpolate(View view, float f10, long j9, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean pathRotate2;
        View view2;
        View view3;
        float f11;
        float f12;
        double d10;
        View view4 = view;
        float adjustedPosition = getAdjustedPosition(f10, null);
        int i9 = this.mQuantizeMotionSteps;
        if (i9 != Key.UNSET) {
            float f13 = 1.0f / i9;
            float fFloor = ((float) Math.floor(adjustedPosition / f13)) * f13;
            float f14 = (adjustedPosition % f13) / f13;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f14 = (f14 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((interpolator != null ? interpolator.getInterpolation(f14) : ((double) f14) > 0.5d ? 1.0f : 0.0f) * f13) + fFloor;
        }
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        if (map != null) {
            Iterator<ViewSpline> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view4, adjustedPosition);
            }
        }
        HashMap<String, ViewTimeCycle> map2 = this.mTimeCycleAttributesMap;
        if (map2 != null) {
            ViewTimeCycle.PathRotate pathRotate3 = null;
            boolean property = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate3 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    property |= viewTimeCycle.setProperty(view4, adjustedPosition, j9, keyCache);
                    view4 = view;
                }
            }
            pathRotate2 = property;
            pathRotate = pathRotate3;
        } else {
            pathRotate = null;
            pathRotate2 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d11 = adjustedPosition;
            curveFitArr[0].getPos(d11, this.mInterpolateData);
            this.mSpline[0].getSlope(d11, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                    this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                view3 = view;
                f11 = 1.0f;
                f12 = 0.0f;
                d10 = d11;
            } else {
                float f15 = adjustedPosition;
                f11 = 1.0f;
                d10 = d11;
                f12 = 0.0f;
                this.mStartMotionPath.setView(f15, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                adjustedPosition = f15;
                view3 = view;
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view3.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top2 = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top2 - view3.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> map3 = this.mAttributesMap;
            if (map3 != null) {
                for (ViewSpline viewSpline : map3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view3, adjustedPosition, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                view2 = view;
                float f16 = adjustedPosition;
                adjustedPosition = f16;
                pathRotate2 |= pathRotate.setPathRotate(view2, keyCache, f16, j9, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i10 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i10 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i10].getPos(d10, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.mAttributes.get(this.mAttributeNames[i10 - 1]), view2, this.mValuesBuff);
                i10++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= f12) {
                    view2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (adjustedPosition >= f11) {
                    view2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    view2.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i11 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i11 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i11].conditionallyFire(adjustedPosition, view2);
                    i11++;
                }
            }
        } else {
            view2 = view;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f17 = motionPaths.f1334mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f18 = f17 + ((motionPaths2.f1334mX - f17) * adjustedPosition);
            float f19 = motionPaths.f1335mY;
            float f20 = f19 + ((motionPaths2.f1335mY - f19) * adjustedPosition);
            float f21 = motionPaths.mWidth;
            float f22 = motionPaths2.mWidth;
            float f23 = motionPaths.mHeight;
            float f24 = motionPaths2.mHeight;
            float f25 = f18 + 0.5f;
            int i12 = (int) f25;
            float f26 = f20 + 0.5f;
            int i13 = (int) f26;
            int i14 = (int) (f25 + ((f22 - f21) * adjustedPosition) + f21);
            int i15 = (int) (f26 + ((f24 - f23) * adjustedPosition) + f23);
            int i16 = i14 - i12;
            int i17 = i15 - i13;
            if (f22 != f21 || f24 != f23 || this.mForceMeasure) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
                this.mForceMeasure = false;
            }
            view2.layout(i12, i13, i14, i15);
        }
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view2, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.setProperty(view2, adjustedPosition);
                }
            }
        }
        return pathRotate2;
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f10, float f11, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f12 = motionPaths.f1334mX;
        rectF.left = f12;
        float f13 = motionPaths.f1335mY;
        rectF.top = f13;
        rectF.right = f12 + motionPaths.mWidth;
        rectF.bottom = f13 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f14 = motionPaths2.f1334mX;
        rectF2.left = f14;
        float f15 = motionPaths2.f1335mY;
        rectF2.top = f15;
        rectF2.right = f14 + motionPaths2.mWidth;
        rectF2.bottom = f15 + motionPaths2.mHeight;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f10, f11, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    public void rotate(Rect rect, Rect rect2, int i9, int i10, int i11) {
        if (i9 == 1) {
            int i12 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i11 - ((i12 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i9 == 2) {
            int i13 = rect.left + rect.right;
            rect2.left = i10 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i13 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i9 == 3) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i14 / 2);
            rect2.top = i11 - ((i14 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i9 != 4) {
            return;
        }
        int i15 = rect.left + rect.right;
        rect2.left = i10 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i15 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i9) {
        this.mStartMotionPath.mDrawPath = i9;
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i9, int i10) {
        MotionController motionController;
        int i11 = constraintSet.mRotate;
        if (i11 != 0) {
            motionController = this;
            motionController.rotate(rect, this.mTempRect, i11, i9, i10);
            rect = motionController.mTempRect;
        } else {
            motionController = this;
        }
        MotionPaths motionPaths = motionController.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        motionController.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        motionController.mEndMotionPath.applyParameters(constraintSet.getParameters(motionController.mId));
        motionController.mEndPoint.setState(rect, constraintSet, i11, motionController.mId);
    }

    public void setPathMotionArc(int i9) {
        this.mPathMotionArc = i9;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i9, int i10, int i11) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i9 == 1) {
            int i12 = viewState.left + viewState.right;
            rect.left = ((viewState.f18128top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i10 - ((i12 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i9 == 2) {
            int i13 = viewState.left + viewState.right;
            rect.left = i11 - (((viewState.f18128top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i13 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i9, viewState.rotation);
    }

    public void setTransformPivotTarget(int i9) {
        this.mTransformPivotTarget = i9;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i9, int i10, float f10, long j9) {
        ArrayList arrayList;
        int i11;
        String[] strArr;
        int i12;
        int i13;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleMakeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        int i14;
        ViewSpline viewSplineMakeSpline;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i15 = this.mPathMotionArc;
        if (i15 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i15;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        int i16 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i17 = 0;
            arrayList = null;
            while (i17 < size) {
                Key key = arrayList2.get(i17);
                i17++;
                Key key2 = key;
                if (key2 instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key2;
                    insertKey(new MotionPaths(i9, i10, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i18 = keyPosition.mCurveFit;
                    if (i18 != Key.UNSET) {
                        this.mCurveFitType = i18;
                    }
                } else if (key2 instanceof KeyCycle) {
                    key2.getAttributeNames(hashSet3);
                } else if (key2 instanceof KeyTimeCycle) {
                    key2.getAttributeNames(hashSet);
                } else if (key2 instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key2);
                } else {
                    key2.setInterpolation(map);
                    key2.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        int i19 = 1;
        if (hashSet2.isEmpty()) {
            i11 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next.split(",")[i19];
                    ArrayList<Key> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    int i20 = i16;
                    while (i20 < size2) {
                        Key key3 = arrayList3.get(i20);
                        i20++;
                        int i21 = i19;
                        Key key4 = key3;
                        HashMap<String, ConstraintAttribute> map2 = key4.mCustomConstraints;
                        if (map2 != null && (constraintAttribute3 = map2.get(str)) != null) {
                            sparseArray.append(key4.mFramePosition, constraintAttribute3);
                        }
                        i19 = i21;
                    }
                    i14 = i19;
                    viewSplineMakeSpline = ViewSpline.makeCustomSpline(next, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    i14 = i19;
                    viewSplineMakeSpline = ViewSpline.makeSpline(next);
                }
                if (viewSplineMakeSpline != null) {
                    viewSplineMakeSpline.setType(next);
                    this.mAttributesMap.put(next, viewSplineMakeSpline);
                }
                i19 = i14;
                i16 = 0;
            }
            i11 = i19;
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i22 = 0;
                while (i22 < size3) {
                    Key key5 = arrayList4.get(i22);
                    i22++;
                    Key key6 = key5;
                    if (key6 instanceof KeyAttributes) {
                        key6.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int iIntValue = (!map.containsKey(str2) || (num = map.get(str2)) == null) ? 0 : num.intValue();
                ViewSpline viewSpline = this.mAttributesMap.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(iIntValue);
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
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next2.split(",")[i11];
                        ArrayList<Key> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i23 = 0;
                        while (i23 < size4) {
                            Key key7 = arrayList5.get(i23);
                            i23++;
                            Key key8 = key7;
                            HashMap<String, ConstraintAttribute> map3 = key8.mCustomConstraints;
                            if (map3 != null && (constraintAttribute2 = map3.get(str3)) != null) {
                                sparseArray2.append(key8.mFramePosition, constraintAttribute2);
                            }
                        }
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeCustomSpline(next2, sparseArray2);
                    } else {
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeSpline(next2, j9);
                    }
                    if (viewTimeCycleMakeSpline != null) {
                        viewTimeCycleMakeSpline.setType(next2);
                        this.mTimeCycleAttributesMap.put(next2, viewTimeCycleMakeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList6 = this.mKeyList;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i24 = 0;
                while (i24 < size5) {
                    Key key9 = arrayList6.get(i24);
                    i24++;
                    Key key10 = key9;
                    if (key10 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key10).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(map.containsKey(str4) ? map.get(str4).intValue() : 0);
            }
        }
        int size6 = this.mMotionPaths.size();
        int i25 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i25];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i26 = i11;
        int i27 = 0;
        while (i27 < size7) {
            MotionPaths motionPaths = arrayList7.get(i27);
            i27++;
            motionPathsArr[i26] = motionPaths;
            i26++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.mAttributes.keySet()) {
            if (this.mStartMotionPath.mAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i28 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i28 >= strArr.length) {
                break;
            }
            String str6 = strArr[i28];
            this.mAttributeInterpolatorCount[i28] = 0;
            int i29 = 0;
            while (true) {
                if (i29 >= i25) {
                    break;
                }
                if (motionPathsArr[i29].mAttributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i29].mAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i28] = iArr[i28] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i29++;
            }
            i28++;
        }
        boolean z9 = motionPathsArr[0].mPathMotionArc != Key.UNSET ? i11 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i30 = i11; i30 < i25; i30++) {
            motionPathsArr[i30].different(motionPathsArr[i30 - 1], zArr, this.mAttributeNames, z9);
        }
        int i31 = 0;
        for (int i32 = i11; i32 < length; i32++) {
            if (zArr[i32]) {
                i31++;
            }
        }
        this.mInterpolateVariables = new int[i31];
        int i33 = 2;
        int iMax = Math.max(2, i31);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i34 = 0;
        for (int i35 = i11; i35 < length; i35++) {
            if (zArr[i35]) {
                this.mInterpolateVariables[i34] = i35;
                i34++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i11] = this.mInterpolateVariables.length;
        iArr2[0] = i25;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i25];
        for (int i36 = 0; i36 < i25; i36++) {
            motionPathsArr[i36].fillStandard(dArr[i36], this.mInterpolateVariables);
            dArr2[i36] = motionPathsArr[i36].mTime;
        }
        int i37 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i37 >= iArr3.length) {
                break;
            }
            if (iArr3[i37] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i37]] + " [";
                for (int i38 = 0; i38 < i25; i38++) {
                    str7 = str7 + dArr[i38][i37];
                }
            }
            i37++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i39 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i39 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i39];
            int i40 = 0;
            int i41 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i40 < i25) {
                if (motionPathsArr[i40].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i25];
                        int[] iArr4 = new int[i33];
                        iArr4[i11] = motionPathsArr[i40].getCustomDataCount(str8);
                        i13 = 0;
                        iArr4[0] = i25;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i13 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i40];
                    i12 = i39;
                    dArr3[i41] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str8, dArr4[i41], i13);
                    i41++;
                } else {
                    i12 = i39;
                }
                i40++;
                i39 = i12;
                i33 = 2;
            }
            int i42 = i39 + 1;
            this.mSpline[i42] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i41), (double[][]) Arrays.copyOf(dArr4, i41));
            i39 = i42;
            i33 = 2;
        }
        int i43 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[i25];
            double[] dArr5 = new double[i25];
            int[] iArr6 = new int[2];
            iArr6[i11] = 2;
            iArr6[0] = i25;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i44 = 0; i44 < i25; i44++) {
                iArr5[i44] = motionPathsArr[i44].mPathMotionArc;
                dArr5[i44] = r8.mTime;
                double[] dArr7 = dArr6[i44];
                dArr7[0] = r8.f1334mX;
                dArr7[i11] = r8.f1335mY;
            }
            i43 = 0;
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it3 = hashSet3.iterator();
            float preCycleDistance = Float.NaN;
            while (it3.hasNext()) {
                String next3 = it3.next();
                ViewOscillator viewOscillatorMakeSpline = ViewOscillator.makeSpline(next3);
                if (viewOscillatorMakeSpline != null) {
                    if (viewOscillatorMakeSpline.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    viewOscillatorMakeSpline.setType(next3);
                    this.mCycleMap.put(next3, viewOscillatorMakeSpline);
                }
            }
            ArrayList<Key> arrayList8 = this.mKeyList;
            int size8 = arrayList8.size();
            int i45 = i43;
            while (i45 < size8) {
                Key key11 = arrayList8.get(i45);
                i45++;
                Key key12 = key11;
                if (key12 instanceof KeyCycle) {
                    ((KeyCycle) key12).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it4 = this.mCycleMap.values().iterator();
            while (it4.hasNext()) {
                it4.next().setup(preCycleDistance);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f1334mX + " y: " + this.mStartMotionPath.f1335mY + " end: x: " + this.mEndMotionPath.f1334mX + " y: " + this.mEndMotionPath.f1335mY;
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i9, int i10) {
        MotionController motionController;
        Rect rect2;
        int i11 = constraintSet.mRotate;
        if (i11 != 0) {
            motionController = this;
            rect2 = rect;
            motionController.rotate(rect2, this.mTempRect, i11, i9, i10);
        } else {
            motionController = this;
            rect2 = rect;
        }
        MotionPaths motionPaths = motionController.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        readView(motionPaths);
        motionController.mStartMotionPath.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(motionController.mId);
        motionController.mStartMotionPath.applyParameters(parameters);
        motionController.mMotionStagger = parameters.motion.mMotionStagger;
        motionController.mStartPoint.setState(rect2, constraintSet, i11, motionController.mId);
        motionController.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        motionController.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        motionController.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = motionController.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        motionController.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
