package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.friday.common.helper.C5962b;
import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareFile {
    public static final int $stable = 8;
    private final String createTime;
    private final String fileId;
    private final String fileName;
    private final String fileUrl;
    private final long ownerId;
    private String ownerName;
    private final String parentId;
    private final long shareId;
    private String shareTime;
    private final boolean shared;
    private final String type;
    private final String updateTime;
    private final int version;

    public ShareFile(String createTime, String fileId, String fileName, String fileUrl, long j10, String ownerName, String parentId, long j11, String shareTime, boolean z10, String type, String updateTime, int i10) {
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        this.createTime = createTime;
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.ownerId = j10;
        this.ownerName = ownerName;
        this.parentId = parentId;
        this.shareId = j11;
        this.shareTime = shareTime;
        this.shared = z10;
        this.type = type;
        this.updateTime = updateTime;
        this.version = i10;
    }

    private final long userId() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    public final String component1() {
        return this.createTime;
    }

    public final boolean component10() {
        return this.shared;
    }

    public final String component11() {
        return this.type;
    }

    public final String component12() {
        return this.updateTime;
    }

    public final int component13() {
        return this.version;
    }

    public final String component2() {
        return this.fileId;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.fileUrl;
    }

    public final long component5() {
        return this.ownerId;
    }

    public final String component6() {
        return this.ownerName;
    }

    public final String component7() {
        return this.parentId;
    }

    public final long component8() {
        return this.shareId;
    }

    public final String component9() {
        return this.shareTime;
    }

    public final ShareFile copy(String createTime, String fileId, String fileName, String fileUrl, long j10, String ownerName, String parentId, long j11, String shareTime, boolean z10, String type, String updateTime, int i10) {
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        return new ShareFile(createTime, fileId, fileName, fileUrl, j10, ownerName, parentId, j11, shareTime, z10, type, updateTime, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareFile)) {
            return false;
        }
        ShareFile shareFile = (ShareFile) obj;
        return AbstractC9979u.m20289b(this.createTime, shareFile.createTime) && AbstractC9979u.m20289b(this.fileId, shareFile.fileId) && AbstractC9979u.m20289b(this.fileName, shareFile.fileName) && AbstractC9979u.m20289b(this.fileUrl, shareFile.fileUrl) && this.ownerId == shareFile.ownerId && AbstractC9979u.m20289b(this.ownerName, shareFile.ownerName) && AbstractC9979u.m20289b(this.parentId, shareFile.parentId) && this.shareId == shareFile.shareId && AbstractC9979u.m20289b(this.shareTime, shareFile.shareTime) && this.shared == shareFile.shared && AbstractC9979u.m20289b(this.type, shareFile.type) && AbstractC9979u.m20289b(this.updateTime, shareFile.updateTime) && this.version == shareFile.version;
    }

    public final String getCoverFilePath() {
        return shareNotePath() + this.fileId + ".jpg";
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getDirPath() {
        return shareNotePath() + this.fileId;
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

    public final long getLatestTimestamp() {
        return Math.max(TimeUtils.string2Millis(this.updateTime), TimeUtils.string2Millis(this.shareTime));
    }

    public final String getMicroClassCoverUrl() {
        return isMicroClass() ? AbstractC10819z.m23238K(this.fileUrl, ".zip", ".jpg", false, 4, null) : "";
    }

    public final String getOthersPath() {
        String fileExtension = AbstractC9979u.m20289b(this.type, "11") ? "zip" : isOfficeFile() ? "pdf" : FileUtils.getFileExtension(this.fileName);
        return shareNotePath() + this.fileId + Consts.DOT + fileExtension;
    }

    public final long getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getRealOssUrl() {
        return C5962b.f6082a.m5299a().m5277e(this.fileUrl);
    }

    public final long getShareId() {
        return this.shareId;
    }

    public final String getShareTime() {
        return this.shareTime;
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final String getTxtFilePath() {
        return shareNotePath() + this.fileId + ".txt";
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
        return (((((((((((((((((((((((this.createTime.hashCode() * 31) + this.fileId.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + Long.hashCode(this.ownerId)) * 31) + this.ownerName.hashCode()) * 31) + this.parentId.hashCode()) * 31) + Long.hashCode(this.shareId)) * 31) + this.shareTime.hashCode()) * 31) + Boolean.hashCode(this.shared)) * 31) + this.type.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public final boolean isAV() {
        return AbstractC9979u.m20289b(this.type, "9") || AbstractC9979u.m20289b(this.type, "8");
    }

    public final boolean isMicroClass() {
        return AbstractC9979u.m20289b(this.type, "11");
    }

    public final boolean isOfficeFile() {
        return AbstractC9979u.m20289b(this.type, "4") || AbstractC9979u.m20289b(this.type, "3") || AbstractC9979u.m20289b(this.type, "10");
    }

    public final void setOwnerName(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.ownerName = str;
    }

    public final void setShareTime(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.shareTime = str;
    }

    public final String shareNotePath() {
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        return externalAppDataPath + str + "share" + str + userId() + str;
    }

    public String toString() {
        return "ShareFile(createTime=" + this.createTime + ", fileId=" + this.fileId + ", fileName=" + this.fileName + ", fileUrl=" + this.fileUrl + ", ownerId=" + this.ownerId + ", ownerName=" + this.ownerName + ", parentId=" + this.parentId + ", shareId=" + this.shareId + ", shareTime=" + this.shareTime + ", shared=" + this.shared + ", type=" + this.type + ", updateTime=" + this.updateTime + ", version=" + this.version + ")";
    }
}
