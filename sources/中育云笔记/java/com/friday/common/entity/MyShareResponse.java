package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MyShareResponse {
    public static final int $stable = 8;
    private String fileId;
    private long shareId;

    public MyShareResponse(String fileId, long j10) {
        AbstractC9979u.m20294g(fileId, "fileId");
        this.fileId = fileId;
        this.shareId = j10;
    }

    public static /* synthetic */ MyShareResponse copy$default(MyShareResponse myShareResponse, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = myShareResponse.fileId;
        }
        if ((i10 & 2) != 0) {
            j10 = myShareResponse.shareId;
        }
        return myShareResponse.copy(str, j10);
    }

    public final String component1() {
        return this.fileId;
    }

    public final long component2() {
        return this.shareId;
    }

    public final MyShareResponse copy(String fileId, long j10) {
        AbstractC9979u.m20294g(fileId, "fileId");
        return new MyShareResponse(fileId, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyShareResponse)) {
            return false;
        }
        MyShareResponse myShareResponse = (MyShareResponse) obj;
        return AbstractC9979u.m20289b(this.fileId, myShareResponse.fileId) && this.shareId == myShareResponse.shareId;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final long getShareId() {
        return this.shareId;
    }

    public int hashCode() {
        return (this.fileId.hashCode() * 31) + Long.hashCode(this.shareId);
    }

    public final void setFileId(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.fileId = str;
    }

    public final void setShareId(long j10) {
        this.shareId = j10;
    }

    public String toString() {
        return "MyShareResponse(fileId=" + this.fileId + ", shareId=" + this.shareId + ")";
    }
}
