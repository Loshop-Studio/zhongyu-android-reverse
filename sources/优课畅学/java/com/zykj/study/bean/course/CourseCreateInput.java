package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CourseCreateInput {
    public static final int $stable = 0;
    private final String cover;
    private final String description;
    private final Integer grade;

    /* renamed from: id */
    private final Integer f11004id;
    private final boolean isPublic;
    private final Integer schoolLevel;
    private final Integer subject;
    private final String title;

    public CourseCreateInput() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public static /* synthetic */ CourseCreateInput copy$default(CourseCreateInput courseCreateInput, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = courseCreateInput.f11004id;
        }
        if ((i10 & 2) != 0) {
            str = courseCreateInput.title;
        }
        if ((i10 & 4) != 0) {
            str2 = courseCreateInput.description;
        }
        if ((i10 & 8) != 0) {
            num2 = courseCreateInput.schoolLevel;
        }
        if ((i10 & 16) != 0) {
            num3 = courseCreateInput.grade;
        }
        if ((i10 & 32) != 0) {
            num4 = courseCreateInput.subject;
        }
        if ((i10 & 64) != 0) {
            str3 = courseCreateInput.cover;
        }
        if ((i10 & 128) != 0) {
            z10 = courseCreateInput.isPublic;
        }
        String str4 = str3;
        boolean z11 = z10;
        Integer num5 = num3;
        Integer num6 = num4;
        return courseCreateInput.copy(num, str, str2, num2, num5, num6, str4, z11);
    }

    public final Integer component1() {
        return this.f11004id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final Integer component4() {
        return this.schoolLevel;
    }

    public final Integer component5() {
        return this.grade;
    }

    public final Integer component6() {
        return this.subject;
    }

    public final String component7() {
        return this.cover;
    }

    public final boolean component8() {
        return this.isPublic;
    }

    public final CourseCreateInput copy(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, boolean z10) {
        return new CourseCreateInput(num, str, str2, num2, num3, num4, str3, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseCreateInput)) {
            return false;
        }
        CourseCreateInput courseCreateInput = (CourseCreateInput) obj;
        return AbstractC9133u.m16128b(this.f11004id, courseCreateInput.f11004id) && AbstractC9133u.m16128b(this.title, courseCreateInput.title) && AbstractC9133u.m16128b(this.description, courseCreateInput.description) && AbstractC9133u.m16128b(this.schoolLevel, courseCreateInput.schoolLevel) && AbstractC9133u.m16128b(this.grade, courseCreateInput.grade) && AbstractC9133u.m16128b(this.subject, courseCreateInput.subject) && AbstractC9133u.m16128b(this.cover, courseCreateInput.cover) && this.isPublic == courseCreateInput.isPublic;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getGrade() {
        return this.grade;
    }

    public final Integer getId() {
        return this.f11004id;
    }

    public final Integer getSchoolLevel() {
        return this.schoolLevel;
    }

    public final Integer getSubject() {
        return this.subject;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.f11004id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.schoolLevel;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.grade;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.subject;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.cover;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPublic);
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        return "CourseCreateInput(id=" + this.f11004id + ", title=" + this.title + ", description=" + this.description + ", schoolLevel=" + this.schoolLevel + ", grade=" + this.grade + ", subject=" + this.subject + ", cover=" + this.cover + ", isPublic=" + this.isPublic + ")";
    }

    public CourseCreateInput(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, boolean z10) {
        this.f11004id = num;
        this.title = str;
        this.description = str2;
        this.schoolLevel = num2;
        this.grade = num3;
        this.subject = num4;
        this.cover = str3;
        this.isPublic = z10;
    }

    public /* synthetic */ CourseCreateInput(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, (i10 & 32) != 0 ? null : num4, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? true : z10);
    }
}
