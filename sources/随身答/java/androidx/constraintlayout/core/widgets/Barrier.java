package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = true;
    private int mMargin = 0;
    boolean mResolved = false;

    public Barrier() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z9) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z10;
        int i9;
        int i10;
        int i11;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i12 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i12 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i12];
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            i12++;
        }
        int i13 = this.mBarrierType;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i13];
        if (!this.mResolved) {
            allSolved();
        }
        if (this.mResolved) {
            this.mResolved = false;
            int i14 = this.mBarrierType;
            if (i14 == 0 || i14 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.f1321mX);
                linearSystem.addEquality(this.mRight.mSolverVariable, this.f1321mX);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.f1322mY);
                    linearSystem.addEquality(this.mBottom.mSolverVariable, this.f1322mY);
                    return;
                }
                return;
            }
        }
        for (int i15 = 0; i15 < this.mWidgetsCount; i15++) {
            ConstraintWidget constraintWidget = this.mWidgets[i15];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i10 = this.mBarrierType) == 0 || i10 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i11 = this.mBarrierType) == 2 || i11 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z12 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i16 = !(!z10 && (((i9 = this.mBarrierType) == 0 && z11) || ((i9 == 2 && z12) || ((i9 == 1 && z11) || (i9 == 3 && z12))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.mWidgetsCount; i17++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i17];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                int i18 = this.mBarrierType;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i18];
                constraintAnchor3.mSolverVariable = solverVariableCreateObjectVariable;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
                int i19 = (constraintAnchor4 == null || constraintAnchor4.mOwner != this) ? 0 : constraintAnchor3.mMargin;
                if (i18 == 0 || i18 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin - i19, z10);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin + i19, z10);
                }
                linearSystem.addEquality(constraintAnchor2.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin + i19, i16);
            }
        }
        int i20 = this.mBarrierType;
        if (i20 == 0) {
            linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 0);
            return;
        }
        if (i20 == 1) {
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 0);
        } else if (i20 == 2) {
            linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 0);
        } else if (i20 == 3) {
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 0);
        }
    }

    public boolean allSolved() {
        int i9;
        int i10;
        int i11;
        boolean z9 = true;
        int i12 = 0;
        while (true) {
            i9 = this.mWidgetsCount;
            if (i12 >= i9) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i12];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i10 = this.mBarrierType) == 0 || i10 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i11 = this.mBarrierType) == 2 || i11 == 3) && !constraintWidget.isResolvedVertically()))) {
                z9 = false;
            }
            i12++;
        }
        if (!z9 || i9 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.mWidgetsCount; i13++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i13];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z10) {
                    int i14 = this.mBarrierType;
                    if (i14 == 0) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i14 == 1) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i14 == 2) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i14 == 3) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z10 = true;
                }
                int i15 = this.mBarrierType;
                if (i15 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i16 = iMax + this.mMargin;
        int i17 = this.mBarrierType;
        if (i17 == 0 || i17 == 1) {
            setFinalHorizontal(i16, i16);
        } else {
            setFinalVertical(i16, i16);
        }
        this.mResolved = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i9 = this.mBarrierType;
        if (i9 == 0 || i9 == 1) {
            return 0;
        }
        return (i9 == 2 || i9 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.mResolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.mResolved;
    }

    public void markWidgets() {
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            ConstraintWidget constraintWidget = this.mWidgets[i9];
            if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                int i10 = this.mBarrierType;
                if (i10 == 0 || i10 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i10 == 2 || i10 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.mAllowsGoneWidget = z9;
    }

    public void setBarrierType(int i9) {
        this.mBarrierType = i9;
    }

    public void setMargin(int i9) {
        this.mMargin = i9;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            ConstraintWidget constraintWidget = this.mWidgets[i9];
            if (i9 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.getDebugName();
        }
        return str + "}";
    }

    public Barrier(String str) {
        setDebugName(str);
    }
}
