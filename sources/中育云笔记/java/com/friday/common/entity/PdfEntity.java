package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Entity
/* loaded from: classes3.dex */
public final class PdfEntity {
    public static final int $stable = 0;
    private final int currentPage;

    /* renamed from: id */
    @PrimaryKey
    private final String f6032id;
    private final int pageCount;

    public PdfEntity(String id2, int i10, int i11) {
        AbstractC9979u.m20294g(id2, "id");
        this.f6032id = id2;
        this.currentPage = i10;
        this.pageCount = i11;
    }

    public static /* synthetic */ PdfEntity copy$default(PdfEntity pdfEntity, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = pdfEntity.f6032id;
        }
        if ((i12 & 2) != 0) {
            i10 = pdfEntity.currentPage;
        }
        if ((i12 & 4) != 0) {
            i11 = pdfEntity.pageCount;
        }
        return pdfEntity.copy(str, i10, i11);
    }

    public final String component1() {
        return this.f6032id;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final int component3() {
        return this.pageCount;
    }

    public final PdfEntity copy(String id2, int i10, int i11) {
        AbstractC9979u.m20294g(id2, "id");
        return new PdfEntity(id2, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdfEntity)) {
            return false;
        }
        PdfEntity pdfEntity = (PdfEntity) obj;
        return AbstractC9979u.m20289b(this.f6032id, pdfEntity.f6032id) && this.currentPage == pdfEntity.currentPage && this.pageCount == pdfEntity.pageCount;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getId() {
        return this.f6032id;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public int hashCode() {
        return (((this.f6032id.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageCount);
    }

    public String toString() {
        return "PdfEntity(id=" + this.f6032id + ", currentPage=" + this.currentPage + ", pageCount=" + this.pageCount + ")";
    }
}
