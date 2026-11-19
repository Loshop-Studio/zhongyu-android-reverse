package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ShareIntentEntity {
    public static final int $stable = 0;
    private final String fileName;
    private final String fileType;
    private final long originalUserId;
    private final String originalUserName;
    private final long shareId;

    public ShareIntentEntity(long j10, String fileType, String fileName, String originalUserName, long j11) {
        AbstractC9979u.m20294g(fileType, "fileType");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(originalUserName, "originalUserName");
        this.shareId = j10;
        this.fileType = fileType;
        this.fileName = fileName;
        this.originalUserName = originalUserName;
        this.originalUserId = j11;
    }

    public static /* synthetic */ ShareIntentEntity copy$default(ShareIntentEntity shareIntentEntity, long j10, String str, String str2, String str3, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = shareIntentEntity.shareId;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = shareIntentEntity.fileType;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = shareIntentEntity.fileName;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = shareIntentEntity.originalUserName;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            j11 = shareIntentEntity.originalUserId;
        }
        return shareIntentEntity.copy(j12, str4, str5, str6, j11);
    }

    public final long component1() {
        return this.shareId;
    }

    public final String component2() {
        return this.fileType;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.originalUserName;
    }

    public final long component5() {
        return this.originalUserId;
    }

    public final ShareIntentEntity copy(long j10, String fileType, String fileName, String originalUserName, long j11) {
        AbstractC9979u.m20294g(fileType, "fileType");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(originalUserName, "originalUserName");
        return new ShareIntentEntity(j10, fileType, fileName, originalUserName, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareIntentEntity)) {
            return false;
        }
        ShareIntentEntity shareIntentEntity = (ShareIntentEntity) obj;
        return this.shareId == shareIntentEntity.shareId && AbstractC9979u.m20289b(this.fileType, shareIntentEntity.fileType) && AbstractC9979u.m20289b(this.fileName, shareIntentEntity.fileName) && AbstractC9979u.m20289b(this.originalUserName, shareIntentEntity.originalUserName) && this.originalUserId == shareIntentEntity.originalUserId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final long getOriginalUserId() {
        return this.originalUserId;
    }

    public final String getOriginalUserName() {
        return this.originalUserName;
    }

    public final long getShareId() {
        return this.shareId;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.shareId) * 31) + this.fileType.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.originalUserName.hashCode()) * 31) + Long.hashCode(this.originalUserId);
    }

    public String toString() {
        return "ShareIntentEntity(shareId=" + this.shareId + ", fileType=" + this.fileType + ", fileName=" + this.fileName + ", originalUserName=" + this.originalUserName + ", originalUserId=" + this.originalUserId + ")";
    }
}
