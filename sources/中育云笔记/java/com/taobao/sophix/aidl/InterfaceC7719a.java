package com.taobao.sophix.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taobao.sophix.aidl.InterfaceC7720b;

/* renamed from: com.taobao.sophix.aidl.a */
/* loaded from: classes5.dex */
public interface InterfaceC7719a extends IInterface {

    /* renamed from: com.taobao.sophix.aidl.a$a */
    public static abstract class a extends Binder implements InterfaceC7719a {
        public a() {
            attachInterface(this, "com.taobao.sophix.aidl.IDownloadService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.taobao.sophix.aidl.IDownloadService");
                mo10261a(parcel.readString(), InterfaceC7720b.a.m10265a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.taobao.sophix.aidl.IDownloadService");
                return true;
            }
            parcel.enforceInterface("com.taobao.sophix.aidl.IDownloadService");
            mo10262b(parcel.readString(), InterfaceC7720b.a.m10265a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo10261a(String str, InterfaceC7720b interfaceC7720b);

    /* renamed from: b */
    void mo10262b(String str, InterfaceC7720b interfaceC7720b);
}
