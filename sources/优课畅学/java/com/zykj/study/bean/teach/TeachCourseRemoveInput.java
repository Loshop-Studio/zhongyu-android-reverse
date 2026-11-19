package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class TeachCourseRemoveInput {
    public static final int $stable = 0;
    private final int superviseId;

    public TeachCourseRemoveInput(int i10) {
        this.superviseId = i10;
    }

    public static /* synthetic */ TeachCourseRemoveInput copy$default(TeachCourseRemoveInput teachCourseRemoveInput, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = teachCourseRemoveInput.superviseId;
        }
        return teachCourseRemoveInput.copy(i10);
    }

    public final int component1() {
        return this.superviseId;
    }

    public final TeachCourseRemoveInput copy(int i10) {
        return new TeachCourseRemoveInput(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TeachCourseRemoveInput) && this.superviseId == ((TeachCourseRemoveInput) obj).superviseId;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return Integer.hashCode(this.superviseId);
    }

    public String toString() {
        return "TeachCourseRemoveInput(superviseId=" + this.superviseId + ")";
    }
}
