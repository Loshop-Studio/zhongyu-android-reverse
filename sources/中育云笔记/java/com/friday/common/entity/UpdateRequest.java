package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class UpdateRequest {
    public static final int $stable = 0;
    private final String fileId;
    private final String fileName;
    private final String fileUrl;
    private final String parentId;
    private final String type;

    public UpdateRequest(String fileId, String fileName, String fileUrl, String parentId, String type) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(type, "type");
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.parentId = parentId;
        this.type = type;
    }

    public static /* synthetic */ UpdateRequest copy$default(UpdateRequest updateRequest, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateRequest.fileId;
        }
        if ((i10 & 2) != 0) {
            str2 = updateRequest.fileName;
        }
        if ((i10 & 4) != 0) {
            str3 = updateRequest.fileUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = updateRequest.parentId;
        }
        if ((i10 & 16) != 0) {
            str5 = updateRequest.type;
        }
        String str6 = str5;
        String str7 = str3;
        return updateRequest.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.fileId;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final String component4() {
        return this.parentId;
    }

    public final String component5() {
        return this.type;
    }

    public final UpdateRequest copy(String fileId, String fileName, String fileUrl, String parentId, String type) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(type, "type");
        return new UpdateRequest(fileId, fileName, fileUrl, parentId, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateRequest)) {
            return false;
        }
        UpdateRequest updateRequest = (UpdateRequest) obj;
        return AbstractC9979u.m20289b(this.fileId, updateRequest.fileId) && AbstractC9979u.m20289b(this.fileName, updateRequest.fileName) && AbstractC9979u.m20289b(this.fileUrl, updateRequest.fileUrl) && AbstractC9979u.m20289b(this.parentId, updateRequest.parentId) && AbstractC9979u.m20289b(this.type, updateRequest.type);
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

    public final String getParentId() {
        return this.parentId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.fileId.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.parentId.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "UpdateRequest(fileId=" + this.fileId + ", fileName=" + this.fileName + ", fileUrl=" + this.fileUrl + ", parentId=" + this.parentId + ", type=" + this.type + ")";
    }
}
