package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class FlowReference extends HelperReference {
    protected float mFirstHorizontalBias;
    protected int mFirstHorizontalStyle;
    protected float mFirstVerticalBias;
    protected int mFirstVerticalStyle;
    protected Flow mFlow;
    protected int mHorizontalAlign;
    protected int mHorizontalGap;
    protected int mHorizontalStyle;
    protected float mLastHorizontalBias;
    protected int mLastHorizontalStyle;
    protected float mLastVerticalBias;
    protected int mLastVerticalStyle;
    protected HashMap<String, Float> mMapPostMargin;
    protected HashMap<String, Float> mMapPreMargin;
    protected HashMap<String, Float> mMapWeights;
    protected int mMaxElementsWrap;
    protected int mOrientation;
    protected int mPaddingBottom;
    protected int mPaddingLeft;
    protected int mPaddingRight;
    protected int mPaddingTop;
    protected int mVerticalAlign;
    protected int mVerticalGap;
    protected int mVerticalStyle;
    protected int mWrapMode;

    public FlowReference(State state, State.Helper helper) {
        super(state, helper);
        this.mWrapMode = 0;
        this.mVerticalStyle = -1;
        this.mFirstVerticalStyle = -1;
        this.mLastVerticalStyle = -1;
        this.mHorizontalStyle = -1;
        this.mFirstHorizontalStyle = -1;
        this.mLastHorizontalStyle = -1;
        this.mVerticalAlign = 2;
        this.mHorizontalAlign = 2;
        this.mVerticalGap = 0;
        this.mHorizontalGap = 0;
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mMaxElementsWrap = -1;
        this.mOrientation = 0;
        this.mFirstVerticalBias = 0.5f;
        this.mLastVerticalBias = 0.5f;
        this.mFirstHorizontalBias = 0.5f;
        this.mLastHorizontalBias = 0.5f;
        if (helper == State.Helper.VERTICAL_FLOW) {
            this.mOrientation = 1;
        }
    }

    public void addFlowElement(String str, float f6, float f7, float f8) {
        super.add(str);
        if (!Float.isNaN(f6)) {
            if (this.mMapWeights == null) {
                this.mMapWeights = new HashMap<>();
            }
            this.mMapWeights.put(str, Float.valueOf(f6));
        }
        if (!Float.isNaN(f7)) {
            if (this.mMapPreMargin == null) {
                this.mMapPreMargin = new HashMap<>();
            }
            this.mMapPreMargin.put(str, Float.valueOf(f7));
        }
        if (Float.isNaN(f8)) {
            return;
        }
        if (this.mMapPostMargin == null) {
            this.mMapPostMargin = new HashMap<>();
        }
        this.mMapPostMargin.put(str, Float.valueOf(f8));
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        setConstraintWidget(this.mFlow);
        this.mFlow.setOrientation(this.mOrientation);
        this.mFlow.setWrapMode(this.mWrapMode);
        int i6 = this.mMaxElementsWrap;
        if (i6 != -1) {
            this.mFlow.setMaxElementsWrap(i6);
        }
        int i7 = this.mPaddingLeft;
        if (i7 != 0) {
            this.mFlow.setPaddingLeft(i7);
        }
        int i8 = this.mPaddingTop;
        if (i8 != 0) {
            this.mFlow.setPaddingTop(i8);
        }
        int i9 = this.mPaddingRight;
        if (i9 != 0) {
            this.mFlow.setPaddingRight(i9);
        }
        int i10 = this.mPaddingBottom;
        if (i10 != 0) {
            this.mFlow.setPaddingBottom(i10);
        }
        int i11 = this.mHorizontalGap;
        if (i11 != 0) {
            this.mFlow.setHorizontalGap(i11);
        }
        int i12 = this.mVerticalGap;
        if (i12 != 0) {
            this.mFlow.setVerticalGap(i12);
        }
        float f6 = this.mHorizontalBias;
        if (f6 != 0.5f) {
            this.mFlow.setHorizontalBias(f6);
        }
        float f7 = this.mFirstHorizontalBias;
        if (f7 != 0.5f) {
            this.mFlow.setFirstHorizontalBias(f7);
        }
        float f8 = this.mLastHorizontalBias;
        if (f8 != 0.5f) {
            this.mFlow.setLastHorizontalBias(f8);
        }
        float f9 = this.mVerticalBias;
        if (f9 != 0.5f) {
            this.mFlow.setVerticalBias(f9);
        }
        float f10 = this.mFirstVerticalBias;
        if (f10 != 0.5f) {
            this.mFlow.setFirstVerticalBias(f10);
        }
        float f11 = this.mLastVerticalBias;
        if (f11 != 0.5f) {
            this.mFlow.setLastVerticalBias(f11);
        }
        int i13 = this.mHorizontalAlign;
        if (i13 != 2) {
            this.mFlow.setHorizontalAlign(i13);
        }
        int i14 = this.mVerticalAlign;
        if (i14 != 2) {
            this.mFlow.setVerticalAlign(i14);
        }
        int i15 = this.mVerticalStyle;
        if (i15 != -1) {
            this.mFlow.setVerticalStyle(i15);
        }
        int i16 = this.mFirstVerticalStyle;
        if (i16 != -1) {
            this.mFlow.setFirstVerticalStyle(i16);
        }
        int i17 = this.mLastVerticalStyle;
        if (i17 != -1) {
            this.mFlow.setLastVerticalStyle(i17);
        }
        int i18 = this.mHorizontalStyle;
        if (i18 != -1) {
            this.mFlow.setHorizontalStyle(i18);
        }
        int i19 = this.mFirstHorizontalStyle;
        if (i19 != -1) {
            this.mFlow.setFirstHorizontalStyle(i19);
        }
        int i20 = this.mLastHorizontalStyle;
        if (i20 != -1) {
            this.mFlow.setLastHorizontalStyle(i20);
        }
        applyBase();
    }

    public float getFirstHorizontalBias() {
        return this.mFirstHorizontalBias;
    }

    public int getFirstHorizontalStyle() {
        return this.mFirstHorizontalStyle;
    }

    public float getFirstVerticalBias() {
        return this.mFirstVerticalBias;
    }

    public int getFirstVerticalStyle() {
        return this.mFirstVerticalStyle;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.mFlow == null) {
            this.mFlow = new Flow();
        }
        return this.mFlow;
    }

    public int getHorizontalAlign() {
        return this.mHorizontalAlign;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public int getHorizontalGap() {
        return this.mHorizontalGap;
    }

    public int getHorizontalStyle() {
        return this.mHorizontalStyle;
    }

    public float getLastHorizontalBias() {
        return this.mLastHorizontalBias;
    }

    public int getLastHorizontalStyle() {
        return this.mLastHorizontalStyle;
    }

    public float getLastVerticalBias() {
        return this.mLastVerticalBias;
    }

    public int getLastVerticalStyle() {
        return this.mLastVerticalStyle;
    }

    public int getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public float getPostMargin(String str) {
        HashMap<String, Float> map = this.mMapPreMargin;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreMargin.get(str).floatValue();
    }

    public float getPreMargin(String str) {
        HashMap<String, Float> map = this.mMapPostMargin;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostMargin.get(str).floatValue();
    }

    public int getVerticalAlign() {
        return this.mVerticalAlign;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public int getVerticalGap() {
        return this.mVerticalGap;
    }

    public int getVerticalStyle() {
        return this.mVerticalStyle;
    }

    public float getWeight(String str) {
        HashMap<String, Float> map = this.mMapWeights;
        if (map != null && map.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    public int getWrapMode() {
        return this.mWrapMode;
    }

    public void setFirstHorizontalBias(float f6) {
        this.mFirstHorizontalBias = f6;
    }

    public void setFirstHorizontalStyle(int i6) {
        this.mFirstHorizontalStyle = i6;
    }

    public void setFirstVerticalBias(float f6) {
        this.mFirstVerticalBias = f6;
    }

    public void setFirstVerticalStyle(int i6) {
        this.mFirstVerticalStyle = i6;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(HelperWidget helperWidget) {
        if (helperWidget instanceof Flow) {
            this.mFlow = (Flow) helperWidget;
        } else {
            this.mFlow = null;
        }
    }

    public void setHorizontalAlign(int i6) {
        this.mHorizontalAlign = i6;
    }

    public void setHorizontalGap(int i6) {
        this.mHorizontalGap = i6;
    }

    public void setHorizontalStyle(int i6) {
        this.mHorizontalStyle = i6;
    }

    public void setLastHorizontalBias(float f6) {
        this.mLastHorizontalBias = f6;
    }

    public void setLastHorizontalStyle(int i6) {
        this.mLastHorizontalStyle = i6;
    }

    public void setLastVerticalBias(float f6) {
        this.mLastVerticalBias = f6;
    }

    public void setLastVerticalStyle(int i6) {
        this.mLastVerticalStyle = i6;
    }

    public void setMaxElementsWrap(int i6) {
        this.mMaxElementsWrap = i6;
    }

    public void setOrientation(int i6) {
        this.mOrientation = i6;
    }

    public void setPaddingBottom(int i6) {
        this.mPaddingBottom = i6;
    }

    public void setPaddingLeft(int i6) {
        this.mPaddingLeft = i6;
    }

    public void setPaddingRight(int i6) {
        this.mPaddingRight = i6;
    }

    public void setPaddingTop(int i6) {
        this.mPaddingTop = i6;
    }

    public void setVerticalAlign(int i6) {
        this.mVerticalAlign = i6;
    }

    public void setVerticalGap(int i6) {
        this.mVerticalGap = i6;
    }

    public void setVerticalStyle(int i6) {
        this.mVerticalStyle = i6;
    }

    public void setWrapMode(int i6) {
        this.mWrapMode = i6;
    }
}
