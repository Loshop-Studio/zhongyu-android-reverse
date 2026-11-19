package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class UpdateSpecifiedItem {
    public static final int $stable = 0;
    private final String fileId;
    private final FromPage fromPage;

    public UpdateSpecifiedItem(String fileId, FromPage fromPage) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fromPage, "fromPage");
        this.fileId = fileId;
        this.fromPage = fromPage;
    }

    public static /* synthetic */ UpdateSpecifiedItem copy$default(UpdateSpecifiedItem updateSpecifiedItem, String str, FromPage fromPage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateSpecifiedItem.fileId;
        }
        if ((i10 & 2) != 0) {
            fromPage = updateSpecifiedItem.fromPage;
        }
        return updateSpecifiedItem.copy(str, fromPage);
    }

    public final String component1() {
        return this.fileId;
    }

    public final FromPage component2() {
        return this.fromPage;
    }

    public final UpdateSpecifiedItem copy(String fileId, FromPage fromPage) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fromPage, "fromPage");
        return new UpdateSpecifiedItem(fileId, fromPage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateSpecifiedItem)) {
            return false;
        }
        UpdateSpecifiedItem updateSpecifiedItem = (UpdateSpecifiedItem) obj;
        return AbstractC9979u.m20289b(this.fileId, updateSpecifiedItem.fileId) && this.fromPage == updateSpecifiedItem.fromPage;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final FromPage getFromPage() {
        return this.fromPage;
    }

    public int hashCode() {
        return (this.fileId.hashCode() * 31) + this.fromPage.hashCode();
    }

    public String toString() {
        return "UpdateSpecifiedItem(fileId=" + this.fileId + ", fromPage=" + this.fromPage + ")";
    }
}
