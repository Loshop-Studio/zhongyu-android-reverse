package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.study.bean.course.CatalogBean;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GroupMemberProgress {
    public static final int $stable = 8;
    private final List<CatalogBean> catalogs;
    private final int completed;
    private final int groupId;
    private final String groupName;
    private final int members;

    public GroupMemberProgress(int i10, String groupName, int i11, int i12, List<CatalogBean> catalogs) {
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(catalogs, "catalogs");
        this.groupId = i10;
        this.groupName = groupName;
        this.members = i11;
        this.completed = i12;
        this.catalogs = catalogs;
    }

    public static /* synthetic */ GroupMemberProgress copy$default(GroupMemberProgress groupMemberProgress, int i10, String str, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = groupMemberProgress.groupId;
        }
        if ((i13 & 2) != 0) {
            str = groupMemberProgress.groupName;
        }
        if ((i13 & 4) != 0) {
            i11 = groupMemberProgress.members;
        }
        if ((i13 & 8) != 0) {
            i12 = groupMemberProgress.completed;
        }
        if ((i13 & 16) != 0) {
            list = groupMemberProgress.catalogs;
        }
        List list2 = list;
        int i14 = i11;
        return groupMemberProgress.copy(i10, str, i14, i12, list2);
    }

    public final int component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.groupName;
    }

    public final int component3() {
        return this.members;
    }

    public final int component4() {
        return this.completed;
    }

    public final List<CatalogBean> component5() {
        return this.catalogs;
    }

    public final GroupMemberProgress copy(int i10, String groupName, int i11, int i12, List<CatalogBean> catalogs) {
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(catalogs, "catalogs");
        return new GroupMemberProgress(i10, groupName, i11, i12, catalogs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMemberProgress)) {
            return false;
        }
        GroupMemberProgress groupMemberProgress = (GroupMemberProgress) obj;
        return this.groupId == groupMemberProgress.groupId && AbstractC9133u.m16128b(this.groupName, groupMemberProgress.groupName) && this.members == groupMemberProgress.members && this.completed == groupMemberProgress.completed && AbstractC9133u.m16128b(this.catalogs, groupMemberProgress.catalogs);
    }

    public final List<CatalogBean> getCatalogs() {
        return this.catalogs;
    }

    public final int getCompleted() {
        return this.completed;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getMembers() {
        return this.members;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.groupId) * 31) + this.groupName.hashCode()) * 31) + Integer.hashCode(this.members)) * 31) + Integer.hashCode(this.completed)) * 31) + this.catalogs.hashCode();
    }

    public String toString() {
        return "GroupMemberProgress(groupId=" + this.groupId + ", groupName=" + this.groupName + ", members=" + this.members + ", completed=" + this.completed + ", catalogs=" + this.catalogs + ")";
    }
}
