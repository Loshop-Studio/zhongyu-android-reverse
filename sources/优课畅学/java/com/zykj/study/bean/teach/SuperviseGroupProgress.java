package com.zykj.study.bean.teach;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SuperviseGroupProgress {
    public static final int $stable = 8;

    /* renamed from: id */
    @SerializedName(alternate = {"groupId"}, value = "id")
    private final int f11016id;
    private List<SuperviseGroupMemberProgress> memberList;

    @SerializedName(alternate = {"groupName"}, value = HintConstants.AUTOFILL_HINT_NAME)
    private final String name;
    private final Integer progress;

    public SuperviseGroupProgress(int i10, String name, Integer num, List<SuperviseGroupMemberProgress> memberList) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(memberList, "memberList");
        this.f11016id = i10;
        this.name = name;
        this.progress = num;
        this.memberList = memberList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuperviseGroupProgress copy$default(SuperviseGroupProgress superviseGroupProgress, int i10, String str, Integer num, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = superviseGroupProgress.f11016id;
        }
        if ((i11 & 2) != 0) {
            str = superviseGroupProgress.name;
        }
        if ((i11 & 4) != 0) {
            num = superviseGroupProgress.progress;
        }
        if ((i11 & 8) != 0) {
            list = superviseGroupProgress.memberList;
        }
        return superviseGroupProgress.copy(i10, str, num, list);
    }

    public final int component1() {
        return this.f11016id;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.progress;
    }

    public final List<SuperviseGroupMemberProgress> component4() {
        return this.memberList;
    }

    public final SuperviseGroupProgress copy(int i10, String name, Integer num, List<SuperviseGroupMemberProgress> memberList) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(memberList, "memberList");
        return new SuperviseGroupProgress(i10, name, num, memberList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseGroupProgress)) {
            return false;
        }
        SuperviseGroupProgress superviseGroupProgress = (SuperviseGroupProgress) obj;
        return this.f11016id == superviseGroupProgress.f11016id && AbstractC9133u.m16128b(this.name, superviseGroupProgress.name) && AbstractC9133u.m16128b(this.progress, superviseGroupProgress.progress) && AbstractC9133u.m16128b(this.memberList, superviseGroupProgress.memberList);
    }

    public final int getId() {
        return this.f11016id;
    }

    public final List<SuperviseGroupMemberProgress> getMemberList() {
        return this.memberList;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f11016id) * 31) + this.name.hashCode()) * 31;
        Integer num = this.progress;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.memberList.hashCode();
    }

    public final void setMemberList(List<SuperviseGroupMemberProgress> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.memberList = list;
    }

    public String toString() {
        return "SuperviseGroupProgress(id=" + this.f11016id + ", name=" + this.name + ", progress=" + this.progress + ", memberList=" + this.memberList + ")";
    }

    public /* synthetic */ SuperviseGroupProgress(int i10, String str, Integer num, List list, int i11, AbstractC9126n abstractC9126n) {
        this(i10, str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? AbstractC8809v.m14771n() : list);
    }
}
