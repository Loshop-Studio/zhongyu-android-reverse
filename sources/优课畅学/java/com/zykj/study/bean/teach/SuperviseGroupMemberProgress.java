package com.zykj.study.bean.teach;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.zykj.study.bean.course.StudyStatus;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SuperviseGroupMemberProgress {
    public static final int $stable = 0;
    private final String avatar;

    @SerializedName(alternate = {"superviseGroupName"}, value = "groupName")
    private final String groupName;
    private final Integer progress;
    private final StudyStatus status;
    private final String userId;

    @SerializedName(alternate = {HintConstants.AUTOFILL_HINT_NAME}, value = "userName")
    private final String userName;

    public SuperviseGroupMemberProgress(String userId, String userName, String groupName, String avatar, Integer num, StudyStatus status) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(userName, "userName");
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(avatar, "avatar");
        AbstractC9133u.m16133g(status, "status");
        this.userId = userId;
        this.userName = userName;
        this.groupName = groupName;
        this.avatar = avatar;
        this.progress = num;
        this.status = status;
    }

    public static /* synthetic */ SuperviseGroupMemberProgress copy$default(SuperviseGroupMemberProgress superviseGroupMemberProgress, String str, String str2, String str3, String str4, Integer num, StudyStatus studyStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = superviseGroupMemberProgress.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = superviseGroupMemberProgress.userName;
        }
        if ((i10 & 4) != 0) {
            str3 = superviseGroupMemberProgress.groupName;
        }
        if ((i10 & 8) != 0) {
            str4 = superviseGroupMemberProgress.avatar;
        }
        if ((i10 & 16) != 0) {
            num = superviseGroupMemberProgress.progress;
        }
        if ((i10 & 32) != 0) {
            studyStatus = superviseGroupMemberProgress.status;
        }
        Integer num2 = num;
        StudyStatus studyStatus2 = studyStatus;
        return superviseGroupMemberProgress.copy(str, str2, str3, str4, num2, studyStatus2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.groupName;
    }

    public final String component4() {
        return this.avatar;
    }

    public final Integer component5() {
        return this.progress;
    }

    public final StudyStatus component6() {
        return this.status;
    }

    public final SuperviseGroupMemberProgress copy(String userId, String userName, String groupName, String avatar, Integer num, StudyStatus status) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(userName, "userName");
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(avatar, "avatar");
        AbstractC9133u.m16133g(status, "status");
        return new SuperviseGroupMemberProgress(userId, userName, groupName, avatar, num, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseGroupMemberProgress)) {
            return false;
        }
        SuperviseGroupMemberProgress superviseGroupMemberProgress = (SuperviseGroupMemberProgress) obj;
        return AbstractC9133u.m16128b(this.userId, superviseGroupMemberProgress.userId) && AbstractC9133u.m16128b(this.userName, superviseGroupMemberProgress.userName) && AbstractC9133u.m16128b(this.groupName, superviseGroupMemberProgress.groupName) && AbstractC9133u.m16128b(this.avatar, superviseGroupMemberProgress.avatar) && AbstractC9133u.m16128b(this.progress, superviseGroupMemberProgress.progress) && this.status == superviseGroupMemberProgress.status;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final StudyStatus getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = ((((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.groupName.hashCode()) * 31) + this.avatar.hashCode()) * 31;
        Integer num = this.progress;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SuperviseGroupMemberProgress(userId=" + this.userId + ", userName=" + this.userName + ", groupName=" + this.groupName + ", avatar=" + this.avatar + ", progress=" + this.progress + ", status=" + this.status + ")";
    }

    public /* synthetic */ SuperviseGroupMemberProgress(String str, String str2, String str3, String str4, Integer num, StudyStatus studyStatus, int i10, AbstractC9126n abstractC9126n) {
        this(str, (i10 & 2) != 0 ? "" : str2, str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? StudyStatus.NOT_COMPLETE : studyStatus);
    }
}
