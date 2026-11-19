package p013b2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: b2.a */
/* loaded from: classes.dex */
public interface InterfaceC1030a extends IInterface {

    /* renamed from: b2.a$a */
    public static abstract class a extends Binder implements InterfaceC1030a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo61t(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo60o(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString("com.zykj.message.server.MessageCallBack");
                return true;
            }
            parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
            String name = getName();
            parcel2.writeNoException();
            parcel2.writeString(name);
            return true;
        }
    }

    String getName() throws RemoteException;

    /* renamed from: o */
    void mo60o(ServerInfo serverInfo) throws RemoteException;

    /* renamed from: t */
    void mo61t(UserInfo userInfo) throws RemoteException;
}
