package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class CourseDetailsBean extends CourseSimpleBean {
    public static final int $stable = 8;
    private List<CatalogBean> catalogs;
    private String courseName;

    @SerializedName("isSupervised")
    private boolean isBindTeach;
    private boolean isLearning;

    @SerializedName("isSuperviser")
    private boolean isTutoring;
    private Date learnTime;
    private Integer progress;
    private Integer students;
    private int superviseId;
    private String userAvatar;

    public /* synthetic */ CourseDetailsBean(int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, String str9, int i13, String str10, int i14, int i15, int i16, boolean z10, Integer num, Integer num2, Date date, boolean z11, List list, boolean z12, boolean z13, CourseType courseType, int i17, AbstractC9126n abstractC9126n) {
        this(i10, i11, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? "" : str2, (i17 & 16) != 0 ? "" : str3, (i17 & 32) != 0 ? "" : str4, (i17 & 64) != 0 ? "" : str5, (i17 & 128) != 0 ? "" : str6, (i17 & 256) != 0 ? "" : str7, (i17 & 512) != 0 ? "" : str8, (i17 & 1024) != 0 ? 0 : i12, (i17 & 2048) != 0 ? "" : str9, (i17 & 4096) != 0 ? 0 : i13, (i17 & 8192) != 0 ? "" : str10, (i17 & 16384) != 0 ? 0 : i14, (32768 & i17) != 0 ? 0 : i15, (65536 & i17) != 0 ? 0 : i16, (131072 & i17) != 0 ? false : z10, (262144 & i17) != 0 ? 0 : num, (524288 & i17) != 0 ? 0 : num2, (1048576 & i17) != 0 ? null : date, (2097152 & i17) != 0 ? true : z11, list, (8388608 & i17) != 0 ? true : z12, (i17 & 16777216) != 0 ? true : z13, courseType);
    }

    @Override // com.zykj.study.bean.course.CourseSimpleBean, com.zykj.study.bean.course.CourseBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseDetailsBean) || !super.equals(obj)) {
            return false;
        }
        CourseDetailsBean courseDetailsBean = (CourseDetailsBean) obj;
        return this.superviseId == courseDetailsBean.superviseId && AbstractC9133u.m16128b(this.userAvatar, courseDetailsBean.userAvatar) && AbstractC9133u.m16128b(this.courseName, courseDetailsBean.courseName) && this.isLearning == courseDetailsBean.isLearning && AbstractC9133u.m16128b(this.progress, courseDetailsBean.progress) && AbstractC9133u.m16128b(this.students, courseDetailsBean.students) && AbstractC9133u.m16128b(this.learnTime, courseDetailsBean.learnTime) && AbstractC9133u.m16128b(this.catalogs, courseDetailsBean.catalogs) && this.isBindTeach == courseDetailsBean.isBindTeach && this.isTutoring == courseDetailsBean.isTutoring;
    }

    public final List<CatalogBean> getCatalogs() {
        return this.catalogs;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final Date getLearnTime() {
        return this.learnTime;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final Integer getStudents() {
        return this.students;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public final String getUserAvatar() {
        return this.userAvatar;
    }

    @Override // com.zykj.study.bean.course.CourseSimpleBean, com.zykj.study.bean.course.CourseBean
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.superviseId) * 31;
        String str = this.userAvatar;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.courseName;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLearning)) * 31;
        Integer num = this.progress;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.students;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Date date = this.learnTime;
        int iHashCode4 = (iIntValue2 + (date != null ? date.hashCode() : 0)) * 31;
        List<CatalogBean> list = this.catalogs;
        return ((((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBindTeach)) * 31) + Boolean.hashCode(this.isTutoring);
    }

    public final boolean isBindTeach() {
        return this.isBindTeach;
    }

    public final boolean isLearning() {
        return this.isLearning;
    }

    public final boolean isTutoring() {
        return this.isTutoring;
    }

    public final void setBindTeach(boolean z10) {
        this.isBindTeach = z10;
    }

    public final void setCatalogs(List<CatalogBean> list) {
        this.catalogs = list;
    }

    public final void setCourseName(String str) {
        this.courseName = str;
    }

    public final void setLearnTime(Date date) {
        this.learnTime = date;
    }

    public final void setLearning(boolean z10) {
        this.isLearning = z10;
    }

    public final void setProgress(Integer num) {
        this.progress = num;
    }

    public final void setStudents(Integer num) {
        this.students = num;
    }

    public final void setSuperviseId(int i10) {
        this.superviseId = i10;
    }

    public final void setTutoring(boolean z10) {
        this.isTutoring = z10;
    }

    public final void setUserAvatar(String str) {
        this.userAvatar = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseDetailsBean(int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, String str9, int i13, String str10, int i14, int i15, int i16, boolean z10, Integer num, Integer num2, Date date, boolean z11, List<CatalogBean> list, boolean z12, boolean z13, CourseType status) {
        super(i10, str, str3, str4, str5, str7, str8, i12, str9, i13, str10, i14, i15, i16, z11, status);
        AbstractC9133u.m16133g(status, "status");
        this.superviseId = i11;
        this.userAvatar = str2;
        this.courseName = str6;
        this.isLearning = z10;
        this.progress = num;
        this.students = num2;
        this.learnTime = date;
        this.catalogs = list;
        this.isBindTeach = z12;
        this.isTutoring = z13;
    }
}
