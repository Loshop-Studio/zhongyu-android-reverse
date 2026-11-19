package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SuperviseBindCourseInput {
    public static final int $stable = 0;

    @SerializedName("ezyCourseId")
    private final int courseId;
    private final int superviseId;

    public SuperviseBindCourseInput(int i10, int i11) {
        this.courseId = i10;
        this.superviseId = i11;
    }

    public static /* synthetic */ SuperviseBindCourseInput copy$default(SuperviseBindCourseInput superviseBindCourseInput, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = superviseBindCourseInput.courseId;
        }
        if ((i12 & 2) != 0) {
            i11 = superviseBindCourseInput.superviseId;
        }
        return superviseBindCourseInput.copy(i10, i11);
    }

    public final int component1() {
        return this.courseId;
    }

    public final int component2() {
        return this.superviseId;
    }

    public final SuperviseBindCourseInput copy(int i10, int i11) {
        return new SuperviseBindCourseInput(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseBindCourseInput)) {
            return false;
        }
        SuperviseBindCourseInput superviseBindCourseInput = (SuperviseBindCourseInput) obj;
        return this.courseId == superviseBindCourseInput.courseId && this.superviseId == superviseBindCourseInput.superviseId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.superviseId);
    }

    public String toString() {
        return "SuperviseBindCourseInput(courseId=" + this.courseId + ", superviseId=" + this.superviseId + ")";
    }
}
