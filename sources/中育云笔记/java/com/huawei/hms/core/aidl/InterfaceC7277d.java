package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.huawei.hms.core.aidl.d */
/* loaded from: classes5.dex */
public interface InterfaceC7277d extends IInterface {

    /* renamed from: com.huawei.hms.core.aidl.d$a */
    public static abstract class a extends Binder implements InterfaceC7277d {

        /* renamed from: com.huawei.hms.core.aidl.d$a$a, reason: collision with other inner class name */
        public static class C12108a implements InterfaceC7277d {

            /* renamed from: a */
            public IBinder f11606a;

            public C12108a(IBinder iBinder) {
                this.f11606a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11606a;
            }

            @Override // com.huawei.hms.core.aidl.InterfaceC7277d
            /* renamed from: j */
            public void mo8518j(DataBuffer dataBuffer, InterfaceC7276c interfaceC7276c) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    b.m8521b(parcelObtain, dataBuffer, 0);
                    parcelObtain.writeStrongInterface(interfaceC7276c);
                    this.f11606a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: l */
        public static InterfaceC7277d m8519l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7277d)) ? new C12108a(iBinder) : (InterfaceC7277d) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: com.huawei.hms.core.aidl.d$b */
    public static class b {
        /* renamed from: b */
        public static void m8521b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: j */
    void mo8518j(DataBuffer dataBuffer, InterfaceC7276c interfaceC7276c);
}
