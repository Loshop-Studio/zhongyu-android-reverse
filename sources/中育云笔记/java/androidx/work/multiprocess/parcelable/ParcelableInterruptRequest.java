package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ParcelableInterruptRequest implements Parcelable {

    /* renamed from: id */
    private final String f2216id;
    private final int stopReason;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableInterruptRequest> CREATOR = new Parcelable.Creator<ParcelableInterruptRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableInterruptRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableInterruptRequest createFromParcel(Parcel parcel) {
            AbstractC9979u.m20294g(parcel, "parcel");
            return new ParcelableInterruptRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableInterruptRequest[] newArray(int i10) {
            return new ParcelableInterruptRequest[i10];
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public ParcelableInterruptRequest(String id2, int i10) {
        AbstractC9979u.m20294g(id2, "id");
        this.f2216id = id2;
        this.stopReason = i10;
    }

    public static /* synthetic */ ParcelableInterruptRequest copy$default(ParcelableInterruptRequest parcelableInterruptRequest, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = parcelableInterruptRequest.f2216id;
        }
        if ((i11 & 2) != 0) {
            i10 = parcelableInterruptRequest.stopReason;
        }
        return parcelableInterruptRequest.copy(str, i10);
    }

    public final String component1() {
        return this.f2216id;
    }

    public final int component2() {
        return this.stopReason;
    }

    public final ParcelableInterruptRequest copy(String id2, int i10) {
        AbstractC9979u.m20294g(id2, "id");
        return new ParcelableInterruptRequest(id2, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableInterruptRequest)) {
            return false;
        }
        ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) obj;
        return AbstractC9979u.m20289b(this.f2216id, parcelableInterruptRequest.f2216id) && this.stopReason == parcelableInterruptRequest.stopReason;
    }

    public final String getId() {
        return this.f2216id;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public int hashCode() {
        return (this.f2216id.hashCode() * 31) + Integer.hashCode(this.stopReason);
    }

    public String toString() {
        return "ParcelableInterruptRequest(id=" + this.f2216id + ", stopReason=" + this.stopReason + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC9979u.m20294g(parcel, "parcel");
        parcel.writeString(this.f2216id);
        parcel.writeInt(this.stopReason);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ParcelableInterruptRequest(Parcel parcel) {
        AbstractC9979u.m20294g(parcel, "parcel");
        String string = parcel.readString();
        AbstractC9979u.m20291d(string);
        this(string, parcel.readInt());
    }
}
