package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m13413d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableInterruptRequest;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "stopReason", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getStopReason", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "Companion", "work-multiprocess_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final /* data */ class ParcelableInterruptRequest implements Parcelable {
    private final String id;
    private final int stopReason;

    @JvmField
    public static final Parcelable.Creator<ParcelableInterruptRequest> CREATOR = new Parcelable.Creator<ParcelableInterruptRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableInterruptRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableInterruptRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ParcelableInterruptRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableInterruptRequest[] newArray(int size) {
            return new ParcelableInterruptRequest[size];
        }
    };

    public ParcelableInterruptRequest(String id, int i9) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.stopReason = i9;
    }

    public static /* synthetic */ ParcelableInterruptRequest copy$default(ParcelableInterruptRequest parcelableInterruptRequest, String str, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = parcelableInterruptRequest.id;
        }
        if ((i10 & 2) != 0) {
            i9 = parcelableInterruptRequest.stopReason;
        }
        return parcelableInterruptRequest.copy(str, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    public final ParcelableInterruptRequest copy(String id, int stopReason) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ParcelableInterruptRequest(id, stopReason);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelableInterruptRequest)) {
            return false;
        }
        ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) other;
        return Intrinsics.areEqual(this.id, parcelableInterruptRequest.id) && this.stopReason == parcelableInterruptRequest.stopReason;
    }

    public final String getId() {
        return this.id;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Integer.hashCode(this.stopReason);
    }

    public String toString() {
        return "ParcelableInterruptRequest(id=" + this.id + ", stopReason=" + this.stopReason + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.stopReason);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ParcelableInterruptRequest(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        this(string, parcel.readInt());
    }
}
