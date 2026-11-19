package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.widget.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.SplineSet;
import androidx.constraintlayout.motion.widget.TimeCycleSplineSet;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
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

/* loaded from: classes.dex */
public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    View mView;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private int mPathMotionArc = Key.UNSET;

    public MotionController(View view) {
        setView(view);
    }

    private float getAdjustedPosition(float f4, float[] fArr) {
        float f5 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f6 = this.mStaggerScale;
            if (f6 != 1.0d) {
                float f7 = this.mStaggerOffset;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = (f4 - f7) * f6;
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        float f8 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f9 = next.time;
                if (f9 < f4) {
                    easing = easing2;
                    f5 = f9;
                } else if (Float.isNaN(f8)) {
                    f8 = next.time;
                }
            }
        }
        if (easing != null) {
            float f10 = (Float.isNaN(f8) ? 1.0f : f8) - f5;
            double d4 = (f4 - f5) / f10;
            f4 = (((float) easing.get(d4)) * f10) + f5;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d4);
            }
        }
        return f4;
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f4 = 1.0f / 99;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i4 = 0;
        float fHypot = 0.0f;
        while (i4 < 100) {
            float f5 = i4 * f4;
            double d6 = f5;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                float f8 = f4;
                if (easing2 != null) {
                    float f9 = next.time;
                    if (f9 < f5) {
                        f7 = f9;
                        easing = easing2;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.time;
                    }
                }
                f4 = f8;
            }
            float f10 = f4;
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d6 = (((float) easing.get((f5 - f7) / r16)) * (f6 - f7)) + f7;
            }
            this.mSpline[0].getPos(d6, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i4 > 0) {
                fHypot = (float) (fHypot + Math.hypot(d5 - fArr[1], d4 - fArr[0]));
            }
            d4 = fArr[0];
            d5 = fArr[1];
            i4++;
            f4 = f10;
        }
        return fHypot;
    }

    private void insertKey(MotionPaths motionPaths) {
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Log.e(TAG, " KeyPath positon \"" + motionPaths.position + "\" outside of range");
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

    public void buildBounds(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
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
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = i5 * f4;
            float f6 = this.mStaggerScale;
            float f7 = 0.0f;
            if (f6 != 1.0f) {
                float f8 = this.mStaggerOffset;
                if (f5 < f8) {
                    f5 = 0.0f;
                }
                if (f5 > f8 && f5 < 1.0d) {
                    f5 = (f5 - f8) * f6;
                }
            }
            double d4 = f5;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f10 = next.time;
                    if (f10 < f5) {
                        easing = easing2;
                        f7 = f10;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d4 = (((float) easing.get((f5 - f7) / r12)) * (f9 - f7)) + f7;
            }
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d4, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i5 * 2);
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().mMode;
                i4++;
            }
        }
        int i5 = 0;
        for (double d4 : timePoints) {
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().mMode;
                i4++;
            }
        }
        int i5 = 0;
        for (double d4 : timePoints) {
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    public void buildPath(float[] fArr, int i4) {
        int i5 = i4;
        float f4 = 1.0f;
        float f5 = 1.0f / (i5 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i6 = 0;
        while (i6 < i5) {
            float f6 = i6 * f5;
            float f7 = this.mStaggerScale;
            if (f7 != f4) {
                float f8 = this.mStaggerOffset;
                if (f6 < f8) {
                    f6 = 0.0f;
                }
                if (f6 > f8 && f6 < 1.0d) {
                    f6 = (f6 - f8) * f7;
                }
            }
            double d4 = f6;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f9 = Float.NaN;
            float f10 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f11 = next.time;
                    if (f11 < f6) {
                        f10 = f11;
                        easing = easing2;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d4 = (((float) easing.get((f6 - f10) / r17)) * (f9 - f10)) + f10;
            }
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d4, dArr);
                }
            }
            int i7 = i6 * 2;
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i7);
            if (keyCycleOscillator != null) {
                fArr[i7] = fArr[i7] + keyCycleOscillator.get(f6);
            } else if (splineSet != null) {
                fArr[i7] = fArr[i7] + splineSet.get(f6);
            }
            if (keyCycleOscillator2 != null) {
                int i8 = i7 + 1;
                fArr[i8] = fArr[i8] + keyCycleOscillator2.get(f6);
            } else if (splineSet2 != null) {
                int i9 = i7 + 1;
                fArr[i9] = fArr[i9] + splineSet2.get(f6);
            }
            i6++;
            i5 = i4;
            f4 = 1.0f;
        }
    }

    public void buildRect(float f4, float[] fArr, int i4) {
        this.mSpline[0].getPos(getAdjustedPosition(f4, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i4);
    }

    public void buildRectangles(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            this.mSpline[0].getPos(getAdjustedPosition(i5 * f4, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i5 * 8);
        }
    }

    public int getAttributeValues(String str, float[] fArr, int i4) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = splineSet.get(i5 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getDpDt(float f4, float f5, float f6, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f4, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i4 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f7 = motionPaths.f258x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f8 = f7 - motionPaths2.f258x;
            float f9 = motionPaths.f259y - motionPaths2.f259y;
            float f10 = (motionPaths.width - motionPaths2.width) + f8;
            float f11 = (motionPaths.height - motionPaths2.height) + f9;
            fArr[0] = (f8 * (1.0f - f5)) + (f10 * f5);
            fArr[1] = (f9 * (1.0f - f6)) + (f11 * f6);
            return;
        }
        double d4 = adjustedPosition;
        curveFitArr[0].getSlope(d4, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d4, this.mInterpolateData);
        float f12 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i4 >= dArr.length) {
                break;
            }
            dArr[i4] = dArr[i4] * f12;
            i4++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f5, f6, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d4, dArr2);
            this.mArcSpline.getSlope(d4, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f5, f6, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mDrawPath);
        }
        return Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalX() {
        return this.mEndMotionPath.f258x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f259y;
    }

    public MotionPaths getKeyFrame(int i4) {
        return this.mMotionPaths.get(i4);
    }

    public int getKeyFrameInfo(int i4, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i7 = next.mType;
            if (i7 == i4 || i4 != -1) {
                iArr[i6] = 0;
                int i8 = i6 + 1;
                iArr[i8] = i7;
                int i9 = i8 + 1;
                iArr[i9] = next.mFramePosition;
                this.mSpline[0].getPos(r8 / 100.0f, this.mInterpolateData);
                this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[0]);
                int i11 = i10 + 1;
                iArr[i11] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    int i12 = i11 + 1;
                    iArr[i12] = keyPosition.mPositionType;
                    int i13 = i12 + 1;
                    iArr[i13] = Float.floatToIntBits(keyPosition.mPercentX);
                    i11 = i13 + 1;
                    iArr[i11] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i14 = i11 + 1;
                iArr[i6] = i14 - i6;
                i5++;
                i6 = i14;
            }
        }
        return i5;
    }

    public float getKeyFrameParameter(int i4, float f4, float f5) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f6 = motionPaths.f258x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f7 = motionPaths2.f258x;
        float f8 = f6 - f7;
        float f9 = motionPaths.f259y;
        float f10 = motionPaths2.f259y;
        float f11 = f9 - f10;
        float f12 = f7 + (motionPaths2.width / 2.0f);
        float f13 = f10 + (motionPaths2.height / 2.0f);
        float fHypot = (float) Math.hypot(f8, f11);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f14 = f4 - f12;
        float f15 = f5 - f13;
        if (((float) Math.hypot(f14, f15)) == 0.0f) {
            return 0.0f;
        }
        float f16 = (f14 * f8) + (f15 * f11);
        if (i4 == 0) {
            return f16 / fHypot;
        }
        if (i4 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f16 * f16));
        }
        if (i4 == 2) {
            return f14 / f8;
        }
        if (i4 == 3) {
            return f15 / f8;
        }
        if (i4 == 4) {
            return f14 / f11;
        }
        if (i4 != 5) {
            return 0.0f;
        }
        return f15 / f11;
    }

    public KeyPositionBase getPositionKeyframe(int i4, int i5, float f4, float f5) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f6 = motionPaths.f258x;
        rectF.left = f6;
        float f7 = motionPaths.f259y;
        rectF.top = f7;
        rectF.right = f6 + motionPaths.width;
        rectF.bottom = f7 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f8 = motionPaths2.f258x;
        rectF2.left = f8;
        float f9 = motionPaths2.f259y;
        rectF2.top = f9;
        rectF2.right = f8 + motionPaths2.width;
        rectF2.bottom = f9 + motionPaths2.height;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i4, i5, rectF, rectF2, f4, f5)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    public void getPostLayoutDvDp(float f4, int i4, int i5, float f5, float f6, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f4, this.mVelocity);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, SplineSet> map3 = this.mAttributesMap;
        SplineSet splineSet3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, SplineSet> map4 = this.mAttributesMap;
        SplineSet splineSet4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, SplineSet> map5 = this.mAttributesMap;
        SplineSet splineSet5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, KeyCycleOscillator> map6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map6 == null ? null : map6.get("translationX");
        HashMap<String, KeyCycleOscillator> map7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, KeyCycleOscillator> map8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = map8 == null ? null : map8.get("rotation");
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
                double d4 = adjustedPosition;
                curveFit.getPos(d4, dArr);
                this.mArcSpline.getSlope(d4, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f5, f6, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f5, f6, i4, i5, fArr);
            return;
        }
        int i6 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f7 = motionPaths.f258x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f8 = f7 - motionPaths2.f258x;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f9 = motionPaths.f259y - motionPaths2.f259y;
            KeyCycleOscillator keyCycleOscillator7 = keyCycleOscillator4;
            float f10 = (motionPaths.width - motionPaths2.width) + f8;
            float f11 = (motionPaths.height - motionPaths2.height) + f9;
            fArr[0] = (f8 * (1.0f - f5)) + (f10 * f5);
            fArr[1] = (f9 * (1.0f - f6)) + (f11 * f6);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator7, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f5, f6, i4, i5, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f12 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i6 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f5, f6, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f5, f6, i4, i5, fArr);
                return;
            } else {
                dArr2[i6] = dArr2[i6] * f12;
                i6++;
            }
        }
    }

    public float getStartX() {
        return this.mStartMotionPath.f258x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f259y;
    }

    public int getkeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<Key> it = this.mKeyList.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            iArr[i4] = (next.mType * 1000) + next.mFramePosition;
            this.mSpline[0].getPos(r6 / 100.0f, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
            i5 += 2;
            i4++;
        }
        return i4;
    }

    public boolean interpolate(View view, float f4, long j4, KeyCache keyCache) {
        TimeCycleSplineSet.PathRotate pathRotate;
        boolean pathRotate2;
        double d4;
        float adjustedPosition = getAdjustedPosition(f4, null);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            Iterator<SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view, adjustedPosition);
            }
        }
        HashMap<String, TimeCycleSplineSet> map2 = this.mTimeCycleAttributesMap;
        if (map2 != null) {
            pathRotate = null;
            boolean property = false;
            for (TimeCycleSplineSet timeCycleSplineSet : map2.values()) {
                if (timeCycleSplineSet instanceof TimeCycleSplineSet.PathRotate) {
                    pathRotate = (TimeCycleSplineSet.PathRotate) timeCycleSplineSet;
                } else {
                    property |= timeCycleSplineSet.setProperty(view, adjustedPosition, j4, keyCache);
                }
            }
            pathRotate2 = property;
        } else {
            pathRotate = null;
            pathRotate2 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d5 = adjustedPosition;
            curveFitArr[0].getPos(d5, this.mInterpolateData);
            this.mSpline[0].getSlope(d5, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                    this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                }
            }
            this.mStartMotionPath.setView(view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            HashMap<String, SplineSet> map3 = this.mAttributesMap;
            if (map3 != null) {
                for (SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof SplineSet.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        ((SplineSet.PathRotate) splineSet).setPathRotate(view, adjustedPosition, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                d4 = d5;
                pathRotate2 = pathRotate.setPathRotate(view, keyCache, adjustedPosition, j4, dArr3[0], dArr3[1]) | pathRotate2;
            } else {
                d4 = d5;
            }
            int i4 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i4 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i4].getPos(d4, this.mValuesBuff);
                this.mStartMotionPath.attributes.get(this.mAttributeNames[i4 - 1]).setInterpolatedValue(view, this.mValuesBuff);
                i4++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= 0.0f) {
                    view.setVisibility(motionConstrainedPoint.visibility);
                } else if (adjustedPosition >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i5 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i5 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i5].conditionallyFire(adjustedPosition, view);
                    i5++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f5 = motionPaths.f258x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f6 = f5 + ((motionPaths2.f258x - f5) * adjustedPosition);
            float f7 = motionPaths.f259y;
            float f8 = f7 + ((motionPaths2.f259y - f7) * adjustedPosition);
            float f9 = motionPaths.width;
            float f10 = motionPaths2.width;
            float f11 = motionPaths.height;
            float f12 = motionPaths2.height;
            float f13 = f6 + 0.5f;
            int i6 = (int) f13;
            float f14 = f8 + 0.5f;
            int i7 = (int) f14;
            int i8 = (int) (f13 + ((f10 - f9) * adjustedPosition) + f9);
            int i9 = (int) (f14 + ((f12 - f11) * adjustedPosition) + f11);
            int i10 = i8 - i6;
            int i11 = i9 - i7;
            if (f10 != f9 || f12 != f11) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
            }
            view.layout(i6, i7, i8, i9);
        }
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map4.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(view, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    keyCycleOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return pathRotate2;
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f4, float f5, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f6 = motionPaths.f258x;
        rectF.left = f6;
        float f7 = motionPaths.f259y;
        rectF.top = f7;
        rectF.right = f6 + motionPaths.width;
        rectF.bottom = f7 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f8 = motionPaths2.f258x;
        rectF2.left = f8;
        float f9 = motionPaths2.f259y;
        rectF2.top = f9;
        rectF2.right = f8 + motionPaths2.width;
        rectF2.bottom = f9 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f4, f5, strArr, fArr);
    }

    public void setDrawPath(int i4) {
        this.mStartMotionPath.mDrawPath = i4;
    }

    public void setEndState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    public void setPathMotionArc(int i4) {
        this.mPathMotionArc = i4;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i4, int i5, float f4, long j4) {
        ArrayList arrayList;
        String[] strArr;
        TimeCycleSplineSet timeCycleSplineSetMakeSpline;
        ConstraintAttribute constraintAttribute;
        SplineSet splineSetMakeSpline;
        ConstraintAttribute constraintAttribute2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i6 = this.mPathMotionArc;
        if (i6 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i6;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key next = it.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    insertKey(new MotionPaths(i4, i5, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i7 = keyPosition.mCurveFit;
                    if (i7 != Key.UNSET) {
                        this.mCurveFitType = i7;
                    }
                } else if (next instanceof KeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof KeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) next);
                } else {
                    next.setInterpolation(map);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i8 = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<Key> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key next3 = it3.next();
                        HashMap<String, ConstraintAttribute> map2 = next3.mCustomConstraints;
                        if (map2 != null && (constraintAttribute2 = map2.get(str)) != null) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute2);
                        }
                    }
                    splineSetMakeSpline = SplineSet.makeCustomSpline(next2, sparseArray);
                } else {
                    splineSetMakeSpline = SplineSet.makeSpline(next2);
                }
                if (splineSetMakeSpline != null) {
                    splineSetMakeSpline.setType(next2);
                    this.mAttributesMap.put(next2, splineSetMakeSpline);
                }
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<Key> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key next4 = it4.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                this.mAttributesMap.get(str2).setup(map.containsKey(str2) ? map.get(str2).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<Key> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key next6 = it6.next();
                            HashMap<String, ConstraintAttribute> map3 = next6.mCustomConstraints;
                            if (map3 != null && (constraintAttribute = map3.get(str3)) != null) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute);
                            }
                        }
                        timeCycleSplineSetMakeSpline = TimeCycleSplineSet.makeCustomSpline(next5, sparseArray2);
                    } else {
                        timeCycleSplineSetMakeSpline = TimeCycleSplineSet.makeSpline(next5, j4);
                    }
                    if (timeCycleSplineSetMakeSpline != null) {
                        timeCycleSplineSetMakeSpline.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, timeCycleSplineSetMakeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key next7 = it7.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(map.containsKey(str4) ? map.get(str4).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size() + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i9 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i9] = it8.next();
            i9++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpCount = new int[strArr2.length];
        int i10 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i10 >= strArr.length) {
                break;
            }
            String str6 = strArr[i10];
            this.mAttributeInterpCount[i10] = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (motionPathsArr[i11].attributes.containsKey(str6)) {
                    int[] iArr = this.mAttributeInterpCount;
                    iArr[i10] = iArr[i10] + motionPathsArr[i11].attributes.get(str6).noOfInterpValues();
                    break;
                }
                i11++;
            }
            i10++;
        }
        boolean z3 = motionPathsArr[0].mPathMotionArc != Key.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 1; i12 < size; i12++) {
            motionPathsArr[i12].different(motionPathsArr[i12 - 1], zArr, this.mAttributeNames, z3);
        }
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        int[] iArr2 = new int[i13];
        this.mInterpolateVariables = iArr2;
        this.mInterpolateData = new double[iArr2.length];
        this.mInterpolateVelocity = new double[iArr2.length];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.mInterpolateVariables[i15] = i16;
                i15++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            motionPathsArr[i17].fillStandard(dArr[i17], this.mInterpolateVariables);
            dArr2[i17] = motionPathsArr[i17].time;
        }
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i18 >= iArr3.length) {
                break;
            }
            if (iArr3[i18] < MotionPaths.names.length) {
                String str7 = MotionPaths.names[this.mInterpolateVariables[i18]] + " [";
                for (int i19 = 0; i19 < size; i19++) {
                    str7 = str7 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i20 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i20];
            int i21 = i8;
            int i22 = i21;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i21 < size) {
                if (motionPathsArr[i21].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, motionPathsArr[i21].getCustomDataCount(str8));
                    }
                    MotionPaths motionPaths = motionPathsArr[i21];
                    dArr3[i22] = motionPaths.time;
                    motionPaths.getCustomData(str8, dArr4[i22], 0);
                    i22++;
                }
                i21++;
            }
            i20++;
            this.mSpline[i20] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            i8 = 0;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i23 = 0; i23 < size; i23++) {
                iArr4[i23] = motionPathsArr[i23].mPathMotionArc;
                dArr5[i23] = r8.time;
                double[] dArr7 = dArr6[i23];
                dArr7[0] = r8.f258x;
                dArr7[1] = r8.f259y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float preCycleDistance = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                KeyCycleOscillator keyCycleOscillatorMakeSpline = KeyCycleOscillator.makeSpline(next8);
                if (keyCycleOscillatorMakeSpline != null) {
                    if (keyCycleOscillatorMakeSpline.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    keyCycleOscillatorMakeSpline.setType(next8);
                    this.mCycleMap.put(next8, keyCycleOscillatorMakeSpline);
                }
            }
            Iterator<Key> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key next9 = it10.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(preCycleDistance);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f258x + " y: " + this.mStartMotionPath.f259y + " end: x: " + this.mEndMotionPath.f258x + " y: " + this.mEndMotionPath.f259y;
    }
}
