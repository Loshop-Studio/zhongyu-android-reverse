package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AddShareTableRequest {
    public static final int $stable = 0;
    private final String fileId;
    private final String fileName;
    private final int type;
    private final String userName;

    public AddShareTableRequest(String fileId, String fileName, int i10, String userName) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(userName, "userName");
        this.fileId = fileId;
        this.fileName = fileName;
        this.type = i10;
        this.userName = userName;
    }

    public static /* synthetic */ AddShareTableRequest copy$default(AddShareTableRequest addShareTableRequest, String str, String str2, int i10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addShareTableRequest.fileId;
        }
        if ((i11 & 2) != 0) {
            str2 = addShareTableRequest.fileName;
        }
        if ((i11 & 4) != 0) {
            i10 = addShareTableRequest.type;
        }
        if ((i11 & 8) != 0) {
            str3 = addShareTableRequest.userName;
        }
        return addShareTableRequest.copy(str, str2, i10, str3);
    }

    public final String component1() {
        return this.fileId;
    }

    public final String component2() {
        return this.fileName;
    }

    public final int component3() {
        return this.type;
    }

    public final String component4() {
        return this.userName;
    }

    public final AddShareTableRequest copy(String fileId, String fileName, int i10, String userName) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(userName, "userName");
        return new AddShareTableRequest(fileId, fileName, i10, userName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddShareTableRequest)) {
            return false;
        }
        AddShareTableRequest addShareTableRequest = (AddShareTableRequest) obj;
        return AbstractC9979u.m20289b(this.fileId, addShareTableRequest.fileId) && AbstractC9979u.m20289b(this.fileName, addShareTableRequest.fileName) && this.type == addShareTableRequest.type && AbstractC9979u.m20289b(this.userName, addShareTableRequest.userName);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((this.fileId.hashCode() * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.userName.hashCode();
    }

    public String toString() {
        return "AddShareTableRequest(fileId=" + this.fileId + ", fileName=" + this.fileName + ", type=" + this.type + ", userName=" + this.userName + ")";
    }
}
