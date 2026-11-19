package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p085f1.C2526x;
import p169x0.C3453v;
import p169x0.C3455x;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkQuery> CREATOR = new C0842a();

    /* renamed from: a */
    private final C3455x f4936a;

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkQuery$a */
    class C0842a implements Parcelable.Creator<ParcelableWorkQuery> {
        C0842a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkQuery createFromParcel(Parcel parcel) {
            return new ParcelableWorkQuery(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkQuery[] newArray(int i4) {
            return new ParcelableWorkQuery[i4];
        }
    }

    protected ParcelableWorkQuery(Parcel parcel) {
        List listEmptyList = Collections.emptyList();
        int i4 = parcel.readInt();
        if (i4 > 0) {
            listEmptyList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                listEmptyList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        List<C3453v.a> listEmptyList2 = Collections.emptyList();
        int i6 = parcel.readInt();
        if (i6 > 0) {
            listEmptyList2 = new ArrayList<>(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                listEmptyList2.add(C2526x.m8490f(parcel.readInt()));
            }
        }
        this.f4936a = C3455x.a.m10536f(listEmptyList).m10540d(arrayListCreateStringArrayList).m10539c(arrayListCreateStringArrayList2).m10538b(listEmptyList2).m10541e();
    }

    /* renamed from: a */
    public C3455x m4327a() {
        return this.f4936a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        List<UUID> listM10532a = this.f4936a.m10532a();
        parcel.writeInt(listM10532a.size());
        if (!listM10532a.isEmpty()) {
            Iterator<UUID> it = listM10532a.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(this.f4936a.m10535d());
        parcel.writeStringList(this.f4936a.m10534c());
        List<C3453v.a> listM10533b = this.f4936a.m10533b();
        parcel.writeInt(listM10533b.size());
        if (listM10533b.isEmpty()) {
            return;
        }
        Iterator<C3453v.a> it2 = listM10533b.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(C2526x.m8492h(it2.next()));
        }
    }
}
