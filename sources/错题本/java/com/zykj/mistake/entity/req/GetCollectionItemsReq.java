package com.zykj.mistake.entity.req;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;", "", "collectionId", "", "sortType", "sortDirection", "skipCount", "maxResultCount", "<init>", "(IIIII)V", "getCollectionId", "()I", "getSortType", "getSortDirection", "getSkipCount", "getMaxResultCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class GetCollectionItemsReq {
    public static final int $stable = 0;
    private final int collectionId;
    private final int maxResultCount;
    private final int skipCount;
    private final int sortDirection;
    private final int sortType;

    public GetCollectionItemsReq(int i, int i8, int i9, int i10, int i11) {
        this.collectionId = i;
        this.sortType = i8;
        this.sortDirection = i9;
        this.skipCount = i10;
        this.maxResultCount = i11;
    }

    public static /* synthetic */ GetCollectionItemsReq copy$default(GetCollectionItemsReq getCollectionItemsReq, int i, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = getCollectionItemsReq.collectionId;
        }
        if ((i12 & 2) != 0) {
            i8 = getCollectionItemsReq.sortType;
        }
        if ((i12 & 4) != 0) {
            i9 = getCollectionItemsReq.sortDirection;
        }
        if ((i12 & 8) != 0) {
            i10 = getCollectionItemsReq.skipCount;
        }
        if ((i12 & 16) != 0) {
            i11 = getCollectionItemsReq.maxResultCount;
        }
        int i13 = i11;
        int i14 = i9;
        return getCollectionItemsReq.copy(i, i8, i14, i10, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSortType() {
        return this.sortType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSortDirection() {
        return this.sortDirection;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSkipCount() {
        return this.skipCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    @NotNull
    public final GetCollectionItemsReq copy(int collectionId, int sortType, int sortDirection, int skipCount, int maxResultCount) {
        return new GetCollectionItemsReq(collectionId, sortType, sortDirection, skipCount, maxResultCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCollectionItemsReq)) {
            return false;
        }
        GetCollectionItemsReq getCollectionItemsReq = (GetCollectionItemsReq) other;
        return this.collectionId == getCollectionItemsReq.collectionId && this.sortType == getCollectionItemsReq.sortType && this.sortDirection == getCollectionItemsReq.sortDirection && this.skipCount == getCollectionItemsReq.skipCount && this.maxResultCount == getCollectionItemsReq.maxResultCount;
    }

    public final int getCollectionId() {
        return this.collectionId;
    }

    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final int getSortDirection() {
        return this.sortDirection;
    }

    public final int getSortType() {
        return this.sortType;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxResultCount) + AbstractC0584a.m902c(this.skipCount, AbstractC0584a.m902c(this.sortDirection, AbstractC0584a.m902c(this.sortType, Integer.hashCode(this.collectionId) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.collectionId;
        int i8 = this.sortType;
        int i9 = this.sortDirection;
        int i10 = this.skipCount;
        int i11 = this.maxResultCount;
        StringBuilder sbM99x = AbstractC0037f.m99x("GetCollectionItemsReq(collectionId=", ", sortType=", i, ", sortDirection=", i8);
        AbstractC1923c.m1059w(sbM99x, i9, ", skipCount=", i10, ", maxResultCount=");
        return AbstractC0037f.m90o(sbM99x, ")", i11);
    }

    public /* synthetic */ GetCollectionItemsReq(int i, int i8, int i9, int i10, int i11, int i12, AbstractC5824e abstractC5824e) {
        this(i, (i12 & 2) != 0 ? 0 : i8, (i12 & 4) != 0 ? 1 : i9, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 20 : i11);
    }
}
