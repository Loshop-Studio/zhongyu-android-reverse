package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AuthorizeLessonReqBody {
    public static final int $stable = 0;
    private final int courseId;
    private final int teacherId;

    public AuthorizeLessonReqBody(int i10, int i11) {
        this.courseId = i10;
        this.teacherId = i11;
    }

    public static /* synthetic */ AuthorizeLessonReqBody copy$default(AuthorizeLessonReqBody authorizeLessonReqBody, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = authorizeLessonReqBody.courseId;
        }
        if ((i12 & 2) != 0) {
            i11 = authorizeLessonReqBody.teacherId;
        }
        return authorizeLessonReqBody.copy(i10, i11);
    }

    public final int component1() {
        return this.courseId;
    }

    public final int component2() {
        return this.teacherId;
    }

    public final AuthorizeLessonReqBody copy(int i10, int i11) {
        return new AuthorizeLessonReqBody(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizeLessonReqBody)) {
            return false;
        }
        AuthorizeLessonReqBody authorizeLessonReqBody = (AuthorizeLessonReqBody) obj;
        return this.courseId == authorizeLessonReqBody.courseId && this.teacherId == authorizeLessonReqBody.teacherId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getTeacherId() {
        return this.teacherId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.teacherId);
    }

    public String toString() {
        return "AuthorizeLessonReqBody(courseId=" + this.courseId + ", teacherId=" + this.teacherId + ")";
    }
}
