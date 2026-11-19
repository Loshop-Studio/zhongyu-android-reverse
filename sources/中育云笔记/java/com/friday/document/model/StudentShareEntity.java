package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class StudentShareEntity {
    public static final int $stable = 8;
    private final List<ShareFile> shareFileList;
    private final int totalCount;

    public StudentShareEntity(List<ShareFile> shareFileList, int i10) {
        AbstractC9979u.m20294g(shareFileList, "shareFileList");
        this.shareFileList = shareFileList;
        this.totalCount = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StudentShareEntity copy$default(StudentShareEntity studentShareEntity, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = studentShareEntity.shareFileList;
        }
        if ((i11 & 2) != 0) {
            i10 = studentShareEntity.totalCount;
        }
        return studentShareEntity.copy(list, i10);
    }

    public final List<ShareFile> component1() {
        return this.shareFileList;
    }

    public final int component2() {
        return this.totalCount;
    }

    public final StudentShareEntity copy(List<ShareFile> shareFileList, int i10) {
        AbstractC9979u.m20294g(shareFileList, "shareFileList");
        return new StudentShareEntity(shareFileList, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudentShareEntity)) {
            return false;
        }
        StudentShareEntity studentShareEntity = (StudentShareEntity) obj;
        return AbstractC9979u.m20289b(this.shareFileList, studentShareEntity.shareFileList) && this.totalCount == studentShareEntity.totalCount;
    }

    public final List<ShareFile> getShareFileList() {
        return this.shareFileList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (this.shareFileList.hashCode() * 31) + Integer.hashCode(this.totalCount);
    }

    public String toString() {
        return "StudentShareEntity(shareFileList=" + this.shareFileList + ", totalCount=" + this.totalCount + ")";
    }
}
