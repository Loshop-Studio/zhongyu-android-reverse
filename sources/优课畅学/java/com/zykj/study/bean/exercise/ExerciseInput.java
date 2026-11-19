package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ExerciseInput {
    public static final int $stable = 0;
    private final int catalogId;
    private final int courseId;
    private final int groupId;

    public ExerciseInput(int i10, int i11, int i12) {
        this.courseId = i10;
        this.catalogId = i11;
        this.groupId = i12;
    }

    public static /* synthetic */ ExerciseInput copy$default(ExerciseInput exerciseInput, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = exerciseInput.courseId;
        }
        if ((i13 & 2) != 0) {
            i11 = exerciseInput.catalogId;
        }
        if ((i13 & 4) != 0) {
            i12 = exerciseInput.groupId;
        }
        return exerciseInput.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.courseId;
    }

    public final int component2() {
        return this.catalogId;
    }

    public final int component3() {
        return this.groupId;
    }

    public final ExerciseInput copy(int i10, int i11, int i12) {
        return new ExerciseInput(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseInput)) {
            return false;
        }
        ExerciseInput exerciseInput = (ExerciseInput) obj;
        return this.courseId == exerciseInput.courseId && this.catalogId == exerciseInput.catalogId && this.groupId == exerciseInput.groupId;
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.catalogId)) * 31) + Integer.hashCode(this.groupId);
    }

    public String toString() {
        return "ExerciseInput(courseId=" + this.courseId + ", catalogId=" + this.catalogId + ", groupId=" + this.groupId + ")";
    }
}
