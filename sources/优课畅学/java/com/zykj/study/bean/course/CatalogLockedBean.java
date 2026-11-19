package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogLockedBean {
    public static final int $stable = 8;
    private final List<CatalogLockedBean> children;

    /* renamed from: id */
    private final long f11000id;
    private final boolean isLeaf;
    private final int locked;
    private final String title;

    public CatalogLockedBean(long j10, String title, boolean z10, int i10, List<CatalogLockedBean> list) {
        AbstractC9133u.m16133g(title, "title");
        this.f11000id = j10;
        this.title = title;
        this.isLeaf = z10;
        this.locked = i10;
        this.children = list;
    }

    public static /* synthetic */ CatalogLockedBean copy$default(CatalogLockedBean catalogLockedBean, long j10, String str, boolean z10, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = catalogLockedBean.f11000id;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = catalogLockedBean.title;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z10 = catalogLockedBean.isLeaf;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            i10 = catalogLockedBean.locked;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            list = catalogLockedBean.children;
        }
        return catalogLockedBean.copy(j11, str2, z11, i12, list);
    }

    public final long component1() {
        return this.f11000id;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isLeaf;
    }

    public final int component4() {
        return this.locked;
    }

    public final List<CatalogLockedBean> component5() {
        return this.children;
    }

    public final CatalogLockedBean copy(long j10, String title, boolean z10, int i10, List<CatalogLockedBean> list) {
        AbstractC9133u.m16133g(title, "title");
        return new CatalogLockedBean(j10, title, z10, i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogLockedBean)) {
            return false;
        }
        CatalogLockedBean catalogLockedBean = (CatalogLockedBean) obj;
        return this.f11000id == catalogLockedBean.f11000id && AbstractC9133u.m16128b(this.title, catalogLockedBean.title) && this.isLeaf == catalogLockedBean.isLeaf && this.locked == catalogLockedBean.locked && AbstractC9133u.m16128b(this.children, catalogLockedBean.children);
    }

    public final List<CatalogLockedBean> getChildren() {
        return this.children;
    }

    public final long getId() {
        return this.f11000id;
    }

    public final int getLocked() {
        return this.locked;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.f11000id) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isLeaf)) * 31) + Integer.hashCode(this.locked)) * 31;
        List<CatalogLockedBean> list = this.children;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean isLeaf() {
        return this.isLeaf;
    }

    public String toString() {
        return "CatalogLockedBean(id=" + this.f11000id + ", title=" + this.title + ", isLeaf=" + this.isLeaf + ", locked=" + this.locked + ", children=" + this.children + ")";
    }
}
