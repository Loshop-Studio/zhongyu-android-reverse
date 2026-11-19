package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.C2598R;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.VirtualLayout;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.Flow mFlow;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mFlow = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2598R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == C2598R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.mFlow.setOrientation(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_padding) {
                    this.mFlow.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.mFlow.setPaddingStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.mFlow.setPaddingEnd(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.mFlow.setPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.mFlow.setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.mFlow.setPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.mFlow.setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.mFlow.setWrapMode(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.mFlow.setHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.mFlow.setVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.mFlow.setFirstHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.mFlow.setLastHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.mFlow.setFirstVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.mFlow.setLastVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.mFlow.setHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.mFlow.setFirstHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.mFlow.setLastHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.mFlow.setFirstVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.mFlow.setLastVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.mFlow.setVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.mFlow.setHorizontalAlign(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.mFlow.setVerticalAlign(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.mFlow.setHorizontalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.mFlow.setVerticalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C2598R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.mFlow.setMaxElementsWrap(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) helperWidget;
            int i6 = layoutParams.orientation;
            if (i6 != -1) {
                flow.setOrientation(i6);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i6, int i7) {
        onMeasure(this.mFlow, i6, i7);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z6) {
        this.mFlow.applyRtl(z6);
    }

    public void setFirstHorizontalBias(float f6) {
        this.mFlow.setFirstHorizontalBias(f6);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.mFlow.setFirstHorizontalStyle(i6);
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.mFlow.setFirstVerticalBias(f6);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.mFlow.setFirstVerticalStyle(i6);
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.mFlow.setHorizontalAlign(i6);
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.mFlow.setHorizontalBias(f6);
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.mFlow.setHorizontalGap(i6);
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.mFlow.setHorizontalStyle(i6);
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.mFlow.setLastHorizontalBias(f6);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i6) {
        this.mFlow.setLastHorizontalStyle(i6);
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.mFlow.setLastVerticalBias(f6);
        requestLayout();
    }

    public void setLastVerticalStyle(int i6) {
        this.mFlow.setLastVerticalStyle(i6);
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.mFlow.setMaxElementsWrap(i6);
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.mFlow.setOrientation(i6);
        requestLayout();
    }

    public void setPadding(int i6) {
        this.mFlow.setPadding(i6);
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.mFlow.setPaddingBottom(i6);
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.mFlow.setPaddingLeft(i6);
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.mFlow.setPaddingRight(i6);
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.mFlow.setPaddingTop(i6);
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.mFlow.setVerticalAlign(i6);
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.mFlow.setVerticalBias(f6);
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.mFlow.setVerticalGap(i6);
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.mFlow.setVerticalStyle(i6);
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.mFlow.setWrapMode(i6);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.measure(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
    }

    public Flow(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
    }
}
