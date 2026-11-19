package com.zykj.study.bean.course;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class CourseSimpleBean extends CourseBean implements Parcelable {
    private String gradeName;
    private String levelName;
    private String subjectName;
    private String userName;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    public static final class CREATOR implements Parcelable.Creator<CourseSimpleBean> {
        public /* synthetic */ CREATOR(AbstractC9126n abstractC9126n) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CourseSimpleBean createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new CourseSimpleBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CourseSimpleBean[] newArray(int i10) {
            return new CourseSimpleBean[i10];
        }
    }

    public /* synthetic */ CourseSimpleBean(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, int i12, String str8, int i13, int i14, int i15, boolean z10, CourseType courseType, int i16, AbstractC9126n abstractC9126n) {
        this(i10, (i16 & 2) != 0 ? "" : str, (i16 & 4) != 0 ? "" : str2, (i16 & 8) != 0 ? "" : str3, (i16 & 16) != 0 ? "" : str4, (i16 & 32) != 0 ? "" : str5, (i16 & 64) != 0 ? "" : str6, (i16 & 128) != 0 ? 0 : i11, (i16 & 256) != 0 ? "" : str7, (i16 & 512) != 0 ? 0 : i12, (i16 & 1024) == 0 ? str8 : "", (i16 & 2048) != 0 ? 0 : i13, (i16 & 4096) != 0 ? 0 : i14, (i16 & 8192) == 0 ? i15 : 0, (i16 & 16384) != 0 ? true : z10, (i16 & 32768) != 0 ? CourseType.UNDERCARRIAGE : courseType);
    }

    @Override // com.zykj.study.bean.course.CourseBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSimpleBean) || !super.equals(obj)) {
            return false;
        }
        CourseSimpleBean courseSimpleBean = (CourseSimpleBean) obj;
        return AbstractC9133u.m16128b(this.userName, courseSimpleBean.userName) && AbstractC9133u.m16128b(this.levelName, courseSimpleBean.levelName) && AbstractC9133u.m16128b(this.gradeName, courseSimpleBean.gradeName) && AbstractC9133u.m16128b(this.subjectName, courseSimpleBean.subjectName);
    }

    public final String getGradeName() {
        return this.gradeName;
    }

    public final String getLevelName() {
        return this.levelName;
    }

    public final String getSubjectName() {
        return this.subjectName;
    }

    public final String getUserName() {
        return this.userName;
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.levelName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.gradeName;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.subjectName;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setGradeName(String str) {
        this.gradeName = str;
    }

    public final void setLevelName(String str) {
        this.levelName = str;
    }

    public final void setSubjectName(String str) {
        this.subjectName = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    @Override // com.zykj.study.bean.course.CourseBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC9133u.m16133g(parcel, "parcel");
        parcel.writeInt(getId());
        parcel.writeString(getUserId());
        parcel.writeString(this.userName);
        parcel.writeString(getCover());
        parcel.writeString(getTitle());
        parcel.writeString(getDescription());
        parcel.writeString(this.levelName);
        parcel.writeInt(getPeriodId());
        parcel.writeString(this.gradeName);
        parcel.writeInt(getGradeId());
        parcel.writeString(this.subjectName);
        parcel.writeInt(getSubjectId());
        parcel.writeInt(getLearning());
        parcel.writeInt(getLikes());
        parcel.writeByte(isPublic() ? (byte) 1 : (byte) 0);
        parcel.writeInt(getStatus().ordinal());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseSimpleBean(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, int i12, String str8, int i13, int i14, int i15, boolean z10, CourseType status) {
        super(i10, str, str3, str4, str5, i11, i12, i13, i14, i15, z10, status, null);
        AbstractC9133u.m16133g(status, "status");
        this.userName = str2;
        this.levelName = str6;
        this.gradeName = str7;
        this.subjectName = str8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseSimpleBean(Parcel parcel) {
        this(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, CourseType.values()[parcel.readInt()]);
        AbstractC9133u.m16133g(parcel, "parcel");
    }
}
