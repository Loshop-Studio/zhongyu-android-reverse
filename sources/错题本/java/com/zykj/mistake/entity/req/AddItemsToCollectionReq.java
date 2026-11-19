package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;", "", "itemIds", "", "", "collectionIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getItemIds", "()Ljava/util/List;", "getCollectionIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class AddItemsToCollectionReq {
    public static final int $stable = 8;

    @NotNull
    private final List<Integer> collectionIds;

    @NotNull
    private final List<Integer> itemIds;

    public AddItemsToCollectionReq(@NotNull List<Integer> itemIds, @NotNull List<Integer> collectionIds) {
        AbstractC5830k.m5330g(itemIds, "itemIds");
        AbstractC5830k.m5330g(collectionIds, "collectionIds");
        this.itemIds = itemIds;
        this.collectionIds = collectionIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddItemsToCollectionReq copy$default(AddItemsToCollectionReq addItemsToCollectionReq, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addItemsToCollectionReq.itemIds;
        }
        if ((i & 2) != 0) {
            list2 = addItemsToCollectionReq.collectionIds;
        }
        return addItemsToCollectionReq.copy(list, list2);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.itemIds;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.collectionIds;
    }

    @NotNull
    public final AddItemsToCollectionReq copy(@NotNull List<Integer> itemIds, @NotNull List<Integer> collectionIds) {
        AbstractC5830k.m5330g(itemIds, "itemIds");
        AbstractC5830k.m5330g(collectionIds, "collectionIds");
        return new AddItemsToCollectionReq(itemIds, collectionIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddItemsToCollectionReq)) {
            return false;
        }
        AddItemsToCollectionReq addItemsToCollectionReq = (AddItemsToCollectionReq) other;
        return AbstractC5830k.m5325b(this.itemIds, addItemsToCollectionReq.itemIds) && AbstractC5830k.m5325b(this.collectionIds, addItemsToCollectionReq.collectionIds);
    }

    @NotNull
    public final List<Integer> getCollectionIds() {
        return this.collectionIds;
    }

    @NotNull
    public final List<Integer> getItemIds() {
        return this.itemIds;
    }

    public int hashCode() {
        return this.collectionIds.hashCode() + (this.itemIds.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AddItemsToCollectionReq(itemIds=" + this.itemIds + ", collectionIds=" + this.collectionIds + ")";
    }
}
