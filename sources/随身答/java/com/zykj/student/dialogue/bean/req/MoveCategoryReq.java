package com.zykj.student.dialogue.bean.req;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(m13412d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/MoveCategoryReq;", "Landroid/os/Parcelable;", "sessionIds", "", "", "catalogId", "<init>", "(Ljava/util/List;J)V", "getSessionIds", "()Ljava/util/List;", "getCatalogId", "()J", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class MoveCategoryReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MoveCategoryReq> CREATOR = new Creator();
    private final long catalogId;
    private final List<Long> sessionIds;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<MoveCategoryReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoveCategoryReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new MoveCategoryReq(arrayList, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoveCategoryReq[] newArray(int i9) {
            return new MoveCategoryReq[i9];
        }
    }

    public MoveCategoryReq(List<Long> sessionIds, long j9) {
        Intrinsics.checkNotNullParameter(sessionIds, "sessionIds");
        this.sessionIds = sessionIds;
        this.catalogId = j9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MoveCategoryReq copy$default(MoveCategoryReq moveCategoryReq, List list, long j9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            list = moveCategoryReq.sessionIds;
        }
        if ((i9 & 2) != 0) {
            j9 = moveCategoryReq.catalogId;
        }
        return moveCategoryReq.copy(list, j9);
    }

    public final List<Long> component1() {
        return this.sessionIds;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCatalogId() {
        return this.catalogId;
    }

    public final MoveCategoryReq copy(List<Long> sessionIds, long catalogId) {
        Intrinsics.checkNotNullParameter(sessionIds, "sessionIds");
        return new MoveCategoryReq(sessionIds, catalogId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoveCategoryReq)) {
            return false;
        }
        MoveCategoryReq moveCategoryReq = (MoveCategoryReq) other;
        return Intrinsics.areEqual(this.sessionIds, moveCategoryReq.sessionIds) && this.catalogId == moveCategoryReq.catalogId;
    }

    public final long getCatalogId() {
        return this.catalogId;
    }

    public final List<Long> getSessionIds() {
        return this.sessionIds;
    }

    public int hashCode() {
        return (this.sessionIds.hashCode() * 31) + Long.hashCode(this.catalogId);
    }

    public String toString() {
        return "MoveCategoryReq(sessionIds=" + this.sessionIds + ", catalogId=" + this.catalogId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Long> list = this.sessionIds;
        dest.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            dest.writeLong(it.next().longValue());
        }
        dest.writeLong(this.catalogId);
    }
}
