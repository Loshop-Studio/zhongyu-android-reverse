package com.zykj.study.bean.course;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class CourseBean implements Parcelable {

    @SerializedName(alternate = {"courseCover"}, value = "cover")
    @ColumnInfo
    private String cover;

    @ColumnInfo
    private Date createTime;

    @ColumnInfo
    private String description;

    @SerializedName("grade")
    @ColumnInfo
    private int gradeId;

    /* renamed from: id */
    @PrimaryKey
    @ColumnInfo
    private int f11003id;

    @ColumnInfo
    private boolean isPublic;

    @SerializedName("learning")
    @ColumnInfo
    private int learning;

    @SerializedName("likes")
    @ColumnInfo
    private int likes;

    @SerializedName("level")
    @ColumnInfo
    private int periodId;

    @ColumnInfo
    private CourseType status;

    @SerializedName("subject")
    @ColumnInfo
    private int subjectId;

    @ColumnInfo
    private String title;

    @ColumnInfo
    private String userId;
    public static final Parcelable.Creator<CourseBean> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<CourseBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseBean createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new CourseBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, CourseType.CREATOR.createFromParcel(parcel), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseBean[] newArray(int i10) {
            return new CourseBean[i10];
        }
    }

    public CourseBean(int i10, String str, String str2, String str3, String str4, int i11, int i12, int i13, int i14, int i15, boolean z10, CourseType status, Date date) {
        AbstractC9133u.m16133g(status, "status");
        this.f11003id = i10;
        this.userId = str;
        this.cover = str2;
        this.title = str3;
        this.description = str4;
        this.periodId = i11;
        this.gradeId = i12;
        this.subjectId = i13;
        this.learning = i14;
        this.likes = i15;
        this.isPublic = z10;
        this.status = status;
        this.createTime = date;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseBean)) {
            return false;
        }
        CourseBean courseBean = (CourseBean) obj;
        return getId() == courseBean.getId() && AbstractC9133u.m16128b(getUserId(), courseBean.getUserId()) && AbstractC9133u.m16128b(getCover(), courseBean.getCover()) && AbstractC9133u.m16128b(getTitle(), courseBean.getTitle()) && AbstractC9133u.m16128b(getDescription(), courseBean.getDescription()) && getPeriodId() == courseBean.getPeriodId() && getGradeId() == courseBean.getGradeId() && getSubjectId() == courseBean.getSubjectId() && getLearning() == courseBean.getLearning() && getLikes() == courseBean.getLikes() && isPublic() == courseBean.isPublic() && getStatus() == courseBean.getStatus() && AbstractC9133u.m16128b(getCreateTime(), courseBean.getCreateTime());
    }

    public String getCover() {
        return this.cover;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public int getGradeId() {
        return this.gradeId;
    }

    public int getId() {
        return this.f11003id;
    }

    public int getLearning() {
        return this.learning;
    }

    public int getLikes() {
        return this.likes;
    }

    public int getPeriodId() {
        return this.periodId;
    }

    public CourseType getStatus() {
        return this.status;
    }

    public int getSubjectId() {
        return this.subjectId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int id = getId() * 31;
        String userId = getUserId();
        int iHashCode = (id + (userId != null ? userId.hashCode() : 0)) * 31;
        String cover = getCover();
        int iHashCode2 = (iHashCode + (cover != null ? cover.hashCode() : 0)) * 31;
        String title = getTitle();
        int iHashCode3 = (iHashCode2 + (title != null ? title.hashCode() : 0)) * 31;
        String description = getDescription();
        int iHashCode4 = (((((((((((((((iHashCode3 + (description != null ? description.hashCode() : 0)) * 31) + getPeriodId()) * 31) + getGradeId()) * 31) + getSubjectId()) * 31) + getLearning()) * 31) + getLikes()) * 31) + Boolean.hashCode(isPublic())) * 31) + getStatus().hashCode()) * 31;
        Date createTime = getCreateTime();
        return iHashCode4 + (createTime != null ? createTime.hashCode() : 0);
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public void setCover(String str) {
        this.cover = str;
    }

    public void setCreateTime(Date date) {
        this.createTime = date;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGradeId(int i10) {
        this.gradeId = i10;
    }

    public void setId(int i10) {
        this.f11003id = i10;
    }

    public void setLearning(int i10) {
        this.learning = i10;
    }

    public void setLikes(int i10) {
        this.likes = i10;
    }

    public void setPeriodId(int i10) {
        this.periodId = i10;
    }

    public void setPublic(boolean z10) {
        this.isPublic = z10;
    }

    public void setStatus(CourseType courseType) {
        AbstractC9133u.m16133g(courseType, "<set-?>");
        this.status = courseType;
    }

    public void setSubjectId(int i10) {
        this.subjectId = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "CourseBean(id=" + getId() + ", userId=" + getUserId() + ", cover=" + getCover() + ", title=" + getTitle() + ", description=" + getDescription() + ", periodId=" + getPeriodId() + ", gradeId=" + getGradeId() + ", subjectId=" + getSubjectId() + ", learning=" + getLearning() + ", likes=" + getLikes() + ", isPublic=" + isPublic() + ", status=" + getStatus() + ", createTime=" + getCreateTime() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f11003id);
        dest.writeString(this.userId);
        dest.writeString(this.cover);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeInt(this.periodId);
        dest.writeInt(this.gradeId);
        dest.writeInt(this.subjectId);
        dest.writeInt(this.learning);
        dest.writeInt(this.likes);
        dest.writeInt(this.isPublic ? 1 : 0);
        this.status.writeToParcel(dest, i10);
        dest.writeSerializable(this.createTime);
    }

    public /* synthetic */ CourseBean(int i10, String str, String str2, String str3, String str4, int i11, int i12, int i13, int i14, int i15, boolean z10, CourseType courseType, Date date, int i16, AbstractC9126n abstractC9126n) {
        this(i10, (i16 & 2) != 0 ? "" : str, (i16 & 4) != 0 ? "" : str2, (i16 & 8) != 0 ? "" : str3, (i16 & 16) != 0 ? "" : str4, (i16 & 32) != 0 ? 0 : i11, (i16 & 64) != 0 ? 0 : i12, (i16 & 128) != 0 ? 0 : i13, (i16 & 256) != 0 ? 0 : i14, (i16 & 512) != 0 ? 0 : i15, (i16 & 1024) != 0 ? true : z10, (i16 & 2048) != 0 ? CourseType.UNDERCARRIAGE : courseType, date);
    }
}
