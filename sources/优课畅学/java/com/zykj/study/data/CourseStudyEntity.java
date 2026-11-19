package com.zykj.study.data;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.course.CourseType;
import java.util.Date;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = "course_study")
@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public final class CourseStudyEntity extends CourseBean {
    public static final int $stable = 8;

    @ColumnInfo
    private Date learnTime;

    @ColumnInfo
    private int progress;

    @ColumnInfo
    private String studyUserId;

    @ColumnInfo
    private String userName;

    public /* synthetic */ CourseStudyEntity(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, int i13, int i14, int i15, boolean z10, CourseType courseType, int i16, String str6, Date date, Date date2, int i17, AbstractC9126n abstractC9126n) {
        this(i10, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? "" : str5, (i17 & 64) != 0 ? 0 : i11, (i17 & 128) != 0 ? 0 : i12, (i17 & 256) != 0 ? 0 : i13, (i17 & 512) != 0 ? 0 : i14, (i17 & 1024) != 0 ? 0 : i15, (i17 & 2048) != 0 ? true : z10, courseType, (i17 & 8192) != 0 ? 0 : i16, (i17 & 16384) != 0 ? "" : str6, (32768 & i17) != 0 ? null : date, (i17 & 65536) != 0 ? null : date2);
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseStudyEntity) || !super.equals(obj)) {
            return false;
        }
        CourseStudyEntity courseStudyEntity = (CourseStudyEntity) obj;
        return AbstractC9133u.m16128b(this.userName, courseStudyEntity.userName) && this.progress == courseStudyEntity.progress && AbstractC9133u.m16128b(this.studyUserId, courseStudyEntity.studyUserId) && AbstractC9133u.m16128b(this.learnTime, courseStudyEntity.learnTime);
    }

    public final Date getLearnTime() {
        return this.learnTime;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getStudyUserId() {
        return this.studyUserId;
    }

    public final String getUserName() {
        return this.userName;
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.userName;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.progress) * 31;
        String str2 = this.studyUserId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Date date = this.learnTime;
        return iHashCode3 + (date != null ? date.hashCode() : 0);
    }

    public final void setLearnTime(Date date) {
        this.learnTime = date;
    }

    public final void setProgress(int i10) {
        this.progress = i10;
    }

    public final void setStudyUserId(String str) {
        this.studyUserId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseStudyEntity(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, int i13, int i14, int i15, boolean z10, CourseType status, int i16, String str6, Date date, Date date2) {
        super(i10, str, str3, str4, str5, i11, i12, i13, i14, i15, z10, status, date);
        AbstractC9133u.m16133g(status, "status");
        this.userName = str2;
        this.progress = i16;
        this.studyUserId = str6;
        this.learnTime = date2;
    }
}
