package p035c4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: c4.a */
/* loaded from: classes4.dex */
public interface InterfaceC5232a extends IInterface {
    /* renamed from: c */
    void mo2074c(UserInfo userInfo);

    String getName();

    /* renamed from: h */
    void mo2136h(ServerInfo serverInfo);

    /* renamed from: c4.a$a */
    public static abstract class a extends Binder implements InterfaceC5232a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo2074c(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo2136h(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
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
