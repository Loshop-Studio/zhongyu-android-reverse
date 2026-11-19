package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class GetResourceEntity {
    public static final int $stable = 8;
    private final String code;
    private final List<ResourceEntity> resourceList;
    private final int totalCount;
    private final long userId;

    public GetResourceEntity(String code, long j10, int i10, List<ResourceEntity> resourceList) {
        AbstractC9979u.m20294g(code, "code");
        AbstractC9979u.m20294g(resourceList, "resourceList");
        this.code = code;
        this.userId = j10;
        this.totalCount = i10;
        this.resourceList = resourceList;
    }

    public static /* synthetic */ GetResourceEntity copy$default(GetResourceEntity getResourceEntity, String str, long j10, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getResourceEntity.code;
        }
        if ((i11 & 2) != 0) {
            j10 = getResourceEntity.userId;
        }
        if ((i11 & 4) != 0) {
            i10 = getResourceEntity.totalCount;
        }
        if ((i11 & 8) != 0) {
            list = getResourceEntity.resourceList;
        }
        return getResourceEntity.copy(str, j10, i10, list);
    }

    public final String component1() {
        return this.code;
    }

    public final long component2() {
        return this.userId;
    }

    public final int component3() {
        return this.totalCount;
    }

    public final List<ResourceEntity> component4() {
        return this.resourceList;
    }

    public final GetResourceEntity copy(String code, long j10, int i10, List<ResourceEntity> resourceList) {
        AbstractC9979u.m20294g(code, "code");
        AbstractC9979u.m20294g(resourceList, "resourceList");
        return new GetResourceEntity(code, j10, i10, resourceList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetResourceEntity)) {
            return false;
        }
        GetResourceEntity getResourceEntity = (GetResourceEntity) obj;
        return AbstractC9979u.m20289b(this.code, getResourceEntity.code) && this.userId == getResourceEntity.userId && this.totalCount == getResourceEntity.totalCount && AbstractC9979u.m20289b(this.resourceList, getResourceEntity.resourceList);
    }

    public final String getCode() {
        return this.code;
    }

    public final List<ResourceEntity> getResourceList() {
        return this.resourceList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + Long.hashCode(this.userId)) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.resourceList.hashCode();
    }

    public String toString() {
        return "GetResourceEntity(code=" + this.code + ", userId=" + this.userId + ", totalCount=" + this.totalCount + ", resourceList=" + this.resourceList + ")";
    }
}
