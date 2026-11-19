package p135eb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: eb.a */
/* loaded from: classes6.dex */
public interface InterfaceC9114a extends IInterface {
    /* renamed from: c */
    void mo17604c(UserInfo userInfo);

    String getName();

    /* renamed from: i */
    void mo7150i(ServerInfo serverInfo);

    /* renamed from: eb.a$a */
    public static abstract class a extends Binder implements InterfaceC9114a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo17604c(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                mo7150i(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
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
