package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.zykj.study.bean.exercise.ExerciseBean;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseContentDetailBean {
    public static final int $stable = 8;
    private final int catalogId;

    @SerializedName("quizProgresses")
    private final List<ExerciseBean> exerciseList;

    public CourseContentDetailBean(int i10, List<ExerciseBean> list) {
        this.catalogId = i10;
        this.exerciseList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseContentDetailBean copy$default(CourseContentDetailBean courseContentDetailBean, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = courseContentDetailBean.catalogId;
        }
        if ((i11 & 2) != 0) {
            list = courseContentDetailBean.exerciseList;
        }
        return courseContentDetailBean.copy(i10, list);
    }

    public final int component1() {
        return this.catalogId;
    }

    public final List<ExerciseBean> component2() {
        return this.exerciseList;
    }

    public final CourseContentDetailBean copy(int i10, List<ExerciseBean> list) {
        return new CourseContentDetailBean(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseContentDetailBean)) {
            return false;
        }
        CourseContentDetailBean courseContentDetailBean = (CourseContentDetailBean) obj;
        return this.catalogId == courseContentDetailBean.catalogId && AbstractC9133u.m16128b(this.exerciseList, courseContentDetailBean.exerciseList);
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final List<ExerciseBean> getExerciseList() {
        return this.exerciseList;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.catalogId) * 31;
        List<ExerciseBean> list = this.exerciseList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "CourseContentDetailBean(catalogId=" + this.catalogId + ", exerciseList=" + this.exerciseList + ")";
    }
}
