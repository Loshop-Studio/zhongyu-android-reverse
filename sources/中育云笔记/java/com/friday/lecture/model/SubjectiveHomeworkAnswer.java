package com.friday.lecture.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.classtest.MqttResponse;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SubjectiveHomeworkAnswer {
    public static final int $stable = 8;
    private String localPath;
    private final String remoteUrl;
    private final MqttResponse.Student student;

    public SubjectiveHomeworkAnswer(String remoteUrl, MqttResponse.Student student, String localPath) {
        AbstractC9979u.m20294g(remoteUrl, "remoteUrl");
        AbstractC9979u.m20294g(localPath, "localPath");
        this.remoteUrl = remoteUrl;
        this.student = student;
        this.localPath = localPath;
    }

    public static /* synthetic */ SubjectiveHomeworkAnswer copy$default(SubjectiveHomeworkAnswer subjectiveHomeworkAnswer, String str, MqttResponse.Student student, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subjectiveHomeworkAnswer.remoteUrl;
        }
        if ((i10 & 2) != 0) {
            student = subjectiveHomeworkAnswer.student;
        }
        if ((i10 & 4) != 0) {
            str2 = subjectiveHomeworkAnswer.localPath;
        }
        return subjectiveHomeworkAnswer.copy(str, student, str2);
    }

    public final String component1() {
        return this.remoteUrl;
    }

    public final MqttResponse.Student component2() {
        return this.student;
    }

    public final String component3() {
        return this.localPath;
    }

    public final SubjectiveHomeworkAnswer copy(String remoteUrl, MqttResponse.Student student, String localPath) {
        AbstractC9979u.m20294g(remoteUrl, "remoteUrl");
        AbstractC9979u.m20294g(localPath, "localPath");
        return new SubjectiveHomeworkAnswer(remoteUrl, student, localPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubjectiveHomeworkAnswer)) {
            return false;
        }
        SubjectiveHomeworkAnswer subjectiveHomeworkAnswer = (SubjectiveHomeworkAnswer) obj;
        return AbstractC9979u.m20289b(this.remoteUrl, subjectiveHomeworkAnswer.remoteUrl) && AbstractC9979u.m20289b(this.student, subjectiveHomeworkAnswer.student) && AbstractC9979u.m20289b(this.localPath, subjectiveHomeworkAnswer.localPath);
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final MqttResponse.Student getStudent() {
        return this.student;
    }

    public int hashCode() {
        int iHashCode = this.remoteUrl.hashCode() * 31;
        MqttResponse.Student student = this.student;
        return ((iHashCode + (student == null ? 0 : student.hashCode())) * 31) + this.localPath.hashCode();
    }

    public final void setLocalPath(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.localPath = str;
    }

    public String toString() {
        return "SubjectiveHomeworkAnswer(remoteUrl=" + this.remoteUrl + ", student=" + this.student + ", localPath=" + this.localPath + ")";
    }

    public /* synthetic */ SubjectiveHomeworkAnswer(String str, MqttResponse.Student student, String str2, int i10, AbstractC9972n abstractC9972n) {
        this(str, student, (i10 & 4) != 0 ? "" : str2);
    }
}
