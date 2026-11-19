package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CourseIdInput {
    public static final int $stable = 0;

    /* renamed from: id */
    private final int f11006id;

    public CourseIdInput(int i10) {
        this.f11006id = i10;
    }

    public static /* synthetic */ CourseIdInput copy$default(CourseIdInput courseIdInput, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = courseIdInput.f11006id;
        }
        return courseIdInput.copy(i10);
    }

    public final int component1() {
        return this.f11006id;
    }

    public final CourseIdInput copy(int i10) {
        return new CourseIdInput(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CourseIdInput) && this.f11006id == ((CourseIdInput) obj).f11006id;
    }

    public final int getId() {
        return this.f11006id;
    }

    public int hashCode() {
        return Integer.hashCode(this.f11006id);
    }

    public String toString() {
        return "CourseIdInput(id=" + this.f11006id + ")";
    }
}
