package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseProgress {
    public static final int $stable = 8;
    private final String courseCover;
    private final int courseId;
    private final String courseName;
    private final List<GroupMemberProgress> groupProgress;
    private final int superviseId;

    public CourseProgress(int i10, int i11, String courseName, String courseCover, List<GroupMemberProgress> groupProgress) {
        AbstractC9133u.m16133g(courseName, "courseName");
        AbstractC9133u.m16133g(courseCover, "courseCover");
        AbstractC9133u.m16133g(groupProgress, "groupProgress");
        this.courseId = i10;
        this.superviseId = i11;
        this.courseName = courseName;
        this.courseCover = courseCover;
        this.groupProgress = groupProgress;
    }

    public static /* synthetic */ CourseProgress copy$default(CourseProgress courseProgress, int i10, int i11, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = courseProgress.courseId;
        }
        if ((i12 & 2) != 0) {
            i11 = courseProgress.superviseId;
        }
        if ((i12 & 4) != 0) {
            str = courseProgress.courseName;
        }
        if ((i12 & 8) != 0) {
            str2 = courseProgress.courseCover;
        }
        if ((i12 & 16) != 0) {
            list = courseProgress.groupProgress;
        }
        List list2 = list;
        String str3 = str;
        return courseProgress.copy(i10, i11, str3, str2, list2);
    }

    public final int component1() {
        return this.courseId;
    }

    public final int component2() {
        return this.superviseId;
    }

    public final String component3() {
        return this.courseName;
    }

    public final String component4() {
        return this.courseCover;
    }

    public final List<GroupMemberProgress> component5() {
        return this.groupProgress;
    }

    public final CourseProgress copy(int i10, int i11, String courseName, String courseCover, List<GroupMemberProgress> groupProgress) {
        AbstractC9133u.m16133g(courseName, "courseName");
        AbstractC9133u.m16133g(courseCover, "courseCover");
        AbstractC9133u.m16133g(groupProgress, "groupProgress");
        return new CourseProgress(i10, i11, courseName, courseCover, groupProgress);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseProgress)) {
            return false;
        }
        CourseProgress courseProgress = (CourseProgress) obj;
        return this.courseId == courseProgress.courseId && this.superviseId == courseProgress.superviseId && AbstractC9133u.m16128b(this.courseName, courseProgress.courseName) && AbstractC9133u.m16128b(this.courseCover, courseProgress.courseCover) && AbstractC9133u.m16128b(this.groupProgress, courseProgress.groupProgress);
    }

    public final String getCourseCover() {
        return this.courseCover;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final List<GroupMemberProgress> getGroupProgress() {
        return this.groupProgress;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.superviseId)) * 31) + this.courseName.hashCode()) * 31) + this.courseCover.hashCode()) * 31) + this.groupProgress.hashCode();
    }

    public String toString() {
        return "CourseProgress(courseId=" + this.courseId + ", superviseId=" + this.superviseId + ", courseName=" + this.courseName + ", courseCover=" + this.courseCover + ", groupProgress=" + this.groupProgress + ")";
    }
}
