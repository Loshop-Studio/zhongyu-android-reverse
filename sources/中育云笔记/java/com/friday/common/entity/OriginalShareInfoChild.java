package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class OriginalShareInfoChild {
    public static final int $stable = 0;
    private final String createTime;
    private final String fileId;
    private final String fileName;
    private final String fileUrl;
    private final long ownerId;
    private final String ownerName;
    private final String parentId;
    private final long shareId;
    private final String shareTime;
    private final int type;
    private final String updateTime;
    private final int version;

    public OriginalShareInfoChild(String createTime, String fileName, String updateTime, String fileUrl, String parentId, long j10, String ownerName, String shareTime, int i10, int i11, String fileId, long j11) {
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        AbstractC9979u.m20294g(fileId, "fileId");
        this.createTime = createTime;
        this.fileName = fileName;
        this.updateTime = updateTime;
        this.fileUrl = fileUrl;
        this.parentId = parentId;
        this.shareId = j10;
        this.ownerName = ownerName;
        this.shareTime = shareTime;
        this.type = i10;
        this.version = i11;
        this.fileId = fileId;
        this.ownerId = j11;
    }

    public final String component1() {
        return this.createTime;
    }

    public final int component10() {
        return this.version;
    }

    public final String component11() {
        return this.fileId;
    }

    public final long component12() {
        return this.ownerId;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.updateTime;
    }

    public final String component4() {
        return this.fileUrl;
    }

    public final String component5() {
        return this.parentId;
    }

    public final long component6() {
        return this.shareId;
    }

    public final String component7() {
        return this.ownerName;
    }

    public final String component8() {
        return this.shareTime;
    }

    public final int component9() {
        return this.type;
    }

    public final OriginalShareInfoChild copy(String createTime, String fileName, String updateTime, String fileUrl, String parentId, long j10, String ownerName, String shareTime, int i10, int i11, String fileId, long j11) {
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        AbstractC9979u.m20294g(fileId, "fileId");
        return new OriginalShareInfoChild(createTime, fileName, updateTime, fileUrl, parentId, j10, ownerName, shareTime, i10, i11, fileId, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalShareInfoChild)) {
            return false;
        }
        OriginalShareInfoChild originalShareInfoChild = (OriginalShareInfoChild) obj;
        return AbstractC9979u.m20289b(this.createTime, originalShareInfoChild.createTime) && AbstractC9979u.m20289b(this.fileName, originalShareInfoChild.fileName) && AbstractC9979u.m20289b(this.updateTime, originalShareInfoChild.updateTime) && AbstractC9979u.m20289b(this.fileUrl, originalShareInfoChild.fileUrl) && AbstractC9979u.m20289b(this.parentId, originalShareInfoChild.parentId) && this.shareId == originalShareInfoChild.shareId && AbstractC9979u.m20289b(this.ownerName, originalShareInfoChild.ownerName) && AbstractC9979u.m20289b(this.shareTime, originalShareInfoChild.shareTime) && this.type == originalShareInfoChild.type && this.version == originalShareInfoChild.version && AbstractC9979u.m20289b(this.fileId, originalShareInfoChild.fileId) && this.ownerId == originalShareInfoChild.ownerId;
    }

    public final String getCreateTime() {
        return this.createTime;
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

    public final long getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final long getShareId() {
        return this.shareId;
    }

    public final String getShareTime() {
        return this.shareTime;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.createTime.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.parentId.hashCode()) * 31) + Long.hashCode(this.shareId)) * 31) + this.ownerName.hashCode()) * 31) + this.shareTime.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.version)) * 31) + this.fileId.hashCode()) * 31) + Long.hashCode(this.ownerId);
    }

    public String toString() {
        return "OriginalShareInfoChild(createTime=" + this.createTime + ", fileName=" + this.fileName + ", updateTime=" + this.updateTime + ", fileUrl=" + this.fileUrl + ", parentId=" + this.parentId + ", shareId=" + this.shareId + ", ownerName=" + this.ownerName + ", shareTime=" + this.shareTime + ", type=" + this.type + ", version=" + this.version + ", fileId=" + this.fileId + ", ownerId=" + this.ownerId + ")";
    }
}
