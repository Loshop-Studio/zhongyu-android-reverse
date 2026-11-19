package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import anet.channel.util.HttpConstant;
import com.friday.common.helper.C5962b;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class NoteBean {
    public static final int $stable = 8;
    private final String createTime;
    private final long expirationTimeStamp;
    private final String fileId;
    private final String fileName;
    private final String fileUrl;
    private final boolean isRecycleBin;
    private boolean isSelected;
    private final String parentId;
    private final boolean shared;
    private final long sharerId;
    private final String type;
    private final String updateTime;
    private final int version;

    public NoteBean(String fileId, String fileName, String parentId, String fileUrl, String type, String createTime, String updateTime, int i10, long j10, boolean z10, boolean z11, boolean z12, long j11) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        this.fileId = fileId;
        this.fileName = fileName;
        this.parentId = parentId;
        this.fileUrl = fileUrl;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.version = i10;
        this.sharerId = j10;
        this.shared = z10;
        this.isSelected = z11;
        this.isRecycleBin = z12;
        this.expirationTimeStamp = j11;
    }

    public static /* synthetic */ NoteBean copy$default(NoteBean noteBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, long j10, boolean z10, boolean z11, boolean z12, long j11, int i11, Object obj) {
        long j12;
        String str8;
        NoteBean noteBean2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i12;
        long j13;
        boolean z13;
        boolean z14;
        boolean z15;
        String str15 = (i11 & 1) != 0 ? noteBean.fileId : str;
        String str16 = (i11 & 2) != 0 ? noteBean.fileName : str2;
        String str17 = (i11 & 4) != 0 ? noteBean.parentId : str3;
        String str18 = (i11 & 8) != 0 ? noteBean.fileUrl : str4;
        String str19 = (i11 & 16) != 0 ? noteBean.type : str5;
        String str20 = (i11 & 32) != 0 ? noteBean.createTime : str6;
        String str21 = (i11 & 64) != 0 ? noteBean.updateTime : str7;
        int i13 = (i11 & 128) != 0 ? noteBean.version : i10;
        long j14 = (i11 & 256) != 0 ? noteBean.sharerId : j10;
        boolean z16 = (i11 & 512) != 0 ? noteBean.shared : z10;
        boolean z17 = (i11 & 1024) != 0 ? noteBean.isSelected : z11;
        boolean z18 = (i11 & 2048) != 0 ? noteBean.isRecycleBin : z12;
        if ((i11 & 4096) != 0) {
            str8 = str15;
            j12 = noteBean.expirationTimeStamp;
            str9 = str16;
            str10 = str17;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            str14 = str21;
            i12 = i13;
            j13 = j14;
            z13 = z16;
            z14 = z17;
            z15 = z18;
            noteBean2 = noteBean;
        } else {
            j12 = j11;
            str8 = str15;
            noteBean2 = noteBean;
            str9 = str16;
            str10 = str17;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            str14 = str21;
            i12 = i13;
            j13 = j14;
            z13 = z16;
            z14 = z17;
            z15 = z18;
        }
        return noteBean2.copy(str8, str9, str10, str11, str12, str13, str14, i12, j13, z13, z14, z15, j12);
    }

    public final String component1() {
        return this.fileId;
    }

    public final boolean component10() {
        return this.shared;
    }

    public final boolean component11() {
        return this.isSelected;
    }

    public final boolean component12() {
        return this.isRecycleBin;
    }

    public final long component13() {
        return this.expirationTimeStamp;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.parentId;
    }

    public final String component4() {
        return this.fileUrl;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.createTime;
    }

    public final String component7() {
        return this.updateTime;
    }

    public final int component8() {
        return this.version;
    }

    public final long component9() {
        return this.sharerId;
    }

    public final NoteBean copy(String fileId, String fileName, String parentId, String fileUrl, String type, String createTime, String updateTime, int i10, long j10, boolean z10, boolean z11, boolean z12, long j11) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        return new NoteBean(fileId, fileName, parentId, fileUrl, type, createTime, updateTime, i10, j10, z10, z11, z12, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteBean)) {
            return false;
        }
        NoteBean noteBean = (NoteBean) obj;
        return AbstractC9979u.m20289b(this.fileId, noteBean.fileId) && AbstractC9979u.m20289b(this.fileName, noteBean.fileName) && AbstractC9979u.m20289b(this.parentId, noteBean.parentId) && AbstractC9979u.m20289b(this.fileUrl, noteBean.fileUrl) && AbstractC9979u.m20289b(this.type, noteBean.type) && AbstractC9979u.m20289b(this.createTime, noteBean.createTime) && AbstractC9979u.m20289b(this.updateTime, noteBean.updateTime) && this.version == noteBean.version && this.sharerId == noteBean.sharerId && this.shared == noteBean.shared && this.isSelected == noteBean.isSelected && this.isRecycleBin == noteBean.isRecycleBin && this.expirationTimeStamp == noteBean.expirationTimeStamp;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final long getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getFullMicroLessonOssUrl() {
        return AbstractC10819z.m23242O(this.fileUrl, HttpConstant.HTTP, false, 2, null) ? this.fileUrl : C5962b.f6082a.m5299a().m5276d(this.fileUrl);
    }

    public final String getMicroCoverOssUrl() {
        if (AbstractC10819z.m23229B(this.fileUrl, this.fileId + ".zip", false, 2, null)) {
            return AbstractC10793c0.m23150z0(this.fileUrl, ".zip") + ".jpg";
        }
        C5962b c5962bM5299a = C5962b.f6082a.m5299a();
        return c5962bM5299a.m5276d(c5962bM5299a.m5275c(this.fileId + ".jpg"));
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final long getSharerId() {
        return this.sharerId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.fileId.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.parentId.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.type.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Long.hashCode(this.sharerId)) * 31) + Boolean.hashCode(this.shared)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isRecycleBin)) * 31) + Long.hashCode(this.expirationTimeStamp);
    }

    public final boolean isRecycleBin() {
        return this.isRecycleBin;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        return "NoteBean(fileId=" + this.fileId + ", fileName=" + this.fileName + ", parentId=" + this.parentId + ", fileUrl=" + this.fileUrl + ", type=" + this.type + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", version=" + this.version + ", sharerId=" + this.sharerId + ", shared=" + this.shared + ", isSelected=" + this.isSelected + ", isRecycleBin=" + this.isRecycleBin + ", expirationTimeStamp=" + this.expirationTimeStamp + ")";
    }

    public /* synthetic */ NoteBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, long j10, boolean z10, boolean z11, boolean z12, long j11, int i11, AbstractC9972n abstractC9972n) {
        this(str, str2, str3, str4, str5, str6, str7, i10, j10, z10, (i11 & 1024) != 0 ? false : z11, (i11 & 2048) != 0 ? false : z12, (i11 & 4096) != 0 ? 0L : j11);
    }
}
