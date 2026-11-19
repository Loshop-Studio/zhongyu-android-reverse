package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.InterfaceC0834b;

/* renamed from: androidx.work.multiprocess.a */
/* loaded from: classes.dex */
public interface InterfaceC0833a extends IInterface {

    /* renamed from: androidx.work.multiprocess.a$a */
    public static abstract class a extends Binder implements InterfaceC0833a {
        public a() {
            attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (i4) {
                case 1:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4289h(parcel.createByteArray(), InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4293x(parcel.createByteArray(), InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4288f(parcel.readString(), InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4291q(parcel.readString(), InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                case 5:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4287b(parcel.readString(), InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                case 6:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4290j(InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    mo4292v(parcel.createByteArray(), InterfaceC0834b.a.m4296y(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i4, parcel, parcel2, i5);
            }
        }
    }

    /* renamed from: b */
    void mo4287b(String str, InterfaceC0834b interfaceC0834b) throws RemoteException;

    /* renamed from: f */
    void mo4288f(String str, InterfaceC0834b interfaceC0834b) throws RemoteException;

    /* renamed from: h */
    void mo4289h(byte[] bArr, InterfaceC0834b interfaceC0834b) throws RemoteException;

    /* renamed from: j */
    void mo4290j(InterfaceC0834b interfaceC0834b) throws RemoteException;

    /* renamed from: q */
    void mo4291q(String str, InterfaceC0834b interfaceC0834b) throws RemoteException;

    /* renamed from: v */
    void mo4292v(byte[] bArr, InterfaceC0834b interfaceC0834b) throws RemoteException;

    /* renamed from: x */
    void mo4293x(byte[] bArr, InterfaceC0834b interfaceC0834b) throws RemoteException;
}
