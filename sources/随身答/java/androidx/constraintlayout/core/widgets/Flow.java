package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget mBiggest = null;
        int mBiggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i9, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i10) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i9;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i10;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i9 = this.mCount;
            for (int i10 = 0; i10 < i9 && this.mStartIndex + i10 < Flow.this.mDisplayedWidgetsCount; i10++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i11 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i11 = 0;
                    }
                    this.mWidth += width + i11;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i12 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i12 = 0;
                    }
                    this.mHeight += widgetHeight2 + i12;
                    if (this.mBiggest == null || this.mBiggestDimension < widgetWidth) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth += widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0);
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight += widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0);
                if (this.mBiggest == null || this.mBiggestDimension < widgetWidth2) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.mBiggestDimension = 0;
            this.mBiggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z9, int i9, boolean z10) {
            ConstraintWidget constraintWidget;
            int i10;
            char c10;
            float f10;
            float f11;
            int i11 = this.mCount;
            for (int i12 = 0; i12 < i11 && this.mStartIndex + i12 < Flow.this.mDisplayedWidgetsCount; i12++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i12];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i11 == 0 || this.mBiggest == null) {
                return;
            }
            boolean z11 = z10 && i9 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z9 ? (i11 - 1) - i15 : i15;
                if (this.mStartIndex + i16 >= Flow.this.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i16];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.mOrientation != 0) {
                ConstraintWidget constraintWidget5 = this.mBiggest;
                constraintWidget5.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
                int i17 = this.mPaddingLeft;
                if (i9 > 0) {
                    i17 += Flow.this.mHorizontalGap;
                }
                if (z9) {
                    constraintWidget5.mRight.connect(this.mRight, i17);
                    if (z10) {
                        constraintWidget5.mLeft.connect(this.mLeft, this.mPaddingRight);
                    }
                    if (i9 > 0) {
                        this.mRight.mOwner.mLeft.connect(constraintWidget5.mRight, 0);
                    }
                } else {
                    constraintWidget5.mLeft.connect(this.mLeft, i17);
                    if (z10) {
                        constraintWidget5.mRight.connect(this.mRight, this.mPaddingRight);
                    }
                    if (i9 > 0) {
                        this.mLeft.mOwner.mRight.connect(constraintWidget5.mLeft, 0);
                    }
                }
                for (int i18 = 0; i18 < i11 && this.mStartIndex + i18 < Flow.this.mDisplayedWidgetsCount; i18++) {
                    ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i18];
                    if (constraintWidget6 != null) {
                        if (i18 == 0) {
                            constraintWidget6.connect(constraintWidget6.mTop, this.mTop, this.mPaddingTop);
                            int i19 = Flow.this.mVerticalStyle;
                            float f12 = Flow.this.mVerticalBias;
                            if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                                i19 = Flow.this.mFirstVerticalStyle;
                                f12 = Flow.this.mFirstVerticalBias;
                            } else if (z10 && Flow.this.mLastVerticalStyle != -1) {
                                i19 = Flow.this.mLastVerticalStyle;
                                f12 = Flow.this.mLastVerticalBias;
                            }
                            constraintWidget6.setVerticalChainStyle(i19);
                            constraintWidget6.setVerticalBiasPercent(f12);
                        }
                        if (i18 == i11 - 1) {
                            constraintWidget6.connect(constraintWidget6.mBottom, this.mBottom, this.mPaddingBottom);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                            if (i18 == i13) {
                                constraintWidget6.mTop.setGoneMargin(this.mPaddingTop);
                            }
                            constraintWidget4.mBottom.connect(constraintWidget6.mTop, 0);
                            if (i18 == i14 + 1) {
                                constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                            }
                        }
                        if (constraintWidget6 == constraintWidget5) {
                            constraintWidget4 = constraintWidget6;
                        } else if (z9) {
                            int i20 = Flow.this.mHorizontalAlign;
                            if (i20 == 0) {
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            } else if (i20 == 1) {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                            } else if (i20 == 2) {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            }
                            constraintWidget4 = constraintWidget6;
                        } else {
                            int i21 = Flow.this.mHorizontalAlign;
                            if (i21 == 0) {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                            } else if (i21 == 1) {
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            } else if (i21 == 2) {
                                if (z11) {
                                    constraintWidget6.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                    constraintWidget6.mRight.connect(this.mRight, this.mPaddingRight);
                                } else {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget6;
                        }
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.mBiggest;
            constraintWidget7.setVerticalChainStyle(Flow.this.mVerticalStyle);
            int i22 = this.mPaddingTop;
            if (i9 > 0) {
                i22 += Flow.this.mVerticalGap;
            }
            constraintWidget7.mTop.connect(this.mTop, i22);
            if (z10) {
                constraintWidget7.mBottom.connect(this.mBottom, this.mPaddingBottom);
            }
            if (i9 > 0) {
                this.mTop.mOwner.mBottom.connect(constraintWidget7.mTop, 0);
            }
            char c11 = 3;
            if (Flow.this.mVerticalAlign != 3 || constraintWidget7.hasBaseline()) {
                constraintWidget = constraintWidget7;
            } else {
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = z9 ? (i11 - 1) - i23 : i23;
                    if (this.mStartIndex + i24 >= Flow.this.mDisplayedWidgetsCount) {
                        break;
                    }
                    constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i24];
                    if (constraintWidget.hasBaseline()) {
                        break;
                    }
                }
                constraintWidget = constraintWidget7;
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = z9 ? (i11 - 1) - i25 : i25;
                if (this.mStartIndex + i26 >= Flow.this.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i26];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c10 = c11;
                } else {
                    if (i25 == 0) {
                        i10 = 1;
                        constraintWidget8.connect(constraintWidget8.mLeft, this.mLeft, this.mPaddingLeft);
                    } else {
                        i10 = 1;
                    }
                    if (i26 == 0) {
                        int i27 = Flow.this.mHorizontalStyle;
                        float f13 = Flow.this.mHorizontalBias;
                        if (z9) {
                            f13 = 1.0f - f13;
                        }
                        if (this.mStartIndex != 0 || Flow.this.mFirstHorizontalStyle == -1) {
                            if (z10 && Flow.this.mLastHorizontalStyle != -1) {
                                i27 = Flow.this.mLastHorizontalStyle;
                                if (z9) {
                                    f11 = Flow.this.mLastHorizontalBias;
                                    f10 = 1.0f - f11;
                                    f13 = f10;
                                } else {
                                    f10 = Flow.this.mLastHorizontalBias;
                                    f13 = f10;
                                }
                            }
                            constraintWidget8.setHorizontalChainStyle(i27);
                            constraintWidget8.setHorizontalBiasPercent(f13);
                        } else {
                            i27 = Flow.this.mFirstHorizontalStyle;
                            if (z9) {
                                f11 = Flow.this.mFirstHorizontalBias;
                                f10 = 1.0f - f11;
                                f13 = f10;
                                constraintWidget8.setHorizontalChainStyle(i27);
                                constraintWidget8.setHorizontalBiasPercent(f13);
                            } else {
                                f10 = Flow.this.mFirstHorizontalBias;
                                f13 = f10;
                                constraintWidget8.setHorizontalChainStyle(i27);
                                constraintWidget8.setHorizontalBiasPercent(f13);
                            }
                        }
                    }
                    if (i25 == i11 - 1) {
                        constraintWidget8.connect(constraintWidget8.mRight, this.mRight, this.mPaddingRight);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                        if (i25 == i13) {
                            constraintWidget8.mLeft.setGoneMargin(this.mPaddingLeft);
                        }
                        constraintWidget4.mRight.connect(constraintWidget8.mLeft, 0);
                        if (i25 == i14 + 1) {
                            constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c10 = 3;
                        if (Flow.this.mVerticalAlign == 3 && constraintWidget.hasBaseline() && constraintWidget8 != constraintWidget && constraintWidget8.hasBaseline()) {
                            constraintWidget8.mBaseline.connect(constraintWidget.mBaseline, 0);
                        } else {
                            int i28 = Flow.this.mVerticalAlign;
                            if (i28 == 0) {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                            } else if (i28 == i10) {
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            } else if (z11) {
                                constraintWidget8.mTop.connect(this.mTop, this.mPaddingTop);
                                constraintWidget8.mBottom.connect(this.mBottom, this.mPaddingBottom);
                            } else {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i25++;
                c11 = c10;
                constraintWidget4 = constraintWidget8;
            }
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i9) {
            int i10 = this.mNbMatchConstraintsWidgets;
            if (i10 == 0) {
                return;
            }
            int i11 = this.mCount;
            int i12 = i9 / i10;
            for (int i13 = 0; i13 < i11 && this.mStartIndex + i13 < Flow.this.mDisplayedWidgetsCount; i13++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i13];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    int i14 = i12;
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i14);
                    i12 = i14;
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i9) {
            this.mStartIndex = i9;
        }

        public void setup(int i9, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i10, int i11, int i12, int i13, int i14) {
            this.mOrientation = i9;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i10;
            this.mPaddingTop = i11;
            this.mPaddingRight = i12;
            this.mPaddingBottom = i13;
            this.mMax = i14;
        }
    }

    private void createAlignedConstraints(boolean z9) {
        ConstraintWidget constraintWidget;
        float f10;
        int i9;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i10 = 0; i10 < this.mDisplayedWidgetsCount; i10++) {
            this.mDisplayedWidgets[i10].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i11 = iArr[0];
        int i12 = iArr[1];
        float f11 = this.mHorizontalBias;
        ConstraintWidget constraintWidget2 = null;
        int i13 = 0;
        while (i13 < i11) {
            if (z9) {
                i9 = (i11 - i13) - 1;
                f10 = 1.0f - this.mHorizontalBias;
            } else {
                f10 = f11;
                i9 = i13;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i9];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i13 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f10);
                }
                if (i13 == i11 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i13 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i13++;
            f11 = f10;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i14];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i14 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i14 == i12 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i14 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = (i16 * i11) + i15;
                if (this.mOrientation == 1) {
                    i17 = (i15 * i12) + i16;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i17 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i17]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i15];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i16];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetHeight(ConstraintWidget constraintWidget, int i9) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i10 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (constraintWidget.mMatchConstraintPercentHeight * i9);
                if (i11 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i11);
                }
                return i11;
            }
            constraintWidget2 = constraintWidget;
            if (i10 == 1) {
                return constraintWidget2.getHeight();
            }
            if (i10 == 3) {
                return (int) ((constraintWidget2.getWidth() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetWidth(ConstraintWidget constraintWidget, int i9) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i10 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (constraintWidget.mMatchConstraintPercentWidth * i9);
                if (i11 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i11, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i11;
            }
            constraintWidget2 = constraintWidget;
            if (i10 == 1) {
                return constraintWidget2.getWidth();
            }
            if (i10 == 3) {
                return (int) ((constraintWidget2.getHeight() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i9, int i10, int i11, int[] iArr) {
        int i12;
        Flow flow;
        int i13;
        ConstraintAnchor constraintAnchor;
        int i14;
        Flow flow2 = this;
        if (i9 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i15 = i11;
        WidgetsList widgetsList = flow2.new WidgetsList(i10, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i15);
        flow2.mChainList.add(widgetsList);
        if (i10 == 0) {
            i12 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i9) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i17];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i15);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i18 = i12;
                boolean z9 = (i16 == i15 || (flow2.mHorizontalGap + i16) + widgetWidth > i15) && widgetsList.mBiggest != null;
                if (!z9 && i17 > 0 && (i14 = flow2.mMaxElementsWrap) > 0 && i17 % i14 == 0) {
                    z9 = true;
                }
                if (z9) {
                    widgetsList = flow2.new WidgetsList(i10, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i15);
                    widgetsList.setStartIndex(i17);
                    flow2.mChainList.add(widgetsList);
                } else {
                    if (i17 > 0) {
                        i16 += flow2.mHorizontalGap + widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i17++;
                    i12 = i18;
                }
                i16 = widgetWidth;
                widgetsList.add(constraintWidget);
                i17++;
                i12 = i18;
            }
        } else {
            i12 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < i9) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i20];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i15);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i21 = i12;
                boolean z10 = (i19 == i15 || (flow2.mVerticalGap + i19) + widgetHeight > i15) && widgetsList.mBiggest != null;
                if (!z10 && i20 > 0 && (i13 = flow2.mMaxElementsWrap) > 0 && i20 % i13 == 0) {
                    z10 = true;
                }
                if (z10) {
                    widgetsList = flow2.new WidgetsList(i10, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i15);
                    flow = flow2;
                    widgetsList.setStartIndex(i20);
                    flow.mChainList.add(widgetsList);
                } else {
                    flow = flow2;
                    if (i20 > 0) {
                        i19 += flow.mVerticalGap + widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i20++;
                    i15 = i11;
                    i12 = i21;
                    flow2 = flow;
                }
                i19 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i20++;
                i15 = i11;
                i12 = i21;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor2 = flow3.mLeft;
        ConstraintAnchor constraintAnchor3 = flow3.mTop;
        ConstraintAnchor constraintAnchor4 = flow3.mRight;
        ConstraintAnchor constraintAnchor5 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = flow3.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z11 = horizontalDimensionBehaviour == dimensionBehaviour || flow3.getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i12 > 0 && z11) {
            for (int i22 = 0; i22 < size; i22++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i22);
                if (i10 == 0) {
                    widgetsList2.measureMatchConstraints(i11 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i11 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int paddingBottom2 = paddingBottom;
        int i23 = 0;
        int paddingRight2 = paddingRight;
        int i24 = paddingTop;
        int i25 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i26 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i27);
            if (i10 == 0) {
                if (i27 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i27 + 1).mBiggest.mTop;
                    paddingBottom2 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    paddingBottom2 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                int i28 = i26;
                widgetsList3.setup(i10, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i25, i24, paddingRight2, paddingBottom2, i11);
                int iMax = Math.max(i23, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i28;
                if (i27 > 0) {
                    height += flow3.mVerticalGap;
                }
                i26 = height;
                i23 = iMax;
                constraintAnchor9 = constraintAnchor10;
                i24 = 0;
            } else {
                int i29 = i23;
                int i30 = i26;
                if (i27 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i27 + 1).mBiggest.mLeft;
                    paddingRight2 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    paddingRight2 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i10, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i25, i24, paddingRight2, paddingBottom2, i11);
                int width = widgetsList3.getWidth() + i29;
                int iMax2 = Math.max(i30, widgetsList3.getHeight());
                if (i27 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i31 = width;
                i26 = iMax2;
                i23 = i31;
                i25 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i23;
        iArr[1] = i26;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i9, int i10, int i11, int[] iArr) {
        int i12;
        Flow flow;
        int i13;
        boolean z9;
        ConstraintAnchor constraintAnchor;
        int i14;
        Flow flow2 = this;
        if (i9 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i15 = i11;
        WidgetsList widgetsList = flow2.new WidgetsList(i10, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i15);
        flow2.mChainList.add(widgetsList);
        boolean z10 = true;
        if (i10 == 0) {
            int i16 = 0;
            i12 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i9) {
                i16++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i18];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i15);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i19 = i12;
                boolean z11 = (i17 == i15 || (flow2.mHorizontalGap + i17) + widgetWidth > i15) && widgetsList.mBiggest != null;
                if (!z11 && i18 > 0 && (i14 = flow2.mMaxElementsWrap) > 0 && i16 > i14) {
                    z11 = true;
                }
                if (z11) {
                    widgetsList = flow2.new WidgetsList(i10, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i15);
                    widgetsList.setStartIndex(i18);
                    flow2.mChainList.add(widgetsList);
                    i16 = 1;
                } else {
                    if (i18 > 0) {
                        i17 += flow2.mHorizontalGap + widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i18++;
                    i12 = i19;
                }
                i17 = widgetWidth;
                widgetsList.add(constraintWidget);
                i18++;
                i12 = i19;
            }
        } else {
            int i20 = 0;
            i12 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i22 < i9) {
                i20++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i22];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i15);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i23 = i12;
                boolean z12 = (i21 == i15 || (flow2.mVerticalGap + i21) + widgetHeight > i15) && widgetsList.mBiggest != null;
                if (!z12 && i22 > 0 && (i13 = flow2.mMaxElementsWrap) > 0 && i20 > i13) {
                    z12 = true;
                }
                if (z12) {
                    widgetsList = flow2.new WidgetsList(i10, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i15);
                    flow = flow2;
                    widgetsList.setStartIndex(i22);
                    flow.mChainList.add(widgetsList);
                    i20 = 1;
                } else {
                    flow = flow2;
                    if (i22 > 0) {
                        i21 += flow.mVerticalGap + widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i22++;
                    i15 = i11;
                    i12 = i23;
                    flow2 = flow;
                }
                i21 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i22++;
                i15 = i11;
                i12 = i23;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor2 = flow3.mLeft;
        ConstraintAnchor constraintAnchor3 = flow3.mTop;
        ConstraintAnchor constraintAnchor4 = flow3.mRight;
        ConstraintAnchor constraintAnchor5 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = flow3.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z13 = horizontalDimensionBehaviour == dimensionBehaviour || flow3.getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i12 > 0 && z13) {
            for (int i24 = 0; i24 < size; i24++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i24);
                if (i10 == 0) {
                    widgetsList2.measureMatchConstraints(i11 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i11 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int paddingBottom2 = paddingBottom;
        int i25 = 0;
        int i26 = 0;
        int paddingRight2 = paddingRight;
        int i27 = paddingTop;
        int i28 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i29 = 0;
        while (i26 < size) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i26);
            if (i10 == 0) {
                if (i26 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i26 + 1).mBiggest.mTop;
                    paddingBottom2 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    paddingBottom2 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                z9 = z10;
                int i30 = i25;
                widgetsList3.setup(i10, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i28, i27, paddingRight2, paddingBottom2, i11);
                int iMax = Math.max(i29, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i30;
                if (i26 > 0) {
                    height += flow3.mVerticalGap;
                }
                i25 = height;
                i29 = iMax;
                constraintAnchor6 = constraintAnchor10;
                i27 = 0;
            } else {
                int i31 = i25;
                z9 = z10;
                int i32 = i29;
                if (i26 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i26 + 1).mBiggest.mLeft;
                    paddingRight2 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    paddingRight2 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i10, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i28, i27, paddingRight2, paddingBottom2, i11);
                int width = widgetsList3.getWidth() + i32;
                int iMax2 = Math.max(i31, widgetsList3.getHeight());
                if (i26 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i33 = width;
                i25 = iMax2;
                i29 = i33;
                i28 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i26++;
            z10 = z9;
        }
        iArr[0] = i29;
        iArr[z10 ? 1 : 0] = i25;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i9, int i10, int i11, int[] iArr) {
        WidgetsList widgetsList;
        if (i9 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i10, this.mLeft, this.mTop, this.mRight, this.mBottom, i11);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList2.setup(i10, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i11);
            widgetsList = widgetsList2;
        }
        for (int i12 = 0; i12 < i9; i12++) {
            widgetsList.add(constraintWidgetArr[i12]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z9) {
        super.addToSolver(linearSystem, z9);
        boolean z10 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i9 = this.mWrapMode;
        if (i9 != 0) {
            if (i9 == 1) {
                int size = this.mChainList.size();
                int i10 = 0;
                while (i10 < size) {
                    this.mChainList.get(i10).createConstraints(z10, i10, i10 == size + (-1));
                    i10++;
                }
            } else if (i9 == 2) {
                createAlignedConstraints(z10);
            } else if (i9 == 3) {
                int size2 = this.mChainList.size();
                int i11 = 0;
                while (i11 < size2) {
                    this.mChainList.get(i11).createConstraints(z10, i11, i11 == size2 + (-1));
                    i11++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z10, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i9, int i10, int i11, int i12) {
        int i13;
        ConstraintWidget[] constraintWidgetArr;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = new int[2];
        int i14 = (i10 - paddingLeft) - paddingRight;
        int i15 = this.mOrientation;
        if (i15 == 1) {
            i14 = (i12 - paddingTop) - paddingBottom;
        }
        int i16 = i14;
        if (i15 == 0) {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i13 = this.mWidgetsCount;
            if (i17 >= i13) {
                break;
            }
            if (this.mWidgets[i17].getVisibility() == 8) {
                i18++;
            }
            i17++;
        }
        if (i18 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i13 - i18];
            int i19 = 0;
            i13 = 0;
            while (i19 < this.mWidgetsCount) {
                ConstraintWidget constraintWidget = this.mWidgets[i19];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr4[i13] = constraintWidget;
                    i13++;
                }
                i19++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i20 = i13;
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i20;
        int i21 = this.mWrapMode;
        if (i21 == 0) {
            measureNoWrap(constraintWidgetArr, i20, this.mOrientation, i16, iArr);
        } else if (i21 == 1) {
            measureChainWrap(constraintWidgetArr, i20, this.mOrientation, i16, iArr);
        } else if (i21 == 2) {
            measureAligned(constraintWidgetArr, i20, this.mOrientation, i16, iArr);
        } else if (i21 == 3) {
            measureChainWrap_new(constraintWidgetArr, i20, this.mOrientation, i16, iArr);
        }
        int iMin = iArr[0] + paddingLeft + paddingRight;
        int iMin2 = iArr[1] + paddingTop + paddingBottom;
        if (i9 == 1073741824) {
            iMin = i10;
        } else if (i9 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i10);
        } else if (i9 != 0) {
            iMin = 0;
        }
        if (i11 == 1073741824) {
            iMin2 = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i12);
        } else if (i11 != 0) {
            iMin2 = 0;
        }
        setMeasure(iMin, iMin2);
        setWidth(iMin);
        setHeight(iMin2);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
    }

    public void setFirstHorizontalBias(float f10) {
        this.mFirstHorizontalBias = f10;
    }

    public void setFirstHorizontalStyle(int i9) {
        this.mFirstHorizontalStyle = i9;
    }

    public void setFirstVerticalBias(float f10) {
        this.mFirstVerticalBias = f10;
    }

    public void setFirstVerticalStyle(int i9) {
        this.mFirstVerticalStyle = i9;
    }

    public void setHorizontalAlign(int i9) {
        this.mHorizontalAlign = i9;
    }

    public void setHorizontalBias(float f10) {
        this.mHorizontalBias = f10;
    }

    public void setHorizontalGap(int i9) {
        this.mHorizontalGap = i9;
    }

    public void setHorizontalStyle(int i9) {
        this.mHorizontalStyle = i9;
    }

    public void setLastHorizontalBias(float f10) {
        this.mLastHorizontalBias = f10;
    }

    public void setLastHorizontalStyle(int i9) {
        this.mLastHorizontalStyle = i9;
    }

    public void setLastVerticalBias(float f10) {
        this.mLastVerticalBias = f10;
    }

    public void setLastVerticalStyle(int i9) {
        this.mLastVerticalStyle = i9;
    }

    public void setMaxElementsWrap(int i9) {
        this.mMaxElementsWrap = i9;
    }

    public void setOrientation(int i9) {
        this.mOrientation = i9;
    }

    public void setVerticalAlign(int i9) {
        this.mVerticalAlign = i9;
    }

    public void setVerticalBias(float f10) {
        this.mVerticalBias = f10;
    }

    public void setVerticalGap(int i9) {
        this.mVerticalGap = i9;
    }

    public void setVerticalStyle(int i9) {
        this.mVerticalStyle = i9;
    }

    public void setWrapMode(int i9) {
        this.mWrapMode = i9;
    }
}
