package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.k */
/* loaded from: classes.dex */
public interface InterfaceC0626k extends IInterface {

    /* renamed from: androidx.room.k$a */
    public static abstract class a extends Binder implements InterfaceC0626k {

        /* renamed from: androidx.room.k$a$a, reason: collision with other inner class name */
        private static class C3517a implements InterfaceC0626k {

            /* renamed from: b */
            public static InterfaceC0626k f4034b;

            /* renamed from: a */
            private IBinder f4035a;

            C3517a(IBinder iBinder) {
                this.f4035a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4035a;
            }

            @Override // androidx.room.InterfaceC0626k
            /* renamed from: i */
            public void mo3597i(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    if (this.f4035a.transact(1, parcelObtain, null, 1) || a.m3599z() == null) {
                        return;
                    }
                    a.m3599z().mo3597i(strArr);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: y */
        public static InterfaceC0626k m3598y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0626k)) ? new C3517a(iBinder) : (InterfaceC0626k) iInterfaceQueryLocalInterface;
        }

        /* renamed from: z */
        public static InterfaceC0626k m3599z() {
            return C3517a.f4034b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo3597i(parcel.createStringArray());
                return true;
            }
            if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    /* renamed from: i */
    void mo3597i(String[] strArr) throws RemoteException;
}
