package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.InterfaceC0626k;

/* renamed from: androidx.room.l */
/* loaded from: classes.dex */
public interface InterfaceC0628l extends IInterface {

    /* renamed from: androidx.room.l$a */
    public static abstract class a extends Binder implements InterfaceC0628l {

        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        private static class C3518a implements InterfaceC0628l {

            /* renamed from: b */
            public static InterfaceC0628l f4044b;

            /* renamed from: a */
            private IBinder f4045a;

            C3518a(IBinder iBinder) {
                this.f4045a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4045a;
            }

            @Override // androidx.room.InterfaceC0628l
            /* renamed from: l */
            public int mo3472l(InterfaceC0626k interfaceC0626k, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(interfaceC0626k != null ? interfaceC0626k.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (!this.f4045a.transact(1, parcelObtain, parcelObtain2, 0) && a.m3605z() != null) {
                        return a.m3605z().mo3472l(interfaceC0626k, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0628l
            /* renamed from: s */
            public void mo3473s(int i4, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeStringArray(strArr);
                    if (this.f4045a.transact(3, parcelObtain, null, 1) || a.m3605z() == null) {
                        return;
                    }
                    a.m3605z().mo3473s(i4, strArr);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: y */
        public static InterfaceC0628l m3604y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0628l)) ? new C3518a(iBinder) : (InterfaceC0628l) iInterfaceQueryLocalInterface;
        }

        /* renamed from: z */
        public static InterfaceC0628l m3605z() {
            return C3518a.f4044b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int iMo3472l = mo3472l(InterfaceC0626k.a.m3598y(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo3472l);
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo3474w(InterfaceC0626k.a.m3598y(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo3473s(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: l */
    int mo3472l(InterfaceC0626k interfaceC0626k, String str) throws RemoteException;

    /* renamed from: s */
    void mo3473s(int i4, String[] strArr) throws RemoteException;

    /* renamed from: w */
    void mo3474w(InterfaceC0626k interfaceC0626k, int i4) throws RemoteException;
}
