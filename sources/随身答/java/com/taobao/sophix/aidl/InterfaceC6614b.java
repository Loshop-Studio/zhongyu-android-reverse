package com.taobao.sophix.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.taobao.sophix.aidl.b */
/* loaded from: classes4.dex */
public interface InterfaceC6614b extends IInterface {
    /* renamed from: a */
    void mo4751a(int i9, int i10, String str, int i11);

    /* renamed from: com.taobao.sophix.aidl.b$a */
    public static abstract class a extends Binder implements InterfaceC6614b {

        /* renamed from: com.taobao.sophix.aidl.b$a$a, reason: collision with other inner class name */
        public static class C10055a implements InterfaceC6614b {

            /* renamed from: a */
            public static InterfaceC6614b f5463a;

            /* renamed from: b */
            private IBinder f5464b;

            public C10055a(IBinder iBinder) {
                this.f5464b = iBinder;
            }

            @Override // com.taobao.sophix.aidl.InterfaceC6614b
            /* renamed from: a */
            public void mo4751a(int i9, int i10, String str, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.taobao.sophix.aidl.IPatchStatusCallback");
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    if (this.f5464b.transact(1, parcelObtain, parcelObtain2, 0) || a.m4752a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m4752a().mo4751a(i9, i10, str, i11);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5464b;
            }
        }

        /* renamed from: a */
        public static InterfaceC6614b m4753a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.taobao.sophix.aidl.IPatchStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6614b)) ? new C10055a(iBinder) : (InterfaceC6614b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            if (i9 != 1) {
                if (i9 != 1598968902) {
                    return super.onTransact(i9, parcel, parcel2, i10);
                }
                parcel2.writeString("com.taobao.sophix.aidl.IPatchStatusCallback");
                return true;
            }
            parcel.enforceInterface("com.taobao.sophix.aidl.IPatchStatusCallback");
            mo4751a(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        /* renamed from: a */
        public static InterfaceC6614b m4752a() {
            return C10055a.f5463a;
        }
    }
}
