package p180n7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: n7.a */
/* loaded from: classes.dex */
public interface InterfaceC8668a extends IInterface {
    /* renamed from: a */
    void mo14108a(UserInfo userInfo);

    /* renamed from: e */
    void mo10590e(ServerInfo serverInfo);

    String getName();

    /* renamed from: n7.a$a */
    public static abstract class a extends Binder implements InterfaceC8668a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo14108a(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo10590e(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
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

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
