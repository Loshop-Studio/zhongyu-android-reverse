package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ResourceDeleteEntity {
    public static final int $stable = 8;
    private final String fileId;
    private final List<String> resourceIdList;

    public ResourceDeleteEntity(String fileId, List<String> resourceIdList) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(resourceIdList, "resourceIdList");
        this.fileId = fileId;
        this.resourceIdList = resourceIdList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceDeleteEntity copy$default(ResourceDeleteEntity resourceDeleteEntity, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resourceDeleteEntity.fileId;
        }
        if ((i10 & 2) != 0) {
            list = resourceDeleteEntity.resourceIdList;
        }
        return resourceDeleteEntity.copy(str, list);
    }

    public final String component1() {
        return this.fileId;
    }

    public final List<String> component2() {
        return this.resourceIdList;
    }

    public final ResourceDeleteEntity copy(String fileId, List<String> resourceIdList) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(resourceIdList, "resourceIdList");
        return new ResourceDeleteEntity(fileId, resourceIdList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceDeleteEntity)) {
            return false;
        }
        ResourceDeleteEntity resourceDeleteEntity = (ResourceDeleteEntity) obj;
        return AbstractC9979u.m20289b(this.fileId, resourceDeleteEntity.fileId) && AbstractC9979u.m20289b(this.resourceIdList, resourceDeleteEntity.resourceIdList);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final List<String> getResourceIdList() {
        return this.resourceIdList;
    }

    public int hashCode() {
        return (this.fileId.hashCode() * 31) + this.resourceIdList.hashCode();
    }

    public String toString() {
        return "ResourceDeleteEntity(fileId=" + this.fileId + ", resourceIdList=" + this.resourceIdList + ")";
    }
}
