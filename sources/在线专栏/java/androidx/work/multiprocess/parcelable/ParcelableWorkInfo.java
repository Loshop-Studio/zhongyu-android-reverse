package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.C0810a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import p085f1.C2526x;
import p169x0.C3453v;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableWorkInfo implements Parcelable {

    /* renamed from: a */
    private final C3453v f4934a;

    /* renamed from: b */
    private static final String[] f4933b = new String[0];
    public static final Parcelable.Creator<ParcelableWorkInfo> CREATOR = new C0840a();

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkInfo$a */
    class C0840a implements Parcelable.Creator<ParcelableWorkInfo> {
        C0840a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkInfo createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkInfo[] newArray(int i4) {
            return new ParcelableWorkInfo[i4];
        }
    }

    public ParcelableWorkInfo(C3453v c3453v) {
        this.f4934a = c3453v;
    }

    /* renamed from: a */
    public C3453v m4322a() {
        return this.f4934a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4934a.m10518a().toString());
        parcel.writeInt(C2526x.m8492h(this.f4934a.m10522e()));
        parcel.writeByteArray(this.f4934a.m10519b().m4154l());
        parcel.writeStringArray((String[]) new ArrayList(this.f4934a.m10523f()).toArray(f4933b));
        parcel.writeByteArray(this.f4934a.m10520c().m4154l());
        parcel.writeInt(this.f4934a.m10521d());
    }

    protected ParcelableWorkInfo(Parcel parcel) {
        this.f4934a = new C3453v(UUID.fromString(parcel.readString()), C2526x.m8490f(parcel.readInt()), C0810a.m4148g(parcel.createByteArray()), Arrays.asList(parcel.createStringArray()), C0810a.m4148g(parcel.createByteArray()), parcel.readInt());
    }
}
