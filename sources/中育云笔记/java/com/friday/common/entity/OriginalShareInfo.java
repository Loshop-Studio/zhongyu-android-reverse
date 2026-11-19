package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class OriginalShareInfo {
    public static final int $stable = 8;
    private final List<OriginalShareInfoChild> shareFileList;
    private final int totalCount;

    public OriginalShareInfo(int i10, List<OriginalShareInfoChild> shareFileList) {
        AbstractC9979u.m20294g(shareFileList, "shareFileList");
        this.totalCount = i10;
        this.shareFileList = shareFileList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OriginalShareInfo copy$default(OriginalShareInfo originalShareInfo, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = originalShareInfo.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = originalShareInfo.shareFileList;
        }
        return originalShareInfo.copy(i10, list);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<OriginalShareInfoChild> component2() {
        return this.shareFileList;
    }

    public final OriginalShareInfo copy(int i10, List<OriginalShareInfoChild> shareFileList) {
        AbstractC9979u.m20294g(shareFileList, "shareFileList");
        return new OriginalShareInfo(i10, shareFileList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalShareInfo)) {
            return false;
        }
        OriginalShareInfo originalShareInfo = (OriginalShareInfo) obj;
        return this.totalCount == originalShareInfo.totalCount && AbstractC9979u.m20289b(this.shareFileList, originalShareInfo.shareFileList);
    }

    public final List<OriginalShareInfoChild> getShareFileList() {
        return this.shareFileList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.totalCount) * 31) + this.shareFileList.hashCode();
    }

    public String toString() {
        return "OriginalShareInfo(totalCount=" + this.totalCount + ", shareFileList=" + this.shareFileList + ")";
    }
}
