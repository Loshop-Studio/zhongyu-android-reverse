package p015b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* renamed from: b.c */
/* loaded from: classes.dex */
public final class BinderC3058c extends Binder implements InterfaceC3057b {

    /* renamed from: d */
    public static final /* synthetic */ int f1378d = 0;

    /* renamed from: c */
    public final /* synthetic */ ResultReceiver f1379c;

    public BinderC3058c(ResultReceiver resultReceiver) {
        this.f1379c = resultReceiver;
        attachInterface(this, InterfaceC3057b.f1377b);
    }

    @Override // p015b.InterfaceC3057b
    /* renamed from: c */
    public final void mo2003c(int i, Bundle bundle) {
        this.f1379c.mo71a(i, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC3057b.f1377b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i8);
        }
        mo2003c(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
