package com.zykj.study.bean.teach;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.zykj.study.bean.exercise.ExerciseType;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SuperviseGroupMember {
    public static final int $stable = 0;
    private final String avatar;
    private final int groupId;

    @SerializedName(alternate = {"superviseGroupName"}, value = "groupName")
    private final String groupName;
    private final Integer progress;
    private final int score;
    private final ExerciseType status;
    private final String userId;

    @SerializedName(alternate = {HintConstants.AUTOFILL_HINT_NAME}, value = "userName")
    private final String userName;

    public SuperviseGroupMember(String userId, String userName, String groupName, String avatar, Integer num, ExerciseType status, int i10, int i11) {
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
        this.score = i10;
        this.groupId = i11;
    }

    public static /* synthetic */ SuperviseGroupMember copy$default(SuperviseGroupMember superviseGroupMember, String str, String str2, String str3, String str4, Integer num, ExerciseType exerciseType, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = superviseGroupMember.userId;
        }
        if ((i12 & 2) != 0) {
            str2 = superviseGroupMember.userName;
        }
        if ((i12 & 4) != 0) {
            str3 = superviseGroupMember.groupName;
        }
        if ((i12 & 8) != 0) {
            str4 = superviseGroupMember.avatar;
        }
        if ((i12 & 16) != 0) {
            num = superviseGroupMember.progress;
        }
        if ((i12 & 32) != 0) {
            exerciseType = superviseGroupMember.status;
        }
        if ((i12 & 64) != 0) {
            i10 = superviseGroupMember.score;
        }
        if ((i12 & 128) != 0) {
            i11 = superviseGroupMember.groupId;
        }
        int i13 = i10;
        int i14 = i11;
        Integer num2 = num;
        ExerciseType exerciseType2 = exerciseType;
        return superviseGroupMember.copy(str, str2, str3, str4, num2, exerciseType2, i13, i14);
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

    public final ExerciseType component6() {
        return this.status;
    }

    public final int component7() {
        return this.score;
    }

    public final int component8() {
        return this.groupId;
    }

    public final SuperviseGroupMember copy(String userId, String userName, String groupName, String avatar, Integer num, ExerciseType status, int i10, int i11) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(userName, "userName");
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(avatar, "avatar");
        AbstractC9133u.m16133g(status, "status");
        return new SuperviseGroupMember(userId, userName, groupName, avatar, num, status, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseGroupMember)) {
            return false;
        }
        SuperviseGroupMember superviseGroupMember = (SuperviseGroupMember) obj;
        return AbstractC9133u.m16128b(this.userId, superviseGroupMember.userId) && AbstractC9133u.m16128b(this.userName, superviseGroupMember.userName) && AbstractC9133u.m16128b(this.groupName, superviseGroupMember.groupName) && AbstractC9133u.m16128b(this.avatar, superviseGroupMember.avatar) && AbstractC9133u.m16128b(this.progress, superviseGroupMember.progress) && this.status == superviseGroupMember.status && this.score == superviseGroupMember.score && this.groupId == superviseGroupMember.groupId;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final int getScore() {
        return this.score;
    }

    public final ExerciseType getStatus() {
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
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.groupId);
    }

    public String toString() {
        return "SuperviseGroupMember(userId=" + this.userId + ", userName=" + this.userName + ", groupName=" + this.groupName + ", avatar=" + this.avatar + ", progress=" + this.progress + ", status=" + this.status + ", score=" + this.score + ", groupId=" + this.groupId + ")";
    }

    public /* synthetic */ SuperviseGroupMember(String str, String str2, String str3, String str4, Integer num, ExerciseType exerciseType, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(str, (i12 & 2) != 0 ? "" : str2, str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? ExerciseType.NOT_STARTED : exerciseType, i10, i11);
    }
}
