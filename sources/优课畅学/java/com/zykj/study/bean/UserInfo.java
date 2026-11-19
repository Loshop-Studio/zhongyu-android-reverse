package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class UserInfo {
    public static final int $stable = 8;
    private final String avatar;
    private final String email;

    /* renamed from: id */
    private String f10997id;
    private final String mobile;
    private final String name;
    private final String realName;
    private final List<Integer> roles;
    private final String surname;
    private final String userName;

    public UserInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userInfo.f10997id;
        }
        if ((i10 & 2) != 0) {
            str2 = userInfo.userName;
        }
        if ((i10 & 4) != 0) {
            str3 = userInfo.realName;
        }
        if ((i10 & 8) != 0) {
            str4 = userInfo.surname;
        }
        if ((i10 & 16) != 0) {
            str5 = userInfo.name;
        }
        if ((i10 & 32) != 0) {
            str6 = userInfo.mobile;
        }
        if ((i10 & 64) != 0) {
            str7 = userInfo.email;
        }
        if ((i10 & 128) != 0) {
            str8 = userInfo.avatar;
        }
        if ((i10 & 256) != 0) {
            list = userInfo.roles;
        }
        String str9 = str8;
        List list2 = list;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return userInfo.copy(str, str2, str13, str4, str12, str10, str11, str9, list2);
    }

    @InterfaceC8721a
    public static /* synthetic */ void getRealName$annotations() {
    }

    @InterfaceC8721a
    public static /* synthetic */ void getSurname$annotations() {
    }

    public final String component1() {
        return this.f10997id;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.realName;
    }

    public final String component4() {
        return this.surname;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.mobile;
    }

    public final String component7() {
        return this.email;
    }

    public final String component8() {
        return this.avatar;
    }

    public final List<Integer> component9() {
        return this.roles;
    }

    public final UserInfo copy(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Integer> list) {
        AbstractC9133u.m16133g(id, "id");
        return new UserInfo(id, str, str2, str3, str4, str5, str6, str7, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return AbstractC9133u.m16128b(this.f10997id, userInfo.f10997id) && AbstractC9133u.m16128b(this.userName, userInfo.userName) && AbstractC9133u.m16128b(this.realName, userInfo.realName) && AbstractC9133u.m16128b(this.surname, userInfo.surname) && AbstractC9133u.m16128b(this.name, userInfo.name) && AbstractC9133u.m16128b(this.mobile, userInfo.mobile) && AbstractC9133u.m16128b(this.email, userInfo.email) && AbstractC9133u.m16128b(this.avatar, userInfo.avatar) && AbstractC9133u.m16128b(this.roles, userInfo.roles);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.f10997id;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRealName() {
        return this.realName;
    }

    public final RoleType getRoleType() {
        List<Integer> list = this.roles;
        return (list == null || !list.contains(1)) ? RoleType.TEACHER : RoleType.STUDENT;
    }

    public final List<Integer> getRoles() {
        return this.roles;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = this.f10997id.hashCode() * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.realName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobile;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.avatar;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<Integer> list = this.roles;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final void setId(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.f10997id = str;
    }

    public String toString() {
        return "UserInfo(id=" + this.f10997id + ", userName=" + this.userName + ", realName=" + this.realName + ", surname=" + this.surname + ", name=" + this.name + ", mobile=" + this.mobile + ", email=" + this.email + ", avatar=" + this.avatar + ", roles=" + this.roles + ")";
    }

    public UserInfo(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Integer> list) {
        AbstractC9133u.m16133g(id, "id");
        this.f10997id = id;
        this.userName = str;
        this.realName = str2;
        this.surname = str3;
        this.name = str4;
        this.mobile = str5;
        this.email = str6;
        this.avatar = str7;
        this.roles = list;
    }

    public /* synthetic */ UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? new ArrayList() : list);
    }
}
