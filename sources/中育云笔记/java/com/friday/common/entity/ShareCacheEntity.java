package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Entity
/* loaded from: classes3.dex */
public final class ShareCacheEntity {
    public static final int $stable = 0;
    private final long accountId;

    @PrimaryKey(autoGenerate = false)
    private final String cacheId;
    private final String fileId;
    private final long previewTime;
    private final int version;

    public ShareCacheEntity(String cacheId, String fileId, int i10, long j10, long j11) {
        AbstractC9979u.m20294g(cacheId, "cacheId");
        AbstractC9979u.m20294g(fileId, "fileId");
        this.cacheId = cacheId;
        this.fileId = fileId;
        this.version = i10;
        this.accountId = j10;
        this.previewTime = j11;
    }

    public static /* synthetic */ ShareCacheEntity copy$default(ShareCacheEntity shareCacheEntity, String str, String str2, int i10, long j10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareCacheEntity.cacheId;
        }
        if ((i11 & 2) != 0) {
            str2 = shareCacheEntity.fileId;
        }
        if ((i11 & 4) != 0) {
            i10 = shareCacheEntity.version;
        }
        if ((i11 & 8) != 0) {
            j10 = shareCacheEntity.accountId;
        }
        if ((i11 & 16) != 0) {
            j11 = shareCacheEntity.previewTime;
        }
        long j12 = j11;
        int i12 = i10;
        return shareCacheEntity.copy(str, str2, i12, j10, j12);
    }

    public final String component1() {
        return this.cacheId;
    }

    public final String component2() {
        return this.fileId;
    }

    public final int component3() {
        return this.version;
    }

    public final long component4() {
        return this.accountId;
    }

    public final long component5() {
        return this.previewTime;
    }

    public final ShareCacheEntity copy(String cacheId, String fileId, int i10, long j10, long j11) {
        AbstractC9979u.m20294g(cacheId, "cacheId");
        AbstractC9979u.m20294g(fileId, "fileId");
        return new ShareCacheEntity(cacheId, fileId, i10, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareCacheEntity)) {
            return false;
        }
        ShareCacheEntity shareCacheEntity = (ShareCacheEntity) obj;
        return AbstractC9979u.m20289b(this.cacheId, shareCacheEntity.cacheId) && AbstractC9979u.m20289b(this.fileId, shareCacheEntity.fileId) && this.version == shareCacheEntity.version && this.accountId == shareCacheEntity.accountId && this.previewTime == shareCacheEntity.previewTime;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final String getCacheId() {
        return this.cacheId;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final long getPreviewTime() {
        return this.previewTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((this.cacheId.hashCode() * 31) + this.fileId.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Long.hashCode(this.accountId)) * 31) + Long.hashCode(this.previewTime);
    }

    public String toString() {
        return "ShareCacheEntity(cacheId=" + this.cacheId + ", fileId=" + this.fileId + ", version=" + this.version + ", accountId=" + this.accountId + ", previewTime=" + this.previewTime + ")";
    }
}
