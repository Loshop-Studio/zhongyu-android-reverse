package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseBindBean {
    public static final int $stable = 8;

    /* renamed from: id */
    private final int f11013id;

    @SerializedName("binded")
    private boolean isBind;
    private final String name;

    public CourseBindBean(int i10, String name, boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        this.f11013id = i10;
        this.name = name;
        this.isBind = z10;
    }

    public static /* synthetic */ CourseBindBean copy$default(CourseBindBean courseBindBean, int i10, String str, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = courseBindBean.f11013id;
        }
        if ((i11 & 2) != 0) {
            str = courseBindBean.name;
        }
        if ((i11 & 4) != 0) {
            z10 = courseBindBean.isBind;
        }
        return courseBindBean.copy(i10, str, z10);
    }

    public final int component1() {
        return this.f11013id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isBind;
    }

    public final CourseBindBean copy(int i10, String name, boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        return new CourseBindBean(i10, name, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseBindBean)) {
            return false;
        }
        CourseBindBean courseBindBean = (CourseBindBean) obj;
        return this.f11013id == courseBindBean.f11013id && AbstractC9133u.m16128b(this.name, courseBindBean.name) && this.isBind == courseBindBean.isBind;
    }

    public final int getId() {
        return this.f11013id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11013id) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isBind);
    }

    public final boolean isBind() {
        return this.isBind;
    }

    public final void setBind(boolean z10) {
        this.isBind = z10;
    }

    public String toString() {
        return "CourseBindBean(id=" + this.f11013id + ", name=" + this.name + ", isBind=" + this.isBind + ")";
    }
}
