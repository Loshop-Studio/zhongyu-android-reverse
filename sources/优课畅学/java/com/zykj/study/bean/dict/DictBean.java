package com.zykj.study.bean.dict;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.zykj.study.data.SubjectEntity;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DictBean {
    public static final int $stable = 8;

    @SerializedName("SchoolLevel")
    private final List<PeriodBean> periodList;

    @SerializedName("Subject")
    private final List<SubjectEntity> subjectList;

    public DictBean(List<PeriodBean> periodList, List<SubjectEntity> subjectList) {
        AbstractC9133u.m16133g(periodList, "periodList");
        AbstractC9133u.m16133g(subjectList, "subjectList");
        this.periodList = periodList;
        this.subjectList = subjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DictBean copy$default(DictBean dictBean, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dictBean.periodList;
        }
        if ((i10 & 2) != 0) {
            list2 = dictBean.subjectList;
        }
        return dictBean.copy(list, list2);
    }

    public final List<PeriodBean> component1() {
        return this.periodList;
    }

    public final List<SubjectEntity> component2() {
        return this.subjectList;
    }

    public final DictBean copy(List<PeriodBean> periodList, List<SubjectEntity> subjectList) {
        AbstractC9133u.m16133g(periodList, "periodList");
        AbstractC9133u.m16133g(subjectList, "subjectList");
        return new DictBean(periodList, subjectList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictBean)) {
            return false;
        }
        DictBean dictBean = (DictBean) obj;
        return AbstractC9133u.m16128b(this.periodList, dictBean.periodList) && AbstractC9133u.m16128b(this.subjectList, dictBean.subjectList);
    }

    public final List<PeriodBean> getPeriodList() {
        return this.periodList;
    }

    public final List<SubjectEntity> getSubjectList() {
        return this.subjectList;
    }

    public int hashCode() {
        return (this.periodList.hashCode() * 31) + this.subjectList.hashCode();
    }

    public String toString() {
        return "DictBean(periodList=" + this.periodList + ", subjectList=" + this.subjectList + ")";
    }
}
