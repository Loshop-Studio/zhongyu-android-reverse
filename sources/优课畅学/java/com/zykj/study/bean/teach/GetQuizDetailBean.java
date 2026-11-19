package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GetQuizDetailBean {
    public static final int $stable = 8;
    private final boolean choiceOptions;
    private List<String> correctAnswers;

    /* renamed from: id */
    private final long f11014id;
    private boolean isSelected;
    private List<String> options;
    private final int qstType;
    private final long questionId;
    private final List<StuQuizBean> studentGroups;

    public GetQuizDetailBean(long j10, long j11, int i10, boolean z10, List<String> list, List<String> list2, List<StuQuizBean> studentGroups) {
        AbstractC9133u.m16133g(studentGroups, "studentGroups");
        this.f11014id = j10;
        this.questionId = j11;
        this.qstType = i10;
        this.isSelected = z10;
        this.correctAnswers = list;
        this.options = list2;
        this.studentGroups = studentGroups;
        if (i10 == 2) {
            if (list2 == null || list2.isEmpty()) {
                this.options = AbstractC8809v.m14774q(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B");
            }
            List<String> list3 = this.correctAnswers;
            if (list3 == null || list3.isEmpty()) {
                this.correctAnswers = AbstractC8807u.m14755e(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            }
        }
        this.choiceOptions = i10 != 2;
    }

    public static /* synthetic */ GetQuizDetailBean copy$default(GetQuizDetailBean getQuizDetailBean, long j10, long j11, int i10, boolean z10, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = getQuizDetailBean.f11014id;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = getQuizDetailBean.questionId;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = getQuizDetailBean.qstType;
        }
        return getQuizDetailBean.copy(j12, j13, i10, (i11 & 8) != 0 ? getQuizDetailBean.isSelected : z10, (i11 & 16) != 0 ? getQuizDetailBean.correctAnswers : list, (i11 & 32) != 0 ? getQuizDetailBean.options : list2, (i11 & 64) != 0 ? getQuizDetailBean.studentGroups : list3);
    }

    public final long component1() {
        return this.f11014id;
    }

    public final long component2() {
        return this.questionId;
    }

    public final int component3() {
        return this.qstType;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final List<String> component5() {
        return this.correctAnswers;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final List<StuQuizBean> component7() {
        return this.studentGroups;
    }

    public final GetQuizDetailBean copy(long j10, long j11, int i10, boolean z10, List<String> list, List<String> list2, List<StuQuizBean> studentGroups) {
        AbstractC9133u.m16133g(studentGroups, "studentGroups");
        return new GetQuizDetailBean(j10, j11, i10, z10, list, list2, studentGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetQuizDetailBean)) {
            return false;
        }
        GetQuizDetailBean getQuizDetailBean = (GetQuizDetailBean) obj;
        return this.f11014id == getQuizDetailBean.f11014id && this.questionId == getQuizDetailBean.questionId && this.qstType == getQuizDetailBean.qstType && this.isSelected == getQuizDetailBean.isSelected && AbstractC9133u.m16128b(this.correctAnswers, getQuizDetailBean.correctAnswers) && AbstractC9133u.m16128b(this.options, getQuizDetailBean.options) && AbstractC9133u.m16128b(this.studentGroups, getQuizDetailBean.studentGroups);
    }

    public final boolean getChoiceOptions() {
        return this.choiceOptions;
    }

    public final List<String> getCorrectAnswers() {
        return this.correctAnswers;
    }

    public final long getId() {
        return this.f11014id;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final int getQstType() {
        return this.qstType;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final List<StuQuizBean> getStudentGroups() {
        return this.studentGroups;
    }

    public final String getTitle() {
        long j10 = this.f11014id;
        if (j10 == 0) {
            return "总体完成情况";
        }
        return "第" + j10 + "题";
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.f11014id) * 31) + Long.hashCode(this.questionId)) * 31) + Integer.hashCode(this.qstType)) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        List<String> list = this.correctAnswers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.options;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.studentGroups.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCorrectAnswers(List<String> list) {
        this.correctAnswers = list;
    }

    public final void setOptions(List<String> list) {
        this.options = list;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        return "GetQuizDetailBean(id=" + this.f11014id + ", questionId=" + this.questionId + ", qstType=" + this.qstType + ", isSelected=" + this.isSelected + ", correctAnswers=" + this.correctAnswers + ", options=" + this.options + ", studentGroups=" + this.studentGroups + ")";
    }

    public /* synthetic */ GetQuizDetailBean(long j10, long j11, int i10, boolean z10, List list, List list2, List list3, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? -1 : i10, z10, (i11 & 16) != 0 ? AbstractC8809v.m14771n() : list, (i11 & 32) != 0 ? AbstractC8809v.m14771n() : list2, (i11 & 64) != 0 ? AbstractC8809v.m14771n() : list3);
    }
}
