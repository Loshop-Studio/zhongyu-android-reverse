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
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
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
        int i6 = Key.UNSET;
        this.mPathMotionArc = i6;
        this.mTransformPivotTarget = i6;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i6;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
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

    private static Interpolator getInterpolator(Context context, int i6, String str, int i7) {
        if (i6 == -2) {
            return AnimationUtils.loadInterpolator(context, i7);
        }
        if (i6 == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f6) {
                    return (float) interpolator.get(f6);
                }
            };
        }
        if (i6 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i6 == 1) {
            return new AccelerateInterpolator();
        }
        if (i6 == 2) {
            return new DecelerateInterpolator();
        }
        if (i6 == 4) {
            return new BounceInterpolator();
        }
        if (i6 != 5) {
            return null;
        }
        return new OvershootInterpolator();
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

    public void buildBounds(float[] fArr, int i6) {
        float f6 = 1.0f;
        float f7 = 1.0f / (i6 - 1);
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

    public int buildKeyFrames(float[] fArr, int[] iArr) {
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
        for (int i9 = 0; i9 < timePoints.length; i9++) {
            this.mSpline[0].getPos(timePoints[i9], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i9], this.mInterpolateVariables, this.mInterpolateData, fArr, i8);
            i8 += 2;
        }
        return i8 / 2;
    }

    public void buildPath(float[] fArr, int i6) {
        int i7 = i6;
        float f6 = 1.0f;
        float f7 = 1.0f / (i7 - 1);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewOscillator> map3 = this.mCycleMap;
        ViewOscillator viewOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = map4 != null ? map4.get("translationY") : null;
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
            if (viewOscillator != null) {
                fArr[i10] = fArr[i10] + viewOscillator.get(fMin);
            } else if (viewSpline != null) {
                fArr[i10] = fArr[i10] + viewSpline.get(fMin);
            }
            if (viewOscillator2 != null) {
                int i11 = i10 + 1;
                fArr[i11] = fArr[i11] + viewOscillator2.get(fMin);
            } else if (viewSpline2 != null) {
                int i12 = i10 + 1;
                fArr[i12] = fArr[i12] + viewSpline2.get(fMin);
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
        if (!"button".equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i6 = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i6 >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i6].conditionallyFire(z6 ? -100.0f : 100.0f, this.mView);
            i6++;
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i6) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = viewSpline.get(i7 / (fArr.length - 1));
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
            float f9 = motionPaths.f383mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f383mX;
            float f11 = motionPaths.f384mY - motionPaths2.f384mY;
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
        return this.mEndMotionPath.f383mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f384mY;
    }

    public MotionPaths getKeyFrame(int i6) {
        return this.mMotionPaths.get(i6);
    }

    public int getKeyFrameInfo(int i6, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            Key key = arrayList.get(i7);
            int i11 = key.mType;
            if (i11 == i6 || i6 != -1) {
                iArr[i9] = 0;
                iArr[i9 + 1] = i11;
                int i12 = key.mFramePosition;
                iArr[i9 + 2] = i12;
                double d6 = i12 / 100.0f;
                this.mSpline[0].getPos(d6, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d6, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i9 + 3] = Float.floatToIntBits(fArr[0]);
                int i13 = i9 + 4;
                iArr[i13] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i9 + 5] = keyPosition.mPositionType;
                    iArr[i9 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i13 = i9 + 7;
                    iArr[i13] = Float.floatToIntBits(keyPosition.mPercentY);
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
        float f8 = motionPaths.f383mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f9 = motionPaths2.f383mX;
        float f10 = f8 - f9;
        float f11 = motionPaths.f384mY;
        float f12 = motionPaths2.f384mY;
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
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            int i9 = i7 + 1;
            Key key = arrayList.get(i7);
            int i10 = key.mFramePosition;
            iArr[i6] = (key.mType * 1000) + i10;
            double d6 = i10 / 100.0f;
            this.mSpline[0].getPos(d6, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d6, this.mInterpolateVariables, this.mInterpolateData, fArr, i8);
            i8 += 2;
            i7 = i9;
            i6++;
        }
        return i6;
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

    public KeyPositionBase getPositionKeyframe(int i6, int i7, float f6, float f7) {
        int i8;
        int i9;
        float f8;
        float f9;
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f383mX;
        rectF.left = f10;
        float f11 = motionPaths.f384mY;
        rectF.top = f11;
        rectF.right = f10 + motionPaths.mWidth;
        rectF.bottom = f11 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f383mX;
        rectF2.left = f12;
        float f13 = motionPaths2.f384mY;
        rectF2.top = f13;
        rectF2.right = f12 + motionPaths2.mWidth;
        rectF2.bottom = f13 + motionPaths2.mHeight;
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Key key = arrayList.get(i10);
            if (key instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) key;
                i8 = i6;
                i9 = i7;
                f8 = f6;
                f9 = f7;
                if (keyPositionBase.intersects(i8, i9, rectF, rectF2, f8, f9)) {
                    return keyPositionBase;
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
            float f9 = motionPaths.f383mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f383mX;
            float f11 = motionPaths.f384mY - motionPaths2.f384mY;
            float f12 = (motionPaths.mWidth - motionPaths2.mWidth) + f10;
            float f13 = f11 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = (f10 * (1.0f - f7)) + (f12 * f7);
            fArr[1] = (f11 * (1.0f - f8)) + (f13 * f8);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
        return this.mStartMotionPath.f383mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f384mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    public boolean interpolate(View view, float f6, long j6, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean pathRotate2;
        View view2;
        View view3;
        float f7;
        float f8;
        double d6;
        View view4 = view;
        float adjustedPosition = getAdjustedPosition(f6, null);
        int i6 = this.mQuantizeMotionSteps;
        if (i6 != Key.UNSET) {
            float f9 = 1.0f / i6;
            float fFloor = ((float) Math.floor(adjustedPosition / f9)) * f9;
            float f10 = (adjustedPosition % f9) / f9;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f10 = (f10 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((interpolator != null ? interpolator.getInterpolation(f10) : ((double) f10) > 0.5d ? 1.0f : 0.0f) * f9) + fFloor;
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
                    property |= viewTimeCycle.setProperty(view4, adjustedPosition, j6, keyCache);
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
            double d7 = adjustedPosition;
            curveFitArr[0].getPos(d7, this.mInterpolateData);
            this.mSpline[0].getSlope(d7, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d7, dArr);
                    this.mArcSpline.getSlope(d7, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                view3 = view;
                f7 = 1.0f;
                f8 = 0.0f;
                d6 = d7;
            } else {
                float f11 = adjustedPosition;
                f7 = 1.0f;
                d6 = d7;
                f8 = 0.0f;
                this.mStartMotionPath.setView(f11, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                adjustedPosition = f11;
                view3 = view;
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view3.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top - view3.getTop());
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
                float f12 = adjustedPosition;
                adjustedPosition = f12;
                pathRotate2 |= pathRotate.setPathRotate(view2, keyCache, f12, j6, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i7 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i7 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i7].getPos(d6, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.mAttributes.get(this.mAttributeNames[i7 - 1]), view2, this.mValuesBuff);
                i7++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= f8) {
                    view2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (adjustedPosition >= f7) {
                    view2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    view2.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i8 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i8 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i8].conditionallyFire(adjustedPosition, view2);
                    i8++;
                }
            }
        } else {
            view2 = view;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f13 = motionPaths.f383mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f14 = f13 + ((motionPaths2.f383mX - f13) * adjustedPosition);
            float f15 = motionPaths.f384mY;
            float f16 = f15 + ((motionPaths2.f384mY - f15) * adjustedPosition);
            float f17 = motionPaths.mWidth;
            float f18 = motionPaths2.mWidth;
            float f19 = motionPaths.mHeight;
            float f20 = motionPaths2.mHeight;
            float f21 = f14 + 0.5f;
            int i9 = (int) f21;
            float f22 = f16 + 0.5f;
            int i10 = (int) f22;
            int i11 = (int) (f21 + ((f18 - f17) * adjustedPosition) + f17);
            int i12 = (int) (f22 + ((f20 - f19) * adjustedPosition) + f19);
            int i13 = i11 - i9;
            int i14 = i12 - i10;
            if (f18 != f17 || f20 != f19 || this.mForceMeasure) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i14, BasicMeasure.EXACTLY));
                this.mForceMeasure = false;
            }
            view2.layout(i9, i10, i11, i12);
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

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f6, float f7, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f8 = motionPaths.f383mX;
        rectF.left = f8;
        float f9 = motionPaths.f384mY;
        rectF.top = f9;
        rectF.right = f8 + motionPaths.mWidth;
        rectF.bottom = f9 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f10 = motionPaths2.f383mX;
        rectF2.left = f10;
        float f11 = motionPaths2.f384mY;
        rectF2.top = f11;
        rectF2.right = f10 + motionPaths2.mWidth;
        rectF2.bottom = f11 + motionPaths2.mHeight;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f6, f7, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
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

    public void setDrawPath(int i6) {
        this.mStartMotionPath.mDrawPath = i6;
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i6, int i7) {
        MotionController motionController;
        int i8 = constraintSet.mRotate;
        if (i8 != 0) {
            motionController = this;
            motionController.rotate(rect, this.mTempRect, i8, i6, i7);
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
        motionController.mEndPoint.setState(rect, constraintSet, i8, motionController.mId);
    }

    public void setPathMotionArc(int i6) {
        this.mPathMotionArc = i6;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i6, int i7, int i8) {
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
        this.mStartPoint.setState(rect, view, i6, viewState.rotation);
    }

    public void setTransformPivotTarget(int i6) {
        this.mTransformPivotTarget = i6;
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
    public void setup(int i6, int i7, float f6, long j6) {
        ArrayList arrayList;
        int i8;
        String[] strArr;
        int i9;
        int i10;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleMakeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        int i11;
        ViewSpline viewSplineMakeSpline;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i12 = this.mPathMotionArc;
        if (i12 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i12;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        int i13 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i14 = 0;
            arrayList = null;
            while (i14 < size) {
                Key key = arrayList2.get(i14);
                i14++;
                Key key2 = key;
                if (key2 instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key2;
                    insertKey(new MotionPaths(i6, i7, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i15 = keyPosition.mCurveFit;
                    if (i15 != Key.UNSET) {
                        this.mCurveFitType = i15;
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
        int i16 = 1;
        if (hashSet2.isEmpty()) {
            i8 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next.split(",")[i16];
                    ArrayList<Key> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    int i17 = i13;
                    while (i17 < size2) {
                        Key key3 = arrayList3.get(i17);
                        i17++;
                        int i18 = i16;
                        Key key4 = key3;
                        HashMap<String, ConstraintAttribute> map2 = key4.mCustomConstraints;
                        if (map2 != null && (constraintAttribute3 = map2.get(str)) != null) {
                            sparseArray.append(key4.mFramePosition, constraintAttribute3);
                        }
                        i16 = i18;
                    }
                    i11 = i16;
                    viewSplineMakeSpline = ViewSpline.makeCustomSpline(next, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    i11 = i16;
                    viewSplineMakeSpline = ViewSpline.makeSpline(next);
                }
                if (viewSplineMakeSpline != null) {
                    viewSplineMakeSpline.setType(next);
                    this.mAttributesMap.put(next, viewSplineMakeSpline);
                }
                i16 = i11;
                i13 = 0;
            }
            i8 = i16;
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i19 = 0;
                while (i19 < size3) {
                    Key key5 = arrayList4.get(i19);
                    i19++;
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
                        String str3 = next2.split(",")[i8];
                        ArrayList<Key> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            Key key7 = arrayList5.get(i20);
                            i20++;
                            Key key8 = key7;
                            HashMap<String, ConstraintAttribute> map3 = key8.mCustomConstraints;
                            if (map3 != null && (constraintAttribute2 = map3.get(str3)) != null) {
                                sparseArray2.append(key8.mFramePosition, constraintAttribute2);
                            }
                        }
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeCustomSpline(next2, sparseArray2);
                    } else {
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeSpline(next2, j6);
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
                int i21 = 0;
                while (i21 < size5) {
                    Key key9 = arrayList6.get(i21);
                    i21++;
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
        int i22 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i22];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i23 = i8;
        int i24 = 0;
        while (i24 < size7) {
            MotionPaths motionPaths = arrayList7.get(i24);
            i24++;
            motionPathsArr[i23] = motionPaths;
            i23++;
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
        int i25 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i25 >= strArr.length) {
                break;
            }
            String str6 = strArr[i25];
            this.mAttributeInterpolatorCount[i25] = 0;
            int i26 = 0;
            while (true) {
                if (i26 >= i22) {
                    break;
                }
                if (motionPathsArr[i26].mAttributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i26].mAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i25] = iArr[i25] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i26++;
            }
            i25++;
        }
        boolean z6 = motionPathsArr[0].mPathMotionArc != Key.UNSET ? i8 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i27 = i8; i27 < i22; i27++) {
            motionPathsArr[i27].different(motionPathsArr[i27 - 1], zArr, this.mAttributeNames, z6);
        }
        int i28 = 0;
        for (int i29 = i8; i29 < length; i29++) {
            if (zArr[i29]) {
                i28++;
            }
        }
        this.mInterpolateVariables = new int[i28];
        int i30 = 2;
        int iMax = Math.max(2, i28);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i31 = 0;
        for (int i32 = i8; i32 < length; i32++) {
            if (zArr[i32]) {
                this.mInterpolateVariables[i31] = i32;
                i31++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i8] = this.mInterpolateVariables.length;
        iArr2[0] = i22;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i22];
        for (int i33 = 0; i33 < i22; i33++) {
            motionPathsArr[i33].fillStandard(dArr[i33], this.mInterpolateVariables);
            dArr2[i33] = motionPathsArr[i33].mTime;
        }
        int i34 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i34 >= iArr3.length) {
                break;
            }
            if (iArr3[i34] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i34]] + " [";
                for (int i35 = 0; i35 < i22; i35++) {
                    str7 = str7 + dArr[i35][i34];
                }
            }
            i34++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i36 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i36 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i36];
            int i37 = 0;
            int i38 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i37 < i22) {
                if (motionPathsArr[i37].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i22];
                        int[] iArr4 = new int[i30];
                        iArr4[i8] = motionPathsArr[i37].getCustomDataCount(str8);
                        i10 = 0;
                        iArr4[0] = i22;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i10 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i37];
                    i9 = i36;
                    dArr3[i38] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str8, dArr4[i38], i10);
                    i38++;
                } else {
                    i9 = i36;
                }
                i37++;
                i36 = i9;
                i30 = 2;
            }
            int i39 = i36 + 1;
            this.mSpline[i39] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i38), (double[][]) Arrays.copyOf(dArr4, i38));
            i36 = i39;
            i30 = 2;
        }
        int i40 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[i22];
            double[] dArr5 = new double[i22];
            int[] iArr6 = new int[2];
            iArr6[i8] = 2;
            iArr6[0] = i22;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i41 = 0; i41 < i22; i41++) {
                iArr5[i41] = motionPathsArr[i41].mPathMotionArc;
                dArr5[i41] = r8.mTime;
                double[] dArr7 = dArr6[i41];
                dArr7[0] = r8.f383mX;
                dArr7[i8] = r8.f384mY;
            }
            i40 = 0;
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
            int i42 = i40;
            while (i42 < size8) {
                Key key11 = arrayList8.get(i42);
                i42++;
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
        return " start: x: " + this.mStartMotionPath.f383mX + " y: " + this.mStartMotionPath.f384mY + " end: x: " + this.mEndMotionPath.f383mX + " y: " + this.mEndMotionPath.f384mY;
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i6, int i7) {
        MotionController motionController;
        Rect rect2;
        int i8 = constraintSet.mRotate;
        if (i8 != 0) {
            motionController = this;
            rect2 = rect;
            motionController.rotate(rect2, this.mTempRect, i8, i6, i7);
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
        motionController.mStartPoint.setState(rect2, constraintSet, i8, motionController.mId);
        motionController.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        motionController.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        motionController.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = motionController.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        motionController.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
