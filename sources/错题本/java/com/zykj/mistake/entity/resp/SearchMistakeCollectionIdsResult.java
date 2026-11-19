package com.zykj.mistake.entity.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResult;", "", "itemIds", "", "", "totalCount", "<init>", "(Ljava/util/List;I)V", "getItemIds", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SearchMistakeCollectionIdsResult {
    public static final int $stable = 8;

    @NotNull
    private final List<Integer> itemIds;
    private final int totalCount;

    public SearchMistakeCollectionIdsResult() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMistakeCollectionIdsResult copy$default(SearchMistakeCollectionIdsResult searchMistakeCollectionIdsResult, List list, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = searchMistakeCollectionIdsResult.itemIds;
        }
        if ((i8 & 2) != 0) {
            i = searchMistakeCollectionIdsResult.totalCount;
        }
        return searchMistakeCollectionIdsResult.copy(list, i);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.itemIds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final SearchMistakeCollectionIdsResult copy(@NotNull List<Integer> itemIds, int totalCount) {
        AbstractC5830k.m5330g(itemIds, "itemIds");
        return new SearchMistakeCollectionIdsResult(itemIds, totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMistakeCollectionIdsResult)) {
            return false;
        }
        SearchMistakeCollectionIdsResult searchMistakeCollectionIdsResult = (SearchMistakeCollectionIdsResult) other;
        return AbstractC5830k.m5325b(this.itemIds, searchMistakeCollectionIdsResult.itemIds) && this.totalCount == searchMistakeCollectionIdsResult.totalCount;
    }

    @NotNull
    public final List<Integer> getItemIds() {
        return this.itemIds;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + (this.itemIds.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SearchMistakeCollectionIdsResult(itemIds=" + this.itemIds + ", totalCount=" + this.totalCount + ")";
    }

    public SearchMistakeCollectionIdsResult(@NotNull List<Integer> itemIds, int i) {
        AbstractC5830k.m5330g(itemIds, "itemIds");
        this.itemIds = itemIds;
        this.totalCount = i;
    }

    public SearchMistakeCollectionIdsResult(List list, int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? EmptyList.INSTANCE : list, (i8 & 2) != 0 ? 0 : i);
    }
}
