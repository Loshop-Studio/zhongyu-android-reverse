package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C3261R;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CircularFlow extends VirtualLayout {
    private static final String TAG = "CircularFlow";
    private static float sDefaultAngle;
    private static int sDefaultRadius;
    private float[] mAngles;
    ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private String mReferenceAngles;
    private Float mReferenceDefaultAngle;
    private Integer mReferenceDefaultRadius;
    private String mReferenceRadius;
    int mViewCenter;

    public CircularFlow(Context context) {
        super(context);
    }

    private void addAngle(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.mAngles) == null) {
            return;
        }
        if (this.mCountAngle + 1 > fArr.length) {
            this.mAngles = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.mAngles[this.mCountAngle] = Integer.parseInt(str);
        this.mCountAngle++;
    }

    private void addRadius(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.mRadius) == null) {
            return;
        }
        if (this.mCountRadius + 1 > iArr.length) {
            this.mRadius = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.mRadius[this.mCountRadius] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.mCountRadius++;
    }

    private void anchorReferences() {
        this.mContainer = (ConstraintLayout) getParent();
        for (int i9 = 0; i9 < this.mCount; i9++) {
            View viewById = this.mContainer.getViewById(this.mIds[i9]);
            if (viewById != null) {
                int i10 = sDefaultRadius;
                float f10 = sDefaultAngle;
                int[] iArr = this.mRadius;
                if (iArr == null || i9 >= iArr.length) {
                    Integer num = this.mReferenceDefaultRadius;
                    if (num == null || num.intValue() == -1) {
                        Log.e(TAG, "Added radius to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i10;
                    }
                } else {
                    i10 = iArr[i9];
                }
                float[] fArr = this.mAngles;
                if (fArr == null || i9 >= fArr.length) {
                    Float f11 = this.mReferenceDefaultAngle;
                    if (f11 == null || f11.floatValue() == -1.0f) {
                        Log.e(TAG, "Added angle to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f10;
                    }
                } else {
                    f10 = fArr[i9];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f10;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i10;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    private float[] removeAngle(float[] fArr, int i9) {
        return (fArr == null || i9 < 0 || i9 >= this.mCountAngle) ? fArr : removeElementFromArray(fArr, i9);
    }

    private static int[] removeElementFromArray(int[] iArr, int i9) {
        int[] iArr2 = new int[iArr.length - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i11 != i9) {
                iArr2[i10] = iArr[i11];
                i10++;
            }
        }
        return iArr2;
    }

    private int[] removeRadius(int[] iArr, int i9) {
        return (iArr == null || i9 < 0 || i9 >= this.mCountRadius) ? iArr : removeElementFromArray(iArr, i9);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i9 = 0;
        this.mCountAngle = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i9);
            if (iIndexOf == -1) {
                addAngle(str.substring(i9).trim());
                return;
            } else {
                addAngle(str.substring(i9, iIndexOf).trim());
                i9 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i9 = 0;
        this.mCountRadius = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i9);
            if (iIndexOf == -1) {
                addRadius(str.substring(i9).trim());
                return;
            } else {
                addRadius(str.substring(i9, iIndexOf).trim());
                i9 = iIndexOf + 1;
            }
        }
    }

    public void addViewToCircularFlow(View view, int i9, float f10) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.mCountAngle++;
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[this.mCountAngle - 1] = f10;
        this.mCountRadius++;
        int[] radius = getRadius();
        this.mRadius = radius;
        radius[this.mCountRadius - 1] = (int) (i9 * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3261R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == C3261R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.mViewCenter = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C3261R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceAngles = string;
                    setAngles(string);
                } else if (index == C3261R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceRadius = string2;
                    setRadius(string2);
                } else if (index == C3261R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, sDefaultAngle));
                    this.mReferenceDefaultAngle = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == C3261R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sDefaultRadius));
                    this.mReferenceDefaultRadius = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean isUpdatable(View view) {
        return containsId(view.getId()) && indexFromId(view.getId()) != -1;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        Float f10 = this.mReferenceDefaultAngle;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int iRemoveView = super.removeView(view);
        if (iRemoveView == -1) {
            return iRemoveView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.mContainer);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.mContainer);
        float[] fArr = this.mAngles;
        if (iRemoveView < fArr.length) {
            this.mAngles = removeAngle(fArr, iRemoveView);
            this.mCountAngle--;
        }
        int[] iArr = this.mRadius;
        if (iRemoveView < iArr.length) {
            this.mRadius = removeRadius(iArr, iRemoveView);
            this.mCountRadius--;
        }
        anchorReferences();
        return iRemoveView;
    }

    public void setDefaultAngle(float f10) {
        sDefaultAngle = f10;
    }

    public void setDefaultRadius(int i9) {
        sDefaultRadius = i9;
    }

    public void updateAngle(View view, float f10) {
        if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.mAngles.length) {
            return;
        }
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[iIndexFromId] = f10;
        anchorReferences();
    }

    public void updateRadius(View view, int i9) {
        if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.mRadius.length) {
            return;
        }
        int[] radius = getRadius();
        this.mRadius = radius;
        radius[iIndexFromId] = (int) (i9 * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public void updateReference(View view, int i9, float f10) {
        if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (getAngles().length > iIndexFromId) {
            float[] angles = getAngles();
            this.mAngles = angles;
            angles[iIndexFromId] = f10;
        }
        if (getRadius().length > iIndexFromId) {
            int[] radius = getRadius();
            this.mRadius = radius;
            radius[iIndexFromId] = (int) (i9 * this.myContext.getResources().getDisplayMetrics().density);
        }
        anchorReferences();
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    private static float[] removeElementFromArray(float[] fArr, int i9) {
        float[] fArr2 = new float[fArr.length - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < fArr.length; i11++) {
            if (i11 != i9) {
                fArr2[i10] = fArr[i11];
                i10++;
            }
        }
        return fArr2;
    }
}
