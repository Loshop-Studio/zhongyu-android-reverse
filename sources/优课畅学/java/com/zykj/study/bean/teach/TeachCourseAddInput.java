package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class TeachCourseAddInput {
    public static final int $stable = 0;
    private final int courseId;

    public TeachCourseAddInput(int i10) {
        this.courseId = i10;
    }

    public static /* synthetic */ TeachCourseAddInput copy$default(TeachCourseAddInput teachCourseAddInput, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = teachCourseAddInput.courseId;
        }
        return teachCourseAddInput.copy(i10);
    }

    public final int component1() {
        return this.courseId;
    }

    public final TeachCourseAddInput copy(int i10) {
        return new TeachCourseAddInput(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TeachCourseAddInput) && this.courseId == ((TeachCourseAddInput) obj).courseId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public int hashCode() {
        return Integer.hashCode(this.courseId);
    }

    public String toString() {
        return "TeachCourseAddInput(courseId=" + this.courseId + ")";
    }
}
