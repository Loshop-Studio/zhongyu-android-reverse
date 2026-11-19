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
        int i6 = this.mWidgetsCount + 1;
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        if (i6 > constraintWidgetArr.length) {
            this.mWidgets = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i7 = this.mWidgetsCount;
        constraintWidgetArr2[i7] = constraintWidget;
        this.mWidgetsCount = i7 + 1;
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i6, WidgetGroup widgetGroup) {
        for (int i7 = 0; i7 < this.mWidgetsCount; i7++) {
            widgetGroup.add(this.mWidgets[i7]);
        }
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            Grouping.findDependents(this.mWidgets[i8], i6, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i6 = helperWidget.mWidgetsCount;
        for (int i7 = 0; i7 < i6; i7++) {
            add(map.get(helperWidget.mWidgets[i7]));
        }
    }

    public int findGroupInDependents(int i6) {
        int i7;
        int i8;
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            ConstraintWidget constraintWidget = this.mWidgets[i9];
            if (i6 == 0 && (i8 = constraintWidget.horizontalGroup) != -1) {
                return i8;
            }
            if (i6 == 1 && (i7 = constraintWidget.verticalGroup) != -1) {
                return i7;
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
