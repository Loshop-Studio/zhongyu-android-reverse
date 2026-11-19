package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.C0810a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import p085f1.C2520r;
import p085f1.C2526x;
import p169x0.AbstractC3456y;
import p173y0.C3495j;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableWorkRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkRequest> CREATOR = new C0843a();

    /* renamed from: a */
    private final AbstractC3456y f4937a;

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkRequest$a */
    class C0843a implements Parcelable.Creator<ParcelableWorkRequest> {
        C0843a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkRequest createFromParcel(Parcel parcel) {
            return new ParcelableWorkRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkRequest[] newArray(int i4) {
            return new ParcelableWorkRequest[i4];
        }
    }

    public ParcelableWorkRequest(AbstractC3456y abstractC3456y) {
        this.f4937a = abstractC3456y;
    }

    /* renamed from: a */
    public AbstractC3456y m4330a() {
        return this.f4937a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4937a.m10543b());
        parcel.writeStringList(new ArrayList(this.f4937a.m10544c()));
        C2520r c2520rM10545d = this.f4937a.m10545d();
        parcel.writeString(c2520rM10545d.f10167c);
        parcel.writeString(c2520rM10545d.f10168d);
        parcel.writeInt(C2526x.m8492h(c2520rM10545d.f10166b));
        parcel.writeByteArray(c2520rM10545d.f10169e.m4154l());
        parcel.writeByteArray(c2520rM10545d.f10170f.m4154l());
        parcel.writeLong(c2520rM10545d.f10171g);
        parcel.writeLong(c2520rM10545d.f10172h);
        parcel.writeLong(c2520rM10545d.f10173i);
        parcel.writeInt(c2520rM10545d.f10175k);
        parcel.writeParcelable(new ParcelableConstraints(c2520rM10545d.f10174j), i4);
        parcel.writeInt(C2526x.m8485a(c2520rM10545d.f10176l));
        parcel.writeLong(c2520rM10545d.f10177m);
        parcel.writeLong(c2520rM10545d.f10179o);
        parcel.writeLong(c2520rM10545d.f10180p);
    }

    protected ParcelableWorkRequest(Parcel parcel) {
        String string = parcel.readString();
        HashSet hashSet = new HashSet(parcel.createStringArrayList());
        C2520r c2520r = new C2520r(string, parcel.readString());
        c2520r.f10168d = parcel.readString();
        c2520r.f10166b = C2526x.m8490f(parcel.readInt());
        c2520r.f10169e = C0810a.m4148g(parcel.createByteArray());
        c2520r.f10170f = C0810a.m4148g(parcel.createByteArray());
        c2520r.f10171g = parcel.readLong();
        c2520r.f10172h = parcel.readLong();
        c2520r.f10173i = parcel.readLong();
        c2520r.f10175k = parcel.readInt();
        c2520r.f10174j = ((ParcelableConstraints) parcel.readParcelable(getClass().getClassLoader())).m4309a();
        c2520r.f10176l = C2526x.m8488d(parcel.readInt());
        c2520r.f10177m = parcel.readLong();
        c2520r.f10179o = parcel.readLong();
        c2520r.f10180p = parcel.readLong();
        this.f4937a = new C3495j(UUID.fromString(string), c2520r, hashSet);
    }
}
