package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.study.bean.course.CatalogBean;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GroupMember {
    public static final int $stable = 8;
    private final List<CatalogBean> catalogs;
    private final String courseCover;
    private final String courseName;
    private final String groupName;
    private final String progress;
    private final String userAvatar;
    private final String userId;
    private final String userName;

    public GroupMember(String userId, String str, String str2, String str3, String str4, String str5, String progress, List<CatalogBean> catalogs) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(progress, "progress");
        AbstractC9133u.m16133g(catalogs, "catalogs");
        this.userId = userId;
        this.userName = str;
        this.userAvatar = str2;
        this.groupName = str3;
        this.courseName = str4;
        this.courseCover = str5;
        this.progress = progress;
        this.catalogs = catalogs;
    }

    public static /* synthetic */ GroupMember copy$default(GroupMember groupMember, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = groupMember.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = groupMember.userName;
        }
        if ((i10 & 4) != 0) {
            str3 = groupMember.userAvatar;
        }
        if ((i10 & 8) != 0) {
            str4 = groupMember.groupName;
        }
        if ((i10 & 16) != 0) {
            str5 = groupMember.courseName;
        }
        if ((i10 & 32) != 0) {
            str6 = groupMember.courseCover;
        }
        if ((i10 & 64) != 0) {
            str7 = groupMember.progress;
        }
        if ((i10 & 128) != 0) {
            list = groupMember.catalogs;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        return groupMember.copy(str, str2, str3, str4, str9, str10, str8, list2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.userAvatar;
    }

    public final String component4() {
        return this.groupName;
    }

    public final String component5() {
        return this.courseName;
    }

    public final String component6() {
        return this.courseCover;
    }

    public final String component7() {
        return this.progress;
    }

    public final List<CatalogBean> component8() {
        return this.catalogs;
    }

    public final GroupMember copy(String userId, String str, String str2, String str3, String str4, String str5, String progress, List<CatalogBean> catalogs) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(progress, "progress");
        AbstractC9133u.m16133g(catalogs, "catalogs");
        return new GroupMember(userId, str, str2, str3, str4, str5, progress, catalogs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMember)) {
            return false;
        }
        GroupMember groupMember = (GroupMember) obj;
        return AbstractC9133u.m16128b(this.userId, groupMember.userId) && AbstractC9133u.m16128b(this.userName, groupMember.userName) && AbstractC9133u.m16128b(this.userAvatar, groupMember.userAvatar) && AbstractC9133u.m16128b(this.groupName, groupMember.groupName) && AbstractC9133u.m16128b(this.courseName, groupMember.courseName) && AbstractC9133u.m16128b(this.courseCover, groupMember.courseCover) && AbstractC9133u.m16128b(this.progress, groupMember.progress) && AbstractC9133u.m16128b(this.catalogs, groupMember.catalogs);
    }

    public final List<CatalogBean> getCatalogs() {
        return this.catalogs;
    }

    public final String getCourseCover() {
        return this.courseCover;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getProgress() {
        return this.progress;
    }

    public final String getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.courseName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.courseCover;
        return ((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.progress.hashCode()) * 31) + this.catalogs.hashCode();
    }

    public String toString() {
        return "GroupMember(userId=" + this.userId + ", userName=" + this.userName + ", userAvatar=" + this.userAvatar + ", groupName=" + this.groupName + ", courseName=" + this.courseName + ", courseCover=" + this.courseCover + ", progress=" + this.progress + ", catalogs=" + this.catalogs + ")";
    }
}
