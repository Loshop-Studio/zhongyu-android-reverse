package com.zykj.study.bean.teach;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.zykj.study.bean.exercise.ExerciseBean;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SuperviseGroup {
    public static final int $stable = 8;
    private final int avg;
    private final int completed;

    /* renamed from: id */
    @SerializedName(alternate = {"groupId"}, value = "id")
    private final int f11015id;
    private List<SuperviseGroupMember> memberList;
    private final int members;

    @SerializedName(alternate = {"groupName"}, value = HintConstants.AUTOFILL_HINT_NAME)
    private final String name;
    private final Integer progress;
    private final List<ExerciseBean> questionGroups;

    public SuperviseGroup(int i10, String name, Integer num, int i11, int i12, int i13, List<SuperviseGroupMember> memberList, List<ExerciseBean> questionGroups) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(memberList, "memberList");
        AbstractC9133u.m16133g(questionGroups, "questionGroups");
        this.f11015id = i10;
        this.name = name;
        this.progress = num;
        this.completed = i11;
        this.avg = i12;
        this.members = i13;
        this.memberList = memberList;
        this.questionGroups = questionGroups;
    }

    public static /* synthetic */ SuperviseGroup copy$default(SuperviseGroup superviseGroup, int i10, String str, Integer num, int i11, int i12, int i13, List list, List list2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = superviseGroup.f11015id;
        }
        if ((i14 & 2) != 0) {
            str = superviseGroup.name;
        }
        if ((i14 & 4) != 0) {
            num = superviseGroup.progress;
        }
        if ((i14 & 8) != 0) {
            i11 = superviseGroup.completed;
        }
        if ((i14 & 16) != 0) {
            i12 = superviseGroup.avg;
        }
        if ((i14 & 32) != 0) {
            i13 = superviseGroup.members;
        }
        if ((i14 & 64) != 0) {
            list = superviseGroup.memberList;
        }
        if ((i14 & 128) != 0) {
            list2 = superviseGroup.questionGroups;
        }
        List list3 = list;
        List list4 = list2;
        int i15 = i12;
        int i16 = i13;
        return superviseGroup.copy(i10, str, num, i11, i15, i16, list3, list4);
    }

    public final int component1() {
        return this.f11015id;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.progress;
    }

    public final int component4() {
        return this.completed;
    }

    public final int component5() {
        return this.avg;
    }

    public final int component6() {
        return this.members;
    }

    public final List<SuperviseGroupMember> component7() {
        return this.memberList;
    }

    public final List<ExerciseBean> component8() {
        return this.questionGroups;
    }

    public final SuperviseGroup copy(int i10, String name, Integer num, int i11, int i12, int i13, List<SuperviseGroupMember> memberList, List<ExerciseBean> questionGroups) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(memberList, "memberList");
        AbstractC9133u.m16133g(questionGroups, "questionGroups");
        return new SuperviseGroup(i10, name, num, i11, i12, i13, memberList, questionGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseGroup)) {
            return false;
        }
        SuperviseGroup superviseGroup = (SuperviseGroup) obj;
        return this.f11015id == superviseGroup.f11015id && AbstractC9133u.m16128b(this.name, superviseGroup.name) && AbstractC9133u.m16128b(this.progress, superviseGroup.progress) && this.completed == superviseGroup.completed && this.avg == superviseGroup.avg && this.members == superviseGroup.members && AbstractC9133u.m16128b(this.memberList, superviseGroup.memberList) && AbstractC9133u.m16128b(this.questionGroups, superviseGroup.questionGroups);
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getCompleted() {
        return this.completed;
    }

    public final int getId() {
        return this.f11015id;
    }

    public final List<SuperviseGroupMember> getMemberList() {
        return this.memberList;
    }

    public final int getMembers() {
        return this.members;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final List<ExerciseBean> getQuestionGroups() {
        return this.questionGroups;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f11015id) * 31) + this.name.hashCode()) * 31;
        Integer num = this.progress;
        return ((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.completed)) * 31) + Integer.hashCode(this.avg)) * 31) + Integer.hashCode(this.members)) * 31) + this.memberList.hashCode()) * 31) + this.questionGroups.hashCode();
    }

    public final void setMemberList(List<SuperviseGroupMember> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.memberList = list;
    }

    public String toString() {
        return "SuperviseGroup(id=" + this.f11015id + ", name=" + this.name + ", progress=" + this.progress + ", completed=" + this.completed + ", avg=" + this.avg + ", members=" + this.members + ", memberList=" + this.memberList + ", questionGroups=" + this.questionGroups + ")";
    }

    public /* synthetic */ SuperviseGroup(int i10, String str, Integer num, int i11, int i12, int i13, List list, List list2, int i14, AbstractC9126n abstractC9126n) {
        this(i10, str, (i14 & 4) != 0 ? null : num, i11, i12, i13, (i14 & 64) != 0 ? AbstractC8809v.m14771n() : list, (i14 & 128) != 0 ? AbstractC8809v.m14771n() : list2);
    }
}
