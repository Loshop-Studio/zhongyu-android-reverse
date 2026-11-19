package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ChoiceChartData {
    public static final int $stable = 8;
    private final boolean isRight;
    private final boolean isSelected;
    private final String name;
    private final int progress;
    private final String showName;
    private final List<String> studentList;

    public ChoiceChartData(String showName, String name, int i10, boolean z10, List<String> studentList, boolean z11) {
        AbstractC9133u.m16133g(showName, "showName");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(studentList, "studentList");
        this.showName = showName;
        this.name = name;
        this.progress = i10;
        this.isRight = z10;
        this.studentList = studentList;
        this.isSelected = z11;
    }

    public static /* synthetic */ ChoiceChartData copy$default(ChoiceChartData choiceChartData, String str, String str2, int i10, boolean z10, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = choiceChartData.showName;
        }
        if ((i11 & 2) != 0) {
            str2 = choiceChartData.name;
        }
        if ((i11 & 4) != 0) {
            i10 = choiceChartData.progress;
        }
        if ((i11 & 8) != 0) {
            z10 = choiceChartData.isRight;
        }
        if ((i11 & 16) != 0) {
            list = choiceChartData.studentList;
        }
        if ((i11 & 32) != 0) {
            z11 = choiceChartData.isSelected;
        }
        List list2 = list;
        boolean z12 = z11;
        return choiceChartData.copy(str, str2, i10, z10, list2, z12);
    }

    public final String component1() {
        return this.showName;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.progress;
    }

    public final boolean component4() {
        return this.isRight;
    }

    public final List<String> component5() {
        return this.studentList;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final ChoiceChartData copy(String showName, String name, int i10, boolean z10, List<String> studentList, boolean z11) {
        AbstractC9133u.m16133g(showName, "showName");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(studentList, "studentList");
        return new ChoiceChartData(showName, name, i10, z10, studentList, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoiceChartData)) {
            return false;
        }
        ChoiceChartData choiceChartData = (ChoiceChartData) obj;
        return AbstractC9133u.m16128b(this.showName, choiceChartData.showName) && AbstractC9133u.m16128b(this.name, choiceChartData.name) && this.progress == choiceChartData.progress && this.isRight == choiceChartData.isRight && AbstractC9133u.m16128b(this.studentList, choiceChartData.studentList) && this.isSelected == choiceChartData.isSelected;
    }

    public final String getName() {
        return this.name;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getShowName() {
        return this.showName;
    }

    public final List<String> getStudentList() {
        return this.studentList;
    }

    public int hashCode() {
        return (((((((((this.showName.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.progress)) * 31) + Boolean.hashCode(this.isRight)) * 31) + this.studentList.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isRight() {
        return this.isRight;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "ChoiceChartData(showName=" + this.showName + ", name=" + this.name + ", progress=" + this.progress + ", isRight=" + this.isRight + ", studentList=" + this.studentList + ", isSelected=" + this.isSelected + ")";
    }

    public /* synthetic */ ChoiceChartData(String str, String str2, int i10, boolean z10, List list, boolean z11, int i11, AbstractC9126n abstractC9126n) {
        this(str, str2, i10, z10, list, (i11 & 32) != 0 ? false : z11);
    }
}
