package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CatalogInput {
    public static final int $stable = 0;
    private final int courseId;
    private final boolean isLeaf;
    private final int parentId;
    private final String title;

    public CatalogInput(int i10, String title, int i11, boolean z10) {
        AbstractC9133u.m16133g(title, "title");
        this.courseId = i10;
        this.title = title;
        this.parentId = i11;
        this.isLeaf = z10;
    }

    public static /* synthetic */ CatalogInput copy$default(CatalogInput catalogInput, int i10, String str, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = catalogInput.courseId;
        }
        if ((i12 & 2) != 0) {
            str = catalogInput.title;
        }
        if ((i12 & 4) != 0) {
            i11 = catalogInput.parentId;
        }
        if ((i12 & 8) != 0) {
            z10 = catalogInput.isLeaf;
        }
        return catalogInput.copy(i10, str, i11, z10);
    }

    public final int component1() {
        return this.courseId;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.parentId;
    }

    public final boolean component4() {
        return this.isLeaf;
    }

    public final CatalogInput copy(int i10, String title, int i11, boolean z10) {
        AbstractC9133u.m16133g(title, "title");
        return new CatalogInput(i10, title, i11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogInput)) {
            return false;
        }
        CatalogInput catalogInput = (CatalogInput) obj;
        return this.courseId == catalogInput.courseId && AbstractC9133u.m16128b(this.title, catalogInput.title) && this.parentId == catalogInput.parentId && this.isLeaf == catalogInput.isLeaf;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.courseId) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.parentId)) * 31) + Boolean.hashCode(this.isLeaf);
    }

    public final boolean isLeaf() {
        return this.isLeaf;
    }

    public String toString() {
        return "CatalogInput(courseId=" + this.courseId + ", title=" + this.title + ", parentId=" + this.parentId + ", isLeaf=" + this.isLeaf + ")";
    }

    public /* synthetic */ CatalogInput(int i10, String str, int i11, boolean z10, int i12, AbstractC9126n abstractC9126n) {
        this(i10, str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z10);
    }
}
