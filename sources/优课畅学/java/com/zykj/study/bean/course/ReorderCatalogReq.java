package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ReorderCatalogReq {
    public static final int $stable = 8;
    private final List<CatalogBean> catalogDtos;
    private final int courseId;

    public ReorderCatalogReq(int i10, List<CatalogBean> catalogDtos) {
        AbstractC9133u.m16133g(catalogDtos, "catalogDtos");
        this.courseId = i10;
        this.catalogDtos = catalogDtos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReorderCatalogReq copy$default(ReorderCatalogReq reorderCatalogReq, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = reorderCatalogReq.courseId;
        }
        if ((i11 & 2) != 0) {
            list = reorderCatalogReq.catalogDtos;
        }
        return reorderCatalogReq.copy(i10, list);
    }

    public final int component1() {
        return this.courseId;
    }

    public final List<CatalogBean> component2() {
        return this.catalogDtos;
    }

    public final ReorderCatalogReq copy(int i10, List<CatalogBean> catalogDtos) {
        AbstractC9133u.m16133g(catalogDtos, "catalogDtos");
        return new ReorderCatalogReq(i10, catalogDtos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReorderCatalogReq)) {
            return false;
        }
        ReorderCatalogReq reorderCatalogReq = (ReorderCatalogReq) obj;
        return this.courseId == reorderCatalogReq.courseId && AbstractC9133u.m16128b(this.catalogDtos, reorderCatalogReq.catalogDtos);
    }

    public final List<CatalogBean> getCatalogDtos() {
        return this.catalogDtos;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.courseId) * 31) + this.catalogDtos.hashCode();
    }

    public String toString() {
        return "ReorderCatalogReq(courseId=" + this.courseId + ", catalogDtos=" + this.catalogDtos + ")";
    }
}
