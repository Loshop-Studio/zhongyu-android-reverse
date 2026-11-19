package com.zykj.student.dialogue.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/SortCatalogReq;", "", "id", "", "sort", "<init>", "(II)V", "getId", "()I", "getSort", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SortCatalogReq {
    public static final int $stable = 0;
    private final int id;
    private final int sort;

    public SortCatalogReq(int i9, int i10) {
        this.id = i9;
        this.sort = i10;
    }

    public static /* synthetic */ SortCatalogReq copy$default(SortCatalogReq sortCatalogReq, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = sortCatalogReq.id;
        }
        if ((i11 & 2) != 0) {
            i10 = sortCatalogReq.sort;
        }
        return sortCatalogReq.copy(i9, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final SortCatalogReq copy(int id, int sort) {
        return new SortCatalogReq(id, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortCatalogReq)) {
            return false;
        }
        SortCatalogReq sortCatalogReq = (SortCatalogReq) other;
        return this.id == sortCatalogReq.id && this.sort == sortCatalogReq.sort;
    }

    public final int getId() {
        return this.id;
    }

    public final int getSort() {
        return this.sort;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "SortCatalogReq(id=" + this.id + ", sort=" + this.sort + ")";
    }
}
