package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TchByCloudEntity {
    public static final int $stable = 8;
    private boolean isSelected;
    private final String picture;
    private final long teacherId;
    private final String teacherName;
    private final String updateTime;

    public TchByCloudEntity(long j10, String teacherName, String updateTime, String str, boolean z10) {
        AbstractC9979u.m20294g(teacherName, "teacherName");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        this.teacherId = j10;
        this.teacherName = teacherName;
        this.updateTime = updateTime;
        this.picture = str;
        this.isSelected = z10;
    }

    public static /* synthetic */ TchByCloudEntity copy$default(TchByCloudEntity tchByCloudEntity, long j10, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = tchByCloudEntity.teacherId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = tchByCloudEntity.teacherName;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = tchByCloudEntity.updateTime;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = tchByCloudEntity.picture;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            z10 = tchByCloudEntity.isSelected;
        }
        return tchByCloudEntity.copy(j11, str4, str5, str6, z10);
    }

    public final long component1() {
        return this.teacherId;
    }

    public final String component2() {
        return this.teacherName;
    }

    public final String component3() {
        return this.updateTime;
    }

    public final String component4() {
        return this.picture;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final TchByCloudEntity copy(long j10, String teacherName, String updateTime, String str, boolean z10) {
        AbstractC9979u.m20294g(teacherName, "teacherName");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        return new TchByCloudEntity(j10, teacherName, updateTime, str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TchByCloudEntity)) {
            return false;
        }
        TchByCloudEntity tchByCloudEntity = (TchByCloudEntity) obj;
        return this.teacherId == tchByCloudEntity.teacherId && AbstractC9979u.m20289b(this.teacherName, tchByCloudEntity.teacherName) && AbstractC9979u.m20289b(this.updateTime, tchByCloudEntity.updateTime) && AbstractC9979u.m20289b(this.picture, tchByCloudEntity.picture) && this.isSelected == tchByCloudEntity.isSelected;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final long getTeacherId() {
        return this.teacherId;
    }

    public final String getTeacherName() {
        return this.teacherName;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.teacherId) * 31) + this.teacherName.hashCode()) * 31) + this.updateTime.hashCode()) * 31;
        String str = this.picture;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        return "TchByCloudEntity(teacherId=" + this.teacherId + ", teacherName=" + this.teacherName + ", updateTime=" + this.updateTime + ", picture=" + this.picture + ", isSelected=" + this.isSelected + ")";
    }
}
