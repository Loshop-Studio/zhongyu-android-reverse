package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.entity.FileEntity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class FolderLevelEntity {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fileId;
    private final String fileName;
    private final long ownerId;
    private final String ownerName;
    private final String parentId;
    private final String shareTime;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final FolderLevelEntity map2Me(FileEntity fileEntity) {
            AbstractC9979u.m20294g(fileEntity, "fileEntity");
            return new FolderLevelEntity(fileEntity.getParentId(), fileEntity.getFileId(), fileEntity.getFileName(), null, null, 0L, 56, null);
        }

        private Companion() {
        }

        public final FolderLevelEntity map2Me(ShareFile shareFile) {
            AbstractC9979u.m20294g(shareFile, "shareFile");
            return new FolderLevelEntity(shareFile.getParentId(), shareFile.getFileId(), shareFile.getFileName(), shareFile.getOwnerName(), shareFile.getShareTime(), shareFile.getOwnerId());
        }
    }

    public FolderLevelEntity(String parentId, String fileId, String fileName, String ownerName, String shareTime, long j10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        this.parentId = parentId;
        this.fileId = fileId;
        this.fileName = fileName;
        this.ownerName = ownerName;
        this.shareTime = shareTime;
        this.ownerId = j10;
    }

    public static /* synthetic */ FolderLevelEntity copy$default(FolderLevelEntity folderLevelEntity, String str, String str2, String str3, String str4, String str5, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = folderLevelEntity.parentId;
        }
        if ((i10 & 2) != 0) {
            str2 = folderLevelEntity.fileId;
        }
        if ((i10 & 4) != 0) {
            str3 = folderLevelEntity.fileName;
        }
        if ((i10 & 8) != 0) {
            str4 = folderLevelEntity.ownerName;
        }
        if ((i10 & 16) != 0) {
            str5 = folderLevelEntity.shareTime;
        }
        if ((i10 & 32) != 0) {
            j10 = folderLevelEntity.ownerId;
        }
        long j11 = j10;
        String str6 = str5;
        String str7 = str3;
        return folderLevelEntity.copy(str, str2, str7, str4, str6, j11);
    }

    public final String component1() {
        return this.parentId;
    }

    public final String component2() {
        return this.fileId;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.ownerName;
    }

    public final String component5() {
        return this.shareTime;
    }

    public final long component6() {
        return this.ownerId;
    }

    public final FolderLevelEntity copy(String parentId, String fileId, String fileName, String ownerName, String shareTime, long j10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        return new FolderLevelEntity(parentId, fileId, fileName, ownerName, shareTime, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FolderLevelEntity)) {
            return false;
        }
        FolderLevelEntity folderLevelEntity = (FolderLevelEntity) obj;
        return AbstractC9979u.m20289b(this.parentId, folderLevelEntity.parentId) && AbstractC9979u.m20289b(this.fileId, folderLevelEntity.fileId) && AbstractC9979u.m20289b(this.fileName, folderLevelEntity.fileName) && AbstractC9979u.m20289b(this.ownerName, folderLevelEntity.ownerName) && AbstractC9979u.m20289b(this.shareTime, folderLevelEntity.shareTime) && this.ownerId == folderLevelEntity.ownerId;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
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

    public final String getShareTime() {
        return this.shareTime;
    }

    public int hashCode() {
        return (((((((((this.parentId.hashCode() * 31) + this.fileId.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.ownerName.hashCode()) * 31) + this.shareTime.hashCode()) * 31) + Long.hashCode(this.ownerId);
    }

    public String toString() {
        return "FolderLevelEntity(parentId=" + this.parentId + ", fileId=" + this.fileId + ", fileName=" + this.fileName + ", ownerName=" + this.ownerName + ", shareTime=" + this.shareTime + ", ownerId=" + this.ownerId + ")";
    }

    public /* synthetic */ FolderLevelEntity(String str, String str2, String str3, String str4, String str5, long j10, int i10, AbstractC9972n abstractC9972n) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? 0L : j10);
    }
}
