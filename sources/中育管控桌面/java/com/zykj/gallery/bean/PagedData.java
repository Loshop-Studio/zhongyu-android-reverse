package com.zykj.gallery.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m7880d2 = {"Lcom/zykj/gallery/bean/PagedData;", ExifInterface.GPS_DIRECTION_TRUE, "", "items", "", "totalCount", "", "<init>", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PagedData<T> {
    public static final int $stable = 8;
    private final List<T> items;
    private final int totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PagedData(List<? extends T> items, int i6) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.totalCount = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PagedData copy$default(PagedData pagedData, List list, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = pagedData.items;
        }
        if ((i7 & 2) != 0) {
            i6 = pagedData.totalCount;
        }
        return pagedData.copy(list, i6);
    }

    public final List<T> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final PagedData<T> copy(List<? extends T> items, int totalCount) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PagedData<>(items, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagedData)) {
            return false;
        }
        PagedData pagedData = (PagedData) other;
        return Intrinsics.areEqual(this.items, pagedData.items) && this.totalCount == pagedData.totalCount;
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Integer.hashCode(this.totalCount);
    }

    public String toString() {
        return "PagedData(items=" + this.items + ", totalCount=" + this.totalCount + ")";
    }
}
