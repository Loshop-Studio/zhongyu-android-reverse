package com.taobao.sophix.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.taobao.sophix.aidl.b */
/* loaded from: classes5.dex */
public interface InterfaceC7720b extends IInterface {
    /* renamed from: a */
    void mo10263a(int i10, int i11, String str, int i12);

    /* renamed from: com.taobao.sophix.aidl.b$a */
    public static abstract class a extends Binder implements InterfaceC7720b {

        /* renamed from: com.taobao.sophix.aidl.b$a$a, reason: collision with other inner class name */
        public static class C12110a implements InterfaceC7720b {

            /* renamed from: a */
            public static InterfaceC7720b f13328a;

            /* renamed from: b */
            private IBinder f13329b;

            public C12110a(IBinder iBinder) {
                this.f13329b = iBinder;
            }

            @Override // com.taobao.sophix.aidl.InterfaceC7720b
            /* renamed from: a */
            public void mo10263a(int i10, int i11, String str, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.taobao.sophix.aidl.IPatchStatusCallback");
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i12);
                    if (this.f13329b.transact(1, parcelObtain, parcelObtain2, 0) || a.m10264a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m10264a().mo10263a(i10, i11, str, i12);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13329b;
            }
        }

        /* renamed from: a */
        public static InterfaceC7720b m10265a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.taobao.sophix.aidl.IPatchStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7720b)) ? new C12110a(iBinder) : (InterfaceC7720b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.taobao.sophix.aidl.IPatchStatusCallback");
                return true;
            }
            parcel.enforceInterface("com.taobao.sophix.aidl.IPatchStatusCallback");
            mo10263a(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        /* renamed from: a */
        public static InterfaceC7720b m10264a() {
            return C12110a.f13328a;
        }
    }
}
