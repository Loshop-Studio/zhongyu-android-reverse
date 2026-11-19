package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.zykj.message.client.BuildConfig;

/* loaded from: classes.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() { // from class: com.zykj.message.server.bean.UserInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    };

    /* renamed from: id */
    private Long f34id;
    private String password;
    private String photo;
    private String realName;
    private Integer role;
    private String schoolCode;
    private String userName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Long getId() {
        return this.f34id;
    }

    public void setId(Long l) {
        this.f34id = l;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String str) {
        this.realName = str;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String str) {
        this.photo = str;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public String getSchoolCode() {
        return this.schoolCode;
    }

    public void setSchoolCode(String str) {
        this.schoolCode = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f34id);
        parcel.writeString(this.schoolCode);
        parcel.writeString(this.userName);
        parcel.writeString(this.realName);
        parcel.writeString(this.password);
        parcel.writeString(this.photo);
        parcel.writeInt(this.role.intValue());
    }

    public UserInfo() {
        this.f34id = 0L;
        this.schoolCode = BuildConfig.FLAVOR;
        this.userName = BuildConfig.FLAVOR;
        this.realName = BuildConfig.FLAVOR;
        this.password = BuildConfig.FLAVOR;
        this.photo = BuildConfig.FLAVOR;
        this.role = 0;
    }

    public UserInfo(Long l, String str, String str2, String str3, String str4, String str5, Integer num) {
        this.f34id = l;
        this.schoolCode = str;
        this.userName = str2;
        this.realName = str3;
        this.password = str4;
        this.photo = str5;
        this.role = num;
    }

    protected UserInfo(Parcel parcel) {
        this.f34id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.schoolCode = parcel.readString();
        this.userName = parcel.readString();
        this.realName = parcel.readString();
        this.password = parcel.readString();
        this.photo = parcel.readString();
        this.role = Integer.valueOf(parcel.readInt());
    }

    public String toString() {
        return "UserInfo{id=" + this.f34id + ", schoolCode='" + this.schoolCode + "', userName='" + this.userName + "', realName='" + this.realName + "', password='" + this.password + "', photo='" + this.photo + "', role=" + this.role + '}';
    }
}
