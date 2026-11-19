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

        public WidgetsList(int i6, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i7) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i6;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i7;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i6 = this.mCount;
            for (int i7 = 0; i7 < i6 && this.mStartIndex + i7 < Flow.this.mDisplayedWidgetsCount; i7++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i7];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i8 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i8 = 0;
                    }
                    this.mWidth += width + i8;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i9 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i9 = 0;
                    }
                    this.mHeight += widgetHeight2 + i9;
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

        public void createConstraints(boolean z6, int i6, boolean z7) {
            ConstraintWidget constraintWidget;
            int i7;
            char c7;
            float f6;
            float f7;
            int i8 = this.mCount;
            for (int i9 = 0; i9 < i8 && this.mStartIndex + i9 < Flow.this.mDisplayedWidgetsCount; i9++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i9];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i8 == 0 || this.mBiggest == null) {
                return;
            }
            boolean z8 = z7 && i6 == 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = z6 ? (i8 - 1) - i12 : i12;
                if (this.mStartIndex + i13 >= Flow.this.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i13];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i10 == -1) {
                        i10 = i12;
                    }
                    i11 = i12;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.mOrientation != 0) {
                ConstraintWidget constraintWidget5 = this.mBiggest;
                constraintWidget5.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
                int i14 = this.mPaddingLeft;
                if (i6 > 0) {
                    i14 += Flow.this.mHorizontalGap;
                }
                if (z6) {
                    constraintWidget5.mRight.connect(this.mRight, i14);
                    if (z7) {
                        constraintWidget5.mLeft.connect(this.mLeft, this.mPaddingRight);
                    }
                    if (i6 > 0) {
                        this.mRight.mOwner.mLeft.connect(constraintWidget5.mRight, 0);
                    }
                } else {
                    constraintWidget5.mLeft.connect(this.mLeft, i14);
                    if (z7) {
                        constraintWidget5.mRight.connect(this.mRight, this.mPaddingRight);
                    }
                    if (i6 > 0) {
                        this.mLeft.mOwner.mRight.connect(constraintWidget5.mLeft, 0);
                    }
                }
                for (int i15 = 0; i15 < i8 && this.mStartIndex + i15 < Flow.this.mDisplayedWidgetsCount; i15++) {
                    ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i15];
                    if (constraintWidget6 != null) {
                        if (i15 == 0) {
                            constraintWidget6.connect(constraintWidget6.mTop, this.mTop, this.mPaddingTop);
                            int i16 = Flow.this.mVerticalStyle;
                            float f8 = Flow.this.mVerticalBias;
                            if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                                i16 = Flow.this.mFirstVerticalStyle;
                                f8 = Flow.this.mFirstVerticalBias;
                            } else if (z7 && Flow.this.mLastVerticalStyle != -1) {
                                i16 = Flow.this.mLastVerticalStyle;
                                f8 = Flow.this.mLastVerticalBias;
                            }
                            constraintWidget6.setVerticalChainStyle(i16);
                            constraintWidget6.setVerticalBiasPercent(f8);
                        }
                        if (i15 == i8 - 1) {
                            constraintWidget6.connect(constraintWidget6.mBottom, this.mBottom, this.mPaddingBottom);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                            if (i15 == i10) {
                                constraintWidget6.mTop.setGoneMargin(this.mPaddingTop);
                            }
                            constraintWidget4.mBottom.connect(constraintWidget6.mTop, 0);
                            if (i15 == i11 + 1) {
                                constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                            }
                        }
                        if (constraintWidget6 == constraintWidget5) {
                            constraintWidget4 = constraintWidget6;
                        } else if (z6) {
                            int i17 = Flow.this.mHorizontalAlign;
                            if (i17 == 0) {
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            } else if (i17 == 1) {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                            } else if (i17 == 2) {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            }
                            constraintWidget4 = constraintWidget6;
                        } else {
                            int i18 = Flow.this.mHorizontalAlign;
                            if (i18 == 0) {
                                constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                            } else if (i18 == 1) {
                                constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                            } else if (i18 == 2) {
                                if (z8) {
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
            int i19 = this.mPaddingTop;
            if (i6 > 0) {
                i19 += Flow.this.mVerticalGap;
            }
            constraintWidget7.mTop.connect(this.mTop, i19);
            if (z7) {
                constraintWidget7.mBottom.connect(this.mBottom, this.mPaddingBottom);
            }
            if (i6 > 0) {
                this.mTop.mOwner.mBottom.connect(constraintWidget7.mTop, 0);
            }
            char c8 = 3;
            if (Flow.this.mVerticalAlign != 3 || constraintWidget7.hasBaseline()) {
                constraintWidget = constraintWidget7;
            } else {
                for (int i20 = 0; i20 < i8; i20++) {
                    int i21 = z6 ? (i8 - 1) - i20 : i20;
                    if (this.mStartIndex + i21 >= Flow.this.mDisplayedWidgetsCount) {
                        break;
                    }
                    constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i21];
                    if (constraintWidget.hasBaseline()) {
                        break;
                    }
                }
                constraintWidget = constraintWidget7;
            }
            int i22 = 0;
            while (i22 < i8) {
                int i23 = z6 ? (i8 - 1) - i22 : i22;
                if (this.mStartIndex + i23 >= Flow.this.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i23];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c7 = c8;
                } else {
                    if (i22 == 0) {
                        i7 = 1;
                        constraintWidget8.connect(constraintWidget8.mLeft, this.mLeft, this.mPaddingLeft);
                    } else {
                        i7 = 1;
                    }
                    if (i23 == 0) {
                        int i24 = Flow.this.mHorizontalStyle;
                        float f9 = Flow.this.mHorizontalBias;
                        if (z6) {
                            f9 = 1.0f - f9;
                        }
                        if (this.mStartIndex != 0 || Flow.this.mFirstHorizontalStyle == -1) {
                            if (z7 && Flow.this.mLastHorizontalStyle != -1) {
                                i24 = Flow.this.mLastHorizontalStyle;
                                if (z6) {
                                    f7 = Flow.this.mLastHorizontalBias;
                                    f6 = 1.0f - f7;
                                    f9 = f6;
                                } else {
                                    f6 = Flow.this.mLastHorizontalBias;
                                    f9 = f6;
                                }
                            }
                            constraintWidget8.setHorizontalChainStyle(i24);
                            constraintWidget8.setHorizontalBiasPercent(f9);
                        } else {
                            i24 = Flow.this.mFirstHorizontalStyle;
                            if (z6) {
                                f7 = Flow.this.mFirstHorizontalBias;
                                f6 = 1.0f - f7;
                                f9 = f6;
                                constraintWidget8.setHorizontalChainStyle(i24);
                                constraintWidget8.setHorizontalBiasPercent(f9);
                            } else {
                                f6 = Flow.this.mFirstHorizontalBias;
                                f9 = f6;
                                constraintWidget8.setHorizontalChainStyle(i24);
                                constraintWidget8.setHorizontalBiasPercent(f9);
                            }
                        }
                    }
                    if (i22 == i8 - 1) {
                        constraintWidget8.connect(constraintWidget8.mRight, this.mRight, this.mPaddingRight);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                        if (i22 == i10) {
                            constraintWidget8.mLeft.setGoneMargin(this.mPaddingLeft);
                        }
                        constraintWidget4.mRight.connect(constraintWidget8.mLeft, 0);
                        if (i22 == i11 + 1) {
                            constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c7 = 3;
                        if (Flow.this.mVerticalAlign == 3 && constraintWidget.hasBaseline() && constraintWidget8 != constraintWidget && constraintWidget8.hasBaseline()) {
                            constraintWidget8.mBaseline.connect(constraintWidget.mBaseline, 0);
                        } else {
                            int i25 = Flow.this.mVerticalAlign;
                            if (i25 == 0) {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                            } else if (i25 == i7) {
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            } else if (z8) {
                                constraintWidget8.mTop.connect(this.mTop, this.mPaddingTop);
                                constraintWidget8.mBottom.connect(this.mBottom, this.mPaddingBottom);
                            } else {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            }
                        }
                    } else {
                        c7 = 3;
                    }
                }
                i22++;
                c8 = c7;
                constraintWidget4 = constraintWidget8;
            }
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i6) {
            int i7 = this.mNbMatchConstraintsWidgets;
            if (i7 == 0) {
                return;
            }
            int i8 = this.mCount;
            int i9 = i6 / i7;
            for (int i10 = 0; i10 < i8 && this.mStartIndex + i10 < Flow.this.mDisplayedWidgetsCount; i10++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i9, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    int i11 = i9;
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i11);
                    i9 = i11;
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i6) {
            this.mStartIndex = i6;
        }

        public void setup(int i6, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i7, int i8, int i9, int i10, int i11) {
            this.mOrientation = i6;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i7;
            this.mPaddingTop = i8;
            this.mPaddingRight = i9;
            this.mPaddingBottom = i10;
            this.mMax = i11;
        }
    }

    private void createAlignedConstraints(boolean z6) {
        ConstraintWidget constraintWidget;
        float f6;
        int i6;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i7 = 0; i7 < this.mDisplayedWidgetsCount; i7++) {
            this.mDisplayedWidgets[i7].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i8 = iArr[0];
        int i9 = iArr[1];
        float f7 = this.mHorizontalBias;
        ConstraintWidget constraintWidget2 = null;
        int i10 = 0;
        while (i10 < i8) {
            if (z6) {
                i6 = (i8 - i10) - 1;
                f6 = 1.0f - this.mHorizontalBias;
            } else {
                f6 = f7;
                i6 = i10;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i6];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i10 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f6);
                }
                if (i10 == i8 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i10 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i10++;
            f7 = f6;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i11];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i11 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i11 == i9 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i11 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i12 = 0; i12 < i8; i12++) {
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = (i13 * i8) + i12;
                if (this.mOrientation == 1) {
                    i14 = (i12 * i9) + i13;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i14 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i14]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i12];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i13];
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
    public int getWidgetHeight(ConstraintWidget constraintWidget, int i6) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i7 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (constraintWidget.mMatchConstraintPercentHeight * i6);
                if (i8 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i8);
                }
                return i8;
            }
            constraintWidget2 = constraintWidget;
            if (i7 == 1) {
                return constraintWidget2.getHeight();
            }
            if (i7 == 3) {
                return (int) ((constraintWidget2.getWidth() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetWidth(ConstraintWidget constraintWidget, int i6) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i7 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (constraintWidget.mMatchConstraintPercentWidth * i6);
                if (i8 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i8, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i8;
            }
            constraintWidget2 = constraintWidget;
            if (i7 == 1) {
                return constraintWidget2.getWidth();
            }
            if (i7 == 3) {
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

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i6, int i7, int i8, int[] iArr) {
        int i9;
        Flow flow;
        int i10;
        ConstraintAnchor constraintAnchor;
        int i11;
        Flow flow2 = this;
        if (i6 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i12 = i8;
        WidgetsList widgetsList = flow2.new WidgetsList(i7, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
        flow2.mChainList.add(widgetsList);
        if (i7 == 0) {
            i9 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i6) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i12);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i9++;
                }
                int i15 = i9;
                boolean z6 = (i13 == i12 || (flow2.mHorizontalGap + i13) + widgetWidth > i12) && widgetsList.mBiggest != null;
                if (!z6 && i14 > 0 && (i11 = flow2.mMaxElementsWrap) > 0 && i14 % i11 == 0) {
                    z6 = true;
                }
                if (z6) {
                    widgetsList = flow2.new WidgetsList(i7, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    widgetsList.setStartIndex(i14);
                    flow2.mChainList.add(widgetsList);
                } else {
                    if (i14 > 0) {
                        i13 += flow2.mHorizontalGap + widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i14++;
                    i9 = i15;
                }
                i13 = widgetWidth;
                widgetsList.add(constraintWidget);
                i14++;
                i9 = i15;
            }
        } else {
            i9 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i6) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i12);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i9++;
                }
                int i18 = i9;
                boolean z7 = (i16 == i12 || (flow2.mVerticalGap + i16) + widgetHeight > i12) && widgetsList.mBiggest != null;
                if (!z7 && i17 > 0 && (i10 = flow2.mMaxElementsWrap) > 0 && i17 % i10 == 0) {
                    z7 = true;
                }
                if (z7) {
                    widgetsList = flow2.new WidgetsList(i7, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    flow = flow2;
                    widgetsList.setStartIndex(i17);
                    flow.mChainList.add(widgetsList);
                } else {
                    flow = flow2;
                    if (i17 > 0) {
                        i16 += flow.mVerticalGap + widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i17++;
                    i12 = i8;
                    i9 = i18;
                    flow2 = flow;
                }
                i16 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i17++;
                i12 = i8;
                i9 = i18;
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
        boolean z8 = horizontalDimensionBehaviour == dimensionBehaviour || flow3.getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i9 > 0 && z8) {
            for (int i19 = 0; i19 < size; i19++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i19);
                if (i7 == 0) {
                    widgetsList2.measureMatchConstraints(i8 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i8 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int paddingBottom2 = paddingBottom;
        int i20 = 0;
        int paddingRight2 = paddingRight;
        int i21 = paddingTop;
        int i22 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i23 = 0;
        for (int i24 = 0; i24 < size; i24++) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i24);
            if (i7 == 0) {
                if (i24 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i24 + 1).mBiggest.mTop;
                    paddingBottom2 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    paddingBottom2 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                int i25 = i23;
                widgetsList3.setup(i7, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i22, i21, paddingRight2, paddingBottom2, i8);
                int iMax = Math.max(i20, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i25;
                if (i24 > 0) {
                    height += flow3.mVerticalGap;
                }
                i23 = height;
                i20 = iMax;
                constraintAnchor9 = constraintAnchor10;
                i21 = 0;
            } else {
                int i26 = i20;
                int i27 = i23;
                if (i24 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i24 + 1).mBiggest.mLeft;
                    paddingRight2 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    paddingRight2 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i7, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i22, i21, paddingRight2, paddingBottom2, i8);
                int width = widgetsList3.getWidth() + i26;
                int iMax2 = Math.max(i27, widgetsList3.getHeight());
                if (i24 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i28 = width;
                i23 = iMax2;
                i20 = i28;
                i22 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i20;
        iArr[1] = i23;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i6, int i7, int i8, int[] iArr) {
        int i9;
        Flow flow;
        int i10;
        boolean z6;
        ConstraintAnchor constraintAnchor;
        int i11;
        Flow flow2 = this;
        if (i6 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i12 = i8;
        WidgetsList widgetsList = flow2.new WidgetsList(i7, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
        flow2.mChainList.add(widgetsList);
        boolean z7 = true;
        if (i7 == 0) {
            int i13 = 0;
            i9 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i6) {
                i13++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i15];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i12);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i9++;
                }
                int i16 = i9;
                boolean z8 = (i14 == i12 || (flow2.mHorizontalGap + i14) + widgetWidth > i12) && widgetsList.mBiggest != null;
                if (!z8 && i15 > 0 && (i11 = flow2.mMaxElementsWrap) > 0 && i13 > i11) {
                    z8 = true;
                }
                if (z8) {
                    widgetsList = flow2.new WidgetsList(i7, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    widgetsList.setStartIndex(i15);
                    flow2.mChainList.add(widgetsList);
                    i13 = 1;
                } else {
                    if (i15 > 0) {
                        i14 += flow2.mHorizontalGap + widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i15++;
                    i9 = i16;
                }
                i14 = widgetWidth;
                widgetsList.add(constraintWidget);
                i15++;
                i9 = i16;
            }
        } else {
            int i17 = 0;
            i9 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i6) {
                i17++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i19];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i12);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i9++;
                }
                int i20 = i9;
                boolean z9 = (i18 == i12 || (flow2.mVerticalGap + i18) + widgetHeight > i12) && widgetsList.mBiggest != null;
                if (!z9 && i19 > 0 && (i10 = flow2.mMaxElementsWrap) > 0 && i17 > i10) {
                    z9 = true;
                }
                if (z9) {
                    widgetsList = flow2.new WidgetsList(i7, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    flow = flow2;
                    widgetsList.setStartIndex(i19);
                    flow.mChainList.add(widgetsList);
                    i17 = 1;
                } else {
                    flow = flow2;
                    if (i19 > 0) {
                        i18 += flow.mVerticalGap + widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i19++;
                    i12 = i8;
                    i9 = i20;
                    flow2 = flow;
                }
                i18 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i19++;
                i12 = i8;
                i9 = i20;
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
        boolean z10 = horizontalDimensionBehaviour == dimensionBehaviour || flow3.getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i9 > 0 && z10) {
            for (int i21 = 0; i21 < size; i21++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i21);
                if (i7 == 0) {
                    widgetsList2.measureMatchConstraints(i8 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i8 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int paddingBottom2 = paddingBottom;
        int i22 = 0;
        int i23 = 0;
        int paddingRight2 = paddingRight;
        int i24 = paddingTop;
        int i25 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i26 = 0;
        while (i23 < size) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i23);
            if (i7 == 0) {
                if (i23 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i23 + 1).mBiggest.mTop;
                    paddingBottom2 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    paddingBottom2 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                z6 = z7;
                int i27 = i22;
                widgetsList3.setup(i7, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i25, i24, paddingRight2, paddingBottom2, i8);
                int iMax = Math.max(i26, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i27;
                if (i23 > 0) {
                    height += flow3.mVerticalGap;
                }
                i22 = height;
                i26 = iMax;
                constraintAnchor6 = constraintAnchor10;
                i24 = 0;
            } else {
                int i28 = i22;
                z6 = z7;
                int i29 = i26;
                if (i23 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i23 + 1).mBiggest.mLeft;
                    paddingRight2 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    paddingRight2 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i7, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i25, i24, paddingRight2, paddingBottom2, i8);
                int width = widgetsList3.getWidth() + i29;
                int iMax2 = Math.max(i28, widgetsList3.getHeight());
                if (i23 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i30 = width;
                i22 = iMax2;
                i26 = i30;
                i25 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i23++;
            z7 = z6;
        }
        iArr[0] = i26;
        iArr[z7 ? 1 : 0] = i22;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i6, int i7, int i8, int[] iArr) {
        WidgetsList widgetsList;
        if (i6 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i7, this.mLeft, this.mTop, this.mRight, this.mBottom, i8);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList2.setup(i7, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i8);
            widgetsList = widgetsList2;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            widgetsList.add(constraintWidgetArr[i9]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z6) {
        super.addToSolver(linearSystem, z6);
        boolean z7 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i6 = this.mWrapMode;
        if (i6 != 0) {
            if (i6 == 1) {
                int size = this.mChainList.size();
                int i7 = 0;
                while (i7 < size) {
                    this.mChainList.get(i7).createConstraints(z7, i7, i7 == size + (-1));
                    i7++;
                }
            } else if (i6 == 2) {
                createAlignedConstraints(z7);
            } else if (i6 == 3) {
                int size2 = this.mChainList.size();
                int i8 = 0;
                while (i8 < size2) {
                    this.mChainList.get(i8).createConstraints(z7, i8, i8 == size2 + (-1));
                    i8++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z7, 0, true);
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
    public void measure(int i6, int i7, int i8, int i9) {
        int i10;
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
        int i11 = (i7 - paddingLeft) - paddingRight;
        int i12 = this.mOrientation;
        if (i12 == 1) {
            i11 = (i9 - paddingTop) - paddingBottom;
        }
        int i13 = i11;
        if (i12 == 0) {
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
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = this.mWidgetsCount;
            if (i14 >= i10) {
                break;
            }
            if (this.mWidgets[i14].getVisibility() == 8) {
                i15++;
            }
            i14++;
        }
        if (i15 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i10 - i15];
            int i16 = 0;
            i10 = 0;
            while (i16 < this.mWidgetsCount) {
                ConstraintWidget constraintWidget = this.mWidgets[i16];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr4[i10] = constraintWidget;
                    i10++;
                }
                i16++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i17 = i10;
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i17;
        int i18 = this.mWrapMode;
        if (i18 == 0) {
            measureNoWrap(constraintWidgetArr, i17, this.mOrientation, i13, iArr);
        } else if (i18 == 1) {
            measureChainWrap(constraintWidgetArr, i17, this.mOrientation, i13, iArr);
        } else if (i18 == 2) {
            measureAligned(constraintWidgetArr, i17, this.mOrientation, i13, iArr);
        } else if (i18 == 3) {
            measureChainWrap_new(constraintWidgetArr, i17, this.mOrientation, i13, iArr);
        }
        int iMin = iArr[0] + paddingLeft + paddingRight;
        int iMin2 = iArr[1] + paddingTop + paddingBottom;
        if (i6 == 1073741824) {
            iMin = i7;
        } else if (i6 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i7);
        } else if (i6 != 0) {
            iMin = 0;
        }
        if (i8 == 1073741824) {
            iMin2 = i9;
        } else if (i8 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i9);
        } else if (i8 != 0) {
            iMin2 = 0;
        }
        setMeasure(iMin, iMin2);
        setWidth(iMin);
        setHeight(iMin2);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
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

    public void setHorizontalAlign(int i6) {
        this.mHorizontalAlign = i6;
    }

    public void setHorizontalBias(float f6) {
        this.mHorizontalBias = f6;
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

    public void setVerticalAlign(int i6) {
        this.mVerticalAlign = i6;
    }

    public void setVerticalBias(float f6) {
        this.mVerticalBias = f6;
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
