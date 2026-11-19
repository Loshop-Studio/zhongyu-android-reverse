package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;", "", "collectionId", "", "itemIds", "", "<init>", "(ILjava/util/List;)V", "getCollectionId", "()I", "getItemIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class RemoveItemsFromCollectionReq {
    public static final int $stable = 8;
    private final int collectionId;

    @NotNull
    private final List<Integer> itemIds;

    public RemoveItemsFromCollectionReq(int i, @NotNull List<Integer> itemIds) {
        AbstractC5830k.m5330g(itemIds, "itemIds");
        this.collectionId = i;
        this.itemIds = itemIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoveItemsFromCollectionReq copy$default(RemoveItemsFromCollectionReq removeItemsFromCollectionReq, int i, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = removeItemsFromCollectionReq.collectionId;
        }
        if ((i8 & 2) != 0) {
            list = removeItemsFromCollectionReq.itemIds;
        }
        return removeItemsFromCollectionReq.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.itemIds;
    }

    @NotNull
    public final RemoveItemsFromCollectionReq copy(int collectionId, @NotNull List<Integer> itemIds) {
        AbstractC5830k.m5330g(itemIds, "itemIds");
        return new RemoveItemsFromCollectionReq(collectionId, itemIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveItemsFromCollectionReq)) {
            return false;
        }
        RemoveItemsFromCollectionReq removeItemsFromCollectionReq = (RemoveItemsFromCollectionReq) other;
        return this.collectionId == removeItemsFromCollectionReq.collectionId && AbstractC5830k.m5325b(this.itemIds, removeItemsFromCollectionReq.itemIds);
    }

    public final int getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final List<Integer> getItemIds() {
        return this.itemIds;
    }

    public int hashCode() {
        return this.itemIds.hashCode() + (Integer.hashCode(this.collectionId) * 31);
    }

    @NotNull
    public String toString() {
        return "RemoveItemsFromCollectionReq(collectionId=" + this.collectionId + ", itemIds=" + this.itemIds + ")";
    }
}
