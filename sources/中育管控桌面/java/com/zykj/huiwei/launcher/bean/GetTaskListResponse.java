package com.zykj.huiwei.launcher.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;", "", "totalCount", "", "totalUrge", "items", "", "Lcom/zykj/huiwei/launcher/bean/TaskInfo;", "<init>", "(IILjava/util/List;)V", "getTotalCount", "()I", "getTotalUrge", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetTaskListResponse {
    public static final int $stable = 8;
    private final List<TaskInfo> items;
    private final int totalCount;
    private final int totalUrge;

    public GetTaskListResponse() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTaskListResponse copy$default(GetTaskListResponse getTaskListResponse, int i6, int i7, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = getTaskListResponse.totalCount;
        }
        if ((i8 & 2) != 0) {
            i7 = getTaskListResponse.totalUrge;
        }
        if ((i8 & 4) != 0) {
            list = getTaskListResponse.items;
        }
        return getTaskListResponse.copy(i6, i7, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalUrge() {
        return this.totalUrge;
    }

    public final List<TaskInfo> component3() {
        return this.items;
    }

    public final GetTaskListResponse copy(int totalCount, int totalUrge, List<TaskInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new GetTaskListResponse(totalCount, totalUrge, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTaskListResponse)) {
            return false;
        }
        GetTaskListResponse getTaskListResponse = (GetTaskListResponse) other;
        return this.totalCount == getTaskListResponse.totalCount && this.totalUrge == getTaskListResponse.totalUrge && Intrinsics.areEqual(this.items, getTaskListResponse.items);
    }

    public final List<TaskInfo> getItems() {
        return this.items;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getTotalUrge() {
        return this.totalUrge;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.totalCount) * 31) + Integer.hashCode(this.totalUrge)) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "GetTaskListResponse(totalCount=" + this.totalCount + ", totalUrge=" + this.totalUrge + ", items=" + this.items + ")";
    }

    public GetTaskListResponse(int i6, int i7, List<TaskInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.totalCount = i6;
        this.totalUrge = i7;
        this.items = items;
    }

    public /* synthetic */ GetTaskListResponse(int i6, int i7, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i6, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
