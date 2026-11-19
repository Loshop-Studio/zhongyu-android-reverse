package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m13558d2 = {"Lcom/zykj/evaluation/bean/GetTaskListResponse;", "", "totalCount", "", "items", "", "Lcom/zykj/evaluation/bean/TaskInfo;", "<init>", "(ILjava/util/List;)V", "getTotalCount", "()I", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetTaskListResponse {
    public static final int $stable = 8;
    private final List<TaskInfo> items;
    private final int totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTaskListResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTaskListResponse copy$default(GetTaskListResponse getTaskListResponse, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = getTaskListResponse.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = getTaskListResponse.items;
        }
        return getTaskListResponse.copy(i10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<TaskInfo> component2() {
        return this.items;
    }

    public final GetTaskListResponse copy(int totalCount, List<TaskInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new GetTaskListResponse(totalCount, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTaskListResponse)) {
            return false;
        }
        GetTaskListResponse getTaskListResponse = (GetTaskListResponse) other;
        return this.totalCount == getTaskListResponse.totalCount && Intrinsics.areEqual(this.items, getTaskListResponse.items);
    }

    public final List<TaskInfo> getItems() {
        return this.items;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.totalCount) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "GetTaskListResponse(totalCount=" + this.totalCount + ", items=" + this.items + ")";
    }

    public GetTaskListResponse(int i10, List<TaskInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.totalCount = i10;
        this.items = items;
    }

    public /* synthetic */ GetTaskListResponse(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
