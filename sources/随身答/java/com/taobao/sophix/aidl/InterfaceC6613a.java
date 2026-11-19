package com.taobao.sophix.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taobao.sophix.aidl.InterfaceC6614b;

/* renamed from: com.taobao.sophix.aidl.a */
/* loaded from: classes4.dex */
public interface InterfaceC6613a extends IInterface {

    /* renamed from: com.taobao.sophix.aidl.a$a */
    public static abstract class a extends Binder implements InterfaceC6613a {
        public a() {
            attachInterface(this, "com.taobao.sophix.aidl.IDownloadService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            if (i9 == 1) {
                parcel.enforceInterface("com.taobao.sophix.aidl.IDownloadService");
                mo4749a(parcel.readString(), InterfaceC6614b.a.m4753a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i9 != 2) {
                if (i9 != 1598968902) {
                    return super.onTransact(i9, parcel, parcel2, i10);
                }
                parcel2.writeString("com.taobao.sophix.aidl.IDownloadService");
                return true;
            }
            parcel.enforceInterface("com.taobao.sophix.aidl.IDownloadService");
            mo4750b(parcel.readString(), InterfaceC6614b.a.m4753a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo4749a(String str, InterfaceC6614b interfaceC6614b);

    /* renamed from: b */
    void mo4750b(String str, InterfaceC6614b interfaceC6614b);
}
