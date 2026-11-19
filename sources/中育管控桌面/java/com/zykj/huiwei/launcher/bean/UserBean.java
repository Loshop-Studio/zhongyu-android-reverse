package com.zykj.huiwei.launcher.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003Je\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\fHÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00063"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/UserBean;", "", "id", "", "schoolCode", "", "userName", HintConstants.AUTOFILL_HINT_PASSWORD, "surname", HintConstants.AUTOFILL_HINT_NAME, "picture", "roleType", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()J", "setId", "(J)V", "getSchoolCode", "()Ljava/lang/String;", "setSchoolCode", "(Ljava/lang/String;)V", "getUserName", "setUserName", "getPassword", "setPassword", "getSurname", "setSurname", "getName", "setName", "getPicture", "setPicture", "getRoleType", "()I", "setRoleType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserBean {
    public static final int $stable = 8;
    private long id;
    private String name;
    private String password;

    @SerializedName("pictrue")
    private String picture;
    private int roleType;
    private String schoolCode;
    private String surname;
    private String userName;

    public UserBean() {
        this(0L, null, null, null, null, null, null, 0, 255, null);
    }

    public static /* synthetic */ UserBean copy$default(UserBean userBean, long j6, String str, String str2, String str3, String str4, String str5, String str6, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j6 = userBean.id;
        }
        long j7 = j6;
        if ((i7 & 2) != 0) {
            str = userBean.schoolCode;
        }
        String str7 = str;
        if ((i7 & 4) != 0) {
            str2 = userBean.userName;
        }
        String str8 = str2;
        if ((i7 & 8) != 0) {
            str3 = userBean.password;
        }
        return userBean.copy(j7, str7, str8, str3, (i7 & 16) != 0 ? userBean.surname : str4, (i7 & 32) != 0 ? userBean.name : str5, (i7 & 64) != 0 ? userBean.picture : str6, (i7 & 128) != 0 ? userBean.roleType : i6);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSchoolCode() {
        return this.schoolCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRoleType() {
        return this.roleType;
    }

    public final UserBean copy(long id, String schoolCode, String userName, String password, String surname, String name, String picture, int roleType) {
        return new UserBean(id, schoolCode, userName, password, surname, name, picture, roleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBean)) {
            return false;
        }
        UserBean userBean = (UserBean) other;
        return this.id == userBean.id && Intrinsics.areEqual(this.schoolCode, userBean.schoolCode) && Intrinsics.areEqual(this.userName, userBean.userName) && Intrinsics.areEqual(this.password, userBean.password) && Intrinsics.areEqual(this.surname, userBean.surname) && Intrinsics.areEqual(this.name, userBean.name) && Intrinsics.areEqual(this.picture, userBean.picture) && this.roleType == userBean.roleType;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final int getRoleType() {
        return this.roleType;
    }

    public final String getSchoolCode() {
        return this.schoolCode;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.schoolCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.surname;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Integer.hashCode(this.roleType);
    }

    public final void setId(long j6) {
        this.id = j6;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPicture(String str) {
        this.picture = str;
    }

    public final void setRoleType(int i6) {
        this.roleType = i6;
    }

    public final void setSchoolCode(String str) {
        this.schoolCode = str;
    }

    public final void setSurname(String str) {
        this.surname = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "UserBean(id=" + this.id + ", schoolCode=" + this.schoolCode + ", userName=" + this.userName + ", password=" + this.password + ", surname=" + this.surname + ", name=" + this.name + ", picture=" + this.picture + ", roleType=" + this.roleType + ")";
    }

    public UserBean(long j6, String str, String str2, String str3, String str4, String str5, String str6, int i6) {
        this.id = j6;
        this.schoolCode = str;
        this.userName = str2;
        this.password = str3;
        this.surname = str4;
        this.name = str5;
        this.picture = str6;
        this.roleType = i6;
    }

    public /* synthetic */ UserBean(long j6, String str, String str2, String str3, String str4, String str5, String str6, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j6, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? "" : str4, (i7 & 32) != 0 ? "" : str5, (i7 & 64) != 0 ? "" : str6, (i7 & 128) != 0 ? 0 : i6);
    }
}
