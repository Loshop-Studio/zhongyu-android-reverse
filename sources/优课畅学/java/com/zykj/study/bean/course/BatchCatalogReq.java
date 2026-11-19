package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BatchCatalogReq {
    public static final int $stable = 8;
    private final List<Long> catalogIds;
    private final long courseId;

    public BatchCatalogReq(long j10, List<Long> catalogIds) {
        AbstractC9133u.m16133g(catalogIds, "catalogIds");
        this.courseId = j10;
        this.catalogIds = catalogIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchCatalogReq copy$default(BatchCatalogReq batchCatalogReq, long j10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = batchCatalogReq.courseId;
        }
        if ((i10 & 2) != 0) {
            list = batchCatalogReq.catalogIds;
        }
        return batchCatalogReq.copy(j10, list);
    }

    public final long component1() {
        return this.courseId;
    }

    public final List<Long> component2() {
        return this.catalogIds;
    }

    public final BatchCatalogReq copy(long j10, List<Long> catalogIds) {
        AbstractC9133u.m16133g(catalogIds, "catalogIds");
        return new BatchCatalogReq(j10, catalogIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchCatalogReq)) {
            return false;
        }
        BatchCatalogReq batchCatalogReq = (BatchCatalogReq) obj;
        return this.courseId == batchCatalogReq.courseId && AbstractC9133u.m16128b(this.catalogIds, batchCatalogReq.catalogIds);
    }

    public final List<Long> getCatalogIds() {
        return this.catalogIds;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public int hashCode() {
        return (Long.hashCode(this.courseId) * 31) + this.catalogIds.hashCode();
    }

    public String toString() {
        return "BatchCatalogReq(courseId=" + this.courseId + ", catalogIds=" + this.catalogIds + ")";
    }
}
