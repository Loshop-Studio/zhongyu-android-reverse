package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class RestoreReq {
    public static final int $stable = 0;
    private final String fileId;
    private final String parentId;

    public RestoreReq(String parentId, String fileId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        this.parentId = parentId;
        this.fileId = fileId;
    }

    public static /* synthetic */ RestoreReq copy$default(RestoreReq restoreReq, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = restoreReq.parentId;
        }
        if ((i10 & 2) != 0) {
            str2 = restoreReq.fileId;
        }
        return restoreReq.copy(str, str2);
    }

    public final String component1() {
        return this.parentId;
    }

    public final String component2() {
        return this.fileId;
    }

    public final RestoreReq copy(String parentId, String fileId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        return new RestoreReq(parentId, fileId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestoreReq)) {
            return false;
        }
        RestoreReq restoreReq = (RestoreReq) obj;
        return AbstractC9979u.m20289b(this.parentId, restoreReq.parentId) && AbstractC9979u.m20289b(this.fileId, restoreReq.fileId);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        return (this.parentId.hashCode() * 31) + this.fileId.hashCode();
    }

    public String toString() {
        return "RestoreReq(parentId=" + this.parentId + ", fileId=" + this.fileId + ")";
    }
}
