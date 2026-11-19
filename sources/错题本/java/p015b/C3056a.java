package p015b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C3056a implements InterfaceC3057b {

    /* renamed from: c */
    public IBinder f1376c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1376c;
    }

    @Override // p015b.InterfaceC3057b
    /* renamed from: c */
    public final void mo2003c(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC3057b.f1377b);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1376c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
