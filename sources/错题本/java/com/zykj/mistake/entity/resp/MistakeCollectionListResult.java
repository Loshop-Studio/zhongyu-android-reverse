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
@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;", "", "items", "", "Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;", "totalCount", "", "<init>", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class MistakeCollectionListResult {
    public static final int $stable = 8;

    @NotNull
    private final List<MistakeCollectionResp> items;
    private final int totalCount;

    public MistakeCollectionListResult() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MistakeCollectionListResult copy$default(MistakeCollectionListResult mistakeCollectionListResult, List list, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = mistakeCollectionListResult.items;
        }
        if ((i8 & 2) != 0) {
            i = mistakeCollectionListResult.totalCount;
        }
        return mistakeCollectionListResult.copy(list, i);
    }

    @NotNull
    public final List<MistakeCollectionResp> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final MistakeCollectionListResult copy(@NotNull List<MistakeCollectionResp> items, int totalCount) {
        AbstractC5830k.m5330g(items, "items");
        return new MistakeCollectionListResult(items, totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MistakeCollectionListResult)) {
            return false;
        }
        MistakeCollectionListResult mistakeCollectionListResult = (MistakeCollectionListResult) other;
        return AbstractC5830k.m5325b(this.items, mistakeCollectionListResult.items) && this.totalCount == mistakeCollectionListResult.totalCount;
    }

    @NotNull
    public final List<MistakeCollectionResp> getItems() {
        return this.items;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + (this.items.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MistakeCollectionListResult(items=" + this.items + ", totalCount=" + this.totalCount + ")";
    }

    public MistakeCollectionListResult(@NotNull List<MistakeCollectionResp> items, int i) {
        AbstractC5830k.m5330g(items, "items");
        this.items = items;
        this.totalCount = i;
    }

    public MistakeCollectionListResult(List list, int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? EmptyList.INSTANCE : list, (i8 & 2) != 0 ? 0 : i);
    }
}
