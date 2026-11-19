package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CatalogManageData {
    public static final int $stable = 0;

    /* renamed from: id */
    private final long f11001id;
    private final boolean isExpanded;
    private final boolean isLeaf;
    private final boolean isLockable;
    private final boolean isRoot;
    private final boolean isUnlock;
    private final String name;

    public CatalogManageData(long j10, String name, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC9133u.m16133g(name, "name");
        this.f11001id = j10;
        this.name = name;
        this.isLeaf = z10;
        this.isUnlock = z11;
        this.isLockable = z12;
        this.isExpanded = z13;
        this.isRoot = z14;
    }

    public static /* synthetic */ CatalogManageData copy$default(CatalogManageData catalogManageData, long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = catalogManageData.f11001id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = catalogManageData.name;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            z10 = catalogManageData.isLeaf;
        }
        boolean z15 = z10;
        if ((i10 & 8) != 0) {
            z11 = catalogManageData.isUnlock;
        }
        boolean z16 = z11;
        if ((i10 & 16) != 0) {
            z12 = catalogManageData.isLockable;
        }
        return catalogManageData.copy(j11, str2, z15, z16, z12, (i10 & 32) != 0 ? catalogManageData.isExpanded : z13, (i10 & 64) != 0 ? catalogManageData.isRoot : z14);
    }

    public final long component1() {
        return this.f11001id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isLeaf;
    }

    public final boolean component4() {
        return this.isUnlock;
    }

    public final boolean component5() {
        return this.isLockable;
    }

    public final boolean component6() {
        return this.isExpanded;
    }

    public final boolean component7() {
        return this.isRoot;
    }

    public final CatalogManageData copy(long j10, String name, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC9133u.m16133g(name, "name");
        return new CatalogManageData(j10, name, z10, z11, z12, z13, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogManageData)) {
            return false;
        }
        CatalogManageData catalogManageData = (CatalogManageData) obj;
        return this.f11001id == catalogManageData.f11001id && AbstractC9133u.m16128b(this.name, catalogManageData.name) && this.isLeaf == catalogManageData.isLeaf && this.isUnlock == catalogManageData.isUnlock && this.isLockable == catalogManageData.isLockable && this.isExpanded == catalogManageData.isExpanded && this.isRoot == catalogManageData.isRoot;
    }

    public final long getId() {
        return this.f11001id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f11001id) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isLeaf)) * 31) + Boolean.hashCode(this.isUnlock)) * 31) + Boolean.hashCode(this.isLockable)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Boolean.hashCode(this.isRoot);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isLeaf() {
        return this.isLeaf;
    }

    public final boolean isLockable() {
        return this.isLockable;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final boolean isUnlock() {
        return this.isUnlock;
    }

    public String toString() {
        return "CatalogManageData(id=" + this.f11001id + ", name=" + this.name + ", isLeaf=" + this.isLeaf + ", isUnlock=" + this.isUnlock + ", isLockable=" + this.isLockable + ", isExpanded=" + this.isExpanded + ", isRoot=" + this.isRoot + ")";
    }

    public /* synthetic */ CatalogManageData(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, AbstractC9126n abstractC9126n) {
        this(j10, str, z10, z11, (i10 & 16) != 0 ? true : z12, (i10 & 32) != 0 ? false : z13, (i10 & 64) != 0 ? true : z14);
    }
}
