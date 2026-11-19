package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
@Entity(tableName = "catalog")
/* loaded from: classes3.dex */
public final class CatalogEntity {
    public static final int $stable = 0;
    private final int courseId;

    /* renamed from: id */
    @PrimaryKey
    private final int f11017id;
    private final boolean isLeaf;
    private final int parentId;
    private final int progress;
    private final String title;

    public CatalogEntity(int i10, int i11, String title, boolean z10, int i12, int i13) {
        AbstractC9133u.m16133g(title, "title");
        this.f11017id = i10;
        this.courseId = i11;
        this.title = title;
        this.isLeaf = z10;
        this.progress = i12;
        this.parentId = i13;
    }

    public static /* synthetic */ CatalogEntity copy$default(CatalogEntity catalogEntity, int i10, int i11, String str, boolean z10, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = catalogEntity.f11017id;
        }
        if ((i14 & 2) != 0) {
            i11 = catalogEntity.courseId;
        }
        if ((i14 & 4) != 0) {
            str = catalogEntity.title;
        }
        if ((i14 & 8) != 0) {
            z10 = catalogEntity.isLeaf;
        }
        if ((i14 & 16) != 0) {
            i12 = catalogEntity.progress;
        }
        if ((i14 & 32) != 0) {
            i13 = catalogEntity.parentId;
        }
        int i15 = i12;
        int i16 = i13;
        return catalogEntity.copy(i10, i11, str, z10, i15, i16);
    }

    public final int component1() {
        return this.f11017id;
    }

    public final int component2() {
        return this.courseId;
    }

    public final String component3() {
        return this.title;
    }

    public final boolean component4() {
        return this.isLeaf;
    }

    public final int component5() {
        return this.progress;
    }

    public final int component6() {
        return this.parentId;
    }

    public final CatalogEntity copy(int i10, int i11, String title, boolean z10, int i12, int i13) {
        AbstractC9133u.m16133g(title, "title");
        return new CatalogEntity(i10, i11, title, z10, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogEntity)) {
            return false;
        }
        CatalogEntity catalogEntity = (CatalogEntity) obj;
        return this.f11017id == catalogEntity.f11017id && this.courseId == catalogEntity.courseId && AbstractC9133u.m16128b(this.title, catalogEntity.title) && this.isLeaf == catalogEntity.isLeaf && this.progress == catalogEntity.progress && this.parentId == catalogEntity.parentId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getId() {
        return this.f11017id;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f11017id) * 31) + Integer.hashCode(this.courseId)) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isLeaf)) * 31) + Integer.hashCode(this.progress)) * 31) + Integer.hashCode(this.parentId);
    }

    public final boolean isLeaf() {
        return this.isLeaf;
    }

    public String toString() {
        return "CatalogEntity(id=" + this.f11017id + ", courseId=" + this.courseId + ", title=" + this.title + ", isLeaf=" + this.isLeaf + ", progress=" + this.progress + ", parentId=" + this.parentId + ")";
    }

    public /* synthetic */ CatalogEntity(int i10, int i11, String str, boolean z10, int i12, int i13, int i14, AbstractC9126n abstractC9126n) {
        this(i10, i11, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? false : z10, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? 0 : i13);
    }
}
