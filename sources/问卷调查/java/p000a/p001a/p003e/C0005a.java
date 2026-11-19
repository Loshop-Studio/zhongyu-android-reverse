package p000a.p001a.p003e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p070b.p071a.p072a.p073a.C0561a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.a.e.a */
/* loaded from: classes.dex */
public final class C0005a implements Parcelable {
    public static final Parcelable.Creator<C0005a> CREATOR = new a();

    /* renamed from: b */
    public final int f4b;

    /* renamed from: c */
    public final Intent f5c;

    /* renamed from: a.a.e.a$a */
    public class a implements Parcelable.Creator<C0005a> {
        @Override // android.os.Parcelable.Creator
        public C0005a createFromParcel(Parcel parcel) {
            return new C0005a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0005a[] newArray(int i) {
            return new C0005a[i];
        }
    }

    public C0005a(int i, Intent intent) {
        this.f4b = i;
        this.f5c = intent;
    }

    public C0005a(Parcel parcel) {
        this.f4b = parcel.readInt();
        this.f5c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("ActivityResult{resultCode=");
        int i = this.f4b;
        sbM2079g.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sbM2079g.append(", data=");
        sbM2079g.append(this.f5c);
        sbM2079g.append('}');
        return sbM2079g.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4b);
        parcel.writeInt(this.f5c == null ? 0 : 1);
        Intent intent = this.f5c;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
