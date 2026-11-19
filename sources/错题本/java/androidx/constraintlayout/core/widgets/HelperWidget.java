package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.mWidgetsCount + 1;
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        if (i > constraintWidgetArr.length) {
            this.mWidgets = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i8 = this.mWidgetsCount;
        constraintWidgetArr2[i8] = constraintWidget;
        this.mWidgetsCount = i8 + 1;
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i, WidgetGroup widgetGroup) {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            widgetGroup.add(this.mWidgets[i8]);
        }
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            Grouping.findDependents(this.mWidgets[i9], i, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i = helperWidget.mWidgetsCount;
        for (int i8 = 0; i8 < i; i8++) {
            add(map.get(helperWidget.mWidgets[i8]));
        }
    }

    public int findGroupInDependents(int i) {
        int i8;
        int i9;
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget = this.mWidgets[i10];
            if (i == 0 && (i9 = constraintWidget.horizontalGroup) != -1) {
                return i9;
            }
            if (i == 1 && (i8 = constraintWidget.verticalGroup) != -1) {
                return i8;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
