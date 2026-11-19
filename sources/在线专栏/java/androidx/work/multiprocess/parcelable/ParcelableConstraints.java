package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
import p085f1.C2526x;
import p105j1.C2691b;
import p169x0.C3434c;
import p169x0.C3435d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableConstraints implements Parcelable {
    public static final Parcelable.Creator<ParcelableConstraints> CREATOR = new C0837a();

    /* renamed from: a */
    private final C3434c f4926a;

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableConstraints$a */
    class C0837a implements Parcelable.Creator<ParcelableConstraints> {
        C0837a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableConstraints createFromParcel(Parcel parcel) {
            return new ParcelableConstraints(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableConstraints[] newArray(int i4) {
            return new ParcelableConstraints[i4];
        }
    }

    public ParcelableConstraints(C3434c c3434c) {
        this.f4926a = c3434c;
    }

    /* renamed from: a */
    public C3434c m4309a() {
        return this.f4926a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(C2526x.m8491g(this.f4926a.m10463b()));
        C2691b.m9004b(parcel, this.f4926a.m10467f());
        C2691b.m9004b(parcel, this.f4926a.m10468g());
        C2691b.m9004b(parcel, this.f4926a.m10470i());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            C2691b.m9004b(parcel, this.f4926a.m10469h());
        }
        if (i5 >= 24) {
            boolean zM10466e = this.f4926a.m10466e();
            C2691b.m9004b(parcel, zM10466e);
            if (zM10466e) {
                parcel.writeByteArray(C2526x.m8487c(this.f4926a.m10462a()));
            }
            parcel.writeLong(this.f4926a.m10465d());
            parcel.writeLong(this.f4926a.m10464c());
        }
    }

    public ParcelableConstraints(Parcel parcel) {
        C3434c.a aVar = new C3434c.a();
        aVar.m10481c(C2526x.m8489e(parcel.readInt()));
        aVar.m10482d(C2691b.m9003a(parcel));
        aVar.m10483e(C2691b.m9003a(parcel));
        aVar.m10485g(C2691b.m9003a(parcel));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            aVar.m10484f(C2691b.m9003a(parcel));
        }
        if (i4 >= 24) {
            if (C2691b.m9003a(parcel)) {
                for (C3435d.a aVar2 : C2526x.m8486b(parcel.createByteArray()).m10489b()) {
                    aVar.m10479a(aVar2.m10491a(), aVar2.m10492b());
                }
            }
            long j4 = parcel.readLong();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.m10486h(j4, timeUnit);
            aVar.m10487i(parcel.readLong(), timeUnit);
        }
        this.f4926a = aVar.m10480b();
    }
}
