package p028c4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import p043d4.InterfaceC5419a;

/* renamed from: c4.a */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3223a extends Binder implements InterfaceC5419a {

    /* renamed from: c */
    public final String f1787c;

    public AbstractBinderC3223a() {
        attachInterface(this, "com.zykj.message.server.MessageCallBack");
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('-');
        sb.append(System.currentTimeMillis());
        this.f1787c = sb.toString();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i8) {
        if (i == 1) {
            parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
            mo2169a(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
            mo2170b(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i8);
            }
            parcel2.writeString("com.zykj.message.server.MessageCallBack");
            return true;
        }
        parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
        parcel2.writeNoException();
        parcel2.writeString(this.f1787c);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
