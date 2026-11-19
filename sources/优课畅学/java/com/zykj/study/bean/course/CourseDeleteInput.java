package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CourseDeleteInput {
    public static final int $stable = 0;
    private final boolean force;

    /* renamed from: id */
    private final int f11005id;

    public CourseDeleteInput(int i10, boolean z10) {
        this.f11005id = i10;
        this.force = z10;
    }

    public static /* synthetic */ CourseDeleteInput copy$default(CourseDeleteInput courseDeleteInput, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = courseDeleteInput.f11005id;
        }
        if ((i11 & 2) != 0) {
            z10 = courseDeleteInput.force;
        }
        return courseDeleteInput.copy(i10, z10);
    }

    public final int component1() {
        return this.f11005id;
    }

    public final boolean component2() {
        return this.force;
    }

    public final CourseDeleteInput copy(int i10, boolean z10) {
        return new CourseDeleteInput(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseDeleteInput)) {
            return false;
        }
        CourseDeleteInput courseDeleteInput = (CourseDeleteInput) obj;
        return this.f11005id == courseDeleteInput.f11005id && this.force == courseDeleteInput.force;
    }

    public final boolean getForce() {
        return this.force;
    }

    public final int getId() {
        return this.f11005id;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f11005id) * 31) + Boolean.hashCode(this.force);
    }

    public String toString() {
        return "CourseDeleteInput(id=" + this.f11005id + ", force=" + this.force + ")";
    }

    public /* synthetic */ CourseDeleteInput(int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this(i10, (i11 & 2) != 0 ? true : z10);
    }
}
