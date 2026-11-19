package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.work.multiprocess.b */
/* loaded from: classes.dex */
public interface InterfaceC0834b extends IInterface {

    /* renamed from: androidx.work.multiprocess.b$a */
    public static abstract class a extends Binder implements InterfaceC0834b {

        /* renamed from: androidx.work.multiprocess.b$a$a, reason: collision with other inner class name */
        private static class C3521a implements InterfaceC0834b {

            /* renamed from: b */
            public static InterfaceC0834b f4910b;

            /* renamed from: a */
            private IBinder f4911a;

            C3521a(IBinder iBinder) {
                this.f4911a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4911a;
            }

            @Override // androidx.work.multiprocess.InterfaceC0834b
            /* renamed from: n */
            public void mo4294n(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    parcelObtain.writeByteArray(bArr);
                    if (this.f4911a.transact(1, parcelObtain, null, 1) || a.m4297z() == null) {
                        return;
                    }
                    a.m4297z().mo4294n(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC0834b
            /* renamed from: u */
            public void mo4295u(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    parcelObtain.writeString(str);
                    if (this.f4911a.transact(2, parcelObtain, null, 1) || a.m4297z() == null) {
                        return;
                    }
                    a.m4297z().mo4295u(str);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: y */
        public static InterfaceC0834b m4296y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0834b)) ? new C3521a(iBinder) : (InterfaceC0834b) iInterfaceQueryLocalInterface;
        }

        /* renamed from: z */
        public static InterfaceC0834b m4297z() {
            return C3521a.f4910b;
        }
    }

    /* renamed from: n */
    void mo4294n(byte[] bArr) throws RemoteException;

    /* renamed from: u */
    void mo4295u(String str) throws RemoteException;
}
