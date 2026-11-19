package com.taobao.sophix.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.taobao.sophix.aidl.b */
/* loaded from: classes4.dex */
public interface InterfaceC6354b extends IInterface {
    /* renamed from: a */
    void mo4572a(int i10, int i11, String str, int i12);

    /* renamed from: com.taobao.sophix.aidl.b$a */
    public static abstract class a extends Binder implements InterfaceC6354b {

        /* renamed from: com.taobao.sophix.aidl.b$a$a, reason: collision with other inner class name */
        public static class C10133a implements InterfaceC6354b {

            /* renamed from: a */
            public static InterfaceC6354b f4886a;

            /* renamed from: b */
            private IBinder f4887b;

            public C10133a(IBinder iBinder) {
                this.f4887b = iBinder;
            }

            @Override // com.taobao.sophix.aidl.InterfaceC6354b
            /* renamed from: a */
            public void mo4572a(int i10, int i11, String str, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.taobao.sophix.aidl.IPatchStatusCallback");
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i12);
                    if (this.f4887b.transact(1, parcelObtain, parcelObtain2, 0) || a.m4573a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m4573a().mo4572a(i10, i11, str, i12);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4887b;
            }
        }

        /* renamed from: a */
        public static InterfaceC6354b m4574a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.taobao.sophix.aidl.IPatchStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6354b)) ? new C10133a(iBinder) : (InterfaceC6354b) iInterfaceQueryLocalInterface;
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
            mo4572a(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        /* renamed from: a */
        public static InterfaceC6354b m4573a() {
            return C10133a.f4886a;
        }
    }
}
