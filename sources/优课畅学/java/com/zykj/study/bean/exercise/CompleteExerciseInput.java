package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CompleteExerciseInput {
    public static final int $stable = 0;
    private final int catalogId;
    private final int courseId;

    @SerializedName("QuizId")
    private final long exerciseId;
    private final int groupId;

    public CompleteExerciseInput(int i10, int i11, int i12, long j10) {
        this.courseId = i10;
        this.catalogId = i11;
        this.groupId = i12;
        this.exerciseId = j10;
    }

    public static /* synthetic */ CompleteExerciseInput copy$default(CompleteExerciseInput completeExerciseInput, int i10, int i11, int i12, long j10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = completeExerciseInput.courseId;
        }
        if ((i13 & 2) != 0) {
            i11 = completeExerciseInput.catalogId;
        }
        if ((i13 & 4) != 0) {
            i12 = completeExerciseInput.groupId;
        }
        if ((i13 & 8) != 0) {
            j10 = completeExerciseInput.exerciseId;
        }
        int i14 = i12;
        return completeExerciseInput.copy(i10, i11, i14, j10);
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

    public final long component4() {
        return this.exerciseId;
    }

    public final CompleteExerciseInput copy(int i10, int i11, int i12, long j10) {
        return new CompleteExerciseInput(i10, i11, i12, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteExerciseInput)) {
            return false;
        }
        CompleteExerciseInput completeExerciseInput = (CompleteExerciseInput) obj;
        return this.courseId == completeExerciseInput.courseId && this.catalogId == completeExerciseInput.catalogId && this.groupId == completeExerciseInput.groupId && this.exerciseId == completeExerciseInput.exerciseId;
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final long getExerciseId() {
        return this.exerciseId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.catalogId)) * 31) + Integer.hashCode(this.groupId)) * 31) + Long.hashCode(this.exerciseId);
    }

    public String toString() {
        return "CompleteExerciseInput(courseId=" + this.courseId + ", catalogId=" + this.catalogId + ", groupId=" + this.groupId + ", exerciseId=" + this.exerciseId + ")";
    }
}
