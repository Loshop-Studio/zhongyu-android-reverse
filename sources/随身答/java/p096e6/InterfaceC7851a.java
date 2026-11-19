package p096e6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: e6.a */
/* loaded from: classes4.dex */
public interface InterfaceC7851a extends IInterface {
    /* renamed from: b */
    void mo12111b(UserInfo userInfo);

    /* renamed from: d */
    void mo9856d(ServerInfo serverInfo);

    String getName();

    /* renamed from: e6.a$a */
    public static abstract class a extends Binder implements InterfaceC7851a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            if (i9 == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo12111b(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i9 == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo9856d(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i9 != 3) {
                if (i9 != 1598968902) {
                    return super.onTransact(i9, parcel, parcel2, i10);
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
