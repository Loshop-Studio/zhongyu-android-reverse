package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.huawei.hms.core.aidl.c */
/* loaded from: classes5.dex */
public interface InterfaceC7276c extends IInterface {

    /* renamed from: com.huawei.hms.core.aidl.c$a */
    public static abstract class a extends Binder implements InterfaceC7276c {
        static final int TRANSACTION_call = 1;

        /* renamed from: com.huawei.hms.core.aidl.c$a$a, reason: collision with other inner class name */
        public static class C12107a implements InterfaceC7276c {

            /* renamed from: a */
            public IBinder f11605a;

            public C12107a(IBinder iBinder) {
                this.f11605a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11605a;
            }

            @Override // com.huawei.hms.core.aidl.InterfaceC7276c
            public void call(DataBuffer dataBuffer) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLCallback");
                    b.m8517d(parcelObtain, dataBuffer, 0);
                    this.f11605a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLCallback");
        }

        public static InterfaceC7276c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7276c)) ? new C12107a(iBinder) : (InterfaceC7276c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.huawei.hms.core.aidl.IAIDLCallback");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            call((DataBuffer) b.m8516c(parcel, DataBuffer.CREATOR));
            return true;
        }
    }

    /* renamed from: com.huawei.hms.core.aidl.c$b */
    public static class b {
        /* renamed from: c */
        public static Object m8516c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static void m8517d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void call(DataBuffer dataBuffer);
}
