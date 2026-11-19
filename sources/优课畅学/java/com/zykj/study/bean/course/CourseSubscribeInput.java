package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CourseSubscribeInput {
    public static final int $stable = 0;

    /* renamed from: id */
    private final int f11007id;

    public CourseSubscribeInput(int i10) {
        this.f11007id = i10;
    }

    public static /* synthetic */ CourseSubscribeInput copy$default(CourseSubscribeInput courseSubscribeInput, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = courseSubscribeInput.f11007id;
        }
        return courseSubscribeInput.copy(i10);
    }

    public final int component1() {
        return this.f11007id;
    }

    public final CourseSubscribeInput copy(int i10) {
        return new CourseSubscribeInput(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CourseSubscribeInput) && this.f11007id == ((CourseSubscribeInput) obj).f11007id;
    }

    public final int getId() {
        return this.f11007id;
    }

    public int hashCode() {
        return Integer.hashCode(this.f11007id);
    }

    public String toString() {
        return "CourseSubscribeInput(id=" + this.f11007id + ")";
    }
}
