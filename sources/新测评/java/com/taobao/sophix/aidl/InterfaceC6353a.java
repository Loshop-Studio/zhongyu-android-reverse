package com.taobao.sophix.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taobao.sophix.aidl.InterfaceC6354b;

/* renamed from: com.taobao.sophix.aidl.a */
/* loaded from: classes4.dex */
public interface InterfaceC6353a extends IInterface {

    /* renamed from: com.taobao.sophix.aidl.a$a */
    public static abstract class a extends Binder implements InterfaceC6353a {
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
                mo4570a(parcel.readString(), InterfaceC6354b.a.m4574a(parcel.readStrongBinder()));
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
            mo4571b(parcel.readString(), InterfaceC6354b.a.m4574a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo4570a(String str, InterfaceC6354b interfaceC6354b);

    /* renamed from: b */
    void mo4571b(String str, InterfaceC6354b interfaceC6354b);
}
