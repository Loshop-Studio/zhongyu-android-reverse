package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class RestoreResponse {
    public static final int $stable = 0;
    private final long expirationTimeStamp;
    private final String fileId;
    private final boolean isRecycleBin;
    private final String parentId;
    private final String updateTime;
    private final int version;

    public RestoreResponse(String parentId, String fileId, boolean z10, long j10, String updateTime, int i10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        this.parentId = parentId;
        this.fileId = fileId;
        this.isRecycleBin = z10;
        this.expirationTimeStamp = j10;
        this.updateTime = updateTime;
        this.version = i10;
    }

    public static /* synthetic */ RestoreResponse copy$default(RestoreResponse restoreResponse, String str, String str2, boolean z10, long j10, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = restoreResponse.parentId;
        }
        if ((i11 & 2) != 0) {
            str2 = restoreResponse.fileId;
        }
        if ((i11 & 4) != 0) {
            z10 = restoreResponse.isRecycleBin;
        }
        if ((i11 & 8) != 0) {
            j10 = restoreResponse.expirationTimeStamp;
        }
        if ((i11 & 16) != 0) {
            str3 = restoreResponse.updateTime;
        }
        if ((i11 & 32) != 0) {
            i10 = restoreResponse.version;
        }
        long j11 = j10;
        boolean z11 = z10;
        return restoreResponse.copy(str, str2, z11, j11, str3, i10);
    }

    public final String component1() {
        return this.parentId;
    }

    public final String component2() {
        return this.fileId;
    }

    public final boolean component3() {
        return this.isRecycleBin;
    }

    public final long component4() {
        return this.expirationTimeStamp;
    }

    public final String component5() {
        return this.updateTime;
    }

    public final int component6() {
        return this.version;
    }

    public final RestoreResponse copy(String parentId, String fileId, boolean z10, long j10, String updateTime, int i10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        return new RestoreResponse(parentId, fileId, z10, j10, updateTime, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestoreResponse)) {
            return false;
        }
        RestoreResponse restoreResponse = (RestoreResponse) obj;
        return AbstractC9979u.m20289b(this.parentId, restoreResponse.parentId) && AbstractC9979u.m20289b(this.fileId, restoreResponse.fileId) && this.isRecycleBin == restoreResponse.isRecycleBin && this.expirationTimeStamp == restoreResponse.expirationTimeStamp && AbstractC9979u.m20289b(this.updateTime, restoreResponse.updateTime) && this.version == restoreResponse.version;
    }

    public final long getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((this.parentId.hashCode() * 31) + this.fileId.hashCode()) * 31) + Boolean.hashCode(this.isRecycleBin)) * 31) + Long.hashCode(this.expirationTimeStamp)) * 31) + this.updateTime.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public final boolean isRecycleBin() {
        return this.isRecycleBin;
    }

    public String toString() {
        return "RestoreResponse(parentId=" + this.parentId + ", fileId=" + this.fileId + ", isRecycleBin=" + this.isRecycleBin + ", expirationTimeStamp=" + this.expirationTimeStamp + ", updateTime=" + this.updateTime + ", version=" + this.version + ")";
    }
}
