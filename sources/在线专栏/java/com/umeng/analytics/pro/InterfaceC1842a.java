package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.umeng.analytics.pro.a */
/* loaded from: classes.dex */
public interface InterfaceC1842a extends IInterface {
    /* renamed from: a */
    String mo6743a() throws RemoteException;

    /* renamed from: a */
    String mo6744a(String str) throws RemoteException;

    /* renamed from: b */
    String mo6745b(String str) throws RemoteException;

    /* renamed from: com.umeng.analytics.pro.a$a */
    public static abstract class a extends Binder implements InterfaceC1842a {

        /* renamed from: a */
        static final int f8204a = 1;

        /* renamed from: b */
        static final int f8205b = 2;

        /* renamed from: c */
        static final int f8206c = 3;

        /* renamed from: d */
        private static final String f8207d = "com.samsung.android.deviceidservice.IDeviceIdService";

        public a() {
            attachInterface(this, f8207d);
        }

        /* renamed from: a */
        public static InterfaceC1842a m6746a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f8207d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1842a)) ? new C3528a(iBinder) : (InterfaceC1842a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface(f8207d);
                String strMo6743a = mo6743a();
                parcel2.writeNoException();
                parcel2.writeString(strMo6743a);
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(f8207d);
                String strMo6744a = mo6744a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo6744a);
                return true;
            }
            if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(f8207d);
                return true;
            }
            parcel.enforceInterface(f8207d);
            String strMo6745b = mo6745b(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo6745b);
            return true;
        }

        /* renamed from: com.umeng.analytics.pro.a$a$a, reason: collision with other inner class name */
        private static class C3528a implements InterfaceC1842a {

            /* renamed from: a */
            private IBinder f8208a;

            C3528a(IBinder iBinder) {
                this.f8208a = iBinder;
            }

            @Override // com.umeng.analytics.pro.InterfaceC1842a
            /* renamed from: a */
            public String mo6743a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f8207d);
                    this.f8208a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8208a;
            }

            /* renamed from: b */
            public String m6747b() {
                return a.f8207d;
            }

            @Override // com.umeng.analytics.pro.InterfaceC1842a
            /* renamed from: b */
            public String mo6745b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f8207d);
                    parcelObtain.writeString(str);
                    this.f8208a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC1842a
            /* renamed from: a */
            public String mo6744a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f8207d);
                    parcelObtain.writeString(str);
                    this.f8208a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
