package p003a2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: a2.a */
/* loaded from: classes2.dex */
public interface InterfaceC0009a extends IInterface {

    /* renamed from: a2.a$a */
    public static abstract class a extends Binder implements InterfaceC0009a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo18b(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo19e(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
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

    /* renamed from: b */
    void mo18b(UserInfo userInfo);

    /* renamed from: e */
    void mo19e(ServerInfo serverInfo);

    String getName();
}
