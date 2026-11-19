package androidx.paging.compose;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class PagingPlaceholderKey implements Parcelable {
    private final int index;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new Parcelable.Creator<PagingPlaceholderKey>() { // from class: androidx.paging.compose.PagingPlaceholderKey$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PagingPlaceholderKey createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new PagingPlaceholderKey(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PagingPlaceholderKey[] newArray(int i10) {
            return new PagingPlaceholderKey[i10];
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }

    public PagingPlaceholderKey(int i10) {
        this.index = i10;
    }

    private final int component1() {
        return this.index;
    }

    public static /* synthetic */ PagingPlaceholderKey copy$default(PagingPlaceholderKey pagingPlaceholderKey, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = pagingPlaceholderKey.index;
        }
        return pagingPlaceholderKey.copy(i10);
    }

    public final PagingPlaceholderKey copy(int i10) {
        return new PagingPlaceholderKey(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.index == ((PagingPlaceholderKey) obj).index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    public String toString() {
        return "PagingPlaceholderKey(index=" + this.index + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC9133u.m16133g(parcel, "parcel");
        parcel.writeInt(this.index);
    }
}
