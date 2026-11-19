package p154t1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: t1.a */
/* loaded from: classes.dex */
public interface InterfaceC3401a extends IInterface {

    /* renamed from: t1.a$a */
    public static abstract class a extends Binder implements InterfaceC3401a {

        /* renamed from: t1.a$a$a, reason: collision with other inner class name */
        private static class C3550a implements InterfaceC3401a {

            /* renamed from: b */
            public static InterfaceC3401a f11950b;

            /* renamed from: a */
            private IBinder f11951a;

            C3550a(IBinder iBinder) {
                this.f11951a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11951a;
            }

            @Override // p154t1.InterfaceC3401a
            /* renamed from: d */
            public void mo10379d() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    if (this.f11951a.transact(2, parcelObtain, parcelObtain2, 0) || a.m10383z() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m10383z().mo10379d();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p154t1.InterfaceC3401a
            /* renamed from: g */
            public void mo10380g(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (this.f11951a.transact(3, parcelObtain, parcelObtain2, 0) || a.m10383z() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m10383z().mo10380g(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p154t1.InterfaceC3401a
            /* renamed from: k */
            public boolean mo10381k(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (!this.f11951a.transact(1, parcelObtain, parcelObtain2, 0) && a.m10383z() != null) {
                        return a.m10383z().mo10381k(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: y */
        public static InterfaceC3401a m10382y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.techvision.aldl.ICheckAppUpdate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3401a)) ? new C3550a(iBinder) : (InterfaceC3401a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: z */
        public static InterfaceC3401a m10383z() {
            return C3550a.f11950b;
        }
    }

    /* renamed from: d */
    void mo10379d() throws RemoteException;

    /* renamed from: g */
    void mo10380g(String str) throws RemoteException;

    /* renamed from: k */
    boolean mo10381k(String str) throws RemoteException;
}
