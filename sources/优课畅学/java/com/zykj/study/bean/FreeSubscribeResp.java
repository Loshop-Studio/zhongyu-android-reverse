package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FreeSubscribeResp implements Parcelable {
    private final List<FreeSubscribe> items;
    private final int totalCount;
    public static final Parcelable.Creator<FreeSubscribeResp> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<FreeSubscribeResp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeSubscribeResp createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(FreeSubscribe.CREATOR.createFromParcel(parcel));
            }
            return new FreeSubscribeResp(i10, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeSubscribeResp[] newArray(int i10) {
            return new FreeSubscribeResp[i10];
        }
    }

    public FreeSubscribeResp(int i10, List<FreeSubscribe> items) {
        AbstractC9133u.m16133g(items, "items");
        this.totalCount = i10;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreeSubscribeResp copy$default(FreeSubscribeResp freeSubscribeResp, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = freeSubscribeResp.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = freeSubscribeResp.items;
        }
        return freeSubscribeResp.copy(i10, list);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<FreeSubscribe> component2() {
        return this.items;
    }

    public final FreeSubscribeResp copy(int i10, List<FreeSubscribe> items) {
        AbstractC9133u.m16133g(items, "items");
        return new FreeSubscribeResp(i10, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeSubscribeResp)) {
            return false;
        }
        FreeSubscribeResp freeSubscribeResp = (FreeSubscribeResp) obj;
        return this.totalCount == freeSubscribeResp.totalCount && AbstractC9133u.m16128b(this.items, freeSubscribeResp.items);
    }

    public final List<FreeSubscribe> getItems() {
        return this.items;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.totalCount) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "FreeSubscribeResp(totalCount=" + this.totalCount + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.totalCount);
        List<FreeSubscribe> list = this.items;
        dest.writeInt(list.size());
        Iterator<FreeSubscribe> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
    }
}
