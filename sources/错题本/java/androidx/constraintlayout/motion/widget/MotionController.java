package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
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
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
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

    private static Interpolator getInterpolator(Context context, int i, String str, int i8) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i8);
        }
        if (i == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return (float) interpolator.get(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
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

    public void buildBounds(float[] fArr, int i) {
        float f = 1.0f;
        float f7 = 1.0f / (i - 1);
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

    public int buildKeyFrames(float[] fArr, int[] iArr) {
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
        for (int i10 = 0; i10 < timePoints.length; i10++) {
            this.mSpline[0].getPos(timePoints[i10], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i10], this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
        }
        return i9 / 2;
    }

    public void buildPath(float[] fArr, int i) {
        int i8 = i;
        float f = 1.0f;
        float f7 = 1.0f / (i8 - 1);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewOscillator> map3 = this.mCycleMap;
        ViewOscillator viewOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = map4 != null ? map4.get("translationY") : null;
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
            if (viewOscillator != null) {
                fArr[i11] = viewOscillator.get(fMin) + fArr[i11];
            } else if (viewSpline != null) {
                fArr[i11] = viewSpline.get(fMin) + fArr[i11];
            }
            if (viewOscillator2 != null) {
                int i12 = i11 + 1;
                fArr[i12] = viewOscillator2.get(fMin) + fArr[i12];
            } else if (viewSpline2 != null) {
                int i13 = i11 + 1;
                fArr[i13] = viewSpline2.get(fMin) + fArr[i13];
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
        if (!"button".equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i].conditionallyFire(z8 ? -100.0f : 100.0f, this.mView);
            i++;
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr[i8] = viewSpline.get(i8 / (fArr.length - 1));
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
            float f9 = motionPaths.f977mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f977mX;
            float f11 = motionPaths.f978mY - motionPaths2.f978mY;
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
        return this.mEndMotionPath.f977mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f978mY;
    }

    public MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            int i11 = i8 + 1;
            Key key = arrayList.get(i8);
            int i12 = key.mType;
            if (i12 == i || i != -1) {
                iArr[i10] = 0;
                iArr[i10 + 1] = i12;
                int i13 = key.mFramePosition;
                iArr[i10 + 2] = i13;
                double d9 = i13 / 100.0f;
                this.mSpline[0].getPos(d9, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i10 + 3] = Float.floatToIntBits(fArr[0]);
                int i14 = i10 + 4;
                iArr[i14] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i10 + 5] = keyPosition.mPositionType;
                    iArr[i10 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i14 = i10 + 7;
                    iArr[i14] = Float.floatToIntBits(keyPosition.mPercentY);
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
        float f8 = motionPaths.f977mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f9 = motionPaths2.f977mX;
        float f10 = f8 - f9;
        float f11 = motionPaths.f978mY;
        float f12 = motionPaths2.f978mY;
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
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            int i10 = i8 + 1;
            Key key = arrayList.get(i8);
            int i11 = key.mFramePosition;
            iArr[i] = (key.mType * 1000) + i11;
            double d9 = i11 / 100.0f;
            this.mSpline[0].getPos(d9, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d9, this.mInterpolateVariables, this.mInterpolateData, fArr, i9);
            i9 += 2;
            i8 = i10;
            i++;
        }
        return i;
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

    public KeyPositionBase getPositionKeyframe(int i, int i8, float f, float f7) {
        int i9;
        int i10;
        float f8;
        float f9;
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f10 = motionPaths.f977mX;
        rectF.left = f10;
        float f11 = motionPaths.f978mY;
        rectF.top = f11;
        rectF.right = f10 + motionPaths.mWidth;
        rectF.bottom = f11 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f12 = motionPaths2.f977mX;
        rectF2.left = f12;
        float f13 = motionPaths2.f978mY;
        rectF2.top = f13;
        rectF2.right = f12 + motionPaths2.mWidth;
        rectF2.bottom = f13 + motionPaths2.mHeight;
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            Key key = arrayList.get(i11);
            if (key instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) key;
                i9 = i;
                i10 = i8;
                f8 = f;
                f9 = f7;
                if (keyPositionBase.intersects(i9, i10, rectF, rectF2, f8, f9)) {
                    return keyPositionBase;
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
            float f9 = motionPaths.f977mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f977mX;
            float f11 = motionPaths.f978mY - motionPaths2.f978mY;
            float f12 = motionPaths.mWidth - motionPaths2.mWidth;
            float f13 = f11 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = ((f12 + f10) * f7) + ((1.0f - f7) * f10);
            fArr[1] = (f13 * f8) + ((1.0f - f8) * f11);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
        return this.mStartMotionPath.f977mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f978mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    public boolean interpolate(View view, float f, long j7, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean pathRotate2;
        View view2;
        View view3;
        float f7;
        float f8;
        double d9;
        View view4 = view;
        float adjustedPosition = getAdjustedPosition(f, null);
        int i = this.mQuantizeMotionSteps;
        if (i != Key.UNSET) {
            float f9 = 1.0f / i;
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
                    property |= viewTimeCycle.setProperty(view4, adjustedPosition, j7, keyCache);
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
            double d10 = adjustedPosition;
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
            if (this.mNoMovement) {
                view3 = view;
                f7 = 1.0f;
                f8 = 0.0f;
                d9 = d10;
            } else {
                float f11 = adjustedPosition;
                f7 = 1.0f;
                d9 = d10;
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
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(right - view3.getLeft());
                        view3.setPivotY(bottom - view3.getTop());
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
                pathRotate2 |= pathRotate.setPathRotate(view2, keyCache, f12, j7, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i8 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i8 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i8].getPos(d9, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.mAttributes.get(this.mAttributeNames[i8 - 1]), view2, this.mValuesBuff);
                i8++;
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
                int i9 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i9 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i9].conditionallyFire(adjustedPosition, view2);
                    i9++;
                }
            }
        } else {
            view2 = view;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f13 = motionPaths.f977mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float fM77b = AbstractC0037f.m77b(motionPaths2.f977mX, f13, adjustedPosition, f13);
            float f14 = motionPaths.f978mY;
            float fM77b2 = AbstractC0037f.m77b(motionPaths2.f978mY, f14, adjustedPosition, f14);
            float f15 = motionPaths.mWidth;
            float f16 = motionPaths2.mWidth;
            float fM77b3 = AbstractC0037f.m77b(f16, f15, adjustedPosition, f15);
            float f17 = motionPaths.mHeight;
            float f18 = motionPaths2.mHeight;
            float f19 = fM77b + 0.5f;
            int i10 = (int) f19;
            float f20 = fM77b2 + 0.5f;
            int i11 = (int) f20;
            int i12 = (int) (f19 + fM77b3);
            int iM77b = (int) (f20 + AbstractC0037f.m77b(f18, f17, adjustedPosition, f17));
            int i13 = i12 - i10;
            int i14 = iM77b - i11;
            if (f16 != f15 || f18 != f17 || this.mForceMeasure) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i14, BasicMeasure.EXACTLY));
                this.mForceMeasure = false;
            }
            view2.layout(i10, i11, i12, iM77b);
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

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f, float f7, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f8 = motionPaths.f977mX;
        rectF.left = f8;
        float f9 = motionPaths.f978mY;
        rectF.top = f9;
        rectF.right = f8 + motionPaths.mWidth;
        rectF.bottom = f9 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f10 = motionPaths2.f977mX;
        rectF2.left = f10;
        float f11 = motionPaths2.f978mY;
        rectF2.top = f11;
        rectF2.right = f10 + motionPaths2.mWidth;
        rectF2.bottom = f11 + motionPaths2.mHeight;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f, f7, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    public void rotate(Rect rect, Rect rect2, int i, int i8, int i9) {
        if (i == 1) {
            int i10 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i9 - ((rect.height() + i10) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i11 = rect.left + rect.right;
            rect2.left = i8 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i11 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i12 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i12 / 2);
            rect2.top = i9 - ((rect.height() + i12) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i13 = rect.left + rect.right;
        rect2.left = i8 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i13 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
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

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i, int i8) {
        MotionController motionController;
        int i9 = constraintSet.mRotate;
        if (i9 != 0) {
            motionController = this;
            motionController.rotate(rect, this.mTempRect, i9, i, i8);
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
        motionController.mEndPoint.setState(rect, constraintSet, i9, motionController.mId);
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i, int i8, int i9) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i10 = viewState.left + viewState.right;
            rect.left = ((viewState.f11680top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i8 - ((viewState.height() + i10) / 2);
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        } else if (i == 2) {
            int i11 = viewState.left + viewState.right;
            rect.left = i9 - ((viewState.width() + (viewState.f11680top + viewState.bottom)) / 2);
            rect.top = (i11 - viewState.height()) / 2;
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        this.mTransformPivotTarget = i;
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
    public void setup(int i, int i8, float f, long j7) {
        ArrayList arrayList;
        int i9;
        String[] strArr;
        int i10;
        int i11;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleMakeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        int i12;
        ViewSpline viewSplineMakeSpline;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i13 = this.mPathMotionArc;
        if (i13 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i13;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        int i14 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i15 = 0;
            arrayList = null;
            while (i15 < size) {
                Key key = arrayList2.get(i15);
                i15++;
                Key key2 = key;
                if (key2 instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key2;
                    insertKey(new MotionPaths(i, i8, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i16 = keyPosition.mCurveFit;
                    if (i16 != Key.UNSET) {
                        this.mCurveFitType = i16;
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
        int i17 = 1;
        if (hashSet2.isEmpty()) {
            i9 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next.split(",")[i17];
                    ArrayList<Key> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    int i18 = i14;
                    while (i18 < size2) {
                        Key key3 = arrayList3.get(i18);
                        i18++;
                        int i19 = i17;
                        Key key4 = key3;
                        HashMap<String, ConstraintAttribute> map2 = key4.mCustomConstraints;
                        if (map2 != null && (constraintAttribute3 = map2.get(str)) != null) {
                            sparseArray.append(key4.mFramePosition, constraintAttribute3);
                        }
                        i17 = i19;
                    }
                    i12 = i17;
                    viewSplineMakeSpline = ViewSpline.makeCustomSpline(next, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    i12 = i17;
                    viewSplineMakeSpline = ViewSpline.makeSpline(next);
                }
                if (viewSplineMakeSpline != null) {
                    viewSplineMakeSpline.setType(next);
                    this.mAttributesMap.put(next, viewSplineMakeSpline);
                }
                i17 = i12;
                i14 = 0;
            }
            i9 = i17;
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i20 = 0;
                while (i20 < size3) {
                    Key key5 = arrayList4.get(i20);
                    i20++;
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
                        String str3 = next2.split(",")[i9];
                        ArrayList<Key> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i21 = 0;
                        while (i21 < size4) {
                            Key key7 = arrayList5.get(i21);
                            i21++;
                            Key key8 = key7;
                            HashMap<String, ConstraintAttribute> map3 = key8.mCustomConstraints;
                            if (map3 != null && (constraintAttribute2 = map3.get(str3)) != null) {
                                sparseArray2.append(key8.mFramePosition, constraintAttribute2);
                            }
                        }
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeCustomSpline(next2, sparseArray2);
                    } else {
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeSpline(next2, j7);
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
                int i22 = 0;
                while (i22 < size5) {
                    Key key9 = arrayList6.get(i22);
                    i22++;
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
        int i23 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i23];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i24 = i9;
        int i25 = 0;
        while (i25 < size7) {
            MotionPaths motionPaths = arrayList7.get(i25);
            i25++;
            motionPathsArr[i24] = motionPaths;
            i24++;
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
                if (motionPathsArr[i27].mAttributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i27].mAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i26] = constraintAttribute.numberOfInterpolatedValues() + iArr[i26];
                    break;
                }
                i27++;
            }
            i26++;
        }
        boolean z8 = motionPathsArr[0].mPathMotionArc != Key.UNSET ? i9 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i28 = i9; i28 < i23; i28++) {
            motionPathsArr[i28].different(motionPathsArr[i28 - 1], zArr, this.mAttributeNames, z8);
        }
        int i29 = 0;
        for (int i30 = i9; i30 < length; i30++) {
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
        for (int i33 = i9; i33 < length; i33++) {
            if (zArr[i33]) {
                this.mInterpolateVariables[i32] = i33;
                i32++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i9] = this.mInterpolateVariables.length;
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
                String strM91p = AbstractC0037f.m91p(new StringBuilder(), MotionPaths.sNames[this.mInterpolateVariables[i35]], " [");
                for (int i36 = 0; i36 < i23; i36++) {
                    StringBuilder sbM97v = AbstractC0037f.m97v(strM91p);
                    sbM97v.append(dArr[i36][i35]);
                    strM91p = sbM97v.toString();
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
            String str7 = strArr3[i37];
            int i38 = 0;
            int i39 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i38 < i23) {
                if (motionPathsArr[i38].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i23];
                        int[] iArr4 = new int[i31];
                        iArr4[i9] = motionPathsArr[i38].getCustomDataCount(str7);
                        i11 = 0;
                        iArr4[0] = i23;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i11 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i38];
                    i10 = i37;
                    dArr3[i39] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str7, dArr4[i39], i11);
                    i39++;
                } else {
                    i10 = i37;
                }
                i38++;
                i37 = i10;
                i31 = 2;
            }
            int i40 = i37 + 1;
            this.mSpline[i40] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i39), (double[][]) Arrays.copyOf(dArr4, i39));
            i37 = i40;
            i31 = 2;
        }
        int i41 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[i23];
            double[] dArr5 = new double[i23];
            int[] iArr6 = new int[2];
            iArr6[i9] = 2;
            iArr6[0] = i23;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i42 = 0; i42 < i23; i42++) {
                iArr5[i42] = motionPathsArr[i42].mPathMotionArc;
                dArr5[i42] = r8.mTime;
                double[] dArr7 = dArr6[i42];
                dArr7[0] = r8.f977mX;
                dArr7[i9] = r8.f978mY;
            }
            i41 = 0;
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
            int i43 = i41;
            while (i43 < size8) {
                Key key11 = arrayList8.get(i43);
                i43++;
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
        return " start: x: " + this.mStartMotionPath.f977mX + " y: " + this.mStartMotionPath.f978mY + " end: x: " + this.mEndMotionPath.f977mX + " y: " + this.mEndMotionPath.f978mY;
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i, int i8) {
        MotionController motionController;
        Rect rect2;
        int i9 = constraintSet.mRotate;
        if (i9 != 0) {
            motionController = this;
            rect2 = rect;
            motionController.rotate(rect2, this.mTempRect, i9, i, i8);
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
        motionController.mStartPoint.setState(rect2, constraintSet, i9, motionController.mId);
        motionController.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        motionController.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        motionController.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = motionController.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        motionController.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
