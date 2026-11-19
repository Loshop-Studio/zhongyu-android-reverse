package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 3;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x */
    float f258x;

    /* renamed from: y */
    float f259y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    private static final float xRotate(float f4, float f5, float f6, float f7, float f8, float f9) {
        return (((f8 - f6) * f5) - ((f9 - f7) * f4)) + f6;
    }

    private static final float yRotate(float f4, float f5, float f6, float f7, float f8, float f9) {
        return ((f8 - f6) * f4) + ((f9 - f7) * f5) + f7;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.getType() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z3) {
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        zArr[1] = zArr[1] | diff(this.f258x, motionPaths.f258x) | z3;
        zArr[2] = z3 | diff(this.f259y, motionPaths.f259y) | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f258x, this.f259y, this.width, this.height, this.mPathRotate};
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 < 6) {
                dArr[i4] = fArr[r4];
                i4++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.width;
        float f5 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f6 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 3) {
                f4 = f6;
            } else if (i6 == 4) {
                f5 = f6;
            }
        }
        fArr[i4] = f4;
        fArr[i4 + 1] = f5;
    }

    public void getCenter(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f258x;
        float f5 = this.f259y;
        float f6 = this.width;
        float f7 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f8;
            } else if (i6 == 2) {
                f5 = f8;
            } else if (i6 == 3) {
                f6 = f8;
            } else if (i6 == 4) {
                f7 = f8;
            }
        }
        fArr[i4] = f4 + (f6 / 2.0f) + 0.0f;
        fArr[i4 + 1] = f5 + (f7 / 2.0f) + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i4) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.noOfInterpValues() == 1) {
            dArr[i4] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNoOfInterpValues = constraintAttribute.noOfInterpValues();
        constraintAttribute.getValuesToInterpolate(new float[iNoOfInterpValues]);
        int i5 = 0;
        while (i5 < iNoOfInterpValues) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return iNoOfInterpValues;
    }

    public int getCustomDataCount(String str) {
        return this.attributes.get(str).noOfInterpValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f258x;
        float f5 = this.f259y;
        float f6 = this.width;
        float f7 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f8;
            } else if (i6 == 2) {
                f5 = f8;
            } else if (i6 == 3) {
                f6 = f8;
            } else if (i6 == 4) {
                f7 = f8;
            }
        }
        float f9 = f6 + f4;
        float f10 = f7 + f5;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i7 = i4 + 1;
        fArr[i4] = f4 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f5 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f9 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f5 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f9 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f10 + 0.0f;
        fArr[i12] = f4 + 0.0f;
        fArr[i12 + 1] = f10 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f4 = keyPosition.mFramePosition / 100.0f;
        this.time = f4;
        this.mDrawPath = keyPosition.mDrawPath;
        float f5 = Float.isNaN(keyPosition.mPercentWidth) ? f4 : keyPosition.mPercentWidth;
        float f6 = Float.isNaN(keyPosition.mPercentHeight) ? f4 : keyPosition.mPercentHeight;
        float f7 = motionPaths2.width;
        float f8 = motionPaths.width;
        float f9 = motionPaths2.height;
        float f10 = motionPaths.height;
        this.position = this.time;
        float f11 = motionPaths.f258x;
        float f12 = motionPaths.f259y;
        float f13 = (motionPaths2.f258x + (f7 / 2.0f)) - ((f8 / 2.0f) + f11);
        float f14 = (motionPaths2.f259y + (f9 / 2.0f)) - (f12 + (f10 / 2.0f));
        float f15 = ((f7 - f8) * f5) / 2.0f;
        this.f258x = (int) ((f11 + (f13 * f4)) - f15);
        float f16 = ((f9 - f10) * f6) / 2.0f;
        this.f259y = (int) ((f12 + (f14 * f4)) - f16);
        this.width = (int) (f8 + r9);
        this.height = (int) (f10 + r12);
        float f17 = Float.isNaN(keyPosition.mPercentX) ? f4 : keyPosition.mPercentX;
        float f18 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f4 = keyPosition.mPercentY;
        }
        float f19 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 2;
        this.f258x = (int) (((motionPaths.f258x + (f17 * f13)) + (f19 * f14)) - f15);
        this.f259y = (int) (((motionPaths.f259y + (f13 * f18)) + (f14 * f4)) - f16);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f4 = keyPosition.mFramePosition / 100.0f;
        this.time = f4;
        this.mDrawPath = keyPosition.mDrawPath;
        float f5 = Float.isNaN(keyPosition.mPercentWidth) ? f4 : keyPosition.mPercentWidth;
        float f6 = Float.isNaN(keyPosition.mPercentHeight) ? f4 : keyPosition.mPercentHeight;
        float f7 = motionPaths2.width - motionPaths.width;
        float f8 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f4 = keyPosition.mPercentX;
        }
        float f9 = motionPaths.f258x;
        float f10 = motionPaths.width;
        float f11 = motionPaths.f259y;
        float f12 = motionPaths.height;
        float f13 = (motionPaths2.f258x + (motionPaths2.width / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (motionPaths2.f259y + (motionPaths2.height / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f4;
        float f16 = (f7 * f5) / 2.0f;
        this.f258x = (int) ((f9 + f15) - f16);
        float f17 = f4 * f14;
        float f18 = (f8 * f6) / 2.0f;
        this.f259y = (int) ((f11 + f17) - f18);
        this.width = (int) (f10 + r7);
        this.height = (int) (f12 + r8);
        float f19 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f20 = (int) ((motionPaths.f258x + f15) - f16);
        float f21 = (int) ((motionPaths.f259y + f17) - f18);
        this.f258x = f20 + ((-f14) * f19);
        this.f259y = f21 + (f13 * f19);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i4, int i5, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f4 = keyPosition.mFramePosition / 100.0f;
        this.time = f4;
        this.mDrawPath = keyPosition.mDrawPath;
        float f5 = Float.isNaN(keyPosition.mPercentWidth) ? f4 : keyPosition.mPercentWidth;
        float f6 = Float.isNaN(keyPosition.mPercentHeight) ? f4 : keyPosition.mPercentHeight;
        float f7 = motionPaths2.width;
        float f8 = motionPaths.width;
        float f9 = motionPaths2.height;
        float f10 = motionPaths.height;
        this.position = this.time;
        float f11 = motionPaths.f258x;
        float f12 = motionPaths.f259y;
        float f13 = motionPaths2.f258x + (f7 / 2.0f);
        float f14 = motionPaths2.f259y + (f9 / 2.0f);
        float f15 = (f7 - f8) * f5;
        this.f258x = (int) ((f11 + ((f13 - ((f8 / 2.0f) + f11)) * f4)) - (f15 / 2.0f));
        float f16 = (f9 - f10) * f6;
        this.f259y = (int) ((f12 + ((f14 - (f12 + (f10 / 2.0f))) * f4)) - (f16 / 2.0f));
        this.width = (int) (f8 + f15);
        this.height = (int) (f10 + f16);
        this.mMode = 3;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f258x = (int) (keyPosition.mPercentX * ((int) (i4 - this.width)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f259y = (int) (keyPosition.mPercentY * ((int) (i5 - this.height)));
        }
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f4, float f5, float f6, float f7) {
        this.f258x = f4;
        this.f259y = f5;
        this.width = f6;
        this.height = f7;
    }

    public void setDpDt(float f4, float f5, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f10 = (float) dArr[i4];
            double d4 = dArr2[i4];
            int i5 = iArr[i4];
            if (i5 == 1) {
                f6 = f10;
            } else if (i5 == 2) {
                f8 = f10;
            } else if (i5 == 3) {
                f7 = f10;
            } else if (i5 == 4) {
                f9 = f10;
            }
        }
        float f11 = f6 - ((0.0f * f7) / 2.0f);
        float f12 = f8 - ((0.0f * f9) / 2.0f);
        fArr[0] = (f11 * (1.0f - f4)) + (((f7 * 1.0f) + f11) * f4) + 0.0f;
        fArr[1] = (f12 * (1.0f - f5)) + (((f9 * 1.0f) + f12) * f5) + 0.0f;
    }

    public void setView(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f4;
        float f5;
        boolean z3;
        float f6 = this.f258x;
        float f7 = this.f259y;
        float f8 = this.width;
        float f9 = this.height;
        boolean z4 = true;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i4 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i4];
            this.mTempDelta = new double[i4];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            double[] dArr4 = this.mTempValue;
            int i6 = iArr[i5];
            dArr4[i6] = dArr[i5];
            this.mTempDelta[i6] = dArr2[i5];
        }
        int i7 = 0;
        float f10 = Float.NaN;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i7 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i7]) && (dArr3 == null || dArr3[i7] == 0.0d)) {
                f5 = f6;
                z3 = z4;
            } else {
                double d4 = dArr3 != null ? dArr3[i7] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i7])) {
                    d4 = this.mTempValue[i7] + d4;
                }
                f4 = (float) d4;
                f5 = f6;
                float f15 = (float) this.mTempDelta[i7];
                z3 = true;
                if (i7 == 1) {
                    f11 = f15;
                    i7++;
                    z4 = z3;
                    f6 = f4;
                } else if (i7 == 2) {
                    f13 = f15;
                    f7 = f4;
                } else if (i7 == 3) {
                    f12 = f15;
                    f8 = f4;
                } else if (i7 == 4) {
                    f14 = f15;
                    f9 = f4;
                } else if (i7 == 5) {
                    f10 = f4;
                }
            }
            f4 = f5;
            i7++;
            z4 = z3;
            f6 = f4;
        }
        float f16 = f6;
        boolean z5 = z4;
        if (!Float.isNaN(f10)) {
            view.setRotation((float) ((Float.isNaN(Float.NaN) ? 0.0f : Float.NaN) + f10 + Math.toDegrees(Math.atan2(f13 + (f14 / 2.0f), f11 + (f12 / 2.0f)))));
        } else if (!Float.isNaN(Float.NaN)) {
            view.setRotation(Float.NaN);
        }
        float f17 = f16 + 0.5f;
        int i8 = (int) f17;
        float f18 = f7 + 0.5f;
        int i9 = (int) f18;
        int i10 = (int) (f17 + f8);
        int i11 = (int) (f18 + f9);
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        if ((i12 == view.getMeasuredWidth() && i13 == view.getMeasuredHeight()) ? false : z5) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
        view.layout(i8, i9, i10, i11);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i4, int i5, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        int i6 = keyPosition.mPositionType;
        if (i6 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i6 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i4, i5, keyPosition, motionPaths, motionPaths2);
        }
    }
}
