package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int sCount;
    int mId;
    int mOrientation;
    ArrayList<ConstraintWidget> mWidgets = new ArrayList<>();
    boolean mAuthoritative = false;
    ArrayList<MeasureResult> mResults = null;
    private int mMoveTo = -1;

    public static class MeasureResult {
        int mBaseline;
        int mBottom;
        int mLeft;
        int mOrientation;
        int mRight;
        int mTop;
        WeakReference<ConstraintWidget> mWidgetRef;

        public MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i9) {
            this.mWidgetRef = new WeakReference<>(constraintWidget);
            this.mLeft = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.mTop = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.mRight = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.mBottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.mBaseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.mOrientation = i9;
        }

        public void apply() {
            ConstraintWidget constraintWidget = this.mWidgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.mLeft, this.mTop, this.mRight, this.mBottom, this.mBaseline, this.mOrientation);
            }
        }
    }

    public WidgetGroup(int i9) {
        int i10 = sCount;
        sCount = i10 + 1;
        this.mId = i10;
        this.mOrientation = i9;
    }

    private boolean contains(ConstraintWidget constraintWidget) {
        return this.mWidgets.contains(constraintWidget);
    }

    private String getOrientationString() {
        int i9 = this.mOrientation;
        return i9 == 0 ? "Horizontal" : i9 == 1 ? "Vertical" : i9 == 2 ? "Both" : "Unknown";
    }

    private int measureWrap(int i9, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i9);
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            return i9 == 0 ? constraintWidget.getWidth() : constraintWidget.getHeight();
        }
        return -1;
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i9) {
        int objectVariableValue;
        int objectVariableValue2;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).addToSolver(linearSystem, false);
        }
        if (i9 == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i9 == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e10) {
            System.err.println(e10.toString() + AbsSection.SEP_ORIGIN_LINE_BREAK + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.mResults = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.mResults.add(new MeasureResult(arrayList.get(i11), linearSystem, i9));
        }
        if (i9 == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        if (this.mWidgets.contains(constraintWidget)) {
            return false;
        }
        this.mWidgets.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.mResults != null && this.mAuthoritative) {
            for (int i9 = 0; i9 < this.mResults.size(); i9++) {
                this.mResults.get(i9).apply();
            }
        }
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.mWidgets.size();
        if (this.mMoveTo != -1 && size > 0) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                WidgetGroup widgetGroup = arrayList.get(i9);
                if (this.mMoveTo == widgetGroup.mId) {
                    moveTo(this.mOrientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.mWidgets.clear();
    }

    public int getId() {
        return this.mId;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        for (int i9 = 0; i9 < this.mWidgets.size(); i9++) {
            if (widgetGroup.contains(this.mWidgets.get(i9))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.mAuthoritative;
    }

    public void moveTo(int i9, WidgetGroup widgetGroup) {
        ArrayList<ConstraintWidget> arrayList = this.mWidgets;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i10);
            i10++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            widgetGroup.add(constraintWidget2);
            if (i9 == 0) {
                constraintWidget2.horizontalGroup = widgetGroup.getId();
            } else {
                constraintWidget2.verticalGroup = widgetGroup.getId();
            }
        }
        this.mMoveTo = widgetGroup.mId;
    }

    public void setAuthoritative(boolean z9) {
        this.mAuthoritative = z9;
    }

    public void setOrientation(int i9) {
        this.mOrientation = i9;
    }

    public int size() {
        return this.mWidgets.size();
    }

    public String toString() {
        String str = getOrientationString() + " [" + this.mId + "] <";
        ArrayList<ConstraintWidget> arrayList = this.mWidgets;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i9);
            i9++;
            str = str + " " + constraintWidget.getDebugName();
        }
        return str + " >";
    }

    public int measureWrap(LinearSystem linearSystem, int i9) {
        if (this.mWidgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.mWidgets, i9);
    }
}
