package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.umeng.analytics.pro.a */
/* loaded from: classes2.dex */
public interface InterfaceC3326a extends IInterface {

    /* renamed from: com.umeng.analytics.pro.a$a */
    public static abstract class a extends Binder implements InterfaceC3326a {

        /* renamed from: a */
        static final int f1612a = 1;

        /* renamed from: b */
        static final int f1613b = 2;

        /* renamed from: c */
        static final int f1614c = 3;

        /* renamed from: d */
        private static final String f1615d = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* renamed from: com.umeng.analytics.pro.a$a$a, reason: collision with other inner class name */
        public static class C4753a implements InterfaceC3326a {

            /* renamed from: a */
            private IBinder f1616a;

            public C4753a(IBinder iBinder) {
                this.f1616a = iBinder;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3326a
            /* renamed from: a */
            public String mo2820a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1615d);
                    this.f1616a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1616a;
            }

            /* renamed from: b */
            public String m2824b() {
                return a.f1615d;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3326a
            /* renamed from: b */
            public String mo2822b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1615d);
                    parcelObtain.writeString(str);
                    this.f1616a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3326a
            /* renamed from: a */
            public String mo2821a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1615d);
                    parcelObtain.writeString(str);
                    this.f1616a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f1615d);
        }

        /* renamed from: a */
        public static InterfaceC3326a m2823a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f1615d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3326a)) ? new C4753a(iBinder) : (InterfaceC3326a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface(f1615d);
                String strMo2820a = mo2820a();
                parcel2.writeNoException();
                parcel2.writeString(strMo2820a);
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(f1615d);
                String strMo2821a = mo2821a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo2821a);
                return true;
            }
            if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(f1615d);
                return true;
            }
            parcel.enforceInterface(f1615d);
            String strMo2822b = mo2822b(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo2822b);
            return true;
        }
    }

    /* renamed from: a */
    String mo2820a() throws RemoteException;

    /* renamed from: a */
    String mo2821a(String str) throws RemoteException;

    /* renamed from: b */
    String mo2822b(String str) throws RemoteException;
}
