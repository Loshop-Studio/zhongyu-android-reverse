package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.RemoteNetwork;

/* loaded from: classes.dex */
public interface IRemoteNetworkGetter extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteNetworkGetter {
        private static final String DESCRIPTOR = "anetwork.channel.aidl.IRemoteNetworkGetter";
        static final int TRANSACTION_get = 1;

        private static class Proxy implements IRemoteNetworkGetter {

            /* renamed from: a */
            private IBinder f5504a;

            Proxy(IBinder iBinder) {
                this.f5504a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5504a;
            }

            @Override // anetwork.channel.aidl.IRemoteNetworkGetter
            public RemoteNetwork get(int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i4);
                    this.f5504a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return RemoteNetwork.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteNetworkGetter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteNetworkGetter)) ? new Proxy(iBinder) : (IRemoteNetworkGetter) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            RemoteNetwork remoteNetwork = get(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(remoteNetwork != null ? remoteNetwork.asBinder() : null);
            return true;
        }
    }

    RemoteNetwork get(int i4) throws RemoteException;
}
