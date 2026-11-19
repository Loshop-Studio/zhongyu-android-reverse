package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
@Entity
/* loaded from: classes3.dex */
public final class PdfEntity {
    public static final int $stable = 0;
    private final int currentPage;

    /* renamed from: id */
    @PrimaryKey
    private final String f11021id;
    private final int pageCount;

    public PdfEntity(String id, int i10, int i11) {
        AbstractC9133u.m16133g(id, "id");
        this.f11021id = id;
        this.currentPage = i10;
        this.pageCount = i11;
    }

    public static /* synthetic */ PdfEntity copy$default(PdfEntity pdfEntity, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = pdfEntity.f11021id;
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
        return this.f11021id;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final int component3() {
        return this.pageCount;
    }

    public final PdfEntity copy(String id, int i10, int i11) {
        AbstractC9133u.m16133g(id, "id");
        return new PdfEntity(id, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdfEntity)) {
            return false;
        }
        PdfEntity pdfEntity = (PdfEntity) obj;
        return AbstractC9133u.m16128b(this.f11021id, pdfEntity.f11021id) && this.currentPage == pdfEntity.currentPage && this.pageCount == pdfEntity.pageCount;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getId() {
        return this.f11021id;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public int hashCode() {
        return (((this.f11021id.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageCount);
    }

    public String toString() {
        return "PdfEntity(id=" + this.f11021id + ", currentPage=" + this.currentPage + ", pageCount=" + this.pageCount + ")";
    }
}
