package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkQuery> CREATOR = new Parcelable.Creator<ParcelableWorkQuery>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkQuery.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkQuery createFromParcel(Parcel parcel) {
            return new ParcelableWorkQuery(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkQuery[] newArray(int i6) {
            return new ParcelableWorkQuery[i6];
        }
    };
    private final WorkQuery mWorkQuery;

    public ParcelableWorkQuery(@NonNull WorkQuery workQuery) {
        this.mWorkQuery = workQuery;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public WorkQuery getWorkQuery() {
        return this.mWorkQuery;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i6) {
        List<UUID> ids = this.mWorkQuery.getIds();
        parcel.writeInt(ids.size());
        if (!ids.isEmpty()) {
            Iterator<UUID> it = ids.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(this.mWorkQuery.getUniqueWorkNames());
        parcel.writeStringList(this.mWorkQuery.getTags());
        List<WorkInfo.State> states = this.mWorkQuery.getStates();
        parcel.writeInt(states.size());
        if (states.isEmpty()) {
            return;
        }
        Iterator<WorkInfo.State> it2 = states.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(WorkTypeConverters.stateToInt(it2.next()));
        }
    }

    public ParcelableWorkQuery(@NonNull Parcel parcel) {
        List arrayList = Collections.EMPTY_LIST;
        int i6 = parcel.readInt();
        if (i6 > 0) {
            arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        List<? extends WorkInfo.State> arrayList2 = Collections.EMPTY_LIST;
        int i8 = parcel.readInt();
        if (i8 > 0) {
            arrayList2 = new ArrayList<>(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList2.add(WorkTypeConverters.intToState(parcel.readInt()));
            }
        }
        this.mWorkQuery = WorkQuery.Builder.fromIds(arrayList).addUniqueWorkNames(arrayListCreateStringArrayList).addTags(arrayListCreateStringArrayList2).addStates(arrayList2).build();
    }
}
