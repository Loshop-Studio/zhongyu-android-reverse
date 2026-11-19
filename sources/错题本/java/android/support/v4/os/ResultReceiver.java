package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.C0038g;
import androidx.annotation.RestrictTo;
import p015b.BinderC3058c;
import p015b.InterfaceC3057b;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0038g(9);

    /* renamed from: a */
    public InterfaceC3057b f135a;

    /* renamed from: a */
    public void mo71a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public final void m135b(int i, Bundle bundle) {
        InterfaceC3057b interfaceC3057b = this.f135a;
        if (interfaceC3057b != null) {
            try {
                interfaceC3057b.mo2003c(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f135a == null) {
                    this.f135a = new BinderC3058c(this);
                }
                parcel.writeStrongBinder(this.f135a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
