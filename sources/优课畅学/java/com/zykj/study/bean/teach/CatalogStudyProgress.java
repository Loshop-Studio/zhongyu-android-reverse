package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogStudyProgress {
    public static final int $stable = 8;
    private final int catalogId;
    private final String catalogName;
    private final List<SuperviseGroupProgress> groupList;
    private final int superviseId;

    public CatalogStudyProgress(int i10, int i11, String catalogName, List<SuperviseGroupProgress> groupList) {
        AbstractC9133u.m16133g(catalogName, "catalogName");
        AbstractC9133u.m16133g(groupList, "groupList");
        this.superviseId = i10;
        this.catalogId = i11;
        this.catalogName = catalogName;
        this.groupList = groupList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogStudyProgress copy$default(CatalogStudyProgress catalogStudyProgress, int i10, int i11, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = catalogStudyProgress.superviseId;
        }
        if ((i12 & 2) != 0) {
            i11 = catalogStudyProgress.catalogId;
        }
        if ((i12 & 4) != 0) {
            str = catalogStudyProgress.catalogName;
        }
        if ((i12 & 8) != 0) {
            list = catalogStudyProgress.groupList;
        }
        return catalogStudyProgress.copy(i10, i11, str, list);
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

    public final List<SuperviseGroupProgress> component4() {
        return this.groupList;
    }

    public final CatalogStudyProgress copy(int i10, int i11, String catalogName, List<SuperviseGroupProgress> groupList) {
        AbstractC9133u.m16133g(catalogName, "catalogName");
        AbstractC9133u.m16133g(groupList, "groupList");
        return new CatalogStudyProgress(i10, i11, catalogName, groupList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogStudyProgress)) {
            return false;
        }
        CatalogStudyProgress catalogStudyProgress = (CatalogStudyProgress) obj;
        return this.superviseId == catalogStudyProgress.superviseId && this.catalogId == catalogStudyProgress.catalogId && AbstractC9133u.m16128b(this.catalogName, catalogStudyProgress.catalogName) && AbstractC9133u.m16128b(this.groupList, catalogStudyProgress.groupList);
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final String getCatalogName() {
        return this.catalogName;
    }

    public final List<SuperviseGroupProgress> getGroupList() {
        return this.groupList;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.superviseId) * 31) + Integer.hashCode(this.catalogId)) * 31) + this.catalogName.hashCode()) * 31) + this.groupList.hashCode();
    }

    public String toString() {
        return "CatalogStudyProgress(superviseId=" + this.superviseId + ", catalogId=" + this.catalogId + ", catalogName=" + this.catalogName + ", groupList=" + this.groupList + ")";
    }
}
