package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogProgress {
    public static final int $stable = 8;
    private final int catalogId;
    private final String catalogName;
    private final List<SuperviseGroup> groupList;
    private final int superviseId;

    public CatalogProgress(int i10, int i11, String catalogName, List<SuperviseGroup> groupList) {
        AbstractC9133u.m16133g(catalogName, "catalogName");
        AbstractC9133u.m16133g(groupList, "groupList");
        this.superviseId = i10;
        this.catalogId = i11;
        this.catalogName = catalogName;
        this.groupList = groupList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogProgress copy$default(CatalogProgress catalogProgress, int i10, int i11, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = catalogProgress.superviseId;
        }
        if ((i12 & 2) != 0) {
            i11 = catalogProgress.catalogId;
        }
        if ((i12 & 4) != 0) {
            str = catalogProgress.catalogName;
        }
        if ((i12 & 8) != 0) {
            list = catalogProgress.groupList;
        }
        return catalogProgress.copy(i10, i11, str, list);
    }

    public final int component1() {
        return this.superviseId;
    }

    public final int component2() {
        return this.catalogId;
    }

    public final String component3() {
        return this.catalogName;
    }

    public final List<SuperviseGroup> component4() {
        return this.groupList;
    }

    public final CatalogProgress copy(int i10, int i11, String catalogName, List<SuperviseGroup> groupList) {
        AbstractC9133u.m16133g(catalogName, "catalogName");
        AbstractC9133u.m16133g(groupList, "groupList");
        return new CatalogProgress(i10, i11, catalogName, groupList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogProgress)) {
            return false;
        }
        CatalogProgress catalogProgress = (CatalogProgress) obj;
        return this.superviseId == catalogProgress.superviseId && this.catalogId == catalogProgress.catalogId && AbstractC9133u.m16128b(this.catalogName, catalogProgress.catalogName) && AbstractC9133u.m16128b(this.groupList, catalogProgress.groupList);
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final String getCatalogName() {
        return this.catalogName;
    }

    public final List<SuperviseGroup> getGroupList() {
        return this.groupList;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.superviseId) * 31) + Integer.hashCode(this.catalogId)) * 31) + this.catalogName.hashCode()) * 31) + this.groupList.hashCode();
    }

    public String toString() {
        return "CatalogProgress(superviseId=" + this.superviseId + ", catalogId=" + this.catalogId + ", catalogName=" + this.catalogName + ", groupList=" + this.groupList + ")";
    }
}
